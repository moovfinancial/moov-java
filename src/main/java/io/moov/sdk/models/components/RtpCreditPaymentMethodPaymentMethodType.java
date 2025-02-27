/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package io.moov.sdk.models.components;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
public enum RtpCreditPaymentMethodPaymentMethodType {
    RTP_CREDIT("rtp-credit");

    @JsonValue
    private final String value;

    private RtpCreditPaymentMethodPaymentMethodType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<RtpCreditPaymentMethodPaymentMethodType> fromValue(String value) {
        for (RtpCreditPaymentMethodPaymentMethodType o: RtpCreditPaymentMethodPaymentMethodType.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
