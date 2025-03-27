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
 * LinkApplePayToken
 * 
 * <p>Contains the user's payment information as returned from Apple Pay.
 * 
 * <p>  Refer to [Apple's documentation](https://developer.apple.com/documentation/apple_pay_on_the_web/applepaypaymenttoken) 
 *   for more information.
 */

public class LinkApplePayToken {

    /**
     * Contains the encrypted payment data.
     * 
     * <p>  Refer to [Apple's documentation](https://developer.apple.com/documentation/apple_pay_on_the_web/applepaypaymenttoken/1916115-paymentdata) 
     *   for more information.
     */
    @JsonProperty("paymentData")
    private LinkApplePaymentData paymentData;

    /**
     * Provides information about the underlying card.
     * 
     * <p>  Refer to [Apple's documentation](https://developer.apple.com/documentation/apple_pay_on_the_web/applepaypaymenttoken/1916113-paymentmethod) 
     *   for more information.
     */
    @JsonProperty("paymentMethod")
    private LinkApplePaymentMethod paymentMethod;

    /**
     * A unique identifier provided by Apple Pay for this payment.
     */
    @JsonProperty("transactionIdentifier")
    private String transactionIdentifier;

    @JsonCreator
    public LinkApplePayToken(
            @JsonProperty("paymentData") LinkApplePaymentData paymentData,
            @JsonProperty("paymentMethod") LinkApplePaymentMethod paymentMethod,
            @JsonProperty("transactionIdentifier") String transactionIdentifier) {
        Utils.checkNotNull(paymentData, "paymentData");
        Utils.checkNotNull(paymentMethod, "paymentMethod");
        Utils.checkNotNull(transactionIdentifier, "transactionIdentifier");
        this.paymentData = paymentData;
        this.paymentMethod = paymentMethod;
        this.transactionIdentifier = transactionIdentifier;
    }

    /**
     * Contains the encrypted payment data.
     * 
     * <p>  Refer to [Apple's documentation](https://developer.apple.com/documentation/apple_pay_on_the_web/applepaypaymenttoken/1916115-paymentdata) 
     *   for more information.
     */
    @JsonIgnore
    public LinkApplePaymentData paymentData() {
        return paymentData;
    }

    /**
     * Provides information about the underlying card.
     * 
     * <p>  Refer to [Apple's documentation](https://developer.apple.com/documentation/apple_pay_on_the_web/applepaypaymenttoken/1916113-paymentmethod) 
     *   for more information.
     */
    @JsonIgnore
    public LinkApplePaymentMethod paymentMethod() {
        return paymentMethod;
    }

    /**
     * A unique identifier provided by Apple Pay for this payment.
     */
    @JsonIgnore
    public String transactionIdentifier() {
        return transactionIdentifier;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Contains the encrypted payment data.
     * 
     * <p>  Refer to [Apple's documentation](https://developer.apple.com/documentation/apple_pay_on_the_web/applepaypaymenttoken/1916115-paymentdata) 
     *   for more information.
     */
    public LinkApplePayToken withPaymentData(LinkApplePaymentData paymentData) {
        Utils.checkNotNull(paymentData, "paymentData");
        this.paymentData = paymentData;
        return this;
    }

    /**
     * Provides information about the underlying card.
     * 
     * <p>  Refer to [Apple's documentation](https://developer.apple.com/documentation/apple_pay_on_the_web/applepaypaymenttoken/1916113-paymentmethod) 
     *   for more information.
     */
    public LinkApplePayToken withPaymentMethod(LinkApplePaymentMethod paymentMethod) {
        Utils.checkNotNull(paymentMethod, "paymentMethod");
        this.paymentMethod = paymentMethod;
        return this;
    }

    /**
     * A unique identifier provided by Apple Pay for this payment.
     */
    public LinkApplePayToken withTransactionIdentifier(String transactionIdentifier) {
        Utils.checkNotNull(transactionIdentifier, "transactionIdentifier");
        this.transactionIdentifier = transactionIdentifier;
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
        LinkApplePayToken other = (LinkApplePayToken) o;
        return 
            Objects.deepEquals(this.paymentData, other.paymentData) &&
            Objects.deepEquals(this.paymentMethod, other.paymentMethod) &&
            Objects.deepEquals(this.transactionIdentifier, other.transactionIdentifier);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            paymentData,
            paymentMethod,
            transactionIdentifier);
    }
    
    @Override
    public String toString() {
        return Utils.toString(LinkApplePayToken.class,
                "paymentData", paymentData,
                "paymentMethod", paymentMethod,
                "transactionIdentifier", transactionIdentifier);
    }
    
    public final static class Builder {
 
        private LinkApplePaymentData paymentData;
 
        private LinkApplePaymentMethod paymentMethod;
 
        private String transactionIdentifier;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Contains the encrypted payment data.
         * 
         * <p>  Refer to [Apple's documentation](https://developer.apple.com/documentation/apple_pay_on_the_web/applepaypaymenttoken/1916115-paymentdata) 
         *   for more information.
         */
        public Builder paymentData(LinkApplePaymentData paymentData) {
            Utils.checkNotNull(paymentData, "paymentData");
            this.paymentData = paymentData;
            return this;
        }

        /**
         * Provides information about the underlying card.
         * 
         * <p>  Refer to [Apple's documentation](https://developer.apple.com/documentation/apple_pay_on_the_web/applepaypaymenttoken/1916113-paymentmethod) 
         *   for more information.
         */
        public Builder paymentMethod(LinkApplePaymentMethod paymentMethod) {
            Utils.checkNotNull(paymentMethod, "paymentMethod");
            this.paymentMethod = paymentMethod;
            return this;
        }

        /**
         * A unique identifier provided by Apple Pay for this payment.
         */
        public Builder transactionIdentifier(String transactionIdentifier) {
            Utils.checkNotNull(transactionIdentifier, "transactionIdentifier");
            this.transactionIdentifier = transactionIdentifier;
            return this;
        }
        
        public LinkApplePayToken build() {
            return new LinkApplePayToken(
                paymentData,
                paymentMethod,
                transactionIdentifier);
        }
    }
}

