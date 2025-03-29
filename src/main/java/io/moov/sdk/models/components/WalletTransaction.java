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
import java.lang.SuppressWarnings;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * WalletTransaction
 * 
 * <p>A transaction that funds or deducts from the wallet.
 */
public class WalletTransaction {

    @JsonProperty("walletID")
    private String walletID;

    @JsonProperty("transactionID")
    private String transactionID;

    @JsonProperty("transactionType")
    private WalletTransactionType transactionType;

    @JsonProperty("sourceType")
    private WalletTransactionSourceType sourceType;

    /**
     * The ID of the Moov object to which this transaction is related.
     */
    @JsonProperty("sourceID")
    private String sourceID;

    @JsonProperty("status")
    private WalletTransactionStatus status;

    /**
     * Detailed description of the transaction.
     */
    @JsonProperty("memo")
    private String memo;

    @JsonProperty("createdOn")
    private OffsetDateTime createdOn;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("completedOn")
    private Optional<OffsetDateTime> completedOn;

    /**
     * A 3-letter ISO 4217 currency code.
     */
    @JsonProperty("currency")
    private String currency;

    /**
     * The total transaction amount. The amount is in the smallest unit of the specified currency. In USD this is cents, for example, $12.04 is 1204 and $0.99 is 99.
     */
    @JsonProperty("grossAmount")
    private long grossAmount;

    /**
     * The total transaction amount. Same as `grossAmount`, but a decimal-formatted numerical string that represents up to 9 decimal place precision. In USD for example, 12.987654321 is $12.987654321 and 0.9987634521 is $0.9987634521.
     */
    @JsonProperty("grossAmountDecimal")
    private String grossAmountDecimal;

    /**
     * Total fees paid for the transaction. The value is in the smallest unit of the specified currency. In USD this is cents, for example, $12.04 is 1204 and $0.99 is 99.
     */
    @JsonProperty("fee")
    private long fee;

    /**
     * The IDs of the fees paid for the transaction.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("feeIDs")
    private Optional<? extends List<String>> feeIDs;

    /**
     * Total fees paid for the transaction. Same as `fee`, but a decimal-formatted numerical string that represents up to 9 decimal place precision. In USD for example, 12.987654321 is $12.987654321 and 0.9987634521 is $0.9987634521.
     */
    @JsonProperty("feeDecimal")
    private String feeDecimal;

    /**
     * Net amount is the gross amount less fees paid, and the amount that affects the wallet's balance. The amount is in the smallest unit of the specified currency. In USD this is cents, for example, $12.04 is 1204 and $0.99 is 99.
     */
    @JsonProperty("netAmount")
    private long netAmount;

    /**
     * Net amount is the gross amount less fees paid, and the amount that affects the wallet's balance. Same as `netAmount`, but a decimal-formatted numerical string that represents up to 9 decimal place precision. In USD for example, 12.987654321 is $12.987654321 and 0.9987634521 is $0.9987634521.
     */
    @JsonProperty("netAmountDecimal")
    private String netAmountDecimal;

