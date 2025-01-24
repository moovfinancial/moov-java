# Adjustments
(*adjustments()*)

## Overview

### Available Operations

* [listAdjustments](#listadjustments) - List adjustments associated with a Moov account.

To access this endpoint using a [token](https://docs.moov.io/api/authentication/access-tokens/) you'll need 
to specify the `/accounts/{accountID}/wallets.read` scope.
* [getAdjustment](#getadjustment) - Retrieve a specific adjustment associated with a Moov account.

To access this endpoint using a [token](https://docs.moov.io/api/authentication/access-tokens/) you'll need 
to specify the `/accounts/{accountID}/wallets.read` scope.

## listAdjustments

List adjustments associated with a Moov account.

To access this endpoint using a [token](https://docs.moov.io/api/authentication/access-tokens/) you'll need 
to specify the `/accounts/{accountID}/wallets.read` scope.

### Example Usage

```java
package hello.world;

import io.moov.api.Moov;
import io.moov.api.models.components.SchemeBasicAuth;
import io.moov.api.models.components.Versions;
import io.moov.api.models.operations.ListAdjustmentsResponse;
import io.moov.api.models.operations.ListAdjustmentsSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Moov sdk = Moov.builder()
            .build();

        ListAdjustmentsResponse res = sdk.adjustments().listAdjustments()
                .security(ListAdjustmentsSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .xMoovVersion(Versions.V202501)
                .accountID("27396e19-5d2d-4fba-876d-423579b4f37e")
                .walletID("7396e195-d2df-4ba7-b6d4-23579b4f37e2")
                .call();

        if (res.adjustments().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                   | Type                                                                                                        | Required                                                                                                    | Description                                                                                                 |
| ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                  | [io.moov.api.models.operations.ListAdjustmentsSecurity](../../models/operations/ListAdjustmentsSecurity.md) | :heavy_check_mark:                                                                                          | The security requirements to use for the request.                                                           |
| `xMoovVersion`                                                                                              | [Optional\<Versions>](../../models/components/Versions.md)                                                  | :heavy_minus_sign:                                                                                          | Specify an API version.                                                                                     |
| `accountID`                                                                                                 | *String*                                                                                                    | :heavy_check_mark:                                                                                          | N/A                                                                                                         |
| `walletID`                                                                                                  | *Optional\<String>*                                                                                         | :heavy_minus_sign:                                                                                          | A wallet ID to filter adjustments by.                                                                       |

### Response

**[ListAdjustmentsResponse](../../models/operations/ListAdjustmentsResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## getAdjustment

Retrieve a specific adjustment associated with a Moov account.

To access this endpoint using a [token](https://docs.moov.io/api/authentication/access-tokens/) you'll need 
to specify the `/accounts/{accountID}/wallets.read` scope.

### Example Usage

```java
package hello.world;

import io.moov.api.Moov;
import io.moov.api.models.components.SchemeBasicAuth;
import io.moov.api.models.components.Versions;
import io.moov.api.models.operations.GetAdjustmentResponse;
import io.moov.api.models.operations.GetAdjustmentSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Moov sdk = Moov.builder()
            .build();

        GetAdjustmentResponse res = sdk.adjustments().getAdjustment()
                .security(GetAdjustmentSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .xMoovVersion(Versions.V202504)
                .accountID("7c43cb4c-5944-40f9-9bef-7925774b06b4")
                .adjustmentID("244e9b18-1d97-4344-8a69-abf3c48078bc")
                .call();

        if (res.adjustment().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                               | Type                                                                                                    | Required                                                                                                | Description                                                                                             |
| ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- |
| `security`                                                                                              | [io.moov.api.models.operations.GetAdjustmentSecurity](../../models/operations/GetAdjustmentSecurity.md) | :heavy_check_mark:                                                                                      | The security requirements to use for the request.                                                       |
| `xMoovVersion`                                                                                          | [Optional\<Versions>](../../models/components/Versions.md)                                              | :heavy_minus_sign:                                                                                      | Specify an API version.                                                                                 |
| `accountID`                                                                                             | *String*                                                                                                | :heavy_check_mark:                                                                                      | N/A                                                                                                     |
| `adjustmentID`                                                                                          | *String*                                                                                                | :heavy_check_mark:                                                                                      | N/A                                                                                                     |

### Response

**[GetAdjustmentResponse](../../models/operations/GetAdjustmentResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |