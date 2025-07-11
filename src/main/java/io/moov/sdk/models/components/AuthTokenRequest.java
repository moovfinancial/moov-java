/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package io.moov.sdk.models.components;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.moov.sdk.utils.SpeakeasyMetadata;
import io.moov.sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Optional;


public class AuthTokenRequest {
    /**
     * The type of grant being requested.
     * 
     * <p>  - `client_credentials`: A grant type used by clients to obtain an access token
     *   - `refresh_token`: A grant type used by clients to obtain a new access token using a refresh token
     */
    @JsonProperty("grant_type")
    @SpeakeasyMetadata("form:name=grant_type")
    private GrantType grantType;

    /**
     * Client ID can be provided here in the body, or as the Username in HTTP Basic Auth.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("client_id")
    @SpeakeasyMetadata("form:name=client_id")
    private Optional<String> clientId;

    /**
     * Client secret can be provided here in the body, or as the Password in HTTP Basic Auth.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("client_secret")
    @SpeakeasyMetadata("form:name=client_secret")
    private Optional<String> clientSecret;

    /**
     * A space delimited list of scopes. Required when `grant_type` is `client_credentials`.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("scope")
    @SpeakeasyMetadata("form:name=scope")
    private Optional<String> scope;

    /**
     * The refresh_token returned alongside the access token being refreshed. Required when `grant_type` is `refresh_token`.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("refresh_token")
    @SpeakeasyMetadata("form:name=refresh_token")
    private Optional<String> refreshToken;

    @JsonCreator
    public AuthTokenRequest(
            @JsonProperty("grant_type") GrantType grantType,
            @JsonProperty("client_id") Optional<String> clientId,
            @JsonProperty("client_secret") Optional<String> clientSecret,
            @JsonProperty("scope") Optional<String> scope,
            @JsonProperty("refresh_token") Optional<String> refreshToken) {
        Utils.checkNotNull(grantType, "grantType");
        Utils.checkNotNull(clientId, "clientId");
        Utils.checkNotNull(clientSecret, "clientSecret");
        Utils.checkNotNull(scope, "scope");
        Utils.checkNotNull(refreshToken, "refreshToken");
        this.grantType = grantType;
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.scope = scope;
        this.refreshToken = refreshToken;
    }
    
    public AuthTokenRequest(
            GrantType grantType) {
        this(grantType, Optional.empty(), Optional.empty(),
            Optional.empty(), Optional.empty());
    }

    /**
     * The type of grant being requested.
     * 
     * <p>  - `client_credentials`: A grant type used by clients to obtain an access token
     *   - `refresh_token`: A grant type used by clients to obtain a new access token using a refresh token
     */
    @JsonIgnore
    public GrantType grantType() {
        return grantType;
    }

    /**
     * Client ID can be provided here in the body, or as the Username in HTTP Basic Auth.
     */
    @JsonIgnore
    public Optional<String> clientId() {
        return clientId;
    }

    /**
     * Client secret can be provided here in the body, or as the Password in HTTP Basic Auth.
     */
    @JsonIgnore
    public Optional<String> clientSecret() {
        return clientSecret;
    }

    /**
     * A space delimited list of scopes. Required when `grant_type` is `client_credentials`.
     */
    @JsonIgnore
    public Optional<String> scope() {
        return scope;
    }

    /**
     * The refresh_token returned alongside the access token being refreshed. Required when `grant_type` is `refresh_token`.
     */
    @JsonIgnore
    public Optional<String> refreshToken() {
        return refreshToken;
    }

    public static Builder builder() {
        return new Builder();
    }


    /**
     * The type of grant being requested.
     * 
     * <p>  - `client_credentials`: A grant type used by clients to obtain an access token
     *   - `refresh_token`: A grant type used by clients to obtain a new access token using a refresh token
     */
    public AuthTokenRequest withGrantType(GrantType grantType) {
        Utils.checkNotNull(grantType, "grantType");
        this.grantType = grantType;
        return this;
    }

    /**
     * Client ID can be provided here in the body, or as the Username in HTTP Basic Auth.
     */
    public AuthTokenRequest withClientId(String clientId) {
        Utils.checkNotNull(clientId, "clientId");
        this.clientId = Optional.ofNullable(clientId);
        return this;
    }


    /**
     * Client ID can be provided here in the body, or as the Username in HTTP Basic Auth.
     */
    public AuthTokenRequest withClientId(Optional<String> clientId) {
        Utils.checkNotNull(clientId, "clientId");
        this.clientId = clientId;
        return this;
    }

    /**
     * Client secret can be provided here in the body, or as the Password in HTTP Basic Auth.
     */
    public AuthTokenRequest withClientSecret(String clientSecret) {
        Utils.checkNotNull(clientSecret, "clientSecret");
        this.clientSecret = Optional.ofNullable(clientSecret);
        return this;
    }


    /**
     * Client secret can be provided here in the body, or as the Password in HTTP Basic Auth.
     */
    public AuthTokenRequest withClientSecret(Optional<String> clientSecret) {
        Utils.checkNotNull(clientSecret, "clientSecret");
        this.clientSecret = clientSecret;
        return this;
    }

