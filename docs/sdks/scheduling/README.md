# Scheduling
(*scheduling()*)

## Overview

### Available Operations

* [createSchedule](#createschedule) - Describes the schedule to create or modify.
* [listSchedules](#listschedules) - Describes a list of schedules associated with an account. Requires at least 1 occurrence or recurTransfer to be specified.
* [updateSchedule](#updateschedule) - Describes the schedule to modify.
* [getSchedules](#getschedules) - Describes a schedule associated with an account. Requires at least 1 occurrence or recurTransfer to be specified.
* [cancelSchedule](#cancelschedule) - Describes the schedule to cancel.
* [getScheduledOccurrence](#getscheduledoccurrence) - Defines an occurrence for when to run a transfer.

## createSchedule

Describes the schedule to create or modify.

### Example Usage

```java
package hello.world;

import io.moov.openapi.Moov;
import io.moov.openapi.models.components.AchDetails;
import io.moov.openapi.models.components.Amount;
import io.moov.openapi.models.components.CardDetails;
import io.moov.openapi.models.components.Occurrence;
import io.moov.openapi.models.components.Recur;
import io.moov.openapi.models.components.RunTransfer;
import io.moov.openapi.models.components.SchedulePaymentMethod;
import io.moov.openapi.models.components.SchemeBasicAuth;
import io.moov.openapi.models.components.UpsertSchedule;
import io.moov.openapi.models.components.Versions;
import io.moov.openapi.models.errors.GenericError;
import io.moov.openapi.models.errors.ScheduleValidationError;
import io.moov.openapi.models.operations.CreateScheduleResponse;
import io.moov.openapi.models.operations.CreateScheduleSecurity;
import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;

public class Application {

    public static void main(String[] args) throws GenericError, ScheduleValidationError, Exception {

        Moov sdk = Moov.builder()
            .build();

        CreateScheduleResponse res = sdk.scheduling().createSchedule()
                .security(CreateScheduleSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .xMoovVersion(Versions.LATEST)
                .accountID("4ee0c8f9-d96c-44a5-924b-28f02e5d05ca")
                .upsertSchedule(UpsertSchedule.builder()
                    .occurrences(List.of(
                        Occurrence.builder()
                            .occurrenceID("c520f1b9-0ba7-42f5-b977-248cdbe41c69")
                            .runOn(OffsetDateTime.parse("2009-11-10T23:00:00Z"))
                            .runTransfer(RunTransfer.builder()
                                .amount(Amount.builder()
                                    .currency("Kyat")
                                    .value(169093L)
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
                                    .currency("Jordanian Dinar")
                                    .value(859489L)
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
                                    .currency("Ouguiya")
                                    .value(670277L)
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
                                .currency("Rial Omani")
                                .value(14774L)
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

| Parameter                                                                                                     | Type                                                                                                          | Required                                                                                                      | Description                                                                                                   |
| ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                    | [io.moov.openapi.models.operations.CreateScheduleSecurity](../../models/operations/CreateScheduleSecurity.md) | :heavy_check_mark:                                                                                            | The security requirements to use for the request.                                                             |
| `xMoovVersion`                                                                                                | [Optional\<Versions>](../../models/components/Versions.md)                                                    | :heavy_minus_sign:                                                                                            | Specify an API version.                                                                                       |
| `accountID`                                                                                                   | *String*                                                                                                      | :heavy_check_mark:                                                                                            | N/A                                                                                                           |
| `upsertSchedule`                                                                                              | [UpsertSchedule](../../models/components/UpsertSchedule.md)                                                   | :heavy_check_mark:                                                                                            | N/A                                                                                                           |

### Response

**[CreateScheduleResponse](../../models/operations/CreateScheduleResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/GenericError            | 400, 409                              | application/json                      |
| models/errors/ScheduleValidationError | 422                                   | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |

## listSchedules

Describes a list of schedules associated with an account. Requires at least 1 occurrence or recurTransfer to be specified.

### Example Usage

```java
package hello.world;

import io.moov.openapi.Moov;
import io.moov.openapi.models.components.SchemeBasicAuth;
import io.moov.openapi.models.components.Versions;
import io.moov.openapi.models.operations.ListSchedulesResponse;
import io.moov.openapi.models.operations.ListSchedulesSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Moov sdk = Moov.builder()
            .build();

        ListSchedulesResponse res = sdk.scheduling().listSchedules()
                .security(ListSchedulesSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .xMoovVersion(Versions.LATEST)
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

| Parameter                                                                                                   | Type                                                                                                        | Required                                                                                                    | Description                                                                                                 | Example                                                                                                     |
| ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                  | [io.moov.openapi.models.operations.ListSchedulesSecurity](../../models/operations/ListSchedulesSecurity.md) | :heavy_check_mark:                                                                                          | The security requirements to use for the request.                                                           |                                                                                                             |
| `xMoovVersion`                                                                                              | [Optional\<Versions>](../../models/components/Versions.md)                                                  | :heavy_minus_sign:                                                                                          | Specify an API version.                                                                                     |                                                                                                             |
| `skip`                                                                                                      | *Optional\<Long>*                                                                                           | :heavy_minus_sign:                                                                                          | N/A                                                                                                         | 60                                                                                                          |
| `count`                                                                                                     | *Optional\<Long>*                                                                                           | :heavy_minus_sign:                                                                                          | N/A                                                                                                         | 20                                                                                                          |
| `accountID`                                                                                                 | *String*                                                                                                    | :heavy_check_mark:                                                                                          | N/A                                                                                                         |                                                                                                             |

### Response

**[ListSchedulesResponse](../../models/operations/ListSchedulesResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## updateSchedule

Describes the schedule to modify.

### Example Usage

```java
package hello.world;

import io.moov.openapi.Moov;
import io.moov.openapi.models.components.AchDetails;
import io.moov.openapi.models.components.Amount;
import io.moov.openapi.models.components.CardDetails;
import io.moov.openapi.models.components.Occurrence;
import io.moov.openapi.models.components.Recur;
import io.moov.openapi.models.components.RunTransfer;
import io.moov.openapi.models.components.SchedulePaymentMethod;
import io.moov.openapi.models.components.SchemeBasicAuth;
import io.moov.openapi.models.components.UpsertSchedule;
import io.moov.openapi.models.components.Versions;
import io.moov.openapi.models.errors.GenericError;
import io.moov.openapi.models.errors.ScheduleValidationError;
import io.moov.openapi.models.operations.UpdateScheduleResponse;
import io.moov.openapi.models.operations.UpdateScheduleSecurity;
import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;

public class Application {

    public static void main(String[] args) throws GenericError, ScheduleValidationError, Exception {

        Moov sdk = Moov.builder()
            .build();

        UpdateScheduleResponse res = sdk.scheduling().updateSchedule()
                .security(UpdateScheduleSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .xMoovVersion(Versions.V20240000)
                .accountID("c0aa3b4b-9122-4f67-8d60-fde10f180239")
                .scheduleID("9ab32094-a459-49c7-9ce9-437b9e400834")
                .upsertSchedule(UpsertSchedule.builder()
                    .occurrences(List.of(
                        Occurrence.builder()
                            .occurrenceID("c520f1b9-0ba7-42f5-b977-248cdbe41c69")
                            .runOn(OffsetDateTime.parse("2009-11-10T23:00:00Z"))
                            .runTransfer(RunTransfer.builder()
                                .amount(Amount.builder()
                                    .currency("Ouguiya")
                                    .value(116555L)
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
                                    .currency("Bahamian Dollar")
                                    .value(78068L)
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
                                .currency("Mauritius Rupee")
                                .value(856383L)
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

| Parameter                                                                                                     | Type                                                                                                          | Required                                                                                                      | Description                                                                                                   |
| ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                    | [io.moov.openapi.models.operations.UpdateScheduleSecurity](../../models/operations/UpdateScheduleSecurity.md) | :heavy_check_mark:                                                                                            | The security requirements to use for the request.                                                             |
| `xMoovVersion`                                                                                                | [Optional\<Versions>](../../models/components/Versions.md)                                                    | :heavy_minus_sign:                                                                                            | Specify an API version.                                                                                       |
| `accountID`                                                                                                   | *String*                                                                                                      | :heavy_check_mark:                                                                                            | N/A                                                                                                           |
| `scheduleID`                                                                                                  | *String*                                                                                                      | :heavy_check_mark:                                                                                            | N/A                                                                                                           |
| `upsertSchedule`                                                                                              | [UpsertSchedule](../../models/components/UpsertSchedule.md)                                                   | :heavy_check_mark:                                                                                            | N/A                                                                                                           |

### Response

**[UpdateScheduleResponse](../../models/operations/UpdateScheduleResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/GenericError            | 400, 409                              | application/json                      |
| models/errors/ScheduleValidationError | 422                                   | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |

## getSchedules

Describes a schedule associated with an account. Requires at least 1 occurrence or recurTransfer to be specified.

### Example Usage

```java
package hello.world;

import io.moov.openapi.Moov;
import io.moov.openapi.models.components.SchemeBasicAuth;
import io.moov.openapi.models.components.Versions;
import io.moov.openapi.models.operations.GetSchedulesResponse;
import io.moov.openapi.models.operations.GetSchedulesSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Moov sdk = Moov.builder()
            .build();

        GetSchedulesResponse res = sdk.scheduling().getSchedules()
                .security(GetSchedulesSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .xMoovVersion(Versions.LATEST)
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

| Parameter                                                                                                 | Type                                                                                                      | Required                                                                                                  | Description                                                                                               |
| --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                | [io.moov.openapi.models.operations.GetSchedulesSecurity](../../models/operations/GetSchedulesSecurity.md) | :heavy_check_mark:                                                                                        | The security requirements to use for the request.                                                         |
| `xMoovVersion`                                                                                            | [Optional\<Versions>](../../models/components/Versions.md)                                                | :heavy_minus_sign:                                                                                        | Specify an API version.                                                                                   |
| `accountID`                                                                                               | *String*                                                                                                  | :heavy_check_mark:                                                                                        | N/A                                                                                                       |
| `scheduleID`                                                                                              | *String*                                                                                                  | :heavy_check_mark:                                                                                        | N/A                                                                                                       |

### Response

**[GetSchedulesResponse](../../models/operations/GetSchedulesResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## cancelSchedule

Describes the schedule to cancel.

### Example Usage

```java
package hello.world;

import io.moov.openapi.Moov;
import io.moov.openapi.models.components.SchemeBasicAuth;
import io.moov.openapi.models.components.Versions;
import io.moov.openapi.models.errors.GenericError;
import io.moov.openapi.models.operations.CancelScheduleResponse;
import io.moov.openapi.models.operations.CancelScheduleSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GenericError, Exception {

        Moov sdk = Moov.builder()
            .build();

        CancelScheduleResponse res = sdk.scheduling().cancelSchedule()
                .security(CancelScheduleSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .xMoovVersion(Versions.LATEST)
                .accountID("a1303a1c-8708-447e-a64b-5dba8417b641")
                .scheduleID("ab5ca483-e27d-48f0-b596-09eed517874f")
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                     | Type                                                                                                          | Required                                                                                                      | Description                                                                                                   |
| ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                    | [io.moov.openapi.models.operations.CancelScheduleSecurity](../../models/operations/CancelScheduleSecurity.md) | :heavy_check_mark:                                                                                            | The security requirements to use for the request.                                                             |
| `xMoovVersion`                                                                                                | [Optional\<Versions>](../../models/components/Versions.md)                                                    | :heavy_minus_sign:                                                                                            | Specify an API version.                                                                                       |
| `accountID`                                                                                                   | *String*                                                                                                      | :heavy_check_mark:                                                                                            | N/A                                                                                                           |
| `scheduleID`                                                                                                  | *String*                                                                                                      | :heavy_check_mark:                                                                                            | N/A                                                                                                           |

### Response

**[CancelScheduleResponse](../../models/operations/CancelScheduleResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/GenericError | 400, 409                   | application/json           |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## getScheduledOccurrence

Defines an occurrence for when to run a transfer.

### Example Usage

```java
package hello.world;

import io.moov.openapi.Moov;
import io.moov.openapi.models.components.SchemeBasicAuth;
import io.moov.openapi.models.components.Versions;
import io.moov.openapi.models.operations.GetScheduledOccurrenceResponse;
import io.moov.openapi.models.operations.GetScheduledOccurrenceSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Moov sdk = Moov.builder()
            .build();

        GetScheduledOccurrenceResponse res = sdk.scheduling().getScheduledOccurrence()
                .security(GetScheduledOccurrenceSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .xMoovVersion(Versions.V20240000)
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

| Parameter                                                                                                                                                                                                                                                                              | Type                                                                                                                                                                                                                                                                                   | Required                                                                                                                                                                                                                                                                               | Description                                                                                                                                                                                                                                                                            |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                                                                                                                                                                                             | [io.moov.openapi.models.operations.GetScheduledOccurrenceSecurity](../../models/operations/GetScheduledOccurrenceSecurity.md)                                                                                                                                                          | :heavy_check_mark:                                                                                                                                                                                                                                                                     | The security requirements to use for the request.                                                                                                                                                                                                                                      |
| `xMoovVersion`                                                                                                                                                                                                                                                                         | [Optional\<Versions>](../../models/components/Versions.md)                                                                                                                                                                                                                             | :heavy_minus_sign:                                                                                                                                                                                                                                                                     | Specify an API version.                                                                                                                                                                                                                                                                |
| `accountID`                                                                                                                                                                                                                                                                            | *String*                                                                                                                                                                                                                                                                               | :heavy_check_mark:                                                                                                                                                                                                                                                                     | N/A                                                                                                                                                                                                                                                                                    |
| `scheduleID`                                                                                                                                                                                                                                                                           | *String*                                                                                                                                                                                                                                                                               | :heavy_check_mark:                                                                                                                                                                                                                                                                     | N/A                                                                                                                                                                                                                                                                                    |
| `occurrenceFilter`                                                                                                                                                                                                                                                                     | *String*                                                                                                                                                                                                                                                                               | :heavy_check_mark:                                                                                                                                                                                                                                                                     | Allows the specification of additional filters beyond the UUID.<br/><br/>Specifying a UUID string returns the exact occurrence.<br/>Specifying a RFC 3339 timestamp returns the latest occurrence at or before that timestamp.<br/>Specifying `latest` returns the latest occurrence at or before now. |

### Response

**[GetScheduledOccurrenceResponse](../../models/operations/GetScheduledOccurrenceResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |