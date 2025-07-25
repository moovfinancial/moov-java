/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package io.moov.sdk.models.operations;

import static io.moov.sdk.operations.Operations.RequestOperation;

import io.moov.sdk.SDKConfiguration;
import io.moov.sdk.models.components.CreateEvidenceFileMultiPart;
import io.moov.sdk.operations.UploadDisputeEvidenceFileOperation;
import io.moov.sdk.utils.Utils;
import java.lang.Exception;
import java.lang.String;

public class UploadDisputeEvidenceFileRequestBuilder {

    private String accountID;
    private String disputeID;
    private CreateEvidenceFileMultiPart createEvidenceFileMultiPart;
    private final SDKConfiguration sdkConfiguration;

    public UploadDisputeEvidenceFileRequestBuilder(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }

    public UploadDisputeEvidenceFileRequestBuilder accountID(String accountID) {
        Utils.checkNotNull(accountID, "accountID");
        this.accountID = accountID;
        return this;
    }

    public UploadDisputeEvidenceFileRequestBuilder disputeID(String disputeID) {
        Utils.checkNotNull(disputeID, "disputeID");
        this.disputeID = disputeID;
        return this;
    }

    public UploadDisputeEvidenceFileRequestBuilder createEvidenceFileMultiPart(CreateEvidenceFileMultiPart createEvidenceFileMultiPart) {
        Utils.checkNotNull(createEvidenceFileMultiPart, "createEvidenceFileMultiPart");
        this.createEvidenceFileMultiPart = createEvidenceFileMultiPart;
        return this;
    }


    private UploadDisputeEvidenceFileRequest buildRequest() {

        UploadDisputeEvidenceFileRequest request = new UploadDisputeEvidenceFileRequest(accountID,
            disputeID,
            createEvidenceFileMultiPart);

        return request;
    }

    public UploadDisputeEvidenceFileResponse call() throws Exception {
        
        RequestOperation<UploadDisputeEvidenceFileRequest, UploadDisputeEvidenceFileResponse> operation
              = new UploadDisputeEvidenceFileOperation(sdkConfiguration);
        UploadDisputeEvidenceFileRequest request = buildRequest();

        return operation.handleResponse(operation.doRequest(request));
    }
}
