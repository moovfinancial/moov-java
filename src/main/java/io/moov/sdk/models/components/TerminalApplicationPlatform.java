/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package io.moov.sdk.models.components;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
/**
 * TerminalApplicationPlatform - Platform of the terminal application.
 */
public enum TerminalApplicationPlatform {
    UNDEFINED("undefined"),
    IOS("ios"),
    ANDROID("android");

    @JsonValue
    private final String value;

    private TerminalApplicationPlatform(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<TerminalApplicationPlatform> fromValue(String value) {
        for (TerminalApplicationPlatform o: TerminalApplicationPlatform.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