    /**
     * The wallet's total available balance after recording a completed transaction. The value is in the smallest unit of the specified currency. In USD this is cents, for example, $12.04 is 1204 and $0.99 is 99.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("availableBalance")
    private Optional<Long> availableBalance;

    /**
     * The wallet's total available balance after recording a completed transaction. Same as `availableBalance`, but a decimal-formatted numerical string that represents up to 9 decimal place precision. In USD for example, 12.987654321 is $12.987654321 and 0.9987634521 is $0.9987634521.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("availableBalanceDecimal")
    private Optional<String> availableBalanceDecimal;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sweepID")
    private Optional<String> sweepID;

    @JsonCreator
    public WalletTransaction(
            @JsonProperty("walletID") String walletID,
            @JsonProperty("transactionID") String transactionID,
            @JsonProperty("transactionType") WalletTransactionType transactionType,
            @JsonProperty("sourceType") WalletTransactionSourceType sourceType,
            @JsonProperty("sourceID") String sourceID,
            @JsonProperty("status") WalletTransactionStatus status,
            @JsonProperty("memo") String memo,
            @JsonProperty("createdOn") OffsetDateTime createdOn,
            @JsonProperty("completedOn") Optional<OffsetDateTime> completedOn,
            @JsonProperty("currency") String currency,
            @JsonProperty("grossAmount") long grossAmount,
            @JsonProperty("grossAmountDecimal") String grossAmountDecimal,
            @JsonProperty("fee") long fee,
            @JsonProperty("feeIDs") Optional<? extends List<String>> feeIDs,
            @JsonProperty("feeDecimal") String feeDecimal,
            @JsonProperty("netAmount") long netAmount,
            @JsonProperty("netAmountDecimal") String netAmountDecimal,
            @JsonProperty("availableBalance") Optional<Long> availableBalance,
            @JsonProperty("availableBalanceDecimal") Optional<String> availableBalanceDecimal,
            @JsonProperty("sweepID") Optional<String> sweepID) {
        Utils.checkNotNull(walletID, "walletID");
        Utils.checkNotNull(transactionID, "transactionID");
        Utils.checkNotNull(transactionType, "transactionType");
        Utils.checkNotNull(sourceType, "sourceType");
        Utils.checkNotNull(sourceID, "sourceID");
        Utils.checkNotNull(status, "status");
        Utils.checkNotNull(memo, "memo");
        Utils.checkNotNull(createdOn, "createdOn");
        Utils.checkNotNull(completedOn, "completedOn");
        Utils.checkNotNull(currency, "currency");
        Utils.checkNotNull(grossAmount, "grossAmount");
        Utils.checkNotNull(grossAmountDecimal, "grossAmountDecimal");
        Utils.checkNotNull(fee, "fee");
        Utils.checkNotNull(feeIDs, "feeIDs");
        Utils.checkNotNull(feeDecimal, "feeDecimal");
        Utils.checkNotNull(netAmount, "netAmount");
        Utils.checkNotNull(netAmountDecimal, "netAmountDecimal");
        Utils.checkNotNull(availableBalance, "availableBalance");
        Utils.checkNotNull(availableBalanceDecimal, "availableBalanceDecimal");
        Utils.checkNotNull(sweepID, "sweepID");
        this.walletID = walletID;
        this.transactionID = transactionID;
        this.transactionType = transactionType;
        this.sourceType = sourceType;
        this.sourceID = sourceID;
        this.status = status;
        this.memo = memo;
        this.createdOn = createdOn;
        this.completedOn = completedOn;
        this.currency = currency;
        this.grossAmount = grossAmount;
        this.grossAmountDecimal = grossAmountDecimal;
        this.fee = fee;
        this.feeIDs = feeIDs;
        this.feeDecimal = feeDecimal;
        this.netAmount = netAmount;
        this.netAmountDecimal = netAmountDecimal;
        this.availableBalance = availableBalance;
        this.availableBalanceDecimal = availableBalanceDecimal;
        this.sweepID = sweepID;
    }
    
    public WalletTransaction(
            String walletID,
            String transactionID,
            WalletTransactionType transactionType,
            WalletTransactionSourceType sourceType,
            String sourceID,
            WalletTransactionStatus status,
            String memo,
            OffsetDateTime createdOn,
            String currency,
            long grossAmount,
            String grossAmountDecimal,
            long fee,
            String feeDecimal,
            long netAmount,
            String netAmountDecimal) {
        this(walletID, transactionID, transactionType, sourceType, sourceID, status, memo, createdOn, Optional.empty(), currency, grossAmount, grossAmountDecimal, fee, Optional.empty(), feeDecimal, netAmount, netAmountDecimal, Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public String walletID() {
        return walletID;
    }

    @JsonIgnore
    public String transactionID() {
        return transactionID;
    }

    @JsonIgnore
    public WalletTransactionType transactionType() {
        return transactionType;
    }

    @JsonIgnore
    public WalletTransactionSourceType sourceType() {
        return sourceType;
    }

    /**
     * The ID of the Moov object to which this transaction is related.
     */
    @JsonIgnore
    public String sourceID() {
        return sourceID;
    }

    @JsonIgnore
    public WalletTransactionStatus status() {
        return status;
    }

    /**
     * Detailed description of the transaction.
     */
    @JsonIgnore
    public String memo() {
        return memo;
    }

    @JsonIgnore
    public OffsetDateTime createdOn() {
        return createdOn;
    }

    @JsonIgnore
    public Optional<OffsetDateTime> completedOn() {
        return completedOn;
    }

    /**
     * A 3-letter ISO 4217 currency code.
     */
    @JsonIgnore
    public String currency() {
        return currency;
    }

    /**
     * The total transaction amount. The amount is in the smallest unit of the specified currency. In USD this is cents, for example, $12.04 is 1204 and $0.99 is 99.
     */
    @JsonIgnore
    public long grossAmount() {
        return grossAmount;
    }

    /**
     * The total transaction amount. Same as `grossAmount`, but a decimal-formatted numerical string that represents up to 9 decimal place precision. In USD for example, 12.987654321 is $12.987654321 and 0.9987634521 is $0.9987634521.
     */
    @JsonIgnore
    public String grossAmountDecimal() {
        return grossAmountDecimal;
    }

    /**
     * Total fees paid for the transaction. The value is in the smallest unit of the specified currency. In USD this is cents, for example, $12.04 is 1204 and $0.99 is 99.
     */
    @JsonIgnore
    public long fee() {
        return fee;
    }

    /**
     * The IDs of the fees paid for the transaction.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<String>> feeIDs() {
        return (Optional<List<String>>) feeIDs;
    }

    /**
     * Total fees paid for the transaction. Same as `fee`, but a decimal-formatted numerical string that represents up to 9 decimal place precision. In USD for example, 12.987654321 is $12.987654321 and 0.9987634521 is $0.9987634521.
     */
    @JsonIgnore
    public String feeDecimal() {
        return feeDecimal;
    }

    /**
     * Net amount is the gross amount less fees paid, and the amount that affects the wallet's balance. The amount is in the smallest unit of the specified currency. In USD this is cents, for example, $12.04 is 1204 and $0.99 is 99.
     */
    @JsonIgnore
    public long netAmount() {
        return netAmount;
    }

    /**
     * Net amount is the gross amount less fees paid, and the amount that affects the wallet's balance. Same as `netAmount`, but a decimal-formatted numerical string that represents up to 9 decimal place precision. In USD for example, 12.987654321 is $12.987654321 and 0.9987634521 is $0.9987634521.
     */
    @JsonIgnore
    public String netAmountDecimal() {
        return netAmountDecimal;
    }

    /**
     * The wallet's total available balance after recording a completed transaction. The value is in the smallest unit of the specified currency. In USD this is cents, for example, $12.04 is 1204 and $0.99 is 99.
     */
    @JsonIgnore
    public Optional<Long> availableBalance() {
        return availableBalance;
    }

    /**
     * The wallet's total available balance after recording a completed transaction. Same as `availableBalance`, but a decimal-formatted numerical string that represents up to 9 decimal place precision. In USD for example, 12.987654321 is $12.987654321 and 0.9987634521 is $0.9987634521.
     */
    @JsonIgnore
    public Optional<String> availableBalanceDecimal() {
        return availableBalanceDecimal;
    }

    @JsonIgnore
    public Optional<String> sweepID() {
        return sweepID;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public WalletTransaction withWalletID(String walletID) {
        Utils.checkNotNull(walletID, "walletID");
        this.walletID = walletID;
        return this;
    }

    public WalletTransaction withTransactionID(String transactionID) {
        Utils.checkNotNull(transactionID, "transactionID");
        this.transactionID = transactionID;
        return this;
    }

    public WalletTransaction withTransactionType(WalletTransactionType transactionType) {
        Utils.checkNotNull(transactionType, "transactionType");
        this.transactionType = transactionType;
        return this;
    }

    public WalletTransaction withSourceType(WalletTransactionSourceType sourceType) {
        Utils.checkNotNull(sourceType, "sourceType");
        this.sourceType = sourceType;
        return this;
    }

    /**
     * The ID of the Moov object to which this transaction is related.
     */
    public WalletTransaction withSourceID(String sourceID) {
        Utils.checkNotNull(sourceID, "sourceID");
        this.sourceID = sourceID;
        return this;
    }

    public WalletTransaction withStatus(WalletTransactionStatus status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
        return this;
    }

    /**
     * Detailed description of the transaction.
     */
    public WalletTransaction withMemo(String memo) {
        Utils.checkNotNull(memo, "memo");
        this.memo = memo;
        return this;
    }

    public WalletTransaction withCreatedOn(OffsetDateTime createdOn) {
        Utils.checkNotNull(createdOn, "createdOn");
        this.createdOn = createdOn;
        return this;
    }

    public WalletTransaction withCompletedOn(OffsetDateTime completedOn) {
        Utils.checkNotNull(completedOn, "completedOn");
        this.completedOn = Optional.ofNullable(completedOn);
        return this;
    }

    public WalletTransaction withCompletedOn(Optional<OffsetDateTime> completedOn) {
        Utils.checkNotNull(completedOn, "completedOn");
        this.completedOn = completedOn;
        return this;
    }

    /**
     * A 3-letter ISO 4217 currency code.
     */
    public WalletTransaction withCurrency(String currency) {
        Utils.checkNotNull(currency, "currency");
        this.currency = currency;
        return this;
    }

    /**
     * The total transaction amount. The amount is in the smallest unit of the specified currency. In USD this is cents, for example, $12.04 is 1204 and $0.99 is 99.
     */
    public WalletTransaction withGrossAmount(long grossAmount) {
        Utils.checkNotNull(grossAmount, "grossAmount");
        this.grossAmount = grossAmount;
        return this;
    }

    /**
     * The total transaction amount. Same as `grossAmount`, but a decimal-formatted numerical string that represents up to 9 decimal place precision. In USD for example, 12.987654321 is $12.987654321 and 0.9987634521 is $0.9987634521.
     */
    public WalletTransaction withGrossAmountDecimal(String grossAmountDecimal) {
        Utils.checkNotNull(grossAmountDecimal, "grossAmountDecimal");
        this.grossAmountDecimal = grossAmountDecimal;
        return this;
    }

    /**
     * Total fees paid for the transaction. The value is in the smallest unit of the specified currency. In USD this is cents, for example, $12.04 is 1204 and $0.99 is 99.
     */
    public WalletTransaction withFee(long fee) {
        Utils.checkNotNull(fee, "fee");
        this.fee = fee;
        return this;
    }

    /**
     * The IDs of the fees paid for the transaction.
     */
    public WalletTransaction withFeeIDs(List<String> feeIDs) {
        Utils.checkNotNull(feeIDs, "feeIDs");
        this.feeIDs = Optional.ofNullable(feeIDs);
        return this;
    }

    /**
     * The IDs of the fees paid for the transaction.
     */
    public WalletTransaction withFeeIDs(Optional<? extends List<String>> feeIDs) {
        Utils.checkNotNull(feeIDs, "feeIDs");
        this.feeIDs = feeIDs;
        return this;
    }

    /**
     * Total fees paid for the transaction. Same as `fee`, but a decimal-formatted numerical string that represents up to 9 decimal place precision. In USD for example, 12.987654321 is $12.987654321 and 0.9987634521 is $0.9987634521.
     */
    public WalletTransaction withFeeDecimal(String feeDecimal) {
        Utils.checkNotNull(feeDecimal, "feeDecimal");
        this.feeDecimal = feeDecimal;
        return this;
    }

    /**
     * Net amount is the gross amount less fees paid, and the amount that affects the wallet's balance. The amount is in the smallest unit of the specified currency. In USD this is cents, for example, $12.04 is 1204 and $0.99 is 99.
     */
    public WalletTransaction withNetAmount(long netAmount) {
        Utils.checkNotNull(netAmount, "netAmount");
        this.netAmount = netAmount;
        return this;
    }

    /**
     * Net amount is the gross amount less fees paid, and the amount that affects the wallet's balance. Same as `netAmount`, but a decimal-formatted numerical string that represents up to 9 decimal place precision. In USD for example, 12.987654321 is $12.987654321 and 0.9987634521 is $0.9987634521.
     */
    public WalletTransaction withNetAmountDecimal(String netAmountDecimal) {
        Utils.checkNotNull(netAmountDecimal, "netAmountDecimal");
        this.netAmountDecimal = netAmountDecimal;
        return this;
    }

    /**
     * The wallet's total available balance after recording a completed transaction. The value is in the smallest unit of the specified currency. In USD this is cents, for example, $12.04 is 1204 and $0.99 is 99.
     */
    public WalletTransaction withAvailableBalance(long availableBalance) {
        Utils.checkNotNull(availableBalance, "availableBalance");
        this.availableBalance = Optional.ofNullable(availableBalance);
        return this;
    }

    /**
     * The wallet's total available balance after recording a completed transaction. The value is in the smallest unit of the specified currency. In USD this is cents, for example, $12.04 is 1204 and $0.99 is 99.
     */
    public WalletTransaction withAvailableBalance(Optional<Long> availableBalance) {
        Utils.checkNotNull(availableBalance, "availableBalance");
        this.availableBalance = availableBalance;
        return this;
    }

    /**
     * The wallet's total available balance after recording a completed transaction. Same as `availableBalance`, but a decimal-formatted numerical string that represents up to 9 decimal place precision. In USD for example, 12.987654321 is $12.987654321 and 0.9987634521 is $0.9987634521.
     */
    public WalletTransaction withAvailableBalanceDecimal(String availableBalanceDecimal) {
        Utils.checkNotNull(availableBalanceDecimal, "availableBalanceDecimal");
        this.availableBalanceDecimal = Optional.ofNullable(availableBalanceDecimal);
        return this;
    }

    /**
     * The wallet's total available balance after recording a completed transaction. Same as `availableBalance`, but a decimal-formatted numerical string that represents up to 9 decimal place precision. In USD for example, 12.987654321 is $12.987654321 and 0.9987634521 is $0.9987634521.
     */
    public WalletTransaction withAvailableBalanceDecimal(Optional<String> availableBalanceDecimal) {
        Utils.checkNotNull(availableBalanceDecimal, "availableBalanceDecimal");
        this.availableBalanceDecimal = availableBalanceDecimal;
        return this;
    }

    public WalletTransaction withSweepID(String sweepID) {
        Utils.checkNotNull(sweepID, "sweepID");
        this.sweepID = Optional.ofNullable(sweepID);
        return this;
    }

    public WalletTransaction withSweepID(Optional<String> sweepID) {
        Utils.checkNotNull(sweepID, "sweepID");
        this.sweepID = sweepID;
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
        WalletTransaction other = (WalletTransaction) o;
        return 
            Objects.deepEquals(this.walletID, other.walletID) &&
            Objects.deepEquals(this.transactionID, other.transactionID) &&
            Objects.deepEquals(this.transactionType, other.transactionType) &&
            Objects.deepEquals(this.sourceType, other.sourceType) &&
            Objects.deepEquals(this.sourceID, other.sourceID) &&
            Objects.deepEquals(this.status, other.status) &&
            Objects.deepEquals(this.memo, other.memo) &&
            Objects.deepEquals(this.createdOn, other.createdOn) &&
            Objects.deepEquals(this.completedOn, other.completedOn) &&
            Objects.deepEquals(this.currency, other.currency) &&
            Objects.deepEquals(this.grossAmount, other.grossAmount) &&
            Objects.deepEquals(this.grossAmountDecimal, other.grossAmountDecimal) &&
            Objects.deepEquals(this.fee, other.fee) &&
            Objects.deepEquals(this.feeIDs, other.feeIDs) &&
            Objects.deepEquals(this.feeDecimal, other.feeDecimal) &&
            Objects.deepEquals(this.netAmount, other.netAmount) &&
            Objects.deepEquals(this.netAmountDecimal, other.netAmountDecimal) &&
            Objects.deepEquals(this.availableBalance, other.availableBalance) &&
            Objects.deepEquals(this.availableBalanceDecimal, other.availableBalanceDecimal) &&
            Objects.deepEquals(this.sweepID, other.sweepID);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            walletID,
            transactionID,
            transactionType,
            sourceType,
            sourceID,
            status,
            memo,
            createdOn,
            completedOn,
            currency,
            grossAmount,
            grossAmountDecimal,
            fee,
            feeIDs,
            feeDecimal,
            netAmount,
            netAmountDecimal,
            availableBalance,
            availableBalanceDecimal,
            sweepID);
    }
    
