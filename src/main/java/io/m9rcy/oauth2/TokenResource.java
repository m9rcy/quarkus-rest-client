package io.m9rcy.oauth2;


import io.m9rcy.oauth2.model.TokenRequest;
import io.smallrye.mutiny.Uni;
import org.jboss.resteasy.annotations.Form;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public interface TokenResource {

    @POST
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public Uni<Response> getAccessToken(@Form TokenRequest request);
}
