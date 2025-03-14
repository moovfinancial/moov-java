/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package io.moov.sdk.models.components;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
/**
 * EntryMode - How the card information was entered into the point of sale terminal.
 */
public enum EntryMode {
    CONTACTLESS("contactless");

    @JsonValue
    private final String value;

    private EntryMode(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<EntryMode> fromValue(String value) {
        for (EntryMode o: EntryMode.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