    @Override
    public String toString() {
        return Utils.toString(WalletTransaction.class,
                "walletID", walletID,
                "transactionID", transactionID,
                "transactionType", transactionType,
                "sourceType", sourceType,
                "sourceID", sourceID,
                "status", status,
                "memo", memo,
                "createdOn", createdOn,
                "completedOn", completedOn,
                "currency", currency,
                "grossAmount", grossAmount,
                "grossAmountDecimal", grossAmountDecimal,
                "fee", fee,
                "feeIDs", feeIDs,
                "feeDecimal", feeDecimal,
                "netAmount", netAmount,
                "netAmountDecimal", netAmountDecimal,
                "availableBalance", availableBalance,
                "availableBalanceDecimal", availableBalanceDecimal,
                "sweepID", sweepID);
    }
    
    public final static class Builder {
 
        private String walletID;
 
        private String transactionID;
 
        private WalletTransactionType transactionType;
 
        private WalletTransactionSourceType sourceType;
 
        private String sourceID;
 
        private WalletTransactionStatus status;
 
        private String memo;
 
        private OffsetDateTime createdOn;
 
        private Optional<OffsetDateTime> completedOn = Optional.empty();
 
        private String currency;
 
        private Long grossAmount;
 
        private String grossAmountDecimal;
 
