/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package io.moov.sdk.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * ReceiptKind
 * 
 * <p>The type of receipt being requested.
 */
public enum ReceiptKind {
    SALE_CUSTOMER_V1("sale.customer.v1");

    @JsonValue
    private final String value;

    ReceiptKind(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<ReceiptKind> fromValue(String value) {
        for (ReceiptKind o: ReceiptKind.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

