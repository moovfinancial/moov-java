/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.moov.sdk.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import io.moov.sdk.utils.LazySingletonValue;
import io.moov.sdk.utils.SpeakeasyMetadata;
import io.moov.sdk.utils.Utils;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;


public class RetrieveFeesRequest {

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

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=accountID")
    private String accountID;

    /**
     * Optional transfer ID to filter the results by.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=transferID")
    private Optional<String> transferID;

    /**
     * Optional dispute ID to filter the results by.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=disputeID")
    private Optional<String> disputeID;

    /**
     * Optional date-time to inclusively filter all fees created after this date-time.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=startDateTime")
    private Optional<String> startDateTime;

    /**
     * Optional date-time to exclusively filter all fees created before this date-time.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=endDateTime")
    private Optional<String> endDateTime;

    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=skip")
    private Optional<Long> skip;

    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=count")
    private Optional<Long> count;

    @JsonCreator
    public RetrieveFeesRequest(
            Optional<String> xMoovVersion,
            String accountID,
            Optional<String> transferID,
            Optional<String> disputeID,
            Optional<String> startDateTime,
            Optional<String> endDateTime,
            Optional<Long> skip,
            Optional<Long> count) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        Utils.checkNotNull(accountID, "accountID");
        Utils.checkNotNull(transferID, "transferID");
        Utils.checkNotNull(disputeID, "disputeID");
        Utils.checkNotNull(startDateTime, "startDateTime");
        Utils.checkNotNull(endDateTime, "endDateTime");
        Utils.checkNotNull(skip, "skip");
        Utils.checkNotNull(count, "count");
        this.xMoovVersion = xMoovVersion;
        this.accountID = accountID;
        this.transferID = transferID;
        this.disputeID = disputeID;
        this.startDateTime = startDateTime;
        this.endDateTime = endDateTime;
        this.skip = skip;
        this.count = count;
    }
    
    public RetrieveFeesRequest(
            String accountID) {
        this(Optional.empty(), accountID, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
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

    @JsonIgnore
    public String accountID() {
        return accountID;
    }

    /**
     * Optional transfer ID to filter the results by.
     */
    @JsonIgnore
    public Optional<String> transferID() {
        return transferID;
    }

    /**
     * Optional dispute ID to filter the results by.
     */
    @JsonIgnore
    public Optional<String> disputeID() {
        return disputeID;
    }

    /**
     * Optional date-time to inclusively filter all fees created after this date-time.
     */
    @JsonIgnore
    public Optional<String> startDateTime() {
        return startDateTime;
    }

    /**
     * Optional date-time to exclusively filter all fees created before this date-time.
     */
    @JsonIgnore
    public Optional<String> endDateTime() {
        return endDateTime;
    }

    @JsonIgnore
    public Optional<Long> skip() {
        return skip;
    }