        private Long fee;
 
        private Optional<? extends List<String>> feeIDs = Optional.empty();
 
        private String feeDecimal;
 
        private Long netAmount;
 
        private String netAmountDecimal;
 
        private Optional<Long> availableBalance = Optional.empty();
 
        private Optional<String> availableBalanceDecimal = Optional.empty();
 
        private Optional<String> sweepID = Optional.empty();
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder walletID(String walletID) {
            Utils.checkNotNull(walletID, "walletID");
            this.walletID = walletID;
            return this;
        }

        public Builder transactionID(String transactionID) {
            Utils.checkNotNull(transactionID, "transactionID");
            this.transactionID = transactionID;
            return this;
        }

        public Builder transactionType(WalletTransactionType transactionType) {
            Utils.checkNotNull(transactionType, "transactionType");
            this.transactionType = transactionType;
            return this;
        }

        public Builder sourceType(WalletTransactionSourceType sourceType) {
            Utils.checkNotNull(sourceType, "sourceType");
            this.sourceType = sourceType;
            return this;
        }

        /**
         * The ID of the Moov object to which this transaction is related.
         */
        public Builder sourceID(String sourceID) {
            Utils.checkNotNull(sourceID, "sourceID");
            this.sourceID = sourceID;
            return this;
        }

        public Builder status(WalletTransactionStatus status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }

        /**
         * Detailed description of the transaction.
         */
        public Builder memo(String memo) {
            Utils.checkNotNull(memo, "memo");
            this.memo = memo;
            return this;
        }

        public Builder createdOn(OffsetDateTime createdOn) {
            Utils.checkNotNull(createdOn, "createdOn");
            this.createdOn = createdOn;
            return this;
        }

        public Builder completedOn(OffsetDateTime completedOn) {
            Utils.checkNotNull(completedOn, "completedOn");
            this.completedOn = Optional.ofNullable(completedOn);
            return this;
        }

