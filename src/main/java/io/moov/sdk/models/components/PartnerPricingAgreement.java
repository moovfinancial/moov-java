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
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;
import java.util.Optional;


public class PartnerPricingAgreement {

    @JsonProperty("aggreementID")
    private String aggreementID;

    @JsonProperty("planID")
    private String planID;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("accountID")
    private Optional<String> accountID;

    @JsonProperty("acceptedOn")
    private OffsetDateTime acceptedOn;

    @JsonProperty("status")
    private FeePlanAgreementStatus status;

    /**
     * Specifies the card processing pricing model
     */
    @JsonProperty("cardAcquringModel")
    private CardAcquringModel cardAcquringModel;

    @JsonProperty("billableFees")
    private List<BillableFee> billableFees;

    /**
     * The integer percentage value of the revenue split for partner.
     */
    @JsonProperty("revenueShare")
    private long revenueShare;

    @JsonCreator
    public PartnerPricingAgreement(
            @JsonProperty("aggreementID") String aggreementID,
            @JsonProperty("planID") String planID,
            @JsonProperty("accountID") Optional<String> accountID,
            @JsonProperty("acceptedOn") OffsetDateTime acceptedOn,
            @JsonProperty("status") FeePlanAgreementStatus status,
            @JsonProperty("cardAcquringModel") CardAcquringModel cardAcquringModel,
            @JsonProperty("billableFees") List<BillableFee> billableFees,
            @JsonProperty("revenueShare") long revenueShare) {
        Utils.checkNotNull(aggreementID, "aggreementID");
        Utils.checkNotNull(planID, "planID");
        Utils.checkNotNull(accountID, "accountID");
        Utils.checkNotNull(acceptedOn, "acceptedOn");
        Utils.checkNotNull(status, "status");
        Utils.checkNotNull(cardAcquringModel, "cardAcquringModel");
        Utils.checkNotNull(billableFees, "billableFees");
        Utils.checkNotNull(revenueShare, "revenueShare");
        this.aggreementID = aggreementID;
        this.planID = planID;
        this.accountID = accountID;
        this.acceptedOn = acceptedOn;
        this.status = status;
        this.cardAcquringModel = cardAcquringModel;
        this.billableFees = billableFees;
        this.revenueShare = revenueShare;
    }
    
    public PartnerPricingAgreement(
            String aggreementID,
            String planID,
            OffsetDateTime acceptedOn,
            FeePlanAgreementStatus status,
            CardAcquringModel cardAcquringModel,
            List<BillableFee> billableFees,
            long revenueShare) {
        this(aggreementID, planID, Optional.empty(), acceptedOn, status, cardAcquringModel, billableFees, revenueShare);
    }

    @JsonIgnore
    public String aggreementID() {
        return aggreementID;
    }

    @JsonIgnore
    public String planID() {
        return planID;
    }

    @JsonIgnore
    public Optional<String> accountID() {
        return accountID;
    }

    @JsonIgnore
    public OffsetDateTime acceptedOn() {
        return acceptedOn;
    }

    @JsonIgnore
    public FeePlanAgreementStatus status() {
        return status;
    }

    /**
     * Specifies the card processing pricing model
     */
    @JsonIgnore
    public CardAcquringModel cardAcquringModel() {
        return cardAcquringModel;
    }

    @JsonIgnore
    public List<BillableFee> billableFees() {
        return billableFees;
    }

    /**
     * The integer percentage value of the revenue split for partner.
     */
    @JsonIgnore
    public long revenueShare() {
        return revenueShare;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public PartnerPricingAgreement withAggreementID(String aggreementID) {
        Utils.checkNotNull(aggreementID, "aggreementID");
        this.aggreementID = aggreementID;
        return this;
    }

    public PartnerPricingAgreement withPlanID(String planID) {
        Utils.checkNotNull(planID, "planID");
        this.planID = planID;
        return this;
    }

    public PartnerPricingAgreement withAccountID(String accountID) {
        Utils.checkNotNull(accountID, "accountID");
        this.accountID = Optional.ofNullable(accountID);
        return this;
    }

    public PartnerPricingAgreement withAccountID(Optional<String> accountID) {
        Utils.checkNotNull(accountID, "accountID");
        this.accountID = accountID;
        return this;
    }

    public PartnerPricingAgreement withAcceptedOn(OffsetDateTime acceptedOn) {
        Utils.checkNotNull(acceptedOn, "acceptedOn");
        this.acceptedOn = acceptedOn;
        return this;
    }

    public PartnerPricingAgreement withStatus(FeePlanAgreementStatus status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
        return this;
    }

    /**
     * Specifies the card processing pricing model
     */
    public PartnerPricingAgreement withCardAcquringModel(CardAcquringModel cardAcquringModel) {
        Utils.checkNotNull(cardAcquringModel, "cardAcquringModel");
        this.cardAcquringModel = cardAcquringModel;
        return this;
    }

    public PartnerPricingAgreement withBillableFees(List<BillableFee> billableFees) {
        Utils.checkNotNull(billableFees, "billableFees");
        this.billableFees = billableFees;
        return this;
    }

    /**
     * The integer percentage value of the revenue split for partner.
     */
    public PartnerPricingAgreement withRevenueShare(long revenueShare) {
        Utils.checkNotNull(revenueShare, "revenueShare");
        this.revenueShare = revenueShare;
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
        PartnerPricingAgreement other = (PartnerPricingAgreement) o;
        return 
            Objects.deepEquals(this.aggreementID, other.aggreementID) &&
            Objects.deepEquals(this.planID, other.planID) &&
            Objects.deepEquals(this.accountID, other.accountID) &&
            Objects.deepEquals(this.acceptedOn, other.acceptedOn) &&
            Objects.deepEquals(this.status, other.status) &&
            Objects.deepEquals(this.cardAcquringModel, other.cardAcquringModel) &&
            Objects.deepEquals(this.billableFees, other.billableFees) &&
            Objects.deepEquals(this.revenueShare, other.revenueShare);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            aggreementID,
            planID,
            accountID,
            acceptedOn,
            status,
            cardAcquringModel,
            billableFees,
            revenueShare);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PartnerPricingAgreement.class,
                "aggreementID", aggreementID,
                "planID", planID,
                "accountID", accountID,
                "acceptedOn", acceptedOn,
                "status", status,
                "cardAcquringModel", cardAcquringModel,
                "billableFees", billableFees,
                "revenueShare", revenueShare);
    }
    
    public final static class Builder {
 
        private String aggreementID;
 
        private String planID;
 
        private Optional<String> accountID = Optional.empty();
 
        private OffsetDateTime acceptedOn;
 
        private FeePlanAgreementStatus status;
 
        private CardAcquringModel cardAcquringModel;
 
        private List<BillableFee> billableFees;
 
        private Long revenueShare;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder aggreementID(String aggreementID) {
            Utils.checkNotNull(aggreementID, "aggreementID");
            this.aggreementID = aggreementID;
            return this;
        }

        public Builder planID(String planID) {
            Utils.checkNotNull(planID, "planID");
            this.planID = planID;
            return this;
        }

        public Builder accountID(String accountID) {
            Utils.checkNotNull(accountID, "accountID");
            this.accountID = Optional.ofNullable(accountID);
            return this;
        }

        public Builder accountID(Optional<String> accountID) {
            Utils.checkNotNull(accountID, "accountID");
            this.accountID = accountID;
            return this;
        }

        public Builder acceptedOn(OffsetDateTime acceptedOn) {
            Utils.checkNotNull(acceptedOn, "acceptedOn");
            this.acceptedOn = acceptedOn;
            return this;
        }

        public Builder status(FeePlanAgreementStatus status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }

        /**
         * Specifies the card processing pricing model
         */
        public Builder cardAcquringModel(CardAcquringModel cardAcquringModel) {
            Utils.checkNotNull(cardAcquringModel, "cardAcquringModel");
            this.cardAcquringModel = cardAcquringModel;
            return this;
        }

        public Builder billableFees(List<BillableFee> billableFees) {
            Utils.checkNotNull(billableFees, "billableFees");
            this.billableFees = billableFees;
            return this;
        }

        /**
         * The integer percentage value of the revenue split for partner.
         */
        public Builder revenueShare(long revenueShare) {
            Utils.checkNotNull(revenueShare, "revenueShare");
            this.revenueShare = revenueShare;
            return this;
        }
        
        public PartnerPricingAgreement build() {
            return new PartnerPricingAgreement(
                aggreementID,
                planID,
                accountID,
                acceptedOn,
                status,
                cardAcquringModel,
                billableFees,
                revenueShare);
        }
    }
}

