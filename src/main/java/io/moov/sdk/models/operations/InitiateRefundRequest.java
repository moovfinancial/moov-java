/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package io.moov.sdk.models.operations;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import io.moov.sdk.models.components.CreateRefund;
import io.moov.sdk.models.components.TransferWaitFor;
import io.moov.sdk.utils.LazySingletonValue;
import io.moov.sdk.utils.SpeakeasyMetadata;
import io.moov.sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;

public class InitiateRefundRequest {

    /**
     * Specify an API version.
     * 
     * API versioning follows the format `vYYYY.QQ.BB`, where 
     *   - `YYYY` is the year
     *   - `QQ` is the two-digit month for the first month of the quarter (e.g., 01, 04, 07, 10)
     *   - `BB` is the build number, starting at `.01`, for subsequent builds in the same quarter. 
     *     - For example, `v2024.01.00` is the initial release of the first quarter of 2024.
     * 
     * The `latest` version represents the most recent development state. It may include breaking changes and should be treated as a beta release.
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=x-moov-version")
    private Optional<String> xMoovVersion;

    /**
     * Prevents duplicate refunds from being created.
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=x-idempotency-key")
    private String xIdempotencyKey;

    /**
     * Optional header that indicates whether to return a synchronous response that includes full transfer and rail-specific details or an 
     * asynchronous response indicating the transfer was created (this is the default response if the header is omitted).
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=x-wait-for")
    private Optional<? extends TransferWaitFor> xWaitFor;

    /**
     * The merchant's Moov account ID.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=accountID")
    private String accountID;

    /**
     * Identifier for the transfer.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=transferID")
    private String transferID;

    @SpeakeasyMetadata("request:mediaType=application/json")
    private Optional<? extends CreateRefund> createRefund;

    @JsonCreator
    public InitiateRefundRequest(
            Optional<String> xMoovVersion,
            String xIdempotencyKey,
            Optional<? extends TransferWaitFor> xWaitFor,
            String accountID,
            String transferID,
            Optional<? extends CreateRefund> createRefund) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        Utils.checkNotNull(xIdempotencyKey, "xIdempotencyKey");
        Utils.checkNotNull(xWaitFor, "xWaitFor");
        Utils.checkNotNull(accountID, "accountID");
        Utils.checkNotNull(transferID, "transferID");
        Utils.checkNotNull(createRefund, "createRefund");
        this.xMoovVersion = xMoovVersion;
        this.xIdempotencyKey = xIdempotencyKey;
        this.xWaitFor = xWaitFor;
        this.accountID = accountID;
        this.transferID = transferID;
        this.createRefund = createRefund;
    }
    
    public InitiateRefundRequest(
            String xIdempotencyKey,
            String accountID,
            String transferID) {
        this(Optional.empty(), xIdempotencyKey, Optional.empty(), accountID, transferID, Optional.empty());
    }

    /**
     * Specify an API version.
     * 
     * API versioning follows the format `vYYYY.QQ.BB`, where 
     *   - `YYYY` is the year
     *   - `QQ` is the two-digit month for the first month of the quarter (e.g., 01, 04, 07, 10)
     *   - `BB` is the build number, starting at `.01`, for subsequent builds in the same quarter. 
     *     - For example, `v2024.01.00` is the initial release of the first quarter of 2024.
     * 
     * The `latest` version represents the most recent development state. It may include breaking changes and should be treated as a beta release.
     */
    @JsonIgnore
    public Optional<String> xMoovVersion() {
        return xMoovVersion;
    }

    /**
     * Prevents duplicate refunds from being created.
     */
    @JsonIgnore
    public String xIdempotencyKey() {
        return xIdempotencyKey;
    }

    /**
     * Optional header that indicates whether to return a synchronous response that includes full transfer and rail-specific details or an 
     * asynchronous response indicating the transfer was created (this is the default response if the header is omitted).
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<TransferWaitFor> xWaitFor() {
        return (Optional<TransferWaitFor>) xWaitFor;
    }

    /**
     * The merchant's Moov account ID.
     */
    @JsonIgnore
    public String accountID() {
        return accountID;
    }

