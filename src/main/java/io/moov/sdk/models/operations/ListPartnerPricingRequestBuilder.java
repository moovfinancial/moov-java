/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.moov.sdk.models.operations;

import com.fasterxml.jackson.core.type.TypeReference;
import io.moov.sdk.utils.LazySingletonValue;
import io.moov.sdk.utils.Utils;
import java.lang.Exception;
import java.lang.String;
import java.util.List;
import java.util.Optional;

public class ListPartnerPricingRequestBuilder {

    private Optional<String> xMoovVersion = Utils.readDefaultOrConstValue(
                            "xMoovVersion",
                            "\"v2024.01.00\"",
                            new TypeReference<Optional<String>>() {});
    private String accountID;
    private Optional<? extends List<String>> planIDs = Optional.empty();
    private final SDKMethodInterfaces.MethodCallListPartnerPricing sdk;

    public ListPartnerPricingRequestBuilder(SDKMethodInterfaces.MethodCallListPartnerPricing sdk) {
        this.sdk = sdk;
    }
                
    public ListPartnerPricingRequestBuilder xMoovVersion(String xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = Optional.of(xMoovVersion);
        return this;
    }

    public ListPartnerPricingRequestBuilder xMoovVersion(Optional<String> xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = xMoovVersion;
        return this;
    }

    public ListPartnerPricingRequestBuilder accountID(String accountID) {
        Utils.checkNotNull(accountID, "accountID");
        this.accountID = accountID;
        return this;
    }
                
    public ListPartnerPricingRequestBuilder planIDs(List<String> planIDs) {
        Utils.checkNotNull(planIDs, "planIDs");
        this.planIDs = Optional.of(planIDs);
        return this;
    }

    public ListPartnerPricingRequestBuilder planIDs(Optional<? extends List<String>> planIDs) {
        Utils.checkNotNull(planIDs, "planIDs");
        this.planIDs = planIDs;
        return this;
    }

    public ListPartnerPricingResponse call() throws Exception {
        if (xMoovVersion == null) {
            xMoovVersion = _SINGLETON_VALUE_XMoovVersion.value();
        }
        return sdk.listPartnerPricing(
            xMoovVersion,
            accountID,
            planIDs);
    }

    private static final LazySingletonValue<Optional<String>> _SINGLETON_VALUE_XMoovVersion =
            new LazySingletonValue<>(
                    "xMoovVersion",
                    "\"v2024.01.00\"",
                    new TypeReference<Optional<String>>() {});
}
