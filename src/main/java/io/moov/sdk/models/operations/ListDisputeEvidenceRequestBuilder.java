/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.moov.sdk.models.operations;

import io.moov.sdk.models.components.Versions;
import io.moov.sdk.utils.Utils;
import java.lang.String;
import java.util.Optional;

public class ListDisputeEvidenceRequestBuilder {

    private ListDisputeEvidenceSecurity security;
    private Optional<? extends Versions> xMoovVersion = Optional.empty();
    private String accountID;
    private String disputeID;
    private final SDKMethodInterfaces.MethodCallListDisputeEvidence sdk;

    public ListDisputeEvidenceRequestBuilder(SDKMethodInterfaces.MethodCallListDisputeEvidence sdk) {
        this.sdk = sdk;
    }

    public ListDisputeEvidenceRequestBuilder security(ListDisputeEvidenceSecurity security) {
        Utils.checkNotNull(security, "security");
        this.security = security;
        return this;
    }
                
    public ListDisputeEvidenceRequestBuilder xMoovVersion(Versions xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = Optional.of(xMoovVersion);
        return this;
    }

    public ListDisputeEvidenceRequestBuilder xMoovVersion(Optional<? extends Versions> xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = xMoovVersion;
        return this;
    }

    public ListDisputeEvidenceRequestBuilder accountID(String accountID) {
        Utils.checkNotNull(accountID, "accountID");
        this.accountID = accountID;
        return this;
    }

    public ListDisputeEvidenceRequestBuilder disputeID(String disputeID) {
        Utils.checkNotNull(disputeID, "disputeID");
        this.disputeID = disputeID;
        return this;
    }

    public ListDisputeEvidenceResponse call() throws Exception {

        return sdk.listEvidence(
            security,
            xMoovVersion,
            accountID,
            disputeID);
    }
}
