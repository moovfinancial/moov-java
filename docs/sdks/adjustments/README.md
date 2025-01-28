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

```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.components.Versions;
import io.moov.sdk.models.operations.ListAdjustmentsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Moov sdk = Moov.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        ListAdjustmentsResponse res = sdk.adjustments().list()
                .xMoovVersion(Versions.V202510)
                .accountID("27396e19-5d2d-4fba-876d-423579b4f37e")
                .walletID("8a232aa0-b11b-48a0-8057-1e9e705d0e6e")
                .call();

        if (res.adjustments().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                  | Type                                                       | Required                                                   | Description                                                |
| ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- |
| `xMoovVersion`                                             | [Optional\<Versions>](../../models/components/Versions.md) | :heavy_minus_sign:                                         | Specify an API version.                                    |
| `accountID`                                                | *String*                                                   | :heavy_check_mark:                                         | N/A                                                        |
| `walletID`                                                 | *Optional\<String>*                                        | :heavy_minus_sign:                                         | A wallet ID to filter adjustments by.                      |

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

```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.components.Versions;
import io.moov.sdk.models.operations.GetAdjustmentResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Moov sdk = Moov.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        GetAdjustmentResponse res = sdk.adjustments().get()
                .xMoovVersion(Versions.V202510)
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

| Parameter                                                  | Type                                                       | Required                                                   | Description                                                |
| ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- |
| `xMoovVersion`                                             | [Optional\<Versions>](../../models/components/Versions.md) | :heavy_minus_sign:                                         | Specify an API version.                                    |
| `accountID`                                                | *String*                                                   | :heavy_check_mark:                                         | N/A                                                        |
| `adjustmentID`                                             | *String*                                                   | :heavy_check_mark:                                         | N/A                                                        |

### Response

**[GetAdjustmentResponse](../../models/operations/GetAdjustmentResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |