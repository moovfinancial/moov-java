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

public class GetTermsOfServiceTokenRequest {

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
     * Indicates the domain from which the request originated. Required if referer header is not present.
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=origin")
    private Optional<String> origin;

    /**
     * Specifies the URL of the resource from which the request originated. Required if origin header is not present.
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=referer")
    private Optional<String> referer;

    @JsonCreator
    public GetTermsOfServiceTokenRequest(
            Optional<String> xMoovVersion,
            Optional<String> origin,
            Optional<String> referer) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        Utils.checkNotNull(origin, "origin");
        Utils.checkNotNull(referer, "referer");
        this.xMoovVersion = xMoovVersion;
        this.origin = origin;
        this.referer = referer;
    }
    
    public GetTermsOfServiceTokenRequest() {
        this(Optional.empty(), Optional.empty(), Optional.empty());
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
     * Indicates the domain from which the request originated. Required if referer header is not present.
     */
    @JsonIgnore
    public Optional<String> origin() {
        return origin;
    }

    /**
     * Specifies the URL of the resource from which the request originated. Required if origin header is not present.
     */
    @JsonIgnore
    public Optional<String> referer() {
        return referer;
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
    public GetTermsOfServiceTokenRequest withXMoovVersion(String xMoovVersion) {
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
    public GetTermsOfServiceTokenRequest withXMoovVersion(Optional<String> xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = xMoovVersion;
        return this;
    }

    /**
     * Indicates the domain from which the request originated. Required if referer header is not present.
     */
    public GetTermsOfServiceTokenRequest withOrigin(String origin) {
        Utils.checkNotNull(origin, "origin");
        this.origin = Optional.ofNullable(origin);
        return this;
    }

    /**
     * Indicates the domain from which the request originated. Required if referer header is not present.
     */
    public GetTermsOfServiceTokenRequest withOrigin(Optional<String> origin) {
        Utils.checkNotNull(origin, "origin");
        this.origin = origin;
        return this;
    }

    /**
     * Specifies the URL of the resource from which the request originated. Required if origin header is not present.
     */
    public GetTermsOfServiceTokenRequest withReferer(String referer) {
        Utils.checkNotNull(referer, "referer");
        this.referer = Optional.ofNullable(referer);
        return this;
    }

    /**
     * Specifies the URL of the resource from which the request originated. Required if origin header is not present.
     */
    public GetTermsOfServiceTokenRequest withReferer(Optional<String> referer) {
        Utils.checkNotNull(referer, "referer");
        this.referer = referer;
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
        GetTermsOfServiceTokenRequest other = (GetTermsOfServiceTokenRequest) o;
        return 
            Objects.deepEquals(this.xMoovVersion, other.xMoovVersion) &&
            Objects.deepEquals(this.origin, other.origin) &&
            Objects.deepEquals(this.referer, other.referer);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            xMoovVersion,
            origin,
            referer);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetTermsOfServiceTokenRequest.class,
                "xMoovVersion", xMoovVersion,
                "origin", origin,
                "referer", referer);
    }
    
    public final static class Builder {
 
        private Optional<String> xMoovVersion;
 
        private Optional<String> origin = Optional.empty();
 
        private Optional<String> referer = Optional.empty();
        
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
         * Indicates the domain from which the request originated. Required if referer header is not present.
         */
        public Builder origin(String origin) {
            Utils.checkNotNull(origin, "origin");
            this.origin = Optional.ofNullable(origin);
            return this;
        }

        /**
         * Indicates the domain from which the request originated. Required if referer header is not present.
         */
        public Builder origin(Optional<String> origin) {
            Utils.checkNotNull(origin, "origin");
            this.origin = origin;
            return this;
        }

        /**
         * Specifies the URL of the resource from which the request originated. Required if origin header is not present.
         */
        public Builder referer(String referer) {
            Utils.checkNotNull(referer, "referer");
            this.referer = Optional.ofNullable(referer);
            return this;
        }

        /**
         * Specifies the URL of the resource from which the request originated. Required if origin header is not present.
         */
        public Builder referer(Optional<String> referer) {
            Utils.checkNotNull(referer, "referer");
            this.referer = referer;
            return this;
        }
        
        public GetTermsOfServiceTokenRequest build() {
            if (xMoovVersion == null) {
                xMoovVersion = _SINGLETON_VALUE_XMoovVersion.value();
            }
            return new GetTermsOfServiceTokenRequest(
                xMoovVersion,
                origin,
                referer);
        }

        private static final LazySingletonValue<Optional<String>> _SINGLETON_VALUE_XMoovVersion =
                new LazySingletonValue<>(
                        "x-moov-version",
                        "\"v2024.01.00\"",
                        new TypeReference<Optional<String>>() {});
    }
}
