/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package io.moov.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import io.moov.sdk.models.components.BankAccountWaitFor;
import io.moov.sdk.utils.LazySingletonValue;
import io.moov.sdk.utils.SpeakeasyMetadata;
import io.moov.sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;

public class InitiateBankAccountVerificationRequest {

    /**
     * Specify an API version.
     * 
     * <p>API versioning follows the format `vYYYY.QQ.BB`, where 
     *   - `YYYY` is the year
     *   - `QQ` is the two-digit month for the first month of the quarter (e.g., 01, 04, 07, 10)
     *   - `BB` is the build number, starting at `.01`, for subsequent builds in the same quarter. 
     *     - For example, `v2024.01.00` is the initial release of the first quarter of 2024.
     * 
     * <p>The `latest` version represents the most recent development state. It may include breaking changes and should be treated as a beta release.
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=x-moov-version")
    private Optional<String> xMoovVersion;

    /**
     * Optional header to wait for certain events, such as the rail response, to occur before returning a response.
     * 
     * <p>When this header is set to `rail-response`, the endpoint will wait for a sent-credit or failed status from the payment rail.
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=x-wait-for")
    private Optional<? extends BankAccountWaitFor> xWaitFor;

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=accountID")
    private String accountID;

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=bankAccountID")
    private String bankAccountID;

    @JsonCreator
    public InitiateBankAccountVerificationRequest(
            Optional<String> xMoovVersion,
            Optional<? extends BankAccountWaitFor> xWaitFor,
            String accountID,
            String bankAccountID) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        Utils.checkNotNull(xWaitFor, "xWaitFor");
        Utils.checkNotNull(accountID, "accountID");
        Utils.checkNotNull(bankAccountID, "bankAccountID");
        this.xMoovVersion = xMoovVersion;
        this.xWaitFor = xWaitFor;
        this.accountID = accountID;
        this.bankAccountID = bankAccountID;
    }
    
    public InitiateBankAccountVerificationRequest(
            String accountID,
            String bankAccountID) {
        this(Optional.empty(), Optional.empty(), accountID, bankAccountID);
    }

    /**
     * Specify an API version.
     * 
     * <p>API versioning follows the format `vYYYY.QQ.BB`, where 
     *   - `YYYY` is the year
     *   - `QQ` is the two-digit month for the first month of the quarter (e.g., 01, 04, 07, 10)
     *   - `BB` is the build number, starting at `.01`, for subsequent builds in the same quarter. 
     *     - For example, `v2024.01.00` is the initial release of the first quarter of 2024.
     * 
     * <p>The `latest` version represents the most recent development state. It may include breaking changes and should be treated as a beta release.
     */
    @JsonIgnore
    public Optional<String> xMoovVersion() {
        return xMoovVersion;
    }

    /**
     * Optional header to wait for certain events, such as the rail response, to occur before returning a response.
     * 
     * <p>When this header is set to `rail-response`, the endpoint will wait for a sent-credit or failed status from the payment rail.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<BankAccountWaitFor> xWaitFor() {
        return (Optional<BankAccountWaitFor>) xWaitFor;
    }

    @JsonIgnore
    public String accountID() {
        return accountID;
    }

    @JsonIgnore
    public String bankAccountID() {
        return bankAccountID;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * Specify an API version.
     * 
     * <p>API versioning follows the format `vYYYY.QQ.BB`, where 
     *   - `YYYY` is the year
     *   - `QQ` is the two-digit month for the first month of the quarter (e.g., 01, 04, 07, 10)
     *   - `BB` is the build number, starting at `.01`, for subsequent builds in the same quarter. 
     *     - For example, `v2024.01.00` is the initial release of the first quarter of 2024.
     * 
     * <p>The `latest` version represents the most recent development state. It may include breaking changes and should be treated as a beta release.
     */
    public InitiateBankAccountVerificationRequest withXMoovVersion(String xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = Optional.ofNullable(xMoovVersion);
        return this;
    }

    /**
     * Specify an API version.
     * 
     * <p>API versioning follows the format `vYYYY.QQ.BB`, where 
     *   - `YYYY` is the year
     *   - `QQ` is the two-digit month for the first month of the quarter (e.g., 01, 04, 07, 10)
     *   - `BB` is the build number, starting at `.01`, for subsequent builds in the same quarter. 
     *     - For example, `v2024.01.00` is the initial release of the first quarter of 2024.
     * 
     * <p>The `latest` version represents the most recent development state. It may include breaking changes and should be treated as a beta release.
     */
    public InitiateBankAccountVerificationRequest withXMoovVersion(Optional<String> xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = xMoovVersion;
        return this;
    }

    /**
     * Optional header to wait for certain events, such as the rail response, to occur before returning a response.
     * 
     * <p>When this header is set to `rail-response`, the endpoint will wait for a sent-credit or failed status from the payment rail.
     */
    public InitiateBankAccountVerificationRequest withXWaitFor(BankAccountWaitFor xWaitFor) {
        Utils.checkNotNull(xWaitFor, "xWaitFor");
        this.xWaitFor = Optional.ofNullable(xWaitFor);
        return this;
    }

