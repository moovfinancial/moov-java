/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package io.moov.sdk.models.components;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.moov.sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Optional;


public class End2EndEncryptionError {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("token")
    private Optional<String> token;

    @JsonCreator
    public End2EndEncryptionError(
            @JsonProperty("token") Optional<String> token) {
        Utils.checkNotNull(token, "token");
        this.token = token;
    }
    
    public End2EndEncryptionError() {
        this(Optional.empty());
    }

    @JsonIgnore
    public Optional<String> token() {
        return token;
    }

    public static Builder builder() {
        return new Builder();
    }


    public End2EndEncryptionError withToken(String token) {
        Utils.checkNotNull(token, "token");
        this.token = Optional.ofNullable(token);
        return this;
    }


    public End2EndEncryptionError withToken(Optional<String> token) {
        Utils.checkNotNull(token, "token");
        this.token = token;
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
        End2EndEncryptionError other = (End2EndEncryptionError) o;
        return 
            Utils.enhancedDeepEquals(this.token, other.token);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            token);
    }
    
    @Override
    public String toString() {
        return Utils.toString(End2EndEncryptionError.class,
                "token", token);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private Optional<String> token = Optional.empty();

        private Builder() {
          // force use of static builder() method
        }


        public Builder token(String token) {
            Utils.checkNotNull(token, "token");
            this.token = Optional.ofNullable(token);
            return this;
        }

        public Builder token(Optional<String> token) {
            Utils.checkNotNull(token, "token");
            this.token = token;
            return this;
        }

        public End2EndEncryptionError build() {

            return new End2EndEncryptionError(
                token);
        }

    }
}
