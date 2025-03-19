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


public class UpdateCardAddress {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("addressLine1")
    private Optional<String> addressLine1;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("addressLine2")
    private Optional<String> addressLine2;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("city")
    private Optional<String> city;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("stateOrProvince")
    private Optional<String> stateOrProvince;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("postalCode")
    private Optional<String> postalCode;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("country")
    private Optional<String> country;

    @JsonCreator
    public UpdateCardAddress(
            @JsonProperty("addressLine1") Optional<String> addressLine1,
            @JsonProperty("addressLine2") Optional<String> addressLine2,
            @JsonProperty("city") Optional<String> city,
            @JsonProperty("stateOrProvince") Optional<String> stateOrProvince,
            @JsonProperty("postalCode") Optional<String> postalCode,
            @JsonProperty("country") Optional<String> country) {
        Utils.checkNotNull(addressLine1, "addressLine1");
        Utils.checkNotNull(addressLine2, "addressLine2");
        Utils.checkNotNull(city, "city");
        Utils.checkNotNull(stateOrProvince, "stateOrProvince");
        Utils.checkNotNull(postalCode, "postalCode");
        Utils.checkNotNull(country, "country");
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.city = city;
        this.stateOrProvince = stateOrProvince;
        this.postalCode = postalCode;
        this.country = country;
    }
    
    public UpdateCardAddress() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<String> addressLine1() {
        return addressLine1;
    }

    @JsonIgnore
    public Optional<String> addressLine2() {
        return addressLine2;
    }

    @JsonIgnore
    public Optional<String> city() {
        return city;
    }

    @JsonIgnore
    public Optional<String> stateOrProvince() {
        return stateOrProvince;
    }

    @JsonIgnore
    public Optional<String> postalCode() {
        return postalCode;
    }

    @JsonIgnore
    public Optional<String> country() {
        return country;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public UpdateCardAddress withAddressLine1(String addressLine1) {
        Utils.checkNotNull(addressLine1, "addressLine1");
        this.addressLine1 = Optional.ofNullable(addressLine1);
        return this;
    }

    public UpdateCardAddress withAddressLine1(Optional<String> addressLine1) {
        Utils.checkNotNull(addressLine1, "addressLine1");
        this.addressLine1 = addressLine1;
        return this;
    }

    public UpdateCardAddress withAddressLine2(String addressLine2) {
        Utils.checkNotNull(addressLine2, "addressLine2");
        this.addressLine2 = Optional.ofNullable(addressLine2);
        return this;
    }

    public UpdateCardAddress withAddressLine2(Optional<String> addressLine2) {
        Utils.checkNotNull(addressLine2, "addressLine2");
        this.addressLine2 = addressLine2;
        return this;
    }

    public UpdateCardAddress withCity(String city) {
        Utils.checkNotNull(city, "city");
        this.city = Optional.ofNullable(city);
        return this;
    }

    public UpdateCardAddress withCity(Optional<String> city) {
        Utils.checkNotNull(city, "city");
        this.city = city;
        return this;
    }

    public UpdateCardAddress withStateOrProvince(String stateOrProvince) {
        Utils.checkNotNull(stateOrProvince, "stateOrProvince");
        this.stateOrProvince = Optional.ofNullable(stateOrProvince);
        return this;
    }

    public UpdateCardAddress withStateOrProvince(Optional<String> stateOrProvince) {
        Utils.checkNotNull(stateOrProvince, "stateOrProvince");
        this.stateOrProvince = stateOrProvince;
        return this;
    }

    public UpdateCardAddress withPostalCode(String postalCode) {
        Utils.checkNotNull(postalCode, "postalCode");
        this.postalCode = Optional.ofNullable(postalCode);
        return this;
    }

    public UpdateCardAddress withPostalCode(Optional<String> postalCode) {
        Utils.checkNotNull(postalCode, "postalCode");
        this.postalCode = postalCode;
        return this;
    }

    public UpdateCardAddress withCountry(String country) {
        Utils.checkNotNull(country, "country");
        this.country = Optional.ofNullable(country);
        return this;
    }

    public UpdateCardAddress withCountry(Optional<String> country) {
        Utils.checkNotNull(country, "country");
        this.country = country;
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
        UpdateCardAddress other = (UpdateCardAddress) o;
        return 
            Objects.deepEquals(this.addressLine1, other.addressLine1) &&
            Objects.deepEquals(this.addressLine2, other.addressLine2) &&
            Objects.deepEquals(this.city, other.city) &&
            Objects.deepEquals(this.stateOrProvince, other.stateOrProvince) &&
            Objects.deepEquals(this.postalCode, other.postalCode) &&
            Objects.deepEquals(this.country, other.country);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            addressLine1,
            addressLine2,
            city,
            stateOrProvince,
            postalCode,
            country);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UpdateCardAddress.class,
                "addressLine1", addressLine1,
                "addressLine2", addressLine2,
                "city", city,
                "stateOrProvince", stateOrProvince,
                "postalCode", postalCode,
                "country", country);
    }
    
    public final static class Builder {
 
        private Optional<String> addressLine1 = Optional.empty();
 
        private Optional<String> addressLine2 = Optional.empty();
 
        private Optional<String> city = Optional.empty();
 
        private Optional<String> stateOrProvince = Optional.empty();
 
        private Optional<String> postalCode = Optional.empty();
 
        private Optional<String> country = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder addressLine1(String addressLine1) {
            Utils.checkNotNull(addressLine1, "addressLine1");
            this.addressLine1 = Optional.ofNullable(addressLine1);
            return this;
        }

        public Builder addressLine1(Optional<String> addressLine1) {
            Utils.checkNotNull(addressLine1, "addressLine1");
            this.addressLine1 = addressLine1;
            return this;
        }

        public Builder addressLine2(String addressLine2) {
            Utils.checkNotNull(addressLine2, "addressLine2");
            this.addressLine2 = Optional.ofNullable(addressLine2);
            return this;
        }

        public Builder addressLine2(Optional<String> addressLine2) {
            Utils.checkNotNull(addressLine2, "addressLine2");
            this.addressLine2 = addressLine2;
            return this;
        }

        public Builder city(String city) {
            Utils.checkNotNull(city, "city");
            this.city = Optional.ofNullable(city);
            return this;
        }

        public Builder city(Optional<String> city) {
            Utils.checkNotNull(city, "city");
            this.city = city;
            return this;
        }

        public Builder stateOrProvince(String stateOrProvince) {
            Utils.checkNotNull(stateOrProvince, "stateOrProvince");
            this.stateOrProvince = Optional.ofNullable(stateOrProvince);
            return this;
        }

        public Builder stateOrProvince(Optional<String> stateOrProvince) {
            Utils.checkNotNull(stateOrProvince, "stateOrProvince");
            this.stateOrProvince = stateOrProvince;
            return this;
        }

        public Builder postalCode(String postalCode) {
            Utils.checkNotNull(postalCode, "postalCode");
            this.postalCode = Optional.ofNullable(postalCode);
            return this;
        }

        public Builder postalCode(Optional<String> postalCode) {
            Utils.checkNotNull(postalCode, "postalCode");
            this.postalCode = postalCode;
            return this;
        }

        public Builder country(String country) {
            Utils.checkNotNull(country, "country");
            this.country = Optional.ofNullable(country);
            return this;
        }

        public Builder country(Optional<String> country) {
            Utils.checkNotNull(country, "country");
            this.country = country;
            return this;
        }
        
        public UpdateCardAddress build() {
            return new UpdateCardAddress(
                addressLine1,
                addressLine2,
                city,
                stateOrProvince,
                postalCode,
                country);
        }
    }
}

