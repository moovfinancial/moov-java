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

public class IssuingMerchantData {

    /**
     * External identifier used to identify the merchant with the card brand.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("networkID")
    private Optional<String> networkID;

    /**
     * Name of the merchant.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private Optional<String> name;

    /**
     * The merchant's location.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("city")
    private Optional<String> city;

    /**
     * Two-letter country code.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("country")
    private Optional<String> country;

    /**
     * The merchant's five-digit postal code.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("postalCode")
    private Optional<String> postalCode;

    /**
     * The merchant's two-letter state abbreviation.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("state")
    private Optional<String> state;

    /**
     * The Merchant Category Code.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("mcc")
    private Optional<String> mcc;

    @JsonCreator
    public IssuingMerchantData(
            @JsonProperty("networkID") Optional<String> networkID,
            @JsonProperty("name") Optional<String> name,
            @JsonProperty("city") Optional<String> city,
            @JsonProperty("country") Optional<String> country,
            @JsonProperty("postalCode") Optional<String> postalCode,
            @JsonProperty("state") Optional<String> state,
            @JsonProperty("mcc") Optional<String> mcc) {
        Utils.checkNotNull(networkID, "networkID");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(city, "city");
        Utils.checkNotNull(country, "country");
        Utils.checkNotNull(postalCode, "postalCode");
        Utils.checkNotNull(state, "state");
        Utils.checkNotNull(mcc, "mcc");
        this.networkID = networkID;
        this.name = name;
        this.city = city;
        this.country = country;
        this.postalCode = postalCode;
        this.state = state;
        this.mcc = mcc;
    }
    
    public IssuingMerchantData() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * External identifier used to identify the merchant with the card brand.
     */
    @JsonIgnore
    public Optional<String> networkID() {
        return networkID;
    }

    /**
     * Name of the merchant.
     */
    @JsonIgnore
    public Optional<String> name() {
        return name;
    }

    /**
     * The merchant's location.
     */
    @JsonIgnore
    public Optional<String> city() {
        return city;
    }

    /**
     * Two-letter country code.
     */
    @JsonIgnore
    public Optional<String> country() {
        return country;
    }

    /**
     * The merchant's five-digit postal code.
     */
    @JsonIgnore
    public Optional<String> postalCode() {
        return postalCode;
    }

    /**
     * The merchant's two-letter state abbreviation.
     */
    @JsonIgnore
    public Optional<String> state() {
        return state;
    }

    /**
     * The Merchant Category Code.
     */
    @JsonIgnore
    public Optional<String> mcc() {
        return mcc;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * External identifier used to identify the merchant with the card brand.
     */
    public IssuingMerchantData withNetworkID(String networkID) {
        Utils.checkNotNull(networkID, "networkID");
        this.networkID = Optional.ofNullable(networkID);
        return this;
    }

    /**
     * External identifier used to identify the merchant with the card brand.
     */
    public IssuingMerchantData withNetworkID(Optional<String> networkID) {
        Utils.checkNotNull(networkID, "networkID");
        this.networkID = networkID;
        return this;
    }

    /**
     * Name of the merchant.
     */
    public IssuingMerchantData withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = Optional.ofNullable(name);
        return this;
    }

    /**
     * Name of the merchant.
     */
    public IssuingMerchantData withName(Optional<String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    /**
     * The merchant's location.
     */
    public IssuingMerchantData withCity(String city) {
        Utils.checkNotNull(city, "city");
        this.city = Optional.ofNullable(city);
        return this;
    }

    /**
     * The merchant's location.
     */
    public IssuingMerchantData withCity(Optional<String> city) {
        Utils.checkNotNull(city, "city");
        this.city = city;
        return this;
    }

    /**
     * Two-letter country code.
     */
    public IssuingMerchantData withCountry(String country) {
        Utils.checkNotNull(country, "country");
        this.country = Optional.ofNullable(country);
        return this;
    }

    /**
     * Two-letter country code.
     */
    public IssuingMerchantData withCountry(Optional<String> country) {
        Utils.checkNotNull(country, "country");
        this.country = country;
        return this;
    }

    /**
     * The merchant's five-digit postal code.
     */
    public IssuingMerchantData withPostalCode(String postalCode) {
        Utils.checkNotNull(postalCode, "postalCode");
        this.postalCode = Optional.ofNullable(postalCode);
        return this;
    }

    /**
     * The merchant's five-digit postal code.
     */
    public IssuingMerchantData withPostalCode(Optional<String> postalCode) {
        Utils.checkNotNull(postalCode, "postalCode");
        this.postalCode = postalCode;
        return this;
    }

    /**
     * The merchant's two-letter state abbreviation.
     */
    public IssuingMerchantData withState(String state) {
        Utils.checkNotNull(state, "state");
        this.state = Optional.ofNullable(state);
        return this;
    }

    /**
     * The merchant's two-letter state abbreviation.
     */
    public IssuingMerchantData withState(Optional<String> state) {
        Utils.checkNotNull(state, "state");
        this.state = state;
        return this;
    }

    /**
     * The Merchant Category Code.
     */
    public IssuingMerchantData withMcc(String mcc) {
        Utils.checkNotNull(mcc, "mcc");
        this.mcc = Optional.ofNullable(mcc);
        return this;
    }

    /**
     * The Merchant Category Code.
     */
    public IssuingMerchantData withMcc(Optional<String> mcc) {
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
        IssuingMerchantData other = (IssuingMerchantData) o;
        return 
            Objects.deepEquals(this.networkID, other.networkID) &&
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.city, other.city) &&
            Objects.deepEquals(this.country, other.country) &&
            Objects.deepEquals(this.postalCode, other.postalCode) &&
            Objects.deepEquals(this.state, other.state) &&
            Objects.deepEquals(this.mcc, other.mcc);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            networkID,
            name,
            city,
            country,
            postalCode,
            state,
            mcc);
    }
    
    @Override
    public String toString() {
        return Utils.toString(IssuingMerchantData.class,
                "networkID", networkID,
                "name", name,
                "city", city,
                "country", country,
                "postalCode", postalCode,
                "state", state,
                "mcc", mcc);
    }
    
    public final static class Builder {
 
        private Optional<String> networkID = Optional.empty();
 
        private Optional<String> name = Optional.empty();
 
        private Optional<String> city = Optional.empty();
 
        private Optional<String> country = Optional.empty();
 
        private Optional<String> postalCode = Optional.empty();
 
        private Optional<String> state = Optional.empty();
 
        private Optional<String> mcc = Optional.empty();
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * External identifier used to identify the merchant with the card brand.
         */
        public Builder networkID(String networkID) {
            Utils.checkNotNull(networkID, "networkID");
            this.networkID = Optional.ofNullable(networkID);
            return this;
        }

        /**
         * External identifier used to identify the merchant with the card brand.
         */
        public Builder networkID(Optional<String> networkID) {
            Utils.checkNotNull(networkID, "networkID");
            this.networkID = networkID;
            return this;
        }

        /**
         * Name of the merchant.
         */
        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = Optional.ofNullable(name);
            return this;
        }

        /**
         * Name of the merchant.
         */
        public Builder name(Optional<String> name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        /**
         * The merchant's location.
         */
        public Builder city(String city) {
            Utils.checkNotNull(city, "city");
            this.city = Optional.ofNullable(city);
            return this;
        }

        /**
         * The merchant's location.
         */
        public Builder city(Optional<String> city) {
            Utils.checkNotNull(city, "city");
            this.city = city;
            return this;
        }

        /**
         * Two-letter country code.
         */
        public Builder country(String country) {
            Utils.checkNotNull(country, "country");
            this.country = Optional.ofNullable(country);
            return this;
        }

        /**
         * Two-letter country code.
         */
        public Builder country(Optional<String> country) {
            Utils.checkNotNull(country, "country");
            this.country = country;
            return this;
        }

        /**
         * The merchant's five-digit postal code.
         */
        public Builder postalCode(String postalCode) {
            Utils.checkNotNull(postalCode, "postalCode");
            this.postalCode = Optional.ofNullable(postalCode);
            return this;
        }

        /**
         * The merchant's five-digit postal code.
         */
        public Builder postalCode(Optional<String> postalCode) {
            Utils.checkNotNull(postalCode, "postalCode");
            this.postalCode = postalCode;
            return this;
        }

        /**
         * The merchant's two-letter state abbreviation.
         */
        public Builder state(String state) {
            Utils.checkNotNull(state, "state");
            this.state = Optional.ofNullable(state);
            return this;
        }

        /**
         * The merchant's two-letter state abbreviation.
         */
        public Builder state(Optional<String> state) {
            Utils.checkNotNull(state, "state");
            this.state = state;
            return this;
        }

        /**
         * The Merchant Category Code.
         */
        public Builder mcc(String mcc) {
            Utils.checkNotNull(mcc, "mcc");
            this.mcc = Optional.ofNullable(mcc);
            return this;
        }

        /**
         * The Merchant Category Code.
         */
        public Builder mcc(Optional<String> mcc) {
            Utils.checkNotNull(mcc, "mcc");
            this.mcc = mcc;
            return this;
        }
        
        public IssuingMerchantData build() {
            return new IssuingMerchantData(
                networkID,
                name,
                city,
                country,
                postalCode,
                state,
                mcc);
        }
    }
}
