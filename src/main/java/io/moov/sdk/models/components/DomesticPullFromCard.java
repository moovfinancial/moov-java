/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package io.moov.sdk.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * DomesticPullFromCard
 * 
 * <p>Indicates if the card supports domestic pull-from-card transfer.
 */
public enum DomesticPullFromCard {
    NOT_SUPPORTED("not-supported"),
    SUPPORTED("supported"),
    UNKNOWN("unknown");

    @JsonValue
    private final String value;

    DomesticPullFromCard(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<DomesticPullFromCard> fromValue(String value) {
        for (DomesticPullFromCard o: DomesticPullFromCard.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

