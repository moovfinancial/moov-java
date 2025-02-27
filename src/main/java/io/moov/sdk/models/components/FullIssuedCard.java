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
import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.Optional;
/**
 * FullIssuedCard - The full details of an issued card, including PAN and CVV.
 */

public class FullIssuedCard {

    @JsonProperty("issuedCardID")
    private String issuedCardID;

    /**
     * The card brand.
     */
    @JsonProperty("brand")
    private CardBrand brand;

    @JsonProperty("lastFourCardNumber")
    private String lastFourCardNumber;

    /**
     * The expiration date of the card or token.
     */
    @JsonProperty("expiration")
    private CardExpiration expiration;

    /**
     * Fields for identifying an authorized individual.
     */
    @JsonProperty("authorizedUser")
    private AuthorizedUser authorizedUser;

    /**
     * Optional descriptor for the card.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("memo")
    private Optional<String> memo;

    /**
     * Unique identifier for the wallet funding the card.
     */
    @JsonProperty("fundingWalletID")
    private String fundingWalletID;

    /**
     * The `state` represents the operational status of an issued card. A card can only approve incoming authorizations if it is in an active state.
     * 
     * - `active`: The card is operational and approves authorizations. Generally becomes active shortly after card creation.
     * - `inactive`: The card cannot approve authorizations. This is currently a temporary state assigned post-creation during the activation process.
     * - `closed`: The card is permanently deactivated and cannot approve authorizations. A card can be closed by request or when it expires.
     * - `pending-verification`: Awaiting additional authorized user verification before the card can be activated.
     */
    @JsonProperty("state")
    private IssuedCardState state;

    /**
     * Specifies the type of spend card to be issued. Presently supports virtual only, providing a digital number without a physical card.
     */
    @JsonProperty("formFactor")
    private IssuedCardFormFactor formFactor;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("controls")
    private Optional<? extends IssuingControls> controls;

    @JsonProperty("createdOn")
    private OffsetDateTime createdOn;

    /**
     * The issued card's Primary Account Number (PAN)
     */
    @JsonProperty("pan")
    private String pan;

    /**
     * The issued card's 3- or 4-digit Card Verification Value (CVV).
     */
    @JsonProperty("cvv")
    private String cvv;

    @JsonCreator
    public FullIssuedCard(
            @JsonProperty("issuedCardID") String issuedCardID,
            @JsonProperty("brand") CardBrand brand,
            @JsonProperty("lastFourCardNumber") String lastFourCardNumber,
            @JsonProperty("expiration") CardExpiration expiration,
            @JsonProperty("authorizedUser") AuthorizedUser authorizedUser,
            @JsonProperty("memo") Optional<String> memo,
            @JsonProperty("fundingWalletID") String fundingWalletID,
            @JsonProperty("state") IssuedCardState state,
            @JsonProperty("formFactor") IssuedCardFormFactor formFactor,
            @JsonProperty("controls") Optional<? extends IssuingControls> controls,
            @JsonProperty("createdOn") OffsetDateTime createdOn,
            @JsonProperty("pan") String pan,
            @JsonProperty("cvv") String cvv) {
        Utils.checkNotNull(issuedCardID, "issuedCardID");
        Utils.checkNotNull(brand, "brand");
        Utils.checkNotNull(lastFourCardNumber, "lastFourCardNumber");
        Utils.checkNotNull(expiration, "expiration");
        Utils.checkNotNull(authorizedUser, "authorizedUser");
        Utils.checkNotNull(memo, "memo");
        Utils.checkNotNull(fundingWalletID, "fundingWalletID");
        Utils.checkNotNull(state, "state");
        Utils.checkNotNull(formFactor, "formFactor");
        Utils.checkNotNull(controls, "controls");
        Utils.checkNotNull(createdOn, "createdOn");
        Utils.checkNotNull(pan, "pan");
        Utils.checkNotNull(cvv, "cvv");
        this.issuedCardID = issuedCardID;
        this.brand = brand;
        this.lastFourCardNumber = lastFourCardNumber;
        this.expiration = expiration;
        this.authorizedUser = authorizedUser;
        this.memo = memo;
        this.fundingWalletID = fundingWalletID;
        this.state = state;
        this.formFactor = formFactor;
        this.controls = controls;
        this.createdOn = createdOn;
        this.pan = pan;
        this.cvv = cvv;
    }
    
