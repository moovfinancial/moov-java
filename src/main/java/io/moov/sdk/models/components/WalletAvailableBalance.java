/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.moov.sdk.models.components;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.moov.sdk.utils.Utils;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class WalletAvailableBalance {

    /**
     * A 3-letter ISO 4217 currency code.
     */
    @JsonProperty("currency")
    private String currency;

    /**
     * Quantity in the smallest unit of the specified currency. 
     * 
     * In USD this is cents, for example, $12.04 is 1204 and $0.99 is 99.
     */
    @JsonProperty("value")
    private long value;

    @JsonProperty("valueDecimal")
    private String valueDecimal;

    @JsonCreator
    public WalletAvailableBalance(
            @JsonProperty("currency") String currency,
            @JsonProperty("value") long value,
            @JsonProperty("valueDecimal") String valueDecimal) {
        Utils.checkNotNull(currency, "currency");
        Utils.checkNotNull(value, "value");
        Utils.checkNotNull(valueDecimal, "valueDecimal");
        this.currency = currency;
        this.value = value;
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
     * Quantity in the smallest unit of the specified currency. 
     * 
     * In USD this is cents, for example, $12.04 is 1204 and $0.99 is 99.
     */
    @JsonIgnore
    public long value() {
        return value;
    }

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
    public WalletAvailableBalance withCurrency(String currency) {
        Utils.checkNotNull(currency, "currency");
        this.currency = currency;
        return this;
    }

    /**
     * Quantity in the smallest unit of the specified currency. 
     * 
     * In USD this is cents, for example, $12.04 is 1204 and $0.99 is 99.
     */
    public WalletAvailableBalance withValue(long value) {
        Utils.checkNotNull(value, "value");
        this.value = value;
        return this;
    }

    public WalletAvailableBalance withValueDecimal(String valueDecimal) {
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
        WalletAvailableBalance other = (WalletAvailableBalance) o;
        return 
            Objects.deepEquals(this.currency, other.currency) &&
            Objects.deepEquals(this.value, other.value) &&
            Objects.deepEquals(this.valueDecimal, other.valueDecimal);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            currency,
            value,
            valueDecimal);
    }
    
    @Override
    public String toString() {
        return Utils.toString(WalletAvailableBalance.class,
                "currency", currency,
                "value", value,
                "valueDecimal", valueDecimal);
    }
    
    public final static class Builder {
 
        private String currency;
 
        private Long value;
 
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
         * Quantity in the smallest unit of the specified currency. 
         * 
         * In USD this is cents, for example, $12.04 is 1204 and $0.99 is 99.
         */
        public Builder value(long value) {
            Utils.checkNotNull(value, "value");
            this.value = value;
            return this;
        }

        public Builder valueDecimal(String valueDecimal) {
            Utils.checkNotNull(valueDecimal, "valueDecimal");
            this.valueDecimal = valueDecimal;
            return this;
        }
        
        public WalletAvailableBalance build() {
            return new WalletAvailableBalance(
                currency,
                value,
                valueDecimal);
        }
    }
}

