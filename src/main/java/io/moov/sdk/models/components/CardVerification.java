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
 * CardVerification - The results of submitting cardholder data to a card network for verification.
 */

public class CardVerification {

    @JsonProperty("cvv")
    private CardVerificationResult cvv;

    @JsonProperty("addressLine1")
    private CardVerificationResult addressLine1;

    @JsonProperty("postalCode")
    private CardVerificationResult postalCode;

    /**
     * The results of submitting cardholder name to a card network for verification.
     */
    @JsonProperty("accountName")
    private AccountNameVerification accountName;

    @JsonCreator
    public CardVerification(
            @JsonProperty("cvv") CardVerificationResult cvv,
            @JsonProperty("addressLine1") CardVerificationResult addressLine1,
            @JsonProperty("postalCode") CardVerificationResult postalCode,
            @JsonProperty("accountName") AccountNameVerification accountName) {
        Utils.checkNotNull(cvv, "cvv");
        Utils.checkNotNull(addressLine1, "addressLine1");
        Utils.checkNotNull(postalCode, "postalCode");
        Utils.checkNotNull(accountName, "accountName");
        this.cvv = cvv;
        this.addressLine1 = addressLine1;
        this.postalCode = postalCode;
        this.accountName = accountName;
    }

    @JsonIgnore
    public CardVerificationResult cvv() {
        return cvv;
    }

    @JsonIgnore
    public CardVerificationResult addressLine1() {
        return addressLine1;
    }

    @JsonIgnore
    public CardVerificationResult postalCode() {
        return postalCode;
    }

    /**
     * The results of submitting cardholder name to a card network for verification.
     */
    @JsonIgnore
    public AccountNameVerification accountName() {
        return accountName;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public CardVerification withCvv(CardVerificationResult cvv) {
        Utils.checkNotNull(cvv, "cvv");
        this.cvv = cvv;
        return this;
    }

    public CardVerification withAddressLine1(CardVerificationResult addressLine1) {
        Utils.checkNotNull(addressLine1, "addressLine1");
        this.addressLine1 = addressLine1;
        return this;
    }

    public CardVerification withPostalCode(CardVerificationResult postalCode) {
        Utils.checkNotNull(postalCode, "postalCode");
        this.postalCode = postalCode;
        return this;
    }

    /**
     * The results of submitting cardholder name to a card network for verification.
     */
    public CardVerification withAccountName(AccountNameVerification accountName) {
        Utils.checkNotNull(accountName, "accountName");
        this.accountName = accountName;
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
        CardVerification other = (CardVerification) o;
        return 
            Objects.deepEquals(this.cvv, other.cvv) &&
            Objects.deepEquals(this.addressLine1, other.addressLine1) &&
            Objects.deepEquals(this.postalCode, other.postalCode) &&
            Objects.deepEquals(this.accountName, other.accountName);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            cvv,
            addressLine1,
            postalCode,
            accountName);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CardVerification.class,
                "cvv", cvv,
                "addressLine1", addressLine1,
                "postalCode", postalCode,
                "accountName", accountName);
    }
    
    public final static class Builder {
 
        private CardVerificationResult cvv;
 
        private CardVerificationResult addressLine1;
 
        private CardVerificationResult postalCode;
 
        private AccountNameVerification accountName;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder cvv(CardVerificationResult cvv) {
            Utils.checkNotNull(cvv, "cvv");
            this.cvv = cvv;
            return this;
        }

        public Builder addressLine1(CardVerificationResult addressLine1) {
            Utils.checkNotNull(addressLine1, "addressLine1");
            this.addressLine1 = addressLine1;
            return this;
        }

        public Builder postalCode(CardVerificationResult postalCode) {
            Utils.checkNotNull(postalCode, "postalCode");
            this.postalCode = postalCode;
            return this;
        }

        /**
         * The results of submitting cardholder name to a card network for verification.
         */
        public Builder accountName(AccountNameVerification accountName) {
            Utils.checkNotNull(accountName, "accountName");
            this.accountName = accountName;
            return this;
        }
        
        public CardVerification build() {
            return new CardVerification(
                cvv,
                addressLine1,
                postalCode,
                accountName);
        }
    }
}