        public Builder completedOn(Optional<OffsetDateTime> completedOn) {
            Utils.checkNotNull(completedOn, "completedOn");
            this.completedOn = completedOn;
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
         * The total transaction amount. The amount is in the smallest unit of the specified currency. In USD this is cents, for example, $12.04 is 1204 and $0.99 is 99.
         */
        public Builder grossAmount(long grossAmount) {
            Utils.checkNotNull(grossAmount, "grossAmount");
            this.grossAmount = grossAmount;
            return this;
        }

        /**
         * The total transaction amount. Same as `grossAmount`, but a decimal-formatted numerical string that represents up to 9 decimal place precision. In USD for example, 12.987654321 is $12.987654321 and 0.9987634521 is $0.9987634521.
         */
        public Builder grossAmountDecimal(String grossAmountDecimal) {
            Utils.checkNotNull(grossAmountDecimal, "grossAmountDecimal");
            this.grossAmountDecimal = grossAmountDecimal;
            return this;
        }

        /**
         * Total fees paid for the transaction. The value is in the smallest unit of the specified currency. In USD this is cents, for example, $12.04 is 1204 and $0.99 is 99.
         */
        public Builder fee(long fee) {
            Utils.checkNotNull(fee, "fee");
            this.fee = fee;
            return this;
        }

        /**
         * The IDs of the fees paid for the transaction.
         */
        public Builder feeIDs(List<String> feeIDs) {
            Utils.checkNotNull(feeIDs, "feeIDs");
            this.feeIDs = Optional.ofNullable(feeIDs);
            return this;
        }

        /**
         * The IDs of the fees paid for the transaction.
         */
        public Builder feeIDs(Optional<? extends List<String>> feeIDs) {
            Utils.checkNotNull(feeIDs, "feeIDs");
            this.feeIDs = feeIDs;
            return this;
        }

        /**
         * Total fees paid for the transaction. Same as `fee`, but a decimal-formatted numerical string that represents up to 9 decimal place precision. In USD for example, 12.987654321 is $12.987654321 and 0.9987634521 is $0.9987634521.
         */
        public Builder feeDecimal(String feeDecimal) {
            Utils.checkNotNull(feeDecimal, "feeDecimal");
            this.feeDecimal = feeDecimal;
            return this;
        }

        /**
         * Net amount is the gross amount less fees paid, and the amount that affects the wallet's balance. The amount is in the smallest unit of the specified currency. In USD this is cents, for example, $12.04 is 1204 and $0.99 is 99.
         */
        public Builder netAmount(long netAmount) {
            Utils.checkNotNull(netAmount, "netAmount");
            this.netAmount = netAmount;
            return this;
        }

        /**
         * Net amount is the gross amount less fees paid, and the amount that affects the wallet's balance. Same as `netAmount`, but a decimal-formatted numerical string that represents up to 9 decimal place precision. In USD for example, 12.987654321 is $12.987654321 and 0.9987634521 is $0.9987634521.
         */
        public Builder netAmountDecimal(String netAmountDecimal) {
            Utils.checkNotNull(netAmountDecimal, "netAmountDecimal");
            this.netAmountDecimal = netAmountDecimal;
            return this;
        }

        /**
         * The wallet's total available balance after recording a completed transaction. The value is in the smallest unit of the specified currency. In USD this is cents, for example, $12.04 is 1204 and $0.99 is 99.
         */
        public Builder availableBalance(long availableBalance) {
            Utils.checkNotNull(availableBalance, "availableBalance");
            this.availableBalance = Optional.ofNullable(availableBalance);
            return this;
        }

        /**
         * The wallet's total available balance after recording a completed transaction. The value is in the smallest unit of the specified currency. In USD this is cents, for example, $12.04 is 1204 and $0.99 is 99.
         */
        public Builder availableBalance(Optional<Long> availableBalance) {
            Utils.checkNotNull(availableBalance, "availableBalance");
            this.availableBalance = availableBalance;
            return this;
        }

        /**
         * The wallet's total available balance after recording a completed transaction. Same as `availableBalance`, but a decimal-formatted numerical string that represents up to 9 decimal place precision. In USD for example, 12.987654321 is $12.987654321 and 0.9987634521 is $0.9987634521.
         */
        public Builder availableBalanceDecimal(String availableBalanceDecimal) {
            Utils.checkNotNull(availableBalanceDecimal, "availableBalanceDecimal");
            this.availableBalanceDecimal = Optional.ofNullable(availableBalanceDecimal);
            return this;
        }

        /**
         * The wallet's total available balance after recording a completed transaction. Same as `availableBalance`, but a decimal-formatted numerical string that represents up to 9 decimal place precision. In USD for example, 12.987654321 is $12.987654321 and 0.9987634521 is $0.9987634521.
         */
        public Builder availableBalanceDecimal(Optional<String> availableBalanceDecimal) {
            Utils.checkNotNull(availableBalanceDecimal, "availableBalanceDecimal");
            this.availableBalanceDecimal = availableBalanceDecimal;
            return this;
        }

        public Builder sweepID(String sweepID) {
            Utils.checkNotNull(sweepID, "sweepID");
            this.sweepID = Optional.ofNullable(sweepID);
            return this;
        }

        public Builder sweepID(Optional<String> sweepID) {
            Utils.checkNotNull(sweepID, "sweepID");
            this.sweepID = sweepID;
            return this;
        }
        
        public WalletTransaction build() {
            return new WalletTransaction(
                walletID,
                transactionID,
                transactionType,
                sourceType,
                sourceID,
                status,
                memo,
                createdOn,
                completedOn,
                currency,
                grossAmount,
                grossAmountDecimal,
                fee,
                feeIDs,
                feeDecimal,
                netAmount,
                netAmountDecimal,
                availableBalance,
                availableBalanceDecimal,
                sweepID);
        }
    }
}
