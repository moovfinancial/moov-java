/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package io.moov.sdk.models.errors;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.moov.sdk.models.components.AmountValidationError;
import io.moov.sdk.models.components.DisplayOptionsError;
import io.moov.sdk.models.components.PaymentDetailsError;
import io.moov.sdk.models.components.PayoutDetailsError;
import io.moov.sdk.utils.Utils;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Optional;


@SuppressWarnings("serial")
public class CreatePaymentLinkError extends RuntimeException {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("partnerAccountID")
    private Optional<String> partnerAccountID;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("merchantPaymentMethodID")
    private Optional<String> merchantPaymentMethodID;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("amount")
    private Optional<? extends AmountValidationError> amount;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("maxUses")
    private Optional<String> maxUses;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("expiresOn")
    private Optional<String> expiresOn;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("display")
    private Optional<? extends DisplayOptionsError> display;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("payment")
    private Optional<? extends PaymentDetailsError> payment;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("payout")
    private Optional<? extends PayoutDetailsError> payout;

    @JsonCreator
    public CreatePaymentLinkError(
            @JsonProperty("partnerAccountID") Optional<String> partnerAccountID,
            @JsonProperty("merchantPaymentMethodID") Optional<String> merchantPaymentMethodID,
            @JsonProperty("amount") Optional<? extends AmountValidationError> amount,
            @JsonProperty("maxUses") Optional<String> maxUses,
            @JsonProperty("expiresOn") Optional<String> expiresOn,
            @JsonProperty("display") Optional<? extends DisplayOptionsError> display,
            @JsonProperty("payment") Optional<? extends PaymentDetailsError> payment,
            @JsonProperty("payout") Optional<? extends PayoutDetailsError> payout) {
        super("API error occurred");
        Utils.checkNotNull(partnerAccountID, "partnerAccountID");
        Utils.checkNotNull(merchantPaymentMethodID, "merchantPaymentMethodID");
        Utils.checkNotNull(amount, "amount");
        Utils.checkNotNull(maxUses, "maxUses");
        Utils.checkNotNull(expiresOn, "expiresOn");
        Utils.checkNotNull(display, "display");
        Utils.checkNotNull(payment, "payment");
        Utils.checkNotNull(payout, "payout");
        this.partnerAccountID = partnerAccountID;
        this.merchantPaymentMethodID = merchantPaymentMethodID;
        this.amount = amount;
        this.maxUses = maxUses;
        this.expiresOn = expiresOn;
        this.display = display;
        this.payment = payment;
        this.payout = payout;
    }
    
