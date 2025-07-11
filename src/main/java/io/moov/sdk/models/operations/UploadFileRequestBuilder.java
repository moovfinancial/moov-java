/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package io.moov.sdk.models.operations;

import static io.moov.sdk.operations.Operations.RequestOperation;

import io.moov.sdk.SDKConfiguration;
import io.moov.sdk.models.components.FileUploadRequestMultiPart;
import io.moov.sdk.operations.UploadFileOperation;
import io.moov.sdk.utils.Utils;
import java.lang.Exception;
import java.lang.String;

public class UploadFileRequestBuilder {

    private String accountID;
    private FileUploadRequestMultiPart fileUploadRequestMultiPart;
    private final SDKConfiguration sdkConfiguration;

    public UploadFileRequestBuilder(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }

    public UploadFileRequestBuilder accountID(String accountID) {
        Utils.checkNotNull(accountID, "accountID");
        this.accountID = accountID;
        return this;
    }

    public UploadFileRequestBuilder fileUploadRequestMultiPart(FileUploadRequestMultiPart fileUploadRequestMultiPart) {
        Utils.checkNotNull(fileUploadRequestMultiPart, "fileUploadRequestMultiPart");
        this.fileUploadRequestMultiPart = fileUploadRequestMultiPart;
        return this;
    }


    private UploadFileRequest buildRequest() {

        UploadFileRequest request = new UploadFileRequest(accountID,
            fileUploadRequestMultiPart);

        return request;
    }

    public UploadFileResponse call() throws Exception {
        
        RequestOperation<UploadFileRequest, UploadFileResponse> operation
              = new UploadFileOperation(sdkConfiguration);
        UploadFileRequest request = buildRequest();

        return operation.handleResponse(operation.doRequest(request));
    }
}
