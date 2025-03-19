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
import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.Optional;

/**
 * SweepConfigPaymentMethod - The payment method used to push or pull funds to a bank account.
 * The push payment method can only be ach-credit-standard or ach-credit-same-day. The pull payment method can only be ach-debit-fund.
 */

public class SweepConfigPaymentMethod {

    /**
     * ID of the payment method.
     */
    @JsonProperty("paymentMethodID")
    private String paymentMethodID;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("disabledOn")
    private Optional<OffsetDateTime> disabledOn;

    @JsonCreator
    public SweepConfigPaymentMethod(
            @JsonProperty("paymentMethodID") String paymentMethodID,
            @JsonProperty("disabledOn") Optional<OffsetDateTime> disabledOn) {
        Utils.checkNotNull(paymentMethodID, "paymentMethodID");
        Utils.checkNotNull(disabledOn, "disabledOn");
        this.paymentMethodID = paymentMethodID;
        this.disabledOn = disabledOn;
    }
    
    public SweepConfigPaymentMethod(
            String paymentMethodID) {
        this(paymentMethodID, Optional.empty());
    }

    /**
     * ID of the payment method.
     */
    @JsonIgnore
    public String paymentMethodID() {
        return paymentMethodID;
    }

    @JsonIgnore
    public Optional<OffsetDateTime> disabledOn() {
        return disabledOn;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * ID of the payment method.
     */
    public SweepConfigPaymentMethod withPaymentMethodID(String paymentMethodID) {
        Utils.checkNotNull(paymentMethodID, "paymentMethodID");
        this.paymentMethodID = paymentMethodID;
        return this;
    }

    public SweepConfigPaymentMethod withDisabledOn(OffsetDateTime disabledOn) {
        Utils.checkNotNull(disabledOn, "disabledOn");
        this.disabledOn = Optional.ofNullable(disabledOn);
        return this;
    }

    public SweepConfigPaymentMethod withDisabledOn(Optional<OffsetDateTime> disabledOn) {
        Utils.checkNotNull(disabledOn, "disabledOn");
        this.disabledOn = disabledOn;
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
        SweepConfigPaymentMethod other = (SweepConfigPaymentMethod) o;
        return 
            Objects.deepEquals(this.paymentMethodID, other.paymentMethodID) &&
            Objects.deepEquals(this.disabledOn, other.disabledOn);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            paymentMethodID,
            disabledOn);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SweepConfigPaymentMethod.class,
                "paymentMethodID", paymentMethodID,
                "disabledOn", disabledOn);
    }
    
    public final static class Builder {
 
        private String paymentMethodID;
 
        private Optional<OffsetDateTime> disabledOn = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * ID of the payment method.
         */
        public Builder paymentMethodID(String paymentMethodID) {
            Utils.checkNotNull(paymentMethodID, "paymentMethodID");
            this.paymentMethodID = paymentMethodID;
            return this;
        }

        public Builder disabledOn(OffsetDateTime disabledOn) {
            Utils.checkNotNull(disabledOn, "disabledOn");
            this.disabledOn = Optional.ofNullable(disabledOn);
            return this;
        }

        public Builder disabledOn(Optional<OffsetDateTime> disabledOn) {
            Utils.checkNotNull(disabledOn, "disabledOn");
            this.disabledOn = disabledOn;
            return this;
        }
        
        public SweepConfigPaymentMethod build() {
            return new SweepConfigPaymentMethod(
                paymentMethodID,
                disabledOn);
        }
    }
}

