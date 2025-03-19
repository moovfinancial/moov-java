/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.moov.sdk.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * IssuingIntervalLimit - Specifies the time frame for the velocity limit. Currently supports only per-transaction limits.
 */
public enum IssuingIntervalLimit {
    PER_TRANSACTION("per-transaction");

    @JsonValue
    private final String value;

    private IssuingIntervalLimit(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<IssuingIntervalLimit> fromValue(String value) {
        for (IssuingIntervalLimit o: IssuingIntervalLimit.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
