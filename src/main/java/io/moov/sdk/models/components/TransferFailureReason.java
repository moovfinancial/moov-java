/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package io.moov.sdk.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * TransferFailureReason
 * 
 * <p>Reason for a transfer's failure.
 */
public enum TransferFailureReason {
    SOURCE_PAYMENT_ERROR("source-payment-error"),
    DESTINATION_PAYMENT_ERROR("destination-payment-error"),
    WALLET_INSUFFICIENT_FUNDS("wallet-insufficient-funds"),
    REJECTED_HIGH_RISK("rejected-high-risk"),
    PROCESSING_ERROR("processing-error");

    @JsonValue
    private final String value;

    TransferFailureReason(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<TransferFailureReason> fromValue(String value) {
        for (TransferFailureReason o: TransferFailureReason.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

