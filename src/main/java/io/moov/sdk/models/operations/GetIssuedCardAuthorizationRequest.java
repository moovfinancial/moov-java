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

public class GetIssuedCardAuthorizationRequest {

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

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=authorizationID")
    private String authorizationID;

    @JsonCreator
    public GetIssuedCardAuthorizationRequest(
            Optional<String> xMoovVersion,
            String accountID,
            String authorizationID) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        Utils.checkNotNull(accountID, "accountID");
        Utils.checkNotNull(authorizationID, "authorizationID");
        this.xMoovVersion = xMoovVersion;
        this.accountID = accountID;
        this.authorizationID = authorizationID;
    }
    
    public GetIssuedCardAuthorizationRequest(
            String accountID,
            String authorizationID) {
        this(Optional.empty(), accountID, authorizationID);
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
    public String authorizationID() {
        return authorizationID;
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
    public GetIssuedCardAuthorizationRequest withXMoovVersion(String xMoovVersion) {
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
    public GetIssuedCardAuthorizationRequest withXMoovVersion(Optional<String> xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = xMoovVersion;
        return this;
    }

    /**
     * The Moov business account for which cards have been issued.
     */
    public GetIssuedCardAuthorizationRequest withAccountID(String accountID) {
        Utils.checkNotNull(accountID, "accountID");
        this.accountID = accountID;
        return this;
    }

    public GetIssuedCardAuthorizationRequest withAuthorizationID(String authorizationID) {
        Utils.checkNotNull(authorizationID, "authorizationID");
        this.authorizationID = authorizationID;
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
        GetIssuedCardAuthorizationRequest other = (GetIssuedCardAuthorizationRequest) o;
        return 
            Objects.deepEquals(this.xMoovVersion, other.xMoovVersion) &&
            Objects.deepEquals(this.accountID, other.accountID) &&
            Objects.deepEquals(this.authorizationID, other.authorizationID);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            xMoovVersion,
            accountID,
            authorizationID);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetIssuedCardAuthorizationRequest.class,
                "xMoovVersion", xMoovVersion,
                "accountID", accountID,
                "authorizationID", authorizationID);
    }
    
    public final static class Builder {
 
        private Optional<String> xMoovVersion;
 
        private String accountID;
 
        private String authorizationID;  
        
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

        public Builder authorizationID(String authorizationID) {
            Utils.checkNotNull(authorizationID, "authorizationID");
            this.authorizationID = authorizationID;
            return this;
        }
        
        public GetIssuedCardAuthorizationRequest build() {
            if (xMoovVersion == null) {
                xMoovVersion = _SINGLETON_VALUE_XMoovVersion.value();
            }            return new GetIssuedCardAuthorizationRequest(
                xMoovVersion,
                accountID,
                authorizationID);
        }

        private static final LazySingletonValue<Optional<String>> _SINGLETON_VALUE_XMoovVersion =
                new LazySingletonValue<>(
                        "x-moov-version",
                        "\"v2024.01.00\"",
                        new TypeReference<Optional<String>>() {});
    }
}

