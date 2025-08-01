/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package io.moov.sdk.models.operations;

import static io.moov.sdk.operations.Operations.RequestOperation;

import io.moov.sdk.SDKConfiguration;
import io.moov.sdk.models.components.UpsertSchedule;
import io.moov.sdk.operations.UpdateScheduleOperation;
import io.moov.sdk.utils.Utils;
import java.lang.Exception;
import java.lang.String;

public class UpdateScheduleRequestBuilder {

    private String accountID;
    private String scheduleID;
    private UpsertSchedule upsertSchedule;
    private final SDKConfiguration sdkConfiguration;

    public UpdateScheduleRequestBuilder(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }

    public UpdateScheduleRequestBuilder accountID(String accountID) {
        Utils.checkNotNull(accountID, "accountID");
        this.accountID = accountID;
        return this;
    }

    public UpdateScheduleRequestBuilder scheduleID(String scheduleID) {
        Utils.checkNotNull(scheduleID, "scheduleID");
        this.scheduleID = scheduleID;
        return this;
    }

    public UpdateScheduleRequestBuilder upsertSchedule(UpsertSchedule upsertSchedule) {
        Utils.checkNotNull(upsertSchedule, "upsertSchedule");
        this.upsertSchedule = upsertSchedule;
        return this;
    }


    private UpdateScheduleRequest buildRequest() {

        UpdateScheduleRequest request = new UpdateScheduleRequest(accountID,
            scheduleID,
            upsertSchedule);

        return request;
    }

    public UpdateScheduleResponse call() throws Exception {
        
        RequestOperation<UpdateScheduleRequest, UpdateScheduleResponse> operation
              = new UpdateScheduleOperation(sdkConfiguration);
        UpdateScheduleRequest request = buildRequest();

        return operation.handleResponse(operation.doRequest(request));
    }
}
