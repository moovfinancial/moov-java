/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.moov.openapi.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public enum FeeCategory {
    CARD_ACQUIRING("card-acquiring"),
    CARD_PUSH("card-push"),
    CARD_PULL("card-pull"),
    ACH("ach"),
    RTP("rtp"),
    CARD_OTHER("card-other"),
    NETWORK_PASSTHROUGH("network-passthrough"),
    OTHER("other");

    @JsonValue
    private final String value;

    private FeeCategory(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<FeeCategory> fromValue(String value) {
        for (FeeCategory o: FeeCategory.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
