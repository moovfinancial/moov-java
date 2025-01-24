/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.moov.openapi.models.components;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.moov.openapi.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class AmountDecimal {

    /**
     * A 3-letter ISO 4217 currency code.
     */
    @JsonProperty("currency")
    private String currency;

    /**
     * A decimal-formatted numerical string that represents up to 9 decimal place precision. 
     * 
     * For example, $12.987654321 is '12.987654321'.
     */
    @JsonProperty("valueDecimal")
    private String valueDecimal;

    @JsonCreator
    public AmountDecimal(
            @JsonProperty("currency") String currency,
            @JsonProperty("valueDecimal") String valueDecimal) {
        Utils.checkNotNull(currency, "currency");
        Utils.checkNotNull(valueDecimal, "valueDecimal");
        this.currency = currency;
        this.valueDecimal = valueDecimal;
    }

    /**
     * A 3-letter ISO 4217 currency code.
     */
    @JsonIgnore
    public String currency() {
        return currency;
    }

    /**
     * A decimal-formatted numerical string that represents up to 9 decimal place precision. 
     * 
     * For example, $12.987654321 is '12.987654321'.
     */
    @JsonIgnore
    public String valueDecimal() {
        return valueDecimal;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * A 3-letter ISO 4217 currency code.
     */
    public AmountDecimal withCurrency(String currency) {
        Utils.checkNotNull(currency, "currency");
        this.currency = currency;
        return this;
    }

    /**
     * A decimal-formatted numerical string that represents up to 9 decimal place precision. 
     * 
     * For example, $12.987654321 is '12.987654321'.
     */
    public AmountDecimal withValueDecimal(String valueDecimal) {
        Utils.checkNotNull(valueDecimal, "valueDecimal");
        this.valueDecimal = valueDecimal;
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
        AmountDecimal other = (AmountDecimal) o;
        return 
            Objects.deepEquals(this.currency, other.currency) &&
            Objects.deepEquals(this.valueDecimal, other.valueDecimal);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            currency,
            valueDecimal);
    }
    
    @Override
    public String toString() {
        return Utils.toString(AmountDecimal.class,
                "currency", currency,
                "valueDecimal", valueDecimal);
    }
    
    public final static class Builder {
 
        private String currency;
 
        private String valueDecimal;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * A 3-letter ISO 4217 currency code.
         */
        public Builder currency(String currency) {
            Utils.checkNotNull(currency, "currency");
            this.currency = currency;
            return this;
        }

        /**
         * A decimal-formatted numerical string that represents up to 9 decimal place precision. 
         * 
         * For example, $12.987654321 is '12.987654321'.
         */
        public Builder valueDecimal(String valueDecimal) {
            Utils.checkNotNull(valueDecimal, "valueDecimal");
            this.valueDecimal = valueDecimal;
            return this;
        }
        
        public AmountDecimal build() {
            return new AmountDecimal(
                currency,
                valueDecimal);
        }
    }
}

