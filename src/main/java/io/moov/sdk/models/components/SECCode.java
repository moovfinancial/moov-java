/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package io.moov.sdk.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * SECCode
 * 
 * <p>Code used to identify the ACH authorization method.
 */
public enum SECCode {
    WEB("WEB"),
    PPD("PPD"),
    CCD("CCD"),
    TEL("TEL");

    @JsonValue
    private final String value;

    SECCode(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<SECCode> fromValue(String value) {
        for (SECCode o: SECCode.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

