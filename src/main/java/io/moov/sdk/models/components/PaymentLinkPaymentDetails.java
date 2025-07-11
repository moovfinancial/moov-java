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
import java.util.List;
import java.util.Optional;

/**
 * PaymentLinkPaymentDetails
 * 
 * <p>Options for payment links used to collect payment.
 */
public class PaymentLinkPaymentDetails {
    /**
     * A list of payment methods that should be supported for this payment link.
     */
    @JsonProperty("allowedMethods")
    private List<CollectionPaymentMethodType> allowedMethods;

    /**
     * Options for payment links used to collect a card payment.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("cardDetails")
    private Optional<? extends CardPaymentDetails> cardDetails;

    /**
     * Options for payment links used to collect an ACH payment.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("achDetails")
    private Optional<? extends ACHPaymentDetails> achDetails;

    @JsonCreator
    public PaymentLinkPaymentDetails(
            @JsonProperty("allowedMethods") List<CollectionPaymentMethodType> allowedMethods,
            @JsonProperty("cardDetails") Optional<? extends CardPaymentDetails> cardDetails,
            @JsonProperty("achDetails") Optional<? extends ACHPaymentDetails> achDetails) {
        Utils.checkNotNull(allowedMethods, "allowedMethods");
        Utils.checkNotNull(cardDetails, "cardDetails");
        Utils.checkNotNull(achDetails, "achDetails");
        this.allowedMethods = allowedMethods;
        this.cardDetails = cardDetails;
        this.achDetails = achDetails;
    }
    
    public PaymentLinkPaymentDetails(
            List<CollectionPaymentMethodType> allowedMethods) {
        this(allowedMethods, Optional.empty(), Optional.empty());
    }

    /**
     * A list of payment methods that should be supported for this payment link.
     */
    @JsonIgnore
    public List<CollectionPaymentMethodType> allowedMethods() {
        return allowedMethods;
    }

    /**
     * Options for payment links used to collect a card payment.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<CardPaymentDetails> cardDetails() {
        return (Optional<CardPaymentDetails>) cardDetails;
    }

    /**
     * Options for payment links used to collect an ACH payment.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<ACHPaymentDetails> achDetails() {
        return (Optional<ACHPaymentDetails>) achDetails;
    }

    public static Builder builder() {
        return new Builder();
    }


    /**
     * A list of payment methods that should be supported for this payment link.
     */
    public PaymentLinkPaymentDetails withAllowedMethods(List<CollectionPaymentMethodType> allowedMethods) {
        Utils.checkNotNull(allowedMethods, "allowedMethods");
        this.allowedMethods = allowedMethods;
        return this;
    }

    /**
     * Options for payment links used to collect a card payment.
     */
    public PaymentLinkPaymentDetails withCardDetails(CardPaymentDetails cardDetails) {
        Utils.checkNotNull(cardDetails, "cardDetails");
        this.cardDetails = Optional.ofNullable(cardDetails);
        return this;
    }


    /**
     * Options for payment links used to collect a card payment.
     */
    public PaymentLinkPaymentDetails withCardDetails(Optional<? extends CardPaymentDetails> cardDetails) {
        Utils.checkNotNull(cardDetails, "cardDetails");
        this.cardDetails = cardDetails;
        return this;
    }

    /**
     * Options for payment links used to collect an ACH payment.
     */
    public PaymentLinkPaymentDetails withAchDetails(ACHPaymentDetails achDetails) {
        Utils.checkNotNull(achDetails, "achDetails");
        this.achDetails = Optional.ofNullable(achDetails);
        return this;
    }


    /**
     * Options for payment links used to collect an ACH payment.
     */
    public PaymentLinkPaymentDetails withAchDetails(Optional<? extends ACHPaymentDetails> achDetails) {
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
        PaymentLinkPaymentDetails other = (PaymentLinkPaymentDetails) o;
        return 
            Utils.enhancedDeepEquals(this.allowedMethods, other.allowedMethods) &&
            Utils.enhancedDeepEquals(this.cardDetails, other.cardDetails) &&
            Utils.enhancedDeepEquals(this.achDetails, other.achDetails);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            allowedMethods, cardDetails, achDetails);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PaymentLinkPaymentDetails.class,
                "allowedMethods", allowedMethods,
                "cardDetails", cardDetails,
                "achDetails", achDetails);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private List<CollectionPaymentMethodType> allowedMethods;

        private Optional<? extends CardPaymentDetails> cardDetails = Optional.empty();

        private Optional<? extends ACHPaymentDetails> achDetails = Optional.empty();

        private Builder() {
          // force use of static builder() method
        }


        /**
         * A list of payment methods that should be supported for this payment link.
         */
        public Builder allowedMethods(List<CollectionPaymentMethodType> allowedMethods) {
            Utils.checkNotNull(allowedMethods, "allowedMethods");
            this.allowedMethods = allowedMethods;
            return this;
        }


        /**
         * Options for payment links used to collect a card payment.
         */
        public Builder cardDetails(CardPaymentDetails cardDetails) {
            Utils.checkNotNull(cardDetails, "cardDetails");
            this.cardDetails = Optional.ofNullable(cardDetails);
            return this;
        }

        /**
         * Options for payment links used to collect a card payment.
         */
        public Builder cardDetails(Optional<? extends CardPaymentDetails> cardDetails) {
            Utils.checkNotNull(cardDetails, "cardDetails");
            this.cardDetails = cardDetails;
            return this;
        }


        /**
         * Options for payment links used to collect an ACH payment.
         */
        public Builder achDetails(ACHPaymentDetails achDetails) {
            Utils.checkNotNull(achDetails, "achDetails");
            this.achDetails = Optional.ofNullable(achDetails);
            return this;
        }

        /**
         * Options for payment links used to collect an ACH payment.
         */
        public Builder achDetails(Optional<? extends ACHPaymentDetails> achDetails) {
            Utils.checkNotNull(achDetails, "achDetails");
            this.achDetails = achDetails;
            return this;
        }

        public PaymentLinkPaymentDetails build() {

            return new PaymentLinkPaymentDetails(
                allowedMethods, cardDetails, achDetails);
        }

    }
}
