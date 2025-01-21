/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.moov.openapi.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * CardAcquringModel - Specifies the card processing pricing model
 */
public enum CardAcquringModel {
    COST_PLUS("cost-plus"),
    FLAT_RATE("flat-rate");

    @JsonValue
    private final String value;

    private CardAcquringModel(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<CardAcquringModel> fromValue(String value) {
        for (CardAcquringModel o: CardAcquringModel.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
