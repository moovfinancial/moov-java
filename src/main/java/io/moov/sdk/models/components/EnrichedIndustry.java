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
import java.util.Objects;
/**
 * EnrichedIndustry
 * 
 * <p>An industry's MCC/SIC/NAICS codes, along with descriptive title.
 */

public class EnrichedIndustry {

    @JsonProperty("title")
    private String title;

    /**
     * North American Industry Classification System
     */
    @JsonProperty("naics")
    private String naics;

    /**
     * Standard Industrial Classification
     */
    @JsonProperty("sic")
    private String sic;

    /**
     * Merchant Category Code
     */
    @JsonProperty("mcc")
    private String mcc;

    @JsonCreator
    public EnrichedIndustry(
            @JsonProperty("title") String title,
            @JsonProperty("naics") String naics,
            @JsonProperty("sic") String sic,
            @JsonProperty("mcc") String mcc) {
        Utils.checkNotNull(title, "title");
        Utils.checkNotNull(naics, "naics");
        Utils.checkNotNull(sic, "sic");
        Utils.checkNotNull(mcc, "mcc");
        this.title = title;
        this.naics = naics;
        this.sic = sic;
        this.mcc = mcc;
    }

    @JsonIgnore
    public String title() {
        return title;
    }

    /**
     * North American Industry Classification System
     */
    @JsonIgnore
    public String naics() {
        return naics;
    }

    /**
     * Standard Industrial Classification
     */
    @JsonIgnore
    public String sic() {
        return sic;
    }

    /**
     * Merchant Category Code
     */
    @JsonIgnore
    public String mcc() {
        return mcc;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public EnrichedIndustry withTitle(String title) {
        Utils.checkNotNull(title, "title");
        this.title = title;
        return this;
    }

    /**
     * North American Industry Classification System
     */
    public EnrichedIndustry withNaics(String naics) {
        Utils.checkNotNull(naics, "naics");
        this.naics = naics;
        return this;
    }

    /**
     * Standard Industrial Classification
     */
    public EnrichedIndustry withSic(String sic) {
        Utils.checkNotNull(sic, "sic");
        this.sic = sic;
        return this;
    }

    /**
     * Merchant Category Code
     */
    public EnrichedIndustry withMcc(String mcc) {
        Utils.checkNotNull(mcc, "mcc");
        this.mcc = mcc;
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
        EnrichedIndustry other = (EnrichedIndustry) o;
        return 
            Objects.deepEquals(this.title, other.title) &&
            Objects.deepEquals(this.naics, other.naics) &&
            Objects.deepEquals(this.sic, other.sic) &&
            Objects.deepEquals(this.mcc, other.mcc);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            title,
            naics,
            sic,
            mcc);
    }
    
    @Override
    public String toString() {
        return Utils.toString(EnrichedIndustry.class,
                "title", title,
                "naics", naics,
                "sic", sic,
                "mcc", mcc);
    }
    
    public final static class Builder {
 
        private String title;
 
        private String naics;
 
        private String sic;
 
        private String mcc;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder title(String title) {
            Utils.checkNotNull(title, "title");
            this.title = title;
            return this;
        }

        /**
         * North American Industry Classification System
         */
        public Builder naics(String naics) {
            Utils.checkNotNull(naics, "naics");
            this.naics = naics;
            return this;
        }

        /**
         * Standard Industrial Classification
         */
        public Builder sic(String sic) {
            Utils.checkNotNull(sic, "sic");
            this.sic = sic;
            return this;
        }

        /**
         * Merchant Category Code
         */
        public Builder mcc(String mcc) {
            Utils.checkNotNull(mcc, "mcc");
            this.mcc = mcc;
            return this;
        }
        
        public EnrichedIndustry build() {
            return new EnrichedIndustry(
                title,
                naics,
                sic,
                mcc);
        }
    }
}

