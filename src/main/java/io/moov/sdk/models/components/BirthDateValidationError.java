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
import java.util.Optional;


public class BirthDateValidationError {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("day")
    private Optional<String> day;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("month")
    private Optional<String> month;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("year")
    private Optional<String> year;

    @JsonCreator
    public BirthDateValidationError(
            @JsonProperty("day") Optional<String> day,
            @JsonProperty("month") Optional<String> month,
            @JsonProperty("year") Optional<String> year) {
        Utils.checkNotNull(day, "day");
        Utils.checkNotNull(month, "month");
        Utils.checkNotNull(year, "year");
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    public BirthDateValidationError() {
        this(Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<String> day() {
        return day;
    }

    @JsonIgnore
    public Optional<String> month() {
        return month;
    }

    @JsonIgnore
    public Optional<String> year() {
        return year;
    }

    public static Builder builder() {
        return new Builder();
    }


    public BirthDateValidationError withDay(String day) {
        Utils.checkNotNull(day, "day");
        this.day = Optional.ofNullable(day);
        return this;
    }


    public BirthDateValidationError withDay(Optional<String> day) {
        Utils.checkNotNull(day, "day");
        this.day = day;
        return this;
    }

    public BirthDateValidationError withMonth(String month) {
        Utils.checkNotNull(month, "month");
        this.month = Optional.ofNullable(month);
        return this;
    }


    public BirthDateValidationError withMonth(Optional<String> month) {
        Utils.checkNotNull(month, "month");
        this.month = month;
        return this;
    }

    public BirthDateValidationError withYear(String year) {
        Utils.checkNotNull(year, "year");
        this.year = Optional.ofNullable(year);
        return this;
    }


    public BirthDateValidationError withYear(Optional<String> year) {
        Utils.checkNotNull(year, "year");
        this.year = year;
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
        BirthDateValidationError other = (BirthDateValidationError) o;
        return 
            Utils.enhancedDeepEquals(this.day, other.day) &&
            Utils.enhancedDeepEquals(this.month, other.month) &&
            Utils.enhancedDeepEquals(this.year, other.year);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            day, month, year);
    }
    
    @Override
    public String toString() {
        return Utils.toString(BirthDateValidationError.class,
                "day", day,
                "month", month,
                "year", year);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private Optional<String> day = Optional.empty();

        private Optional<String> month = Optional.empty();

        private Optional<String> year = Optional.empty();

        private Builder() {
          // force use of static builder() method
        }


        public Builder day(String day) {
            Utils.checkNotNull(day, "day");
            this.day = Optional.ofNullable(day);
            return this;
        }

        public Builder day(Optional<String> day) {
            Utils.checkNotNull(day, "day");
            this.day = day;
            return this;
        }


        public Builder month(String month) {
            Utils.checkNotNull(month, "month");
            this.month = Optional.ofNullable(month);
            return this;
        }

        public Builder month(Optional<String> month) {
            Utils.checkNotNull(month, "month");
            this.month = month;
            return this;
        }


        public Builder year(String year) {
            Utils.checkNotNull(year, "year");
            this.year = Optional.ofNullable(year);
            return this;
        }

        public Builder year(Optional<String> year) {
            Utils.checkNotNull(year, "year");
            this.year = year;
            return this;
        }

        public BirthDateValidationError build() {

            return new BirthDateValidationError(
                day, month, year);
        }

    }
}
