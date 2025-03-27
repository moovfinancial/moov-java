/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package io.moov.sdk.models.components;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
/**
 * TransactionSource
 * 
 * <p>Specifies the nature and initiator of a transaction. 
 * 
 * <p>Crucial for recurring and merchant-initiated transactions as per card scheme rules. 
 * Omit for customer-initiated e-commerce transactions.
 */
public enum TransactionSource {
    FIRST_RECURRING("first-recurring"),
    RECURRING("recurring"),
    UNSCHEDULED("unscheduled");

    @JsonValue
    private final String value;

    private TransactionSource(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<TransactionSource> fromValue(String value) {
        for (TransactionSource o: TransactionSource.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
