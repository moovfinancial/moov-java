/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package io.moov.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import io.moov.sdk.models.components.UpdateRepresentative;
import io.moov.sdk.utils.LazySingletonValue;
import io.moov.sdk.utils.SpeakeasyMetadata;
import io.moov.sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public class UpdateRepresentativeRequest {

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
     * ID of the account.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=accountID")
    private String accountID;

    /**
     * ID of the representative.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=representativeID")
    private String representativeID;

    @SpeakeasyMetadata("request:mediaType=application/json")
    private UpdateRepresentative updateRepresentative;

    @JsonCreator
    public UpdateRepresentativeRequest(
            Optional<String> xMoovVersion,
            String accountID,
            String representativeID,
            UpdateRepresentative updateRepresentative) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        Utils.checkNotNull(accountID, "accountID");
        Utils.checkNotNull(representativeID, "representativeID");
        Utils.checkNotNull(updateRepresentative, "updateRepresentative");
        this.xMoovVersion = xMoovVersion;
        this.accountID = accountID;
        this.representativeID = representativeID;
        this.updateRepresentative = updateRepresentative;
    }
    
    public UpdateRepresentativeRequest(
            String accountID,
            String representativeID,
            UpdateRepresentative updateRepresentative) {
        this(Optional.empty(), accountID, representativeID, updateRepresentative);
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
     * ID of the account.
     */
    @JsonIgnore
    public String accountID() {
        return accountID;
    }

    /**
     * ID of the representative.
     */
    @JsonIgnore
    public String representativeID() {
        return representativeID;
    }

    @JsonIgnore
    public UpdateRepresentative updateRepresentative() {
        return updateRepresentative;
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
    public UpdateRepresentativeRequest withXMoovVersion(String xMoovVersion) {
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
    public UpdateRepresentativeRequest withXMoovVersion(Optional<String> xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = xMoovVersion;
        return this;
    }

    /**
     * ID of the account.
     */
    public UpdateRepresentativeRequest withAccountID(String accountID) {
        Utils.checkNotNull(accountID, "accountID");
        this.accountID = accountID;
        return this;
    }

    /**
     * ID of the representative.
     */
    public UpdateRepresentativeRequest withRepresentativeID(String representativeID) {
        Utils.checkNotNull(representativeID, "representativeID");
        this.representativeID = representativeID;
        return this;
    }

    public UpdateRepresentativeRequest withUpdateRepresentative(UpdateRepresentative updateRepresentative) {
        Utils.checkNotNull(updateRepresentative, "updateRepresentative");
        this.updateRepresentative = updateRepresentative;
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
        UpdateRepresentativeRequest other = (UpdateRepresentativeRequest) o;
        return 
            Objects.deepEquals(this.xMoovVersion, other.xMoovVersion) &&
            Objects.deepEquals(this.accountID, other.accountID) &&
            Objects.deepEquals(this.representativeID, other.representativeID) &&
            Objects.deepEquals(this.updateRepresentative, other.updateRepresentative);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            xMoovVersion,
            accountID,
            representativeID,
            updateRepresentative);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UpdateRepresentativeRequest.class,
                "xMoovVersion", xMoovVersion,
                "accountID", accountID,
                "representativeID", representativeID,
                "updateRepresentative", updateRepresentative);
    }
    
    public final static class Builder {
 
        private Optional<String> xMoovVersion;
 
        private String accountID;
 
        private String representativeID;
 
        private UpdateRepresentative updateRepresentative;
        
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
         * ID of the account.
         */
        public Builder accountID(String accountID) {
            Utils.checkNotNull(accountID, "accountID");
            this.accountID = accountID;
            return this;
        }

        /**
         * ID of the representative.
         */
        public Builder representativeID(String representativeID) {
            Utils.checkNotNull(representativeID, "representativeID");
            this.representativeID = representativeID;
            return this;
        }

        public Builder updateRepresentative(UpdateRepresentative updateRepresentative) {
            Utils.checkNotNull(updateRepresentative, "updateRepresentative");
            this.updateRepresentative = updateRepresentative;
            return this;
        }
        
        public UpdateRepresentativeRequest build() {
            if (xMoovVersion == null) {
                xMoovVersion = _SINGLETON_VALUE_XMoovVersion.value();
            }
            return new UpdateRepresentativeRequest(
                xMoovVersion,
                accountID,
                representativeID,
                updateRepresentative);
        }

        private static final LazySingletonValue<Optional<String>> _SINGLETON_VALUE_XMoovVersion =
                new LazySingletonValue<>(
                        "x-moov-version",
                        "\"v2024.01.00\"",
                        new TypeReference<Optional<String>>() {});
    }
}
