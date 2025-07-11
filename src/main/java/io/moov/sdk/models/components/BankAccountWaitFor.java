/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package io.moov.sdk.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public enum BankAccountWaitFor {
    PAYMENT_METHOD("payment-method"),
    RAIL_RESPONSE("rail-response");

    @JsonValue
    private final String value;

    BankAccountWaitFor(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<BankAccountWaitFor> fromValue(String value) {
        for (BankAccountWaitFor o: BankAccountWaitFor.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

