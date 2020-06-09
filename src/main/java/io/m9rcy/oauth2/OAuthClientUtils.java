package io.m9rcy.oauth2;

import lombok.experimental.UtilityClass;

import javax.ws.rs.core.UriBuilder;
import java.net.URI;

@UtilityClass
public class OAuthClientUtils {

    public static URI getAuthorizationURI(String authorizationServiceURI,
                                          String clientId,
                                          String redirectUri,
                                          String state,
                                          String scope) {
        UriBuilder ub = getAuthorizationURIBuilder(authorizationServiceURI,
                clientId,
                redirectUri,
                state,
                scope);
        return ub.build();
    }

    public static UriBuilder getAuthorizationURIBuilder(String authorizationServiceURI,
                                                        String clientId,
                                                        String redirectUri,
                                                        String state,
                                                        String scope) {
        UriBuilder ub = getAuthorizationURIBuilder(authorizationServiceURI,
                clientId,
                scope);
        if (redirectUri != null) {
            ub.queryParam(OAuthConstants.REDIRECT_URI, redirectUri);
        }
        if (state != null) {
            ub.queryParam(OAuthConstants.STATE, state);
        }
        return ub;
    }

    public static UriBuilder getAuthorizationURIBuilder(String authorizationServiceURI,
                                                        String clientId,
                                                        String scope) {
        UriBuilder ub = UriBuilder.fromUri(authorizationServiceURI);
        if (clientId != null) {
            ub.queryParam(OAuthConstants.CLIENT_ID, clientId);
        }
        if (scope != null) {
            ub.queryParam(OAuthConstants.SCOPE, scope);
        }
        ub.queryParam(OAuthConstants.RESPONSE_TYPE, OAuthConstants.CODE_RESPONSE_TYPE);
        return ub;
    }
}
