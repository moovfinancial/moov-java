/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.moov.sdk.models.operations;

import com.fasterxml.jackson.core.type.TypeReference;
import io.moov.sdk.models.components.CreateFeePlanAgreement;
import io.moov.sdk.utils.LazySingletonValue;
import io.moov.sdk.utils.Utils;
import java.lang.Exception;
import java.lang.String;
import java.util.Optional;

public class CreateFeePlanAgreementsRequestBuilder {

    private Optional<String> xMoovVersion = Utils.readDefaultOrConstValue(
                            "xMoovVersion",
                            "\"v2024.01.00\"",
                            new TypeReference<Optional<String>>() {});
    private String accountID;
    private CreateFeePlanAgreement createFeePlanAgreement;
    private final SDKMethodInterfaces.MethodCallCreateFeePlanAgreements sdk;

    public CreateFeePlanAgreementsRequestBuilder(SDKMethodInterfaces.MethodCallCreateFeePlanAgreements sdk) {
        this.sdk = sdk;
    }
                
    public CreateFeePlanAgreementsRequestBuilder xMoovVersion(String xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = Optional.of(xMoovVersion);
        return this;
    }

    public CreateFeePlanAgreementsRequestBuilder xMoovVersion(Optional<String> xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = xMoovVersion;
        return this;
    }

    public CreateFeePlanAgreementsRequestBuilder accountID(String accountID) {
        Utils.checkNotNull(accountID, "accountID");
        this.accountID = accountID;
        return this;
    }

    public CreateFeePlanAgreementsRequestBuilder createFeePlanAgreement(CreateFeePlanAgreement createFeePlanAgreement) {
        Utils.checkNotNull(createFeePlanAgreement, "createFeePlanAgreement");
        this.createFeePlanAgreement = createFeePlanAgreement;
        return this;
    }

    public CreateFeePlanAgreementsResponse call() throws Exception {
        if (xMoovVersion == null) {
            xMoovVersion = _SINGLETON_VALUE_XMoovVersion.value();
        }
        return sdk.createFeePlanAgreements(
            xMoovVersion,
            accountID,
            createFeePlanAgreement);
    }

    private static final LazySingletonValue<Optional<String>> _SINGLETON_VALUE_XMoovVersion =
            new LazySingletonValue<>(
                    "xMoovVersion",
                    "\"v2024.01.00\"",
                    new TypeReference<Optional<String>>() {});
}
