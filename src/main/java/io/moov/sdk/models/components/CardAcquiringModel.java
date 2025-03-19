/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.moov.sdk.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * CardAcquiringModel - Specifies the card processing pricing model
 */
public enum CardAcquiringModel {
    COST_PLUS("cost-plus"),
    FLAT_RATE("flat-rate");

    @JsonValue
    private final String value;

    private CardAcquiringModel(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<CardAcquiringModel> fromValue(String value) {
        for (CardAcquiringModel o: CardAcquiringModel.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
