/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package io.moov.sdk.models.components;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.moov.sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Optional;

/**
 * TerminalApplication
 * 
 * <p>Describes a terminal application.
 */
public class TerminalApplication {
    /**
     * ID of the terminal application.
     */
    @JsonProperty("terminalApplicationID")
    private String terminalApplicationID;

    /**
     * Status of the terminal application.
     */
    @JsonProperty("status")
    private TerminalApplicationStatus status;

    /**
     * Platform of the terminal application.
     */
    @JsonProperty("platform")
    private TerminalApplicationPlatform platform;

    /**
     * The app bundle identifier of the terminal application. Will be returned if platform is `ios`.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("appBundleID")
    private Optional<String> appBundleID;

    /**
     * The app package name of the terminal application. Will be returned if platform is `android`.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("packageName")
    private Optional<String> packageName;

    /**
     * A cryptographic hash of the signing key for the application. Will be returned if platform is `android`.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sha256Digest")
    private Optional<String> sha256Digest;

    /**
     * The app version code of the terminal application. Will be returned if platform is `android`.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("versionCode")
    private Optional<String> versionCode;

    @JsonCreator
    public TerminalApplication(
            @JsonProperty("terminalApplicationID") String terminalApplicationID,
            @JsonProperty("status") TerminalApplicationStatus status,
            @JsonProperty("platform") TerminalApplicationPlatform platform,
            @JsonProperty("appBundleID") Optional<String> appBundleID,
            @JsonProperty("packageName") Optional<String> packageName,
            @JsonProperty("sha256Digest") Optional<String> sha256Digest,
            @JsonProperty("versionCode") Optional<String> versionCode) {
        Utils.checkNotNull(terminalApplicationID, "terminalApplicationID");
        Utils.checkNotNull(status, "status");
        Utils.checkNotNull(platform, "platform");
        Utils.checkNotNull(appBundleID, "appBundleID");
        Utils.checkNotNull(packageName, "packageName");
        Utils.checkNotNull(sha256Digest, "sha256Digest");
        Utils.checkNotNull(versionCode, "versionCode");
        this.terminalApplicationID = terminalApplicationID;
        this.status = status;
        this.platform = platform;
        this.appBundleID = appBundleID;
        this.packageName = packageName;
        this.sha256Digest = sha256Digest;
        this.versionCode = versionCode;
    }
    
    public TerminalApplication(
            String terminalApplicationID,
            TerminalApplicationStatus status,
            TerminalApplicationPlatform platform) {
        this(terminalApplicationID, status, platform,
            Optional.empty(), Optional.empty(), Optional.empty(),
            Optional.empty());
    }

    /**
     * ID of the terminal application.
     */
    @JsonIgnore
    public String terminalApplicationID() {
        return terminalApplicationID;
    }

    /**
     * Status of the terminal application.
     */
    @JsonIgnore
    public TerminalApplicationStatus status() {
        return status;
    }

    /**
     * Platform of the terminal application.
     */
    @JsonIgnore
    public TerminalApplicationPlatform platform() {
        return platform;
    }

    /**
     * The app bundle identifier of the terminal application. Will be returned if platform is `ios`.
     */
    @JsonIgnore
    public Optional<String> appBundleID() {
        return appBundleID;
    }

    /**
     * The app package name of the terminal application. Will be returned if platform is `android`.
     */
    @JsonIgnore
    public Optional<String> packageName() {
        return packageName;
    }

    /**
     * A cryptographic hash of the signing key for the application. Will be returned if platform is `android`.
     */
    @JsonIgnore
    public Optional<String> sha256Digest() {
        return sha256Digest;
    }

    /**
     * The app version code of the terminal application. Will be returned if platform is `android`.
     */
    @JsonIgnore
    public Optional<String> versionCode() {
        return versionCode;
    }

    public static Builder builder() {
        return new Builder();
    }


    /**
     * ID of the terminal application.
     */
    public TerminalApplication withTerminalApplicationID(String terminalApplicationID) {
        Utils.checkNotNull(terminalApplicationID, "terminalApplicationID");
        this.terminalApplicationID = terminalApplicationID;
        return this;
    }

    /**
     * Status of the terminal application.
     */
    public TerminalApplication withStatus(TerminalApplicationStatus status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
        return this;
    }

    /**
     * Platform of the terminal application.
     */
    public TerminalApplication withPlatform(TerminalApplicationPlatform platform) {
        Utils.checkNotNull(platform, "platform");
        this.platform = platform;
        return this;
    }

    /**
     * The app bundle identifier of the terminal application. Will be returned if platform is `ios`.
     */
    public TerminalApplication withAppBundleID(String appBundleID) {
        Utils.checkNotNull(appBundleID, "appBundleID");
        this.appBundleID = Optional.ofNullable(appBundleID);
        return this;
    }


    /**
     * The app bundle identifier of the terminal application. Will be returned if platform is `ios`.
     */
    public TerminalApplication withAppBundleID(Optional<String> appBundleID) {
        Utils.checkNotNull(appBundleID, "appBundleID");
        this.appBundleID = appBundleID;
        return this;
    }

    /**
     * The app package name of the terminal application. Will be returned if platform is `android`.
     */
    public TerminalApplication withPackageName(String packageName) {
        Utils.checkNotNull(packageName, "packageName");
        this.packageName = Optional.ofNullable(packageName);
        return this;
    }


    /**
     * The app package name of the terminal application. Will be returned if platform is `android`.
     */
    public TerminalApplication withPackageName(Optional<String> packageName) {
        Utils.checkNotNull(packageName, "packageName");
        this.packageName = packageName;
        return this;
    }

