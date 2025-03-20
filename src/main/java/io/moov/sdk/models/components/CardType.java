/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package io.moov.sdk.models.components;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
/**
 * CardType - The type of the card.
 */
public enum CardType {
    DEBIT("debit"),
    CREDIT("credit"),
    PREPAID("prepaid"),
    UNKNOWN("unknown");

    @JsonValue
    private final String value;

    private CardType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<CardType> fromValue(String value) {
        for (CardType o: CardType.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
