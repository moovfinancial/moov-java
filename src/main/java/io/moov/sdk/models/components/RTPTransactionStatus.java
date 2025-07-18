/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package io.moov.sdk.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * RTPTransactionStatus
 * 
 * <p>Status of a transaction within the RTP lifecycle.
 */
public enum RTPTransactionStatus {
    INITIATED("initiated"),
    COMPLETED("completed"),
    FAILED("failed"),
    ACCEPTED_WITHOUT_POSTING("accepted-without-posting");

    @JsonValue
    private final String value;

    RTPTransactionStatus(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<RTPTransactionStatus> fromValue(String value) {
        for (RTPTransactionStatus o: RTPTransactionStatus.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

