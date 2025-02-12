# Scheduling
(*scheduling()*)

## Overview

### Available Operations

* [create](#create) - Describes the schedule to create or modify.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/transfers.write` scope.
* [list](#list) - Describes a list of schedules associated with an account. Requires at least 1 occurrence or recurTransfer to be specified.

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
* [getOccurrance](#getoccurrance) - Defines an occurrence for when to run a transfer.

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
import io.moov.sdk.models.components.AchDetails;
import io.moov.sdk.models.components.Amount;
import io.moov.sdk.models.components.CardDetails;
import io.moov.sdk.models.components.Occurrence;
import io.moov.sdk.models.components.Recur;
import io.moov.sdk.models.components.RunTransfer;
import io.moov.sdk.models.components.SchedulePaymentMethod;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.components.UpsertSchedule;
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
                .xMoovVersion("v2024.01.00")
                .accountID("4ee0c8f9-d96c-44a5-924b-28f02e5d05ca")
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
                                .description("quarrel last chilly storyboard after which")
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
                                .description("huddle monthly boo curry official deadly")
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
                                .description("following eek adventurously gosh alongside shakily down")
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
                            .description("astride idle until mainstream not inure")
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

Describes a list of schedules associated with an account. Requires at least 1 occurrence or recurTransfer to be specified.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/transfers.read` scope.

### Example Usage

```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.Security;
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

        ListSchedulesResponse res = sdk.scheduling().list()
                .xMoovVersion("v2024.01.00")
                .skip(60L)
                .count(20L)
                .accountID("f5b39da1-b677-43d6-b114-65cbbea83ad5")
                .call();

        if (res.scheduleResponses().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         | Type                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              | Required                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          | Description                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       | Example                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           |
| --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `xMoovVersion`                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    | *Optional\<String>*                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               | :heavy_minus_sign:                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                | Specify an API version.<br/><br/>API versioning follows the format `vYYYY.QQ.BB`, where <br/>  - `YYYY` is the year<br/>  - `QQ` is the two-digit month for the first month of the quarter (e.g., 01, 04, 07, 10)<br/>  - `BB` is the build number, starting at `.01`, for subsequent builds in the same quarter. <br/>    - For example, `v2024.01.00` is the initial release of the first quarter of 2024.<br/><br/>The `latest` version represents the most recent development state. It may include breaking changes and should be treated as a beta release. |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   |
| `skip`                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            | *Optional\<Long>*                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                | N/A                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               | 60                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                |
| `count`                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           | *Optional\<Long>*                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                | N/A                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               | 20                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                |
| `accountID`                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       | *String*                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          | :heavy_check_mark:                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                | N/A                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   |

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
import io.moov.sdk.models.components.AchDetails;
import io.moov.sdk.models.components.Amount;
import io.moov.sdk.models.components.CardDetails;
import io.moov.sdk.models.components.Occurrence;
import io.moov.sdk.models.components.Recur;
import io.moov.sdk.models.components.RunTransfer;
import io.moov.sdk.models.components.SchedulePaymentMethod;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.components.UpsertSchedule;
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
                .xMoovVersion("v2024.01.00")
                .accountID("c0aa3b4b-9122-4f67-8d60-fde10f180239")
                .scheduleID("9ab32094-a459-49c7-9ce9-437b9e400834")
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
                                .description("suckle violently comparison during rosemary unusual though meh fen inside")
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
                                .description("a both vice meaningfully pish")
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
                            .description("arrange fooey consequently parody however")
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
                .xMoovVersion("v2024.01.00")
                .accountID("aa7a59b8-5d59-4efd-99e7-b644e71e5f8c")
                .scheduleID("605976e8-f3ff-4e64-9b41-7255577d6f44")
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
                .xMoovVersion("v2024.01.00")
                .accountID("a1303a1c-8708-447e-a64b-5dba8417b641")
                .scheduleID("ab5ca483-e27d-48f0-b596-09eed517874f")
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

Defines an occurrence for when to run a transfer.

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
                .xMoovVersion("v2024.01.00")
                .accountID("7175f455-a6d6-4b87-8e24-cbd12c7dabe7")
                .scheduleID("a4ffa63d-9228-4488-8f27-d2ff59d7760c")
                .occurrenceFilter("<value>")
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
| `occurrenceFilter`                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                | *String*                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          | :heavy_check_mark:                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                | Allows the specification of additional filters beyond the UUID.<br/><br/>Specifying a UUID string returns the exact occurrence.<br/>Specifying a RFC 3339 timestamp returns the latest occurrence at or before that timestamp.<br/>Specifying `latest` returns the latest occurrence at or before now.                                                                                                                                                                                                                            |

### Response

**[GetScheduledOccurrenceResponse](../../models/operations/GetScheduledOccurrenceResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |