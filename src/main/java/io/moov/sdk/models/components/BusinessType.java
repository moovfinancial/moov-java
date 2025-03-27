/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package io.moov.sdk.models.components;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
/**
 * BusinessType
 * 
 * <p>The type of entity represented by this business.
 */
public enum BusinessType {
    SOLE_PROPRIETORSHIP("soleProprietorship"),
    UNINCORPORATED_ASSOCIATION("unincorporatedAssociation"),
    TRUST("trust"),
    PUBLIC_CORPORATION("publicCorporation"),
    PRIVATE_CORPORATION("privateCorporation"),
    LLC("llc"),
    PARTNERSHIP("partnership"),
    UNINCORPORATED_NON_PROFIT("unincorporatedNonProfit"),
    INCORPORATED_NON_PROFIT("incorporatedNonProfit"),
    GOVERNMENT_ENTITY("governmentEntity");

    @JsonValue
    private final String value;

    private BusinessType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<BusinessType> fromValue(String value) {
        for (BusinessType o: BusinessType.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
