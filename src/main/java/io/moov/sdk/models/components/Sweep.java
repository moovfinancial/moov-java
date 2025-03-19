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
import java.util.Objects;
import java.util.Optional;


public class Sweep {

    @JsonProperty("sweepID")
    private String sweepID;

    @JsonProperty("status")
    private SweepStatus status;

    /**
     * The total net amount of wallet transactions accrued in the sweep.
     */
    @JsonProperty("accruedAmount")
    private String accruedAmount;

    /**
     * Amount remaining in the wallet after the sweep transfer completes.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("residualBalance")
    private Optional<String> residualBalance;

    /**
     * A 3-letter ISO 4217 currency code.
     */
    @JsonProperty("currency")
    private String currency;

    /**
     * The date-time the sweep began accruing transactions.
     */
    @JsonProperty("accrualStartedOn")
    private OffsetDateTime accrualStartedOn;

    /**
     * The date-time the sweep stopped accruing transactions.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("accrualEndedOn")
    private Optional<OffsetDateTime> accrualEndedOn;

    /**
     * ID of the payment method.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("pushPaymentMethodID")
    private Optional<String> pushPaymentMethodID;

    /**
     * ID of the payment method.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("pullPaymentMethodID")
    private Optional<String> pullPaymentMethodID;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("transferID")
    private Optional<String> transferID;

    /**
     * Amount that is transferred.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("transferAmount")
    private Optional<String> transferAmount;

    /**
     * The text that appears on the banking statement. The default descriptor is a 10 character ID if an override is not set in the sweep configs statementDescriptor.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("statementDescriptor")
    private Optional<String> statementDescriptor;

    @JsonCreator
    public Sweep(
            @JsonProperty("sweepID") String sweepID,
            @JsonProperty("status") SweepStatus status,
            @JsonProperty("accruedAmount") String accruedAmount,
            @JsonProperty("residualBalance") Optional<String> residualBalance,
            @JsonProperty("currency") String currency,
            @JsonProperty("accrualStartedOn") OffsetDateTime accrualStartedOn,
            @JsonProperty("accrualEndedOn") Optional<OffsetDateTime> accrualEndedOn,
            @JsonProperty("pushPaymentMethodID") Optional<String> pushPaymentMethodID,
            @JsonProperty("pullPaymentMethodID") Optional<String> pullPaymentMethodID,
            @JsonProperty("transferID") Optional<String> transferID,
            @JsonProperty("transferAmount") Optional<String> transferAmount,
            @JsonProperty("statementDescriptor") Optional<String> statementDescriptor) {
        Utils.checkNotNull(sweepID, "sweepID");
        Utils.checkNotNull(status, "status");
        Utils.checkNotNull(accruedAmount, "accruedAmount");
        Utils.checkNotNull(residualBalance, "residualBalance");
        Utils.checkNotNull(currency, "currency");
        Utils.checkNotNull(accrualStartedOn, "accrualStartedOn");
        Utils.checkNotNull(accrualEndedOn, "accrualEndedOn");
        Utils.checkNotNull(pushPaymentMethodID, "pushPaymentMethodID");
        Utils.checkNotNull(pullPaymentMethodID, "pullPaymentMethodID");
        Utils.checkNotNull(transferID, "transferID");
        Utils.checkNotNull(transferAmount, "transferAmount");
        Utils.checkNotNull(statementDescriptor, "statementDescriptor");
        this.sweepID = sweepID;
        this.status = status;
        this.accruedAmount = accruedAmount;
        this.residualBalance = residualBalance;
        this.currency = currency;
        this.accrualStartedOn = accrualStartedOn;
        this.accrualEndedOn = accrualEndedOn;
        this.pushPaymentMethodID = pushPaymentMethodID;
        this.pullPaymentMethodID = pullPaymentMethodID;
        this.transferID = transferID;
        this.transferAmount = transferAmount;
        this.statementDescriptor = statementDescriptor;
    }
    
    public Sweep(
            String sweepID,
            SweepStatus status,
            String accruedAmount,
            String currency,
            OffsetDateTime accrualStartedOn) {
        this(sweepID, status, accruedAmount, Optional.empty(), currency, accrualStartedOn, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public String sweepID() {
        return sweepID;
    }

    @JsonIgnore
    public SweepStatus status() {
        return status;
    }

    /**
     * The total net amount of wallet transactions accrued in the sweep.
     */
    @JsonIgnore
    public String accruedAmount() {
        return accruedAmount;
    }

    /**
     * Amount remaining in the wallet after the sweep transfer completes.
     */
    @JsonIgnore
    public Optional<String> residualBalance() {
        return residualBalance;
    }

