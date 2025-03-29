/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package io.moov.sdk.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * FilePurpose
 * 
 * <p>The file's purpose.
 */
public enum FilePurpose {
    BUSINESS_VERIFICATION("business_verification"),
    REPRESENTATIVE_VERIFICATION("representative_verification"),
    INDIVIDUAL_VERIFICATION("individual_verification"),
    MERCHANT_UNDERWRITING("merchant_underwriting"),
    ACCOUNT_REQUIREMENT("account_requirement"),
    IDENTITY_VERIFICATION("identity_verification");

    @JsonValue
    private final String value;

    private FilePurpose(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<FilePurpose> fromValue(String value) {
        for (FilePurpose o: FilePurpose.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

