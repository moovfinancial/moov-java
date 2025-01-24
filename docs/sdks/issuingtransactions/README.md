# IssuingTransactions
(*issuingTransactions()*)

## Overview

### Available Operations

* [listIssuedCardAuthorizations](#listissuedcardauthorizations) - List issued card authorizations associated with a Moov account.

To access this endpoint using a [token](https://docs.moov.io/api/authentication/access-tokens/) you'll need to specify 
the `/accounts/{accountID}/issued-cards.read` scope.
* [getIssuedCardAuthorization](#getissuedcardauthorization) - Retrieves details of an authorization associated with a specific Moov account.

To access this endpoint using a [token](https://docs.moov.io/api/authentication/access-tokens/) you'll need to specify 
the `/accounts/{accountID}/issued-cards.read` scope.
* [listIssuedCardAuthorizationEvents](#listissuedcardauthorizationevents) - List card network and Moov platform events that affect the authorization and its hold on a wallet balance.

To access this endpoint using a [token](https://docs.moov.io/api/authentication/access-tokens/) you'll need to specify 
the `/accounts/{accountID}/issued-cards.read` scope.
* [listIssuedCardTransactions](#listissuedcardtransactions) - List issued card transactions associated with a Moov account.

To access this endpoint using a [token](https://docs.moov.io/api/authentication/access-tokens/) you'll need to specify 
the `/accounts/{accountID}/issued-cards.read` scope.
* [getIssuedCardTransaction](#getissuedcardtransaction) - Retrieves details of an issued card transaction associated with a specific Moov account.

To access this endpoint using a [token](https://docs.moov.io/api/authentication/access-tokens/) you'll need to specify 
the `/accounts/{accountID}/issued-cards.read` scope.

## listIssuedCardAuthorizations

List issued card authorizations associated with a Moov account.

To access this endpoint using a [token](https://docs.moov.io/api/authentication/access-tokens/) you'll need to specify 
the `/accounts/{accountID}/issued-cards.read` scope.

### Example Usage

```java
package hello.world;

import io.moov.api.Moov;
import io.moov.api.models.components.SchemeBasicAuth;
import io.moov.api.models.operations.ListIssuedCardAuthorizationsRequest;
import io.moov.api.models.operations.ListIssuedCardAuthorizationsResponse;
import io.moov.api.models.operations.ListIssuedCardAuthorizationsSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Moov sdk = Moov.builder()
            .build();

        ListIssuedCardAuthorizationsRequest req = ListIssuedCardAuthorizationsRequest.builder()
                .accountID("8b15de20-a7c4-4720-a646-88309ab5093d")
                .skip(60L)
                .count(20L)
                .build();

        ListIssuedCardAuthorizationsResponse res = sdk.issuingTransactions().listIssuedCardAuthorizations()
                .request(req)
                .security(ListIssuedCardAuthorizationsSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .call();

        if (res.issuedCardAuthorizations().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                             | Type                                                                                                                                  | Required                                                                                                                              | Description                                                                                                                           |
| ------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                             | [ListIssuedCardAuthorizationsRequest](../../models/operations/ListIssuedCardAuthorizationsRequest.md)                                 | :heavy_check_mark:                                                                                                                    | The request object to use for the request.                                                                                            |
| `security`                                                                                                                            | [io.moov.api.models.operations.ListIssuedCardAuthorizationsSecurity](../../models/operations/ListIssuedCardAuthorizationsSecurity.md) | :heavy_check_mark:                                                                                                                    | The security requirements to use for the request.                                                                                     |

### Response

**[ListIssuedCardAuthorizationsResponse](../../models/operations/ListIssuedCardAuthorizationsResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## getIssuedCardAuthorization

Retrieves details of an authorization associated with a specific Moov account.

To access this endpoint using a [token](https://docs.moov.io/api/authentication/access-tokens/) you'll need to specify 
the `/accounts/{accountID}/issued-cards.read` scope.

### Example Usage

```java
package hello.world;

import io.moov.api.Moov;
import io.moov.api.models.components.SchemeBasicAuth;
import io.moov.api.models.components.Versions;
import io.moov.api.models.operations.GetIssuedCardAuthorizationResponse;
import io.moov.api.models.operations.GetIssuedCardAuthorizationSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Moov sdk = Moov.builder()
            .build();

        GetIssuedCardAuthorizationResponse res = sdk.issuingTransactions().getIssuedCardAuthorization()
                .security(GetIssuedCardAuthorizationSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .xMoovVersion(Versions.V202507)
                .accountID("8c490d50-8951-4810-9506-ecd5648c2a39")
                .authorizationID("f037a459-fbd3-47b9-8181-09847ea9f557")
                .call();

        if (res.issuedCardAuthorization().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                         | Type                                                                                                                              | Required                                                                                                                          | Description                                                                                                                       |
| --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                                        | [io.moov.api.models.operations.GetIssuedCardAuthorizationSecurity](../../models/operations/GetIssuedCardAuthorizationSecurity.md) | :heavy_check_mark:                                                                                                                | The security requirements to use for the request.                                                                                 |
| `xMoovVersion`                                                                                                                    | [Optional\<Versions>](../../models/components/Versions.md)                                                                        | :heavy_minus_sign:                                                                                                                | Specify an API version.                                                                                                           |
| `accountID`                                                                                                                       | *String*                                                                                                                          | :heavy_check_mark:                                                                                                                | The Moov business account for which cards have been issued.                                                                       |
| `authorizationID`                                                                                                                 | *String*                                                                                                                          | :heavy_check_mark:                                                                                                                | N/A                                                                                                                               |

### Response

**[GetIssuedCardAuthorizationResponse](../../models/operations/GetIssuedCardAuthorizationResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## listIssuedCardAuthorizationEvents

List card network and Moov platform events that affect the authorization and its hold on a wallet balance.

To access this endpoint using a [token](https://docs.moov.io/api/authentication/access-tokens/) you'll need to specify 
the `/accounts/{accountID}/issued-cards.read` scope.

### Example Usage

```java
package hello.world;

import io.moov.api.Moov;
import io.moov.api.models.components.SchemeBasicAuth;
import io.moov.api.models.operations.ListIssuedCardAuthorizationEventsRequest;
import io.moov.api.models.operations.ListIssuedCardAuthorizationEventsResponse;
import io.moov.api.models.operations.ListIssuedCardAuthorizationEventsSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Moov sdk = Moov.builder()
            .build();

        ListIssuedCardAuthorizationEventsRequest req = ListIssuedCardAuthorizationEventsRequest.builder()
                .accountID("78666549-e9e4-4769-8bd4-1456f277ddce")
                .authorizationID("fcc21f8e-61f5-4554-a253-362fd57052bb")
                .skip(60L)
                .count(20L)
                .build();

        ListIssuedCardAuthorizationEventsResponse res = sdk.issuingTransactions().listIssuedCardAuthorizationEvents()
                .request(req)
                .security(ListIssuedCardAuthorizationEventsSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .call();

        if (res.issuedCardAuthorizationEvents().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                       | Type                                                                                                                                            | Required                                                                                                                                        | Description                                                                                                                                     |
| ----------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                       | [ListIssuedCardAuthorizationEventsRequest](../../models/operations/ListIssuedCardAuthorizationEventsRequest.md)                                 | :heavy_check_mark:                                                                                                                              | The request object to use for the request.                                                                                                      |
| `security`                                                                                                                                      | [io.moov.api.models.operations.ListIssuedCardAuthorizationEventsSecurity](../../models/operations/ListIssuedCardAuthorizationEventsSecurity.md) | :heavy_check_mark:                                                                                                                              | The security requirements to use for the request.                                                                                               |

### Response

**[ListIssuedCardAuthorizationEventsResponse](../../models/operations/ListIssuedCardAuthorizationEventsResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## listIssuedCardTransactions

List issued card transactions associated with a Moov account.

To access this endpoint using a [token](https://docs.moov.io/api/authentication/access-tokens/) you'll need to specify 
the `/accounts/{accountID}/issued-cards.read` scope.

### Example Usage

```java
package hello.world;

import io.moov.api.Moov;
import io.moov.api.models.components.SchemeBasicAuth;
import io.moov.api.models.operations.ListIssuedCardTransactionsRequest;
import io.moov.api.models.operations.ListIssuedCardTransactionsResponse;
import io.moov.api.models.operations.ListIssuedCardTransactionsSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Moov sdk = Moov.builder()
            .build();

        ListIssuedCardTransactionsRequest req = ListIssuedCardTransactionsRequest.builder()
                .accountID("b137f097-2f49-4fc7-afb4-b59a6fe762cd")
                .skip(60L)
                .count(20L)
                .build();

        ListIssuedCardTransactionsResponse res = sdk.issuingTransactions().listIssuedCardTransactions()
                .request(req)
                .security(ListIssuedCardTransactionsSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .call();

        if (res.issuedCardTransactions().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                         | Type                                                                                                                              | Required                                                                                                                          | Description                                                                                                                       |
| --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                         | [ListIssuedCardTransactionsRequest](../../models/operations/ListIssuedCardTransactionsRequest.md)                                 | :heavy_check_mark:                                                                                                                | The request object to use for the request.                                                                                        |
| `security`                                                                                                                        | [io.moov.api.models.operations.ListIssuedCardTransactionsSecurity](../../models/operations/ListIssuedCardTransactionsSecurity.md) | :heavy_check_mark:                                                                                                                | The security requirements to use for the request.                                                                                 |

### Response

**[ListIssuedCardTransactionsResponse](../../models/operations/ListIssuedCardTransactionsResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## getIssuedCardTransaction

Retrieves details of an issued card transaction associated with a specific Moov account.

To access this endpoint using a [token](https://docs.moov.io/api/authentication/access-tokens/) you'll need to specify 
the `/accounts/{accountID}/issued-cards.read` scope.

### Example Usage

```java
package hello.world;

import io.moov.api.Moov;
import io.moov.api.models.components.SchemeBasicAuth;
import io.moov.api.models.components.Versions;
import io.moov.api.models.operations.GetIssuedCardTransactionResponse;
import io.moov.api.models.operations.GetIssuedCardTransactionSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Moov sdk = Moov.builder()
            .build();

        GetIssuedCardTransactionResponse res = sdk.issuingTransactions().getIssuedCardTransaction()
                .security(GetIssuedCardTransactionSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .xMoovVersion(Versions.V202501)
                .accountID("4bebfda4-7627-4fb8-9945-5ef57c25a867")
                .cardTransactionID("33615eaf-e358-4f62-ac49-f7cca27d44ba")
                .call();

        if (res.issuedCardTransaction().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                     | Type                                                                                                                          | Required                                                                                                                      | Description                                                                                                                   |
| ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                                    | [io.moov.api.models.operations.GetIssuedCardTransactionSecurity](../../models/operations/GetIssuedCardTransactionSecurity.md) | :heavy_check_mark:                                                                                                            | The security requirements to use for the request.                                                                             |
| `xMoovVersion`                                                                                                                | [Optional\<Versions>](../../models/components/Versions.md)                                                                    | :heavy_minus_sign:                                                                                                            | Specify an API version.                                                                                                       |
| `accountID`                                                                                                                   | *String*                                                                                                                      | :heavy_check_mark:                                                                                                            | The Moov business account for which cards have been issued.                                                                   |
| `cardTransactionID`                                                                                                           | *String*                                                                                                                      | :heavy_check_mark:                                                                                                            | N/A                                                                                                                           |

### Response

**[GetIssuedCardTransactionResponse](../../models/operations/GetIssuedCardTransactionResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |