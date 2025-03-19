/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.moov.sdk.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public enum RefundStatus {
    CREATED("created"),
    PENDING("pending"),
    COMPLETED("completed"),
    FAILED("failed");

    @JsonValue
    private final String value;

    private RefundStatus(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<RefundStatus> fromValue(String value) {
        for (RefundStatus o: RefundStatus.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
