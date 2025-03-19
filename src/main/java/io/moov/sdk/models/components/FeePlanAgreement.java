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
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;
import java.util.Optional;


public class FeePlanAgreement {

    @JsonProperty("agreementID")
    private String agreementID;

    @JsonProperty("planID")
    private String planID;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("accountID")
    private Optional<String> accountID;

    /**
     * The name of the agreement.
     */
    @JsonProperty("name")
    private String name;

    /**
     * The description of the agreement.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    private Optional<String> description;

    @JsonProperty("acceptedOn")
    private OffsetDateTime acceptedOn;

    @JsonProperty("status")
    private FeePlanAgreementStatus status;

    /**
     * Specifies the card processing pricing model
     */
    @JsonProperty("cardAcquiringModel")
    private CardAcquiringModel cardAcquiringModel;

    @JsonProperty("billableFees")
    private List<BillableFee> billableFees;

    /**
     * The minimum spending amount that must be met in the billing period. If actual usage is below the minimum amount, account is charged the difference.
     */
    @JsonProperty("minimumCommitment")
    private MinimumCommitment minimumCommitment;

    @JsonCreator
    public FeePlanAgreement(
            @JsonProperty("agreementID") String agreementID,
            @JsonProperty("planID") String planID,
            @JsonProperty("accountID") Optional<String> accountID,
            @JsonProperty("name") String name,
            @JsonProperty("description") Optional<String> description,
            @JsonProperty("acceptedOn") OffsetDateTime acceptedOn,
            @JsonProperty("status") FeePlanAgreementStatus status,
            @JsonProperty("cardAcquiringModel") CardAcquiringModel cardAcquiringModel,
            @JsonProperty("billableFees") List<BillableFee> billableFees,
            @JsonProperty("minimumCommitment") MinimumCommitment minimumCommitment) {
        Utils.checkNotNull(agreementID, "agreementID");
        Utils.checkNotNull(planID, "planID");
        Utils.checkNotNull(accountID, "accountID");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(description, "description");
        Utils.checkNotNull(acceptedOn, "acceptedOn");
        Utils.checkNotNull(status, "status");
        Utils.checkNotNull(cardAcquiringModel, "cardAcquiringModel");
        Utils.checkNotNull(billableFees, "billableFees");
        Utils.checkNotNull(minimumCommitment, "minimumCommitment");
        this.agreementID = agreementID;
        this.planID = planID;
        this.accountID = accountID;
        this.name = name;
        this.description = description;
        this.acceptedOn = acceptedOn;
        this.status = status;
        this.cardAcquiringModel = cardAcquiringModel;
        this.billableFees = billableFees;
        this.minimumCommitment = minimumCommitment;
    }
    
    public FeePlanAgreement(
            String agreementID,
            String planID,
            String name,
            OffsetDateTime acceptedOn,
            FeePlanAgreementStatus status,
            CardAcquiringModel cardAcquiringModel,
            List<BillableFee> billableFees,
            MinimumCommitment minimumCommitment) {
        this(agreementID, planID, Optional.empty(), name, Optional.empty(), acceptedOn, status, cardAcquiringModel, billableFees, minimumCommitment);
    }

    @JsonIgnore
    public String agreementID() {
        return agreementID;
    }

    @JsonIgnore
    public String planID() {
        return planID;
    }

    @JsonIgnore
    public Optional<String> accountID() {
        return accountID;
    }

    /**
     * The name of the agreement.
     */
    @JsonIgnore
    public String name() {
        return name;
    }

