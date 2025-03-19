/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.moov.sdk.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public enum PushToCardPaymentMethodPaymentMethodType {
    PUSH_TO_CARD("push-to-card");

    @JsonValue
    private final String value;

    private PushToCardPaymentMethodPaymentMethodType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<PushToCardPaymentMethodPaymentMethodType> fromValue(String value) {
        for (PushToCardPaymentMethodPaymentMethodType o: PushToCardPaymentMethodPaymentMethodType.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
