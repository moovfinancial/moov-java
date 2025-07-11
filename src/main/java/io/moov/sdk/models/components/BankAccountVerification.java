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
import java.util.Optional;


public class BankAccountVerification {

    @JsonProperty("verificationMethod")
    private BankAccountVerificationMethod verificationMethod;


    @JsonProperty("status")
    private BankAccountVerificationStatus status;

    /**
     * Reason for, and details related to, an `errored` or `verificationFailed` bank account status.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("exceptionDetails")
    private Optional<? extends BankAccountException> exceptionDetails;

    @JsonCreator
    public BankAccountVerification(
            @JsonProperty("verificationMethod") BankAccountVerificationMethod verificationMethod,
            @JsonProperty("status") BankAccountVerificationStatus status,
            @JsonProperty("exceptionDetails") Optional<? extends BankAccountException> exceptionDetails) {
        Utils.checkNotNull(verificationMethod, "verificationMethod");
        Utils.checkNotNull(status, "status");
        Utils.checkNotNull(exceptionDetails, "exceptionDetails");
        this.verificationMethod = verificationMethod;
        this.status = status;
        this.exceptionDetails = exceptionDetails;
    }
    
    public BankAccountVerification(
            BankAccountVerificationMethod verificationMethod,
            BankAccountVerificationStatus status) {
        this(verificationMethod, status, Optional.empty());
    }

    @JsonIgnore
    public BankAccountVerificationMethod verificationMethod() {
        return verificationMethod;
    }

    @JsonIgnore
    public BankAccountVerificationStatus status() {
        return status;
    }

    /**
     * Reason for, and details related to, an `errored` or `verificationFailed` bank account status.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<BankAccountException> exceptionDetails() {
        return (Optional<BankAccountException>) exceptionDetails;
    }

    public static Builder builder() {
        return new Builder();
    }


    public BankAccountVerification withVerificationMethod(BankAccountVerificationMethod verificationMethod) {
        Utils.checkNotNull(verificationMethod, "verificationMethod");
        this.verificationMethod = verificationMethod;
        return this;
    }

    public BankAccountVerification withStatus(BankAccountVerificationStatus status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
        return this;
    }

    /**
     * Reason for, and details related to, an `errored` or `verificationFailed` bank account status.
     */
    public BankAccountVerification withExceptionDetails(BankAccountException exceptionDetails) {
        Utils.checkNotNull(exceptionDetails, "exceptionDetails");
        this.exceptionDetails = Optional.ofNullable(exceptionDetails);
        return this;
    }


    /**
     * Reason for, and details related to, an `errored` or `verificationFailed` bank account status.
     */
    public BankAccountVerification withExceptionDetails(Optional<? extends BankAccountException> exceptionDetails) {
        Utils.checkNotNull(exceptionDetails, "exceptionDetails");
        this.exceptionDetails = exceptionDetails;
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
        BankAccountVerification other = (BankAccountVerification) o;
        return 
            Utils.enhancedDeepEquals(this.verificationMethod, other.verificationMethod) &&
            Utils.enhancedDeepEquals(this.status, other.status) &&
            Utils.enhancedDeepEquals(this.exceptionDetails, other.exceptionDetails);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            verificationMethod, status, exceptionDetails);
    }
    
    @Override
    public String toString() {
        return Utils.toString(BankAccountVerification.class,
                "verificationMethod", verificationMethod,
                "status", status,
                "exceptionDetails", exceptionDetails);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private BankAccountVerificationMethod verificationMethod;

        private BankAccountVerificationStatus status;

        private Optional<? extends BankAccountException> exceptionDetails = Optional.empty();

        private Builder() {
          // force use of static builder() method
        }


        public Builder verificationMethod(BankAccountVerificationMethod verificationMethod) {
            Utils.checkNotNull(verificationMethod, "verificationMethod");
            this.verificationMethod = verificationMethod;
            return this;
        }


        public Builder status(BankAccountVerificationStatus status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
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

        public BankAccountVerification build() {

            return new BankAccountVerification(
                verificationMethod, status, exceptionDetails);
        }

    }
}
