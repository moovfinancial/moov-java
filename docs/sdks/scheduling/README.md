# Scheduling
(*scheduling()*)

## Overview

### Available Operations

* [create](#create) - Describes the schedule to create or modify.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/transfers.write` scope.
* [list](#list) - Describes a list of schedules associated with an account. Append the `hydrate=accounts` query parameter to include partial account details in the response.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/transfers.read` scope.
* [update](#update) - Describes the schedule to modify.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/transfers.write` scope.
* [get](#get) - Describes a schedule associated with an account. Requires at least 1 occurrence or recurTransfer to be specified.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/transfers.read` scope.
* [cancel](#cancel) - Describes the schedule to cancel.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/transfers.write` scope.
* [getOccurrance](#getoccurrance) - Gets a specific occurrence.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/transfers.read` scope.

## create

Describes the schedule to create or modify.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/transfers.write` scope.

### Example Usage

```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.*;
import io.moov.sdk.models.errors.GenericError;
import io.moov.sdk.models.errors.ScheduleValidationError;
import io.moov.sdk.models.operations.CreateScheduleResponse;
import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;

public class Application {

    public static void main(String[] args) throws GenericError, ScheduleValidationError, Exception {

        Moov sdk = Moov.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        CreateScheduleResponse res = sdk.scheduling().create()
                .accountID("9ab418fe-7b54-4964-a372-69b08e55ee8a")
                .upsertSchedule(UpsertSchedule.builder()
                    .occurrences(List.of(
                        Occurrence.builder()
                            .occurrenceID("c520f1b9-0ba7-42f5-b977-248cdbe41c69")
                            .runOn(OffsetDateTime.parse("2009-11-10T23:00:00Z"))
                            .runTransfer(RunTransfer.builder()
                                .amount(Amount.builder()
                                    .currency("USD")
                                    .value(1204L)
                                    .build())
                                .destination(SchedulePaymentMethod.builder()
                                    .paymentMethodID("c520f1b9-0ba7-42f5-b977-248cdbe41c69")
                                    .achDetails(AchDetails.builder()
                                        .companyEntryDescription("Gym dues")
                                        .originatingCompanyName("Whole Body Fit")
                                        .build())
                                    .cardDetails(CardDetails.builder()
                                        .dynamicDescriptor("WhlBdy *Yoga 11-12")
                                        .build())
                                    .build())
                                .partnerAccountID("c520f1b9-0ba7-42f5-b977-248cdbe41c69")
                                .source(SchedulePaymentMethod.builder()
                                    .paymentMethodID("c520f1b9-0ba7-42f5-b977-248cdbe41c69")
                                    .achDetails(AchDetails.builder()
                                        .companyEntryDescription("Gym dues")
                                        .originatingCompanyName("Whole Body Fit")
                                        .build())
                                    .cardDetails(CardDetails.builder()
                                        .dynamicDescriptor("WhlBdy *Yoga 11-12")
                                        .build())
                                    .build())
                                .description("delightfully fumigate convection though zowie up bulky electronics")
                                .build())
                            .build(),
                        Occurrence.builder()
                            .occurrenceID("c520f1b9-0ba7-42f5-b977-248cdbe41c69")
                            .runOn(OffsetDateTime.parse("2009-11-10T23:00:00Z"))
                            .runTransfer(RunTransfer.builder()
                                .amount(Amount.builder()
                                    .currency("USD")
                                    .value(1204L)
                                    .build())
                                .destination(SchedulePaymentMethod.builder()
                                    .paymentMethodID("c520f1b9-0ba7-42f5-b977-248cdbe41c69")
                                    .achDetails(AchDetails.builder()
                                        .companyEntryDescription("Gym dues")
                                        .originatingCompanyName("Whole Body Fit")
                                        .build())
                                    .cardDetails(CardDetails.builder()
                                        .dynamicDescriptor("WhlBdy *Yoga 11-12")
                                        .build())
                                    .build())
                                .partnerAccountID("c520f1b9-0ba7-42f5-b977-248cdbe41c69")
                                .source(SchedulePaymentMethod.builder()
                                    .paymentMethodID("c520f1b9-0ba7-42f5-b977-248cdbe41c69")
                                    .achDetails(AchDetails.builder()
                                        .companyEntryDescription("Gym dues")
                                        .originatingCompanyName("Whole Body Fit")
                                        .build())
                                    .cardDetails(CardDetails.builder()
                                        .dynamicDescriptor("WhlBdy *Yoga 11-12")
                                        .build())
                                    .build())
                                .description("tackle unabashedly mentor early miserly stealthily without")
                                .build())
                            .build()))
                    .recur(Recur.builder()
                        .recurrenceRule("<value>")
                        .runTransfer(RunTransfer.builder()
                            .amount(Amount.builder()
                                .currency("USD")
                                .value(1204L)
                                .build())
                            .destination(SchedulePaymentMethod.builder()
                                .paymentMethodID("c520f1b9-0ba7-42f5-b977-248cdbe41c69")
                                .achDetails(AchDetails.builder()
                                    .companyEntryDescription("Gym dues")
                                    .originatingCompanyName("Whole Body Fit")
                                    .build())
                                .cardDetails(CardDetails.builder()
                                    .dynamicDescriptor("WhlBdy *Yoga 11-12")
                                    .build())
                                .build())
                            .partnerAccountID("c520f1b9-0ba7-42f5-b977-248cdbe41c69")
                            .source(SchedulePaymentMethod.builder()
                                .paymentMethodID("c520f1b9-0ba7-42f5-b977-248cdbe41c69")
                                .achDetails(AchDetails.builder()
                                    .companyEntryDescription("Gym dues")
                                    .originatingCompanyName("Whole Body Fit")
                                    .build())
                                .cardDetails(CardDetails.builder()
                                    .dynamicDescriptor("WhlBdy *Yoga 11-12")
                                    .build())
                                .build())
                            .description("via deeply writ amid pupil yawningly wasabi when excepting councilman")
                            .build())
                        .start(OffsetDateTime.parse("2009-11-10T23:00:00Z"))
                        .build())
                    .build())
                .call();

        if (res.scheduleResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         | Type                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              | Required                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          | Description                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       |
| --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `xMoovVersion`                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    | *Optional\<String>*                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               | :heavy_minus_sign:                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                | Specify an API version.<br/><br/>API versioning follows the format `vYYYY.QQ.BB`, where <br/>  - `YYYY` is the year<br/>  - `QQ` is the two-digit month for the first month of the quarter (e.g., 01, 04, 07, 10)<br/>  - `BB` is the build number, starting at `.01`, for subsequent builds in the same quarter. <br/>    - For example, `v2024.01.00` is the initial release of the first quarter of 2024.<br/><br/>The `latest` version represents the most recent development state. It may include breaking changes and should be treated as a beta release. |
| `accountID`                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       | *String*                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          | :heavy_check_mark:                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                | N/A                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               |
| `upsertSchedule`                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  | [UpsertSchedule](../../models/components/UpsertSchedule.md)                                                                                                                                                                                                                                                                                                                                                                                                                                                                       | :heavy_check_mark:                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                | N/A                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               |

### Response

**[CreateScheduleResponse](../../models/operations/CreateScheduleResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/GenericError            | 400, 409                              | application/json                      |
| models/errors/ScheduleValidationError | 422                                   | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |

## list

Describes a list of schedules associated with an account. Append the `hydrate=accounts` query parameter to include partial account details in the response.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/transfers.read` scope.

### Example Usage

```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.operations.ListSchedulesRequest;
import io.moov.sdk.models.operations.ListSchedulesResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Moov sdk = Moov.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        ListSchedulesRequest req = ListSchedulesRequest.builder()
                .accountID("c8a232aa-0b11-4b8a-b005-71e9e705d0e6")
                .skip(60L)
                .count(20L)
                .build();

        ListSchedulesResponse res = sdk.scheduling().list()
                .request(req)
                .call();

        if (res.scheduleListResponses().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [ListSchedulesRequest](../../models/operations/ListSchedulesRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[ListSchedulesResponse](../../models/operations/ListSchedulesResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## update

Describes the schedule to modify.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/transfers.write` scope.

### Example Usage

```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.*;
import io.moov.sdk.models.errors.GenericError;
import io.moov.sdk.models.errors.ScheduleValidationError;
import io.moov.sdk.models.operations.UpdateScheduleResponse;
import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;

public class Application {

    public static void main(String[] args) throws GenericError, ScheduleValidationError, Exception {

        Moov sdk = Moov.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        UpdateScheduleResponse res = sdk.scheduling().update()
                .accountID("916f66c9-4a48-4a10-94fb-c5837b3ed84e")
                .scheduleID("ce88be33-c224-42c1-ae8b-3533cc7b3742")
                .upsertSchedule(UpsertSchedule.builder()
                    .occurrences(List.of(
                        Occurrence.builder()
                            .occurrenceID("c520f1b9-0ba7-42f5-b977-248cdbe41c69")
                            .runOn(OffsetDateTime.parse("2009-11-10T23:00:00Z"))
                            .runTransfer(RunTransfer.builder()
                                .amount(Amount.builder()
                                    .currency("USD")
                                    .value(1204L)
                                    .build())
                                .destination(SchedulePaymentMethod.builder()
                                    .paymentMethodID("c520f1b9-0ba7-42f5-b977-248cdbe41c69")
                                    .achDetails(AchDetails.builder()
                                        .companyEntryDescription("Gym dues")
                                        .originatingCompanyName("Whole Body Fit")
                                        .build())
                                    .cardDetails(CardDetails.builder()
                                        .dynamicDescriptor("WhlBdy *Yoga 11-12")
                                        .build())
                                    .build())
                                .partnerAccountID("c520f1b9-0ba7-42f5-b977-248cdbe41c69")
                                .source(SchedulePaymentMethod.builder()
                                    .paymentMethodID("c520f1b9-0ba7-42f5-b977-248cdbe41c69")
                                    .achDetails(AchDetails.builder()
                                        .companyEntryDescription("Gym dues")
                                        .originatingCompanyName("Whole Body Fit")
                                        .build())
                                    .cardDetails(CardDetails.builder()
                                        .dynamicDescriptor("WhlBdy *Yoga 11-12")
                                        .build())
                                    .build())
                                .description("technician eulogise whereas till mild than during")
                                .build())
                            .build(),
                        Occurrence.builder()
                            .occurrenceID("c520f1b9-0ba7-42f5-b977-248cdbe41c69")
                            .runOn(OffsetDateTime.parse("2009-11-10T23:00:00Z"))
                            .runTransfer(RunTransfer.builder()
                                .amount(Amount.builder()
                                    .currency("USD")
                                    .value(1204L)
                                    .build())
                                .destination(SchedulePaymentMethod.builder()
                                    .paymentMethodID("c520f1b9-0ba7-42f5-b977-248cdbe41c69")
                                    .achDetails(AchDetails.builder()
                                        .companyEntryDescription("Gym dues")
                                        .originatingCompanyName("Whole Body Fit")
                                        .build())
                                    .cardDetails(CardDetails.builder()
                                        .dynamicDescriptor("WhlBdy *Yoga 11-12")
                                        .build())
                                    .build())
                                .partnerAccountID("c520f1b9-0ba7-42f5-b977-248cdbe41c69")
                                .source(SchedulePaymentMethod.builder()
                                    .paymentMethodID("c520f1b9-0ba7-42f5-b977-248cdbe41c69")
                                    .achDetails(AchDetails.builder()
                                        .companyEntryDescription("Gym dues")
                                        .originatingCompanyName("Whole Body Fit")
                                        .build())
                                    .cardDetails(CardDetails.builder()
                                        .dynamicDescriptor("WhlBdy *Yoga 11-12")
                                        .build())
                                    .build())
                                .description("gosh frantically belabor past")
                                .build())
                            .build(),
                        Occurrence.builder()
                            .occurrenceID("c520f1b9-0ba7-42f5-b977-248cdbe41c69")
                            .runOn(OffsetDateTime.parse("2009-11-10T23:00:00Z"))
                            .runTransfer(RunTransfer.builder()
                                .amount(Amount.builder()
                                    .currency("USD")
                                    .value(1204L)
                                    .build())
                                .destination(SchedulePaymentMethod.builder()
                                    .paymentMethodID("c520f1b9-0ba7-42f5-b977-248cdbe41c69")
                                    .achDetails(AchDetails.builder()
                                        .companyEntryDescription("Gym dues")
                                        .originatingCompanyName("Whole Body Fit")
                                        .build())
                                    .cardDetails(CardDetails.builder()
                                        .dynamicDescriptor("WhlBdy *Yoga 11-12")
                                        .build())
                                    .build())
                                .partnerAccountID("c520f1b9-0ba7-42f5-b977-248cdbe41c69")
                                .source(SchedulePaymentMethod.builder()
                                    .paymentMethodID("c520f1b9-0ba7-42f5-b977-248cdbe41c69")
                                    .achDetails(AchDetails.builder()
                                        .companyEntryDescription("Gym dues")
                                        .originatingCompanyName("Whole Body Fit")
                                        .build())
                                    .cardDetails(CardDetails.builder()
                                        .dynamicDescriptor("WhlBdy *Yoga 11-12")
                                        .build())
                                    .build())
                                .description("perfumed fisherman with")
                                .build())
                            .build()))
                    .recur(Recur.builder()
                        .recurrenceRule("<value>")
                        .runTransfer(RunTransfer.builder()
                            .amount(Amount.builder()
                                .currency("USD")
                                .value(1204L)
                                .build())
                            .destination(SchedulePaymentMethod.builder()
                                .paymentMethodID("c520f1b9-0ba7-42f5-b977-248cdbe41c69")
                                .achDetails(AchDetails.builder()
                                    .companyEntryDescription("Gym dues")
                                    .originatingCompanyName("Whole Body Fit")
                                    .build())
                                .cardDetails(CardDetails.builder()
                                    .dynamicDescriptor("WhlBdy *Yoga 11-12")
                                    .build())
                                .build())
                            .partnerAccountID("c520f1b9-0ba7-42f5-b977-248cdbe41c69")
                            .source(SchedulePaymentMethod.builder()
                                .paymentMethodID("c520f1b9-0ba7-42f5-b977-248cdbe41c69")
                                .achDetails(AchDetails.builder()
                                    .companyEntryDescription("Gym dues")
                                    .originatingCompanyName("Whole Body Fit")
                                    .build())
                                .cardDetails(CardDetails.builder()
                                    .dynamicDescriptor("WhlBdy *Yoga 11-12")
                                    .build())
                                .build())
                            .description("hydrolyze lazily whenever how what")
                            .build())
                        .start(OffsetDateTime.parse("2009-11-10T23:00:00Z"))
                        .build())
                    .build())
                .call();

        if (res.scheduleResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         | Type                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              | Required                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          | Description                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       |
| --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `xMoovVersion`                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    | *Optional\<String>*                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               | :heavy_minus_sign:                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                | Specify an API version.<br/><br/>API versioning follows the format `vYYYY.QQ.BB`, where <br/>  - `YYYY` is the year<br/>  - `QQ` is the two-digit month for the first month of the quarter (e.g., 01, 04, 07, 10)<br/>  - `BB` is the build number, starting at `.01`, for subsequent builds in the same quarter. <br/>    - For example, `v2024.01.00` is the initial release of the first quarter of 2024.<br/><br/>The `latest` version represents the most recent development state. It may include breaking changes and should be treated as a beta release. |
| `accountID`                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       | *String*                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          | :heavy_check_mark:                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                | N/A                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               |
| `scheduleID`                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      | *String*                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          | :heavy_check_mark:                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                | N/A                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               |
| `upsertSchedule`                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  | [UpsertSchedule](../../models/components/UpsertSchedule.md)                                                                                                                                                                                                                                                                                                                                                                                                                                                                       | :heavy_check_mark:                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                | N/A                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               |

### Response

**[UpdateScheduleResponse](../../models/operations/UpdateScheduleResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/GenericError            | 400, 409                              | application/json                      |
| models/errors/ScheduleValidationError | 422                                   | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |

## get

Describes a schedule associated with an account. Requires at least 1 occurrence or recurTransfer to be specified.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/transfers.read` scope.

### Example Usage

```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.operations.GetSchedulesResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Moov sdk = Moov.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        GetSchedulesResponse res = sdk.scheduling().get()
                .accountID("b888f774-3e7c-4135-a18c-6b985523c4bc")
                .scheduleID("e50f7622-81da-484b-9c66-1c8a99c6b71b")
                .call();

        if (res.scheduleResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         | Type                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              | Required                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          | Description                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       |
| --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `xMoovVersion`                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    | *Optional\<String>*                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               | :heavy_minus_sign:                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                | Specify an API version.<br/><br/>API versioning follows the format `vYYYY.QQ.BB`, where <br/>  - `YYYY` is the year<br/>  - `QQ` is the two-digit month for the first month of the quarter (e.g., 01, 04, 07, 10)<br/>  - `BB` is the build number, starting at `.01`, for subsequent builds in the same quarter. <br/>    - For example, `v2024.01.00` is the initial release of the first quarter of 2024.<br/><br/>The `latest` version represents the most recent development state. It may include breaking changes and should be treated as a beta release. |
| `accountID`                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       | *String*                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          | :heavy_check_mark:                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                | N/A                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               |
| `scheduleID`                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      | *String*                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          | :heavy_check_mark:                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                | N/A                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               |

### Response

**[GetSchedulesResponse](../../models/operations/GetSchedulesResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## cancel

Describes the schedule to cancel.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/transfers.write` scope.

### Example Usage

```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.errors.GenericError;
import io.moov.sdk.models.operations.CancelScheduleResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GenericError, Exception {

        Moov sdk = Moov.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        CancelScheduleResponse res = sdk.scheduling().cancel()
                .accountID("0f713502-9233-41c6-9ebd-c570b7edb496")
                .scheduleID("d50fbe4e-3e32-4613-8574-4d82f3fd6b3c")
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         | Type                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              | Required                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          | Description                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       |
| --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `xMoovVersion`                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    | *Optional\<String>*                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               | :heavy_minus_sign:                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                | Specify an API version.<br/><br/>API versioning follows the format `vYYYY.QQ.BB`, where <br/>  - `YYYY` is the year<br/>  - `QQ` is the two-digit month for the first month of the quarter (e.g., 01, 04, 07, 10)<br/>  - `BB` is the build number, starting at `.01`, for subsequent builds in the same quarter. <br/>    - For example, `v2024.01.00` is the initial release of the first quarter of 2024.<br/><br/>The `latest` version represents the most recent development state. It may include breaking changes and should be treated as a beta release. |
| `accountID`                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       | *String*                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          | :heavy_check_mark:                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                | N/A                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               |
| `scheduleID`                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      | *String*                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          | :heavy_check_mark:                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                | N/A                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               |

### Response

**[CancelScheduleResponse](../../models/operations/CancelScheduleResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/GenericError | 400, 409                   | application/json           |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## getOccurrance

Gets a specific occurrence.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/transfers.read` scope.

### Example Usage

```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.operations.GetScheduledOccurrenceResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Moov sdk = Moov.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        GetScheduledOccurrenceResponse res = sdk.scheduling().getOccurrance()
                .accountID("cdeb0c02-04f9-4e60-9768-3c10a2b2201d")
                .scheduleID("47a51a3b-df1e-40c5-8048-918f18949779")
                .occurrenceFilter("<value>")
                .call();

        if (res.occurrencesResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         | Type                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              | Required                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          | Description                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       |
| --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `xMoovVersion`                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    | *Optional\<String>*                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               | :heavy_minus_sign:                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                | Specify an API version.<br/><br/>API versioning follows the format `vYYYY.QQ.BB`, where <br/>  - `YYYY` is the year<br/>  - `QQ` is the two-digit month for the first month of the quarter (e.g., 01, 04, 07, 10)<br/>  - `BB` is the build number, starting at `.01`, for subsequent builds in the same quarter. <br/>    - For example, `v2024.01.00` is the initial release of the first quarter of 2024.<br/><br/>The `latest` version represents the most recent development state. It may include breaking changes and should be treated as a beta release. |
| `accountID`                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       | *String*                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          | :heavy_check_mark:                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                | N/A                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               |
| `scheduleID`                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      | *String*                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          | :heavy_check_mark:                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                | N/A                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               |
| `occurrenceFilter`                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                | *String*                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          | :heavy_check_mark:                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                | Allows the specification of additional filters beyond the UUID.<br/><br/>Specifying a UUID string returns the exact occurrence.<br/>Specifying a RFC 3339 timestamp returns the latest occurrence at or before that timestamp.<br/>Specifying `latest` returns the latest occurrence at or before now.                                                                                                                                                                                                                            |

### Response

**[GetScheduledOccurrenceResponse](../../models/operations/GetScheduledOccurrenceResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |