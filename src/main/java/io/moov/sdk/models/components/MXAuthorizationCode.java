/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package io.moov.sdk.models.components;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.moov.sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * MXAuthorizationCode
 * 
 * <p>The authorization code of a MX account which allows a processor to retrieve a linked payment account. 
 * 
 * <p>`sandbox` - When linking a bank account to a `sandbox` account using a MX authorization code it will utilize MX's sandbox environment. 
 * The MX authorization code provided must be generated from MX's sandbox environment.
 */
public class MXAuthorizationCode {

    @JsonProperty("authorizationCode")
    private String authorizationCode;

    @JsonCreator
    public MXAuthorizationCode(
            @JsonProperty("authorizationCode") String authorizationCode) {
        Utils.checkNotNull(authorizationCode, "authorizationCode");
        this.authorizationCode = authorizationCode;
    }

    @JsonIgnore
    public String authorizationCode() {
        return authorizationCode;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public MXAuthorizationCode withAuthorizationCode(String authorizationCode) {
        Utils.checkNotNull(authorizationCode, "authorizationCode");
        this.authorizationCode = authorizationCode;
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
        MXAuthorizationCode other = (MXAuthorizationCode) o;
        return 
            Objects.deepEquals(this.authorizationCode, other.authorizationCode);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            authorizationCode);
    }
    
    @Override
    public String toString() {
        return Utils.toString(MXAuthorizationCode.class,
                "authorizationCode", authorizationCode);
    }
    
    public final static class Builder {
 
        private String authorizationCode;
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder authorizationCode(String authorizationCode) {
            Utils.checkNotNull(authorizationCode, "authorizationCode");
            this.authorizationCode = authorizationCode;
            return this;
        }
        
        public MXAuthorizationCode build() {
            return new MXAuthorizationCode(
                authorizationCode);
        }
    }
}
