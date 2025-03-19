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


public class TransferDestination {

    @JsonProperty("paymentMethodID")
    private String paymentMethodID;

    /**
     * The payment method type that represents a payment rail and directionality
     */
    @JsonProperty("paymentMethodType")
    private PaymentMethodType paymentMethodType;

    @JsonProperty("account")
    private TransferAccount account;

    /**
     * A bank account as contained within a payment method.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("bankAccount")
    private Optional<? extends PaymentMethodsBankAccount> bankAccount;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("wallet")
    private Optional<? extends PaymentMethodsWallet> wallet;

    /**
     * A card as contained within a payment method.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("card")
    private Optional<? extends PaymentMethodsCard> card;

    /**
     * ACH specific details about the transaction.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("achDetails")
    private Optional<? extends ACHTransactionDetails> achDetails;

    /**
     * Describes an Apple Pay token on a Moov account.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("applePay")
    private Optional<? extends ApplePayResponse> applePay;

    /**
     * Card-specific details about the transaction.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("cardDetails")
    private Optional<? extends CardTransactionDetails> cardDetails;

    /**
     * RTP specific details about the transaction.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("rtpDetails")
    private Optional<? extends RTPTransactionDetails> rtpDetails;

    @JsonCreator
    public TransferDestination(
            @JsonProperty("paymentMethodID") String paymentMethodID,
            @JsonProperty("paymentMethodType") PaymentMethodType paymentMethodType,
            @JsonProperty("account") TransferAccount account,
            @JsonProperty("bankAccount") Optional<? extends PaymentMethodsBankAccount> bankAccount,
            @JsonProperty("wallet") Optional<? extends PaymentMethodsWallet> wallet,
            @JsonProperty("card") Optional<? extends PaymentMethodsCard> card,
            @JsonProperty("achDetails") Optional<? extends ACHTransactionDetails> achDetails,
            @JsonProperty("applePay") Optional<? extends ApplePayResponse> applePay,
            @JsonProperty("cardDetails") Optional<? extends CardTransactionDetails> cardDetails,
            @JsonProperty("rtpDetails") Optional<? extends RTPTransactionDetails> rtpDetails) {
        Utils.checkNotNull(paymentMethodID, "paymentMethodID");
        Utils.checkNotNull(paymentMethodType, "paymentMethodType");
        Utils.checkNotNull(account, "account");
        Utils.checkNotNull(bankAccount, "bankAccount");
        Utils.checkNotNull(wallet, "wallet");
        Utils.checkNotNull(card, "card");
        Utils.checkNotNull(achDetails, "achDetails");
        Utils.checkNotNull(applePay, "applePay");
        Utils.checkNotNull(cardDetails, "cardDetails");
        Utils.checkNotNull(rtpDetails, "rtpDetails");
        this.paymentMethodID = paymentMethodID;
        this.paymentMethodType = paymentMethodType;
        this.account = account;
        this.bankAccount = bankAccount;
        this.wallet = wallet;
        this.card = card;
        this.achDetails = achDetails;
        this.applePay = applePay;
        this.cardDetails = cardDetails;
        this.rtpDetails = rtpDetails;
    }
    
    public TransferDestination(
            String paymentMethodID,
            PaymentMethodType paymentMethodType,
            TransferAccount account) {
        this(paymentMethodID, paymentMethodType, account, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public String paymentMethodID() {
        return paymentMethodID;
    }

    /**
     * The payment method type that represents a payment rail and directionality
     */
    @JsonIgnore
    public PaymentMethodType paymentMethodType() {
        return paymentMethodType;
    }

    @JsonIgnore
    public TransferAccount account() {
        return account;
    }

