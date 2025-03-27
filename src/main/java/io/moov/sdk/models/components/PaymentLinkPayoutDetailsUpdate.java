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
import java.util.Objects;
import java.util.Optional;

public class PaymentLinkPayoutDetailsUpdate {

    /**
     * A list of payment methods that should be supported for this payment link.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("allowedMethods")
    private Optional<? extends List<DisbursementPaymentMethodType>> allowedMethods;

    /**
     * Specify the intended recipient of the payout.
     * 
     * <p>This information will be used to authenticate the end user when they follow the payment link.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("recipient")
    private Optional<? extends PayoutRecipientUpdate> recipient;

    @JsonCreator
    public PaymentLinkPayoutDetailsUpdate(
            @JsonProperty("allowedMethods") Optional<? extends List<DisbursementPaymentMethodType>> allowedMethods,
            @JsonProperty("recipient") Optional<? extends PayoutRecipientUpdate> recipient) {
        Utils.checkNotNull(allowedMethods, "allowedMethods");
        Utils.checkNotNull(recipient, "recipient");
        this.allowedMethods = allowedMethods;
        this.recipient = recipient;
    }
    
    public PaymentLinkPayoutDetailsUpdate() {
        this(Optional.empty(), Optional.empty());
    }

    /**
     * A list of payment methods that should be supported for this payment link.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<DisbursementPaymentMethodType>> allowedMethods() {
        return (Optional<List<DisbursementPaymentMethodType>>) allowedMethods;
    }

    /**
     * Specify the intended recipient of the payout.
     * 
     * <p>This information will be used to authenticate the end user when they follow the payment link.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<PayoutRecipientUpdate> recipient() {
        return (Optional<PayoutRecipientUpdate>) recipient;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * A list of payment methods that should be supported for this payment link.
     */
    public PaymentLinkPayoutDetailsUpdate withAllowedMethods(List<DisbursementPaymentMethodType> allowedMethods) {
        Utils.checkNotNull(allowedMethods, "allowedMethods");
        this.allowedMethods = Optional.ofNullable(allowedMethods);
        return this;
    }

    /**
     * A list of payment methods that should be supported for this payment link.
     */
    public PaymentLinkPayoutDetailsUpdate withAllowedMethods(Optional<? extends List<DisbursementPaymentMethodType>> allowedMethods) {
        Utils.checkNotNull(allowedMethods, "allowedMethods");
        this.allowedMethods = allowedMethods;
        return this;
    }

    /**
     * Specify the intended recipient of the payout.
     * 
     * <p>This information will be used to authenticate the end user when they follow the payment link.
     */
    public PaymentLinkPayoutDetailsUpdate withRecipient(PayoutRecipientUpdate recipient) {
        Utils.checkNotNull(recipient, "recipient");
        this.recipient = Optional.ofNullable(recipient);
        return this;
    }

    /**
     * Specify the intended recipient of the payout.
     * 
     * <p>This information will be used to authenticate the end user when they follow the payment link.
     */
    public PaymentLinkPayoutDetailsUpdate withRecipient(Optional<? extends PayoutRecipientUpdate> recipient) {
        Utils.checkNotNull(recipient, "recipient");
        this.recipient = recipient;
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
        PaymentLinkPayoutDetailsUpdate other = (PaymentLinkPayoutDetailsUpdate) o;
        return 
            Objects.deepEquals(this.allowedMethods, other.allowedMethods) &&
            Objects.deepEquals(this.recipient, other.recipient);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            allowedMethods,
            recipient);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PaymentLinkPayoutDetailsUpdate.class,
                "allowedMethods", allowedMethods,
                "recipient", recipient);
    }
    
    public final static class Builder {
 
        private Optional<? extends List<DisbursementPaymentMethodType>> allowedMethods = Optional.empty();
 
        private Optional<? extends PayoutRecipientUpdate> recipient = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * A list of payment methods that should be supported for this payment link.
         */
        public Builder allowedMethods(List<DisbursementPaymentMethodType> allowedMethods) {
            Utils.checkNotNull(allowedMethods, "allowedMethods");
            this.allowedMethods = Optional.ofNullable(allowedMethods);
            return this;
        }

        /**
         * A list of payment methods that should be supported for this payment link.
         */
        public Builder allowedMethods(Optional<? extends List<DisbursementPaymentMethodType>> allowedMethods) {
            Utils.checkNotNull(allowedMethods, "allowedMethods");
            this.allowedMethods = allowedMethods;
            return this;
        }

        /**
         * Specify the intended recipient of the payout.
         * 
         * <p>This information will be used to authenticate the end user when they follow the payment link.
         */
        public Builder recipient(PayoutRecipientUpdate recipient) {
            Utils.checkNotNull(recipient, "recipient");
            this.recipient = Optional.ofNullable(recipient);
            return this;
        }

        /**
         * Specify the intended recipient of the payout.
         * 
         * <p>This information will be used to authenticate the end user when they follow the payment link.
         */
        public Builder recipient(Optional<? extends PayoutRecipientUpdate> recipient) {
            Utils.checkNotNull(recipient, "recipient");
            this.recipient = recipient;
            return this;
        }
        
        public PaymentLinkPayoutDetailsUpdate build() {
            return new PaymentLinkPayoutDetailsUpdate(
                allowedMethods,
                recipient);
        }
    }
}