    /**
     * A space delimited list of scopes. Required when `grant_type` is `client_credentials`.
     */
    public AuthTokenRequest withScope(String scope) {
        Utils.checkNotNull(scope, "scope");
        this.scope = Optional.ofNullable(scope);
        return this;
    }


    /**
     * A space delimited list of scopes. Required when `grant_type` is `client_credentials`.
     */
    public AuthTokenRequest withScope(Optional<String> scope) {
        Utils.checkNotNull(scope, "scope");
        this.scope = scope;
        return this;
    }

    /**
     * The refresh_token returned alongside the access token being refreshed. Required when `grant_type` is `refresh_token`.
     */
    public AuthTokenRequest withRefreshToken(String refreshToken) {
        Utils.checkNotNull(refreshToken, "refreshToken");
        this.refreshToken = Optional.ofNullable(refreshToken);
        return this;
    }


    /**
     * The refresh_token returned alongside the access token being refreshed. Required when `grant_type` is `refresh_token`.
     */
    public AuthTokenRequest withRefreshToken(Optional<String> refreshToken) {
        Utils.checkNotNull(refreshToken, "refreshToken");
        this.refreshToken = refreshToken;
        return this;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AuthTokenRequest other = (AuthTokenRequest) o;
        return 
            Utils.enhancedDeepEquals(this.grantType, other.grantType) &&
            Utils.enhancedDeepEquals(this.clientId, other.clientId) &&
            Utils.enhancedDeepEquals(this.clientSecret, other.clientSecret) &&
            Utils.enhancedDeepEquals(this.scope, other.scope) &&
            Utils.enhancedDeepEquals(this.refreshToken, other.refreshToken);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            grantType, clientId, clientSecret,
            scope, refreshToken);
    }
    
    @Override
    public String toString() {
        return Utils.toString(AuthTokenRequest.class,
                "grantType", grantType,
                "clientId", clientId,
                "clientSecret", clientSecret,
                "scope", scope,
                "refreshToken", refreshToken);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private GrantType grantType;

        private Optional<String> clientId = Optional.empty();

        private Optional<String> clientSecret = Optional.empty();

        private Optional<String> scope = Optional.empty();

        private Optional<String> refreshToken = Optional.empty();

        private Builder() {
          // force use of static builder() method
        }


        /**
         * The type of grant being requested.
         * 
         * <p>  - `client_credentials`: A grant type used by clients to obtain an access token
         *   - `refresh_token`: A grant type used by clients to obtain a new access token using a refresh token
         */
        public Builder grantType(GrantType grantType) {
            Utils.checkNotNull(grantType, "grantType");
            this.grantType = grantType;
            return this;
        }


        /**
         * Client ID can be provided here in the body, or as the Username in HTTP Basic Auth.
         */
        public Builder clientId(String clientId) {
            Utils.checkNotNull(clientId, "clientId");
            this.clientId = Optional.ofNullable(clientId);
            return this;
        }

        /**
         * Client ID can be provided here in the body, or as the Username in HTTP Basic Auth.
         */
        public Builder clientId(Optional<String> clientId) {
            Utils.checkNotNull(clientId, "clientId");
            this.clientId = clientId;
            return this;
        }


        /**
         * Client secret can be provided here in the body, or as the Password in HTTP Basic Auth.
         */
        public Builder clientSecret(String clientSecret) {
            Utils.checkNotNull(clientSecret, "clientSecret");
            this.clientSecret = Optional.ofNullable(clientSecret);
            return this;
        }

        /**
         * Client secret can be provided here in the body, or as the Password in HTTP Basic Auth.
         */
        public Builder clientSecret(Optional<String> clientSecret) {
            Utils.checkNotNull(clientSecret, "clientSecret");
            this.clientSecret = clientSecret;
            return this;
        }


        /**
         * A space delimited list of scopes. Required when `grant_type` is `client_credentials`.
         */
        public Builder scope(String scope) {
            Utils.checkNotNull(scope, "scope");
            this.scope = Optional.ofNullable(scope);
            return this;
        }

        /**
         * A space delimited list of scopes. Required when `grant_type` is `client_credentials`.
         */
        public Builder scope(Optional<String> scope) {
            Utils.checkNotNull(scope, "scope");
            this.scope = scope;
            return this;
        }


        /**
         * The refresh_token returned alongside the access token being refreshed. Required when `grant_type` is `refresh_token`.
         */
        public Builder refreshToken(String refreshToken) {
            Utils.checkNotNull(refreshToken, "refreshToken");
            this.refreshToken = Optional.ofNullable(refreshToken);
            return this;
        }

        /**
         * The refresh_token returned alongside the access token being refreshed. Required when `grant_type` is `refresh_token`.
         */
        public Builder refreshToken(Optional<String> refreshToken) {
            Utils.checkNotNull(refreshToken, "refreshToken");
            this.refreshToken = refreshToken;
            return this;
        }

        public AuthTokenRequest build() {

            return new AuthTokenRequest(
                grantType, clientId, clientSecret,
                scope, refreshToken);
        }

    }
}
