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
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Optional;

/**
 * PaymentMethodsCard
 * 
 * <p>A card as contained within a payment method.
 */
public class PaymentMethodsCard {
    /**
     * ID of the card.
     */
    @JsonProperty("cardID")
    private String cardID;

    /**
     * Uniquely identifies a linked payment card or token.
     * For Apple Pay, the fingerprint is based on the tokenized card number and may vary based on the user's device.
     * This field can be used to identify specific payment methods across multiple accounts on your platform.
     */
    @JsonProperty("fingerprint")
    private String fingerprint;

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
     * Last four digits of the card number
     */
    @JsonProperty("lastFourCardNumber")
    private String lastFourCardNumber;

    /**
     * The first six to eight digits of the card number, which identifies the financial institution that issued the card.
     */
    @JsonProperty("bin")
    private String bin;

    /**
     * The expiration date of the card or token.
     */
    @JsonProperty("expiration")
    private CardExpiration expiration;

    /**
     * The name of the cardholder as it appears on the card.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("holderName")
    private Optional<String> holderName;


    @JsonProperty("billingAddress")
    private CardAddress billingAddress;

    /**
     * The results of submitting cardholder data to a card network for verification.
     */
    @JsonProperty("cardVerification")
    private CardVerification cardVerification;

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
     * Indicates cardholder has authorized card to be stored for future payments.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("cardOnFile")
    private Optional<Boolean> cardOnFile;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("merchantAccountID")
    private Optional<String> merchantAccountID;

    /**
     * The results of the most recent card update request.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("cardAccountUpdater")
    private Optional<? extends CardAccountUpdater> cardAccountUpdater;

    /**
     * Indicates which level of domestic push-to-card transfer is supported by the card, if any.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("domesticPushToCard")
    private Optional<? extends DomesticPushToCard> domesticPushToCard;

    /**
     * Indicates if the card supports domestic pull-from-card transfer.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("domesticPullFromCard")
    private Optional<? extends DomesticPullFromCard> domesticPullFromCard;

    @JsonCreator
    public PaymentMethodsCard(
            @JsonProperty("cardID") String cardID,
            @JsonProperty("fingerprint") String fingerprint,
            @JsonProperty("brand") CardBrand brand,
            @JsonProperty("cardType") CardType cardType,
            @JsonProperty("lastFourCardNumber") String lastFourCardNumber,
            @JsonProperty("bin") String bin,
            @JsonProperty("expiration") CardExpiration expiration,
            @JsonProperty("holderName") Optional<String> holderName,
            @JsonProperty("billingAddress") CardAddress billingAddress,
            @JsonProperty("cardVerification") CardVerification cardVerification,
            @JsonProperty("issuer") Optional<String> issuer,
            @JsonProperty("issuerCountry") Optional<String> issuerCountry,
            @JsonProperty("cardOnFile") Optional<Boolean> cardOnFile,
            @JsonProperty("merchantAccountID") Optional<String> merchantAccountID,
            @JsonProperty("cardAccountUpdater") Optional<? extends CardAccountUpdater> cardAccountUpdater,
            @JsonProperty("domesticPushToCard") Optional<? extends DomesticPushToCard> domesticPushToCard,
            @JsonProperty("domesticPullFromCard") Optional<? extends DomesticPullFromCard> domesticPullFromCard) {
        Utils.checkNotNull(cardID, "cardID");
        Utils.checkNotNull(fingerprint, "fingerprint");
        Utils.checkNotNull(brand, "brand");
        Utils.checkNotNull(cardType, "cardType");
        Utils.checkNotNull(lastFourCardNumber, "lastFourCardNumber");
        Utils.checkNotNull(bin, "bin");
        Utils.checkNotNull(expiration, "expiration");
        Utils.checkNotNull(holderName, "holderName");
        Utils.checkNotNull(billingAddress, "billingAddress");
        Utils.checkNotNull(cardVerification, "cardVerification");
        Utils.checkNotNull(issuer, "issuer");
        Utils.checkNotNull(issuerCountry, "issuerCountry");
        Utils.checkNotNull(cardOnFile, "cardOnFile");
        Utils.checkNotNull(merchantAccountID, "merchantAccountID");
        Utils.checkNotNull(cardAccountUpdater, "cardAccountUpdater");
        Utils.checkNotNull(domesticPushToCard, "domesticPushToCard");
        Utils.checkNotNull(domesticPullFromCard, "domesticPullFromCard");
        this.cardID = cardID;
        this.fingerprint = fingerprint;
        this.brand = brand;
        this.cardType = cardType;
        this.lastFourCardNumber = lastFourCardNumber;
        this.bin = bin;
        this.expiration = expiration;
        this.holderName = holderName;
        this.billingAddress = billingAddress;
        this.cardVerification = cardVerification;
        this.issuer = issuer;
        this.issuerCountry = issuerCountry;
        this.cardOnFile = cardOnFile;
        this.merchantAccountID = merchantAccountID;
        this.cardAccountUpdater = cardAccountUpdater;
        this.domesticPushToCard = domesticPushToCard;
        this.domesticPullFromCard = domesticPullFromCard;
    }
    
    public PaymentMethodsCard(
            String cardID,
            String fingerprint,
            CardBrand brand,
            CardType cardType,
            String lastFourCardNumber,
            String bin,
            CardExpiration expiration,
            CardAddress billingAddress,
            CardVerification cardVerification) {
        this(cardID, fingerprint, brand,
            cardType, lastFourCardNumber, bin,
            expiration, Optional.empty(), billingAddress,
            cardVerification, Optional.empty(), Optional.empty(),
            Optional.empty(), Optional.empty(), Optional.empty(),
            Optional.empty(), Optional.empty());
    }

    /**
     * ID of the card.
     */
    @JsonIgnore
    public String cardID() {
        return cardID;
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
     * Last four digits of the card number
     */
    @JsonIgnore
    public String lastFourCardNumber() {
        return lastFourCardNumber;
    }

    /**
     * The first six to eight digits of the card number, which identifies the financial institution that issued the card.
     */
    @JsonIgnore
    public String bin() {
        return bin;
    }

    /**
     * The expiration date of the card or token.
     */
    @JsonIgnore
    public CardExpiration expiration() {
        return expiration;
    }

    /**
     * The name of the cardholder as it appears on the card.
     */
    @JsonIgnore
    public Optional<String> holderName() {
        return holderName;
    }

    @JsonIgnore
    public CardAddress billingAddress() {
        return billingAddress;
    }

    /**
     * The results of submitting cardholder data to a card network for verification.
     */
    @JsonIgnore
    public CardVerification cardVerification() {
        return cardVerification;
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
     * Indicates cardholder has authorized card to be stored for future payments.
     */
    @JsonIgnore
    public Optional<Boolean> cardOnFile() {
        return cardOnFile;
    }

    @JsonIgnore
    public Optional<String> merchantAccountID() {
        return merchantAccountID;
    }

    /**
     * The results of the most recent card update request.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<CardAccountUpdater> cardAccountUpdater() {
        return (Optional<CardAccountUpdater>) cardAccountUpdater;
    }

    /**
     * Indicates which level of domestic push-to-card transfer is supported by the card, if any.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<DomesticPushToCard> domesticPushToCard() {
        return (Optional<DomesticPushToCard>) domesticPushToCard;
    }

    /**
     * Indicates if the card supports domestic pull-from-card transfer.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<DomesticPullFromCard> domesticPullFromCard() {
        return (Optional<DomesticPullFromCard>) domesticPullFromCard;
    }

    public static Builder builder() {
        return new Builder();
    }


    /**
     * ID of the card.
     */
    public PaymentMethodsCard withCardID(String cardID) {
        Utils.checkNotNull(cardID, "cardID");
        this.cardID = cardID;
        return this;
    }

    /**
     * Uniquely identifies a linked payment card or token.
     * For Apple Pay, the fingerprint is based on the tokenized card number and may vary based on the user's device.
     * This field can be used to identify specific payment methods across multiple accounts on your platform.
     */
    public PaymentMethodsCard withFingerprint(String fingerprint) {
        Utils.checkNotNull(fingerprint, "fingerprint");
        this.fingerprint = fingerprint;
        return this;
    }

    /**
     * The card brand.
     */
    public PaymentMethodsCard withBrand(CardBrand brand) {
        Utils.checkNotNull(brand, "brand");
        this.brand = brand;
        return this;
    }

    /**
     * The type of the card.
     */
    public PaymentMethodsCard withCardType(CardType cardType) {
        Utils.checkNotNull(cardType, "cardType");
        this.cardType = cardType;
        return this;
    }

    /**
     * Last four digits of the card number
     */
    public PaymentMethodsCard withLastFourCardNumber(String lastFourCardNumber) {
        Utils.checkNotNull(lastFourCardNumber, "lastFourCardNumber");
        this.lastFourCardNumber = lastFourCardNumber;
        return this;
    }

    /**
     * The first six to eight digits of the card number, which identifies the financial institution that issued the card.
     */
    public PaymentMethodsCard withBin(String bin) {
        Utils.checkNotNull(bin, "bin");
        this.bin = bin;
        return this;
    }

    /**
     * The expiration date of the card or token.
     */
    public PaymentMethodsCard withExpiration(CardExpiration expiration) {
        Utils.checkNotNull(expiration, "expiration");
        this.expiration = expiration;
        return this;
    }

    /**
     * The name of the cardholder as it appears on the card.
     */
    public PaymentMethodsCard withHolderName(String holderName) {
        Utils.checkNotNull(holderName, "holderName");
        this.holderName = Optional.ofNullable(holderName);
        return this;
    }


    /**
     * The name of the cardholder as it appears on the card.
     */
    public PaymentMethodsCard withHolderName(Optional<String> holderName) {
        Utils.checkNotNull(holderName, "holderName");
        this.holderName = holderName;
        return this;
    }

    public PaymentMethodsCard withBillingAddress(CardAddress billingAddress) {
        Utils.checkNotNull(billingAddress, "billingAddress");
        this.billingAddress = billingAddress;
        return this;
    }

    /**
     * The results of submitting cardholder data to a card network for verification.
     */
    public PaymentMethodsCard withCardVerification(CardVerification cardVerification) {
        Utils.checkNotNull(cardVerification, "cardVerification");
        this.cardVerification = cardVerification;
        return this;
    }

    /**
     * Financial institution that issued the card.
     */
    public PaymentMethodsCard withIssuer(String issuer) {
        Utils.checkNotNull(issuer, "issuer");
        this.issuer = Optional.ofNullable(issuer);
        return this;
    }


    /**
     * Financial institution that issued the card.
     */
    public PaymentMethodsCard withIssuer(Optional<String> issuer) {
        Utils.checkNotNull(issuer, "issuer");
        this.issuer = issuer;
        return this;
    }

    /**
     * Country where the card was issued.
     */
    public PaymentMethodsCard withIssuerCountry(String issuerCountry) {
        Utils.checkNotNull(issuerCountry, "issuerCountry");
        this.issuerCountry = Optional.ofNullable(issuerCountry);
        return this;
    }


    /**
     * Country where the card was issued.
     */
    public PaymentMethodsCard withIssuerCountry(Optional<String> issuerCountry) {
        Utils.checkNotNull(issuerCountry, "issuerCountry");
        this.issuerCountry = issuerCountry;
        return this;
    }

    /**
     * Indicates cardholder has authorized card to be stored for future payments.
     */
    public PaymentMethodsCard withCardOnFile(boolean cardOnFile) {
        Utils.checkNotNull(cardOnFile, "cardOnFile");
        this.cardOnFile = Optional.ofNullable(cardOnFile);
        return this;
    }


    /**
     * Indicates cardholder has authorized card to be stored for future payments.
     */
    public PaymentMethodsCard withCardOnFile(Optional<Boolean> cardOnFile) {
        Utils.checkNotNull(cardOnFile, "cardOnFile");
        this.cardOnFile = cardOnFile;
        return this;
    }

    public PaymentMethodsCard withMerchantAccountID(String merchantAccountID) {
        Utils.checkNotNull(merchantAccountID, "merchantAccountID");
        this.merchantAccountID = Optional.ofNullable(merchantAccountID);
        return this;
    }


    public PaymentMethodsCard withMerchantAccountID(Optional<String> merchantAccountID) {
        Utils.checkNotNull(merchantAccountID, "merchantAccountID");
        this.merchantAccountID = merchantAccountID;
        return this;
    }

    /**
     * The results of the most recent card update request.
     */
    public PaymentMethodsCard withCardAccountUpdater(CardAccountUpdater cardAccountUpdater) {
        Utils.checkNotNull(cardAccountUpdater, "cardAccountUpdater");
        this.cardAccountUpdater = Optional.ofNullable(cardAccountUpdater);
        return this;
    }


    /**
     * The results of the most recent card update request.
     */
    public PaymentMethodsCard withCardAccountUpdater(Optional<? extends CardAccountUpdater> cardAccountUpdater) {
        Utils.checkNotNull(cardAccountUpdater, "cardAccountUpdater");
        this.cardAccountUpdater = cardAccountUpdater;
        return this;
    }

    /**
     * Indicates which level of domestic push-to-card transfer is supported by the card, if any.
     */
    public PaymentMethodsCard withDomesticPushToCard(DomesticPushToCard domesticPushToCard) {
        Utils.checkNotNull(domesticPushToCard, "domesticPushToCard");
        this.domesticPushToCard = Optional.ofNullable(domesticPushToCard);
        return this;
    }


    /**
     * Indicates which level of domestic push-to-card transfer is supported by the card, if any.
     */
    public PaymentMethodsCard withDomesticPushToCard(Optional<? extends DomesticPushToCard> domesticPushToCard) {
        Utils.checkNotNull(domesticPushToCard, "domesticPushToCard");
        this.domesticPushToCard = domesticPushToCard;
        return this;
    }

    /**
     * Indicates if the card supports domestic pull-from-card transfer.
     */
    public PaymentMethodsCard withDomesticPullFromCard(DomesticPullFromCard domesticPullFromCard) {
        Utils.checkNotNull(domesticPullFromCard, "domesticPullFromCard");
        this.domesticPullFromCard = Optional.ofNullable(domesticPullFromCard);
        return this;
    }


    /**
     * Indicates if the card supports domestic pull-from-card transfer.
     */
    public PaymentMethodsCard withDomesticPullFromCard(Optional<? extends DomesticPullFromCard> domesticPullFromCard) {
        Utils.checkNotNull(domesticPullFromCard, "domesticPullFromCard");
        this.domesticPullFromCard = domesticPullFromCard;
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
        PaymentMethodsCard other = (PaymentMethodsCard) o;
        return 
            Utils.enhancedDeepEquals(this.cardID, other.cardID) &&
            Utils.enhancedDeepEquals(this.fingerprint, other.fingerprint) &&
            Utils.enhancedDeepEquals(this.brand, other.brand) &&
            Utils.enhancedDeepEquals(this.cardType, other.cardType) &&
            Utils.enhancedDeepEquals(this.lastFourCardNumber, other.lastFourCardNumber) &&
            Utils.enhancedDeepEquals(this.bin, other.bin) &&
            Utils.enhancedDeepEquals(this.expiration, other.expiration) &&
            Utils.enhancedDeepEquals(this.holderName, other.holderName) &&
            Utils.enhancedDeepEquals(this.billingAddress, other.billingAddress) &&
            Utils.enhancedDeepEquals(this.cardVerification, other.cardVerification) &&
            Utils.enhancedDeepEquals(this.issuer, other.issuer) &&
            Utils.enhancedDeepEquals(this.issuerCountry, other.issuerCountry) &&
            Utils.enhancedDeepEquals(this.cardOnFile, other.cardOnFile) &&
            Utils.enhancedDeepEquals(this.merchantAccountID, other.merchantAccountID) &&
            Utils.enhancedDeepEquals(this.cardAccountUpdater, other.cardAccountUpdater) &&
            Utils.enhancedDeepEquals(this.domesticPushToCard, other.domesticPushToCard) &&
            Utils.enhancedDeepEquals(this.domesticPullFromCard, other.domesticPullFromCard);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            cardID, fingerprint, brand,
            cardType, lastFourCardNumber, bin,
            expiration, holderName, billingAddress,
            cardVerification, issuer, issuerCountry,
            cardOnFile, merchantAccountID, cardAccountUpdater,
            domesticPushToCard, domesticPullFromCard);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PaymentMethodsCard.class,
                "cardID", cardID,
                "fingerprint", fingerprint,
                "brand", brand,
                "cardType", cardType,
                "lastFourCardNumber", lastFourCardNumber,
                "bin", bin,
                "expiration", expiration,
                "holderName", holderName,
                "billingAddress", billingAddress,
                "cardVerification", cardVerification,
                "issuer", issuer,
                "issuerCountry", issuerCountry,
                "cardOnFile", cardOnFile,
                "merchantAccountID", merchantAccountID,
                "cardAccountUpdater", cardAccountUpdater,
                "domesticPushToCard", domesticPushToCard,
                "domesticPullFromCard", domesticPullFromCard);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private String cardID;

        private String fingerprint;

        private CardBrand brand;

        private CardType cardType;

        private String lastFourCardNumber;

        private String bin;

        private CardExpiration expiration;

        private Optional<String> holderName = Optional.empty();

        private CardAddress billingAddress;

        private CardVerification cardVerification;

        private Optional<String> issuer = Optional.empty();

        private Optional<String> issuerCountry = Optional.empty();

        private Optional<Boolean> cardOnFile = Optional.empty();

        private Optional<String> merchantAccountID = Optional.empty();

        private Optional<? extends CardAccountUpdater> cardAccountUpdater = Optional.empty();

        private Optional<? extends DomesticPushToCard> domesticPushToCard = Optional.empty();

        private Optional<? extends DomesticPullFromCard> domesticPullFromCard = Optional.empty();

        private Builder() {
          // force use of static builder() method
        }


        /**
         * ID of the card.
         */
        public Builder cardID(String cardID) {
            Utils.checkNotNull(cardID, "cardID");
            this.cardID = cardID;
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
         * Last four digits of the card number
         */
        public Builder lastFourCardNumber(String lastFourCardNumber) {
            Utils.checkNotNull(lastFourCardNumber, "lastFourCardNumber");
            this.lastFourCardNumber = lastFourCardNumber;
            return this;
        }


        /**
         * The first six to eight digits of the card number, which identifies the financial institution that issued the card.
         */
        public Builder bin(String bin) {
            Utils.checkNotNull(bin, "bin");
            this.bin = bin;
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


        public Builder billingAddress(CardAddress billingAddress) {
            Utils.checkNotNull(billingAddress, "billingAddress");
            this.billingAddress = billingAddress;
            return this;
        }


        /**
         * The results of submitting cardholder data to a card network for verification.
         */
        public Builder cardVerification(CardVerification cardVerification) {
            Utils.checkNotNull(cardVerification, "cardVerification");
            this.cardVerification = cardVerification;
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
         * Indicates cardholder has authorized card to be stored for future payments.
         */
        public Builder cardOnFile(boolean cardOnFile) {
            Utils.checkNotNull(cardOnFile, "cardOnFile");
            this.cardOnFile = Optional.ofNullable(cardOnFile);
            return this;
        }

        /**
         * Indicates cardholder has authorized card to be stored for future payments.
         */
        public Builder cardOnFile(Optional<Boolean> cardOnFile) {
            Utils.checkNotNull(cardOnFile, "cardOnFile");
            this.cardOnFile = cardOnFile;
            return this;
        }


        public Builder merchantAccountID(String merchantAccountID) {
            Utils.checkNotNull(merchantAccountID, "merchantAccountID");
            this.merchantAccountID = Optional.ofNullable(merchantAccountID);
            return this;
        }

        public Builder merchantAccountID(Optional<String> merchantAccountID) {
            Utils.checkNotNull(merchantAccountID, "merchantAccountID");
            this.merchantAccountID = merchantAccountID;
            return this;
        }


        /**
         * The results of the most recent card update request.
         */
        public Builder cardAccountUpdater(CardAccountUpdater cardAccountUpdater) {
            Utils.checkNotNull(cardAccountUpdater, "cardAccountUpdater");
            this.cardAccountUpdater = Optional.ofNullable(cardAccountUpdater);
            return this;
        }

        /**
         * The results of the most recent card update request.
         */
        public Builder cardAccountUpdater(Optional<? extends CardAccountUpdater> cardAccountUpdater) {
            Utils.checkNotNull(cardAccountUpdater, "cardAccountUpdater");
            this.cardAccountUpdater = cardAccountUpdater;
            return this;
        }


        /**
         * Indicates which level of domestic push-to-card transfer is supported by the card, if any.
         */
        public Builder domesticPushToCard(DomesticPushToCard domesticPushToCard) {
            Utils.checkNotNull(domesticPushToCard, "domesticPushToCard");
            this.domesticPushToCard = Optional.ofNullable(domesticPushToCard);
            return this;
        }

        /**
         * Indicates which level of domestic push-to-card transfer is supported by the card, if any.
         */
        public Builder domesticPushToCard(Optional<? extends DomesticPushToCard> domesticPushToCard) {
            Utils.checkNotNull(domesticPushToCard, "domesticPushToCard");
            this.domesticPushToCard = domesticPushToCard;
            return this;
        }


        /**
         * Indicates if the card supports domestic pull-from-card transfer.
         */
        public Builder domesticPullFromCard(DomesticPullFromCard domesticPullFromCard) {
            Utils.checkNotNull(domesticPullFromCard, "domesticPullFromCard");
            this.domesticPullFromCard = Optional.ofNullable(domesticPullFromCard);
            return this;
        }

        /**
         * Indicates if the card supports domestic pull-from-card transfer.
         */
        public Builder domesticPullFromCard(Optional<? extends DomesticPullFromCard> domesticPullFromCard) {
            Utils.checkNotNull(domesticPullFromCard, "domesticPullFromCard");
            this.domesticPullFromCard = domesticPullFromCard;
            return this;
        }

        public PaymentMethodsCard build() {

            return new PaymentMethodsCard(
                cardID, fingerprint, brand,
                cardType, lastFourCardNumber, bin,
                expiration, holderName, billingAddress,
                cardVerification, issuer, issuerCountry,
                cardOnFile, merchantAccountID, cardAccountUpdater,
                domesticPushToCard, domesticPullFromCard);
        }

    }
}
