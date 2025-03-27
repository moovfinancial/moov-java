/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package io.moov.sdk.models.components;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
/**
 * CardBrand
 * 
 * <p>The card brand.
 */
public enum CardBrand {
    AMERICAN_EXPRESS("American Express"),
    DISCOVER("Discover"),
    MASTERCARD("Mastercard"),
    VISA("Visa"),
    UNKNOWN("Unknown");

    @JsonValue
    private final String value;

    private CardBrand(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<CardBrand> fromValue(String value) {
        for (CardBrand o: CardBrand.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
