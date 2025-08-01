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
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.util.Optional;


public class AddressSuggestion {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("addressLine1")
    private Optional<String> addressLine1;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("addressLine2")
    private Optional<String> addressLine2;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("city")
    private Optional<String> city;

    /**
     * The number of units at an address. For example the number of apartments or businesses in a building.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("entries")
    private Optional<Long> entries;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("postalCode")
    private Optional<String> postalCode;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("stateOrProvince")
    private Optional<String> stateOrProvince;

    @JsonCreator
    public AddressSuggestion(
            @JsonProperty("addressLine1") Optional<String> addressLine1,
            @JsonProperty("addressLine2") Optional<String> addressLine2,
            @JsonProperty("city") Optional<String> city,
            @JsonProperty("entries") Optional<Long> entries,
            @JsonProperty("postalCode") Optional<String> postalCode,
            @JsonProperty("stateOrProvince") Optional<String> stateOrProvince) {
        Utils.checkNotNull(addressLine1, "addressLine1");
        Utils.checkNotNull(addressLine2, "addressLine2");
        Utils.checkNotNull(city, "city");
        Utils.checkNotNull(entries, "entries");
        Utils.checkNotNull(postalCode, "postalCode");
        Utils.checkNotNull(stateOrProvince, "stateOrProvince");
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.city = city;
        this.entries = entries;
        this.postalCode = postalCode;
        this.stateOrProvince = stateOrProvince;
    }
    
    public AddressSuggestion() {
        this(Optional.empty(), Optional.empty(), Optional.empty(),
            Optional.empty(), Optional.empty(), Optional.empty());
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

    /**
     * The number of units at an address. For example the number of apartments or businesses in a building.
     */
    @JsonIgnore
    public Optional<Long> entries() {
        return entries;
    }

    @JsonIgnore
    public Optional<String> postalCode() {
        return postalCode;
    }

    @JsonIgnore
    public Optional<String> stateOrProvince() {
        return stateOrProvince;
    }

    public static Builder builder() {
        return new Builder();
    }


    public AddressSuggestion withAddressLine1(String addressLine1) {
        Utils.checkNotNull(addressLine1, "addressLine1");
        this.addressLine1 = Optional.ofNullable(addressLine1);
        return this;
    }


    public AddressSuggestion withAddressLine1(Optional<String> addressLine1) {
        Utils.checkNotNull(addressLine1, "addressLine1");
        this.addressLine1 = addressLine1;
        return this;
    }

    public AddressSuggestion withAddressLine2(String addressLine2) {
        Utils.checkNotNull(addressLine2, "addressLine2");
        this.addressLine2 = Optional.ofNullable(addressLine2);
        return this;
    }


    public AddressSuggestion withAddressLine2(Optional<String> addressLine2) {
        Utils.checkNotNull(addressLine2, "addressLine2");
        this.addressLine2 = addressLine2;
        return this;
    }

    public AddressSuggestion withCity(String city) {
        Utils.checkNotNull(city, "city");
        this.city = Optional.ofNullable(city);
        return this;
    }


    public AddressSuggestion withCity(Optional<String> city) {
        Utils.checkNotNull(city, "city");
        this.city = city;
        return this;
    }

    /**
     * The number of units at an address. For example the number of apartments or businesses in a building.
     */
    public AddressSuggestion withEntries(long entries) {
        Utils.checkNotNull(entries, "entries");
        this.entries = Optional.ofNullable(entries);
        return this;
    }


    /**
     * The number of units at an address. For example the number of apartments or businesses in a building.
     */
    public AddressSuggestion withEntries(Optional<Long> entries) {
        Utils.checkNotNull(entries, "entries");
        this.entries = entries;
        return this;
    }

    public AddressSuggestion withPostalCode(String postalCode) {
        Utils.checkNotNull(postalCode, "postalCode");
        this.postalCode = Optional.ofNullable(postalCode);
        return this;
    }


    public AddressSuggestion withPostalCode(Optional<String> postalCode) {
        Utils.checkNotNull(postalCode, "postalCode");
        this.postalCode = postalCode;
        return this;
    }

    public AddressSuggestion withStateOrProvince(String stateOrProvince) {
        Utils.checkNotNull(stateOrProvince, "stateOrProvince");
        this.stateOrProvince = Optional.ofNullable(stateOrProvince);
        return this;
    }


    public AddressSuggestion withStateOrProvince(Optional<String> stateOrProvince) {
        Utils.checkNotNull(stateOrProvince, "stateOrProvince");
        this.stateOrProvince = stateOrProvince;
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
        AddressSuggestion other = (AddressSuggestion) o;
        return 
            Utils.enhancedDeepEquals(this.addressLine1, other.addressLine1) &&
            Utils.enhancedDeepEquals(this.addressLine2, other.addressLine2) &&
            Utils.enhancedDeepEquals(this.city, other.city) &&
            Utils.enhancedDeepEquals(this.entries, other.entries) &&
            Utils.enhancedDeepEquals(this.postalCode, other.postalCode) &&
            Utils.enhancedDeepEquals(this.stateOrProvince, other.stateOrProvince);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            addressLine1, addressLine2, city,
            entries, postalCode, stateOrProvince);
    }
    
    @Override
    public String toString() {
        return Utils.toString(AddressSuggestion.class,
                "addressLine1", addressLine1,
                "addressLine2", addressLine2,
                "city", city,
                "entries", entries,
                "postalCode", postalCode,
                "stateOrProvince", stateOrProvince);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private Optional<String> addressLine1 = Optional.empty();

        private Optional<String> addressLine2 = Optional.empty();

        private Optional<String> city = Optional.empty();

        private Optional<Long> entries = Optional.empty();

        private Optional<String> postalCode = Optional.empty();

        private Optional<String> stateOrProvince = Optional.empty();

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


        /**
         * The number of units at an address. For example the number of apartments or businesses in a building.
         */
        public Builder entries(long entries) {
            Utils.checkNotNull(entries, "entries");
            this.entries = Optional.ofNullable(entries);
            return this;
        }

        /**
         * The number of units at an address. For example the number of apartments or businesses in a building.
         */
        public Builder entries(Optional<Long> entries) {
            Utils.checkNotNull(entries, "entries");
            this.entries = entries;
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

        public AddressSuggestion build() {

            return new AddressSuggestion(
                addressLine1, addressLine2, city,
                entries, postalCode, stateOrProvince);
        }

    }
}
