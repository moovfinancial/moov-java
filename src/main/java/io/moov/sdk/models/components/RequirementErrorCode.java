/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.moov.sdk.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public enum RequirementErrorCode {
    INVALID_VALUE("invalid-value"),
    FAILED_AUTOMATIC_VERIFICATION("failed-automatic-verification"),
    FAILED_OTHER("failed-other"),
    INVALID_ADDRESS("invalid-address"),
    ADDRESS_RESTRICTED("address-restricted"),
    TAX_ID_MISMATCH("tax-id-mismatch"),
    DOCUMENT_ID_MISMATCH("document-id-mismatch"),
    DOCUMENT_DATE_OF_BIRTH_MISMATCH("document-date-of-birth-mismatch"),
    DOCUMENT_NAME_MISMATCH("document-name-mismatch"),
    DOCUMENT_ADDRESS_MISMATCH("document-address.mismatch"),
    DOCUMENT_NUMBER_MISMATCH("document-number-mismatch"),
    DOCUMENT_INCOMPLETE("document-incomplete"),
    DOCUMENT_FAILED_RISK("document-failed-risk"),
    DOCUMENT_ILLEGIBLE("document-illegible"),
    DOCUMENT_UNSUPPORTED("document-unsupported"),
    DOCUMENT_NOT_UPLOADED("document-not-uploaded"),
    DOCUMENT_CORRUPT("document-corrupt"),
    DOCUMENT_EXPIRED("document-expired");

    @JsonValue
    private final String value;

    private RequirementErrorCode(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<RequirementErrorCode> fromValue(String value) {
        for (RequirementErrorCode o: RequirementErrorCode.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
