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
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        ListIssuedCardAuthorizationsRequest req = ListIssuedCardAuthorizationsRequest.builder()
                .accountID("8b15de20-a7c4-4720-a646-88309ab5093d")
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
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        GetIssuedCardAuthorizationResponse res = sdk.issuingTransactions().getAuthorization()
                .xMoovVersion("v2024.01.00")
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

| Parameter                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         | Type                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              | Required                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          | Description                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       |
| --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `xMoovVersion`                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    | *Optional\<String>*                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               | :heavy_minus_sign:                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                | Specify an API version.<br/><br/>API versioning follows the format `vYYYY.QQ.BB`, where <br/>  - `YYYY` is the year<br/>  - `QQ` is the two-digit month for the first month of the quarter (e.g., 01, 04, 07, 10)<br/>  - `BB` is the build number, starting at `.01`, for subsequent builds in the same quarter. <br/>    - For example, `v2024.01.00` is the initial release of the first quarter of 2024.<br/><br/>The `latest` version represents the most recent development state. It may include breaking changes and should be treated as a beta release. |
| `accountID`                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       | *String*                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          | :heavy_check_mark:                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                | The Moov business account for which cards have been issued.                                                                                                                                                                                                                                                                                                                                                                                                                                                                       |
| `authorizationID`                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 | *String*                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          | :heavy_check_mark:                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                | N/A                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               |

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
import io.moov.sdk.models.operations.ListIssuedCardAuthorizationEventsRequest;
import io.moov.sdk.models.operations.ListIssuedCardAuthorizationEventsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Moov sdk = Moov.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        ListIssuedCardAuthorizationEventsRequest req = ListIssuedCardAuthorizationEventsRequest.builder()
                .accountID("78666549-e9e4-4769-8bd4-1456f277ddce")
                .authorizationID("fcc21f8e-61f5-4554-a253-362fd57052bb")
                .skip(60L)
                .count(20L)
                .build();

        ListIssuedCardAuthorizationEventsResponse res = sdk.issuingTransactions().listAuthorizationEvents()
                .request(req)
                .call();

        if (res.issuedCardAuthorizationEvents().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                       | Type                                                                                                            | Required                                                                                                        | Description                                                                                                     |
| --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                       | [ListIssuedCardAuthorizationEventsRequest](../../models/operations/ListIssuedCardAuthorizationEventsRequest.md) | :heavy_check_mark:                                                                                              | The request object to use for the request.                                                                      |

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
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        ListIssuedCardTransactionsRequest req = ListIssuedCardTransactionsRequest.builder()
                .accountID("b137f097-2f49-4fc7-afb4-b59a6fe762cd")
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
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        GetIssuedCardTransactionResponse res = sdk.issuingTransactions().get()
                .xMoovVersion("v2024.01.00")
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

| Parameter                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         | Type                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              | Required                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          | Description                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       |
| --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `xMoovVersion`                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    | *Optional\<String>*                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               | :heavy_minus_sign:                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                | Specify an API version.<br/><br/>API versioning follows the format `vYYYY.QQ.BB`, where <br/>  - `YYYY` is the year<br/>  - `QQ` is the two-digit month for the first month of the quarter (e.g., 01, 04, 07, 10)<br/>  - `BB` is the build number, starting at `.01`, for subsequent builds in the same quarter. <br/>    - For example, `v2024.01.00` is the initial release of the first quarter of 2024.<br/><br/>The `latest` version represents the most recent development state. It may include breaking changes and should be treated as a beta release. |
| `accountID`                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       | *String*                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          | :heavy_check_mark:                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                | The Moov business account for which cards have been issued.                                                                                                                                                                                                                                                                                                                                                                                                                                                                       |
| `cardTransactionID`                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               | *String*                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          | :heavy_check_mark:                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                | N/A                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               |

### Response

**[GetIssuedCardTransactionResponse](../../models/operations/GetIssuedCardTransactionResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |