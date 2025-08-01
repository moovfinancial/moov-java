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


public class CardVolumeDistributionError {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ecommercePercentage")
    private Optional<String> ecommercePercentage;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("cardPresentPercentage")
    private Optional<String> cardPresentPercentage;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("mailOrPhonePercentage")
    private Optional<String> mailOrPhonePercentage;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("debtRepaymentPercentage")
    private Optional<String> debtRepaymentPercentage;

    @JsonCreator
    public CardVolumeDistributionError(
            @JsonProperty("ecommercePercentage") Optional<String> ecommercePercentage,
            @JsonProperty("cardPresentPercentage") Optional<String> cardPresentPercentage,
            @JsonProperty("mailOrPhonePercentage") Optional<String> mailOrPhonePercentage,
            @JsonProperty("debtRepaymentPercentage") Optional<String> debtRepaymentPercentage) {
        Utils.checkNotNull(ecommercePercentage, "ecommercePercentage");
        Utils.checkNotNull(cardPresentPercentage, "cardPresentPercentage");
        Utils.checkNotNull(mailOrPhonePercentage, "mailOrPhonePercentage");
        Utils.checkNotNull(debtRepaymentPercentage, "debtRepaymentPercentage");
        this.ecommercePercentage = ecommercePercentage;
        this.cardPresentPercentage = cardPresentPercentage;
        this.mailOrPhonePercentage = mailOrPhonePercentage;
        this.debtRepaymentPercentage = debtRepaymentPercentage;
    }
    
    public CardVolumeDistributionError() {
        this(Optional.empty(), Optional.empty(), Optional.empty(),
            Optional.empty());
    }

    @JsonIgnore
    public Optional<String> ecommercePercentage() {
        return ecommercePercentage;
    }

    @JsonIgnore
    public Optional<String> cardPresentPercentage() {
        return cardPresentPercentage;
    }

    @JsonIgnore
    public Optional<String> mailOrPhonePercentage() {
        return mailOrPhonePercentage;
    }

    @JsonIgnore
    public Optional<String> debtRepaymentPercentage() {
        return debtRepaymentPercentage;
    }

    public static Builder builder() {
        return new Builder();
    }


    public CardVolumeDistributionError withEcommercePercentage(String ecommercePercentage) {
        Utils.checkNotNull(ecommercePercentage, "ecommercePercentage");
        this.ecommercePercentage = Optional.ofNullable(ecommercePercentage);
        return this;
    }


    public CardVolumeDistributionError withEcommercePercentage(Optional<String> ecommercePercentage) {
        Utils.checkNotNull(ecommercePercentage, "ecommercePercentage");
        this.ecommercePercentage = ecommercePercentage;
        return this;
    }

    public CardVolumeDistributionError withCardPresentPercentage(String cardPresentPercentage) {
        Utils.checkNotNull(cardPresentPercentage, "cardPresentPercentage");
        this.cardPresentPercentage = Optional.ofNullable(cardPresentPercentage);
        return this;
    }


    public CardVolumeDistributionError withCardPresentPercentage(Optional<String> cardPresentPercentage) {
        Utils.checkNotNull(cardPresentPercentage, "cardPresentPercentage");
        this.cardPresentPercentage = cardPresentPercentage;
        return this;
    }

    public CardVolumeDistributionError withMailOrPhonePercentage(String mailOrPhonePercentage) {
        Utils.checkNotNull(mailOrPhonePercentage, "mailOrPhonePercentage");
        this.mailOrPhonePercentage = Optional.ofNullable(mailOrPhonePercentage);
        return this;
    }


    public CardVolumeDistributionError withMailOrPhonePercentage(Optional<String> mailOrPhonePercentage) {
        Utils.checkNotNull(mailOrPhonePercentage, "mailOrPhonePercentage");
        this.mailOrPhonePercentage = mailOrPhonePercentage;
        return this;
    }

    public CardVolumeDistributionError withDebtRepaymentPercentage(String debtRepaymentPercentage) {
        Utils.checkNotNull(debtRepaymentPercentage, "debtRepaymentPercentage");
        this.debtRepaymentPercentage = Optional.ofNullable(debtRepaymentPercentage);
        return this;
    }


