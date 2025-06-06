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
                .xMoovVersion("v2024.01.00")
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        CreateScheduleResponse res = sdk.scheduling().create()
                .accountID("38fd6ae1-0e70-4162-9359-d64482d61854")
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
                                .description("sediment yahoo a rudely mmm massive helpful brr")
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
                                .description("sediment yahoo a rudely mmm massive helpful brr")
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
                            .description("sediment yahoo a rudely mmm massive helpful brr")
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
                .xMoovVersion("v2024.01.00")
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        ListSchedulesRequest req = ListSchedulesRequest.builder()
                .accountID("b69f6366-984e-40f9-82a0-65335a43431d")
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
                .xMoovVersion("v2024.01.00")
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        UpdateScheduleResponse res = sdk.scheduling().update()
                .accountID("becca38e-c01f-4cfc-8f7c-187c7cf6a7a3")
                .scheduleID("1b29a8ad-60ee-4c90-90e7-fda62cd24154")
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
                                .description("er reasoning following veto oof fervently ha how till now")
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
                                .description("er reasoning following veto oof fervently ha how till now")
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
                                .description("er reasoning following veto oof fervently ha how till now")
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
                            .description("er reasoning following veto oof fervently ha how till now")
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
                .xMoovVersion("v2024.01.00")
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        GetSchedulesResponse res = sdk.scheduling().get()
                .accountID("31afd98b-eb55-41b3-8a4f-0ee8ea69e4e0")
                .scheduleID("55487e07-f3b7-44e8-b6f3-64fc85701c34")
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
                .xMoovVersion("v2024.01.00")
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        CancelScheduleResponse res = sdk.scheduling().cancel()
                .accountID("e89edcfc-19ca-40eb-802b-a35100dea24d")
                .scheduleID("5ca67de0-63f6-4cb7-b94a-6c84616ffe03")
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
                .xMoovVersion("v2024.01.00")
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        GetScheduledOccurrenceResponse res = sdk.scheduling().getOccurrance()
                .accountID("ea12b5d5-6249-4af2-ae48-6141a5251090")
                .scheduleID("289e94cd-66f1-4df5-999f-46d0f40b4ce9")
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