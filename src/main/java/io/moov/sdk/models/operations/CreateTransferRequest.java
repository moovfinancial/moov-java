/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package io.moov.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import io.moov.sdk.models.components.CreateTransfer;
import io.moov.sdk.models.components.TransferWaitFor;
import io.moov.sdk.utils.LazySingletonValue;
import io.moov.sdk.utils.SpeakeasyMetadata;
import io.moov.sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;

public class CreateTransferRequest {

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
     * Prevents duplicate transfers from being created.
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=x-idempotency-key")
    private String xIdempotencyKey;

    /**
     * Optional header that indicates whether to return a synchronous response that includes full transfer and rail-specific details or an 
     * asynchronous response indicating the transfer was created (this is the default response if the header is omitted). A timeout will occur after 15 seconds.
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=x-wait-for")
    private Optional<? extends TransferWaitFor> xWaitFor;

    /**
     * Your Moov account ID.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=accountID")
    private String accountID;

    @SpeakeasyMetadata("request:mediaType=application/json")
    private CreateTransfer createTransfer;

    @JsonCreator
    public CreateTransferRequest(
            Optional<String> xMoovVersion,
            String xIdempotencyKey,
            Optional<? extends TransferWaitFor> xWaitFor,
            String accountID,
            CreateTransfer createTransfer) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        Utils.checkNotNull(xIdempotencyKey, "xIdempotencyKey");
        Utils.checkNotNull(xWaitFor, "xWaitFor");
        Utils.checkNotNull(accountID, "accountID");
        Utils.checkNotNull(createTransfer, "createTransfer");
        this.xMoovVersion = xMoovVersion;
        this.xIdempotencyKey = xIdempotencyKey;
        this.xWaitFor = xWaitFor;
        this.accountID = accountID;
        this.createTransfer = createTransfer;
    }
    
    public CreateTransferRequest(
            String xIdempotencyKey,
            String accountID,
            CreateTransfer createTransfer) {
        this(Optional.empty(), xIdempotencyKey, Optional.empty(), accountID, createTransfer);
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
     * Prevents duplicate transfers from being created.
     */
    @JsonIgnore
    public String xIdempotencyKey() {
        return xIdempotencyKey;
    }

    /**
     * Optional header that indicates whether to return a synchronous response that includes full transfer and rail-specific details or an 
     * asynchronous response indicating the transfer was created (this is the default response if the header is omitted). A timeout will occur after 15 seconds.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<TransferWaitFor> xWaitFor() {
        return (Optional<TransferWaitFor>) xWaitFor;
    }

    /**
     * Your Moov account ID.
     */
    @JsonIgnore
    public String accountID() {
        return accountID;
    }