    /**
     * A bank account as contained within a payment method.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<PaymentMethodsBankAccount> bankAccount() {
        return (Optional<PaymentMethodsBankAccount>) bankAccount;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<PaymentMethodsWallet> wallet() {
        return (Optional<PaymentMethodsWallet>) wallet;
    }

    /**
     * A card as contained within a payment method.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<PaymentMethodsCard> card() {
        return (Optional<PaymentMethodsCard>) card;
    }

    /**
     * ACH specific details about the transaction.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<ACHTransactionDetails> achDetails() {
        return (Optional<ACHTransactionDetails>) achDetails;
    }

    /**
     * Describes an Apple Pay token on a Moov account.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<ApplePayResponse> applePay() {
        return (Optional<ApplePayResponse>) applePay;
    }

    /**
     * Card-specific details about the transaction.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<CardTransactionDetails> cardDetails() {
        return (Optional<CardTransactionDetails>) cardDetails;
    }

    /**
     * RTP specific details about the transaction.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<RTPTransactionDetails> rtpDetails() {
        return (Optional<RTPTransactionDetails>) rtpDetails;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public TransferDestination withPaymentMethodID(String paymentMethodID) {
        Utils.checkNotNull(paymentMethodID, "paymentMethodID");
        this.paymentMethodID = paymentMethodID;
        return this;
    }

    /**
     * The payment method type that represents a payment rail and directionality
     */
    public TransferDestination withPaymentMethodType(PaymentMethodType paymentMethodType) {
        Utils.checkNotNull(paymentMethodType, "paymentMethodType");
        this.paymentMethodType = paymentMethodType;
        return this;
    }

    public TransferDestination withAccount(TransferAccount account) {
        Utils.checkNotNull(account, "account");
        this.account = account;
        return this;
    }

    /**
     * A bank account as contained within a payment method.
     */
    public TransferDestination withBankAccount(PaymentMethodsBankAccount bankAccount) {
        Utils.checkNotNull(bankAccount, "bankAccount");
        this.bankAccount = Optional.ofNullable(bankAccount);
        return this;
    }

    /**
     * A bank account as contained within a payment method.
     */
    public TransferDestination withBankAccount(Optional<? extends PaymentMethodsBankAccount> bankAccount) {
        Utils.checkNotNull(bankAccount, "bankAccount");
        this.bankAccount = bankAccount;
        return this;
    }

    public TransferDestination withWallet(PaymentMethodsWallet wallet) {
        Utils.checkNotNull(wallet, "wallet");
        this.wallet = Optional.ofNullable(wallet);
        return this;
    }

    public TransferDestination withWallet(Optional<? extends PaymentMethodsWallet> wallet) {
        Utils.checkNotNull(wallet, "wallet");
        this.wallet = wallet;
        return this;
    }

    /**
     * A card as contained within a payment method.
     */
    public TransferDestination withCard(PaymentMethodsCard card) {
        Utils.checkNotNull(card, "card");
        this.card = Optional.ofNullable(card);
        return this;
    }

    /**
     * A card as contained within a payment method.
     */
    public TransferDestination withCard(Optional<? extends PaymentMethodsCard> card) {
        Utils.checkNotNull(card, "card");
        this.card = card;
        return this;
    }

    /**
     * ACH specific details about the transaction.
     */
    public TransferDestination withAchDetails(ACHTransactionDetails achDetails) {
        Utils.checkNotNull(achDetails, "achDetails");
        this.achDetails = Optional.ofNullable(achDetails);
        return this;
    }

    /**
     * ACH specific details about the transaction.
     */
    public TransferDestination withAchDetails(Optional<? extends ACHTransactionDetails> achDetails) {
        Utils.checkNotNull(achDetails, "achDetails");
        this.achDetails = achDetails;
        return this;
    }

    /**
     * Describes an Apple Pay token on a Moov account.
     */
    public TransferDestination withApplePay(ApplePayResponse applePay) {
        Utils.checkNotNull(applePay, "applePay");
        this.applePay = Optional.ofNullable(applePay);
        return this;
    }

    /**
     * Describes an Apple Pay token on a Moov account.
     */
    public TransferDestination withApplePay(Optional<? extends ApplePayResponse> applePay) {
        Utils.checkNotNull(applePay, "applePay");
        this.applePay = applePay;
        return this;
    }

