/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package io.moov.sdk.models.operations;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import io.moov.sdk.models.components.CreateTerminalApplication;
import io.moov.sdk.utils.LazySingletonValue;
import io.moov.sdk.utils.SpeakeasyMetadata;
import io.moov.sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public class CreateTerminalApplicationRequest {

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

    @SpeakeasyMetadata("request:mediaType=application/json")
    private CreateTerminalApplication createTerminalApplication;

    @JsonCreator
    public CreateTerminalApplicationRequest(
            Optional<String> xMoovVersion,
            CreateTerminalApplication createTerminalApplication) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        Utils.checkNotNull(createTerminalApplication, "createTerminalApplication");
        this.xMoovVersion = xMoovVersion;
        this.createTerminalApplication = createTerminalApplication;
    }
    
    public CreateTerminalApplicationRequest(
            CreateTerminalApplication createTerminalApplication) {
        this(Optional.empty(), createTerminalApplication);
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
    public CreateTerminalApplication createTerminalApplication() {
        return createTerminalApplication;
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
    public CreateTerminalApplicationRequest withXMoovVersion(String xMoovVersion) {
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
    public CreateTerminalApplicationRequest withXMoovVersion(Optional<String> xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = xMoovVersion;
        return this;
    }

    public CreateTerminalApplicationRequest withCreateTerminalApplication(CreateTerminalApplication createTerminalApplication) {
        Utils.checkNotNull(createTerminalApplication, "createTerminalApplication");
        this.createTerminalApplication = createTerminalApplication;
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
        CreateTerminalApplicationRequest other = (CreateTerminalApplicationRequest) o;
        return 
            Objects.deepEquals(this.xMoovVersion, other.xMoovVersion) &&
            Objects.deepEquals(this.createTerminalApplication, other.createTerminalApplication);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            xMoovVersion,
            createTerminalApplication);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateTerminalApplicationRequest.class,
                "xMoovVersion", xMoovVersion,
                "createTerminalApplication", createTerminalApplication);
    }
    
    public final static class Builder {
 
        private Optional<String> xMoovVersion;
 
        private CreateTerminalApplication createTerminalApplication;  
        
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

        public Builder createTerminalApplication(CreateTerminalApplication createTerminalApplication) {
            Utils.checkNotNull(createTerminalApplication, "createTerminalApplication");
            this.createTerminalApplication = createTerminalApplication;
            return this;
        }
        
        public CreateTerminalApplicationRequest build() {
            if (xMoovVersion == null) {
                xMoovVersion = _SINGLETON_VALUE_XMoovVersion.value();
            }            return new CreateTerminalApplicationRequest(
                xMoovVersion,
                createTerminalApplication);
        }

        private static final LazySingletonValue<Optional<String>> _SINGLETON_VALUE_XMoovVersion =
                new LazySingletonValue<>(
                        "x-moov-version",
                        "\"v2024.01.00\"",
                        new TypeReference<Optional<String>>() {});
    }
}

