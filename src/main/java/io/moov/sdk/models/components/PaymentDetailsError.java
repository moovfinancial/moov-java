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
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;

public class PaymentDetailsError {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("allowedMethods")
    private Optional<String> allowedMethods;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("cardDetails")
    private Optional<? extends CardPaymentDetailsError> cardDetails;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("achDetails")
    private Optional<? extends ACHPaymentDetailsError> achDetails;

    @JsonCreator
    public PaymentDetailsError(
            @JsonProperty("allowedMethods") Optional<String> allowedMethods,
            @JsonProperty("cardDetails") Optional<? extends CardPaymentDetailsError> cardDetails,
            @JsonProperty("achDetails") Optional<? extends ACHPaymentDetailsError> achDetails) {
        Utils.checkNotNull(allowedMethods, "allowedMethods");
        Utils.checkNotNull(cardDetails, "cardDetails");
        Utils.checkNotNull(achDetails, "achDetails");
        this.allowedMethods = allowedMethods;
        this.cardDetails = cardDetails;
        this.achDetails = achDetails;
    }
    
    public PaymentDetailsError() {
        this(Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<String> allowedMethods() {
        return allowedMethods;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<CardPaymentDetailsError> cardDetails() {
        return (Optional<CardPaymentDetailsError>) cardDetails;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<ACHPaymentDetailsError> achDetails() {
        return (Optional<ACHPaymentDetailsError>) achDetails;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public PaymentDetailsError withAllowedMethods(String allowedMethods) {
        Utils.checkNotNull(allowedMethods, "allowedMethods");
        this.allowedMethods = Optional.ofNullable(allowedMethods);
        return this;
    }

    public PaymentDetailsError withAllowedMethods(Optional<String> allowedMethods) {
        Utils.checkNotNull(allowedMethods, "allowedMethods");
        this.allowedMethods = allowedMethods;
        return this;
    }

    public PaymentDetailsError withCardDetails(CardPaymentDetailsError cardDetails) {
        Utils.checkNotNull(cardDetails, "cardDetails");
        this.cardDetails = Optional.ofNullable(cardDetails);
        return this;
    }

    public PaymentDetailsError withCardDetails(Optional<? extends CardPaymentDetailsError> cardDetails) {
        Utils.checkNotNull(cardDetails, "cardDetails");
        this.cardDetails = cardDetails;
        return this;
    }

    public PaymentDetailsError withAchDetails(ACHPaymentDetailsError achDetails) {
        Utils.checkNotNull(achDetails, "achDetails");
        this.achDetails = Optional.ofNullable(achDetails);
        return this;
    }

    public PaymentDetailsError withAchDetails(Optional<? extends ACHPaymentDetailsError> achDetails) {
        Utils.checkNotNull(achDetails, "achDetails");
        this.achDetails = achDetails;
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
        PaymentDetailsError other = (PaymentDetailsError) o;
        return 
            Objects.deepEquals(this.allowedMethods, other.allowedMethods) &&
            Objects.deepEquals(this.cardDetails, other.cardDetails) &&
            Objects.deepEquals(this.achDetails, other.achDetails);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            allowedMethods,
            cardDetails,
            achDetails);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PaymentDetailsError.class,
                "allowedMethods", allowedMethods,
                "cardDetails", cardDetails,
                "achDetails", achDetails);
    }
    
    public final static class Builder {
 
        private Optional<String> allowedMethods = Optional.empty();
 
        private Optional<? extends CardPaymentDetailsError> cardDetails = Optional.empty();
 
        private Optional<? extends ACHPaymentDetailsError> achDetails = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder allowedMethods(String allowedMethods) {
            Utils.checkNotNull(allowedMethods, "allowedMethods");
            this.allowedMethods = Optional.ofNullable(allowedMethods);
            return this;
        }

        public Builder allowedMethods(Optional<String> allowedMethods) {
            Utils.checkNotNull(allowedMethods, "allowedMethods");
            this.allowedMethods = allowedMethods;
            return this;
        }

        public Builder cardDetails(CardPaymentDetailsError cardDetails) {
            Utils.checkNotNull(cardDetails, "cardDetails");
            this.cardDetails = Optional.ofNullable(cardDetails);
            return this;
        }

        public Builder cardDetails(Optional<? extends CardPaymentDetailsError> cardDetails) {
            Utils.checkNotNull(cardDetails, "cardDetails");
            this.cardDetails = cardDetails;
            return this;
        }

        public Builder achDetails(ACHPaymentDetailsError achDetails) {
            Utils.checkNotNull(achDetails, "achDetails");
            this.achDetails = Optional.ofNullable(achDetails);
            return this;
        }

        public Builder achDetails(Optional<? extends ACHPaymentDetailsError> achDetails) {
            Utils.checkNotNull(achDetails, "achDetails");
            this.achDetails = achDetails;
            return this;
        }
        
        public PaymentDetailsError build() {
            return new PaymentDetailsError(
                allowedMethods,
                cardDetails,
                achDetails);
        }
    }
}