    @JsonIgnore
    public Optional<Long> count() {
        return count;
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
    public RetrieveFeesRequest withXMoovVersion(String xMoovVersion) {
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
    public RetrieveFeesRequest withXMoovVersion(Optional<String> xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = xMoovVersion;
        return this;
    }

    public RetrieveFeesRequest withAccountID(String accountID) {
        Utils.checkNotNull(accountID, "accountID");
        this.accountID = accountID;
        return this;
    }

    /**
     * Optional transfer ID to filter the results by.
     */
    public RetrieveFeesRequest withTransferID(String transferID) {
        Utils.checkNotNull(transferID, "transferID");
        this.transferID = Optional.ofNullable(transferID);
        return this;
    }

    /**
     * Optional transfer ID to filter the results by.
     */
    public RetrieveFeesRequest withTransferID(Optional<String> transferID) {
        Utils.checkNotNull(transferID, "transferID");
        this.transferID = transferID;
        return this;
    }

    /**
     * Optional dispute ID to filter the results by.
     */
    public RetrieveFeesRequest withDisputeID(String disputeID) {
        Utils.checkNotNull(disputeID, "disputeID");
        this.disputeID = Optional.ofNullable(disputeID);
        return this;
    }

    /**
     * Optional dispute ID to filter the results by.
     */
    public RetrieveFeesRequest withDisputeID(Optional<String> disputeID) {
        Utils.checkNotNull(disputeID, "disputeID");
        this.disputeID = disputeID;
        return this;
    }

    /**
     * Optional date-time to inclusively filter all fees created after this date-time.
     */
    public RetrieveFeesRequest withStartDateTime(String startDateTime) {
        Utils.checkNotNull(startDateTime, "startDateTime");
        this.startDateTime = Optional.ofNullable(startDateTime);
        return this;
    }

    /**
     * Optional date-time to inclusively filter all fees created after this date-time.
     */
    public RetrieveFeesRequest withStartDateTime(Optional<String> startDateTime) {
        Utils.checkNotNull(startDateTime, "startDateTime");
        this.startDateTime = startDateTime;
        return this;
    }

    /**
     * Optional date-time to exclusively filter all fees created before this date-time.
     */
    public RetrieveFeesRequest withEndDateTime(String endDateTime) {
        Utils.checkNotNull(endDateTime, "endDateTime");
        this.endDateTime = Optional.ofNullable(endDateTime);
        return this;
    }

    /**
     * Optional date-time to exclusively filter all fees created before this date-time.
     */
    public RetrieveFeesRequest withEndDateTime(Optional<String> endDateTime) {
        Utils.checkNotNull(endDateTime, "endDateTime");
        this.endDateTime = endDateTime;
        return this;
    }

    public RetrieveFeesRequest withSkip(long skip) {
        Utils.checkNotNull(skip, "skip");
        this.skip = Optional.ofNullable(skip);
        return this;
    }

    public RetrieveFeesRequest withSkip(Optional<Long> skip) {
        Utils.checkNotNull(skip, "skip");
        this.skip = skip;
        return this;
    }

    public RetrieveFeesRequest withCount(long count) {
        Utils.checkNotNull(count, "count");
        this.count = Optional.ofNullable(count);
        return this;
    }

    public RetrieveFeesRequest withCount(Optional<Long> count) {
        Utils.checkNotNull(count, "count");
        this.count = count;
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
        RetrieveFeesRequest other = (RetrieveFeesRequest) o;
        return 
            Objects.deepEquals(this.xMoovVersion, other.xMoovVersion) &&
            Objects.deepEquals(this.accountID, other.accountID) &&
            Objects.deepEquals(this.transferID, other.transferID) &&
            Objects.deepEquals(this.disputeID, other.disputeID) &&
            Objects.deepEquals(this.startDateTime, other.startDateTime) &&
            Objects.deepEquals(this.endDateTime, other.endDateTime) &&
            Objects.deepEquals(this.skip, other.skip) &&
            Objects.deepEquals(this.count, other.count);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            xMoovVersion,
            accountID,
            transferID,
            disputeID,
            startDateTime,
            endDateTime,
            skip,
            count);
    }
    
    @Override
    public String toString() {
        return Utils.toString(RetrieveFeesRequest.class,
                "xMoovVersion", xMoovVersion,
                "accountID", accountID,
                "transferID", transferID,
                "disputeID", disputeID,
                "startDateTime", startDateTime,
                "endDateTime", endDateTime,
                "skip", skip,
                "count", count);
    }
    
    public final static class Builder {
 
        private Optional<String> xMoovVersion;
 
        private String accountID;
 
        private Optional<String> transferID = Optional.empty();
 
        private Optional<String> disputeID = Optional.empty();
 
        private Optional<String> startDateTime = Optional.empty();
 
        private Optional<String> endDateTime = Optional.empty();
 
        private Optional<Long> skip = Optional.empty();
 
        private Optional<Long> count = Optional.empty();  
        
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

        public Builder accountID(String accountID) {
            Utils.checkNotNull(accountID, "accountID");
            this.accountID = accountID;
            return this;
        }

        /**
         * Optional transfer ID to filter the results by.
         */
        public Builder transferID(String transferID) {
            Utils.checkNotNull(transferID, "transferID");
            this.transferID = Optional.ofNullable(transferID);
            return this;
        }

        /**
         * Optional transfer ID to filter the results by.
         */
        public Builder transferID(Optional<String> transferID) {
            Utils.checkNotNull(transferID, "transferID");
            this.transferID = transferID;
            return this;
        }

        /**
         * Optional dispute ID to filter the results by.
         */
        public Builder disputeID(String disputeID) {
            Utils.checkNotNull(disputeID, "disputeID");
            this.disputeID = Optional.ofNullable(disputeID);
            return this;
        }

        /**
         * Optional dispute ID to filter the results by.
         */
        public Builder disputeID(Optional<String> disputeID) {
            Utils.checkNotNull(disputeID, "disputeID");
            this.disputeID = disputeID;
            return this;
        }

        /**
         * Optional date-time to inclusively filter all fees created after this date-time.
         */
        public Builder startDateTime(String startDateTime) {
            Utils.checkNotNull(startDateTime, "startDateTime");
            this.startDateTime = Optional.ofNullable(startDateTime);
            return this;
        }

        /**
         * Optional date-time to inclusively filter all fees created after this date-time.
         */
        public Builder startDateTime(Optional<String> startDateTime) {
            Utils.checkNotNull(startDateTime, "startDateTime");
            this.startDateTime = startDateTime;
            return this;
        }

        /**
         * Optional date-time to exclusively filter all fees created before this date-time.
         */
        public Builder endDateTime(String endDateTime) {
            Utils.checkNotNull(endDateTime, "endDateTime");
            this.endDateTime = Optional.ofNullable(endDateTime);
            return this;
        }

        /**
         * Optional date-time to exclusively filter all fees created before this date-time.
         */
        public Builder endDateTime(Optional<String> endDateTime) {
            Utils.checkNotNull(endDateTime, "endDateTime");
            this.endDateTime = endDateTime;
            return this;
        }

        public Builder skip(long skip) {
            Utils.checkNotNull(skip, "skip");
            this.skip = Optional.ofNullable(skip);
            return this;
        }

        public Builder skip(Optional<Long> skip) {
            Utils.checkNotNull(skip, "skip");
            this.skip = skip;
            return this;
        }

        public Builder count(long count) {
            Utils.checkNotNull(count, "count");
            this.count = Optional.ofNullable(count);
            return this;
        }

        public Builder count(Optional<Long> count) {
            Utils.checkNotNull(count, "count");
            this.count = count;
            return this;
        }
        
        public RetrieveFeesRequest build() {
            if (xMoovVersion == null) {
                xMoovVersion = _SINGLETON_VALUE_XMoovVersion.value();
            }            return new RetrieveFeesRequest(
                xMoovVersion,
                accountID,
                transferID,
                disputeID,
                startDateTime,
                endDateTime,
                skip,
                count);
        }

        private static final LazySingletonValue<Optional<String>> _SINGLETON_VALUE_XMoovVersion =
                new LazySingletonValue<>(
                        "x-moov-version",
                        "\"v2024.01.00\"",
                        new TypeReference<Optional<String>>() {});
    }
}

