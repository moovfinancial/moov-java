# IssuingTransactions
(*issuingTransactions()*)

## Overview

### Available Operations

* [listAuthorizations](#listauthorizations) - List issued card authorizations associated with a Moov account.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/issued-cards.read` scope.
* [getAuthorization](#getauthorization) - Retrieves details of an authorization associated with a specific Moov account.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/issued-cards.read` scope.
* [listAuthorizationEvents](#listauthorizationevents) - List card network and Moov platform events that affect the authorization and its hold on a wallet balance.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/issued-cards.read` scope.
* [list](#list) - List issued card transactions associated with a Moov account.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/issued-cards.read` scope.
* [get](#get) - Retrieves details of an issued card transaction associated with a specific Moov account.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/issued-cards.read` scope.

## listAuthorizations

List issued card authorizations associated with a Moov account.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/issued-cards.read` scope.

### Example Usage

```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.operations.ListIssuedCardAuthorizationsRequest;
import io.moov.sdk.models.operations.ListIssuedCardAuthorizationsResponse;
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

        ListIssuedCardAuthorizationsRequest req = ListIssuedCardAuthorizationsRequest.builder()
                .accountID("6465d95a-e945-4a49-8983-d74faa135bb4")
                .skip(60L)
                .count(20L)
                .build();

        ListIssuedCardAuthorizationsResponse res = sdk.issuingTransactions().listAuthorizations()
                .request(req)
                .call();

        if (res.issuedCardAuthorizations().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                             | Type                                                                                                  | Required                                                                                              | Description                                                                                           |
| ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- |
| `request`                                                                                             | [ListIssuedCardAuthorizationsRequest](../../models/operations/ListIssuedCardAuthorizationsRequest.md) | :heavy_check_mark:                                                                                    | The request object to use for the request.                                                            |

### Response

**[ListIssuedCardAuthorizationsResponse](../../models/operations/ListIssuedCardAuthorizationsResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## getAuthorization

Retrieves details of an authorization associated with a specific Moov account.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/issued-cards.read` scope.

### Example Usage

```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.operations.GetIssuedCardAuthorizationResponse;
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

        GetIssuedCardAuthorizationResponse res = sdk.issuingTransactions().getAuthorization()
                .accountID("0ccac2cc-6692-44a9-b0d1-35a1892c2db2")
                .authorizationID("d9ee8dde-b1eb-492f-bea1-d8e09bccbc52")
                .call();

        if (res.issuedCardAuthorization().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                   | Type                                                        | Required                                                    | Description                                                 |
| ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- |
| `accountID`                                                 | *String*                                                    | :heavy_check_mark:                                          | The Moov business account for which cards have been issued. |
| `authorizationID`                                           | *String*                                                    | :heavy_check_mark:                                          | N/A                                                         |

### Response

**[GetIssuedCardAuthorizationResponse](../../models/operations/GetIssuedCardAuthorizationResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## listAuthorizationEvents

List card network and Moov platform events that affect the authorization and its hold on a wallet balance.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/issued-cards.read` scope.

### Example Usage

```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.operations.ListIssuedCardAuthorizationEventsResponse;
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

        ListIssuedCardAuthorizationEventsResponse res = sdk.issuingTransactions().listAuthorizationEvents()
                .accountID("f30f8cb3-64d8-4a5f-a427-965317fa559a")
                .authorizationID("e6a0946d-f3d8-451e-9b1c-5bc346a95dd6")
                .skip(60L)
                .count(20L)
                .call();

        if (res.issuedCardAuthorizationEvents().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                   | Type                                                        | Required                                                    | Description                                                 | Example                                                     |
| ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- |
| `accountID`                                                 | *String*                                                    | :heavy_check_mark:                                          | The Moov business account for which cards have been issued. |                                                             |
| `authorizationID`                                           | *String*                                                    | :heavy_check_mark:                                          | N/A                                                         |                                                             |
| `skip`                                                      | *Optional\<Long>*                                           | :heavy_minus_sign:                                          | N/A                                                         | 60                                                          |
| `count`                                                     | *Optional\<Long>*                                           | :heavy_minus_sign:                                          | N/A                                                         | 20                                                          |

### Response

**[ListIssuedCardAuthorizationEventsResponse](../../models/operations/ListIssuedCardAuthorizationEventsResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## list

List issued card transactions associated with a Moov account.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/issued-cards.read` scope.

### Example Usage

```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.operations.ListIssuedCardTransactionsRequest;
import io.moov.sdk.models.operations.ListIssuedCardTransactionsResponse;
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

        ListIssuedCardTransactionsRequest req = ListIssuedCardTransactionsRequest.builder()
                .accountID("4efcb497-f915-4b6e-b973-e5e5bcc1fd34")
                .skip(60L)
                .count(20L)
                .build();

        ListIssuedCardTransactionsResponse res = sdk.issuingTransactions().list()
                .request(req)
                .call();

        if (res.issuedCardTransactions().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [ListIssuedCardTransactionsRequest](../../models/operations/ListIssuedCardTransactionsRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[ListIssuedCardTransactionsResponse](../../models/operations/ListIssuedCardTransactionsResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## get

Retrieves details of an issued card transaction associated with a specific Moov account.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/issued-cards.read` scope.

### Example Usage

```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.operations.GetIssuedCardTransactionResponse;
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

        GetIssuedCardTransactionResponse res = sdk.issuingTransactions().get()
                .accountID("b2b6e23c-a5aa-46a9-adb7-d12876e47288")
                .cardTransactionID("d5a1aab9-eb96-409a-ab95-88ac99cf00a5")
                .call();

        if (res.issuedCardTransaction().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                   | Type                                                        | Required                                                    | Description                                                 |
| ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- |
| `accountID`                                                 | *String*                                                    | :heavy_check_mark:                                          | The Moov business account for which cards have been issued. |
| `cardTransactionID`                                         | *String*                                                    | :heavy_check_mark:                                          | N/A                                                         |

### Response

**[GetIssuedCardTransactionResponse](../../models/operations/GetIssuedCardTransactionResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |