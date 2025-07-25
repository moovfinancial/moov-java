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


public class BankAccountVerificationCreated {

    @JsonProperty("verificationMethod")
    private BankAccountVerificationMethod verificationMethod;


    @JsonProperty("status")
    private BankAccountVerificationStatus status;

    @JsonCreator
    public BankAccountVerificationCreated(
            @JsonProperty("verificationMethod") BankAccountVerificationMethod verificationMethod,
            @JsonProperty("status") BankAccountVerificationStatus status) {
        Utils.checkNotNull(verificationMethod, "verificationMethod");
        Utils.checkNotNull(status, "status");
        this.verificationMethod = verificationMethod;
        this.status = status;
    }

    @JsonIgnore
    public BankAccountVerificationMethod verificationMethod() {
        return verificationMethod;
    }

    @JsonIgnore
    public BankAccountVerificationStatus status() {
        return status;
    }

    public static Builder builder() {
        return new Builder();
    }


    public BankAccountVerificationCreated withVerificationMethod(BankAccountVerificationMethod verificationMethod) {
        Utils.checkNotNull(verificationMethod, "verificationMethod");
        this.verificationMethod = verificationMethod;
        return this;
    }

    public BankAccountVerificationCreated withStatus(BankAccountVerificationStatus status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
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
        BankAccountVerificationCreated other = (BankAccountVerificationCreated) o;
        return 
            Utils.enhancedDeepEquals(this.verificationMethod, other.verificationMethod) &&
            Utils.enhancedDeepEquals(this.status, other.status);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            verificationMethod, status);
    }
    
    @Override
    public String toString() {
        return Utils.toString(BankAccountVerificationCreated.class,
                "verificationMethod", verificationMethod,
                "status", status);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private BankAccountVerificationMethod verificationMethod;

        private BankAccountVerificationStatus status;

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

        public BankAccountVerificationCreated build() {

            return new BankAccountVerificationCreated(
                verificationMethod, status);
        }

    }
}