    /**
     * A 3-letter ISO 4217 currency code.
     */
    @JsonIgnore
    public String currency() {
        return currency;
    }

    /**
     * The date-time the sweep began accruing transactions.
     */
    @JsonIgnore
    public OffsetDateTime accrualStartedOn() {
        return accrualStartedOn;
    }

    /**
     * The date-time the sweep stopped accruing transactions.
     */
    @JsonIgnore
    public Optional<OffsetDateTime> accrualEndedOn() {
        return accrualEndedOn;
    }

    /**
     * ID of the payment method.
     */
    @JsonIgnore
    public Optional<String> pushPaymentMethodID() {
        return pushPaymentMethodID;
    }

    /**
     * ID of the payment method.
     */
    @JsonIgnore
    public Optional<String> pullPaymentMethodID() {
        return pullPaymentMethodID;
    }

    @JsonIgnore
    public Optional<String> transferID() {
        return transferID;
    }

    /**
     * Amount that is transferred.
     */
    @JsonIgnore
    public Optional<String> transferAmount() {
        return transferAmount;
    }

    /**
     * The text that appears on the banking statement. The default descriptor is a 10 character ID if an override is not set in the sweep configs statementDescriptor.
     */
    @JsonIgnore
    public Optional<String> statementDescriptor() {
        return statementDescriptor;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public Sweep withSweepID(String sweepID) {
        Utils.checkNotNull(sweepID, "sweepID");
        this.sweepID = sweepID;
        return this;
    }

    public Sweep withStatus(SweepStatus status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
        return this;
    }

    /**
     * The total net amount of wallet transactions accrued in the sweep.
     */
    public Sweep withAccruedAmount(String accruedAmount) {
        Utils.checkNotNull(accruedAmount, "accruedAmount");
        this.accruedAmount = accruedAmount;
        return this;
    }

    /**
     * Amount remaining in the wallet after the sweep transfer completes.
     */
    public Sweep withResidualBalance(String residualBalance) {
        Utils.checkNotNull(residualBalance, "residualBalance");
        this.residualBalance = Optional.ofNullable(residualBalance);
        return this;
    }

    /**
     * Amount remaining in the wallet after the sweep transfer completes.
     */
    public Sweep withResidualBalance(Optional<String> residualBalance) {
        Utils.checkNotNull(residualBalance, "residualBalance");
        this.residualBalance = residualBalance;
        return this;
    }

    /**
     * A 3-letter ISO 4217 currency code.
     */
    public Sweep withCurrency(String currency) {
        Utils.checkNotNull(currency, "currency");
        this.currency = currency;
        return this;
    }

    /**
     * The date-time the sweep began accruing transactions.
     */
    public Sweep withAccrualStartedOn(OffsetDateTime accrualStartedOn) {
        Utils.checkNotNull(accrualStartedOn, "accrualStartedOn");
        this.accrualStartedOn = accrualStartedOn;
        return this;
    }

    /**
     * The date-time the sweep stopped accruing transactions.
     */
    public Sweep withAccrualEndedOn(OffsetDateTime accrualEndedOn) {
        Utils.checkNotNull(accrualEndedOn, "accrualEndedOn");
        this.accrualEndedOn = Optional.ofNullable(accrualEndedOn);
        return this;
    }

    /**
     * The date-time the sweep stopped accruing transactions.
     */
    public Sweep withAccrualEndedOn(Optional<OffsetDateTime> accrualEndedOn) {
        Utils.checkNotNull(accrualEndedOn, "accrualEndedOn");
        this.accrualEndedOn = accrualEndedOn;
        return this;
    }

    /**
     * ID of the payment method.
     */
    public Sweep withPushPaymentMethodID(String pushPaymentMethodID) {
        Utils.checkNotNull(pushPaymentMethodID, "pushPaymentMethodID");
        this.pushPaymentMethodID = Optional.ofNullable(pushPaymentMethodID);
        return this;
    }

    /**
     * ID of the payment method.
     */
    public Sweep withPushPaymentMethodID(Optional<String> pushPaymentMethodID) {
        Utils.checkNotNull(pushPaymentMethodID, "pushPaymentMethodID");
        this.pushPaymentMethodID = pushPaymentMethodID;
        return this;
    }

    /**
     * ID of the payment method.
     */
    public Sweep withPullPaymentMethodID(String pullPaymentMethodID) {
        Utils.checkNotNull(pullPaymentMethodID, "pullPaymentMethodID");
        this.pullPaymentMethodID = Optional.ofNullable(pullPaymentMethodID);
        return this;
    }

    /**
     * ID of the payment method.
     */
    public Sweep withPullPaymentMethodID(Optional<String> pullPaymentMethodID) {
        Utils.checkNotNull(pullPaymentMethodID, "pullPaymentMethodID");
        this.pullPaymentMethodID = pullPaymentMethodID;
        return this;
    }

    public Sweep withTransferID(String transferID) {
        Utils.checkNotNull(transferID, "transferID");
        this.transferID = Optional.ofNullable(transferID);
        return this;
    }

    public Sweep withTransferID(Optional<String> transferID) {
        Utils.checkNotNull(transferID, "transferID");
        this.transferID = transferID;
        return this;
    }

    /**
     * Amount that is transferred.
     */
    public Sweep withTransferAmount(String transferAmount) {
        Utils.checkNotNull(transferAmount, "transferAmount");
        this.transferAmount = Optional.ofNullable(transferAmount);
        return this;
    }

    /**
     * Amount that is transferred.
     */
    public Sweep withTransferAmount(Optional<String> transferAmount) {
        Utils.checkNotNull(transferAmount, "transferAmount");
        this.transferAmount = transferAmount;
        return this;
    }

    /**
     * The text that appears on the banking statement. The default descriptor is a 10 character ID if an override is not set in the sweep configs statementDescriptor.
     */
    public Sweep withStatementDescriptor(String statementDescriptor) {
        Utils.checkNotNull(statementDescriptor, "statementDescriptor");
        this.statementDescriptor = Optional.ofNullable(statementDescriptor);
        return this;
    }

    /**
     * The text that appears on the banking statement. The default descriptor is a 10 character ID if an override is not set in the sweep configs statementDescriptor.
     */
    public Sweep withStatementDescriptor(Optional<String> statementDescriptor) {
        Utils.checkNotNull(statementDescriptor, "statementDescriptor");
        this.statementDescriptor = statementDescriptor;
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
        Sweep other = (Sweep) o;
        return 
            Objects.deepEquals(this.sweepID, other.sweepID) &&
            Objects.deepEquals(this.status, other.status) &&
            Objects.deepEquals(this.accruedAmount, other.accruedAmount) &&
            Objects.deepEquals(this.residualBalance, other.residualBalance) &&
            Objects.deepEquals(this.currency, other.currency) &&
            Objects.deepEquals(this.accrualStartedOn, other.accrualStartedOn) &&
            Objects.deepEquals(this.accrualEndedOn, other.accrualEndedOn) &&
            Objects.deepEquals(this.pushPaymentMethodID, other.pushPaymentMethodID) &&
            Objects.deepEquals(this.pullPaymentMethodID, other.pullPaymentMethodID) &&
            Objects.deepEquals(this.transferID, other.transferID) &&
            Objects.deepEquals(this.transferAmount, other.transferAmount) &&
            Objects.deepEquals(this.statementDescriptor, other.statementDescriptor);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            sweepID,
            status,
            accruedAmount,
            residualBalance,
            currency,
            accrualStartedOn,
            accrualEndedOn,
            pushPaymentMethodID,
            pullPaymentMethodID,
            transferID,
            transferAmount,
            statementDescriptor);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Sweep.class,
                "sweepID", sweepID,
                "status", status,
                "accruedAmount", accruedAmount,
                "residualBalance", residualBalance,
                "currency", currency,
                "accrualStartedOn", accrualStartedOn,
                "accrualEndedOn", accrualEndedOn,
                "pushPaymentMethodID", pushPaymentMethodID,
                "pullPaymentMethodID", pullPaymentMethodID,
                "transferID", transferID,
                "transferAmount", transferAmount,
                "statementDescriptor", statementDescriptor);
    }
    
    public final static class Builder {
 
        private String sweepID;
 
        private SweepStatus status;
 
        private String accruedAmount;
 
        private Optional<String> residualBalance = Optional.empty();
 
        private String currency;
 
        private OffsetDateTime accrualStartedOn;
 
        private Optional<OffsetDateTime> accrualEndedOn = Optional.empty();
 
        private Optional<String> pushPaymentMethodID = Optional.empty();
 
        private Optional<String> pullPaymentMethodID = Optional.empty();
 
        private Optional<String> transferID = Optional.empty();
 
        private Optional<String> transferAmount = Optional.empty();
 
        private Optional<String> statementDescriptor = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder sweepID(String sweepID) {
            Utils.checkNotNull(sweepID, "sweepID");
            this.sweepID = sweepID;
            return this;
        }

        public Builder status(SweepStatus status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }

        /**
         * The total net amount of wallet transactions accrued in the sweep.
         */
        public Builder accruedAmount(String accruedAmount) {
            Utils.checkNotNull(accruedAmount, "accruedAmount");
            this.accruedAmount = accruedAmount;
            return this;
        }

        /**
         * Amount remaining in the wallet after the sweep transfer completes.
         */
        public Builder residualBalance(String residualBalance) {
            Utils.checkNotNull(residualBalance, "residualBalance");
            this.residualBalance = Optional.ofNullable(residualBalance);
            return this;
        }

        /**
         * Amount remaining in the wallet after the sweep transfer completes.
         */
        public Builder residualBalance(Optional<String> residualBalance) {
            Utils.checkNotNull(residualBalance, "residualBalance");
            this.residualBalance = residualBalance;
            return this;
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
         * The date-time the sweep began accruing transactions.
         */
        public Builder accrualStartedOn(OffsetDateTime accrualStartedOn) {
            Utils.checkNotNull(accrualStartedOn, "accrualStartedOn");
            this.accrualStartedOn = accrualStartedOn;
            return this;
        }

        /**
         * The date-time the sweep stopped accruing transactions.
         */
        public Builder accrualEndedOn(OffsetDateTime accrualEndedOn) {
            Utils.checkNotNull(accrualEndedOn, "accrualEndedOn");
            this.accrualEndedOn = Optional.ofNullable(accrualEndedOn);
            return this;
        }

        /**
         * The date-time the sweep stopped accruing transactions.
         */
        public Builder accrualEndedOn(Optional<OffsetDateTime> accrualEndedOn) {
            Utils.checkNotNull(accrualEndedOn, "accrualEndedOn");
            this.accrualEndedOn = accrualEndedOn;
            return this;
        }

        /**
         * ID of the payment method.
         */
        public Builder pushPaymentMethodID(String pushPaymentMethodID) {
            Utils.checkNotNull(pushPaymentMethodID, "pushPaymentMethodID");
            this.pushPaymentMethodID = Optional.ofNullable(pushPaymentMethodID);
            return this;
        }

        /**
         * ID of the payment method.
         */
        public Builder pushPaymentMethodID(Optional<String> pushPaymentMethodID) {
            Utils.checkNotNull(pushPaymentMethodID, "pushPaymentMethodID");
            this.pushPaymentMethodID = pushPaymentMethodID;
            return this;
        }

        /**
         * ID of the payment method.
         */
        public Builder pullPaymentMethodID(String pullPaymentMethodID) {
            Utils.checkNotNull(pullPaymentMethodID, "pullPaymentMethodID");
            this.pullPaymentMethodID = Optional.ofNullable(pullPaymentMethodID);
            return this;
        }

        /**
         * ID of the payment method.
         */
        public Builder pullPaymentMethodID(Optional<String> pullPaymentMethodID) {
            Utils.checkNotNull(pullPaymentMethodID, "pullPaymentMethodID");
            this.pullPaymentMethodID = pullPaymentMethodID;
            return this;
        }

        public Builder transferID(String transferID) {
            Utils.checkNotNull(transferID, "transferID");
            this.transferID = Optional.ofNullable(transferID);
            return this;
        }

        public Builder transferID(Optional<String> transferID) {
            Utils.checkNotNull(transferID, "transferID");
            this.transferID = transferID;
            return this;
        }

        /**
         * Amount that is transferred.
         */
        public Builder transferAmount(String transferAmount) {
            Utils.checkNotNull(transferAmount, "transferAmount");
            this.transferAmount = Optional.ofNullable(transferAmount);
            return this;
        }

        /**
         * Amount that is transferred.
         */
        public Builder transferAmount(Optional<String> transferAmount) {
            Utils.checkNotNull(transferAmount, "transferAmount");
            this.transferAmount = transferAmount;
            return this;
        }

        /**
         * The text that appears on the banking statement. The default descriptor is a 10 character ID if an override is not set in the sweep configs statementDescriptor.
         */
        public Builder statementDescriptor(String statementDescriptor) {
            Utils.checkNotNull(statementDescriptor, "statementDescriptor");
            this.statementDescriptor = Optional.ofNullable(statementDescriptor);
            return this;
        }

        /**
         * The text that appears on the banking statement. The default descriptor is a 10 character ID if an override is not set in the sweep configs statementDescriptor.
         */
        public Builder statementDescriptor(Optional<String> statementDescriptor) {
            Utils.checkNotNull(statementDescriptor, "statementDescriptor");
            this.statementDescriptor = statementDescriptor;
            return this;
        }
        
        public Sweep build() {
            return new Sweep(
                sweepID,
                status,
                accruedAmount,
                residualBalance,
                currency,
                accrualStartedOn,
                accrualEndedOn,
                pushPaymentMethodID,
                pullPaymentMethodID,
                transferID,
                transferAmount,
                statementDescriptor);
        }
    }
}