    /**
     * The description of the agreement.
     */
    @JsonIgnore
    public Optional<String> description() {
        return description;
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
    public CardAcquiringModel cardAcquiringModel() {
        return cardAcquiringModel;
    }

    @JsonIgnore
    public List<BillableFee> billableFees() {
        return billableFees;
    }

    /**
     * The minimum spending amount that must be met in the billing period. If actual usage is below the minimum amount, account is charged the difference.
     */
    @JsonIgnore
    public MinimumCommitment minimumCommitment() {
        return minimumCommitment;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public FeePlanAgreement withAgreementID(String agreementID) {
        Utils.checkNotNull(agreementID, "agreementID");
        this.agreementID = agreementID;
        return this;
    }

    public FeePlanAgreement withPlanID(String planID) {
        Utils.checkNotNull(planID, "planID");
        this.planID = planID;
        return this;
    }

    public FeePlanAgreement withAccountID(String accountID) {
        Utils.checkNotNull(accountID, "accountID");
        this.accountID = Optional.ofNullable(accountID);
        return this;
    }

    public FeePlanAgreement withAccountID(Optional<String> accountID) {
        Utils.checkNotNull(accountID, "accountID");
        this.accountID = accountID;
        return this;
    }

    /**
     * The name of the agreement.
     */
    public FeePlanAgreement withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    /**
     * The description of the agreement.
     */
    public FeePlanAgreement withDescription(String description) {
        Utils.checkNotNull(description, "description");
        this.description = Optional.ofNullable(description);
        return this;
    }

    /**
     * The description of the agreement.
     */
    public FeePlanAgreement withDescription(Optional<String> description) {
        Utils.checkNotNull(description, "description");
        this.description = description;
        return this;
    }

    public FeePlanAgreement withAcceptedOn(OffsetDateTime acceptedOn) {
        Utils.checkNotNull(acceptedOn, "acceptedOn");
        this.acceptedOn = acceptedOn;
        return this;
    }

    public FeePlanAgreement withStatus(FeePlanAgreementStatus status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
        return this;
    }

    /**
     * Specifies the card processing pricing model
     */
    public FeePlanAgreement withCardAcquiringModel(CardAcquiringModel cardAcquiringModel) {
        Utils.checkNotNull(cardAcquiringModel, "cardAcquiringModel");
        this.cardAcquiringModel = cardAcquiringModel;
        return this;
    }

    public FeePlanAgreement withBillableFees(List<BillableFee> billableFees) {
        Utils.checkNotNull(billableFees, "billableFees");
        this.billableFees = billableFees;
        return this;
    }

    /**
     * The minimum spending amount that must be met in the billing period. If actual usage is below the minimum amount, account is charged the difference.
     */
    public FeePlanAgreement withMinimumCommitment(MinimumCommitment minimumCommitment) {
        Utils.checkNotNull(minimumCommitment, "minimumCommitment");
        this.minimumCommitment = minimumCommitment;
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
        FeePlanAgreement other = (FeePlanAgreement) o;
        return 
            Objects.deepEquals(this.agreementID, other.agreementID) &&
            Objects.deepEquals(this.planID, other.planID) &&
            Objects.deepEquals(this.accountID, other.accountID) &&
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.description, other.description) &&
            Objects.deepEquals(this.acceptedOn, other.acceptedOn) &&
            Objects.deepEquals(this.status, other.status) &&
            Objects.deepEquals(this.cardAcquiringModel, other.cardAcquiringModel) &&
            Objects.deepEquals(this.billableFees, other.billableFees) &&
            Objects.deepEquals(this.minimumCommitment, other.minimumCommitment);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            agreementID,
            planID,
            accountID,
            name,
            description,
            acceptedOn,
            status,
            cardAcquiringModel,
            billableFees,
            minimumCommitment);
    }
    
    @Override
    public String toString() {
        return Utils.toString(FeePlanAgreement.class,
                "agreementID", agreementID,
                "planID", planID,
                "accountID", accountID,
                "name", name,
                "description", description,
                "acceptedOn", acceptedOn,
                "status", status,
                "cardAcquiringModel", cardAcquiringModel,
                "billableFees", billableFees,
                "minimumCommitment", minimumCommitment);
    }
    
    public final static class Builder {
 
        private String agreementID;
 
        private String planID;
 
        private Optional<String> accountID = Optional.empty();
 
        private String name;
 
        private Optional<String> description = Optional.empty();
 
        private OffsetDateTime acceptedOn;
 
        private FeePlanAgreementStatus status;
 
        private CardAcquiringModel cardAcquiringModel;
 
        private List<BillableFee> billableFees;
 
        private MinimumCommitment minimumCommitment;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder agreementID(String agreementID) {
            Utils.checkNotNull(agreementID, "agreementID");
            this.agreementID = agreementID;
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

        /**
         * The name of the agreement.
         */
        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        /**
         * The description of the agreement.
         */
        public Builder description(String description) {
            Utils.checkNotNull(description, "description");
            this.description = Optional.ofNullable(description);
            return this;
        }

        /**
         * The description of the agreement.
         */
        public Builder description(Optional<String> description) {
            Utils.checkNotNull(description, "description");
            this.description = description;
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
        public Builder cardAcquiringModel(CardAcquiringModel cardAcquiringModel) {
            Utils.checkNotNull(cardAcquiringModel, "cardAcquiringModel");
            this.cardAcquiringModel = cardAcquiringModel;
            return this;
        }

        public Builder billableFees(List<BillableFee> billableFees) {
            Utils.checkNotNull(billableFees, "billableFees");
            this.billableFees = billableFees;
            return this;
        }

        /**
         * The minimum spending amount that must be met in the billing period. If actual usage is below the minimum amount, account is charged the difference.
         */
        public Builder minimumCommitment(MinimumCommitment minimumCommitment) {
            Utils.checkNotNull(minimumCommitment, "minimumCommitment");
            this.minimumCommitment = minimumCommitment;
            return this;
        }
        
        public FeePlanAgreement build() {
            return new FeePlanAgreement(
                agreementID,
                planID,
                accountID,
                name,
                description,
                acceptedOn,
                status,
                cardAcquiringModel,
                billableFees,
                minimumCommitment);
        }
    }
}

