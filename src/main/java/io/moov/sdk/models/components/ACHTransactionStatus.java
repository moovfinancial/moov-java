/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package io.moov.sdk.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * ACHTransactionStatus
 * 
 * <p>Status of a transaction within the ACH lifecycle.
 */
public enum ACHTransactionStatus {
    UNKNOWN(""),
    INITIATED("initiated"),
    ORIGINATED("originated"),
    CORRECTED("corrected"),
    RETURNED("returned"),
    COMPLETED("completed"),
    CANCELED("canceled");

    @JsonValue
    private final String value;

    private ACHTransactionStatus(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<ACHTransactionStatus> fromValue(String value) {
        for (ACHTransactionStatus o: ACHTransactionStatus.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

