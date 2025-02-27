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
 * CardExpiration - The expiration date of the card or token.
 */

public class CardExpiration {

    @JsonProperty("month")
    private String month;

    @JsonProperty("year")
    private String year;

    @JsonCreator
    public CardExpiration(
            @JsonProperty("month") String month,
            @JsonProperty("year") String year) {
        Utils.checkNotNull(month, "month");
        Utils.checkNotNull(year, "year");
        this.month = month;
        this.year = year;
    }

    @JsonIgnore
    public String month() {
        return month;
    }

    @JsonIgnore
    public String year() {
        return year;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public CardExpiration withMonth(String month) {
        Utils.checkNotNull(month, "month");
        this.month = month;
        return this;
    }

    public CardExpiration withYear(String year) {
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
        CardExpiration other = (CardExpiration) o;
        return 
            Objects.deepEquals(this.month, other.month) &&
            Objects.deepEquals(this.year, other.year);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            month,
            year);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CardExpiration.class,
                "month", month,
                "year", year);
    }
    
    public final static class Builder {
 
        private String month;
 
        private String year;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder month(String month) {
            Utils.checkNotNull(month, "month");
            this.month = month;
            return this;
        }

        public Builder year(String year) {
            Utils.checkNotNull(year, "year");
            this.year = year;
            return this;
        }
        
        public CardExpiration build() {
            return new CardExpiration(
                month,
                year);
        }
    }
}

