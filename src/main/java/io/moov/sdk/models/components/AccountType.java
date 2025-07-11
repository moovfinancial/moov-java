/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package io.moov.sdk.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * AccountType
 * 
 * <p>The type of entity represented by this account.
 */
public enum AccountType {
    INDIVIDUAL("individual"),
    BUSINESS("business"),
    GUEST("guest");

    @JsonValue
    private final String value;

    AccountType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<AccountType> fromValue(String value) {
        for (AccountType o: AccountType.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

