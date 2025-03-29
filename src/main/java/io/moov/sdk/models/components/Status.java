/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package io.moov.sdk.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public enum Status {
    ENABLED("enabled"),
    DISABLED("disabled");

    @JsonValue
    private final String value;

    private Status(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<Status> fromValue(String value) {
        for (Status o: Status.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

