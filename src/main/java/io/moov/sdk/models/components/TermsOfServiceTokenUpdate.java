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
import java.util.Objects;
import java.util.Optional;
/**
 * TermsOfServiceTokenUpdate
 * 
 * <p>An encrypted value used to record acceptance of Moov's Terms of Service.
 */

public class TermsOfServiceTokenUpdate {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("token")
    private Optional<String> token;

    @JsonCreator
    public TermsOfServiceTokenUpdate(
            @JsonProperty("token") Optional<String> token) {
        Utils.checkNotNull(token, "token");
        this.token = token;
    }
    
    public TermsOfServiceTokenUpdate() {
        this(Optional.empty());
    }

    @JsonIgnore
    public Optional<String> token() {
        return token;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public TermsOfServiceTokenUpdate withToken(String token) {
        Utils.checkNotNull(token, "token");
        this.token = Optional.ofNullable(token);
        return this;
    }

    public TermsOfServiceTokenUpdate withToken(Optional<String> token) {
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
        TermsOfServiceTokenUpdate other = (TermsOfServiceTokenUpdate) o;
        return 
            Objects.deepEquals(this.token, other.token);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            token);
    }
    
    @Override
    public String toString() {
        return Utils.toString(TermsOfServiceTokenUpdate.class,
                "token", token);
    }
    
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
        
        public TermsOfServiceTokenUpdate build() {
            return new TermsOfServiceTokenUpdate(
                token);
        }
    }
}