    /**
     * Optional header to wait for certain events, such as the rail response, to occur before returning a response.
     * 
     * <p>When this header is set to `rail-response`, the endpoint will wait for a sent-credit or failed status from the payment rail.
     */
    public InitiateBankAccountVerificationRequest withXWaitFor(Optional<? extends BankAccountWaitFor> xWaitFor) {
        Utils.checkNotNull(xWaitFor, "xWaitFor");
        this.xWaitFor = xWaitFor;
        return this;
    }

    public InitiateBankAccountVerificationRequest withAccountID(String accountID) {
        Utils.checkNotNull(accountID, "accountID");
        this.accountID = accountID;
        return this;
    }

    public InitiateBankAccountVerificationRequest withBankAccountID(String bankAccountID) {
        Utils.checkNotNull(bankAccountID, "bankAccountID");
        this.bankAccountID = bankAccountID;
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
        InitiateBankAccountVerificationRequest other = (InitiateBankAccountVerificationRequest) o;
        return 
            Objects.deepEquals(this.xMoovVersion, other.xMoovVersion) &&
            Objects.deepEquals(this.xWaitFor, other.xWaitFor) &&
            Objects.deepEquals(this.accountID, other.accountID) &&
            Objects.deepEquals(this.bankAccountID, other.bankAccountID);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            xMoovVersion,
            xWaitFor,
            accountID,
            bankAccountID);
    }
    
    @Override
    public String toString() {
        return Utils.toString(InitiateBankAccountVerificationRequest.class,
                "xMoovVersion", xMoovVersion,
                "xWaitFor", xWaitFor,
                "accountID", accountID,
                "bankAccountID", bankAccountID);
    }
    
    public final static class Builder {
 
        private Optional<String> xMoovVersion;
 
        private Optional<? extends BankAccountWaitFor> xWaitFor = Optional.empty();
 
        private String accountID;
 
        private String bankAccountID;
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Specify an API version.
         * 
         * <p>API versioning follows the format `vYYYY.QQ.BB`, where 
         *   - `YYYY` is the year
         *   - `QQ` is the two-digit month for the first month of the quarter (e.g., 01, 04, 07, 10)
         *   - `BB` is the build number, starting at `.01`, for subsequent builds in the same quarter. 
         *     - For example, `v2024.01.00` is the initial release of the first quarter of 2024.
         * 
         * <p>The `latest` version represents the most recent development state. It may include breaking changes and should be treated as a beta release.
         */
        public Builder xMoovVersion(String xMoovVersion) {
            Utils.checkNotNull(xMoovVersion, "xMoovVersion");
            this.xMoovVersion = Optional.ofNullable(xMoovVersion);
            return this;
        }

        /**
         * Specify an API version.
         * 
         * <p>API versioning follows the format `vYYYY.QQ.BB`, where 
         *   - `YYYY` is the year
         *   - `QQ` is the two-digit month for the first month of the quarter (e.g., 01, 04, 07, 10)
         *   - `BB` is the build number, starting at `.01`, for subsequent builds in the same quarter. 
         *     - For example, `v2024.01.00` is the initial release of the first quarter of 2024.
         * 
         * <p>The `latest` version represents the most recent development state. It may include breaking changes and should be treated as a beta release.
         */
        public Builder xMoovVersion(Optional<String> xMoovVersion) {
            Utils.checkNotNull(xMoovVersion, "xMoovVersion");
            this.xMoovVersion = xMoovVersion;
            return this;
        }

        /**
         * Optional header to wait for certain events, such as the rail response, to occur before returning a response.
         * 
         * <p>When this header is set to `rail-response`, the endpoint will wait for a sent-credit or failed status from the payment rail.
         */
        public Builder xWaitFor(BankAccountWaitFor xWaitFor) {
            Utils.checkNotNull(xWaitFor, "xWaitFor");
            this.xWaitFor = Optional.ofNullable(xWaitFor);
            return this;
        }

        /**
         * Optional header to wait for certain events, such as the rail response, to occur before returning a response.
         * 
         * <p>When this header is set to `rail-response`, the endpoint will wait for a sent-credit or failed status from the payment rail.
         */
        public Builder xWaitFor(Optional<? extends BankAccountWaitFor> xWaitFor) {
            Utils.checkNotNull(xWaitFor, "xWaitFor");
            this.xWaitFor = xWaitFor;
            return this;
        }

        public Builder accountID(String accountID) {
            Utils.checkNotNull(accountID, "accountID");
            this.accountID = accountID;
            return this;
        }

        public Builder bankAccountID(String bankAccountID) {
            Utils.checkNotNull(bankAccountID, "bankAccountID");
            this.bankAccountID = bankAccountID;
            return this;
        }
        
        public InitiateBankAccountVerificationRequest build() {
            if (xMoovVersion == null) {
                xMoovVersion = _SINGLETON_VALUE_XMoovVersion.value();
            }
            return new InitiateBankAccountVerificationRequest(
                xMoovVersion,
                xWaitFor,
                accountID,
                bankAccountID);
        }

        private static final LazySingletonValue<Optional<String>> _SINGLETON_VALUE_XMoovVersion =
                new LazySingletonValue<>(
                        "x-moov-version",
                        "\"v2024.01.00\"",
                        new TypeReference<Optional<String>>() {});
    }
}