    @JsonIgnore
    public CreateTransfer createTransfer() {
        return createTransfer;
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
    public CreateTransferRequest withXMoovVersion(String xMoovVersion) {
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
    public CreateTransferRequest withXMoovVersion(Optional<String> xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = xMoovVersion;
        return this;
    }

    /**
     * Prevents duplicate transfers from being created.
     */
    public CreateTransferRequest withXIdempotencyKey(String xIdempotencyKey) {
        Utils.checkNotNull(xIdempotencyKey, "xIdempotencyKey");
        this.xIdempotencyKey = xIdempotencyKey;
        return this;
    }

    /**
     * Optional header that indicates whether to return a synchronous response that includes full transfer and rail-specific details or an 
     * asynchronous response indicating the transfer was created (this is the default response if the header is omitted). A timeout will occur after 15 seconds.
     */
    public CreateTransferRequest withXWaitFor(TransferWaitFor xWaitFor) {
        Utils.checkNotNull(xWaitFor, "xWaitFor");
        this.xWaitFor = Optional.ofNullable(xWaitFor);
        return this;
    }

    /**
     * Optional header that indicates whether to return a synchronous response that includes full transfer and rail-specific details or an 
     * asynchronous response indicating the transfer was created (this is the default response if the header is omitted). A timeout will occur after 15 seconds.
     */
    public CreateTransferRequest withXWaitFor(Optional<? extends TransferWaitFor> xWaitFor) {
        Utils.checkNotNull(xWaitFor, "xWaitFor");
        this.xWaitFor = xWaitFor;
        return this;
    }

    /**
     * Your Moov account ID.
     */
    public CreateTransferRequest withAccountID(String accountID) {
        Utils.checkNotNull(accountID, "accountID");
        this.accountID = accountID;
        return this;
    }

    public CreateTransferRequest withCreateTransfer(CreateTransfer createTransfer) {
        Utils.checkNotNull(createTransfer, "createTransfer");
        this.createTransfer = createTransfer;
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
        CreateTransferRequest other = (CreateTransferRequest) o;
        return 
            Objects.deepEquals(this.xMoovVersion, other.xMoovVersion) &&
            Objects.deepEquals(this.xIdempotencyKey, other.xIdempotencyKey) &&
            Objects.deepEquals(this.xWaitFor, other.xWaitFor) &&
            Objects.deepEquals(this.accountID, other.accountID) &&
            Objects.deepEquals(this.createTransfer, other.createTransfer);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            xMoovVersion,
            xIdempotencyKey,
            xWaitFor,
            accountID,
            createTransfer);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateTransferRequest.class,
                "xMoovVersion", xMoovVersion,
                "xIdempotencyKey", xIdempotencyKey,
                "xWaitFor", xWaitFor,
                "accountID", accountID,
                "createTransfer", createTransfer);
    }
    
    public final static class Builder {
 
        private Optional<String> xMoovVersion;
 
        private String xIdempotencyKey;
 
        private Optional<? extends TransferWaitFor> xWaitFor = Optional.empty();
 
        private String accountID;
 
        private CreateTransfer createTransfer;
        
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
         * Prevents duplicate transfers from being created.
         */
        public Builder xIdempotencyKey(String xIdempotencyKey) {
            Utils.checkNotNull(xIdempotencyKey, "xIdempotencyKey");
            this.xIdempotencyKey = xIdempotencyKey;
            return this;
        }

        /**
         * Optional header that indicates whether to return a synchronous response that includes full transfer and rail-specific details or an 
         * asynchronous response indicating the transfer was created (this is the default response if the header is omitted). A timeout will occur after 15 seconds.
         */
        public Builder xWaitFor(TransferWaitFor xWaitFor) {
            Utils.checkNotNull(xWaitFor, "xWaitFor");
            this.xWaitFor = Optional.ofNullable(xWaitFor);
            return this;
        }

        /**
         * Optional header that indicates whether to return a synchronous response that includes full transfer and rail-specific details or an 
         * asynchronous response indicating the transfer was created (this is the default response if the header is omitted). A timeout will occur after 15 seconds.
         */
        public Builder xWaitFor(Optional<? extends TransferWaitFor> xWaitFor) {
            Utils.checkNotNull(xWaitFor, "xWaitFor");
            this.xWaitFor = xWaitFor;
            return this;
        }

        /**
         * Your Moov account ID.
         */
        public Builder accountID(String accountID) {
            Utils.checkNotNull(accountID, "accountID");
            this.accountID = accountID;
            return this;
        }

        public Builder createTransfer(CreateTransfer createTransfer) {
            Utils.checkNotNull(createTransfer, "createTransfer");
            this.createTransfer = createTransfer;
            return this;
        }
        
        public CreateTransferRequest build() {
            if (xMoovVersion == null) {
                xMoovVersion = _SINGLETON_VALUE_XMoovVersion.value();
            }
            return new CreateTransferRequest(
                xMoovVersion,
                xIdempotencyKey,
                xWaitFor,
                accountID,
                createTransfer);
        }

        private static final LazySingletonValue<Optional<String>> _SINGLETON_VALUE_XMoovVersion =
                new LazySingletonValue<>(
                        "x-moov-version",
                        "\"v2024.01.00\"",
                        new TypeReference<Optional<String>>() {});
    }
}
