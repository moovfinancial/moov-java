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


public class PayoutRecipientError {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("email")
    private Optional<String> email;

    @JsonCreator
    public PayoutRecipientError(
            @JsonProperty("email") Optional<String> email) {
        Utils.checkNotNull(email, "email");
        this.email = email;
    }
    
    public PayoutRecipientError() {
        this(Optional.empty());
    }

    @JsonIgnore
    public Optional<String> email() {
        return email;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public PayoutRecipientError withEmail(String email) {
        Utils.checkNotNull(email, "email");
        this.email = Optional.ofNullable(email);
        return this;
    }

    public PayoutRecipientError withEmail(Optional<String> email) {
        Utils.checkNotNull(email, "email");
        this.email = email;
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
        PayoutRecipientError other = (PayoutRecipientError) o;
        return 
            Objects.deepEquals(this.email, other.email);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            email);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PayoutRecipientError.class,
                "email", email);
    }
    
    public final static class Builder {
 
        private Optional<String> email = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder email(String email) {
            Utils.checkNotNull(email, "email");
            this.email = Optional.ofNullable(email);
            return this;
        }

        public Builder email(Optional<String> email) {
            Utils.checkNotNull(email, "email");
            this.email = email;
            return this;
        }
        
        public PayoutRecipientError build() {
            return new PayoutRecipientError(
                email);
        }
    }
}

