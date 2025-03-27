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
import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.Optional;

public class ListIssuedCardTransactionsRequest {

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
     * The Moov business account for which cards have been issued.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=accountID")
    private String accountID;

    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=skip")
    private Optional<Long> skip;

    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=count")
    private Optional<Long> count;

    /**
     * Optional ID of the issued card to filter results.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=issuedCardID")
    private Optional<String> issuedCardID;

    /**
     * Optional date-time which inclusively filters all card transactions created after this date-time.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=startDateTime")
    private Optional<OffsetDateTime> startDateTime;

    /**
     * Optional date-time which exclusively filters all card transactions created before this date-time.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=endDateTime")
    private Optional<OffsetDateTime> endDateTime;

    @JsonCreator
    public ListIssuedCardTransactionsRequest(
            Optional<String> xMoovVersion,
            String accountID,
            Optional<Long> skip,
            Optional<Long> count,
            Optional<String> issuedCardID,
            Optional<OffsetDateTime> startDateTime,
            Optional<OffsetDateTime> endDateTime) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        Utils.checkNotNull(accountID, "accountID");
        Utils.checkNotNull(skip, "skip");
        Utils.checkNotNull(count, "count");
        Utils.checkNotNull(issuedCardID, "issuedCardID");
        Utils.checkNotNull(startDateTime, "startDateTime");
        Utils.checkNotNull(endDateTime, "endDateTime");
        this.xMoovVersion = xMoovVersion;
        this.accountID = accountID;
        this.skip = skip;
        this.count = count;
        this.issuedCardID = issuedCardID;
        this.startDateTime = startDateTime;
        this.endDateTime = endDateTime;
    }
    
    public ListIssuedCardTransactionsRequest(
            String accountID) {
        this(Optional.empty(), accountID, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
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
     * The Moov business account for which cards have been issued.
     */
    @JsonIgnore
    public String accountID() {
        return accountID;
    }

    @JsonIgnore
    public Optional<Long> skip() {
        return skip;
    }

    @JsonIgnore
    public Optional<Long> count() {
        return count;
    }

    /**
     * Optional ID of the issued card to filter results.
     */
    @JsonIgnore
    public Optional<String> issuedCardID() {
        return issuedCardID;
    }

    /**
     * Optional date-time which inclusively filters all card transactions created after this date-time.
     */
    @JsonIgnore
    public Optional<OffsetDateTime> startDateTime() {
        return startDateTime;
    }

    /**
     * Optional date-time which exclusively filters all card transactions created before this date-time.
     */
    @JsonIgnore
    public Optional<OffsetDateTime> endDateTime() {
        return endDateTime;
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
    public ListIssuedCardTransactionsRequest withXMoovVersion(String xMoovVersion) {
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
    public ListIssuedCardTransactionsRequest withXMoovVersion(Optional<String> xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = xMoovVersion;
        return this;
    }

    /**
     * The Moov business account for which cards have been issued.
     */
    public ListIssuedCardTransactionsRequest withAccountID(String accountID) {
        Utils.checkNotNull(accountID, "accountID");
        this.accountID = accountID;
        return this;
    }

    public ListIssuedCardTransactionsRequest withSkip(long skip) {
        Utils.checkNotNull(skip, "skip");
        this.skip = Optional.ofNullable(skip);
        return this;
    }

    public ListIssuedCardTransactionsRequest withSkip(Optional<Long> skip) {
        Utils.checkNotNull(skip, "skip");
        this.skip = skip;
        return this;
    }

    public ListIssuedCardTransactionsRequest withCount(long count) {
        Utils.checkNotNull(count, "count");
        this.count = Optional.ofNullable(count);
        return this;
    }

    public ListIssuedCardTransactionsRequest withCount(Optional<Long> count) {
        Utils.checkNotNull(count, "count");
        this.count = count;
        return this;
    }

    /**
     * Optional ID of the issued card to filter results.
     */
    public ListIssuedCardTransactionsRequest withIssuedCardID(String issuedCardID) {
        Utils.checkNotNull(issuedCardID, "issuedCardID");
        this.issuedCardID = Optional.ofNullable(issuedCardID);
        return this;
    }

    /**
     * Optional ID of the issued card to filter results.
     */
    public ListIssuedCardTransactionsRequest withIssuedCardID(Optional<String> issuedCardID) {
        Utils.checkNotNull(issuedCardID, "issuedCardID");
        this.issuedCardID = issuedCardID;
        return this;
    }

    /**
     * Optional date-time which inclusively filters all card transactions created after this date-time.
     */
    public ListIssuedCardTransactionsRequest withStartDateTime(OffsetDateTime startDateTime) {
        Utils.checkNotNull(startDateTime, "startDateTime");
        this.startDateTime = Optional.ofNullable(startDateTime);
        return this;
    }

    /**
     * Optional date-time which inclusively filters all card transactions created after this date-time.
     */
    public ListIssuedCardTransactionsRequest withStartDateTime(Optional<OffsetDateTime> startDateTime) {
        Utils.checkNotNull(startDateTime, "startDateTime");
        this.startDateTime = startDateTime;
        return this;
    }

    /**
     * Optional date-time which exclusively filters all card transactions created before this date-time.
     */
    public ListIssuedCardTransactionsRequest withEndDateTime(OffsetDateTime endDateTime) {
        Utils.checkNotNull(endDateTime, "endDateTime");
        this.endDateTime = Optional.ofNullable(endDateTime);
        return this;
    }

    /**
     * Optional date-time which exclusively filters all card transactions created before this date-time.
     */
    public ListIssuedCardTransactionsRequest withEndDateTime(Optional<OffsetDateTime> endDateTime) {
        Utils.checkNotNull(endDateTime, "endDateTime");
        this.endDateTime = endDateTime;
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
        ListIssuedCardTransactionsRequest other = (ListIssuedCardTransactionsRequest) o;
        return 
            Objects.deepEquals(this.xMoovVersion, other.xMoovVersion) &&
            Objects.deepEquals(this.accountID, other.accountID) &&
            Objects.deepEquals(this.skip, other.skip) &&
            Objects.deepEquals(this.count, other.count) &&
            Objects.deepEquals(this.issuedCardID, other.issuedCardID) &&
            Objects.deepEquals(this.startDateTime, other.startDateTime) &&
            Objects.deepEquals(this.endDateTime, other.endDateTime);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            xMoovVersion,
            accountID,
            skip,
            count,
            issuedCardID,
            startDateTime,
            endDateTime);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ListIssuedCardTransactionsRequest.class,
                "xMoovVersion", xMoovVersion,
                "accountID", accountID,
                "skip", skip,
                "count", count,
                "issuedCardID", issuedCardID,
                "startDateTime", startDateTime,
                "endDateTime", endDateTime);
    }
    
