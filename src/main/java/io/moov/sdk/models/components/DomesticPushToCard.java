/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.moov.sdk.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * DomesticPushToCard - Indicates which level of domestic push-to-card transfer is supported by the card, if any.
 */
public enum DomesticPushToCard {
    NOT_SUPPORTED("not-supported"),
    STANDARD("standard"),
    FAST_FUNDS("fast-funds"),
    UNKNOWN("unknown");

    @JsonValue
    private final String value;

    private DomesticPushToCard(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<DomesticPushToCard> fromValue(String value) {
        for (DomesticPushToCard o: DomesticPushToCard.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