    /**
     * A cryptographic hash of the signing key for the application. Will be returned if platform is `android`.
     */
    public TerminalApplication withSha256Digest(String sha256Digest) {
        Utils.checkNotNull(sha256Digest, "sha256Digest");
        this.sha256Digest = Optional.ofNullable(sha256Digest);
        return this;
    }


    /**
     * A cryptographic hash of the signing key for the application. Will be returned if platform is `android`.
     */
    public TerminalApplication withSha256Digest(Optional<String> sha256Digest) {
        Utils.checkNotNull(sha256Digest, "sha256Digest");
        this.sha256Digest = sha256Digest;
        return this;
    }

    /**
     * The app version code of the terminal application. Will be returned if platform is `android`.
     */
    public TerminalApplication withVersionCode(String versionCode) {
        Utils.checkNotNull(versionCode, "versionCode");
        this.versionCode = Optional.ofNullable(versionCode);
        return this;
    }


    /**
     * The app version code of the terminal application. Will be returned if platform is `android`.
     */
    public TerminalApplication withVersionCode(Optional<String> versionCode) {
        Utils.checkNotNull(versionCode, "versionCode");
        this.versionCode = versionCode;
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
        TerminalApplication other = (TerminalApplication) o;
        return 
            Utils.enhancedDeepEquals(this.terminalApplicationID, other.terminalApplicationID) &&
            Utils.enhancedDeepEquals(this.status, other.status) &&
            Utils.enhancedDeepEquals(this.platform, other.platform) &&
            Utils.enhancedDeepEquals(this.appBundleID, other.appBundleID) &&
            Utils.enhancedDeepEquals(this.packageName, other.packageName) &&
            Utils.enhancedDeepEquals(this.sha256Digest, other.sha256Digest) &&
            Utils.enhancedDeepEquals(this.versionCode, other.versionCode);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            terminalApplicationID, status, platform,
            appBundleID, packageName, sha256Digest,
            versionCode);
    }
    
    @Override
    public String toString() {
        return Utils.toString(TerminalApplication.class,
                "terminalApplicationID", terminalApplicationID,
                "status", status,
                "platform", platform,
                "appBundleID", appBundleID,
                "packageName", packageName,
                "sha256Digest", sha256Digest,
                "versionCode", versionCode);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private String terminalApplicationID;

        private TerminalApplicationStatus status;

        private TerminalApplicationPlatform platform;

        private Optional<String> appBundleID = Optional.empty();

        private Optional<String> packageName = Optional.empty();

        private Optional<String> sha256Digest = Optional.empty();

        private Optional<String> versionCode = Optional.empty();

        private Builder() {
          // force use of static builder() method
        }


        /**
         * ID of the terminal application.
         */
        public Builder terminalApplicationID(String terminalApplicationID) {
            Utils.checkNotNull(terminalApplicationID, "terminalApplicationID");
            this.terminalApplicationID = terminalApplicationID;
            return this;
        }


        /**
         * Status of the terminal application.
         */
        public Builder status(TerminalApplicationStatus status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }


        /**
         * Platform of the terminal application.
         */
        public Builder platform(TerminalApplicationPlatform platform) {
            Utils.checkNotNull(platform, "platform");
            this.platform = platform;
            return this;
        }


        /**
         * The app bundle identifier of the terminal application. Will be returned if platform is `ios`.
         */
        public Builder appBundleID(String appBundleID) {
            Utils.checkNotNull(appBundleID, "appBundleID");
            this.appBundleID = Optional.ofNullable(appBundleID);
            return this;
        }

        /**
         * The app bundle identifier of the terminal application. Will be returned if platform is `ios`.
         */
        public Builder appBundleID(Optional<String> appBundleID) {
            Utils.checkNotNull(appBundleID, "appBundleID");
            this.appBundleID = appBundleID;
            return this;
        }


        /**
         * The app package name of the terminal application. Will be returned if platform is `android`.
         */
        public Builder packageName(String packageName) {
            Utils.checkNotNull(packageName, "packageName");
            this.packageName = Optional.ofNullable(packageName);
            return this;
        }

        /**
         * The app package name of the terminal application. Will be returned if platform is `android`.
         */
        public Builder packageName(Optional<String> packageName) {
            Utils.checkNotNull(packageName, "packageName");
            this.packageName = packageName;
            return this;
        }


        /**
         * A cryptographic hash of the signing key for the application. Will be returned if platform is `android`.
         */
        public Builder sha256Digest(String sha256Digest) {
            Utils.checkNotNull(sha256Digest, "sha256Digest");
            this.sha256Digest = Optional.ofNullable(sha256Digest);
            return this;
        }

        /**
         * A cryptographic hash of the signing key for the application. Will be returned if platform is `android`.
         */
        public Builder sha256Digest(Optional<String> sha256Digest) {
            Utils.checkNotNull(sha256Digest, "sha256Digest");
            this.sha256Digest = sha256Digest;
            return this;
        }


        /**
         * The app version code of the terminal application. Will be returned if platform is `android`.
         */
        public Builder versionCode(String versionCode) {
            Utils.checkNotNull(versionCode, "versionCode");
            this.versionCode = Optional.ofNullable(versionCode);
            return this;
        }

        /**
         * The app version code of the terminal application. Will be returned if platform is `android`.
         */
        public Builder versionCode(Optional<String> versionCode) {
            Utils.checkNotNull(versionCode, "versionCode");
            this.versionCode = versionCode;
            return this;
        }

        public TerminalApplication build() {

            return new TerminalApplication(
                terminalApplicationID, status, platform,
                appBundleID, packageName, sha256Digest,
                versionCode);
        }

    }
}