    public CreatePaymentLinkError() {
        this(Optional.empty(), Optional.empty(), Optional.empty(),
            Optional.empty(), Optional.empty(), Optional.empty(),
            Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<String> partnerAccountID() {
        return partnerAccountID;
    }

    @JsonIgnore
    public Optional<String> merchantPaymentMethodID() {
        return merchantPaymentMethodID;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<AmountValidationError> amount() {
        return (Optional<AmountValidationError>) amount;
    }

    @JsonIgnore
    public Optional<String> maxUses() {
        return maxUses;
    }

    @JsonIgnore
    public Optional<String> expiresOn() {
        return expiresOn;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<DisplayOptionsError> display() {
        return (Optional<DisplayOptionsError>) display;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<PaymentDetailsError> payment() {
        return (Optional<PaymentDetailsError>) payment;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<PayoutDetailsError> payout() {
        return (Optional<PayoutDetailsError>) payout;
    }

    public static Builder builder() {
        return new Builder();
    }


    public CreatePaymentLinkError withPartnerAccountID(String partnerAccountID) {
        Utils.checkNotNull(partnerAccountID, "partnerAccountID");
        this.partnerAccountID = Optional.ofNullable(partnerAccountID);
        return this;
    }


    public CreatePaymentLinkError withPartnerAccountID(Optional<String> partnerAccountID) {
        Utils.checkNotNull(partnerAccountID, "partnerAccountID");
        this.partnerAccountID = partnerAccountID;
        return this;
    }

    public CreatePaymentLinkError withMerchantPaymentMethodID(String merchantPaymentMethodID) {
        Utils.checkNotNull(merchantPaymentMethodID, "merchantPaymentMethodID");
        this.merchantPaymentMethodID = Optional.ofNullable(merchantPaymentMethodID);
        return this;
    }


    public CreatePaymentLinkError withMerchantPaymentMethodID(Optional<String> merchantPaymentMethodID) {
        Utils.checkNotNull(merchantPaymentMethodID, "merchantPaymentMethodID");
        this.merchantPaymentMethodID = merchantPaymentMethodID;
        return this;
    }

    public CreatePaymentLinkError withAmount(AmountValidationError amount) {
        Utils.checkNotNull(amount, "amount");
        this.amount = Optional.ofNullable(amount);
        return this;
    }


    public CreatePaymentLinkError withAmount(Optional<? extends AmountValidationError> amount) {
        Utils.checkNotNull(amount, "amount");
        this.amount = amount;
        return this;
    }

    public CreatePaymentLinkError withMaxUses(String maxUses) {
        Utils.checkNotNull(maxUses, "maxUses");
        this.maxUses = Optional.ofNullable(maxUses);
        return this;
    }


    public CreatePaymentLinkError withMaxUses(Optional<String> maxUses) {
        Utils.checkNotNull(maxUses, "maxUses");
        this.maxUses = maxUses;
        return this;
    }

    public CreatePaymentLinkError withExpiresOn(String expiresOn) {
        Utils.checkNotNull(expiresOn, "expiresOn");
        this.expiresOn = Optional.ofNullable(expiresOn);
        return this;
    }


    public CreatePaymentLinkError withExpiresOn(Optional<String> expiresOn) {
        Utils.checkNotNull(expiresOn, "expiresOn");
        this.expiresOn = expiresOn;
        return this;
    }

    public CreatePaymentLinkError withDisplay(DisplayOptionsError display) {
        Utils.checkNotNull(display, "display");
        this.display = Optional.ofNullable(display);
        return this;
    }


    public CreatePaymentLinkError withDisplay(Optional<? extends DisplayOptionsError> display) {
        Utils.checkNotNull(display, "display");
        this.display = display;
        return this;
    }

    public CreatePaymentLinkError withPayment(PaymentDetailsError payment) {
        Utils.checkNotNull(payment, "payment");
        this.payment = Optional.ofNullable(payment);
        return this;
    }


    public CreatePaymentLinkError withPayment(Optional<? extends PaymentDetailsError> payment) {
        Utils.checkNotNull(payment, "payment");
        this.payment = payment;
        return this;
    }

    public CreatePaymentLinkError withPayout(PayoutDetailsError payout) {
        Utils.checkNotNull(payout, "payout");
        this.payout = Optional.ofNullable(payout);
        return this;
    }


    public CreatePaymentLinkError withPayout(Optional<? extends PayoutDetailsError> payout) {
        Utils.checkNotNull(payout, "payout");
        this.payout = payout;
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
        CreatePaymentLinkError other = (CreatePaymentLinkError) o;
        return 
            Utils.enhancedDeepEquals(this.partnerAccountID, other.partnerAccountID) &&
            Utils.enhancedDeepEquals(this.merchantPaymentMethodID, other.merchantPaymentMethodID) &&
            Utils.enhancedDeepEquals(this.amount, other.amount) &&
            Utils.enhancedDeepEquals(this.maxUses, other.maxUses) &&
            Utils.enhancedDeepEquals(this.expiresOn, other.expiresOn) &&
            Utils.enhancedDeepEquals(this.display, other.display) &&
            Utils.enhancedDeepEquals(this.payment, other.payment) &&
            Utils.enhancedDeepEquals(this.payout, other.payout);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            partnerAccountID, merchantPaymentMethodID, amount,
            maxUses, expiresOn, display,
            payment, payout);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreatePaymentLinkError.class,
                "partnerAccountID", partnerAccountID,
                "merchantPaymentMethodID", merchantPaymentMethodID,
                "amount", amount,
                "maxUses", maxUses,
                "expiresOn", expiresOn,
                "display", display,
                "payment", payment,
                "payout", payout);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private Optional<String> partnerAccountID = Optional.empty();

        private Optional<String> merchantPaymentMethodID = Optional.empty();

        private Optional<? extends AmountValidationError> amount = Optional.empty();

        private Optional<String> maxUses = Optional.empty();

        private Optional<String> expiresOn = Optional.empty();

        private Optional<? extends DisplayOptionsError> display = Optional.empty();

        private Optional<? extends PaymentDetailsError> payment = Optional.empty();

        private Optional<? extends PayoutDetailsError> payout = Optional.empty();

        private Builder() {
          // force use of static builder() method
        }


        public Builder partnerAccountID(String partnerAccountID) {
            Utils.checkNotNull(partnerAccountID, "partnerAccountID");
            this.partnerAccountID = Optional.ofNullable(partnerAccountID);
            return this;
        }

        public Builder partnerAccountID(Optional<String> partnerAccountID) {
            Utils.checkNotNull(partnerAccountID, "partnerAccountID");
            this.partnerAccountID = partnerAccountID;
            return this;
        }


        public Builder merchantPaymentMethodID(String merchantPaymentMethodID) {
            Utils.checkNotNull(merchantPaymentMethodID, "merchantPaymentMethodID");
            this.merchantPaymentMethodID = Optional.ofNullable(merchantPaymentMethodID);
            return this;
        }

        public Builder merchantPaymentMethodID(Optional<String> merchantPaymentMethodID) {
            Utils.checkNotNull(merchantPaymentMethodID, "merchantPaymentMethodID");
            this.merchantPaymentMethodID = merchantPaymentMethodID;
            return this;
        }


        public Builder amount(AmountValidationError amount) {
            Utils.checkNotNull(amount, "amount");
            this.amount = Optional.ofNullable(amount);
            return this;
        }

        public Builder amount(Optional<? extends AmountValidationError> amount) {
            Utils.checkNotNull(amount, "amount");
            this.amount = amount;
            return this;
        }


        public Builder maxUses(String maxUses) {
            Utils.checkNotNull(maxUses, "maxUses");
            this.maxUses = Optional.ofNullable(maxUses);
            return this;
        }

        public Builder maxUses(Optional<String> maxUses) {
            Utils.checkNotNull(maxUses, "maxUses");
            this.maxUses = maxUses;
            return this;
        }


        public Builder expiresOn(String expiresOn) {
            Utils.checkNotNull(expiresOn, "expiresOn");
            this.expiresOn = Optional.ofNullable(expiresOn);
            return this;
        }

        public Builder expiresOn(Optional<String> expiresOn) {
            Utils.checkNotNull(expiresOn, "expiresOn");
            this.expiresOn = expiresOn;
            return this;
        }


        public Builder display(DisplayOptionsError display) {
            Utils.checkNotNull(display, "display");
            this.display = Optional.ofNullable(display);
            return this;
        }

        public Builder display(Optional<? extends DisplayOptionsError> display) {
            Utils.checkNotNull(display, "display");
            this.display = display;
            return this;
        }


        public Builder payment(PaymentDetailsError payment) {
            Utils.checkNotNull(payment, "payment");
            this.payment = Optional.ofNullable(payment);
            return this;
        }

        public Builder payment(Optional<? extends PaymentDetailsError> payment) {
            Utils.checkNotNull(payment, "payment");
            this.payment = payment;
            return this;
        }


        public Builder payout(PayoutDetailsError payout) {
            Utils.checkNotNull(payout, "payout");
            this.payout = Optional.ofNullable(payout);
            return this;
        }

        public Builder payout(Optional<? extends PayoutDetailsError> payout) {
            Utils.checkNotNull(payout, "payout");
            this.payout = payout;
            return this;
        }

        public CreatePaymentLinkError build() {

            return new CreatePaymentLinkError(
                partnerAccountID, merchantPaymentMethodID, amount,
                maxUses, expiresOn, display,
                payment, payout);
        }

    }
}

