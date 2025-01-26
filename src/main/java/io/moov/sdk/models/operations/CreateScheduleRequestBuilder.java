/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.moov.sdk.models.operations;

import io.moov.sdk.models.components.UpsertSchedule;
import io.moov.sdk.models.components.Versions;
import io.moov.sdk.utils.Utils;
import java.lang.String;
import java.util.Optional;

public class CreateScheduleRequestBuilder {

    private CreateScheduleSecurity security;
    private Optional<? extends Versions> xMoovVersion = Optional.empty();
    private String accountID;
    private UpsertSchedule upsertSchedule;
    private final SDKMethodInterfaces.MethodCallCreateSchedule sdk;

    public CreateScheduleRequestBuilder(SDKMethodInterfaces.MethodCallCreateSchedule sdk) {
        this.sdk = sdk;
    }

    public CreateScheduleRequestBuilder security(CreateScheduleSecurity security) {
        Utils.checkNotNull(security, "security");
        this.security = security;
        return this;
    }
                
    public CreateScheduleRequestBuilder xMoovVersion(Versions xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = Optional.of(xMoovVersion);
        return this;
    }

    public CreateScheduleRequestBuilder xMoovVersion(Optional<? extends Versions> xMoovVersion) {
        Utils.checkNotNull(xMoovVersion, "xMoovVersion");
        this.xMoovVersion = xMoovVersion;
        return this;
    }

    public CreateScheduleRequestBuilder accountID(String accountID) {
        Utils.checkNotNull(accountID, "accountID");
        this.accountID = accountID;
        return this;
    }

    public CreateScheduleRequestBuilder upsertSchedule(UpsertSchedule upsertSchedule) {
        Utils.checkNotNull(upsertSchedule, "upsertSchedule");
        this.upsertSchedule = upsertSchedule;
        return this;
    }

    public CreateScheduleResponse call() throws Exception {

        return sdk.create(
            security,
            xMoovVersion,
            accountID,
            upsertSchedule);
    }
}
