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
import java.util.Objects;


public class EnrichedIndustries {

    @JsonProperty("industries")
    private List<EnrichedIndustry> industries;

    @JsonCreator
    public EnrichedIndustries(
            @JsonProperty("industries") List<EnrichedIndustry> industries) {
        Utils.checkNotNull(industries, "industries");
        this.industries = industries;
    }

    @JsonIgnore
    public List<EnrichedIndustry> industries() {
        return industries;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public EnrichedIndustries withIndustries(List<EnrichedIndustry> industries) {
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
            Objects.deepEquals(this.industries, other.industries);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            industries);
    }
    
    @Override
    public String toString() {
        return Utils.toString(EnrichedIndustries.class,
                "industries", industries);
    }
    
    public final static class Builder {
 
        private List<EnrichedIndustry> industries;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder industries(List<EnrichedIndustry> industries) {
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

