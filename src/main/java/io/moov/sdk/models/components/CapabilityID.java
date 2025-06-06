/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package io.moov.sdk.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * CapabilityID
 * 
 * <p>Moov account capabilities.
 * 
 * <p>The `production-app` capability might appear in your list. This is a read-only capability that Moov requests and uses for account verification purposes. The capability remains active with your account and requires no additional action.
 */
public enum CapabilityID {
    TRANSFERS("transfers"),
    SEND_FUNDS("send-funds"),
    COLLECT_FUNDS("collect-funds"),
    WALLET("wallet"),
    CARD_ISSUING("card-issuing"),
    PRODUCTION_APP("production-app");

    @JsonValue
    private final String value;

    private CapabilityID(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<CapabilityID> fromValue(String value) {
        for (CapabilityID o: CapabilityID.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

