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
import java.util.Objects;
import java.util.Optional;

public class CreateBusinessErrorIndustryCodes {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("naics")
    private Optional<String> naics;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sic")
    private Optional<String> sic;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("mcc")
    private Optional<String> mcc;

    @JsonCreator
    public CreateBusinessErrorIndustryCodes(
            @JsonProperty("naics") Optional<String> naics,
            @JsonProperty("sic") Optional<String> sic,
            @JsonProperty("mcc") Optional<String> mcc) {
        Utils.checkNotNull(naics, "naics");
        Utils.checkNotNull(sic, "sic");
        Utils.checkNotNull(mcc, "mcc");
        this.naics = naics;
        this.sic = sic;
        this.mcc = mcc;
    }
    
    public CreateBusinessErrorIndustryCodes() {
        this(Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<String> naics() {
        return naics;
    }

    @JsonIgnore
    public Optional<String> sic() {
        return sic;
    }

    @JsonIgnore
    public Optional<String> mcc() {
        return mcc;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public CreateBusinessErrorIndustryCodes withNaics(String naics) {
        Utils.checkNotNull(naics, "naics");
        this.naics = Optional.ofNullable(naics);
        return this;
    }

    public CreateBusinessErrorIndustryCodes withNaics(Optional<String> naics) {
        Utils.checkNotNull(naics, "naics");
        this.naics = naics;
        return this;
    }

    public CreateBusinessErrorIndustryCodes withSic(String sic) {
        Utils.checkNotNull(sic, "sic");
        this.sic = Optional.ofNullable(sic);
        return this;
    }

    public CreateBusinessErrorIndustryCodes withSic(Optional<String> sic) {
        Utils.checkNotNull(sic, "sic");
        this.sic = sic;
        return this;
    }

    public CreateBusinessErrorIndustryCodes withMcc(String mcc) {
        Utils.checkNotNull(mcc, "mcc");
        this.mcc = Optional.ofNullable(mcc);
        return this;
    }

    public CreateBusinessErrorIndustryCodes withMcc(Optional<String> mcc) {
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
        CreateBusinessErrorIndustryCodes other = (CreateBusinessErrorIndustryCodes) o;
        return 
            Objects.deepEquals(this.naics, other.naics) &&
            Objects.deepEquals(this.sic, other.sic) &&
            Objects.deepEquals(this.mcc, other.mcc);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            naics,
            sic,
            mcc);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateBusinessErrorIndustryCodes.class,
                "naics", naics,
                "sic", sic,
                "mcc", mcc);
    }
    
    public final static class Builder {
 
        private Optional<String> naics = Optional.empty();
 
        private Optional<String> sic = Optional.empty();
 
        private Optional<String> mcc = Optional.empty();
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder naics(String naics) {
            Utils.checkNotNull(naics, "naics");
            this.naics = Optional.ofNullable(naics);
            return this;
        }

        public Builder naics(Optional<String> naics) {
            Utils.checkNotNull(naics, "naics");
            this.naics = naics;
            return this;
        }

        public Builder sic(String sic) {
            Utils.checkNotNull(sic, "sic");
            this.sic = Optional.ofNullable(sic);
            return this;
        }

        public Builder sic(Optional<String> sic) {
            Utils.checkNotNull(sic, "sic");
            this.sic = sic;
            return this;
        }

        public Builder mcc(String mcc) {
            Utils.checkNotNull(mcc, "mcc");
            this.mcc = Optional.ofNullable(mcc);
            return this;
        }

        public Builder mcc(Optional<String> mcc) {
            Utils.checkNotNull(mcc, "mcc");
            this.mcc = mcc;
            return this;
        }
        
        public CreateBusinessErrorIndustryCodes build() {
            return new CreateBusinessErrorIndustryCodes(
                naics,
                sic,
                mcc);
        }
    }
}
