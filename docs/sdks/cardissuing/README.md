# CardIssuing

## Overview

### Available Operations

* [listMerchantCategories](#listmerchantcategories) - List the predefined merchant category groups available for issued card spend controls, along with
the merchant category codes (MCCs) each group covers. Use these category names in an issued card's
`merchantCategoryRestrictions`.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/),
you'll need to specify the `/issued-cards.read` scope.
* [createAuthorization](#createauthorization) - Create a simulated authorization for an issued card in test mode. See our [test mode](https://docs.moov.io/guides/get-started/test-mode)
guide for more information.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/issued-cards.write` scope.
* [createClearing](#createclearing) - Create a simulated clearing for an authorization on an issued card in test mode. See our [test mode](https://docs.moov.io/guides/get-started/test-mode)
guide for more information.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/issued-cards.write` scope.
* [createReversal](#createreversal) - Create a simulated reversal for an authorization on an issued card in test mode. See our [test mode](https://docs.moov.io/guides/get-started/test-mode)
guide for more information.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/issued-cards.write` scope.
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
you'll need to specify the `/accounts/{accountID}/issued-cards.read-private` scope.

## listMerchantCategories

List the predefined merchant category groups available for issued card spend controls, along with
the merchant category codes (MCCs) each group covers. Use these category names in an issued card's
`merchantCategoryRestrictions`.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/),
you'll need to specify the `/issued-cards.read` scope.

### Example Usage

<!-- UsageSnippet language="java" operationID="listIssuingMerchantCategories" method="get" path="/issuing/merchant-categories" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.operations.ListIssuingMerchantCategoriesResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Moov sdk = Moov.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        ListIssuingMerchantCategoriesResponse res = sdk.cardIssuing().listMerchantCategories()
                .call();

        if (res.merchantCategories().isPresent()) {
            System.out.println(res.merchantCategories().get());
        }
    }
}
```

### Response

**[ListIssuingMerchantCategoriesResponse](../../models/operations/ListIssuingMerchantCategoriesResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## createAuthorization

Create a simulated authorization for an issued card in test mode. See our [test mode](https://docs.moov.io/guides/get-started/test-mode)
guide for more information.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/issued-cards.write` scope.

### Example Usage

<!-- UsageSnippet language="java" operationID="createAuthorizationSimulation" method="post" path="/issuing/simulations/{accountID}/authorizations" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.*;
import io.moov.sdk.models.errors.AuthorizationSimulationValidationError;
import io.moov.sdk.models.errors.GenericError;
import io.moov.sdk.models.operations.CreateAuthorizationSimulationResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GenericError, AuthorizationSimulationValidationError, Exception {

        Moov sdk = Moov.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        CreateAuthorizationSimulationResponse res = sdk.cardIssuing().createAuthorization()
                .accountID("<id>")
                .createAuthorizationSimulation(CreateAuthorizationSimulation.builder()
                    .issuedCardID("<id>")
                    .amount("-14.89")
                    .merchantData(IssuingMerchantData.builder()
                        .networkID("<id>")
                        .country("US")
                        .mcc("7298")
                        .name("Whole Body Fitness")
                        .city("San Francisco")
                        .postalCode("94107")
                        .state("CA")
                        .build())
                    .build())
                .call();

        if (res.issuedCardAuthorization().isPresent()) {
            System.out.println(res.issuedCardAuthorization().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `accountID`                                                                               | *String*                                                                                  | :heavy_check_mark:                                                                        | The Moov business account for which the card was issued.                                  |
| `createAuthorizationSimulation`                                                           | [CreateAuthorizationSimulation](../../models/components/CreateAuthorizationSimulation.md) | :heavy_check_mark:                                                                        | N/A                                                                                       |

### Response

**[CreateAuthorizationSimulationResponse](../../models/operations/CreateAuthorizationSimulationResponse.md)**

### Errors

| Error Type                                           | Status Code                                          | Content Type                                         |
| ---------------------------------------------------- | ---------------------------------------------------- | ---------------------------------------------------- |
| models/errors/GenericError                           | 400, 409                                             | application/json                                     |
| models/errors/AuthorizationSimulationValidationError | 422                                                  | application/json                                     |
| models/errors/APIException                           | 4XX, 5XX                                             | \*/\*                                                |

## createClearing

Create a simulated clearing for an authorization on an issued card in test mode. See our [test mode](https://docs.moov.io/guides/get-started/test-mode)
guide for more information.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/issued-cards.write` scope.

### Example Usage

<!-- UsageSnippet language="java" operationID="createClearingSimulation" method="post" path="/issuing/simulations/{accountID}/authorizations/{authorizationID}/clearings" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.CreateClearingSimulation;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.errors.ClearingSimulationValidationError;
import io.moov.sdk.models.errors.GenericError;
import io.moov.sdk.models.operations.CreateClearingSimulationResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GenericError, ClearingSimulationValidationError, Exception {

        Moov sdk = Moov.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        CreateClearingSimulationResponse res = sdk.cardIssuing().createClearing()
                .accountID("<id>")
                .authorizationID("<id>")
                .createClearingSimulation(CreateClearingSimulation.builder()
                    .amount("-14.89")
                    .build())
                .call();

        if (res.issuedCardAuthorization().isPresent()) {
            System.out.println(res.issuedCardAuthorization().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `accountID`                                                                     | *String*                                                                        | :heavy_check_mark:                                                              | The Moov business account for which the card was issued.                        |
| `authorizationID`                                                               | *String*                                                                        | :heavy_check_mark:                                                              | The ID of the authorization to clear.                                           |
| `createClearingSimulation`                                                      | [CreateClearingSimulation](../../models/components/CreateClearingSimulation.md) | :heavy_check_mark:                                                              | N/A                                                                             |

### Response

**[CreateClearingSimulationResponse](../../models/operations/CreateClearingSimulationResponse.md)**

### Errors

| Error Type                                      | Status Code                                     | Content Type                                    |
| ----------------------------------------------- | ----------------------------------------------- | ----------------------------------------------- |
| models/errors/GenericError                      | 400, 409                                        | application/json                                |
| models/errors/ClearingSimulationValidationError | 422                                             | application/json                                |
| models/errors/APIException                      | 4XX, 5XX                                        | \*/\*                                           |

## createReversal

Create a simulated reversal for an authorization on an issued card in test mode. See our [test mode](https://docs.moov.io/guides/get-started/test-mode)
guide for more information.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/issued-cards.write` scope.

### Example Usage

<!-- UsageSnippet language="java" operationID="createReversalSimulation" method="post" path="/issuing/simulations/{accountID}/authorizations/{authorizationID}/reversals" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.errors.GenericError;
import io.moov.sdk.models.operations.CreateReversalSimulationResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GenericError, Exception {

        Moov sdk = Moov.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        CreateReversalSimulationResponse res = sdk.cardIssuing().createReversal()
                .accountID("<id>")
                .authorizationID("<id>")
                .call();

        if (res.issuedCardAuthorization().isPresent()) {
            System.out.println(res.issuedCardAuthorization().get());
        }
    }
}
```

### Parameters

| Parameter                                                | Type                                                     | Required                                                 | Description                                              |
| -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- |
| `accountID`                                              | *String*                                                 | :heavy_check_mark:                                       | The Moov business account for which the card was issued. |
| `authorizationID`                                        | *String*                                                 | :heavy_check_mark:                                       | The ID of the authorization to reverse.                  |

### Response

**[CreateReversalSimulationResponse](../../models/operations/CreateReversalSimulationResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/GenericError | 400, 409                   | application/json           |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## request

Request a virtual card be issued.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/issued-cards.write` scope.

### Example Usage

<!-- UsageSnippet language="java" operationID="requestCard" method="post" path="/issuing/{accountID}/cards" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.*;
import io.moov.sdk.models.errors.GenericError;
import io.moov.sdk.models.errors.RequestCardError;
import io.moov.sdk.models.operations.RequestCardResponse;
import java.lang.Exception;
import java.util.List;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws GenericError, RequestCardError, Exception {

        Moov sdk = Moov.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        RequestCardResponse res = sdk.cardIssuing().request()
                .accountID("d9ac71ae-fccb-4dfc-9fed-710ca654e3ed")
                .requestCard(RequestCard.builder()
                    .metadata(Map.ofEntries(
                        Map.entry("optional", "metadata")))
                    .billingAddress(Address.builder()
                        .addressLine1("123 Main Street")
                        .city("Boulder")
                        .stateOrProvince("CO")
                        .postalCode("80301")
                        .country("US")
                        .addressLine2("Apt 302")
                        .build())
                    .expiration(CardExpiration.builder()
                        .month("01")
                        .year("21")
                        .build())
                    .controls(IssuingControls.builder()
                        .velocityLimits(List.of(
                            IssuingVelocityLimit.builder()
                                .interval(IssuingIntervalLimit.PER_TRANSACTION)
                                .amount(10000L)
                                .build()))
                        .build())
                    .build())
                .call();

        if (res.issuedCard().isPresent()) {
            System.out.println(res.issuedCard().get());
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

<!-- UsageSnippet language="java" operationID="listIssuedCards" method="get" path="/issuing/{accountID}/cards" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.operations.ListIssuedCardsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Moov sdk = Moov.builder()
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
            System.out.println(res.issuedCards().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                   | Type                                                                                                        | Required                                                                                                    | Description                                                                                                 | Example                                                                                                     |
| ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| `accountID`                                                                                                 | *String*                                                                                                    | :heavy_check_mark:                                                                                          | The Moov business account for which the cards have been issued.                                             |                                                                                                             |
| `skip`                                                                                                      | *Optional\<Long>*                                                                                           | :heavy_minus_sign:                                                                                          | N/A                                                                                                         | 60                                                                                                          |
| `count`                                                                                                     | *Optional\<Long>*                                                                                           | :heavy_minus_sign:                                                                                          | Page size. When omitted, the server defaults to `200`.                                                      | 20                                                                                                          |
| `states`                                                                                                    | List\<[IssuedCardState](../../models/components/IssuedCardState.md)>                                        | :heavy_minus_sign:                                                                                          | Optional, comma-separated states to filter the Moov list issued cards response. For example `active,closed` |                                                                                                             |

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

<!-- UsageSnippet language="java" operationID="getIssuedCard" method="get" path="/issuing/{accountID}/cards/{issuedCardID}" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.operations.GetIssuedCardResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Moov sdk = Moov.builder()
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
            System.out.println(res.issuedCard().get());
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

<!-- UsageSnippet language="java" operationID="updateIssuedCard" method="patch" path="/issuing/{accountID}/cards/{issuedCardID}" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.*;
import io.moov.sdk.models.errors.GenericError;
import io.moov.sdk.models.errors.UpdateIssuedCardError;
import io.moov.sdk.models.operations.UpdateIssuedCardResponse;
import java.lang.Exception;
import java.util.List;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws GenericError, UpdateIssuedCardError, Exception {

        Moov sdk = Moov.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        UpdateIssuedCardResponse res = sdk.cardIssuing().update()
                .accountID("44db31bc-2813-424b-9b8c-2d3f5f1300e3")
                .issuedCardID("69ca2a7e-7bbc-4176-9d0c-2a1aa7143006")
                .updateIssuedCard(UpdateIssuedCard.builder()
                    .metadata(Map.ofEntries(
                        Map.entry("optional", "metadata")))
                    .billingAddress(BillingAddress.builder()
                        .addressLine1("123 Main Street")
                        .addressLine2("Apt 302")
                        .city("Boulder")
                        .stateOrProvince("CO")
                        .postalCode("80301")
                        .country("US")
                        .build())
                    .controls(UpdateIssuingControls.builder()
                        .velocityLimits(List.of(
                            IssuingVelocityLimit.builder()
                                .interval(IssuingIntervalLimit.DAILY)
                                .amount(10000L)
                                .build()))
                        .build())
                    .build())
                .call();

        if (res.issuedCard().isPresent()) {
            System.out.println(res.issuedCard().get());
        }
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
you'll need to specify the `/accounts/{accountID}/issued-cards.read-private` scope.

### Example Usage

<!-- UsageSnippet language="java" operationID="getFullIssuedCard" method="get" path="/issuing/{accountID}/cards/{issuedCardID}/details" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.operations.GetFullIssuedCardResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Moov sdk = Moov.builder()
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
            System.out.println(res.fullIssuedCard().get());
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