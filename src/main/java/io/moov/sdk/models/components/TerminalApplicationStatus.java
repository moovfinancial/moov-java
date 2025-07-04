/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package io.moov.sdk.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * TerminalApplicationStatus
 * 
 * <p>Status of the terminal application.
 */
public enum TerminalApplicationStatus {
    UNDEFINED("undefined"),
    PENDING("pending"),
    ENABLED("enabled"),
    DISABLED("disabled");

    @JsonValue
    private final String value;

    TerminalApplicationStatus(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<TerminalApplicationStatus> fromValue(String value) {
        for (TerminalApplicationStatus o: TerminalApplicationStatus.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

