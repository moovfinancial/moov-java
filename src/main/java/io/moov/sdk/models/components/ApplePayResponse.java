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
/**
 * ApplePayResponse - Describes an Apple Pay token on a Moov account.
 */

public class ApplePayResponse {

    /**
     * The card brand.
     */
    @JsonProperty("brand")
    private CardBrand brand;

    /**
     * The type of the card.
     */
    @JsonProperty("cardType")
    private CardType cardType;

    /**
     *   User-friendly name of the tokenized card returned by Apple.
     *   
     *   It usually contains the brand and the last four digits of the underlying card.
     *   There is no standard format.
     */
    @JsonProperty("cardDisplayName")
    private String cardDisplayName;

    /**
     * Uniquely identifies a linked payment card or token.
     * For Apple Pay, the fingerprint is based on the tokenized card number and may vary based on the user's device.
     * This field can be used to identify specific payment methods across multiple accounts on your platform.
     */
    @JsonProperty("fingerprint")
    private String fingerprint;

    /**
     * The expiration date of the card or token.
     */
    @JsonProperty("expiration")
    private CardExpiration expiration;

    /**
     * The last four digits of the Apple Pay token, which may differ from the tokenized card's last four digits.
     */
    @JsonProperty("dynamicLastFour")
    private String dynamicLastFour;

    /**
     * Country where the underlying card was issued.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("issuerCountry")
    private Optional<String> issuerCountry;

    @JsonCreator
    public ApplePayResponse(
            @JsonProperty("brand") CardBrand brand,
            @JsonProperty("cardType") CardType cardType,
            @JsonProperty("cardDisplayName") String cardDisplayName,
            @JsonProperty("fingerprint") String fingerprint,
            @JsonProperty("expiration") CardExpiration expiration,
            @JsonProperty("dynamicLastFour") String dynamicLastFour,
            @JsonProperty("issuerCountry") Optional<String> issuerCountry) {
        Utils.checkNotNull(brand, "brand");
        Utils.checkNotNull(cardType, "cardType");
        Utils.checkNotNull(cardDisplayName, "cardDisplayName");
        Utils.checkNotNull(fingerprint, "fingerprint");
        Utils.checkNotNull(expiration, "expiration");
        Utils.checkNotNull(dynamicLastFour, "dynamicLastFour");
        Utils.checkNotNull(issuerCountry, "issuerCountry");
        this.brand = brand;
        this.cardType = cardType;
        this.cardDisplayName = cardDisplayName;
        this.fingerprint = fingerprint;
        this.expiration = expiration;
        this.dynamicLastFour = dynamicLastFour;
        this.issuerCountry = issuerCountry;
    }
    
    public ApplePayResponse(
            CardBrand brand,
            CardType cardType,
            String cardDisplayName,
            String fingerprint,
            CardExpiration expiration,
            String dynamicLastFour) {
        this(brand, cardType, cardDisplayName, fingerprint, expiration, dynamicLastFour, Optional.empty());
    }

    /**
     * The card brand.
     */
    @JsonIgnore
    public CardBrand brand() {
        return brand;
    }

    /**
     * The type of the card.
     */
    @JsonIgnore
    public CardType cardType() {
        return cardType;
    }

    /**
     *   User-friendly name of the tokenized card returned by Apple.
     *   
     *   It usually contains the brand and the last four digits of the underlying card.
     *   There is no standard format.
     */
    @JsonIgnore
    public String cardDisplayName() {
        return cardDisplayName;
    }

    /**
     * Uniquely identifies a linked payment card or token.
     * For Apple Pay, the fingerprint is based on the tokenized card number and may vary based on the user's device.
     * This field can be used to identify specific payment methods across multiple accounts on your platform.
     */
    @JsonIgnore
    public String fingerprint() {
        return fingerprint;
    }

    /**
     * The expiration date of the card or token.
     */
    @JsonIgnore
    public CardExpiration expiration() {
        return expiration;
    }

    /**
     * The last four digits of the Apple Pay token, which may differ from the tokenized card's last four digits.
     */
    @JsonIgnore
    public String dynamicLastFour() {
        return dynamicLastFour;
    }

