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
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;

/**
 * TerminalCard - Describes payment card details captured with tap or in-person payment.
 */

public class TerminalCard {

    /**
     * How the card information was entered into the point of sale terminal.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("entryMode")
    private Optional<? extends EntryMode> entryMode;

    /**
     * The card brand.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("brand")
    private Optional<? extends CardBrand> brand;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("bin")
    private Optional<String> bin;

    /**
     * The type of the card.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("cardType")
    private Optional<? extends CardType> cardType;

    /**
     * The expiration date of the card or token.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("expiration")
    private Optional<? extends CardExpiration> expiration;

    /**
     * Uniquely identifies a linked payment card or token.
     * For Apple Pay, the fingerprint is based on the tokenized card number and may vary based on the user's device.
     * This field can be used to identify specific payment methods across multiple accounts on your platform.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("fingerprint")
    private Optional<String> fingerprint;

    /**
     * The name of the cardholder as it appears on the card.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("holderName")
    private Optional<String> holderName;

    /**
     * Financial institution that issued the card.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("issuer")
    private Optional<String> issuer;

    /**
     * Country where the card was issued.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("issuerCountry")
    private Optional<String> issuerCountry;

    /**
     * Last four digits of the card number
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("lastFourCardNumber")
    private Optional<String> lastFourCardNumber;

    @JsonCreator
    public TerminalCard(
            @JsonProperty("entryMode") Optional<? extends EntryMode> entryMode,
            @JsonProperty("brand") Optional<? extends CardBrand> brand,
            @JsonProperty("bin") Optional<String> bin,
            @JsonProperty("cardType") Optional<? extends CardType> cardType,
            @JsonProperty("expiration") Optional<? extends CardExpiration> expiration,
            @JsonProperty("fingerprint") Optional<String> fingerprint,
            @JsonProperty("holderName") Optional<String> holderName,
            @JsonProperty("issuer") Optional<String> issuer,
            @JsonProperty("issuerCountry") Optional<String> issuerCountry,
            @JsonProperty("lastFourCardNumber") Optional<String> lastFourCardNumber) {
        Utils.checkNotNull(entryMode, "entryMode");
        Utils.checkNotNull(brand, "brand");
        Utils.checkNotNull(bin, "bin");
        Utils.checkNotNull(cardType, "cardType");
        Utils.checkNotNull(expiration, "expiration");
        Utils.checkNotNull(fingerprint, "fingerprint");
        Utils.checkNotNull(holderName, "holderName");
        Utils.checkNotNull(issuer, "issuer");
        Utils.checkNotNull(issuerCountry, "issuerCountry");
        Utils.checkNotNull(lastFourCardNumber, "lastFourCardNumber");
        this.entryMode = entryMode;
        this.brand = brand;
        this.bin = bin;
        this.cardType = cardType;
        this.expiration = expiration;
        this.fingerprint = fingerprint;
        this.holderName = holderName;
        this.issuer = issuer;
        this.issuerCountry = issuerCountry;
        this.lastFourCardNumber = lastFourCardNumber;
    }
    
    public TerminalCard() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * How the card information was entered into the point of sale terminal.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<EntryMode> entryMode() {
        return (Optional<EntryMode>) entryMode;
    }

    /**
     * The card brand.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<CardBrand> brand() {
        return (Optional<CardBrand>) brand;
    }

    @JsonIgnore
    public Optional<String> bin() {
        return bin;
    }

    /**
     * The type of the card.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<CardType> cardType() {
        return (Optional<CardType>) cardType;
    }

    /**
     * The expiration date of the card or token.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<CardExpiration> expiration() {
        return (Optional<CardExpiration>) expiration;
    }

    /**
     * Uniquely identifies a linked payment card or token.
     * For Apple Pay, the fingerprint is based on the tokenized card number and may vary based on the user's device.
     * This field can be used to identify specific payment methods across multiple accounts on your platform.
     */
    @JsonIgnore
    public Optional<String> fingerprint() {
        return fingerprint;
    }

    /**
     * The name of the cardholder as it appears on the card.
     */
    @JsonIgnore
    public Optional<String> holderName() {
        return holderName;
    }

    /**
     * Financial institution that issued the card.
     */
    @JsonIgnore
    public Optional<String> issuer() {
        return issuer;
    }

    /**
     * Country where the card was issued.
     */
    @JsonIgnore
    public Optional<String> issuerCountry() {
        return issuerCountry;
    }

    /**
     * Last four digits of the card number
     */
    @JsonIgnore
    public Optional<String> lastFourCardNumber() {
        return lastFourCardNumber;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * How the card information was entered into the point of sale terminal.
     */
    public TerminalCard withEntryMode(EntryMode entryMode) {
        Utils.checkNotNull(entryMode, "entryMode");
        this.entryMode = Optional.ofNullable(entryMode);
        return this;
    }

    /**
     * How the card information was entered into the point of sale terminal.
     */
    public TerminalCard withEntryMode(Optional<? extends EntryMode> entryMode) {
        Utils.checkNotNull(entryMode, "entryMode");
        this.entryMode = entryMode;
        return this;
    }

    /**
     * The card brand.
     */
    public TerminalCard withBrand(CardBrand brand) {
        Utils.checkNotNull(brand, "brand");
        this.brand = Optional.ofNullable(brand);
        return this;
    }

    /**
     * The card brand.
     */
    public TerminalCard withBrand(Optional<? extends CardBrand> brand) {
        Utils.checkNotNull(brand, "brand");
        this.brand = brand;
        return this;
    }

    public TerminalCard withBin(String bin) {
        Utils.checkNotNull(bin, "bin");
        this.bin = Optional.ofNullable(bin);
        return this;
    }

    public TerminalCard withBin(Optional<String> bin) {
        Utils.checkNotNull(bin, "bin");
        this.bin = bin;
        return this;
    }

    /**
     * The type of the card.
     */
    public TerminalCard withCardType(CardType cardType) {
        Utils.checkNotNull(cardType, "cardType");
        this.cardType = Optional.ofNullable(cardType);
        return this;
    }

    /**
     * The type of the card.
     */
    public TerminalCard withCardType(Optional<? extends CardType> cardType) {
        Utils.checkNotNull(cardType, "cardType");
        this.cardType = cardType;
        return this;
    }

    /**
     * The expiration date of the card or token.
     */
    public TerminalCard withExpiration(CardExpiration expiration) {
        Utils.checkNotNull(expiration, "expiration");
        this.expiration = Optional.ofNullable(expiration);
        return this;
    }

    /**
     * The expiration date of the card or token.
     */
    public TerminalCard withExpiration(Optional<? extends CardExpiration> expiration) {
        Utils.checkNotNull(expiration, "expiration");
        this.expiration = expiration;
        return this;
    }

    /**
     * Uniquely identifies a linked payment card or token.
     * For Apple Pay, the fingerprint is based on the tokenized card number and may vary based on the user's device.
     * This field can be used to identify specific payment methods across multiple accounts on your platform.
     */
    public TerminalCard withFingerprint(String fingerprint) {
        Utils.checkNotNull(fingerprint, "fingerprint");
        this.fingerprint = Optional.ofNullable(fingerprint);
        return this;
    }

    /**
     * Uniquely identifies a linked payment card or token.
     * For Apple Pay, the fingerprint is based on the tokenized card number and may vary based on the user's device.
     * This field can be used to identify specific payment methods across multiple accounts on your platform.
     */
    public TerminalCard withFingerprint(Optional<String> fingerprint) {
        Utils.checkNotNull(fingerprint, "fingerprint");
        this.fingerprint = fingerprint;
        return this;
    }

    /**
     * The name of the cardholder as it appears on the card.
     */
    public TerminalCard withHolderName(String holderName) {
        Utils.checkNotNull(holderName, "holderName");
        this.holderName = Optional.ofNullable(holderName);
        return this;
    }

    /**
     * The name of the cardholder as it appears on the card.
     */
    public TerminalCard withHolderName(Optional<String> holderName) {
        Utils.checkNotNull(holderName, "holderName");
        this.holderName = holderName;
        return this;
    }

    /**
     * Financial institution that issued the card.
     */
    public TerminalCard withIssuer(String issuer) {
        Utils.checkNotNull(issuer, "issuer");
        this.issuer = Optional.ofNullable(issuer);
        return this;
    }

    /**
     * Financial institution that issued the card.
     */
    public TerminalCard withIssuer(Optional<String> issuer) {
        Utils.checkNotNull(issuer, "issuer");
        this.issuer = issuer;
        return this;
    }

    /**
     * Country where the card was issued.
     */
    public TerminalCard withIssuerCountry(String issuerCountry) {
        Utils.checkNotNull(issuerCountry, "issuerCountry");
        this.issuerCountry = Optional.ofNullable(issuerCountry);
        return this;
    }

    /**
     * Country where the card was issued.
     */
    public TerminalCard withIssuerCountry(Optional<String> issuerCountry) {
        Utils.checkNotNull(issuerCountry, "issuerCountry");
        this.issuerCountry = issuerCountry;
        return this;
    }

    /**
     * Last four digits of the card number
     */
    public TerminalCard withLastFourCardNumber(String lastFourCardNumber) {
        Utils.checkNotNull(lastFourCardNumber, "lastFourCardNumber");
        this.lastFourCardNumber = Optional.ofNullable(lastFourCardNumber);
        return this;
    }

    /**
     * Last four digits of the card number
     */
    public TerminalCard withLastFourCardNumber(Optional<String> lastFourCardNumber) {
        Utils.checkNotNull(lastFourCardNumber, "lastFourCardNumber");
        this.lastFourCardNumber = lastFourCardNumber;
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
        TerminalCard other = (TerminalCard) o;
        return 
            Objects.deepEquals(this.entryMode, other.entryMode) &&
            Objects.deepEquals(this.brand, other.brand) &&
            Objects.deepEquals(this.bin, other.bin) &&
            Objects.deepEquals(this.cardType, other.cardType) &&
            Objects.deepEquals(this.expiration, other.expiration) &&
            Objects.deepEquals(this.fingerprint, other.fingerprint) &&
            Objects.deepEquals(this.holderName, other.holderName) &&
            Objects.deepEquals(this.issuer, other.issuer) &&
            Objects.deepEquals(this.issuerCountry, other.issuerCountry) &&
            Objects.deepEquals(this.lastFourCardNumber, other.lastFourCardNumber);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            entryMode,
            brand,
            bin,
            cardType,
            expiration,
            fingerprint,
            holderName,
            issuer,
            issuerCountry,
            lastFourCardNumber);
    }
    
    @Override
    public String toString() {
        return Utils.toString(TerminalCard.class,
                "entryMode", entryMode,
                "brand", brand,
                "bin", bin,
                "cardType", cardType,
                "expiration", expiration,
                "fingerprint", fingerprint,
                "holderName", holderName,
                "issuer", issuer,
                "issuerCountry", issuerCountry,
                "lastFourCardNumber", lastFourCardNumber);
    }
    
    public final static class Builder {
 
        private Optional<? extends EntryMode> entryMode = Optional.empty();
 
        private Optional<? extends CardBrand> brand = Optional.empty();
 
        private Optional<String> bin = Optional.empty();
 
        private Optional<? extends CardType> cardType = Optional.empty();
 
        private Optional<? extends CardExpiration> expiration = Optional.empty();
 
        private Optional<String> fingerprint = Optional.empty();
 
        private Optional<String> holderName = Optional.empty();
 
        private Optional<String> issuer = Optional.empty();
 
        private Optional<String> issuerCountry = Optional.empty();
 
        private Optional<String> lastFourCardNumber = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * How the card information was entered into the point of sale terminal.
         */
        public Builder entryMode(EntryMode entryMode) {
            Utils.checkNotNull(entryMode, "entryMode");
            this.entryMode = Optional.ofNullable(entryMode);
            return this;
        }

        /**
         * How the card information was entered into the point of sale terminal.
         */
        public Builder entryMode(Optional<? extends EntryMode> entryMode) {
            Utils.checkNotNull(entryMode, "entryMode");
            this.entryMode = entryMode;
            return this;
        }

        /**
         * The card brand.
         */
        public Builder brand(CardBrand brand) {
            Utils.checkNotNull(brand, "brand");
            this.brand = Optional.ofNullable(brand);
            return this;
        }

        /**
         * The card brand.
         */
        public Builder brand(Optional<? extends CardBrand> brand) {
            Utils.checkNotNull(brand, "brand");
            this.brand = brand;
            return this;
        }

