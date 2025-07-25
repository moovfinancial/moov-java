/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package io.moov.sdk.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public enum PendingLitigation {
    BANKRUPTCY_OR_INSOLVENCY("bankruptcy-or-insolvency"),
    CONSUMER_PROTECTION_OR_CLASS_ACTION("consumer-protection-or-class-action"),
    DATA_BREACH_OR_PRIVACY("data-breach-or-privacy"),
    EMPLOYMENT_OR_WORKPLACE_DISPUTES("employment-or-workplace-disputes"),
    FRAUD_OR_FINANCIAL_CRIME("fraud-or-financial-crime"),
    GOVERNMENT_ENFORCEMENT_OR_INVESTIGATION("government-enforcement-or-investigation"),
    INTELLECTUAL_PROPERTY("intellectual-property"),
    NONE("none"),
    OTHER("other"),
    PERSONAL_INJURY_OR_MEDICAL("personal-injury-or-medical");

    @JsonValue
    private final String value;

    PendingLitigation(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<PendingLitigation> fromValue(String value) {
        for (PendingLitigation o: PendingLitigation.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