    /**
     * Country where the underlying card was issued.
     */
    @JsonIgnore
    public Optional<String> issuerCountry() {
        return issuerCountry;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The card brand.
     */
    public ApplePayResponse withBrand(CardBrand brand) {
        Utils.checkNotNull(brand, "brand");
        this.brand = brand;
        return this;
    }

    /**
     * The type of the card.
     */
    public ApplePayResponse withCardType(CardType cardType) {
        Utils.checkNotNull(cardType, "cardType");
        this.cardType = cardType;
        return this;
    }

    /**
     *   User-friendly name of the tokenized card returned by Apple.
     *   
     *   It usually contains the brand and the last four digits of the underlying card.
     *   There is no standard format.
     */
    public ApplePayResponse withCardDisplayName(String cardDisplayName) {
        Utils.checkNotNull(cardDisplayName, "cardDisplayName");
        this.cardDisplayName = cardDisplayName;
        return this;
    }

    /**
     * Uniquely identifies a linked payment card or token.
     * For Apple Pay, the fingerprint is based on the tokenized card number and may vary based on the user's device.
     * This field can be used to identify specific payment methods across multiple accounts on your platform.
     */
    public ApplePayResponse withFingerprint(String fingerprint) {
        Utils.checkNotNull(fingerprint, "fingerprint");
        this.fingerprint = fingerprint;
        return this;
    }

    /**
     * The expiration date of the card or token.
     */
    public ApplePayResponse withExpiration(CardExpiration expiration) {
        Utils.checkNotNull(expiration, "expiration");
        this.expiration = expiration;
        return this;
    }

    /**
     * The last four digits of the Apple Pay token, which may differ from the tokenized card's last four digits.
     */
    public ApplePayResponse withDynamicLastFour(String dynamicLastFour) {
        Utils.checkNotNull(dynamicLastFour, "dynamicLastFour");
        this.dynamicLastFour = dynamicLastFour;
        return this;
    }

    /**
     * Country where the underlying card was issued.
     */
    public ApplePayResponse withIssuerCountry(String issuerCountry) {
        Utils.checkNotNull(issuerCountry, "issuerCountry");
        this.issuerCountry = Optional.ofNullable(issuerCountry);
        return this;
    }

    /**
     * Country where the underlying card was issued.
     */
    public ApplePayResponse withIssuerCountry(Optional<String> issuerCountry) {
        Utils.checkNotNull(issuerCountry, "issuerCountry");
        this.issuerCountry = issuerCountry;
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
        ApplePayResponse other = (ApplePayResponse) o;
        return 
            Objects.deepEquals(this.brand, other.brand) &&
            Objects.deepEquals(this.cardType, other.cardType) &&
            Objects.deepEquals(this.cardDisplayName, other.cardDisplayName) &&
            Objects.deepEquals(this.fingerprint, other.fingerprint) &&
            Objects.deepEquals(this.expiration, other.expiration) &&
            Objects.deepEquals(this.dynamicLastFour, other.dynamicLastFour) &&
            Objects.deepEquals(this.issuerCountry, other.issuerCountry);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            brand,
            cardType,
            cardDisplayName,
            fingerprint,
            expiration,
            dynamicLastFour,
            issuerCountry);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ApplePayResponse.class,
                "brand", brand,
                "cardType", cardType,
                "cardDisplayName", cardDisplayName,
                "fingerprint", fingerprint,
                "expiration", expiration,
                "dynamicLastFour", dynamicLastFour,
                "issuerCountry", issuerCountry);
    }
    
    public final static class Builder {
 
        private CardBrand brand;
 
        private CardType cardType;
 
        private String cardDisplayName;
 
        private String fingerprint;
 
        private CardExpiration expiration;
 
        private String dynamicLastFour;
 
        private Optional<String> issuerCountry = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The card brand.
         */
        public Builder brand(CardBrand brand) {
            Utils.checkNotNull(brand, "brand");
            this.brand = brand;
            return this;
        }

        /**
         * The type of the card.
         */
        public Builder cardType(CardType cardType) {
            Utils.checkNotNull(cardType, "cardType");
            this.cardType = cardType;
            return this;
        }

        /**
         *   User-friendly name of the tokenized card returned by Apple.
         *   
         *   It usually contains the brand and the last four digits of the underlying card.
         *   There is no standard format.
         */
        public Builder cardDisplayName(String cardDisplayName) {
            Utils.checkNotNull(cardDisplayName, "cardDisplayName");
            this.cardDisplayName = cardDisplayName;
            return this;
        }

        /**
         * Uniquely identifies a linked payment card or token.
         * For Apple Pay, the fingerprint is based on the tokenized card number and may vary based on the user's device.
         * This field can be used to identify specific payment methods across multiple accounts on your platform.
         */
        public Builder fingerprint(String fingerprint) {
            Utils.checkNotNull(fingerprint, "fingerprint");
            this.fingerprint = fingerprint;
            return this;
        }

        /**
         * The expiration date of the card or token.
         */
        public Builder expiration(CardExpiration expiration) {
            Utils.checkNotNull(expiration, "expiration");
            this.expiration = expiration;
            return this;
        }

        /**
         * The last four digits of the Apple Pay token, which may differ from the tokenized card's last four digits.
         */
        public Builder dynamicLastFour(String dynamicLastFour) {
            Utils.checkNotNull(dynamicLastFour, "dynamicLastFour");
            this.dynamicLastFour = dynamicLastFour;
            return this;
        }

        /**
         * Country where the underlying card was issued.
         */
        public Builder issuerCountry(String issuerCountry) {
            Utils.checkNotNull(issuerCountry, "issuerCountry");
            this.issuerCountry = Optional.ofNullable(issuerCountry);
            return this;
        }

        /**
         * Country where the underlying card was issued.
         */
        public Builder issuerCountry(Optional<String> issuerCountry) {
            Utils.checkNotNull(issuerCountry, "issuerCountry");
            this.issuerCountry = issuerCountry;
            return this;
        }
        
        public ApplePayResponse build() {
            return new ApplePayResponse(
                brand,
                cardType,
                cardDisplayName,
                fingerprint,
                expiration,
                dynamicLastFour,
                issuerCountry);
        }
    }
}

