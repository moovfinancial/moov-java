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
import java.util.List;


public class EnrichedIndustries {

    @JsonProperty("industries")
    private List<IndustryTaxonomy> industries;

    @JsonCreator
    public EnrichedIndustries(
            @JsonProperty("industries") List<IndustryTaxonomy> industries) {
        Utils.checkNotNull(industries, "industries");
        this.industries = industries;
    }

    @JsonIgnore
    public List<IndustryTaxonomy> industries() {
        return industries;
    }

    public static Builder builder() {
        return new Builder();
    }


    public EnrichedIndustries withIndustries(List<IndustryTaxonomy> industries) {
        Utils.checkNotNull(industries, "industries");
        this.industries = industries;
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
        EnrichedIndustries other = (EnrichedIndustries) o;
        return 
            Utils.enhancedDeepEquals(this.industries, other.industries);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            industries);
    }
    
    @Override
    public String toString() {
        return Utils.toString(EnrichedIndustries.class,
                "industries", industries);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private List<IndustryTaxonomy> industries;

        private Builder() {
          // force use of static builder() method
        }


        public Builder industries(List<IndustryTaxonomy> industries) {
            Utils.checkNotNull(industries, "industries");
            this.industries = industries;
            return this;
        }

        public EnrichedIndustries build() {

            return new EnrichedIndustries(
                industries);
        }

    }
}
