/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package io.moov.sdk.models.components;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.moov.sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;

/**
 * IndustryTaxonomy
 * 
 * <p>A structured industry taxonomy entry with category and mapped to a default MCC code.
 */
public class IndustryTaxonomy {
    /**
     * URL-safe identifier for the industry
     */
    @JsonProperty("industry")
    private String industry;

    /**
     * Display name of the industry
     */
    @JsonProperty("displayName")
    private String displayName;

    /**
     * Category slug
     */
    @JsonProperty("category")
    private String category;

    /**
     * Human-readable category label
     */
    @JsonProperty("categoryDisplayName")
    private String categoryDisplayName;

    /**
     * Default Merchant Category Code
     */
    @JsonProperty("defaultMcc")
    private String defaultMcc;

    @JsonCreator
    public IndustryTaxonomy(
            @JsonProperty("industry") String industry,
            @JsonProperty("displayName") String displayName,
            @JsonProperty("category") String category,
            @JsonProperty("categoryDisplayName") String categoryDisplayName,
            @JsonProperty("defaultMcc") String defaultMcc) {
        Utils.checkNotNull(industry, "industry");
        Utils.checkNotNull(displayName, "displayName");
        Utils.checkNotNull(category, "category");
        Utils.checkNotNull(categoryDisplayName, "categoryDisplayName");
        Utils.checkNotNull(defaultMcc, "defaultMcc");
        this.industry = industry;
        this.displayName = displayName;
        this.category = category;
        this.categoryDisplayName = categoryDisplayName;
        this.defaultMcc = defaultMcc;
    }

    /**
     * URL-safe identifier for the industry
     */
    @JsonIgnore
    public String industry() {
        return industry;
    }

    /**
     * Display name of the industry
     */
    @JsonIgnore
    public String displayName() {
        return displayName;
    }

    /**
     * Category slug
     */
    @JsonIgnore
    public String category() {
        return category;
    }

    /**
     * Human-readable category label
     */
    @JsonIgnore
    public String categoryDisplayName() {
        return categoryDisplayName;
    }

    /**
     * Default Merchant Category Code
     */
    @JsonIgnore
    public String defaultMcc() {
        return defaultMcc;
    }

    public static Builder builder() {
        return new Builder();
    }


    /**
     * URL-safe identifier for the industry
     */
    public IndustryTaxonomy withIndustry(String industry) {
        Utils.checkNotNull(industry, "industry");
        this.industry = industry;
        return this;
    }

    /**
     * Display name of the industry
     */
    public IndustryTaxonomy withDisplayName(String displayName) {
        Utils.checkNotNull(displayName, "displayName");
        this.displayName = displayName;
        return this;
    }

    /**
     * Category slug
     */
    public IndustryTaxonomy withCategory(String category) {
        Utils.checkNotNull(category, "category");
        this.category = category;
        return this;
    }

    /**
     * Human-readable category label
     */
    public IndustryTaxonomy withCategoryDisplayName(String categoryDisplayName) {
        Utils.checkNotNull(categoryDisplayName, "categoryDisplayName");
        this.categoryDisplayName = categoryDisplayName;
        return this;
    }

    /**
     * Default Merchant Category Code
     */
    public IndustryTaxonomy withDefaultMcc(String defaultMcc) {
        Utils.checkNotNull(defaultMcc, "defaultMcc");
        this.defaultMcc = defaultMcc;
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
        IndustryTaxonomy other = (IndustryTaxonomy) o;
        return 
            Utils.enhancedDeepEquals(this.industry, other.industry) &&
            Utils.enhancedDeepEquals(this.displayName, other.displayName) &&
            Utils.enhancedDeepEquals(this.category, other.category) &&
            Utils.enhancedDeepEquals(this.categoryDisplayName, other.categoryDisplayName) &&
            Utils.enhancedDeepEquals(this.defaultMcc, other.defaultMcc);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            industry, displayName, category,
            categoryDisplayName, defaultMcc);
    }
    
    @Override
    public String toString() {
        return Utils.toString(IndustryTaxonomy.class,
                "industry", industry,
                "displayName", displayName,
                "category", category,
                "categoryDisplayName", categoryDisplayName,
                "defaultMcc", defaultMcc);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private String industry;

        private String displayName;

        private String category;

        private String categoryDisplayName;

        private String defaultMcc;

        private Builder() {
          // force use of static builder() method
        }


        /**
         * URL-safe identifier for the industry
         */
        public Builder industry(String industry) {
            Utils.checkNotNull(industry, "industry");
            this.industry = industry;
            return this;
        }


        /**
         * Display name of the industry
         */
        public Builder displayName(String displayName) {
            Utils.checkNotNull(displayName, "displayName");
            this.displayName = displayName;
            return this;
        }


        /**
         * Category slug
         */
        public Builder category(String category) {
            Utils.checkNotNull(category, "category");
            this.category = category;
            return this;
        }


        /**
         * Human-readable category label
         */
        public Builder categoryDisplayName(String categoryDisplayName) {
            Utils.checkNotNull(categoryDisplayName, "categoryDisplayName");
            this.categoryDisplayName = categoryDisplayName;
            return this;
        }


        /**
         * Default Merchant Category Code
         */
        public Builder defaultMcc(String defaultMcc) {
            Utils.checkNotNull(defaultMcc, "defaultMcc");
            this.defaultMcc = defaultMcc;
            return this;
        }

        public IndustryTaxonomy build() {

            return new IndustryTaxonomy(
                industry, displayName, category,
                categoryDisplayName, defaultMcc);
        }

    }
}
