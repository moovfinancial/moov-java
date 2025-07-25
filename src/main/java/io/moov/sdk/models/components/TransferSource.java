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
import java.util.Optional;


public class TransferSource {
    /**
     * UUID present only if the transfer is part of a transfer group.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("transferID")
    private Optional<String> transferID;


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
     * Describes an Apple Pay token on a Moov account.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("applePay")
    private Optional<? extends ApplePayResponse> applePay;

    /**
     * Describes payment card details captured with tap or in-person payment.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("terminalCard")
    private Optional<? extends TerminalCard> terminalCard;

    /**
     * Card-specific details about the transaction.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("cardDetails")
    private Optional<? extends CardTransactionDetails> cardDetails;

    /**
     * ACH specific details about the transaction.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("achDetails")
    private Optional<? extends ACHTransactionDetails> achDetails;

    @JsonCreator
    public TransferSource(
            @JsonProperty("transferID") Optional<String> transferID,
            @JsonProperty("paymentMethodID") String paymentMethodID,
            @JsonProperty("paymentMethodType") PaymentMethodType paymentMethodType,
            @JsonProperty("account") TransferAccount account,
            @JsonProperty("bankAccount") Optional<? extends PaymentMethodsBankAccount> bankAccount,
            @JsonProperty("wallet") Optional<? extends PaymentMethodsWallet> wallet,
            @JsonProperty("card") Optional<? extends PaymentMethodsCard> card,
            @JsonProperty("applePay") Optional<? extends ApplePayResponse> applePay,
            @JsonProperty("terminalCard") Optional<? extends TerminalCard> terminalCard,
            @JsonProperty("cardDetails") Optional<? extends CardTransactionDetails> cardDetails,
            @JsonProperty("achDetails") Optional<? extends ACHTransactionDetails> achDetails) {
        Utils.checkNotNull(transferID, "transferID");
        Utils.checkNotNull(paymentMethodID, "paymentMethodID");
        Utils.checkNotNull(paymentMethodType, "paymentMethodType");
        Utils.checkNotNull(account, "account");
        Utils.checkNotNull(bankAccount, "bankAccount");
        Utils.checkNotNull(wallet, "wallet");
        Utils.checkNotNull(card, "card");
        Utils.checkNotNull(applePay, "applePay");
        Utils.checkNotNull(terminalCard, "terminalCard");
        Utils.checkNotNull(cardDetails, "cardDetails");
        Utils.checkNotNull(achDetails, "achDetails");
        this.transferID = transferID;
        this.paymentMethodID = paymentMethodID;
        this.paymentMethodType = paymentMethodType;
        this.account = account;
        this.bankAccount = bankAccount;
        this.wallet = wallet;
        this.card = card;
        this.applePay = applePay;
        this.terminalCard = terminalCard;
        this.cardDetails = cardDetails;
        this.achDetails = achDetails;
    }
    
    public TransferSource(
            String paymentMethodID,
            PaymentMethodType paymentMethodType,
            TransferAccount account) {
        this(Optional.empty(), paymentMethodID, paymentMethodType,
            account, Optional.empty(), Optional.empty(),
            Optional.empty(), Optional.empty(), Optional.empty(),
            Optional.empty(), Optional.empty());
    }

    /**
     * UUID present only if the transfer is part of a transfer group.
     */
    @JsonIgnore
    public Optional<String> transferID() {
        return transferID;
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
     * Describes an Apple Pay token on a Moov account.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<ApplePayResponse> applePay() {
        return (Optional<ApplePayResponse>) applePay;
    }

    /**
     * Describes payment card details captured with tap or in-person payment.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<TerminalCard> terminalCard() {
        return (Optional<TerminalCard>) terminalCard;
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
     * ACH specific details about the transaction.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<ACHTransactionDetails> achDetails() {
        return (Optional<ACHTransactionDetails>) achDetails;
    }

    public static Builder builder() {
        return new Builder();
    }


    /**
     * UUID present only if the transfer is part of a transfer group.
     */
    public TransferSource withTransferID(String transferID) {
        Utils.checkNotNull(transferID, "transferID");
        this.transferID = Optional.ofNullable(transferID);
        return this;
    }


    /**
     * UUID present only if the transfer is part of a transfer group.
     */
    public TransferSource withTransferID(Optional<String> transferID) {
        Utils.checkNotNull(transferID, "transferID");
        this.transferID = transferID;
        return this;
    }

    public TransferSource withPaymentMethodID(String paymentMethodID) {
        Utils.checkNotNull(paymentMethodID, "paymentMethodID");
        this.paymentMethodID = paymentMethodID;
        return this;
    }

    /**
     * The payment method type that represents a payment rail and directionality
     */
    public TransferSource withPaymentMethodType(PaymentMethodType paymentMethodType) {
        Utils.checkNotNull(paymentMethodType, "paymentMethodType");
        this.paymentMethodType = paymentMethodType;
        return this;
    }

    public TransferSource withAccount(TransferAccount account) {
        Utils.checkNotNull(account, "account");
        this.account = account;
        return this;
    }

    /**
     * A bank account as contained within a payment method.
     */
    public TransferSource withBankAccount(PaymentMethodsBankAccount bankAccount) {
        Utils.checkNotNull(bankAccount, "bankAccount");
        this.bankAccount = Optional.ofNullable(bankAccount);
        return this;
    }


    /**
     * A bank account as contained within a payment method.
     */
    public TransferSource withBankAccount(Optional<? extends PaymentMethodsBankAccount> bankAccount) {
        Utils.checkNotNull(bankAccount, "bankAccount");
        this.bankAccount = bankAccount;
        return this;
    }

    public TransferSource withWallet(PaymentMethodsWallet wallet) {
        Utils.checkNotNull(wallet, "wallet");
        this.wallet = Optional.ofNullable(wallet);
        return this;
    }


    public TransferSource withWallet(Optional<? extends PaymentMethodsWallet> wallet) {
        Utils.checkNotNull(wallet, "wallet");
        this.wallet = wallet;
        return this;
    }

    /**
     * A card as contained within a payment method.
     */
    public TransferSource withCard(PaymentMethodsCard card) {
        Utils.checkNotNull(card, "card");
        this.card = Optional.ofNullable(card);
        return this;
    }


    /**
     * A card as contained within a payment method.
     */
    public TransferSource withCard(Optional<? extends PaymentMethodsCard> card) {
        Utils.checkNotNull(card, "card");
        this.card = card;
        return this;
    }

    /**
     * Describes an Apple Pay token on a Moov account.
     */
    public TransferSource withApplePay(ApplePayResponse applePay) {
        Utils.checkNotNull(applePay, "applePay");
        this.applePay = Optional.ofNullable(applePay);
        return this;
    }


    /**
     * Describes an Apple Pay token on a Moov account.
     */
    public TransferSource withApplePay(Optional<? extends ApplePayResponse> applePay) {
        Utils.checkNotNull(applePay, "applePay");
        this.applePay = applePay;
        return this;
    }

    /**
     * Describes payment card details captured with tap or in-person payment.
     */
    public TransferSource withTerminalCard(TerminalCard terminalCard) {
        Utils.checkNotNull(terminalCard, "terminalCard");
        this.terminalCard = Optional.ofNullable(terminalCard);
        return this;
    }


    /**
     * Describes payment card details captured with tap or in-person payment.
     */
    public TransferSource withTerminalCard(Optional<? extends TerminalCard> terminalCard) {
        Utils.checkNotNull(terminalCard, "terminalCard");
        this.terminalCard = terminalCard;
        return this;
    }

    /**
     * Card-specific details about the transaction.
     */
    public TransferSource withCardDetails(CardTransactionDetails cardDetails) {
        Utils.checkNotNull(cardDetails, "cardDetails");
        this.cardDetails = Optional.ofNullable(cardDetails);
        return this;
    }


    /**
     * Card-specific details about the transaction.
     */
    public TransferSource withCardDetails(Optional<? extends CardTransactionDetails> cardDetails) {
        Utils.checkNotNull(cardDetails, "cardDetails");
        this.cardDetails = cardDetails;
        return this;
    }

    /**
     * ACH specific details about the transaction.
     */
    public TransferSource withAchDetails(ACHTransactionDetails achDetails) {
        Utils.checkNotNull(achDetails, "achDetails");
        this.achDetails = Optional.ofNullable(achDetails);
        return this;
    }


    /**
     * ACH specific details about the transaction.
     */
    public TransferSource withAchDetails(Optional<? extends ACHTransactionDetails> achDetails) {
        Utils.checkNotNull(achDetails, "achDetails");
        this.achDetails = achDetails;
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
        TransferSource other = (TransferSource) o;
        return 
            Utils.enhancedDeepEquals(this.transferID, other.transferID) &&
            Utils.enhancedDeepEquals(this.paymentMethodID, other.paymentMethodID) &&
            Utils.enhancedDeepEquals(this.paymentMethodType, other.paymentMethodType) &&
            Utils.enhancedDeepEquals(this.account, other.account) &&
            Utils.enhancedDeepEquals(this.bankAccount, other.bankAccount) &&
            Utils.enhancedDeepEquals(this.wallet, other.wallet) &&
            Utils.enhancedDeepEquals(this.card, other.card) &&
            Utils.enhancedDeepEquals(this.applePay, other.applePay) &&
            Utils.enhancedDeepEquals(this.terminalCard, other.terminalCard) &&
            Utils.enhancedDeepEquals(this.cardDetails, other.cardDetails) &&
            Utils.enhancedDeepEquals(this.achDetails, other.achDetails);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            transferID, paymentMethodID, paymentMethodType,
            account, bankAccount, wallet,
            card, applePay, terminalCard,
            cardDetails, achDetails);
    }
    
