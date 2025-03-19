/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.moov.sdk.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public enum EvidenceType {
    RECEIPT("receipt"),
    PROOF_OF_DELIVERY("proof-of-delivery"),
    CANCELATION_POLICY("cancelation-policy"),
    TERMS_OF_SERVICE("terms-of-service"),
    CUSTOMER_COMMUNICATION("customer-communication"),
    GENERIC_EVIDENCE("generic-evidence"),
    COVER_LETTER("cover-letter"),
    OTHER("other");

    @JsonValue
    private final String value;

    private EvidenceType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<EvidenceType> fromValue(String value) {
        for (EvidenceType o: EvidenceType.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
