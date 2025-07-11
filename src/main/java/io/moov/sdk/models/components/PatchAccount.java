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
import java.lang.SuppressWarnings;
import java.util.Map;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * PatchAccount
 * 
 * <p>Describes the fields available when patching a Moov account.
 */
public class PatchAccount {
    /**
     * Describes the fields available when patching a profile.
     * Each object can be patched independent of patching the other fields.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("profile")
    private Optional<? extends PatchProfile> profile;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("metadata")
    private JsonNullable<? extends Map<String, String>> metadata;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("termsOfService")
    private Optional<? extends PatchAccountTermsOfService> termsOfService;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("foreignID")
    private Optional<String> foreignID;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("customerSupport")
    private JsonNullable<? extends PatchAccountCustomerSupport> customerSupport;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("settings")
    private Optional<? extends CreateAccountSettings> settings;

    @JsonCreator
    public PatchAccount(
            @JsonProperty("profile") Optional<? extends PatchProfile> profile,
            @JsonProperty("metadata") JsonNullable<? extends Map<String, String>> metadata,
            @JsonProperty("termsOfService") Optional<? extends PatchAccountTermsOfService> termsOfService,
            @JsonProperty("foreignID") Optional<String> foreignID,
            @JsonProperty("customerSupport") JsonNullable<? extends PatchAccountCustomerSupport> customerSupport,
            @JsonProperty("settings") Optional<? extends CreateAccountSettings> settings) {
        Utils.checkNotNull(profile, "profile");
        Utils.checkNotNull(metadata, "metadata");
        Utils.checkNotNull(termsOfService, "termsOfService");
        Utils.checkNotNull(foreignID, "foreignID");
        Utils.checkNotNull(customerSupport, "customerSupport");
        Utils.checkNotNull(settings, "settings");
        this.profile = profile;
        this.metadata = metadata;
        this.termsOfService = termsOfService;
        this.foreignID = foreignID;
        this.customerSupport = customerSupport;
        this.settings = settings;
    }
    
    public PatchAccount() {
        this(Optional.empty(), JsonNullable.undefined(), Optional.empty(),
            Optional.empty(), JsonNullable.undefined(), Optional.empty());
    }

    /**
     * Describes the fields available when patching a profile.
     * Each object can be patched independent of patching the other fields.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<PatchProfile> profile() {
        return (Optional<PatchProfile>) profile;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<Map<String, String>> metadata() {
        return (JsonNullable<Map<String, String>>) metadata;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<PatchAccountTermsOfService> termsOfService() {
        return (Optional<PatchAccountTermsOfService>) termsOfService;
    }

    @JsonIgnore
    public Optional<String> foreignID() {
        return foreignID;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<PatchAccountCustomerSupport> customerSupport() {
        return (JsonNullable<PatchAccountCustomerSupport>) customerSupport;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<CreateAccountSettings> settings() {
        return (Optional<CreateAccountSettings>) settings;
    }

    public static Builder builder() {
        return new Builder();
    }


    /**
     * Describes the fields available when patching a profile.
     * Each object can be patched independent of patching the other fields.
     */
    public PatchAccount withProfile(PatchProfile profile) {
        Utils.checkNotNull(profile, "profile");
        this.profile = Optional.ofNullable(profile);
        return this;
    }


    /**
     * Describes the fields available when patching a profile.
     * Each object can be patched independent of patching the other fields.
     */
    public PatchAccount withProfile(Optional<? extends PatchProfile> profile) {
        Utils.checkNotNull(profile, "profile");
        this.profile = profile;
        return this;
    }

    public PatchAccount withMetadata(Map<String, String> metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = JsonNullable.of(metadata);
        return this;
    }

    public PatchAccount withMetadata(JsonNullable<? extends Map<String, String>> metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = metadata;
        return this;
    }

    public PatchAccount withTermsOfService(PatchAccountTermsOfService termsOfService) {
        Utils.checkNotNull(termsOfService, "termsOfService");
        this.termsOfService = Optional.ofNullable(termsOfService);
        return this;
    }


    public PatchAccount withTermsOfService(Optional<? extends PatchAccountTermsOfService> termsOfService) {
        Utils.checkNotNull(termsOfService, "termsOfService");
        this.termsOfService = termsOfService;
        return this;
    }

    public PatchAccount withForeignID(String foreignID) {
        Utils.checkNotNull(foreignID, "foreignID");
        this.foreignID = Optional.ofNullable(foreignID);
        return this;
    }


    public PatchAccount withForeignID(Optional<String> foreignID) {
        Utils.checkNotNull(foreignID, "foreignID");
        this.foreignID = foreignID;
        return this;
    }