    public CardVolumeDistributionError withDebtRepaymentPercentage(Optional<String> debtRepaymentPercentage) {
        Utils.checkNotNull(debtRepaymentPercentage, "debtRepaymentPercentage");
        this.debtRepaymentPercentage = debtRepaymentPercentage;
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
        CardVolumeDistributionError other = (CardVolumeDistributionError) o;
        return 
            Utils.enhancedDeepEquals(this.ecommercePercentage, other.ecommercePercentage) &&
            Utils.enhancedDeepEquals(this.cardPresentPercentage, other.cardPresentPercentage) &&
            Utils.enhancedDeepEquals(this.mailOrPhonePercentage, other.mailOrPhonePercentage) &&
            Utils.enhancedDeepEquals(this.debtRepaymentPercentage, other.debtRepaymentPercentage);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            ecommercePercentage, cardPresentPercentage, mailOrPhonePercentage,
            debtRepaymentPercentage);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CardVolumeDistributionError.class,
                "ecommercePercentage", ecommercePercentage,
                "cardPresentPercentage", cardPresentPercentage,
                "mailOrPhonePercentage", mailOrPhonePercentage,
                "debtRepaymentPercentage", debtRepaymentPercentage);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private Optional<String> ecommercePercentage = Optional.empty();

        private Optional<String> cardPresentPercentage = Optional.empty();

        private Optional<String> mailOrPhonePercentage = Optional.empty();

        private Optional<String> debtRepaymentPercentage = Optional.empty();

        private Builder() {
          // force use of static builder() method
        }


        public Builder ecommercePercentage(String ecommercePercentage) {
            Utils.checkNotNull(ecommercePercentage, "ecommercePercentage");
            this.ecommercePercentage = Optional.ofNullable(ecommercePercentage);
            return this;
        }

        public Builder ecommercePercentage(Optional<String> ecommercePercentage) {
            Utils.checkNotNull(ecommercePercentage, "ecommercePercentage");
            this.ecommercePercentage = ecommercePercentage;
            return this;
        }


        public Builder cardPresentPercentage(String cardPresentPercentage) {
            Utils.checkNotNull(cardPresentPercentage, "cardPresentPercentage");
            this.cardPresentPercentage = Optional.ofNullable(cardPresentPercentage);
            return this;
        }

        public Builder cardPresentPercentage(Optional<String> cardPresentPercentage) {
            Utils.checkNotNull(cardPresentPercentage, "cardPresentPercentage");
            this.cardPresentPercentage = cardPresentPercentage;
            return this;
        }


        public Builder mailOrPhonePercentage(String mailOrPhonePercentage) {
            Utils.checkNotNull(mailOrPhonePercentage, "mailOrPhonePercentage");
            this.mailOrPhonePercentage = Optional.ofNullable(mailOrPhonePercentage);
            return this;
        }

        public Builder mailOrPhonePercentage(Optional<String> mailOrPhonePercentage) {
            Utils.checkNotNull(mailOrPhonePercentage, "mailOrPhonePercentage");
            this.mailOrPhonePercentage = mailOrPhonePercentage;
            return this;
        }


        public Builder debtRepaymentPercentage(String debtRepaymentPercentage) {
            Utils.checkNotNull(debtRepaymentPercentage, "debtRepaymentPercentage");
            this.debtRepaymentPercentage = Optional.ofNullable(debtRepaymentPercentage);
            return this;
        }

        public Builder debtRepaymentPercentage(Optional<String> debtRepaymentPercentage) {
            Utils.checkNotNull(debtRepaymentPercentage, "debtRepaymentPercentage");
            this.debtRepaymentPercentage = debtRepaymentPercentage;
            return this;
        }

        public CardVolumeDistributionError build() {

            return new CardVolumeDistributionError(
                ecommercePercentage, cardPresentPercentage, mailOrPhonePercentage,
                debtRepaymentPercentage);
        }

    }
}
