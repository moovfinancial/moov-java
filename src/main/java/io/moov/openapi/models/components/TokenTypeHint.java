/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.moov.openapi.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * TokenTypeHint - The type of token being revoked.
 */
public enum TokenTypeHint {
    ACCESS_TOKEN("access_token"),
    REFRESH_TOKEN("refresh_token");

    @JsonValue
    private final String value;

    private TokenTypeHint(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<TokenTypeHint> fromValue(String value) {
        for (TokenTypeHint o: TokenTypeHint.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
