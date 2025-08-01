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
 * BrandColors
 * 
 * <p>Brand colors for light and dark modes.
 */
public class BrandColors {

    @JsonProperty("dark")
    private BrandColor dark;


    @JsonProperty("light")
    private BrandColor light;

    @JsonCreator
    public BrandColors(
            @JsonProperty("dark") BrandColor dark,
            @JsonProperty("light") BrandColor light) {
        Utils.checkNotNull(dark, "dark");
        Utils.checkNotNull(light, "light");
        this.dark = dark;
        this.light = light;
    }

    @JsonIgnore
    public BrandColor dark() {
        return dark;
    }

    @JsonIgnore
    public BrandColor light() {
        return light;
    }

    public static Builder builder() {
        return new Builder();
    }


    public BrandColors withDark(BrandColor dark) {
        Utils.checkNotNull(dark, "dark");
        this.dark = dark;
        return this;
    }

    public BrandColors withLight(BrandColor light) {
        Utils.checkNotNull(light, "light");
        this.light = light;
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
        BrandColors other = (BrandColors) o;
        return 
            Utils.enhancedDeepEquals(this.dark, other.dark) &&
            Utils.enhancedDeepEquals(this.light, other.light);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            dark, light);
    }
    
    @Override
    public String toString() {
        return Utils.toString(BrandColors.class,
                "dark", dark,
                "light", light);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private BrandColor dark;

        private BrandColor light;

        private Builder() {
          // force use of static builder() method
        }


        public Builder dark(BrandColor dark) {
            Utils.checkNotNull(dark, "dark");
            this.dark = dark;
            return this;
        }


        public Builder light(BrandColor light) {
            Utils.checkNotNull(light, "light");
            this.light = light;
            return this;
        }

        public BrandColors build() {

            return new BrandColors(
                dark, light);
        }

    }
}