        public Builder bin(String bin) {
            Utils.checkNotNull(bin, "bin");
            this.bin = Optional.ofNullable(bin);
            return this;
        }

        public Builder bin(Optional<String> bin) {
            Utils.checkNotNull(bin, "bin");
            this.bin = bin;
            return this;
        }

        /**
         * The type of the card.
         */
        public Builder cardType(CardType cardType) {
            Utils.checkNotNull(cardType, "cardType");
            this.cardType = Optional.ofNullable(cardType);
            return this;
        }

        /**
         * The type of the card.
         */
        public Builder cardType(Optional<? extends CardType> cardType) {
            Utils.checkNotNull(cardType, "cardType");
            this.cardType = cardType;
            return this;
        }

        /**
         * The expiration date of the card or token.
         */
        public Builder expiration(CardExpiration expiration) {
            Utils.checkNotNull(expiration, "expiration");
            this.expiration = Optional.ofNullable(expiration);
            return this;
        }

        /**
         * The expiration date of the card or token.
         */
        public Builder expiration(Optional<? extends CardExpiration> expiration) {
            Utils.checkNotNull(expiration, "expiration");
            this.expiration = expiration;
            return this;
        }

        /**
         * Uniquely identifies a linked payment card or token.
         * For Apple Pay, the fingerprint is based on the tokenized card number and may vary based on the user's device.
         * This field can be used to identify specific payment methods across multiple accounts on your platform.
         */
        public Builder fingerprint(String fingerprint) {
            Utils.checkNotNull(fingerprint, "fingerprint");
            this.fingerprint = Optional.ofNullable(fingerprint);
            return this;
        }

        /**
         * Uniquely identifies a linked payment card or token.
         * For Apple Pay, the fingerprint is based on the tokenized card number and may vary based on the user's device.
         * This field can be used to identify specific payment methods across multiple accounts on your platform.
         */
        public Builder fingerprint(Optional<String> fingerprint) {
            Utils.checkNotNull(fingerprint, "fingerprint");
            this.fingerprint = fingerprint;
            return this;
        }

        /**
         * The name of the cardholder as it appears on the card.
         */
        public Builder holderName(String holderName) {
            Utils.checkNotNull(holderName, "holderName");
            this.holderName = Optional.ofNullable(holderName);
            return this;
        }

        /**
         * The name of the cardholder as it appears on the card.
         */
        public Builder holderName(Optional<String> holderName) {
            Utils.checkNotNull(holderName, "holderName");
            this.holderName = holderName;
            return this;
        }

        /**
         * Financial institution that issued the card.
         */
        public Builder issuer(String issuer) {
            Utils.checkNotNull(issuer, "issuer");
            this.issuer = Optional.ofNullable(issuer);
            return this;
        }

        /**
         * Financial institution that issued the card.
         */
        public Builder issuer(Optional<String> issuer) {
            Utils.checkNotNull(issuer, "issuer");
            this.issuer = issuer;
            return this;
        }

        /**
         * Country where the card was issued.
         */
        public Builder issuerCountry(String issuerCountry) {
            Utils.checkNotNull(issuerCountry, "issuerCountry");
            this.issuerCountry = Optional.ofNullable(issuerCountry);
            return this;
        }

        /**
         * Country where the card was issued.
         */
        public Builder issuerCountry(Optional<String> issuerCountry) {
            Utils.checkNotNull(issuerCountry, "issuerCountry");
            this.issuerCountry = issuerCountry;
            return this;
        }

        /**
         * Last four digits of the card number
         */
        public Builder lastFourCardNumber(String lastFourCardNumber) {
            Utils.checkNotNull(lastFourCardNumber, "lastFourCardNumber");
            this.lastFourCardNumber = Optional.ofNullable(lastFourCardNumber);
            return this;
        }

        /**
         * Last four digits of the card number
         */
        public Builder lastFourCardNumber(Optional<String> lastFourCardNumber) {
            Utils.checkNotNull(lastFourCardNumber, "lastFourCardNumber");
            this.lastFourCardNumber = lastFourCardNumber;
            return this;
        }
        
        public TerminalCard build() {
            return new TerminalCard(
                entryMode,
                brand,
                bin,
                cardType,
                expiration,
                fingerprint,
                holderName,
                issuer,
                issuerCountry,
                lastFourCardNumber);
        }
    }
}