    /**
     * Card-specific details about the transaction.
     */
    public TransferDestination withCardDetails(CardTransactionDetails cardDetails) {
        Utils.checkNotNull(cardDetails, "cardDetails");
        this.cardDetails = Optional.ofNullable(cardDetails);
        return this;
    }

    /**
     * Card-specific details about the transaction.
     */
    public TransferDestination withCardDetails(Optional<? extends CardTransactionDetails> cardDetails) {
        Utils.checkNotNull(cardDetails, "cardDetails");
        this.cardDetails = cardDetails;
        return this;
    }

    /**
     * RTP specific details about the transaction.
     */
    public TransferDestination withRtpDetails(RTPTransactionDetails rtpDetails) {
        Utils.checkNotNull(rtpDetails, "rtpDetails");
        this.rtpDetails = Optional.ofNullable(rtpDetails);
        return this;
    }

    /**
     * RTP specific details about the transaction.
     */
    public TransferDestination withRtpDetails(Optional<? extends RTPTransactionDetails> rtpDetails) {
        Utils.checkNotNull(rtpDetails, "rtpDetails");
        this.rtpDetails = rtpDetails;
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
        TransferDestination other = (TransferDestination) o;
        return 
            Objects.deepEquals(this.paymentMethodID, other.paymentMethodID) &&
            Objects.deepEquals(this.paymentMethodType, other.paymentMethodType) &&
            Objects.deepEquals(this.account, other.account) &&
            Objects.deepEquals(this.bankAccount, other.bankAccount) &&
            Objects.deepEquals(this.wallet, other.wallet) &&
            Objects.deepEquals(this.card, other.card) &&
            Objects.deepEquals(this.achDetails, other.achDetails) &&
            Objects.deepEquals(this.applePay, other.applePay) &&
            Objects.deepEquals(this.cardDetails, other.cardDetails) &&
            Objects.deepEquals(this.rtpDetails, other.rtpDetails);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            paymentMethodID,
            paymentMethodType,
            account,
            bankAccount,
            wallet,
            card,
            achDetails,
            applePay,
            cardDetails,
            rtpDetails);
    }
    
    @Override
    public String toString() {
        return Utils.toString(TransferDestination.class,
                "paymentMethodID", paymentMethodID,
                "paymentMethodType", paymentMethodType,
                "account", account,
                "bankAccount", bankAccount,
                "wallet", wallet,
                "card", card,
                "achDetails", achDetails,
                "applePay", applePay,
                "cardDetails", cardDetails,
                "rtpDetails", rtpDetails);
    }
    
    public final static class Builder {
 
        private String paymentMethodID;
 
        private PaymentMethodType paymentMethodType;
 
        private TransferAccount account;
 
        private Optional<? extends PaymentMethodsBankAccount> bankAccount = Optional.empty();
 
        private Optional<? extends PaymentMethodsWallet> wallet = Optional.empty();
 
        private Optional<? extends PaymentMethodsCard> card = Optional.empty();
 
        private Optional<? extends ACHTransactionDetails> achDetails = Optional.empty();
 
        private Optional<? extends ApplePayResponse> applePay = Optional.empty();
 
        private Optional<? extends CardTransactionDetails> cardDetails = Optional.empty();
 
        private Optional<? extends RTPTransactionDetails> rtpDetails = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder paymentMethodID(String paymentMethodID) {
            Utils.checkNotNull(paymentMethodID, "paymentMethodID");
            this.paymentMethodID = paymentMethodID;
            return this;
        }

        /**
         * The payment method type that represents a payment rail and directionality
         */
        public Builder paymentMethodType(PaymentMethodType paymentMethodType) {
            Utils.checkNotNull(paymentMethodType, "paymentMethodType");
            this.paymentMethodType = paymentMethodType;
            return this;
        }

        public Builder account(TransferAccount account) {
            Utils.checkNotNull(account, "account");
            this.account = account;
            return this;
        }

        /**
         * A bank account as contained within a payment method.
         */
        public Builder bankAccount(PaymentMethodsBankAccount bankAccount) {
            Utils.checkNotNull(bankAccount, "bankAccount");
            this.bankAccount = Optional.ofNullable(bankAccount);
            return this;
        }

        /**
         * A bank account as contained within a payment method.
         */
        public Builder bankAccount(Optional<? extends PaymentMethodsBankAccount> bankAccount) {
            Utils.checkNotNull(bankAccount, "bankAccount");
            this.bankAccount = bankAccount;
            return this;
        }

        public Builder wallet(PaymentMethodsWallet wallet) {
            Utils.checkNotNull(wallet, "wallet");
            this.wallet = Optional.ofNullable(wallet);
            return this;
        }

        public Builder wallet(Optional<? extends PaymentMethodsWallet> wallet) {
            Utils.checkNotNull(wallet, "wallet");
            this.wallet = wallet;
            return this;
        }

        /**
         * A card as contained within a payment method.
         */
        public Builder card(PaymentMethodsCard card) {
            Utils.checkNotNull(card, "card");
            this.card = Optional.ofNullable(card);
            return this;
        }

        /**
         * A card as contained within a payment method.
         */
        public Builder card(Optional<? extends PaymentMethodsCard> card) {
            Utils.checkNotNull(card, "card");
            this.card = card;
            return this;
        }

        /**
         * ACH specific details about the transaction.
         */
        public Builder achDetails(ACHTransactionDetails achDetails) {
            Utils.checkNotNull(achDetails, "achDetails");
            this.achDetails = Optional.ofNullable(achDetails);
            return this;
        }

        /**
         * ACH specific details about the transaction.
         */
        public Builder achDetails(Optional<? extends ACHTransactionDetails> achDetails) {
            Utils.checkNotNull(achDetails, "achDetails");
            this.achDetails = achDetails;
            return this;
        }

        /**
         * Describes an Apple Pay token on a Moov account.
         */
        public Builder applePay(ApplePayResponse applePay) {
            Utils.checkNotNull(applePay, "applePay");
            this.applePay = Optional.ofNullable(applePay);
            return this;
        }

        /**
         * Describes an Apple Pay token on a Moov account.
         */
        public Builder applePay(Optional<? extends ApplePayResponse> applePay) {
            Utils.checkNotNull(applePay, "applePay");
            this.applePay = applePay;
            return this;
        }

        /**
         * Card-specific details about the transaction.
         */
        public Builder cardDetails(CardTransactionDetails cardDetails) {
            Utils.checkNotNull(cardDetails, "cardDetails");
            this.cardDetails = Optional.ofNullable(cardDetails);
            return this;
        }

        /**
         * Card-specific details about the transaction.
         */
        public Builder cardDetails(Optional<? extends CardTransactionDetails> cardDetails) {
            Utils.checkNotNull(cardDetails, "cardDetails");
            this.cardDetails = cardDetails;
            return this;
        }

        /**
         * RTP specific details about the transaction.
         */
        public Builder rtpDetails(RTPTransactionDetails rtpDetails) {
            Utils.checkNotNull(rtpDetails, "rtpDetails");
            this.rtpDetails = Optional.ofNullable(rtpDetails);
            return this;
        }

        /**
         * RTP specific details about the transaction.
         */
        public Builder rtpDetails(Optional<? extends RTPTransactionDetails> rtpDetails) {
            Utils.checkNotNull(rtpDetails, "rtpDetails");
            this.rtpDetails = rtpDetails;
            return this;
        }
        
        public TransferDestination build() {
            return new TransferDestination(
                paymentMethodID,
                paymentMethodType,
                account,
                bankAccount,
                wallet,
                card,
                achDetails,
                applePay,
                cardDetails,
                rtpDetails);
        }
    }
}