    public final static class Builder {
 
        private Optional<String> xMoovVersion;
 
        private String accountID;
 
        private Optional<Long> skip = Optional.empty();
 
        private Optional<Long> count = Optional.empty();
 
        private Optional<String> issuedCardID = Optional.empty();
 
        private Optional<OffsetDateTime> startDateTime = Optional.empty();
 
        private Optional<OffsetDateTime> endDateTime = Optional.empty();  
        
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
         * The Moov business account for which cards have been issued.
         */
        public Builder accountID(String accountID) {
            Utils.checkNotNull(accountID, "accountID");
            this.accountID = accountID;
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

        /**
         * Optional ID of the issued card to filter results.
         */
        public Builder issuedCardID(String issuedCardID) {
            Utils.checkNotNull(issuedCardID, "issuedCardID");
            this.issuedCardID = Optional.ofNullable(issuedCardID);
            return this;
        }

        /**
         * Optional ID of the issued card to filter results.
         */
        public Builder issuedCardID(Optional<String> issuedCardID) {
            Utils.checkNotNull(issuedCardID, "issuedCardID");
            this.issuedCardID = issuedCardID;
            return this;
        }

        /**
         * Optional date-time which inclusively filters all card transactions created after this date-time.
         */
        public Builder startDateTime(OffsetDateTime startDateTime) {
            Utils.checkNotNull(startDateTime, "startDateTime");
            this.startDateTime = Optional.ofNullable(startDateTime);
            return this;
        }

        /**
         * Optional date-time which inclusively filters all card transactions created after this date-time.
         */
        public Builder startDateTime(Optional<OffsetDateTime> startDateTime) {
            Utils.checkNotNull(startDateTime, "startDateTime");
            this.startDateTime = startDateTime;
            return this;
        }

        /**
         * Optional date-time which exclusively filters all card transactions created before this date-time.
         */
        public Builder endDateTime(OffsetDateTime endDateTime) {
            Utils.checkNotNull(endDateTime, "endDateTime");
            this.endDateTime = Optional.ofNullable(endDateTime);
            return this;
        }

        /**
         * Optional date-time which exclusively filters all card transactions created before this date-time.
         */
        public Builder endDateTime(Optional<OffsetDateTime> endDateTime) {
            Utils.checkNotNull(endDateTime, "endDateTime");
            this.endDateTime = endDateTime;
            return this;
        }
        
        public ListIssuedCardTransactionsRequest build() {
            if (xMoovVersion == null) {
                xMoovVersion = _SINGLETON_VALUE_XMoovVersion.value();
            }            return new ListIssuedCardTransactionsRequest(
                xMoovVersion,
                accountID,
                skip,
                count,
                issuedCardID,
                startDateTime,
                endDateTime);
        }

        private static final LazySingletonValue<Optional<String>> _SINGLETON_VALUE_XMoovVersion =
                new LazySingletonValue<>(
                        "x-moov-version",
                        "\"v2024.01.00\"",
                        new TypeReference<Optional<String>>() {});
    }
}

