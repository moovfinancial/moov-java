/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package io.moov.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import io.moov.sdk.models.components.TransferStatus;
import io.moov.sdk.utils.LazySingletonValue;
import io.moov.sdk.utils.SpeakeasyMetadata;
import io.moov.sdk.utils.Utils;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class ListTransfersRequest {

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
     * Optional, comma-separated account IDs by which the response is filtered based on whether the account ID is the source or destination.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=accountIDs")
    private Optional<? extends List<String>> accountIDs;

    /**
     * Optional parameter for filtering transfers by status.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=status")
    private Optional<? extends TransferStatus> status;

    /**
     * Optional date-time which inclusively filters all transfers created after this date-time.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=startDateTime")
    private Optional<OffsetDateTime> startDateTime;

    /**
     * Optional date-time which exclusively filters all transfers created before this date-time.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=endDateTime")
    private Optional<OffsetDateTime> endDateTime;

    /**
     * Optional ID to filter for transfers in the same group.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=groupID")
    private Optional<String> groupID;

    /**
     * Optional parameter to only return refunded transfers.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=refunded")
    private Optional<Boolean> refunded;

    /**
     * Optional parameter to only return disputed transfers.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=disputed")
    private Optional<Boolean> disputed;

    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=skip")
    private Optional<Long> skip;

    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=count")
    private Optional<Long> count;

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=accountID")
    private String accountID;

    @JsonCreator
    public ListTransfersRequest(
            Optional<String> xMoovVersion,
            Optional<? extends List<String>> accountIDs,
            Optional<? extends TransferStatus> status,
            Optional<OffsetDateTime> startDateTime,
            Optional<OffsetDateTime> endDateTime,
            Optional<String> groupID,
            Optional<Boolean> refunded,
            Optional<Boolean> disputed,
            Optional<Long> skip,
            Optional<Long> count,
            String accountID) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        Utils.checkNotNull(accountIDs, "accountIDs");
        Utils.checkNotNull(status, "status");
        Utils.checkNotNull(startDateTime, "startDateTime");
        Utils.checkNotNull(endDateTime, "endDateTime");
        Utils.checkNotNull(groupID, "groupID");
        Utils.checkNotNull(refunded, "refunded");
        Utils.checkNotNull(disputed, "disputed");
        Utils.checkNotNull(skip, "skip");
        Utils.checkNotNull(count, "count");
        Utils.checkNotNull(accountID, "accountID");
        this.xMoovVersion = xMoovVersion;
        this.accountIDs = accountIDs;
        this.status = status;
        this.startDateTime = startDateTime;
        this.endDateTime = endDateTime;
        this.groupID = groupID;
        this.refunded = refunded;
        this.disputed = disputed;
        this.skip = skip;
        this.count = count;
        this.accountID = accountID;
    }
    
    public ListTransfersRequest(
            String accountID) {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), accountID);
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
     * Optional, comma-separated account IDs by which the response is filtered based on whether the account ID is the source or destination.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<String>> accountIDs() {
        return (Optional<List<String>>) accountIDs;
    }

    /**
     * Optional parameter for filtering transfers by status.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<TransferStatus> status() {
        return (Optional<TransferStatus>) status;
    }

    /**
     * Optional date-time which inclusively filters all transfers created after this date-time.
     */
    @JsonIgnore
    public Optional<OffsetDateTime> startDateTime() {
        return startDateTime;
    }

    /**
     * Optional date-time which exclusively filters all transfers created before this date-time.
     */
    @JsonIgnore
    public Optional<OffsetDateTime> endDateTime() {
        return endDateTime;
    }

    /**
     * Optional ID to filter for transfers in the same group.
     */
    @JsonIgnore
    public Optional<String> groupID() {
        return groupID;
    }

    /**
     * Optional parameter to only return refunded transfers.
     */
    @JsonIgnore
    public Optional<Boolean> refunded() {
        return refunded;
    }

    /**
     * Optional parameter to only return disputed transfers.
     */
    @JsonIgnore
    public Optional<Boolean> disputed() {
        return disputed;
    }

    @JsonIgnore
    public Optional<Long> skip() {
        return skip;
    }

    @JsonIgnore
    public Optional<Long> count() {
        return count;
    }

    @JsonIgnore
    public String accountID() {
        return accountID;
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
    public ListTransfersRequest withXMoovVersion(String xMoovVersion) {
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
    public ListTransfersRequest withXMoovVersion(Optional<String> xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = xMoovVersion;
        return this;
    }

    /**
     * Optional, comma-separated account IDs by which the response is filtered based on whether the account ID is the source or destination.
     */
    public ListTransfersRequest withAccountIDs(List<String> accountIDs) {
        Utils.checkNotNull(accountIDs, "accountIDs");
        this.accountIDs = Optional.ofNullable(accountIDs);
        return this;
    }

    /**
     * Optional, comma-separated account IDs by which the response is filtered based on whether the account ID is the source or destination.
     */
    public ListTransfersRequest withAccountIDs(Optional<? extends List<String>> accountIDs) {
        Utils.checkNotNull(accountIDs, "accountIDs");
        this.accountIDs = accountIDs;
        return this;
    }

    /**
     * Optional parameter for filtering transfers by status.
     */
    public ListTransfersRequest withStatus(TransferStatus status) {
        Utils.checkNotNull(status, "status");
        this.status = Optional.ofNullable(status);
        return this;
    }

    /**
     * Optional parameter for filtering transfers by status.
     */
    public ListTransfersRequest withStatus(Optional<? extends TransferStatus> status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
        return this;
    }

    /**
     * Optional date-time which inclusively filters all transfers created after this date-time.
     */
    public ListTransfersRequest withStartDateTime(OffsetDateTime startDateTime) {
        Utils.checkNotNull(startDateTime, "startDateTime");
        this.startDateTime = Optional.ofNullable(startDateTime);
        return this;
    }

    /**
     * Optional date-time which inclusively filters all transfers created after this date-time.
     */
    public ListTransfersRequest withStartDateTime(Optional<OffsetDateTime> startDateTime) {
        Utils.checkNotNull(startDateTime, "startDateTime");
        this.startDateTime = startDateTime;
        return this;
    }

    /**
     * Optional date-time which exclusively filters all transfers created before this date-time.
     */
    public ListTransfersRequest withEndDateTime(OffsetDateTime endDateTime) {
        Utils.checkNotNull(endDateTime, "endDateTime");
        this.endDateTime = Optional.ofNullable(endDateTime);
        return this;
    }

    /**
     * Optional date-time which exclusively filters all transfers created before this date-time.
     */
    public ListTransfersRequest withEndDateTime(Optional<OffsetDateTime> endDateTime) {
        Utils.checkNotNull(endDateTime, "endDateTime");
        this.endDateTime = endDateTime;
        return this;
    }

    /**
     * Optional ID to filter for transfers in the same group.
     */
    public ListTransfersRequest withGroupID(String groupID) {
        Utils.checkNotNull(groupID, "groupID");
        this.groupID = Optional.ofNullable(groupID);
        return this;
    }

    /**
     * Optional ID to filter for transfers in the same group.
     */
    public ListTransfersRequest withGroupID(Optional<String> groupID) {
        Utils.checkNotNull(groupID, "groupID");
        this.groupID = groupID;
        return this;
    }

    /**
     * Optional parameter to only return refunded transfers.
     */
    public ListTransfersRequest withRefunded(boolean refunded) {
        Utils.checkNotNull(refunded, "refunded");
        this.refunded = Optional.ofNullable(refunded);
        return this;
    }

    /**
     * Optional parameter to only return refunded transfers.
     */
    public ListTransfersRequest withRefunded(Optional<Boolean> refunded) {
        Utils.checkNotNull(refunded, "refunded");
        this.refunded = refunded;
        return this;
    }

    /**
     * Optional parameter to only return disputed transfers.
     */
    public ListTransfersRequest withDisputed(boolean disputed) {
        Utils.checkNotNull(disputed, "disputed");
        this.disputed = Optional.ofNullable(disputed);
        return this;
    }

    /**
     * Optional parameter to only return disputed transfers.
     */
    public ListTransfersRequest withDisputed(Optional<Boolean> disputed) {
        Utils.checkNotNull(disputed, "disputed");
        this.disputed = disputed;
        return this;
    }

    public ListTransfersRequest withSkip(long skip) {
        Utils.checkNotNull(skip, "skip");
        this.skip = Optional.ofNullable(skip);
        return this;
    }

    public ListTransfersRequest withSkip(Optional<Long> skip) {
        Utils.checkNotNull(skip, "skip");
        this.skip = skip;
        return this;
    }

    public ListTransfersRequest withCount(long count) {
        Utils.checkNotNull(count, "count");
        this.count = Optional.ofNullable(count);
        return this;
    }

    public ListTransfersRequest withCount(Optional<Long> count) {
        Utils.checkNotNull(count, "count");
        this.count = count;
        return this;
    }

    public ListTransfersRequest withAccountID(String accountID) {
        Utils.checkNotNull(accountID, "accountID");
        this.accountID = accountID;
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
        ListTransfersRequest other = (ListTransfersRequest) o;
        return 
            Objects.deepEquals(this.xMoovVersion, other.xMoovVersion) &&
            Objects.deepEquals(this.accountIDs, other.accountIDs) &&
            Objects.deepEquals(this.status, other.status) &&
            Objects.deepEquals(this.startDateTime, other.startDateTime) &&
            Objects.deepEquals(this.endDateTime, other.endDateTime) &&
            Objects.deepEquals(this.groupID, other.groupID) &&
            Objects.deepEquals(this.refunded, other.refunded) &&
            Objects.deepEquals(this.disputed, other.disputed) &&
            Objects.deepEquals(this.skip, other.skip) &&
            Objects.deepEquals(this.count, other.count) &&
            Objects.deepEquals(this.accountID, other.accountID);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            xMoovVersion,
            accountIDs,
            status,
            startDateTime,
            endDateTime,
            groupID,
            refunded,
            disputed,
            skip,
            count,
            accountID);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ListTransfersRequest.class,
                "xMoovVersion", xMoovVersion,
                "accountIDs", accountIDs,
                "status", status,
                "startDateTime", startDateTime,
                "endDateTime", endDateTime,
                "groupID", groupID,
                "refunded", refunded,
                "disputed", disputed,
                "skip", skip,
                "count", count,
                "accountID", accountID);
    }
    
    public final static class Builder {
 
        private Optional<String> xMoovVersion;
 
        private Optional<? extends List<String>> accountIDs = Optional.empty();
 
        private Optional<? extends TransferStatus> status = Optional.empty();
 
        private Optional<OffsetDateTime> startDateTime = Optional.empty();
 
        private Optional<OffsetDateTime> endDateTime = Optional.empty();
 
        private Optional<String> groupID = Optional.empty();
 
        private Optional<Boolean> refunded = Optional.empty();
 
        private Optional<Boolean> disputed = Optional.empty();
 
        private Optional<Long> skip = Optional.empty();
 
        private Optional<Long> count = Optional.empty();
 
        private String accountID;
        
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
         * Optional, comma-separated account IDs by which the response is filtered based on whether the account ID is the source or destination.
         */
        public Builder accountIDs(List<String> accountIDs) {
            Utils.checkNotNull(accountIDs, "accountIDs");
            this.accountIDs = Optional.ofNullable(accountIDs);
            return this;
        }

        /**
         * Optional, comma-separated account IDs by which the response is filtered based on whether the account ID is the source or destination.
         */
        public Builder accountIDs(Optional<? extends List<String>> accountIDs) {
            Utils.checkNotNull(accountIDs, "accountIDs");
            this.accountIDs = accountIDs;
            return this;
        }

        /**
         * Optional parameter for filtering transfers by status.
         */
        public Builder status(TransferStatus status) {
            Utils.checkNotNull(status, "status");
            this.status = Optional.ofNullable(status);
            return this;
        }

        /**
         * Optional parameter for filtering transfers by status.
         */
        public Builder status(Optional<? extends TransferStatus> status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }

        /**
         * Optional date-time which inclusively filters all transfers created after this date-time.
         */
        public Builder startDateTime(OffsetDateTime startDateTime) {
            Utils.checkNotNull(startDateTime, "startDateTime");
            this.startDateTime = Optional.ofNullable(startDateTime);
            return this;
        }

        /**
         * Optional date-time which inclusively filters all transfers created after this date-time.
         */
        public Builder startDateTime(Optional<OffsetDateTime> startDateTime) {
            Utils.checkNotNull(startDateTime, "startDateTime");
            this.startDateTime = startDateTime;
            return this;
        }

        /**
         * Optional date-time which exclusively filters all transfers created before this date-time.
         */
        public Builder endDateTime(OffsetDateTime endDateTime) {
            Utils.checkNotNull(endDateTime, "endDateTime");
            this.endDateTime = Optional.ofNullable(endDateTime);
            return this;
        }

        /**
         * Optional date-time which exclusively filters all transfers created before this date-time.
         */
        public Builder endDateTime(Optional<OffsetDateTime> endDateTime) {
            Utils.checkNotNull(endDateTime, "endDateTime");
            this.endDateTime = endDateTime;
            return this;
        }

        /**
         * Optional ID to filter for transfers in the same group.
         */
        public Builder groupID(String groupID) {
            Utils.checkNotNull(groupID, "groupID");
            this.groupID = Optional.ofNullable(groupID);
            return this;
        }

        /**
         * Optional ID to filter for transfers in the same group.
         */
        public Builder groupID(Optional<String> groupID) {
            Utils.checkNotNull(groupID, "groupID");
            this.groupID = groupID;
            return this;
        }

        /**
         * Optional parameter to only return refunded transfers.
         */
        public Builder refunded(boolean refunded) {
            Utils.checkNotNull(refunded, "refunded");
            this.refunded = Optional.ofNullable(refunded);
            return this;
        }

        /**
         * Optional parameter to only return refunded transfers.
         */
        public Builder refunded(Optional<Boolean> refunded) {
            Utils.checkNotNull(refunded, "refunded");
            this.refunded = refunded;
            return this;
        }

        /**
         * Optional parameter to only return disputed transfers.
         */
        public Builder disputed(boolean disputed) {
            Utils.checkNotNull(disputed, "disputed");
            this.disputed = Optional.ofNullable(disputed);
            return this;
        }

        /**
         * Optional parameter to only return disputed transfers.
         */
        public Builder disputed(Optional<Boolean> disputed) {
            Utils.checkNotNull(disputed, "disputed");
            this.disputed = disputed;
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

        public Builder accountID(String accountID) {
            Utils.checkNotNull(accountID, "accountID");
            this.accountID = accountID;
            return this;
        }
        
        public ListTransfersRequest build() {
            if (xMoovVersion == null) {
                xMoovVersion = _SINGLETON_VALUE_XMoovVersion.value();
            }
            return new ListTransfersRequest(
                xMoovVersion,
                accountIDs,
                status,
                startDateTime,
                endDateTime,
                groupID,
                refunded,
                disputed,
                skip,
                count,
                accountID);
        }

        private static final LazySingletonValue<Optional<String>> _SINGLETON_VALUE_XMoovVersion =
                new LazySingletonValue<>(
                        "x-moov-version",
                        "\"v2024.01.00\"",
                        new TypeReference<Optional<String>>() {});
    }
}
