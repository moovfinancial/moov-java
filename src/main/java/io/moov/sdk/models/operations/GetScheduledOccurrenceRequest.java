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
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public class GetScheduledOccurrenceRequest {

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

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=scheduleID")
    private String scheduleID;

    /**
     * Allows the specification of additional filters beyond the UUID.
     * 
     * Specifying a UUID string returns the exact occurrence.
     * Specifying a RFC 3339 timestamp returns the latest occurrence at or before that timestamp.
     * Specifying `latest` returns the latest occurrence at or before now.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=occurrenceFilter")
    private String occurrenceFilter;

    @JsonCreator
    public GetScheduledOccurrenceRequest(
            Optional<String> xMoovVersion,
            String accountID,
            String scheduleID,
            String occurrenceFilter) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        Utils.checkNotNull(accountID, "accountID");
        Utils.checkNotNull(scheduleID, "scheduleID");
        Utils.checkNotNull(occurrenceFilter, "occurrenceFilter");
        this.xMoovVersion = xMoovVersion;
        this.accountID = accountID;
        this.scheduleID = scheduleID;
        this.occurrenceFilter = occurrenceFilter;
    }
    
    public GetScheduledOccurrenceRequest(
            String accountID,
            String scheduleID,
            String occurrenceFilter) {
        this(Optional.empty(), accountID, scheduleID, occurrenceFilter);
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

    @JsonIgnore
    public String scheduleID() {
        return scheduleID;
    }

    /**
     * Allows the specification of additional filters beyond the UUID.
     * 
     * Specifying a UUID string returns the exact occurrence.
     * Specifying a RFC 3339 timestamp returns the latest occurrence at or before that timestamp.
     * Specifying `latest` returns the latest occurrence at or before now.
     */
    @JsonIgnore
    public String occurrenceFilter() {
        return occurrenceFilter;
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
    public GetScheduledOccurrenceRequest withXMoovVersion(String xMoovVersion) {
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
    public GetScheduledOccurrenceRequest withXMoovVersion(Optional<String> xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = xMoovVersion;
        return this;
    }

    public GetScheduledOccurrenceRequest withAccountID(String accountID) {
        Utils.checkNotNull(accountID, "accountID");
        this.accountID = accountID;
        return this;
    }

    public GetScheduledOccurrenceRequest withScheduleID(String scheduleID) {
        Utils.checkNotNull(scheduleID, "scheduleID");
        this.scheduleID = scheduleID;
        return this;
    }

    /**
     * Allows the specification of additional filters beyond the UUID.
     * 
     * Specifying a UUID string returns the exact occurrence.
     * Specifying a RFC 3339 timestamp returns the latest occurrence at or before that timestamp.
     * Specifying `latest` returns the latest occurrence at or before now.
     */
    public GetScheduledOccurrenceRequest withOccurrenceFilter(String occurrenceFilter) {
        Utils.checkNotNull(occurrenceFilter, "occurrenceFilter");
        this.occurrenceFilter = occurrenceFilter;
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
        GetScheduledOccurrenceRequest other = (GetScheduledOccurrenceRequest) o;
        return 
            Objects.deepEquals(this.xMoovVersion, other.xMoovVersion) &&
            Objects.deepEquals(this.accountID, other.accountID) &&
            Objects.deepEquals(this.scheduleID, other.scheduleID) &&
            Objects.deepEquals(this.occurrenceFilter, other.occurrenceFilter);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            xMoovVersion,
            accountID,
            scheduleID,
            occurrenceFilter);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetScheduledOccurrenceRequest.class,
                "xMoovVersion", xMoovVersion,
                "accountID", accountID,
                "scheduleID", scheduleID,
                "occurrenceFilter", occurrenceFilter);
    }
    
    public final static class Builder {
 
        private Optional<String> xMoovVersion;
 
        private String accountID;
 
        private String scheduleID;
 
        private String occurrenceFilter;  
        
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

        public Builder scheduleID(String scheduleID) {
            Utils.checkNotNull(scheduleID, "scheduleID");
            this.scheduleID = scheduleID;
            return this;
        }

        /**
         * Allows the specification of additional filters beyond the UUID.
         * 
         * Specifying a UUID string returns the exact occurrence.
         * Specifying a RFC 3339 timestamp returns the latest occurrence at or before that timestamp.
         * Specifying `latest` returns the latest occurrence at or before now.
         */
        public Builder occurrenceFilter(String occurrenceFilter) {
            Utils.checkNotNull(occurrenceFilter, "occurrenceFilter");
            this.occurrenceFilter = occurrenceFilter;
            return this;
        }
        
        public GetScheduledOccurrenceRequest build() {
            if (xMoovVersion == null) {
                xMoovVersion = _SINGLETON_VALUE_XMoovVersion.value();
            }            return new GetScheduledOccurrenceRequest(
                xMoovVersion,
                accountID,
                scheduleID,
                occurrenceFilter);
        }

        private static final LazySingletonValue<Optional<String>> _SINGLETON_VALUE_XMoovVersion =
                new LazySingletonValue<>(
                        "x-moov-version",
                        "\"v2024.01.00\"",
                        new TypeReference<Optional<String>>() {});
    }
}

