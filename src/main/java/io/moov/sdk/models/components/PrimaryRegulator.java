/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package io.moov.sdk.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * PrimaryRegulator
 * 
 * <p>If the business is a financial institution, this field describes its primary regulator.
 */
public enum PrimaryRegulator {
    OCC("OCC"),
    FDIC("FDIC"),
    NCUA("NCUA"),
    FRB("FRB");

    @JsonValue
    private final String value;

    PrimaryRegulator(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<PrimaryRegulator> fromValue(String value) {
        for (PrimaryRegulator o: PrimaryRegulator.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

