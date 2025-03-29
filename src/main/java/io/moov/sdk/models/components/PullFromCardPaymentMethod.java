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

public class PullFromCardPaymentMethod implements PaymentMethod {

    /**
     * ID of the payment method.
     */
    @JsonProperty("paymentMethodID")
    private String paymentMethodID;

    @JsonProperty("paymentMethodType")
    private PullFromCardPaymentMethodPaymentMethodType paymentMethodType;

    /**
     * A card as contained within a payment method.
     */
    @JsonProperty("card")
    private PaymentMethodsCard card;

    @JsonCreator
    public PullFromCardPaymentMethod(
            @JsonProperty("paymentMethodID") String paymentMethodID,
            @JsonProperty("paymentMethodType") PullFromCardPaymentMethodPaymentMethodType paymentMethodType,
            @JsonProperty("card") PaymentMethodsCard card) {
        Utils.checkNotNull(paymentMethodID, "paymentMethodID");
        Utils.checkNotNull(paymentMethodType, "paymentMethodType");
        Utils.checkNotNull(card, "card");
        this.paymentMethodID = paymentMethodID;
        this.paymentMethodType = paymentMethodType;
        this.card = card;
    }

    /**
     * ID of the payment method.
     */
    @JsonIgnore
    public String paymentMethodID() {
        return paymentMethodID;
    }

    @JsonIgnore
    @Override
    public String paymentMethodType() {
        return Utils.discriminatorToString(paymentMethodType);
    }

    /**
     * A card as contained within a payment method.
     */
    @JsonIgnore
    public PaymentMethodsCard card() {
        return card;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * ID of the payment method.
     */
    public PullFromCardPaymentMethod withPaymentMethodID(String paymentMethodID) {
        Utils.checkNotNull(paymentMethodID, "paymentMethodID");
        this.paymentMethodID = paymentMethodID;
        return this;
    }

    public PullFromCardPaymentMethod withPaymentMethodType(PullFromCardPaymentMethodPaymentMethodType paymentMethodType) {
        Utils.checkNotNull(paymentMethodType, "paymentMethodType");
        this.paymentMethodType = paymentMethodType;
        return this;
    }

    /**
     * A card as contained within a payment method.
     */
    public PullFromCardPaymentMethod withCard(PaymentMethodsCard card) {
        Utils.checkNotNull(card, "card");
        this.card = card;
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
        PullFromCardPaymentMethod other = (PullFromCardPaymentMethod) o;
        return 
            Objects.deepEquals(this.paymentMethodID, other.paymentMethodID) &&
            Objects.deepEquals(this.paymentMethodType, other.paymentMethodType) &&
            Objects.deepEquals(this.card, other.card);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            paymentMethodID,
            paymentMethodType,
            card);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PullFromCardPaymentMethod.class,
                "paymentMethodID", paymentMethodID,
                "paymentMethodType", paymentMethodType,
                "card", card);
    }
    
    public final static class Builder {
 
        private String paymentMethodID;
 
        private PullFromCardPaymentMethodPaymentMethodType paymentMethodType;
 
        private PaymentMethodsCard card;
        
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

        public Builder paymentMethodType(PullFromCardPaymentMethodPaymentMethodType paymentMethodType) {
            Utils.checkNotNull(paymentMethodType, "paymentMethodType");
            this.paymentMethodType = paymentMethodType;
            return this;
        }

        /**
         * A card as contained within a payment method.
         */
        public Builder card(PaymentMethodsCard card) {
            Utils.checkNotNull(card, "card");
            this.card = card;
            return this;
        }
        
        public PullFromCardPaymentMethod build() {
            return new PullFromCardPaymentMethod(
                paymentMethodID,
                paymentMethodType,
                card);
        }
    }
}
