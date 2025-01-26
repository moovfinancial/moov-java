/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.moov.sdk.models.operations;

import io.moov.sdk.models.components.CapabilityID;
import io.moov.sdk.models.components.Versions;
import io.moov.sdk.utils.Utils;
import java.lang.String;
import java.util.Optional;

public class GetCapabilityRequestBuilder {

    private GetCapabilitySecurity security;
    private Optional<? extends Versions> xMoovVersion = Optional.empty();
    private String accountID;
    private CapabilityID capabilityID;
    private final SDKMethodInterfaces.MethodCallGetCapability sdk;

    public GetCapabilityRequestBuilder(SDKMethodInterfaces.MethodCallGetCapability sdk) {
        this.sdk = sdk;
    }

    public GetCapabilityRequestBuilder security(GetCapabilitySecurity security) {
        Utils.checkNotNull(security, "security");
        this.security = security;
        return this;
    }
                
    public GetCapabilityRequestBuilder xMoovVersion(Versions xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = Optional.of(xMoovVersion);
        return this;
    }

    public GetCapabilityRequestBuilder xMoovVersion(Optional<? extends Versions> xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = xMoovVersion;
        return this;
    }

    public GetCapabilityRequestBuilder accountID(String accountID) {
        Utils.checkNotNull(accountID, "accountID");
        this.accountID = accountID;
        return this;
    }

    public GetCapabilityRequestBuilder capabilityID(CapabilityID capabilityID) {
        Utils.checkNotNull(capabilityID, "capabilityID");
        this.capabilityID = capabilityID;
        return this;
    }

    public GetCapabilityResponse call() throws Exception {

        return sdk.get(
            security,
            xMoovVersion,
            accountID,
            capabilityID);
    }
}
