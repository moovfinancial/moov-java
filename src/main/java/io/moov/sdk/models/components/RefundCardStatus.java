/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package io.moov.sdk.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public enum RefundCardStatus {
    INITIATED("initiated"),
    CONFIRMED("confirmed"),
    SETTLED("settled"),
    FAILED("failed"),
    COMPLETED("completed");

    @JsonValue
    private final String value;

    private RefundCardStatus(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<RefundCardStatus> fromValue(String value) {
        for (RefundCardStatus o: RefundCardStatus.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

