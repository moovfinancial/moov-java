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

public class ListFeePlansRequestBuilder {

    private Optional<String> xMoovVersion = Utils.readDefaultOrConstValue(
                            "xMoovVersion",
                            "\"v2024.01.00\"",
                            new TypeReference<Optional<String>>() {});
    private String accountID;
    private Optional<? extends List<String>> planIDs = Optional.empty();
    private final SDKMethodInterfaces.MethodCallListFeePlans sdk;

    public ListFeePlansRequestBuilder(SDKMethodInterfaces.MethodCallListFeePlans sdk) {
        this.sdk = sdk;
    }
                
    public ListFeePlansRequestBuilder xMoovVersion(String xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = Optional.of(xMoovVersion);
        return this;
    }

    public ListFeePlansRequestBuilder xMoovVersion(Optional<String> xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = xMoovVersion;
        return this;
    }

    public ListFeePlansRequestBuilder accountID(String accountID) {
        Utils.checkNotNull(accountID, "accountID");
        this.accountID = accountID;
        return this;
    }
                
    public ListFeePlansRequestBuilder planIDs(List<String> planIDs) {
        Utils.checkNotNull(planIDs, "planIDs");
        this.planIDs = Optional.of(planIDs);
        return this;
    }

    public ListFeePlansRequestBuilder planIDs(Optional<? extends List<String>> planIDs) {
        Utils.checkNotNull(planIDs, "planIDs");
        this.planIDs = planIDs;
        return this;
    }

    public ListFeePlansResponse call() throws Exception {
        if (xMoovVersion == null) {
            xMoovVersion = _SINGLETON_VALUE_XMoovVersion.value();
        }
        return sdk.listFeePlans(
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
