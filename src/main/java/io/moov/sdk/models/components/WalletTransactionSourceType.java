/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package io.moov.sdk.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public enum WalletTransactionSourceType {
    TRANSFER("transfer"),
    DISPUTE("dispute"),
    ISSUING_CARD_TRANSACTION("issuing-card-transaction"),
    ISSUING_AUTHORIZATION("issuing-authorization"),
    SWEEP("sweep"),
    ADJUSTMENT("adjustment"),
    FEE("fee");

    @JsonValue
    private final String value;

    private WalletTransactionSourceType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<WalletTransactionSourceType> fromValue(String value) {
        for (WalletTransactionSourceType o: WalletTransactionSourceType.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

