# WalletTransactions
(*walletTransactions()*)

## Overview

### Available Operations

* [listWalletTransactions](#listwallettransactions) - List all the transactions associated with a particular Moov wallet. Read our [wallet transactions guide](https://docs.moov.io/guides/sources/wallets/transactions/) to learn more.

To use this endpoint from the browser, you'll need to specify the `/accounts/{accountID}/wallets.read` scope when generating a [token](https://docs.moov.io/api/authentication/access-tokens/).
* [getWalletTransaction](#getwallettransaction) - Get details on a specific wallet transaction. Read our [wallet transactions guide](https://docs.moov.io/guides/sources/wallets/transactions/) to learn more.

To use this endpoint from a browser, you'll need to specify the `/accounts/{accountID}/wallets.read` scope when generating a [token](https://docs.moov.io/api/authentication/access-tokens/).

## listWalletTransactions

List all the transactions associated with a particular Moov wallet. Read our [wallet transactions guide](https://docs.moov.io/guides/sources/wallets/transactions/) to learn more.

To use this endpoint from the browser, you'll need to specify the `/accounts/{accountID}/wallets.read` scope when generating a [token](https://docs.moov.io/api/authentication/access-tokens/).

### Example Usage

```java
package hello.world;

import io.moov.openapi.Moov;
import io.moov.openapi.models.components.SchemeBasicAuth;
import io.moov.openapi.models.operations.ListWalletTransactionsRequest;
import io.moov.openapi.models.operations.ListWalletTransactionsResponse;
import io.moov.openapi.models.operations.ListWalletTransactionsSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Moov sdk = Moov.builder()
            .build();

        ListWalletTransactionsRequest req = ListWalletTransactionsRequest.builder()
                .accountID("2d736837-1618-4c4a-9e51-aa9dd394b389")
                .walletID("99432d06-8ac3-4c17-afc1-a12a328564ac")
                .skip(60L)
                .count(20L)
                .build();

        ListWalletTransactionsResponse res = sdk.walletTransactions().listWalletTransactions()
                .request(req)
                .security(ListWalletTransactionsSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .call();

        if (res.walletTransactions().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                     | Type                                                                                                                          | Required                                                                                                                      | Description                                                                                                                   |
| ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                     | [ListWalletTransactionsRequest](../../models/operations/ListWalletTransactionsRequest.md)                                     | :heavy_check_mark:                                                                                                            | The request object to use for the request.                                                                                    |
| `security`                                                                                                                    | [io.moov.openapi.models.operations.ListWalletTransactionsSecurity](../../models/operations/ListWalletTransactionsSecurity.md) | :heavy_check_mark:                                                                                                            | The security requirements to use for the request.                                                                             |

### Response

**[ListWalletTransactionsResponse](../../models/operations/ListWalletTransactionsResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## getWalletTransaction

Get details on a specific wallet transaction. Read our [wallet transactions guide](https://docs.moov.io/guides/sources/wallets/transactions/) to learn more.

To use this endpoint from a browser, you'll need to specify the `/accounts/{accountID}/wallets.read` scope when generating a [token](https://docs.moov.io/api/authentication/access-tokens/).

### Example Usage

```java
package hello.world;

import io.moov.openapi.Moov;
import io.moov.openapi.models.components.SchemeBasicAuth;
import io.moov.openapi.models.components.Versions;
import io.moov.openapi.models.operations.GetWalletTransactionResponse;
import io.moov.openapi.models.operations.GetWalletTransactionSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Moov sdk = Moov.builder()
            .build();

        GetWalletTransactionResponse res = sdk.walletTransactions().getWalletTransaction()
                .security(GetWalletTransactionSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .xMoovVersion(Versions.LATEST)
                .accountID("a5040923-7566-4f60-af63-86465493f971")
                .walletID("a49156a6-65e8-4c24-a71a-eca54c2c3855")
                .transactionID("8b5c4f2a-2bb8-4145-b0ea-69212338b5a1")
                .call();

        if (res.walletTransaction().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                 | Type                                                                                                                      | Required                                                                                                                  | Description                                                                                                               |
| ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                                | [io.moov.openapi.models.operations.GetWalletTransactionSecurity](../../models/operations/GetWalletTransactionSecurity.md) | :heavy_check_mark:                                                                                                        | The security requirements to use for the request.                                                                         |
| `xMoovVersion`                                                                                                            | [Optional\<Versions>](../../models/components/Versions.md)                                                                | :heavy_minus_sign:                                                                                                        | Specify an API version.                                                                                                   |
| `accountID`                                                                                                               | *String*                                                                                                                  | :heavy_check_mark:                                                                                                        | N/A                                                                                                                       |
| `walletID`                                                                                                                | *String*                                                                                                                  | :heavy_check_mark:                                                                                                        | N/A                                                                                                                       |
| `transactionID`                                                                                                           | *String*                                                                                                                  | :heavy_check_mark:                                                                                                        | N/A                                                                                                                       |

### Response

**[GetWalletTransactionResponse](../../models/operations/GetWalletTransactionResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |