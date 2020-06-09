package io.m9rcy.oauth2;

import io.m9rcy.oauth2.model.OAuthResponse;
import io.m9rcy.oauth2.model.TokenRequest;
import io.smallrye.mutiny.Uni;
import io.vertx.core.http.RequestOptions;
import org.eclipse.microprofile.rest.client.RestClientBuilder;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.LocalDateTime;

@Path("/token")
public class Oauth2ClientResource {

    TokenResource tokenClient;


    private static class TimedCacheValue {
        private OAuthResponse value;
        private LocalDateTime expiresAt;

        private TimedCacheValue(OAuthResponse value, LocalDateTime expiresAt) {
            this.value = value;
            //Setting a buffer of 5 minutes for refresh
            this.expiresAt = expiresAt.minusMinutes(5);
        }

        private OAuthResponse getValue() {
            if (LocalDateTime
                    .now()
                    .isBefore(this.expiresAt)) {
                return this.value;
            }
            //Since the value is expired, return null
            return null;
        }
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Uni<Response> getToken() throws URISyntaxException {

        tokenClient = RestClientBuilder
                .newBuilder()
                .baseUri(new URI("https://m9rcy.auth0.com/oauth/token"))
                .build(TokenResource.class);

        TokenRequest request = new TokenRequest();
        request.setClientId("Pff2u1XHm3HVr86sW01K4pKZ39ZM5Ez3");
        request.setClientSecret("G4VGFszQcvoM_Eaoq9pHAxpFA1kwHKXtc3vCgF7q0ycXmCfRPt9vlpUJyGs3DNLS");
        request.setGrantType("client_credentials");
        request.setAudience("https://quickstarts/api");

        return tokenClient.getAccessToken(request).onItem().apply(item -> Response.ok().build());

    }
}
