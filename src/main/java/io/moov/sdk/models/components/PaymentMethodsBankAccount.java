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
import java.time.OffsetDateTime;
import java.util.Objects;
/**
 * PaymentMethodsBankAccount
 * 
 * <p>A bank account as contained within a payment method.
 */

public class PaymentMethodsBankAccount {

    @JsonProperty("bankAccountID")
    private String bankAccountID;

    /**
     * Once the bank account is linked, we don't reveal the full bank account number. 
     * 
     * <p>The fingerprint acts as a way to identify whether two linked bank accounts are the same.
     */
    @JsonProperty("fingerprint")
    private String fingerprint;

    @JsonProperty("status")
    private BankAccountStatus status;

    @JsonProperty("holderName")
    private String holderName;

    /**
     * The type of holder on a funding source.
     */
    @JsonProperty("holderType")
    private BankAccountHolderType holderType;

    @JsonProperty("bankName")
    private String bankName;

    /**
     * The bank account type.
     */
    @JsonProperty("bankAccountType")
    private BankAccountType bankAccountType;

    @JsonProperty("routingNumber")
    private String routingNumber;

    @JsonProperty("lastFourAccountNumber")
    private String lastFourAccountNumber;

    @JsonProperty("updatedOn")
    private OffsetDateTime updatedOn;

    @JsonCreator
    public PaymentMethodsBankAccount(
            @JsonProperty("bankAccountID") String bankAccountID,
            @JsonProperty("fingerprint") String fingerprint,
            @JsonProperty("status") BankAccountStatus status,
            @JsonProperty("holderName") String holderName,
            @JsonProperty("holderType") BankAccountHolderType holderType,
            @JsonProperty("bankName") String bankName,
            @JsonProperty("bankAccountType") BankAccountType bankAccountType,
            @JsonProperty("routingNumber") String routingNumber,
            @JsonProperty("lastFourAccountNumber") String lastFourAccountNumber,
            @JsonProperty("updatedOn") OffsetDateTime updatedOn) {
        Utils.checkNotNull(bankAccountID, "bankAccountID");
        Utils.checkNotNull(fingerprint, "fingerprint");
        Utils.checkNotNull(status, "status");
        Utils.checkNotNull(holderName, "holderName");
        Utils.checkNotNull(holderType, "holderType");
        Utils.checkNotNull(bankName, "bankName");
        Utils.checkNotNull(bankAccountType, "bankAccountType");
        Utils.checkNotNull(routingNumber, "routingNumber");
        Utils.checkNotNull(lastFourAccountNumber, "lastFourAccountNumber");
        Utils.checkNotNull(updatedOn, "updatedOn");
        this.bankAccountID = bankAccountID;
        this.fingerprint = fingerprint;
        this.status = status;
        this.holderName = holderName;
        this.holderType = holderType;
        this.bankName = bankName;
        this.bankAccountType = bankAccountType;
        this.routingNumber = routingNumber;
        this.lastFourAccountNumber = lastFourAccountNumber;
        this.updatedOn = updatedOn;
    }

    @JsonIgnore
    public String bankAccountID() {
        return bankAccountID;
    }

    /**
     * Once the bank account is linked, we don't reveal the full bank account number. 
     * 
     * <p>The fingerprint acts as a way to identify whether two linked bank accounts are the same.
     */
    @JsonIgnore
    public String fingerprint() {
        return fingerprint;
    }

    @JsonIgnore
    public BankAccountStatus status() {
        return status;
    }

    @JsonIgnore
    public String holderName() {
        return holderName;
    }

    /**
     * The type of holder on a funding source.
     */
    @JsonIgnore
    public BankAccountHolderType holderType() {
        return holderType;
    }

    @JsonIgnore
    public String bankName() {
        return bankName;
    }

    /**
     * The bank account type.
     */
    @JsonIgnore
    public BankAccountType bankAccountType() {
        return bankAccountType;
    }

    @JsonIgnore
    public String routingNumber() {
        return routingNumber;
    }

    @JsonIgnore
    public String lastFourAccountNumber() {
        return lastFourAccountNumber;
    }

    @JsonIgnore
    public OffsetDateTime updatedOn() {
        return updatedOn;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public PaymentMethodsBankAccount withBankAccountID(String bankAccountID) {
        Utils.checkNotNull(bankAccountID, "bankAccountID");
        this.bankAccountID = bankAccountID;
        return this;
    }

    /**
     * Once the bank account is linked, we don't reveal the full bank account number. 
     * 
     * <p>The fingerprint acts as a way to identify whether two linked bank accounts are the same.
     */
    public PaymentMethodsBankAccount withFingerprint(String fingerprint) {
        Utils.checkNotNull(fingerprint, "fingerprint");
        this.fingerprint = fingerprint;
        return this;
    }

    public PaymentMethodsBankAccount withStatus(BankAccountStatus status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
        return this;
    }

    public PaymentMethodsBankAccount withHolderName(String holderName) {
        Utils.checkNotNull(holderName, "holderName");
        this.holderName = holderName;
        return this;
    }

    /**
     * The type of holder on a funding source.
     */
    public PaymentMethodsBankAccount withHolderType(BankAccountHolderType holderType) {
        Utils.checkNotNull(holderType, "holderType");
        this.holderType = holderType;
        return this;
    }

    public PaymentMethodsBankAccount withBankName(String bankName) {
        Utils.checkNotNull(bankName, "bankName");
        this.bankName = bankName;
        return this;
    }

    /**
     * The bank account type.
     */
    public PaymentMethodsBankAccount withBankAccountType(BankAccountType bankAccountType) {
        Utils.checkNotNull(bankAccountType, "bankAccountType");
        this.bankAccountType = bankAccountType;
        return this;
    }

    public PaymentMethodsBankAccount withRoutingNumber(String routingNumber) {
        Utils.checkNotNull(routingNumber, "routingNumber");
        this.routingNumber = routingNumber;
        return this;
    }

    public PaymentMethodsBankAccount withLastFourAccountNumber(String lastFourAccountNumber) {
        Utils.checkNotNull(lastFourAccountNumber, "lastFourAccountNumber");
        this.lastFourAccountNumber = lastFourAccountNumber;
        return this;
    }

    public PaymentMethodsBankAccount withUpdatedOn(OffsetDateTime updatedOn) {
        Utils.checkNotNull(updatedOn, "updatedOn");
        this.updatedOn = updatedOn;
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
        PaymentMethodsBankAccount other = (PaymentMethodsBankAccount) o;
        return 
            Objects.deepEquals(this.bankAccountID, other.bankAccountID) &&
            Objects.deepEquals(this.fingerprint, other.fingerprint) &&
            Objects.deepEquals(this.status, other.status) &&
            Objects.deepEquals(this.holderName, other.holderName) &&
            Objects.deepEquals(this.holderType, other.holderType) &&
            Objects.deepEquals(this.bankName, other.bankName) &&
            Objects.deepEquals(this.bankAccountType, other.bankAccountType) &&
            Objects.deepEquals(this.routingNumber, other.routingNumber) &&
            Objects.deepEquals(this.lastFourAccountNumber, other.lastFourAccountNumber) &&
            Objects.deepEquals(this.updatedOn, other.updatedOn);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            bankAccountID,
            fingerprint,
            status,
            holderName,
            holderType,
            bankName,
            bankAccountType,
            routingNumber,
            lastFourAccountNumber,
            updatedOn);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PaymentMethodsBankAccount.class,
                "bankAccountID", bankAccountID,
                "fingerprint", fingerprint,
                "status", status,
                "holderName", holderName,
                "holderType", holderType,
                "bankName", bankName,
                "bankAccountType", bankAccountType,
                "routingNumber", routingNumber,
                "lastFourAccountNumber", lastFourAccountNumber,
                "updatedOn", updatedOn);
    }
    
    public final static class Builder {
 
        private String bankAccountID;
 
        private String fingerprint;
 
        private BankAccountStatus status;
 
        private String holderName;
 
        private BankAccountHolderType holderType;
 
        private String bankName;
 
        private BankAccountType bankAccountType;
 
        private String routingNumber;
 
        private String lastFourAccountNumber;
 
        private OffsetDateTime updatedOn;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder bankAccountID(String bankAccountID) {
            Utils.checkNotNull(bankAccountID, "bankAccountID");
            this.bankAccountID = bankAccountID;
            return this;
        }

        /**
         * Once the bank account is linked, we don't reveal the full bank account number. 
         * 
         * <p>The fingerprint acts as a way to identify whether two linked bank accounts are the same.
         */
        public Builder fingerprint(String fingerprint) {
            Utils.checkNotNull(fingerprint, "fingerprint");
            this.fingerprint = fingerprint;
            return this;
        }

        public Builder status(BankAccountStatus status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }

        public Builder holderName(String holderName) {
            Utils.checkNotNull(holderName, "holderName");
            this.holderName = holderName;
            return this;
        }

        /**
         * The type of holder on a funding source.
         */
        public Builder holderType(BankAccountHolderType holderType) {
            Utils.checkNotNull(holderType, "holderType");
            this.holderType = holderType;
            return this;
        }

        public Builder bankName(String bankName) {
            Utils.checkNotNull(bankName, "bankName");
            this.bankName = bankName;
            return this;
        }

        /**
         * The bank account type.
         */
        public Builder bankAccountType(BankAccountType bankAccountType) {
            Utils.checkNotNull(bankAccountType, "bankAccountType");
            this.bankAccountType = bankAccountType;
            return this;
        }

        public Builder routingNumber(String routingNumber) {
            Utils.checkNotNull(routingNumber, "routingNumber");
            this.routingNumber = routingNumber;
            return this;
        }

        public Builder lastFourAccountNumber(String lastFourAccountNumber) {
            Utils.checkNotNull(lastFourAccountNumber, "lastFourAccountNumber");
            this.lastFourAccountNumber = lastFourAccountNumber;
            return this;
        }

        public Builder updatedOn(OffsetDateTime updatedOn) {
            Utils.checkNotNull(updatedOn, "updatedOn");
            this.updatedOn = updatedOn;
            return this;
        }
        
        public PaymentMethodsBankAccount build() {
            return new PaymentMethodsBankAccount(
                bankAccountID,
                fingerprint,
                status,
                holderName,
                holderType,
                bankName,
                bankAccountType,
                routingNumber,
                lastFourAccountNumber,
                updatedOn);
        }
    }
}

