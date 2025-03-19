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
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * BankAccount - Describes a bank account linked to a Moov account.
 */

public class BankAccount {

    @JsonProperty("bankAccountID")
    private String bankAccountID;

    /**
     * Once the bank account is linked, we don't reveal the full bank account number. 
     * 
     * The fingerprint acts as a way to identify whether two linked bank accounts are the same.
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

    /**
     * The reason the bank account status changed to the current value.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("statusReason")
    private Optional<? extends BankAccountStatusReason> statusReason;

    /**
     * Reason for, and details related to, an `errored` or `verificationFailed` bank account status.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("exceptionDetails")
    private Optional<? extends BankAccountException> exceptionDetails;

    /**
     * Includes any payment methods generated for a newly created bank account, removing the need to
     * call the List Payment Methods endpoint following a successful Create BankAccount request.
     * 
     * **NOTE: This field is only populated for Create BankAccount requests made with the `X-Wait-For` header.**
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("paymentMethods")
    private Optional<? extends List<BasicPaymentMethod>> paymentMethods;

    @JsonCreator
    public BankAccount(
            @JsonProperty("bankAccountID") String bankAccountID,
            @JsonProperty("fingerprint") String fingerprint,
            @JsonProperty("status") BankAccountStatus status,
            @JsonProperty("holderName") String holderName,
            @JsonProperty("holderType") BankAccountHolderType holderType,
            @JsonProperty("bankName") String bankName,
            @JsonProperty("bankAccountType") BankAccountType bankAccountType,
            @JsonProperty("routingNumber") String routingNumber,
            @JsonProperty("lastFourAccountNumber") String lastFourAccountNumber,
            @JsonProperty("updatedOn") OffsetDateTime updatedOn,
            @JsonProperty("statusReason") Optional<? extends BankAccountStatusReason> statusReason,
            @JsonProperty("exceptionDetails") Optional<? extends BankAccountException> exceptionDetails,
            @JsonProperty("paymentMethods") Optional<? extends List<BasicPaymentMethod>> paymentMethods) {
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
        Utils.checkNotNull(statusReason, "statusReason");
        Utils.checkNotNull(exceptionDetails, "exceptionDetails");
        Utils.checkNotNull(paymentMethods, "paymentMethods");
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
        this.statusReason = statusReason;
        this.exceptionDetails = exceptionDetails;
        this.paymentMethods = paymentMethods;
    }
    
    public BankAccount(
            String bankAccountID,
            String fingerprint,
            BankAccountStatus status,
            String holderName,
            BankAccountHolderType holderType,
            String bankName,
            BankAccountType bankAccountType,
            String routingNumber,
            String lastFourAccountNumber,
            OffsetDateTime updatedOn) {
        this(bankAccountID, fingerprint, status, holderName, holderType, bankName, bankAccountType, routingNumber, lastFourAccountNumber, updatedOn, Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public String bankAccountID() {
        return bankAccountID;
    }

    /**
     * Once the bank account is linked, we don't reveal the full bank account number. 
     * 
     * The fingerprint acts as a way to identify whether two linked bank accounts are the same.
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

    /**
     * The reason the bank account status changed to the current value.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<BankAccountStatusReason> statusReason() {
        return (Optional<BankAccountStatusReason>) statusReason;
    }

    /**
     * Reason for, and details related to, an `errored` or `verificationFailed` bank account status.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<BankAccountException> exceptionDetails() {
        return (Optional<BankAccountException>) exceptionDetails;
    }

    /**
     * Includes any payment methods generated for a newly created bank account, removing the need to
     * call the List Payment Methods endpoint following a successful Create BankAccount request.
     * 
     * **NOTE: This field is only populated for Create BankAccount requests made with the `X-Wait-For` header.**
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<BasicPaymentMethod>> paymentMethods() {
        return (Optional<List<BasicPaymentMethod>>) paymentMethods;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public BankAccount withBankAccountID(String bankAccountID) {
        Utils.checkNotNull(bankAccountID, "bankAccountID");
        this.bankAccountID = bankAccountID;
        return this;
    }

    /**
     * Once the bank account is linked, we don't reveal the full bank account number. 
     * 
     * The fingerprint acts as a way to identify whether two linked bank accounts are the same.
     */
    public BankAccount withFingerprint(String fingerprint) {
        Utils.checkNotNull(fingerprint, "fingerprint");
        this.fingerprint = fingerprint;
        return this;
    }

    public BankAccount withStatus(BankAccountStatus status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
        return this;
    }

    public BankAccount withHolderName(String holderName) {
        Utils.checkNotNull(holderName, "holderName");
        this.holderName = holderName;
        return this;
    }

    /**
     * The type of holder on a funding source.
     */
    public BankAccount withHolderType(BankAccountHolderType holderType) {
        Utils.checkNotNull(holderType, "holderType");
        this.holderType = holderType;
        return this;
    }

    public BankAccount withBankName(String bankName) {
        Utils.checkNotNull(bankName, "bankName");
        this.bankName = bankName;
        return this;
    }

    /**
     * The bank account type.
     */
    public BankAccount withBankAccountType(BankAccountType bankAccountType) {
        Utils.checkNotNull(bankAccountType, "bankAccountType");
        this.bankAccountType = bankAccountType;
        return this;
    }

    public BankAccount withRoutingNumber(String routingNumber) {
        Utils.checkNotNull(routingNumber, "routingNumber");
        this.routingNumber = routingNumber;
        return this;
    }

    public BankAccount withLastFourAccountNumber(String lastFourAccountNumber) {
        Utils.checkNotNull(lastFourAccountNumber, "lastFourAccountNumber");
        this.lastFourAccountNumber = lastFourAccountNumber;
        return this;
    }

    public BankAccount withUpdatedOn(OffsetDateTime updatedOn) {
        Utils.checkNotNull(updatedOn, "updatedOn");
        this.updatedOn = updatedOn;
        return this;
    }

    /**
     * The reason the bank account status changed to the current value.
     */
    public BankAccount withStatusReason(BankAccountStatusReason statusReason) {
        Utils.checkNotNull(statusReason, "statusReason");
        this.statusReason = Optional.ofNullable(statusReason);
        return this;
    }

    /**
     * The reason the bank account status changed to the current value.
     */
    public BankAccount withStatusReason(Optional<? extends BankAccountStatusReason> statusReason) {
        Utils.checkNotNull(statusReason, "statusReason");
        this.statusReason = statusReason;
        return this;
    }

    /**
     * Reason for, and details related to, an `errored` or `verificationFailed` bank account status.
     */
    public BankAccount withExceptionDetails(BankAccountException exceptionDetails) {
        Utils.checkNotNull(exceptionDetails, "exceptionDetails");
        this.exceptionDetails = Optional.ofNullable(exceptionDetails);
        return this;
    }

    /**
     * Reason for, and details related to, an `errored` or `verificationFailed` bank account status.
     */
    public BankAccount withExceptionDetails(Optional<? extends BankAccountException> exceptionDetails) {
        Utils.checkNotNull(exceptionDetails, "exceptionDetails");
        this.exceptionDetails = exceptionDetails;
        return this;
    }

    /**
     * Includes any payment methods generated for a newly created bank account, removing the need to
     * call the List Payment Methods endpoint following a successful Create BankAccount request.
     * 
     * **NOTE: This field is only populated for Create BankAccount requests made with the `X-Wait-For` header.**
     */
    public BankAccount withPaymentMethods(List<BasicPaymentMethod> paymentMethods) {
        Utils.checkNotNull(paymentMethods, "paymentMethods");
        this.paymentMethods = Optional.ofNullable(paymentMethods);
        return this;
    }

    /**
     * Includes any payment methods generated for a newly created bank account, removing the need to
     * call the List Payment Methods endpoint following a successful Create BankAccount request.
     * 
     * **NOTE: This field is only populated for Create BankAccount requests made with the `X-Wait-For` header.**
     */
    public BankAccount withPaymentMethods(Optional<? extends List<BasicPaymentMethod>> paymentMethods) {
        Utils.checkNotNull(paymentMethods, "paymentMethods");
        this.paymentMethods = paymentMethods;
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
        BankAccount other = (BankAccount) o;
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
            Objects.deepEquals(this.updatedOn, other.updatedOn) &&
            Objects.deepEquals(this.statusReason, other.statusReason) &&
            Objects.deepEquals(this.exceptionDetails, other.exceptionDetails) &&
            Objects.deepEquals(this.paymentMethods, other.paymentMethods);
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
            updatedOn,
            statusReason,
            exceptionDetails,
            paymentMethods);
    }
    
    @Override
    public String toString() {
        return Utils.toString(BankAccount.class,
                "bankAccountID", bankAccountID,
                "fingerprint", fingerprint,
                "status", status,
                "holderName", holderName,
                "holderType", holderType,
                "bankName", bankName,
                "bankAccountType", bankAccountType,
                "routingNumber", routingNumber,
                "lastFourAccountNumber", lastFourAccountNumber,
                "updatedOn", updatedOn,
                "statusReason", statusReason,
                "exceptionDetails", exceptionDetails,
                "paymentMethods", paymentMethods);
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
 
        private Optional<? extends BankAccountStatusReason> statusReason = Optional.empty();
 
        private Optional<? extends BankAccountException> exceptionDetails = Optional.empty();
 
        private Optional<? extends List<BasicPaymentMethod>> paymentMethods = Optional.empty();  
        
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
         * The fingerprint acts as a way to identify whether two linked bank accounts are the same.
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

        /**
         * The reason the bank account status changed to the current value.
         */
        public Builder statusReason(BankAccountStatusReason statusReason) {
            Utils.checkNotNull(statusReason, "statusReason");
            this.statusReason = Optional.ofNullable(statusReason);
            return this;
        }

        /**
         * The reason the bank account status changed to the current value.
         */
        public Builder statusReason(Optional<? extends BankAccountStatusReason> statusReason) {
            Utils.checkNotNull(statusReason, "statusReason");
            this.statusReason = statusReason;
            return this;
        }

        /**
         * Reason for, and details related to, an `errored` or `verificationFailed` bank account status.
         */
        public Builder exceptionDetails(BankAccountException exceptionDetails) {
            Utils.checkNotNull(exceptionDetails, "exceptionDetails");
            this.exceptionDetails = Optional.ofNullable(exceptionDetails);
            return this;
        }

        /**
         * Reason for, and details related to, an `errored` or `verificationFailed` bank account status.
         */
        public Builder exceptionDetails(Optional<? extends BankAccountException> exceptionDetails) {
            Utils.checkNotNull(exceptionDetails, "exceptionDetails");
            this.exceptionDetails = exceptionDetails;
            return this;
        }

        /**
         * Includes any payment methods generated for a newly created bank account, removing the need to
         * call the List Payment Methods endpoint following a successful Create BankAccount request.
         * 
         * **NOTE: This field is only populated for Create BankAccount requests made with the `X-Wait-For` header.**
         */
        public Builder paymentMethods(List<BasicPaymentMethod> paymentMethods) {
            Utils.checkNotNull(paymentMethods, "paymentMethods");
            this.paymentMethods = Optional.ofNullable(paymentMethods);
            return this;
        }

        /**
         * Includes any payment methods generated for a newly created bank account, removing the need to
         * call the List Payment Methods endpoint following a successful Create BankAccount request.
         * 
         * **NOTE: This field is only populated for Create BankAccount requests made with the `X-Wait-For` header.**
         */
        public Builder paymentMethods(Optional<? extends List<BasicPaymentMethod>> paymentMethods) {
            Utils.checkNotNull(paymentMethods, "paymentMethods");
            this.paymentMethods = paymentMethods;
            return this;
        }
        
        public BankAccount build() {
            return new BankAccount(
                bankAccountID,
                fingerprint,
                status,
                holderName,
                holderType,
                bankName,
                bankAccountType,
                routingNumber,
                lastFourAccountNumber,
                updatedOn,
                statusReason,
                exceptionDetails,
                paymentMethods);
        }
    }
}

