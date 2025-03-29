/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package io.moov.sdk.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public enum PullFromCardPaymentMethodPaymentMethodType {
    PULL_FROM_CARD("pull-from-card");

    @JsonValue
    private final String value;

    private PullFromCardPaymentMethodPaymentMethodType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<PullFromCardPaymentMethodPaymentMethodType> fromValue(String value) {
        for (PullFromCardPaymentMethodPaymentMethodType o: PullFromCardPaymentMethodPaymentMethodType.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

