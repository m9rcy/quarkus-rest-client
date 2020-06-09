package io.m9rcy.oauth2.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.ws.rs.FormParam;

@Getter
@Setter
@NoArgsConstructor
public class TokenRequest {

    @FormParam("code")
    private String code;
    @FormParam("client_id")
    private String clientId;
    @FormParam("grant_type")
    private String grantType;
    @FormParam("client_secret")
    private String clientSecret;
    @FormParam("audience")
    private String audience;
}
