package io.m9rcy.oauth2;

public final class OAuthConstants {
    // Common OAuth2 constants
    public static final String CLIENT_ID = "client_id";
    public static final String CLIENT_SECRET = "client_secret";
    public static final String CLIENT_AUDIENCE = "audience";
    public static final String RESOURCE_INDICATOR = "resource";

    public static final String NONCE = "nonce";

    public static final String REDIRECT_URI = "redirect_uri";
    public static final String SCOPE = "scope";
    public static final String STATE = "state";
    public static final String ACCESS_TOKEN = "access_token";
    public static final String ACCESS_TOKEN_TYPE = "token_type";
    public static final String ACCESS_TOKEN_EXPIRES_IN = "expires_in";
    public static final String GRANT_TYPE = "grant_type";
    public static final String RESPONSE_TYPE = "response_type";
    public static final String TOKEN_RESPONSE_TYPE = "token";
    public static final String REFRESH_TOKEN = "refresh_token";
    public static final String RESPONSE_MODE = "response_mode";
    public static final String FORM_RESPONSE_MODE = "form_post";

    // Well-known grant types
    public static final String AUTHORIZATION_CODE_GRANT = "authorization_code";
    public static final String CLIENT_CREDENTIALS_GRANT = "client_credentials";
    public static final String IMPLICIT_GRANT = "implicit";
    public static final String RESOURCE_OWNER_GRANT = "password";
    public static final String REFRESH_TOKEN_GRANT = "refresh_token";

    // Well-known token types
    public static final String BEARER_TOKEN_TYPE = "Bearer";

    // Token Authorization schemes
    public static final String BEARER_AUTHORIZATION_SCHEME = "Bearer";
    public static final String ALL_AUTH_SCHEMES = "*";


    // Default Client Authentication Scheme
    public static final String BASIC_SCHEME = "Basic";

    // Authorization Code grant constants
    public static final String AUTHORIZATION_CODE_VALUE = "code";
    public static final String CODE_RESPONSE_TYPE = "code";
    public static final String SESSION_AUTHENTICITY_TOKEN = "session_authenticity_token";
    public static final String SESSION_AUTHENTICITY_TOKEN_PARAM_NAME = "session_authenticity_token_param_name";
    public static final String AUTHORIZATION_DECISION_KEY = "oauthDecision";
    public static final String AUTHORIZATION_DECISION_ALLOW = "allow";
    public static final String AUTHORIZATION_DECISION_DENY = "deny";

    // Resource Owner grant constants
    public static final String RESOURCE_OWNER_NAME = "username";
    public static final String RESOURCE_OWNER_PASSWORD = "password";

    // Error constants
    public static final String ERROR_KEY = "error";
    public static final String ERROR_DESCRIPTION_KEY = "error_description";
    public static final String ERROR_URI_KEY = "error_uri";

    public static final String SERVER_ERROR = "server_error";
    public static final String INVALID_REQUEST = "invalid_request";
    public static final String INVALID_GRANT = "invalid_grant";
    public static final String UNSUPPORTED_GRANT_TYPE = "unsupported_grant_type";
    public static final String UNSUPPORTED_RESPONSE_TYPE = "unsupported_response_type";
    public static final String UNAUTHORIZED_CLIENT = "unauthorized_client";
    public static final String INVALID_CLIENT = "invalid_client";
    public static final String INVALID_SCOPE = "invalid_scope";
    public static final String ACCESS_DENIED = "access_denied";

    // Token Revocation, Introspection
    public static final String TOKEN_ID = "token";
    public static final String TOKEN_TYPE_HINT = "token_type_hint";
    public static final String UNSUPPORTED_TOKEN_TYPE = "unsupported_token_type";

    // Token Service Authentication Methods
    public static final String TOKEN_ENDPOINT_AUTH_NONE = "none";
    public static final String TOKEN_ENDPOINT_AUTH_BASIC = "client_secret_basic";
    public static final String TOKEN_ENDPOINT_AUTH_POST = "client_secret_post";
    public static final String TOKEN_ENDPOINT_AUTH_TLS = "tls_client_auth";
    // TLS Authentication Binding Properties
    public static final String TLS_CLIENT_AUTH_SUBJECT_DN = "tls_client_auth_subject_dn";
    public static final String TLS_CLIENT_AUTH_ISSUER_DN = "tls_client_auth_root_dn";
    
    // Authorization scheme constants, used internally by AccessTokenValidation client and service
    public static final String AUTHORIZATION_SCHEME_TYPE = "authScheme";
    public static final String AUTHORIZATION_SCHEME_DATA = "authSchemeData";

    // Default refresh token scope value - checked by CXF utility code
    public static final String REFRESH_TOKEN_SCOPE = "refreshToken";

    // Client Secret (JWS) Signature Algorithm
    public static final String CLIENT_SECRET_SIGNATURE_ALGORITHM = "client.secret.signature.algorithm";
    // Client Secret (JWE) Content Encryption Algorithm
    public static final String CLIENT_SECRET_CONTENT_ENCRYPTION_ALGORITHM =
        "client.secret.content.encryption.algorithm";

}