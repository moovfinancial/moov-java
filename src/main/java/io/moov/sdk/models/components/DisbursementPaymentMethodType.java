/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package io.moov.sdk.models.components;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
/**
 * DisbursementPaymentMethodType - Payment methods allowed for disbursing funds.
 */
public enum DisbursementPaymentMethodType {
    PUSH_TO_CARD("push-to-card"),
    RTP_CREDIT("rtp-credit"),
    ACH_CREDIT_SAME_DAY("ach-credit-same-day"),
    ACH_CREDIT_STANDARD("ach-credit-standard");

    @JsonValue
    private final String value;

    private DisbursementPaymentMethodType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<DisbursementPaymentMethodType> fromValue(String value) {
        for (DisbursementPaymentMethodType o: DisbursementPaymentMethodType.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