    public FullIssuedCard(
            String issuedCardID,
            CardBrand brand,
            String lastFourCardNumber,
            CardExpiration expiration,
            AuthorizedUser authorizedUser,
            String fundingWalletID,
            IssuedCardState state,
            IssuedCardFormFactor formFactor,
            OffsetDateTime createdOn,
            String pan,
            String cvv) {
        this(issuedCardID, brand, lastFourCardNumber, expiration, authorizedUser, Optional.empty(), fundingWalletID, state, formFactor, Optional.empty(), createdOn, pan, cvv);
    }

    @JsonIgnore
    public String issuedCardID() {
        return issuedCardID;
    }

    /**
     * The card brand.
     */
    @JsonIgnore
    public CardBrand brand() {
        return brand;
    }

    @JsonIgnore
    public String lastFourCardNumber() {
        return lastFourCardNumber;
    }

    /**
     * The expiration date of the card or token.
     */
    @JsonIgnore
    public CardExpiration expiration() {
        return expiration;
    }

    /**
     * Fields for identifying an authorized individual.
     */
    @JsonIgnore
    public AuthorizedUser authorizedUser() {
        return authorizedUser;
    }

    /**
     * Optional descriptor for the card.
     */
    @JsonIgnore
    public Optional<String> memo() {
        return memo;
    }

    /**
     * Unique identifier for the wallet funding the card.
     */
    @JsonIgnore
    public String fundingWalletID() {
        return fundingWalletID;
    }

    /**
     * The `state` represents the operational status of an issued card. A card can only approve incoming authorizations if it is in an active state.
     * 
     * - `active`: The card is operational and approves authorizations. Generally becomes active shortly after card creation.
     * - `inactive`: The card cannot approve authorizations. This is currently a temporary state assigned post-creation during the activation process.
     * - `closed`: The card is permanently deactivated and cannot approve authorizations. A card can be closed by request or when it expires.
     * - `pending-verification`: Awaiting additional authorized user verification before the card can be activated.
     */
    @JsonIgnore
    public IssuedCardState state() {
        return state;
    }

    /**
     * Specifies the type of spend card to be issued. Presently supports virtual only, providing a digital number without a physical card.
     */
    @JsonIgnore
    public IssuedCardFormFactor formFactor() {
        return formFactor;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<IssuingControls> controls() {
        return (Optional<IssuingControls>) controls;
    }

    @JsonIgnore
    public OffsetDateTime createdOn() {
        return createdOn;
    }

    /**
     * The issued card's Primary Account Number (PAN)
     */
    @JsonIgnore
    public String pan() {
        return pan;
    }

    /**
     * The issued card's 3- or 4-digit Card Verification Value (CVV).
     */
    @JsonIgnore
    public String cvv() {
        return cvv;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public FullIssuedCard withIssuedCardID(String issuedCardID) {
        Utils.checkNotNull(issuedCardID, "issuedCardID");
        this.issuedCardID = issuedCardID;
        return this;
    }

    /**
     * The card brand.
     */
    public FullIssuedCard withBrand(CardBrand brand) {
        Utils.checkNotNull(brand, "brand");
        this.brand = brand;
        return this;
    }

    public FullIssuedCard withLastFourCardNumber(String lastFourCardNumber) {
        Utils.checkNotNull(lastFourCardNumber, "lastFourCardNumber");
        this.lastFourCardNumber = lastFourCardNumber;
        return this;
    }

    /**
     * The expiration date of the card or token.
     */
    public FullIssuedCard withExpiration(CardExpiration expiration) {
        Utils.checkNotNull(expiration, "expiration");
        this.expiration = expiration;
        return this;
    }

    /**
     * Fields for identifying an authorized individual.
     */
    public FullIssuedCard withAuthorizedUser(AuthorizedUser authorizedUser) {
        Utils.checkNotNull(authorizedUser, "authorizedUser");
        this.authorizedUser = authorizedUser;
        return this;
    }

    /**
     * Optional descriptor for the card.
     */
    public FullIssuedCard withMemo(String memo) {
        Utils.checkNotNull(memo, "memo");
        this.memo = Optional.ofNullable(memo);
        return this;
    }

    /**
     * Optional descriptor for the card.
     */
    public FullIssuedCard withMemo(Optional<String> memo) {
        Utils.checkNotNull(memo, "memo");
        this.memo = memo;
        return this;
    }

    /**
     * Unique identifier for the wallet funding the card.
     */
    public FullIssuedCard withFundingWalletID(String fundingWalletID) {
        Utils.checkNotNull(fundingWalletID, "fundingWalletID");
        this.fundingWalletID = fundingWalletID;
        return this;
    }

    /**
     * The `state` represents the operational status of an issued card. A card can only approve incoming authorizations if it is in an active state.
     * 
     * - `active`: The card is operational and approves authorizations. Generally becomes active shortly after card creation.
     * - `inactive`: The card cannot approve authorizations. This is currently a temporary state assigned post-creation during the activation process.
     * - `closed`: The card is permanently deactivated and cannot approve authorizations. A card can be closed by request or when it expires.
     * - `pending-verification`: Awaiting additional authorized user verification before the card can be activated.
     */
    public FullIssuedCard withState(IssuedCardState state) {
        Utils.checkNotNull(state, "state");
        this.state = state;
        return this;
    }

    /**
     * Specifies the type of spend card to be issued. Presently supports virtual only, providing a digital number without a physical card.
     */
    public FullIssuedCard withFormFactor(IssuedCardFormFactor formFactor) {
        Utils.checkNotNull(formFactor, "formFactor");
        this.formFactor = formFactor;
        return this;
    }

    public FullIssuedCard withControls(IssuingControls controls) {
        Utils.checkNotNull(controls, "controls");
        this.controls = Optional.ofNullable(controls);
        return this;
    }

    public FullIssuedCard withControls(Optional<? extends IssuingControls> controls) {
        Utils.checkNotNull(controls, "controls");
        this.controls = controls;
        return this;
    }

    public FullIssuedCard withCreatedOn(OffsetDateTime createdOn) {
        Utils.checkNotNull(createdOn, "createdOn");
        this.createdOn = createdOn;
        return this;
    }

    /**
     * The issued card's Primary Account Number (PAN)
     */
    public FullIssuedCard withPan(String pan) {
        Utils.checkNotNull(pan, "pan");
        this.pan = pan;
        return this;
    }

    /**
     * The issued card's 3- or 4-digit Card Verification Value (CVV).
     */
    public FullIssuedCard withCvv(String cvv) {
        Utils.checkNotNull(cvv, "cvv");
        this.cvv = cvv;
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
        FullIssuedCard other = (FullIssuedCard) o;
        return 
            Objects.deepEquals(this.issuedCardID, other.issuedCardID) &&
            Objects.deepEquals(this.brand, other.brand) &&
            Objects.deepEquals(this.lastFourCardNumber, other.lastFourCardNumber) &&
            Objects.deepEquals(this.expiration, other.expiration) &&
            Objects.deepEquals(this.authorizedUser, other.authorizedUser) &&
            Objects.deepEquals(this.memo, other.memo) &&
            Objects.deepEquals(this.fundingWalletID, other.fundingWalletID) &&
            Objects.deepEquals(this.state, other.state) &&
            Objects.deepEquals(this.formFactor, other.formFactor) &&
            Objects.deepEquals(this.controls, other.controls) &&
            Objects.deepEquals(this.createdOn, other.createdOn) &&
            Objects.deepEquals(this.pan, other.pan) &&
            Objects.deepEquals(this.cvv, other.cvv);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            issuedCardID,
            brand,
            lastFourCardNumber,
            expiration,
            authorizedUser,
            memo,
            fundingWalletID,
            state,
            formFactor,
            controls,
            createdOn,
            pan,
            cvv);
    }
    
    @Override
    public String toString() {
        return Utils.toString(FullIssuedCard.class,
                "issuedCardID", issuedCardID,
                "brand", brand,
                "lastFourCardNumber", lastFourCardNumber,
                "expiration", expiration,
                "authorizedUser", authorizedUser,
                "memo", memo,
                "fundingWalletID", fundingWalletID,
                "state", state,
                "formFactor", formFactor,
                "controls", controls,
                "createdOn", createdOn,
                "pan", pan,
                "cvv", cvv);
    }
    
    public final static class Builder {
 
        private String issuedCardID;
 
        private CardBrand brand;
 
        private String lastFourCardNumber;
 
        private CardExpiration expiration;
 
        private AuthorizedUser authorizedUser;
 
        private Optional<String> memo = Optional.empty();
 
        private String fundingWalletID;
 
        private IssuedCardState state;
 
        private IssuedCardFormFactor formFactor;
 
        private Optional<? extends IssuingControls> controls = Optional.empty();
 
        private OffsetDateTime createdOn;
 
        private String pan;
 
        private String cvv;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder issuedCardID(String issuedCardID) {
            Utils.checkNotNull(issuedCardID, "issuedCardID");
            this.issuedCardID = issuedCardID;
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

        public Builder lastFourCardNumber(String lastFourCardNumber) {
            Utils.checkNotNull(lastFourCardNumber, "lastFourCardNumber");
            this.lastFourCardNumber = lastFourCardNumber;
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
         * Fields for identifying an authorized individual.
         */
        public Builder authorizedUser(AuthorizedUser authorizedUser) {
            Utils.checkNotNull(authorizedUser, "authorizedUser");
            this.authorizedUser = authorizedUser;
            return this;
        }

        /**
         * Optional descriptor for the card.
         */
        public Builder memo(String memo) {
            Utils.checkNotNull(memo, "memo");
            this.memo = Optional.ofNullable(memo);
            return this;
        }

        /**
         * Optional descriptor for the card.
         */
        public Builder memo(Optional<String> memo) {
            Utils.checkNotNull(memo, "memo");
            this.memo = memo;
            return this;
        }

        /**
         * Unique identifier for the wallet funding the card.
         */
        public Builder fundingWalletID(String fundingWalletID) {
            Utils.checkNotNull(fundingWalletID, "fundingWalletID");
            this.fundingWalletID = fundingWalletID;
            return this;
        }

        /**
         * The `state` represents the operational status of an issued card. A card can only approve incoming authorizations if it is in an active state.
         * 
         * - `active`: The card is operational and approves authorizations. Generally becomes active shortly after card creation.
         * - `inactive`: The card cannot approve authorizations. This is currently a temporary state assigned post-creation during the activation process.
         * - `closed`: The card is permanently deactivated and cannot approve authorizations. A card can be closed by request or when it expires.
         * - `pending-verification`: Awaiting additional authorized user verification before the card can be activated.
         */
        public Builder state(IssuedCardState state) {
            Utils.checkNotNull(state, "state");
            this.state = state;
            return this;
        }

        /**
         * Specifies the type of spend card to be issued. Presently supports virtual only, providing a digital number without a physical card.
         */
        public Builder formFactor(IssuedCardFormFactor formFactor) {
            Utils.checkNotNull(formFactor, "formFactor");
            this.formFactor = formFactor;
            return this;
        }

        public Builder controls(IssuingControls controls) {
            Utils.checkNotNull(controls, "controls");
            this.controls = Optional.ofNullable(controls);
            return this;
        }

        public Builder controls(Optional<? extends IssuingControls> controls) {
            Utils.checkNotNull(controls, "controls");
            this.controls = controls;
            return this;
        }

        public Builder createdOn(OffsetDateTime createdOn) {
            Utils.checkNotNull(createdOn, "createdOn");
            this.createdOn = createdOn;
            return this;
        }

        /**
         * The issued card's Primary Account Number (PAN)
         */
        public Builder pan(String pan) {
            Utils.checkNotNull(pan, "pan");
            this.pan = pan;
            return this;
        }

        /**
         * The issued card's 3- or 4-digit Card Verification Value (CVV).
         */
        public Builder cvv(String cvv) {
            Utils.checkNotNull(cvv, "cvv");
            this.cvv = cvv;
            return this;
        }
        
        public FullIssuedCard build() {
            return new FullIssuedCard(
                issuedCardID,
                brand,
                lastFourCardNumber,
                expiration,
                authorizedUser,
                memo,
                fundingWalletID,
                state,
                formFactor,
                controls,
                createdOn,
                pan,
                cvv);
        }
    }
}

