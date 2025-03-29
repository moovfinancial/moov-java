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
 * PayoutRecipient
 * 
 * <p>Specify the intended recipient of the payout.
 * 
 * <p>This information will be used to authenticate the end user when they follow the payment link.
 */
public class PayoutRecipient {

    @JsonProperty("email")
    private String email;

    @JsonCreator
    public PayoutRecipient(
            @JsonProperty("email") String email) {
        Utils.checkNotNull(email, "email");
        this.email = email;
    }

    @JsonIgnore
    public String email() {
        return email;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public PayoutRecipient withEmail(String email) {
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
        PayoutRecipient other = (PayoutRecipient) o;
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
        return Utils.toString(PayoutRecipient.class,
                "email", email);
    }
    
    public final static class Builder {
 
        private String email;
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder email(String email) {
            Utils.checkNotNull(email, "email");
            this.email = email;
            return this;
        }
        
        public PayoutRecipient build() {
            return new PayoutRecipient(
                email);
        }
    }
}
