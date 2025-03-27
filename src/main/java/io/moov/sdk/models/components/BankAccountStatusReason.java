/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package io.moov.sdk.models.components;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
/**
 * BankAccountStatusReason
 * 
 * <p>The reason the bank account status changed to the current value.
 */
public enum BankAccountStatusReason {
    BANK_ACCOUNT_CREATED("bank-account-created"),
    VERIFICATION_INITIATED("verification-initiated"),
    MICRO_DEPOSIT_ATTEMPTS_EXCEEDED("micro-deposit-attempts-exceeded"),
    MICRO_DEPOSIT_EXPIRED("micro-deposit-expired"),
    MAX_VERIFICATION_FAILURES("max-verification-failures"),
    VERIFICATION_ATTEMPTS_EXCEEDED("verification-attempts-exceeded"),
    VERIFICATION_EXPIRED("verification-expired"),
    VERIFICATION_SUCCESSFUL("verification-successful"),
    ACH_DEBIT_RETURN("ach-debit-return"),
    ACH_CREDIT_RETURN("ach-credit-return"),
    RTP_CREDIT_FAILURE("rtp-credit-failure"),
    MICRO_DEPOSIT_RETURN("micro-deposit-return"),
    ADMIN_ACTION("admin-action"),
    OTHER("other");

    @JsonValue
    private final String value;

    private BankAccountStatusReason(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<BankAccountStatusReason> fromValue(String value) {
        for (BankAccountStatusReason o: BankAccountStatusReason.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
