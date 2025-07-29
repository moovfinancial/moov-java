# Underwriting
(*underwriting()*)

## Overview

### Available Operations

* [get](#get) - Retrieve underwriting associated with a given Moov account. 

Read our [underwriting guide](https://docs.moov.io/guides/accounts/requirements/underwriting/) to learn more. 

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/profile.read` scope.
* [save](#save) - Create or update the account's underwriting.

Read our [underwriting guide](https://docs.moov.io/guides/accounts/requirements/underwriting/) to learn more.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/profile.write` scope.
* [upsert](#upsert) - Create or update the account's underwriting.

Read our [underwriting guide](https://docs.moov.io/guides/accounts/requirements/underwriting/) to learn more.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/profile.write` scope.

## get

Retrieve underwriting associated with a given Moov account. 

Read our [underwriting guide](https://docs.moov.io/guides/accounts/requirements/underwriting/) to learn more. 

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/profile.read` scope.

### Example Usage

<!-- UsageSnippet language="java" operationID="getUnderwriting" method="get" path="/accounts/{accountID}/underwriting" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.operations.GetUnderwritingResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Moov sdk = Moov.builder()
                .xMoovVersion("v2024.01.00")
                .security(Security.builder()
                    .username(System.getenv().getOrDefault("", ""))
                    .password(System.getenv().getOrDefault("", ""))
                    .build())
            .build();

        GetUnderwritingResponse res = sdk.underwriting().get()
                .accountID("efe07546-f697-4da5-bf73-d9987efd4cdd")
                .call();

        if (res.underwriting().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `accountID`        | *String*           | :heavy_check_mark: | N/A                |

### Response

**[GetUnderwritingResponse](../../models/operations/GetUnderwritingResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## save

Create or update the account's underwriting.

Read our [underwriting guide](https://docs.moov.io/guides/accounts/requirements/underwriting/) to learn more.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/profile.write` scope.

### Example Usage

<!-- UsageSnippet language="java" operationID="saveUnderwriting" method="post" path="/accounts/{accountID}/underwriting" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.components.UpsertUnderwriting;
import io.moov.sdk.models.errors.GenericError;
import io.moov.sdk.models.errors.UpsertUnderwritingError;
import io.moov.sdk.models.operations.SaveUnderwritingResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GenericError, UpsertUnderwritingError, Exception {

        Moov sdk = Moov.builder()
                .xMoovVersion("v2024.01.00")
                .security(Security.builder()
                    .username(System.getenv().getOrDefault("", ""))
                    .password(System.getenv().getOrDefault("", ""))
                    .build())
            .build();

        SaveUnderwritingResponse res = sdk.underwriting().save()
                .accountID("ffe3ca1b-de3f-4305-8d8c-cfd28f279cad")
                .upsertUnderwriting(UpsertUnderwriting.builder()
                    .build())
                .call();

        if (res.underwriting().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `accountID`                                                         | *String*                                                            | :heavy_check_mark:                                                  | N/A                                                                 |
| `upsertUnderwriting`                                                | [UpsertUnderwriting](../../models/components/UpsertUnderwriting.md) | :heavy_check_mark:                                                  | N/A                                                                 |

### Response

**[SaveUnderwritingResponse](../../models/operations/SaveUnderwritingResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/GenericError            | 400, 409                              | application/json                      |
| models/errors/UpsertUnderwritingError | 422                                   | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |

## upsert

Create or update the account's underwriting.

Read our [underwriting guide](https://docs.moov.io/guides/accounts/requirements/underwriting/) to learn more.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/profile.write` scope.

### Example Usage

<!-- UsageSnippet language="java" operationID="upsertUnderwriting" method="put" path="/accounts/{accountID}/underwriting" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.*;
import io.moov.sdk.models.errors.GenericError;
import io.moov.sdk.models.errors.UpdateUnderwritingError;
import io.moov.sdk.models.operations.UpsertUnderwritingResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GenericError, UpdateUnderwritingError, Exception {

        Moov sdk = Moov.builder()
                .xMoovVersion("v2024.01.00")
                .security(Security.builder()
                    .username(System.getenv().getOrDefault("", ""))
                    .password(System.getenv().getOrDefault("", ""))
                    .build())
            .build();

        UpsertUnderwritingResponse res = sdk.underwriting().upsert()
                .accountID("371bf394-45df-4ba8-a615-ad5483b1f963")
                .updateUnderwriting(UpdateUnderwriting.builder()
                    .averageTransactionSize(622191L)
                    .maxTransactionSize(123692L)
                    .averageMonthlyTransactionVolume(438164L)
                    .volumeByCustomerType(VolumeByCustomerType.builder()
                        .businessToBusinessPercentage(671399)
                        .consumerToBusinessPercentage(482010)
                        .build())
                    .cardVolumeDistribution(CardVolumeDistribution.builder()
                        .ecommercePercentage(47450)
                        .cardPresentPercentage(146275)
                        .mailOrPhonePercentage(309315)
                        .debtRepaymentPercentage(990303)
                        .build())
                    .fulfillment(FulfillmentDetails.builder()
                        .hasPhysicalGoods(true)
                        .isShippingProduct(true)
                        .shipmentDurationDays(388451L)
                        .returnPolicy(ReturnPolicyType.OTHER)
                        .build())
                    .build())
                .call();

        if (res.underwriting().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `accountID`                                                         | *String*                                                            | :heavy_check_mark:                                                  | N/A                                                                 |
| `updateUnderwriting`                                                | [UpdateUnderwriting](../../models/components/UpdateUnderwriting.md) | :heavy_check_mark:                                                  | N/A                                                                 |

### Response

**[UpsertUnderwritingResponse](../../models/operations/UpsertUnderwritingResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/GenericError            | 400, 409                              | application/json                      |
| models/errors/UpdateUnderwritingError | 422                                   | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |