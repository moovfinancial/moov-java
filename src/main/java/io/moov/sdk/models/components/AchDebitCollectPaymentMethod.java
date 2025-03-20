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

public class AchDebitCollectPaymentMethod implements PaymentMethod {

    /**
     * ID of the payment method.
     */
    @JsonProperty("paymentMethodID")
    private String paymentMethodID;

    @JsonProperty("paymentMethodType")
    private AchDebitCollectPaymentMethodPaymentMethodType paymentMethodType;

    /**
     * A bank account as contained within a payment method.
     */
    @JsonProperty("bankAccount")
    private PaymentMethodsBankAccount bankAccount;

    @JsonCreator
    public AchDebitCollectPaymentMethod(
            @JsonProperty("paymentMethodID") String paymentMethodID,
            @JsonProperty("paymentMethodType") AchDebitCollectPaymentMethodPaymentMethodType paymentMethodType,
            @JsonProperty("bankAccount") PaymentMethodsBankAccount bankAccount) {
        Utils.checkNotNull(paymentMethodID, "paymentMethodID");
        Utils.checkNotNull(paymentMethodType, "paymentMethodType");
        Utils.checkNotNull(bankAccount, "bankAccount");
        this.paymentMethodID = paymentMethodID;
        this.paymentMethodType = paymentMethodType;
        this.bankAccount = bankAccount;
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
     * A bank account as contained within a payment method.
     */
    @JsonIgnore
    public PaymentMethodsBankAccount bankAccount() {
        return bankAccount;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * ID of the payment method.
     */
    public AchDebitCollectPaymentMethod withPaymentMethodID(String paymentMethodID) {
        Utils.checkNotNull(paymentMethodID, "paymentMethodID");
        this.paymentMethodID = paymentMethodID;
        return this;
    }

    public AchDebitCollectPaymentMethod withPaymentMethodType(AchDebitCollectPaymentMethodPaymentMethodType paymentMethodType) {
        Utils.checkNotNull(paymentMethodType, "paymentMethodType");
        this.paymentMethodType = paymentMethodType;
        return this;
    }

    /**
     * A bank account as contained within a payment method.
     */
    public AchDebitCollectPaymentMethod withBankAccount(PaymentMethodsBankAccount bankAccount) {
        Utils.checkNotNull(bankAccount, "bankAccount");
        this.bankAccount = bankAccount;
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
        AchDebitCollectPaymentMethod other = (AchDebitCollectPaymentMethod) o;
        return 
            Objects.deepEquals(this.paymentMethodID, other.paymentMethodID) &&
            Objects.deepEquals(this.paymentMethodType, other.paymentMethodType) &&
            Objects.deepEquals(this.bankAccount, other.bankAccount);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            paymentMethodID,
            paymentMethodType,
            bankAccount);
    }
    
    @Override
    public String toString() {
        return Utils.toString(AchDebitCollectPaymentMethod.class,
                "paymentMethodID", paymentMethodID,
                "paymentMethodType", paymentMethodType,
                "bankAccount", bankAccount);
    }
    
    public final static class Builder {
 
        private String paymentMethodID;
 
        private AchDebitCollectPaymentMethodPaymentMethodType paymentMethodType;
 
        private PaymentMethodsBankAccount bankAccount;  
        
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

        public Builder paymentMethodType(AchDebitCollectPaymentMethodPaymentMethodType paymentMethodType) {
            Utils.checkNotNull(paymentMethodType, "paymentMethodType");
            this.paymentMethodType = paymentMethodType;
            return this;
        }

        /**
         * A bank account as contained within a payment method.
         */
        public Builder bankAccount(PaymentMethodsBankAccount bankAccount) {
            Utils.checkNotNull(bankAccount, "bankAccount");
            this.bankAccount = bankAccount;
            return this;
        }
        
        public AchDebitCollectPaymentMethod build() {
            return new AchDebitCollectPaymentMethod(
                paymentMethodID,
                paymentMethodType,
                bankAccount);
        }
    }
}

