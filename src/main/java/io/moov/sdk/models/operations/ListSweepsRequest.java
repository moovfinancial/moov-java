/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.moov.sdk.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import io.moov.sdk.models.components.SweepStatus;
import io.moov.sdk.utils.LazySingletonValue;
import io.moov.sdk.utils.SpeakeasyMetadata;
import io.moov.sdk.utils.Utils;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;


public class ListSweepsRequest {

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

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=walletID")
    private String walletID;

    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=skip")
    private Optional<Long> skip;

    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=count")
    private Optional<Long> count;

    /**
     * Optional parameter to filter by sweep status.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=status")
    private Optional<? extends SweepStatus> status;

    /**
     * Optional string to filter by statement descriptor.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=statementDescriptor")
    private Optional<String> statementDescriptor;

    @JsonCreator
    public ListSweepsRequest(
            Optional<String> xMoovVersion,
            String accountID,
            String walletID,
            Optional<Long> skip,
            Optional<Long> count,
            Optional<? extends SweepStatus> status,
            Optional<String> statementDescriptor) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        Utils.checkNotNull(accountID, "accountID");
        Utils.checkNotNull(walletID, "walletID");
        Utils.checkNotNull(skip, "skip");
        Utils.checkNotNull(count, "count");
        Utils.checkNotNull(status, "status");
        Utils.checkNotNull(statementDescriptor, "statementDescriptor");
        this.xMoovVersion = xMoovVersion;
        this.accountID = accountID;
        this.walletID = walletID;
        this.skip = skip;
        this.count = count;
        this.status = status;
        this.statementDescriptor = statementDescriptor;
    }
    
    public ListSweepsRequest(
            String accountID,
            String walletID) {
        this(Optional.empty(), accountID, walletID, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
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
    public String walletID() {
        return walletID;
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
     * Optional parameter to filter by sweep status.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<SweepStatus> status() {
        return (Optional<SweepStatus>) status;
    }

    /**
     * Optional string to filter by statement descriptor.
     */
    @JsonIgnore
    public Optional<String> statementDescriptor() {
        return statementDescriptor;
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
    public ListSweepsRequest withXMoovVersion(String xMoovVersion) {
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
    public ListSweepsRequest withXMoovVersion(Optional<String> xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = xMoovVersion;
        return this;
    }

    public ListSweepsRequest withAccountID(String accountID) {
        Utils.checkNotNull(accountID, "accountID");
        this.accountID = accountID;
        return this;
    }

    public ListSweepsRequest withWalletID(String walletID) {
        Utils.checkNotNull(walletID, "walletID");
        this.walletID = walletID;
        return this;
    }

    public ListSweepsRequest withSkip(long skip) {
        Utils.checkNotNull(skip, "skip");
        this.skip = Optional.ofNullable(skip);
        return this;
    }

    public ListSweepsRequest withSkip(Optional<Long> skip) {
        Utils.checkNotNull(skip, "skip");
        this.skip = skip;
        return this;
    }

    public ListSweepsRequest withCount(long count) {
        Utils.checkNotNull(count, "count");
        this.count = Optional.ofNullable(count);
        return this;
    }

    public ListSweepsRequest withCount(Optional<Long> count) {
        Utils.checkNotNull(count, "count");
        this.count = count;
        return this;
    }

    /**
     * Optional parameter to filter by sweep status.
     */
    public ListSweepsRequest withStatus(SweepStatus status) {
        Utils.checkNotNull(status, "status");
        this.status = Optional.ofNullable(status);
        return this;
    }

    /**
     * Optional parameter to filter by sweep status.
     */
    public ListSweepsRequest withStatus(Optional<? extends SweepStatus> status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
        return this;
    }

    /**
     * Optional string to filter by statement descriptor.
     */
    public ListSweepsRequest withStatementDescriptor(String statementDescriptor) {
        Utils.checkNotNull(statementDescriptor, "statementDescriptor");
        this.statementDescriptor = Optional.ofNullable(statementDescriptor);
        return this;
    }

    /**
     * Optional string to filter by statement descriptor.
     */
    public ListSweepsRequest withStatementDescriptor(Optional<String> statementDescriptor) {
        Utils.checkNotNull(statementDescriptor, "statementDescriptor");
        this.statementDescriptor = statementDescriptor;
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
        ListSweepsRequest other = (ListSweepsRequest) o;
        return 
            Objects.deepEquals(this.xMoovVersion, other.xMoovVersion) &&
            Objects.deepEquals(this.accountID, other.accountID) &&
            Objects.deepEquals(this.walletID, other.walletID) &&
            Objects.deepEquals(this.skip, other.skip) &&
            Objects.deepEquals(this.count, other.count) &&
            Objects.deepEquals(this.status, other.status) &&
            Objects.deepEquals(this.statementDescriptor, other.statementDescriptor);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            xMoovVersion,
            accountID,
            walletID,
            skip,
            count,
            status,
            statementDescriptor);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ListSweepsRequest.class,
                "xMoovVersion", xMoovVersion,
                "accountID", accountID,
                "walletID", walletID,
                "skip", skip,
                "count", count,
                "status", status,
                "statementDescriptor", statementDescriptor);
    }
    
    public final static class Builder {
 
        private Optional<String> xMoovVersion;
 
        private String accountID;
 
        private String walletID;
 
        private Optional<Long> skip = Optional.empty();
 
        private Optional<Long> count = Optional.empty();
 
        private Optional<? extends SweepStatus> status = Optional.empty();
 
        private Optional<String> statementDescriptor = Optional.empty();  
        
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

        public Builder walletID(String walletID) {
            Utils.checkNotNull(walletID, "walletID");
            this.walletID = walletID;
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
         * Optional parameter to filter by sweep status.
         */
        public Builder status(SweepStatus status) {
            Utils.checkNotNull(status, "status");
            this.status = Optional.ofNullable(status);
            return this;
        }

        /**
         * Optional parameter to filter by sweep status.
         */
        public Builder status(Optional<? extends SweepStatus> status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }

        /**
         * Optional string to filter by statement descriptor.
         */
        public Builder statementDescriptor(String statementDescriptor) {
            Utils.checkNotNull(statementDescriptor, "statementDescriptor");
            this.statementDescriptor = Optional.ofNullable(statementDescriptor);
            return this;
        }

        /**
         * Optional string to filter by statement descriptor.
         */
        public Builder statementDescriptor(Optional<String> statementDescriptor) {
            Utils.checkNotNull(statementDescriptor, "statementDescriptor");
            this.statementDescriptor = statementDescriptor;
            return this;
        }
        
        public ListSweepsRequest build() {
            if (xMoovVersion == null) {
                xMoovVersion = _SINGLETON_VALUE_XMoovVersion.value();
            }            return new ListSweepsRequest(
                xMoovVersion,
                accountID,
                walletID,
                skip,
                count,
                status,
                statementDescriptor);
        }

        private static final LazySingletonValue<Optional<String>> _SINGLETON_VALUE_XMoovVersion =
                new LazySingletonValue<>(
                        "x-moov-version",
                        "\"v2024.01.00\"",
                        new TypeReference<Optional<String>>() {});
    }
}

