/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package io.moov.sdk.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public enum GeographicReach {
    INTERNATIONAL_ONLY("international-only"),
    US_AND_INTERNATIONAL("us-and-international"),
    US_ONLY("us-only");

    @JsonValue
    private final String value;

    GeographicReach(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<GeographicReach> fromValue(String value) {
        for (GeographicReach o: GeographicReach.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