    @Override
    public String toString() {
        return Utils.toString(TransferSource.class,
                "transferID", transferID,
                "paymentMethodID", paymentMethodID,
                "paymentMethodType", paymentMethodType,
                "account", account,
                "bankAccount", bankAccount,
                "wallet", wallet,
                "card", card,
                "applePay", applePay,
                "terminalCard", terminalCard,
                "cardDetails", cardDetails,
                "achDetails", achDetails);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private Optional<String> transferID = Optional.empty();

        private String paymentMethodID;

        private PaymentMethodType paymentMethodType;

        private TransferAccount account;

        private Optional<? extends PaymentMethodsBankAccount> bankAccount = Optional.empty();

        private Optional<? extends PaymentMethodsWallet> wallet = Optional.empty();

        private Optional<? extends PaymentMethodsCard> card = Optional.empty();

        private Optional<? extends ApplePayResponse> applePay = Optional.empty();

        private Optional<? extends TerminalCard> terminalCard = Optional.empty();

        private Optional<? extends CardTransactionDetails> cardDetails = Optional.empty();

        private Optional<? extends ACHTransactionDetails> achDetails = Optional.empty();

        private Builder() {
          // force use of static builder() method
        }


        /**
         * UUID present only if the transfer is part of a transfer group.
         */
        public Builder transferID(String transferID) {
            Utils.checkNotNull(transferID, "transferID");
            this.transferID = Optional.ofNullable(transferID);
            return this;
        }

        /**
         * UUID present only if the transfer is part of a transfer group.
         */
        public Builder transferID(Optional<String> transferID) {
            Utils.checkNotNull(transferID, "transferID");
            this.transferID = transferID;
            return this;
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
         * Describes payment card details captured with tap or in-person payment.
         */
        public Builder terminalCard(TerminalCard terminalCard) {
            Utils.checkNotNull(terminalCard, "terminalCard");
            this.terminalCard = Optional.ofNullable(terminalCard);
            return this;
        }

        /**
         * Describes payment card details captured with tap or in-person payment.
         */
        public Builder terminalCard(Optional<? extends TerminalCard> terminalCard) {
            Utils.checkNotNull(terminalCard, "terminalCard");
            this.terminalCard = terminalCard;
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

        public TransferSource build() {

            return new TransferSource(
                transferID, paymentMethodID, paymentMethodType,
                account, bankAccount, wallet,
                card, applePay, terminalCard,
                cardDetails, achDetails);
        }

    }
}
