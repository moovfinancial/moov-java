/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package io.moov.sdk.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * IssuedCardFormFactor
 * 
 * <p>Specifies the type of spend card to be issued. Presently supports virtual only, providing a digital number without a physical card.
 */
public enum IssuedCardFormFactor {
    VIRTUAL("virtual");

    @JsonValue
    private final String value;

    private IssuedCardFormFactor(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<IssuedCardFormFactor> fromValue(String value) {
        for (IssuedCardFormFactor o: IssuedCardFormFactor.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

