# CardIssuing
(*cardIssuing()*)

## Overview

### Available Operations

* [requestCard](#requestcard) - Request a virtual card be issued.

To use this endpoint from the browser, you'll need to specify the `/accounts/{accountID}/issued-cards.write` scope when generating 
a [token](https://docs.moov.io/api/authentication/access-tokens/).
* [listIssuedCards](#listissuedcards) - List Moov issued cards existing for the account.

To use this endpoint from the browser, you'll need to specify the `/accounts/{accountID}/issued-cards.read` scope when generating 
a [token](https://docs.moov.io/api/authentication/access-tokens/).
* [getIssuedCard](#getissuedcard) - Retrieve a single issued card associated with a Moov account.

To use this endpoint from the browser, you'll need to specify the `/accounts/{accountID}/issued-cards.read` scope when generating 
a [token](https://docs.moov.io/api/authentication/access-tokens/).
* [updateIssuedCard](#updateissuedcard) - Update a Moov issued card.

To use this endpoint from the browser, you'll need to specify the `/accounts/{accountID}/issued-cards.write` scope when generating 
a [token](https://docs.moov.io/api/authentication/access-tokens/).
* [getFullIssuedCard](#getfullissuedcard) - Get issued card with PAN, CVV, and expiration. 

Only use this endpoint if you have provided Moov with a copy of your PCI attestation of compliance.

To use this endpoint from the browser, you'll need to specify the `/accounts/{accountID}/issued-cards.read-secure` scope when generating 
a [token](https://docs.moov.io/api/authentication/access-tokens/).

## requestCard

Request a virtual card be issued.

To use this endpoint from the browser, you'll need to specify the `/accounts/{accountID}/issued-cards.write` scope when generating 
a [token](https://docs.moov.io/api/authentication/access-tokens/).

### Example Usage

```java
package hello.world;

import io.moov.openapi.Moov;
import io.moov.openapi.models.components.BirthDate;
import io.moov.openapi.models.components.CardExpiration;
import io.moov.openapi.models.components.CreateAuthorizedUser;
import io.moov.openapi.models.components.IssuedCardFormFactor;
import io.moov.openapi.models.components.IssuingControls;
import io.moov.openapi.models.components.IssuingIntervalLimit;
import io.moov.openapi.models.components.IssuingVelocityLimit;
import io.moov.openapi.models.components.RequestCard;
import io.moov.openapi.models.components.SchemeBasicAuth;
import io.moov.openapi.models.components.Versions;
import io.moov.openapi.models.errors.GenericError;
import io.moov.openapi.models.errors.RequestCardError;
import io.moov.openapi.models.operations.RequestCardResponse;
import io.moov.openapi.models.operations.RequestCardSecurity;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws GenericError, RequestCardError, Exception {

        Moov sdk = Moov.builder()
            .build();

        RequestCardResponse res = sdk.cardIssuing().requestCard()
                .security(RequestCardSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .xMoovVersion(Versions.LATEST)
                .accountID("9c0ff49b-9aaf-4815-b4a4-3e412558f6bc")
                .requestCard(RequestCard.builder()
                    .fundingWalletID("df7610a6-b14e-4eee-9a55-1890b6b3207c")
                    .authorizedUser(CreateAuthorizedUser.builder()
                        .firstName("Tanya")
                        .lastName("Flatley")
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
                                .build(),
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

| Parameter                                                                                               | Type                                                                                                    | Required                                                                                                | Description                                                                                             |
| ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- |
| `security`                                                                                              | [io.moov.openapi.models.operations.RequestCardSecurity](../../models/operations/RequestCardSecurity.md) | :heavy_check_mark:                                                                                      | The security requirements to use for the request.                                                       |
| `xMoovVersion`                                                                                          | [Optional\<Versions>](../../models/components/Versions.md)                                              | :heavy_minus_sign:                                                                                      | Specify an API version.                                                                                 |
| `accountID`                                                                                             | *String*                                                                                                | :heavy_check_mark:                                                                                      | The Moov business account for which the card is to be issued.                                           |
| `requestCard`                                                                                           | [RequestCard](../../models/components/RequestCard.md)                                                   | :heavy_check_mark:                                                                                      | N/A                                                                                                     |

### Response

**[RequestCardResponse](../../models/operations/RequestCardResponse.md)**

### Errors

| Error Type                     | Status Code                    | Content Type                   |
| ------------------------------ | ------------------------------ | ------------------------------ |
| models/errors/GenericError     | 400                            | application/json               |
| models/errors/RequestCardError | 422                            | application/json               |
| models/errors/APIException     | 4XX, 5XX                       | \*/\*                          |

## listIssuedCards

List Moov issued cards existing for the account.

To use this endpoint from the browser, you'll need to specify the `/accounts/{accountID}/issued-cards.read` scope when generating 
a [token](https://docs.moov.io/api/authentication/access-tokens/).

### Example Usage

```java
package hello.world;

import io.moov.openapi.Moov;
import io.moov.openapi.models.components.SchemeBasicAuth;
import io.moov.openapi.models.operations.ListIssuedCardsRequest;
import io.moov.openapi.models.operations.ListIssuedCardsResponse;
import io.moov.openapi.models.operations.ListIssuedCardsSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Moov sdk = Moov.builder()
            .build();

        ListIssuedCardsRequest req = ListIssuedCardsRequest.builder()
                .accountID("33bbd03b-931d-4e6d-b831-8698f4aee791")
                .skip(60L)
                .count(20L)
                .build();

        ListIssuedCardsResponse res = sdk.cardIssuing().listIssuedCards()
                .request(req)
                .security(ListIssuedCardsSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .call();

        if (res.issuedCards().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                       | Type                                                                                                            | Required                                                                                                        | Description                                                                                                     |
| --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                       | [ListIssuedCardsRequest](../../models/operations/ListIssuedCardsRequest.md)                                     | :heavy_check_mark:                                                                                              | The request object to use for the request.                                                                      |
| `security`                                                                                                      | [io.moov.openapi.models.operations.ListIssuedCardsSecurity](../../models/operations/ListIssuedCardsSecurity.md) | :heavy_check_mark:                                                                                              | The security requirements to use for the request.                                                               |

### Response

**[ListIssuedCardsResponse](../../models/operations/ListIssuedCardsResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## getIssuedCard

Retrieve a single issued card associated with a Moov account.

To use this endpoint from the browser, you'll need to specify the `/accounts/{accountID}/issued-cards.read` scope when generating 
a [token](https://docs.moov.io/api/authentication/access-tokens/).

### Example Usage

```java
package hello.world;

import io.moov.openapi.Moov;
import io.moov.openapi.models.components.SchemeBasicAuth;
import io.moov.openapi.models.components.Versions;
import io.moov.openapi.models.operations.GetIssuedCardResponse;
import io.moov.openapi.models.operations.GetIssuedCardSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Moov sdk = Moov.builder()
            .build();

        GetIssuedCardResponse res = sdk.cardIssuing().getIssuedCard()
                .security(GetIssuedCardSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .xMoovVersion(Versions.V202510)
                .accountID("c63d9bae-2097-4bfa-8ac7-e9e8dff6e9ae")
                .issuedCardID("aa0c86df-7f7d-4200-9ee4-24ba8870a7d4")
                .call();

        if (res.issuedCard().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                   | Type                                                                                                        | Required                                                                                                    | Description                                                                                                 |
| ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                  | [io.moov.openapi.models.operations.GetIssuedCardSecurity](../../models/operations/GetIssuedCardSecurity.md) | :heavy_check_mark:                                                                                          | The security requirements to use for the request.                                                           |
| `xMoovVersion`                                                                                              | [Optional\<Versions>](../../models/components/Versions.md)                                                  | :heavy_minus_sign:                                                                                          | Specify an API version.                                                                                     |
| `accountID`                                                                                                 | *String*                                                                                                    | :heavy_check_mark:                                                                                          | The Moov business account for which the card was issued.                                                    |
| `issuedCardID`                                                                                              | *String*                                                                                                    | :heavy_check_mark:                                                                                          | N/A                                                                                                         |

### Response

**[GetIssuedCardResponse](../../models/operations/GetIssuedCardResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## updateIssuedCard

Update a Moov issued card.

To use this endpoint from the browser, you'll need to specify the `/accounts/{accountID}/issued-cards.write` scope when generating 
a [token](https://docs.moov.io/api/authentication/access-tokens/).

### Example Usage

```java
package hello.world;

import io.moov.openapi.Moov;
import io.moov.openapi.models.components.BirthDateUpdate;
import io.moov.openapi.models.components.CreateAuthorizedUserUpdate;
import io.moov.openapi.models.components.SchemeBasicAuth;
import io.moov.openapi.models.components.UpdateIssuedCard;
import io.moov.openapi.models.components.Versions;
import io.moov.openapi.models.errors.GenericError;
import io.moov.openapi.models.errors.UpdateIssuedCardError;
import io.moov.openapi.models.operations.UpdateIssuedCardResponse;
import io.moov.openapi.models.operations.UpdateIssuedCardSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GenericError, UpdateIssuedCardError, Exception {

        Moov sdk = Moov.builder()
            .build();

        UpdateIssuedCardResponse res = sdk.cardIssuing().updateIssuedCard()
                .security(UpdateIssuedCardSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .xMoovVersion(Versions.LATEST)
                .accountID("fc445a8c-5b64-4ab9-ba30-5bdb0ffc02b0")
                .issuedCardID("064f9e03-fc5f-4a7d-83d2-2ec946f77ff2")
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

| Parameter                                                                                                         | Type                                                                                                              | Required                                                                                                          | Description                                                                                                       |
| ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                        | [io.moov.openapi.models.operations.UpdateIssuedCardSecurity](../../models/operations/UpdateIssuedCardSecurity.md) | :heavy_check_mark:                                                                                                | The security requirements to use for the request.                                                                 |
| `xMoovVersion`                                                                                                    | [Optional\<Versions>](../../models/components/Versions.md)                                                        | :heavy_minus_sign:                                                                                                | Specify an API version.                                                                                           |
| `accountID`                                                                                                       | *String*                                                                                                          | :heavy_check_mark:                                                                                                | The Moov business account for which the card was issued.                                                          |
| `issuedCardID`                                                                                                    | *String*                                                                                                          | :heavy_check_mark:                                                                                                | N/A                                                                                                               |
| `updateIssuedCard`                                                                                                | [UpdateIssuedCard](../../models/components/UpdateIssuedCard.md)                                                   | :heavy_check_mark:                                                                                                | N/A                                                                                                               |

### Response

**[UpdateIssuedCardResponse](../../models/operations/UpdateIssuedCardResponse.md)**

### Errors

| Error Type                          | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/GenericError          | 400, 409                            | application/json                    |
| models/errors/UpdateIssuedCardError | 422                                 | application/json                    |
| models/errors/APIException          | 4XX, 5XX                            | \*/\*                               |

## getFullIssuedCard

Get issued card with PAN, CVV, and expiration. 

Only use this endpoint if you have provided Moov with a copy of your PCI attestation of compliance.

To use this endpoint from the browser, you'll need to specify the `/accounts/{accountID}/issued-cards.read-secure` scope when generating 
a [token](https://docs.moov.io/api/authentication/access-tokens/).

### Example Usage

```java
package hello.world;

import io.moov.openapi.Moov;
import io.moov.openapi.models.components.SchemeBasicAuth;
import io.moov.openapi.models.components.Versions;
import io.moov.openapi.models.operations.GetFullIssuedCardResponse;
import io.moov.openapi.models.operations.GetFullIssuedCardSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Moov sdk = Moov.builder()
            .build();

        GetFullIssuedCardResponse res = sdk.cardIssuing().getFullIssuedCard()
                .security(GetFullIssuedCardSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .xMoovVersion(Versions.LATEST)
                .accountID("f03c4c3e-2685-44e6-8d4b-0d5bd082a301")
                .issuedCardID("1da6b593-679e-44ab-a9e4-6db6db4b8f46")
                .call();

        if (res.fullIssuedCard().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                           | Type                                                                                                                | Required                                                                                                            | Description                                                                                                         |
| ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                          | [io.moov.openapi.models.operations.GetFullIssuedCardSecurity](../../models/operations/GetFullIssuedCardSecurity.md) | :heavy_check_mark:                                                                                                  | The security requirements to use for the request.                                                                   |
| `xMoovVersion`                                                                                                      | [Optional\<Versions>](../../models/components/Versions.md)                                                          | :heavy_minus_sign:                                                                                                  | Specify an API version.                                                                                             |
| `accountID`                                                                                                         | *String*                                                                                                            | :heavy_check_mark:                                                                                                  | The Moov business account for which the card was issued.                                                            |
| `issuedCardID`                                                                                                      | *String*                                                                                                            | :heavy_check_mark:                                                                                                  | N/A                                                                                                                 |

### Response

**[GetFullIssuedCardResponse](../../models/operations/GetFullIssuedCardResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |