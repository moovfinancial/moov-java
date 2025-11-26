# Wallets
(*wallets()*)

## Overview

### Available Operations

* [create](#create) - Create a new wallet for an account. You can specify optional attributes such as a display name and description to specify the intended use of the wallet. This will generate a new moov-wallet payment method.

Read our [Moov wallets guide](https://docs.moov.io/guides/sources/wallets/) to learn more.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/wallets.write` scope.
* [list](#list) - List the wallets associated with a Moov account. 

Read our [Moov wallets guide](https://docs.moov.io/guides/sources/wallets/) to learn more.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/wallets.read` scope.
* [get](#get) - Get information on a specific wallet (e.g., the available balance). 

Read our [Moov wallets guide](https://docs.moov.io/guides/sources/wallets/) to learn more.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/wallets.read` scope.
* [update](#update) - Update properties of an existing wallet such as name, description, status, or metadata.

Read our [Moov wallets guide](https://docs.moov.io/guides/sources/wallets/) to learn more.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/)
you'll need to specify the `/accounts/{accountID}/wallets.write` scope.

## create

Create a new wallet for an account. You can specify optional attributes such as a display name and description to specify the intended use of the wallet. This will generate a new moov-wallet payment method.

Read our [Moov wallets guide](https://docs.moov.io/guides/sources/wallets/) to learn more.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/wallets.write` scope.

### Example Usage

<!-- UsageSnippet language="java" operationID="createWallet" method="post" path="/accounts/{accountID}/wallets" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.CreateWallet;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.errors.CreateWalletValidationError;
import io.moov.sdk.models.errors.GenericError;
import io.moov.sdk.models.operations.CreateWalletResponse;
import java.lang.Exception;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws GenericError, CreateWalletValidationError, Exception {

        Moov sdk = Moov.builder()
                .xMoovVersion("v2024.01.00")
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        CreateWalletResponse res = sdk.wallets().create()
                .accountID("b4b3f37c-b73e-4271-b8ec-108a8593c9b9")
                .createWallet(CreateWallet.builder()
                    .name("My wallet")
                    .description("A general wallet used for my payments")
                    .metadata(Map.ofEntries(
                        Map.entry("optional", "metadata")))
                    .build())
                .call();

        if (res.wallet().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                               | Type                                                                                                                    | Required                                                                                                                | Description                                                                                                             | Example                                                                                                                 |
| ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- |
| `accountID`                                                                                                             | *String*                                                                                                                | :heavy_check_mark:                                                                                                      | The Moov account ID the wallet belongs to.                                                                              |                                                                                                                         |
| `createWallet`                                                                                                          | [CreateWallet](../../models/components/CreateWallet.md)                                                                 | :heavy_check_mark:                                                                                                      | N/A                                                                                                                     | {<br/>"name": "My wallet",<br/>"description": "A general wallet used for my payments",<br/>"metadata": {<br/>"optional": "metadata"<br/>}<br/>} |

### Response

**[CreateWalletResponse](../../models/operations/CreateWalletResponse.md)**

### Errors

| Error Type                                | Status Code                               | Content Type                              |
| ----------------------------------------- | ----------------------------------------- | ----------------------------------------- |
| models/errors/GenericError                | 400, 409                                  | application/json                          |
| models/errors/CreateWalletValidationError | 422                                       | application/json                          |
| models/errors/APIException                | 4XX, 5XX                                  | \*/\*                                     |

## list

List the wallets associated with a Moov account. 

Read our [Moov wallets guide](https://docs.moov.io/guides/sources/wallets/) to learn more.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/wallets.read` scope.

### Example Usage

<!-- UsageSnippet language="java" operationID="listWallets" method="get" path="/accounts/{accountID}/wallets" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.errors.ListWalletsValidationError;
import io.moov.sdk.models.operations.ListWalletsRequest;
import io.moov.sdk.models.operations.ListWalletsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ListWalletsValidationError, Exception {

        Moov sdk = Moov.builder()
                .xMoovVersion("v2024.01.00")
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        ListWalletsRequest req = ListWalletsRequest.builder()
                .accountID("25221c3c-8e3f-40db-8570-66d17b51014d")
                .skip(60L)
                .count(20L)
                .build();

        ListWalletsResponse res = sdk.wallets().list()
                .request(req)
                .call();

        if (res.wallets().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [ListWalletsRequest](../../models/operations/ListWalletsRequest.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[ListWalletsResponse](../../models/operations/ListWalletsResponse.md)**

### Errors

| Error Type                               | Status Code                              | Content Type                             |
| ---------------------------------------- | ---------------------------------------- | ---------------------------------------- |
| models/errors/ListWalletsValidationError | 422                                      | application/json                         |
| models/errors/APIException               | 4XX, 5XX                                 | \*/\*                                    |

## get

Get information on a specific wallet (e.g., the available balance). 

Read our [Moov wallets guide](https://docs.moov.io/guides/sources/wallets/) to learn more.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/wallets.read` scope.

### Example Usage

<!-- UsageSnippet language="java" operationID="getWallet" method="get" path="/accounts/{accountID}/wallets/{walletID}" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.operations.GetWalletResponse;
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

        GetWalletResponse res = sdk.wallets().get()
                .accountID("d04dfd44-8194-422f-a666-08d30c183f9a")
                .walletID("10a6bc37-8eeb-41c8-bf5f-77b40955542a")
                .call();

        if (res.wallet().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `accountID`        | *String*           | :heavy_check_mark: | N/A                |
| `walletID`         | *String*           | :heavy_check_mark: | N/A                |

### Response

**[GetWalletResponse](../../models/operations/GetWalletResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## update

Update properties of an existing wallet such as name, description, status, or metadata.

Read our [Moov wallets guide](https://docs.moov.io/guides/sources/wallets/) to learn more.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/)
you'll need to specify the `/accounts/{accountID}/wallets.write` scope.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateWallet" method="patch" path="/accounts/{accountID}/wallets/{walletID}" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.PatchWallet;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.errors.GenericError;
import io.moov.sdk.models.errors.PatchWalletValidationError;
import io.moov.sdk.models.operations.UpdateWalletResponse;
import java.lang.Exception;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws GenericError, PatchWalletValidationError, Exception {

        Moov sdk = Moov.builder()
                .xMoovVersion("v2024.01.00")
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        UpdateWalletResponse res = sdk.wallets().update()
                .walletID("9f1c6e07-aae8-40e6-b290-502bb1bc486e")
                .accountID("e4aad2fb-201d-4390-b4d3-6de7716152e1")
                .patchWallet(PatchWallet.builder()
                    .name("My second wallet")
                    .description("My new description")
                    .metadata(Map.ofEntries(
                        Map.entry("optional", "metadata")))
                    .build())
                .call();

        if (res.wallet().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                   | Type                                                                                                        | Required                                                                                                    | Description                                                                                                 | Example                                                                                                     |
| ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| `walletID`                                                                                                  | *String*                                                                                                    | :heavy_check_mark:                                                                                          | Identifier for the wallet.                                                                                  |                                                                                                             |
| `accountID`                                                                                                 | *String*                                                                                                    | :heavy_check_mark:                                                                                          | The Moov account ID the wallet belongs to.                                                                  |                                                                                                             |
| `patchWallet`                                                                                               | [PatchWallet](../../models/components/PatchWallet.md)                                                       | :heavy_check_mark:                                                                                          | N/A                                                                                                         | {<br/>"name": "My second wallet",<br/>"description": "My new description",<br/>"metadata": {<br/>"optional": "metadata"<br/>}<br/>} |

### Response

**[UpdateWalletResponse](../../models/operations/UpdateWalletResponse.md)**

### Errors

| Error Type                               | Status Code                              | Content Type                             |
| ---------------------------------------- | ---------------------------------------- | ---------------------------------------- |
| models/errors/GenericError               | 400, 409                                 | application/json                         |
| models/errors/PatchWalletValidationError | 422                                      | application/json                         |
| models/errors/APIException               | 4XX, 5XX                                 | \*/\*                                    |