/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package io.moov.sdk.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * OccurrenceStatus
 * 
 * <p>Status of the completed occurrence.
 */
public enum OccurrenceStatus {
    PENDING("pending"),
    FAILED("failed"),
    COMPLETED("completed");

    @JsonValue
    private final String value;

    OccurrenceStatus(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<OccurrenceStatus> fromValue(String value) {
        for (OccurrenceStatus o: OccurrenceStatus.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

