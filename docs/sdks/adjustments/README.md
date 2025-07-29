# Adjustments
(*adjustments()*)

## Overview

### Available Operations

* [list](#list) - List adjustments associated with a Moov account.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/wallets.read` scope.
* [get](#get) - Retrieve a specific adjustment associated with a Moov account.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/wallets.read` scope.

## list

List adjustments associated with a Moov account.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/wallets.read` scope.

### Example Usage

<!-- UsageSnippet language="java" operationID="listAdjustments" method="get" path="/accounts/{accountID}/adjustments" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.operations.ListAdjustmentsResponse;
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

        ListAdjustmentsResponse res = sdk.adjustments().list()
                .accountID("c054f3a6-d542-4310-a955-830739f800f0")
                .call();

        if (res.adjustments().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                             | Type                                  | Required                              | Description                           |
| ------------------------------------- | ------------------------------------- | ------------------------------------- | ------------------------------------- |
| `accountID`                           | *String*                              | :heavy_check_mark:                    | N/A                                   |
| `walletID`                            | *Optional\<String>*                   | :heavy_minus_sign:                    | A wallet ID to filter adjustments by. |

### Response

**[ListAdjustmentsResponse](../../models/operations/ListAdjustmentsResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## get

Retrieve a specific adjustment associated with a Moov account.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/wallets.read` scope.

### Example Usage

<!-- UsageSnippet language="java" operationID="getAdjustment" method="get" path="/accounts/{accountID}/adjustments/{adjustmentID}" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.operations.GetAdjustmentResponse;
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

        GetAdjustmentResponse res = sdk.adjustments().get()
                .accountID("3ef4e658-8aaa-449f-a7a4-95a6839172a1")
                .adjustmentID("cbe4a8e7-605f-4667-a308-1afde85cd7a5")
                .call();

        if (res.adjustment().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `accountID`        | *String*           | :heavy_check_mark: | N/A                |
| `adjustmentID`     | *String*           | :heavy_check_mark: | N/A                |

### Response

**[GetAdjustmentResponse](../../models/operations/GetAdjustmentResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |