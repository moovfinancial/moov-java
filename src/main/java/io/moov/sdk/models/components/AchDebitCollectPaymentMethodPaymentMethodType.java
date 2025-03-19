/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.moov.sdk.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public enum AchDebitCollectPaymentMethodPaymentMethodType {
    ACH_DEBIT_COLLECT("ach-debit-collect");

    @JsonValue
    private final String value;

    private AchDebitCollectPaymentMethodPaymentMethodType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<AchDebitCollectPaymentMethodPaymentMethodType> fromValue(String value) {
        for (AchDebitCollectPaymentMethodPaymentMethodType o: AchDebitCollectPaymentMethodPaymentMethodType.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
