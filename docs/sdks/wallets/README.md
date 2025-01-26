# Wallets
(*wallets()*)

## Overview

### Available Operations

* [list](#list) - List the wallets associated with a Moov account. 

Read our [Moov wallets guide](https://docs.moov.io/guides/sources/wallets/) to learn more.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/wallets.read` scope.
* [get](#get) - Get information on a specific wallet (e.g., the available balance). 

Read our [Moov wallets guide](https://docs.moov.io/guides/sources/wallets/) to learn more.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/wallets.read` scope.

## list

List the wallets associated with a Moov account. 

Read our [Moov wallets guide](https://docs.moov.io/guides/sources/wallets/) to learn more.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/wallets.read` scope.

### Example Usage

```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.SchemeBasicAuth;
import io.moov.sdk.models.components.Versions;
import io.moov.sdk.models.operations.ListWalletsResponse;
import io.moov.sdk.models.operations.ListWalletsSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Moov sdk = Moov.builder()
            .build();

        ListWalletsResponse res = sdk.wallets().list()
                .security(ListWalletsSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .xMoovVersion(Versions.V202510)
                .accountID("60acf390-dc7f-4510-9b9b-ec968d375f0c")
                .call();

        if (res.wallets().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `security`                                                                                          | [io.moov.sdk.models.operations.ListWalletsSecurity](../../models/operations/ListWalletsSecurity.md) | :heavy_check_mark:                                                                                  | The security requirements to use for the request.                                                   |
| `xMoovVersion`                                                                                      | [Optional\<Versions>](../../models/components/Versions.md)                                          | :heavy_minus_sign:                                                                                  | Specify an API version.                                                                             |
| `accountID`                                                                                         | *String*                                                                                            | :heavy_check_mark:                                                                                  | N/A                                                                                                 |

### Response

**[ListWalletsResponse](../../models/operations/ListWalletsResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## get

Get information on a specific wallet (e.g., the available balance). 

Read our [Moov wallets guide](https://docs.moov.io/guides/sources/wallets/) to learn more.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/wallets.read` scope.

### Example Usage

```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.SchemeBasicAuth;
import io.moov.sdk.models.components.Versions;
import io.moov.sdk.models.operations.GetWalletResponse;
import io.moov.sdk.models.operations.GetWalletSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Moov sdk = Moov.builder()
            .build();

        GetWalletResponse res = sdk.wallets().get()
                .security(GetWalletSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .xMoovVersion(Versions.V202510)
                .accountID("499bec36-0099-43cb-884f-620887342259")
                .walletID("bc779af6-b7d5-464a-ad1f-f6476fa72706")
                .call();

        if (res.wallet().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `security`                                                                                      | [io.moov.sdk.models.operations.GetWalletSecurity](../../models/operations/GetWalletSecurity.md) | :heavy_check_mark:                                                                              | The security requirements to use for the request.                                               |
| `xMoovVersion`                                                                                  | [Optional\<Versions>](../../models/components/Versions.md)                                      | :heavy_minus_sign:                                                                              | Specify an API version.                                                                         |
| `accountID`                                                                                     | *String*                                                                                        | :heavy_check_mark:                                                                              | N/A                                                                                             |
| `walletID`                                                                                      | *String*                                                                                        | :heavy_check_mark:                                                                              | N/A                                                                                             |

### Response

**[GetWalletResponse](../../models/operations/GetWalletResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |