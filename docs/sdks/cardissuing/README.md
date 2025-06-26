# CardIssuing
(*cardIssuing()*)

## Overview

### Available Operations

* [request](#request) - Request a virtual card be issued.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/issued-cards.write` scope.
* [list](#list) - List Moov issued cards existing for the account.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/issued-cards.read` scope.
* [get](#get) - Retrieve a single issued card associated with a Moov account.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/issued-cards.read` scope.
* [update](#update) - Update a Moov issued card.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/issued-cards.write` scope.
* [getFull](#getfull) - Get issued card with PAN, CVV, and expiration. 

Only use this endpoint if you have provided Moov with a copy of your PCI attestation of compliance.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/issued-cards.read-secure` scope.

## request

Request a virtual card be issued.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/issued-cards.write` scope.

### Example Usage

```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.*;
import io.moov.sdk.models.errors.GenericError;
import io.moov.sdk.models.errors.RequestCardError;
import io.moov.sdk.models.operations.RequestCardResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws GenericError, RequestCardError, Exception {

        Moov sdk = Moov.builder()
                .xMoovVersion("v2024.01.00")
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        RequestCardResponse res = sdk.cardIssuing().request()
                .accountID("d9ac71ae-fccb-4dfc-9fed-710ca654e3ed")
                .requestCard(RequestCard.builder()
                    .fundingWalletID("fd98e3b2-696f-4f67-9250-17b3474ababf")
                    .authorizedUser(CreateAuthorizedUser.builder()
                        .firstName("Milton")
                        .lastName("Stiedemann")
                        .birthDate(BirthDate.builder()
                            .day(9L)
                            .month(11L)
                            .year(1989L)
                            .build())
                        .build())
                    .formFactor(IssuedCardFormFactor.VIRTUAL)
                    .expiration(CardExpiration.builder()
                        .month("01")
                        .year("21")
                        .build())
                    .controls(IssuingControls.builder()
                        .velocityLimits(List.of(
                            IssuingVelocityLimit.builder()
                                .amount(10000L)
                                .interval(IssuingIntervalLimit.PER_TRANSACTION)
                                .build()))
                        .build())
                    .build())
                .call();

        if (res.issuedCard().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                     | Type                                                          | Required                                                      | Description                                                   |
| ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- |
| `accountID`                                                   | *String*                                                      | :heavy_check_mark:                                            | The Moov business account for which the card is to be issued. |
| `requestCard`                                                 | [RequestCard](../../models/components/RequestCard.md)         | :heavy_check_mark:                                            | N/A                                                           |

### Response

**[RequestCardResponse](../../models/operations/RequestCardResponse.md)**

### Errors

| Error Type                     | Status Code                    | Content Type                   |
| ------------------------------ | ------------------------------ | ------------------------------ |
| models/errors/GenericError     | 400                            | application/json               |
| models/errors/RequestCardError | 422                            | application/json               |
| models/errors/APIException     | 4XX, 5XX                       | \*/\*                          |

## list

List Moov issued cards existing for the account.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/issued-cards.read` scope.

### Example Usage

```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.operations.ListIssuedCardsResponse;
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

        ListIssuedCardsResponse res = sdk.cardIssuing().list()
                .accountID("17c958e0-3abe-46e5-8afb-98742f1fb8ac")
                .skip(60L)
                .count(20L)
                .call();

        if (res.issuedCards().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                 | Type                                                                                                                      | Required                                                                                                                  | Description                                                                                                               | Example                                                                                                                   |
| ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- |
| `accountID`                                                                                                               | *String*                                                                                                                  | :heavy_check_mark:                                                                                                        | The Moov business account for which the cards have been issued.                                                           |                                                                                                                           |
| `skip`                                                                                                                    | *Optional\<Long>*                                                                                                         | :heavy_minus_sign:                                                                                                        | N/A                                                                                                                       | 60                                                                                                                        |
| `count`                                                                                                                   | *Optional\<Long>*                                                                                                         | :heavy_minus_sign:                                                                                                        | N/A                                                                                                                       | 20                                                                                                                        |
| `states`                                                                                                                  | List\<[IssuedCardState](../../models/components/IssuedCardState.md)>                                                      | :heavy_minus_sign:                                                                                                        | Optional, comma-separated states to filter the Moov list issued cards response. For example `active,pending-verification` |                                                                                                                           |

### Response

**[ListIssuedCardsResponse](../../models/operations/ListIssuedCardsResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## get

Retrieve a single issued card associated with a Moov account.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/issued-cards.read` scope.

### Example Usage

```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.operations.GetIssuedCardResponse;
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

        GetIssuedCardResponse res = sdk.cardIssuing().get()
                .accountID("4fde8da4-b6c5-4379-82a2-4ff6a742e41a")
                .issuedCardID("d04885c9-ea6b-43a7-9186-63d9fbd57716")
                .call();

        if (res.issuedCard().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                | Type                                                     | Required                                                 | Description                                              |
| -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- |
| `accountID`                                              | *String*                                                 | :heavy_check_mark:                                       | The Moov business account for which the card was issued. |
| `issuedCardID`                                           | *String*                                                 | :heavy_check_mark:                                       | N/A                                                      |

### Response

**[GetIssuedCardResponse](../../models/operations/GetIssuedCardResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## update

Update a Moov issued card.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/issued-cards.write` scope.

### Example Usage

```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.*;
import io.moov.sdk.models.errors.GenericError;
import io.moov.sdk.models.errors.UpdateIssuedCardError;
import io.moov.sdk.models.operations.UpdateIssuedCardResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GenericError, UpdateIssuedCardError, Exception {

        Moov sdk = Moov.builder()
                .xMoovVersion("v2024.01.00")
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        UpdateIssuedCardResponse res = sdk.cardIssuing().update()
                .accountID("44db31bc-2813-424b-9b8c-2d3f5f1300e3")
                .issuedCardID("69ca2a7e-7bbc-4176-9d0c-2a1aa7143006")
                .updateIssuedCard(UpdateIssuedCard.builder()
                    .authorizedUser(CreateAuthorizedUserUpdate.builder()
                        .birthDate(BirthDateUpdate.builder()
                            .day(9L)
                            .month(11L)
                            .year(1989L)
                            .build())
                        .build())
                    .build())
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                       | Type                                                            | Required                                                        | Description                                                     |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `accountID`                                                     | *String*                                                        | :heavy_check_mark:                                              | The Moov business account for which the card was issued.        |
| `issuedCardID`                                                  | *String*                                                        | :heavy_check_mark:                                              | N/A                                                             |
| `updateIssuedCard`                                              | [UpdateIssuedCard](../../models/components/UpdateIssuedCard.md) | :heavy_check_mark:                                              | N/A                                                             |

### Response

**[UpdateIssuedCardResponse](../../models/operations/UpdateIssuedCardResponse.md)**

### Errors

| Error Type                          | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/GenericError          | 400, 409                            | application/json                    |
| models/errors/UpdateIssuedCardError | 422                                 | application/json                    |
| models/errors/APIException          | 4XX, 5XX                            | \*/\*                               |

## getFull

Get issued card with PAN, CVV, and expiration. 

Only use this endpoint if you have provided Moov with a copy of your PCI attestation of compliance.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/issued-cards.read-secure` scope.

### Example Usage

```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.operations.GetFullIssuedCardResponse;
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

        GetFullIssuedCardResponse res = sdk.cardIssuing().getFull()
                .accountID("512052fb-5e2c-4d24-98dd-fa893c9d8a03")
                .issuedCardID("087ecc51-11fe-4471-a3bb-44f20c1e87a9")
                .call();

        if (res.fullIssuedCard().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                | Type                                                     | Required                                                 | Description                                              |
| -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- |
| `accountID`                                              | *String*                                                 | :heavy_check_mark:                                       | The Moov business account for which the card was issued. |
| `issuedCardID`                                           | *String*                                                 | :heavy_check_mark:                                       | N/A                                                      |

### Response

**[GetFullIssuedCardResponse](../../models/operations/GetFullIssuedCardResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |