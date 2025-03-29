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

public class Phone {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("number")
    private Optional<String> number;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("countryCode")
    private Optional<String> countryCode;

    @JsonCreator
    public Phone(
            @JsonProperty("number") Optional<String> number,
            @JsonProperty("countryCode") Optional<String> countryCode) {
        Utils.checkNotNull(number, "number");
        Utils.checkNotNull(countryCode, "countryCode");
        this.number = number;
        this.countryCode = countryCode;
    }
    
    public Phone() {
        this(Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<String> number() {
        return number;
    }

    @JsonIgnore
    public Optional<String> countryCode() {
        return countryCode;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public Phone withNumber(String number) {
        Utils.checkNotNull(number, "number");
        this.number = Optional.ofNullable(number);
        return this;
    }

    public Phone withNumber(Optional<String> number) {
        Utils.checkNotNull(number, "number");
        this.number = number;
        return this;
    }

    public Phone withCountryCode(String countryCode) {
        Utils.checkNotNull(countryCode, "countryCode");
        this.countryCode = Optional.ofNullable(countryCode);
        return this;
    }

    public Phone withCountryCode(Optional<String> countryCode) {
        Utils.checkNotNull(countryCode, "countryCode");
        this.countryCode = countryCode;
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
        Phone other = (Phone) o;
        return 
            Objects.deepEquals(this.number, other.number) &&
            Objects.deepEquals(this.countryCode, other.countryCode);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            number,
            countryCode);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Phone.class,
                "number", number,
                "countryCode", countryCode);
    }
    
    public final static class Builder {
 
        private Optional<String> number = Optional.empty();
 
        private Optional<String> countryCode = Optional.empty();
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder number(String number) {
            Utils.checkNotNull(number, "number");
            this.number = Optional.ofNullable(number);
            return this;
        }

        public Builder number(Optional<String> number) {
            Utils.checkNotNull(number, "number");
            this.number = number;
            return this;
        }

        public Builder countryCode(String countryCode) {
            Utils.checkNotNull(countryCode, "countryCode");
            this.countryCode = Optional.ofNullable(countryCode);
            return this;
        }

        public Builder countryCode(Optional<String> countryCode) {
            Utils.checkNotNull(countryCode, "countryCode");
            this.countryCode = countryCode;
            return this;
        }
        
        public Phone build() {
            return new Phone(
                number,
                countryCode);
        }
    }
}
