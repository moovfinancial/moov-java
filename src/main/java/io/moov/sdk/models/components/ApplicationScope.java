/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package io.moov.sdk.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * ApplicationScope
 * 
 * <p>A permission that the application requests on another account.
 */
public enum ApplicationScope {
    ACCOUNTS_READ("accounts.read"),
    ACCOUNTS_WRITE("accounts.write"),
    ANALYTICS_READ("analytics.read"),
    APPLE_PAY_MERCHANT_READ("apple-pay-merchant.read"),
    APPLE_PAY_MERCHANT_WRITE("apple-pay-merchant.write"),
    APPLE_PAY_READ("apple-pay.read"),
    APPLE_PAY_WRITE("apple-pay.write"),
    BANK_ACCOUNTS_READ("bank-accounts.read"),
    BANK_ACCOUNTS_WRITE("bank-accounts.write"),
    CAPABILITIES_READ("capabilities.read"),
    CAPABILITIES_WRITE("capabilities.write"),
    CARDS_READ("cards.read"),
    CARDS_WRITE("cards.write"),
    DOCUMENTS_READ("documents.read"),
    DOCUMENTS_WRITE("documents.write"),
    FED_READ("fed.read"),
    FILES_READ("files.read"),
    FILES_WRITE("files.write"),
    ISSUED_CARDS_READ("issued-cards.read"),
    ISSUED_CARDS_WRITE("issued-cards.write"),
    ISSUED_CARDS_READ_SECURE("issued-cards.read-secure"),
    PAYMENT_METHODS_READ("payment-methods.read"),
    PING_READ("ping.read"),
    PROFILE_ENRICHMENT_READ("profile-enrichment.read"),
    PROFILE_READ("profile.read"),
    PROFILE_WRITE("profile.write"),
    PROFILE_DISCONNECT("profile.disconnect"),
    REPRESENTATIVES_READ("representatives.read"),
    REPRESENTATIVES_WRITE("representatives.write"),
    TRANSFERS_READ("transfers.read"),
    TRANSFERS_WRITE("transfers.write"),
    WALLETS_READ("wallets.read");

    @JsonValue
    private final String value;

    ApplicationScope(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<ApplicationScope> fromValue(String value) {
        for (ApplicationScope o: ApplicationScope.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