    public PatchAccount withCustomerSupport(PatchAccountCustomerSupport customerSupport) {
        Utils.checkNotNull(customerSupport, "customerSupport");
        this.customerSupport = JsonNullable.of(customerSupport);
        return this;
    }

    public PatchAccount withCustomerSupport(JsonNullable<? extends PatchAccountCustomerSupport> customerSupport) {
        Utils.checkNotNull(customerSupport, "customerSupport");
        this.customerSupport = customerSupport;
        return this;
    }

    public PatchAccount withSettings(CreateAccountSettings settings) {
        Utils.checkNotNull(settings, "settings");
        this.settings = Optional.ofNullable(settings);
        return this;
    }


    public PatchAccount withSettings(Optional<? extends CreateAccountSettings> settings) {
        Utils.checkNotNull(settings, "settings");
        this.settings = settings;
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
        PatchAccount other = (PatchAccount) o;
        return 
            Utils.enhancedDeepEquals(this.profile, other.profile) &&
            Utils.enhancedDeepEquals(this.metadata, other.metadata) &&
            Utils.enhancedDeepEquals(this.termsOfService, other.termsOfService) &&
            Utils.enhancedDeepEquals(this.foreignID, other.foreignID) &&
            Utils.enhancedDeepEquals(this.customerSupport, other.customerSupport) &&
            Utils.enhancedDeepEquals(this.settings, other.settings);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            profile, metadata, termsOfService,
            foreignID, customerSupport, settings);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PatchAccount.class,
                "profile", profile,
                "metadata", metadata,
                "termsOfService", termsOfService,
                "foreignID", foreignID,
                "customerSupport", customerSupport,
                "settings", settings);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private Optional<? extends PatchProfile> profile = Optional.empty();

        private JsonNullable<? extends Map<String, String>> metadata = JsonNullable.undefined();

        private Optional<? extends PatchAccountTermsOfService> termsOfService = Optional.empty();

        private Optional<String> foreignID = Optional.empty();

        private JsonNullable<? extends PatchAccountCustomerSupport> customerSupport = JsonNullable.undefined();

        private Optional<? extends CreateAccountSettings> settings = Optional.empty();

        private Builder() {
          // force use of static builder() method
        }


        /**
         * Describes the fields available when patching a profile.
         * Each object can be patched independent of patching the other fields.
         */
        public Builder profile(PatchProfile profile) {
            Utils.checkNotNull(profile, "profile");
            this.profile = Optional.ofNullable(profile);
            return this;
        }

        /**
         * Describes the fields available when patching a profile.
         * Each object can be patched independent of patching the other fields.
         */
        public Builder profile(Optional<? extends PatchProfile> profile) {
            Utils.checkNotNull(profile, "profile");
            this.profile = profile;
            return this;
        }


        public Builder metadata(Map<String, String> metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = JsonNullable.of(metadata);
            return this;
        }

        public Builder metadata(JsonNullable<? extends Map<String, String>> metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = metadata;
            return this;
        }


        public Builder termsOfService(PatchAccountTermsOfService termsOfService) {
            Utils.checkNotNull(termsOfService, "termsOfService");
            this.termsOfService = Optional.ofNullable(termsOfService);
            return this;
        }

        public Builder termsOfService(Optional<? extends PatchAccountTermsOfService> termsOfService) {
            Utils.checkNotNull(termsOfService, "termsOfService");
            this.termsOfService = termsOfService;
            return this;
        }


        public Builder foreignID(String foreignID) {
            Utils.checkNotNull(foreignID, "foreignID");
            this.foreignID = Optional.ofNullable(foreignID);
            return this;
        }

        public Builder foreignID(Optional<String> foreignID) {
            Utils.checkNotNull(foreignID, "foreignID");
            this.foreignID = foreignID;
            return this;
        }


        public Builder customerSupport(PatchAccountCustomerSupport customerSupport) {
            Utils.checkNotNull(customerSupport, "customerSupport");
            this.customerSupport = JsonNullable.of(customerSupport);
            return this;
        }

        public Builder customerSupport(JsonNullable<? extends PatchAccountCustomerSupport> customerSupport) {
            Utils.checkNotNull(customerSupport, "customerSupport");
            this.customerSupport = customerSupport;
            return this;
        }


        public Builder settings(CreateAccountSettings settings) {
            Utils.checkNotNull(settings, "settings");
            this.settings = Optional.ofNullable(settings);
            return this;
        }

        public Builder settings(Optional<? extends CreateAccountSettings> settings) {
            Utils.checkNotNull(settings, "settings");
            this.settings = settings;
            return this;
        }

        public PatchAccount build() {

            return new PatchAccount(
                profile, metadata, termsOfService,
                foreignID, customerSupport, settings);
        }

    }
}
