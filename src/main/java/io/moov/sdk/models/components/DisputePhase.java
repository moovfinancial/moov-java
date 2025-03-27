/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package io.moov.sdk.models.components;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
/**
 * DisputePhase
 * 
 * <p>The phase of a dispute within the dispute lifecycle.
 */
public enum DisputePhase {
    PRE_DISPUTE("pre-dispute"),
    INQUIRY("inquiry"),
    CHARGEBACK("chargeback"),
    UNKNOWN("unknown");

    @JsonValue
    private final String value;

    private DisputePhase(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<DisputePhase> fromValue(String value) {
        for (DisputePhase o: DisputePhase.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