    /**
     * Identifier for the transfer.
     */
    @JsonIgnore
    public String transferID() {
        return transferID;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<CreateRefund> createRefund() {
        return (Optional<CreateRefund>) createRefund;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Specify an API version.
     * 
     * API versioning follows the format `vYYYY.QQ.BB`, where 
     *   - `YYYY` is the year
     *   - `QQ` is the two-digit month for the first month of the quarter (e.g., 01, 04, 07, 10)
     *   - `BB` is the build number, starting at `.01`, for subsequent builds in the same quarter. 
     *     - For example, `v2024.01.00` is the initial release of the first quarter of 2024.
     * 
     * The `latest` version represents the most recent development state. It may include breaking changes and should be treated as a beta release.
     */
    public InitiateRefundRequest withXMoovVersion(String xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = Optional.ofNullable(xMoovVersion);
        return this;
    }

    /**
     * Specify an API version.
     * 
     * API versioning follows the format `vYYYY.QQ.BB`, where 
     *   - `YYYY` is the year
     *   - `QQ` is the two-digit month for the first month of the quarter (e.g., 01, 04, 07, 10)
     *   - `BB` is the build number, starting at `.01`, for subsequent builds in the same quarter. 
     *     - For example, `v2024.01.00` is the initial release of the first quarter of 2024.
     * 
     * The `latest` version represents the most recent development state. It may include breaking changes and should be treated as a beta release.
     */
    public InitiateRefundRequest withXMoovVersion(Optional<String> xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = xMoovVersion;
        return this;
    }

    /**
     * Prevents duplicate refunds from being created.
     */
    public InitiateRefundRequest withXIdempotencyKey(String xIdempotencyKey) {
        Utils.checkNotNull(xIdempotencyKey, "xIdempotencyKey");
        this.xIdempotencyKey = xIdempotencyKey;
        return this;
    }

    /**
     * Optional header that indicates whether to return a synchronous response that includes full transfer and rail-specific details or an 
     * asynchronous response indicating the transfer was created (this is the default response if the header is omitted).
     */
    public InitiateRefundRequest withXWaitFor(TransferWaitFor xWaitFor) {
        Utils.checkNotNull(xWaitFor, "xWaitFor");
        this.xWaitFor = Optional.ofNullable(xWaitFor);
        return this;
    }

    /**
     * Optional header that indicates whether to return a synchronous response that includes full transfer and rail-specific details or an 
     * asynchronous response indicating the transfer was created (this is the default response if the header is omitted).
     */
    public InitiateRefundRequest withXWaitFor(Optional<? extends TransferWaitFor> xWaitFor) {
        Utils.checkNotNull(xWaitFor, "xWaitFor");
        this.xWaitFor = xWaitFor;
        return this;
    }

    /**
     * The merchant's Moov account ID.
     */
    public InitiateRefundRequest withAccountID(String accountID) {
        Utils.checkNotNull(accountID, "accountID");
        this.accountID = accountID;
        return this;
    }

    /**
     * Identifier for the transfer.
     */
    public InitiateRefundRequest withTransferID(String transferID) {
        Utils.checkNotNull(transferID, "transferID");
        this.transferID = transferID;
        return this;
    }

    public InitiateRefundRequest withCreateRefund(CreateRefund createRefund) {
        Utils.checkNotNull(createRefund, "createRefund");
        this.createRefund = Optional.ofNullable(createRefund);
        return this;
    }

    public InitiateRefundRequest withCreateRefund(Optional<? extends CreateRefund> createRefund) {
        Utils.checkNotNull(createRefund, "createRefund");
        this.createRefund = createRefund;
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
        InitiateRefundRequest other = (InitiateRefundRequest) o;
        return 
            Objects.deepEquals(this.xMoovVersion, other.xMoovVersion) &&
            Objects.deepEquals(this.xIdempotencyKey, other.xIdempotencyKey) &&
            Objects.deepEquals(this.xWaitFor, other.xWaitFor) &&
            Objects.deepEquals(this.accountID, other.accountID) &&
            Objects.deepEquals(this.transferID, other.transferID) &&
            Objects.deepEquals(this.createRefund, other.createRefund);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            xMoovVersion,
            xIdempotencyKey,
            xWaitFor,
            accountID,
            transferID,
            createRefund);
    }
    
    @Override
    public String toString() {
        return Utils.toString(InitiateRefundRequest.class,
                "xMoovVersion", xMoovVersion,
                "xIdempotencyKey", xIdempotencyKey,
                "xWaitFor", xWaitFor,
                "accountID", accountID,
                "transferID", transferID,
                "createRefund", createRefund);
    }
    
    public final static class Builder {
 
        private Optional<String> xMoovVersion;
 
        private String xIdempotencyKey;
 
        private Optional<? extends TransferWaitFor> xWaitFor = Optional.empty();
 
        private String accountID;
 
        private String transferID;
 
        private Optional<? extends CreateRefund> createRefund = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Specify an API version.
         * 
         * API versioning follows the format `vYYYY.QQ.BB`, where 
         *   - `YYYY` is the year
         *   - `QQ` is the two-digit month for the first month of the quarter (e.g., 01, 04, 07, 10)
         *   - `BB` is the build number, starting at `.01`, for subsequent builds in the same quarter. 
         *     - For example, `v2024.01.00` is the initial release of the first quarter of 2024.
         * 
         * The `latest` version represents the most recent development state. It may include breaking changes and should be treated as a beta release.
         */
        public Builder xMoovVersion(String xMoovVersion) {
            Utils.checkNotNull(xMoovVersion, "xMoovVersion");
            this.xMoovVersion = Optional.ofNullable(xMoovVersion);
            return this;
        }

        /**
         * Specify an API version.
         * 
         * API versioning follows the format `vYYYY.QQ.BB`, where 
         *   - `YYYY` is the year
         *   - `QQ` is the two-digit month for the first month of the quarter (e.g., 01, 04, 07, 10)
         *   - `BB` is the build number, starting at `.01`, for subsequent builds in the same quarter. 
         *     - For example, `v2024.01.00` is the initial release of the first quarter of 2024.
         * 
         * The `latest` version represents the most recent development state. It may include breaking changes and should be treated as a beta release.
         */
        public Builder xMoovVersion(Optional<String> xMoovVersion) {
            Utils.checkNotNull(xMoovVersion, "xMoovVersion");
            this.xMoovVersion = xMoovVersion;
            return this;
        }

        /**
         * Prevents duplicate refunds from being created.
         */
        public Builder xIdempotencyKey(String xIdempotencyKey) {
            Utils.checkNotNull(xIdempotencyKey, "xIdempotencyKey");
            this.xIdempotencyKey = xIdempotencyKey;
            return this;
        }

        /**
         * Optional header that indicates whether to return a synchronous response that includes full transfer and rail-specific details or an 
         * asynchronous response indicating the transfer was created (this is the default response if the header is omitted).
         */
        public Builder xWaitFor(TransferWaitFor xWaitFor) {
            Utils.checkNotNull(xWaitFor, "xWaitFor");
            this.xWaitFor = Optional.ofNullable(xWaitFor);
            return this;
        }

        /**
         * Optional header that indicates whether to return a synchronous response that includes full transfer and rail-specific details or an 
         * asynchronous response indicating the transfer was created (this is the default response if the header is omitted).
         */
        public Builder xWaitFor(Optional<? extends TransferWaitFor> xWaitFor) {
            Utils.checkNotNull(xWaitFor, "xWaitFor");
            this.xWaitFor = xWaitFor;
            return this;
        }

        /**
         * The merchant's Moov account ID.
         */
        public Builder accountID(String accountID) {
            Utils.checkNotNull(accountID, "accountID");
            this.accountID = accountID;
            return this;
        }

        /**
         * Identifier for the transfer.
         */
        public Builder transferID(String transferID) {
            Utils.checkNotNull(transferID, "transferID");
            this.transferID = transferID;
            return this;
        }

        public Builder createRefund(CreateRefund createRefund) {
            Utils.checkNotNull(createRefund, "createRefund");
            this.createRefund = Optional.ofNullable(createRefund);
            return this;
        }

        public Builder createRefund(Optional<? extends CreateRefund> createRefund) {
            Utils.checkNotNull(createRefund, "createRefund");
            this.createRefund = createRefund;
            return this;
        }
        
        public InitiateRefundRequest build() {
            if (xMoovVersion == null) {
                xMoovVersion = _SINGLETON_VALUE_XMoovVersion.value();
            }            return new InitiateRefundRequest(
                xMoovVersion,
                xIdempotencyKey,
                xWaitFor,
                accountID,
                transferID,
                createRefund);
        }

        private static final LazySingletonValue<Optional<String>> _SINGLETON_VALUE_XMoovVersion =
                new LazySingletonValue<>(
                        "x-moov-version",
                        "\"v2024.01.00\"",
                        new TypeReference<Optional<String>>() {});
    }
}

