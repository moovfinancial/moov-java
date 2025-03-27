/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package io.moov.sdk.models.components;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
/**
 * GrantType
 * 
 * <p>The type of grant being requested.
 * 
 * <p>  - `client_credentials`: A grant type used by clients to obtain an access token
 *   - `refresh_token`: A grant type used by clients to obtain a new access token using a refresh token
 */
public enum GrantType {
    CLIENT_CREDENTIALS("client_credentials"),
    REFRESH_TOKEN("refresh_token");

    @JsonValue
    private final String value;

    private GrantType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<GrantType> fromValue(String value) {
        for (GrantType o: GrantType.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
