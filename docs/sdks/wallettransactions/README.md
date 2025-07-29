# WalletTransactions
(*walletTransactions()*)

## Overview

### Available Operations

* [list](#list) - List all the transactions associated with a particular Moov wallet. 

Read our [wallet transactions guide](https://docs.moov.io/guides/sources/wallets/transactions/) to learn more.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/wallets.read` scope.
* [get](#get) - Get details on a specific wallet transaction. 

Read our [wallet transactions guide](https://docs.moov.io/guides/sources/wallets/transactions/) to learn more.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/wallets.read` scope.

## list

List all the transactions associated with a particular Moov wallet. 

Read our [wallet transactions guide](https://docs.moov.io/guides/sources/wallets/transactions/) to learn more.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/wallets.read` scope.

### Example Usage

<!-- UsageSnippet language="java" operationID="listWalletTransactions" method="get" path="/accounts/{accountID}/wallets/{walletID}/transactions" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.operations.ListWalletTransactionsRequest;
import io.moov.sdk.models.operations.ListWalletTransactionsResponse;
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

        ListWalletTransactionsRequest req = ListWalletTransactionsRequest.builder()
                .accountID("69e4529b-baf0-4f00-877b-123cfd9d6116")
                .walletID("4f971587-62fe-42c9-bc61-7409d9c8660c")
                .skip(60L)
                .count(20L)
                .build();

        ListWalletTransactionsResponse res = sdk.walletTransactions().list()
                .request(req)
                .call();

        if (res.walletTransactions().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [ListWalletTransactionsRequest](../../models/operations/ListWalletTransactionsRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[ListWalletTransactionsResponse](../../models/operations/ListWalletTransactionsResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## get

Get details on a specific wallet transaction. 

Read our [wallet transactions guide](https://docs.moov.io/guides/sources/wallets/transactions/) to learn more.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/wallets.read` scope.

### Example Usage

<!-- UsageSnippet language="java" operationID="getWalletTransaction" method="get" path="/accounts/{accountID}/wallets/{walletID}/transactions/{transactionID}" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.operations.GetWalletTransactionResponse;
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

        GetWalletTransactionResponse res = sdk.walletTransactions().get()
                .accountID("f0b02d73-10dc-42e6-8030-fd78fcbc114f")
                .walletID("03db97f6-c308-4595-8f43-fd247f1bd3f2")
                .transactionID("e0a32cf5-5758-49ba-83da-75bf02c9c6d7")
                .call();

        if (res.walletTransaction().isPresent()) {
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
| `transactionID`    | *String*           | :heavy_check_mark: | N/A                |

### Response

**[GetWalletTransactionResponse](../../models/operations/GetWalletTransactionResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |