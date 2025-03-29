/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package io.moov.sdk.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * Use
 * 
 * <p>The intended use of the key. 'sig' for signature, 'enc' for encryption.
 */
public enum Use {
    SIG("sig"),
    ENC("enc");

    @JsonValue
    private final String value;

    private Use(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<Use> fromValue(String value) {
        for (Use o: Use.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

