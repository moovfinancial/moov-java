# Cards

## Overview

### Available Operations

* [link](#link) - Link a card to an existing Moov account. 

Read our [accept card payments guide](https://docs.moov.io/guides/sources/cards/accept-card-payments/#link-a-card) to learn more.

Only use this endpoint if you have provided Moov with a copy of your PCI attestation of compliance. 

During card linking, the provided data will be verified by submitting a $0 authorization (account verification) request. 
If `merchantAccountID` is provided, the authorization request will contain that account's statement descriptor and address. 
Otherwise, the platform account's profile will be used. If no statement descriptor has been set, the authorization will 
use the account's name instead.

It is strongly recommended that callers include the `X-Wait-For` header, set to `payment-method`, if the newly linked 
card is intended to be used right away. If this header is not included, the caller will need to poll the [List Payment 
Methods](https://docs.moov.io/api/sources/payment-methods/list/)
endpoint to wait for the new payment methods to be available for use.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/cards.write` scope.
* [list](#list) - List all the active cards associated with a Moov account. 

Read our [accept card payments guide](https://docs.moov.io/guides/sources/cards/accept-card-payments/) to learn more.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/cards.read` scope.
* [get](#get) - Fetch a specific card associated with a Moov account. 

Read our [accept card payments guide](https://docs.moov.io/guides/sources/cards/accept-card-payments/) to learn more.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/cards.read` scope.
* [update](#update) - Update a linked card and/or resubmit it for verification.

If a value is provided for CVV, a new verification ($0 authorization) will be submitted for the card. Updating the expiration
date or
address will update the information stored on file for the card but will not be verified.

Read our [accept card payments guide](https://docs.moov.io/guides/sources/cards/accept-card-payments/#reverify-a-card) to learn
more.

Only use this endpoint if you have provided Moov with a copy of your PCI attestation of compliance.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/)
you'll need to specify the `/accounts/{accountID}/cards.write` scope.
* [disable](#disable) - Disables a card associated with a Moov account.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/cards.write` scope.

## link

Link a card to an existing Moov account. 

Read our [accept card payments guide](https://docs.moov.io/guides/sources/cards/accept-card-payments/#link-a-card) to learn more.

Only use this endpoint if you have provided Moov with a copy of your PCI attestation of compliance. 

During card linking, the provided data will be verified by submitting a $0 authorization (account verification) request. 
If `merchantAccountID` is provided, the authorization request will contain that account's statement descriptor and address. 
Otherwise, the platform account's profile will be used. If no statement descriptor has been set, the authorization will 
use the account's name instead.

It is strongly recommended that callers include the `X-Wait-For` header, set to `payment-method`, if the newly linked 
card is intended to be used right away. If this header is not included, the caller will need to poll the [List Payment 
Methods](https://docs.moov.io/api/sources/payment-methods/list/)
endpoint to wait for the new payment methods to be available for use.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/cards.write` scope.

### Example Usage

<!-- UsageSnippet language="java" operationID="linkCard" method="post" path="/accounts/{accountID}/cards" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.*;
import io.moov.sdk.models.errors.*;
import io.moov.sdk.models.operations.LinkCardResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GenericError, DuplicateCardError, LinkCardError, Exception {

        Moov sdk = Moov.builder()
                .xMoovVersion("v2024.01.00")
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        LinkCardResponse res = sdk.cards().link()
                .xWaitFor(LinkCardWaitFor.PAYMENT_METHOD)
                .accountID("5593e46f-7936-474b-a52b-96f1da46867b")
                .linkCard(LinkCard.builder()
                    .cardNumber("4111111111111111")
                    .cardCvv("123")
                    .expiration(CardExpiration.builder()
                        .month("01")
                        .year("21")
                        .build())
                    .billingAddress(CardAddress.builder()
                        .postalCode("80301")
                        .build())
                    .holderName("Jules Jackson")
                    .build())
                .call();

        if (res.card().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                                                                                                                                                                                    | Type                                                                                                                                                                                                                                                                                                                                                                         | Required                                                                                                                                                                                                                                                                                                                                                                     | Description                                                                                                                                                                                                                                                                                                                                                                  | Example                                                                                                                                                                                                                                                                                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `xWaitFor`                                                                                                                                                                                                                                                                                                                                                                   | [Optional\<LinkCardWaitFor>](../../models/components/LinkCardWaitFor.md)                                                                                                                                                                                                                                                                                                     | :heavy_minus_sign:                                                                                                                                                                                                                                                                                                                                                           | Optional header to wait for certain events, such as the creation of a payment method, to occur before returning a response.<br/><br/>When this header is set to `payment-method`, the response will include any payment methods that were created for the newly <br/>linked card in the `paymentMethods` field. Otherwise, the `paymentMethods` field will be omitted from the response. | payment-method                                                                                                                                                                                                                                                                                                                                                               |
| `accountID`                                                                                                                                                                                                                                                                                                                                                                  | *String*                                                                                                                                                                                                                                                                                                                                                                     | :heavy_check_mark:                                                                                                                                                                                                                                                                                                                                                           | N/A                                                                                                                                                                                                                                                                                                                                                                          |                                                                                                                                                                                                                                                                                                                                                                              |
| `linkCard`                                                                                                                                                                                                                                                                                                                                                                   | [LinkCard](../../models/components/LinkCard.md)                                                                                                                                                                                                                                                                                                                              | :heavy_check_mark:                                                                                                                                                                                                                                                                                                                                                           | N/A                                                                                                                                                                                                                                                                                                                                                                          | {<br/>"cardNumber": "4111111111111111",<br/>"cardCvv": "123",<br/>"expiration": {<br/>"month": "01",<br/>"year": "21"<br/>},<br/>"holderName": "Jules Jackson",<br/>"billingAddress": {<br/>"postalCode": "80301"<br/>}<br/>}                                                                                                                                                |

### Response

**[LinkCardResponse](../../models/operations/LinkCardResponse.md)**

### Errors

| Error Type                       | Status Code                      | Content Type                     |
| -------------------------------- | -------------------------------- | -------------------------------- |
| models/errors/GenericError       | 400                              | application/json                 |
| models/errors/DuplicateCardError | 409                              | application/json                 |
| models/errors/LinkCardError      | 422                              | application/json                 |
| models/errors/APIException       | 4XX, 5XX                         | \*/\*                            |

## list

List all the active cards associated with a Moov account. 

Read our [accept card payments guide](https://docs.moov.io/guides/sources/cards/accept-card-payments/) to learn more.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/cards.read` scope.

### Example Usage

<!-- UsageSnippet language="java" operationID="listCards" method="get" path="/accounts/{accountID}/cards" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.operations.ListCardsResponse;
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

        ListCardsResponse res = sdk.cards().list()
                .accountID("b902712f-8ab9-47ba-b39f-5ccfbcac528c")
                .call();

        if (res.cards().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `accountID`        | *String*           | :heavy_check_mark: | N/A                |

### Response

**[ListCardsResponse](../../models/operations/ListCardsResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## get

Fetch a specific card associated with a Moov account. 

Read our [accept card payments guide](https://docs.moov.io/guides/sources/cards/accept-card-payments/) to learn more.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/cards.read` scope.

### Example Usage

<!-- UsageSnippet language="java" operationID="getCard" method="get" path="/accounts/{accountID}/cards/{cardID}" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.operations.GetCardResponse;
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

        GetCardResponse res = sdk.cards().get()
                .accountID("1f590cf9-4db9-4241-8818-30f9c26362e8")
                .cardID("01234567-89ab-cdef-0123-456789abcdef")
                .call();

        if (res.card().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                            | Type                                 | Required                             | Description                          | Example                              |
| ------------------------------------ | ------------------------------------ | ------------------------------------ | ------------------------------------ | ------------------------------------ |
| `accountID`                          | *String*                             | :heavy_check_mark:                   | N/A                                  |                                      |
| `cardID`                             | *String*                             | :heavy_check_mark:                   | N/A                                  | 01234567-89ab-cdef-0123-456789abcdef |

### Response

**[GetCardResponse](../../models/operations/GetCardResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## update

Update a linked card and/or resubmit it for verification.

If a value is provided for CVV, a new verification ($0 authorization) will be submitted for the card. Updating the expiration
date or
address will update the information stored on file for the card but will not be verified.

Read our [accept card payments guide](https://docs.moov.io/guides/sources/cards/accept-card-payments/#reverify-a-card) to learn
more.

Only use this endpoint if you have provided Moov with a copy of your PCI attestation of compliance.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/)
you'll need to specify the `/accounts/{accountID}/cards.write` scope.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateCard" method="patch" path="/accounts/{accountID}/cards/{cardID}" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.components.UpdateCard;
import io.moov.sdk.models.errors.GenericError;
import io.moov.sdk.models.errors.UpdateCardError;
import io.moov.sdk.models.operations.UpdateCardResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GenericError, UpdateCardError, Exception {

        Moov sdk = Moov.builder()
                .xMoovVersion("v2024.01.00")
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        UpdateCardResponse res = sdk.cards().update()
                .accountID("7104688e-8434-482e-9556-4784be3ad3fe")
                .cardID("01234567-89ab-cdef-0123-456789abcdef")
                .updateCard(UpdateCard.builder()
                    .cardCvv("456")
                    .build())
                .call();

        if (res.card().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                           | Type                                                | Required                                            | Description                                         | Example                                             |
| --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- |
| `accountID`                                         | *String*                                            | :heavy_check_mark:                                  | N/A                                                 |                                                     |
| `cardID`                                            | *String*                                            | :heavy_check_mark:                                  | N/A                                                 | 01234567-89ab-cdef-0123-456789abcdef                |
| `updateCard`                                        | [UpdateCard](../../models/components/UpdateCard.md) | :heavy_check_mark:                                  | N/A                                                 | {<br/>"cardCvv": "456"<br/>}                        |

### Response

**[UpdateCardResponse](../../models/operations/UpdateCardResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/GenericError    | 400, 409                      | application/json              |
| models/errors/UpdateCardError | 422                           | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |

## disable

Disables a card associated with a Moov account.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/cards.write` scope.

### Example Usage

<!-- UsageSnippet language="java" operationID="disableCard" method="delete" path="/accounts/{accountID}/cards/{cardID}" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.errors.GenericError;
import io.moov.sdk.models.operations.DisableCardResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GenericError, Exception {

        Moov sdk = Moov.builder()
                .xMoovVersion("v2024.01.00")
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        DisableCardResponse res = sdk.cards().disable()
                .accountID("bbd12cb2-58f4-46e5-861d-1e6c4617c0c2")
                .cardID("01234567-89ab-cdef-0123-456789abcdef")
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                            | Type                                 | Required                             | Description                          | Example                              |
| ------------------------------------ | ------------------------------------ | ------------------------------------ | ------------------------------------ | ------------------------------------ |
| `accountID`                          | *String*                             | :heavy_check_mark:                   | N/A                                  |                                      |
| `cardID`                             | *String*                             | :heavy_check_mark:                   | N/A                                  | 01234567-89ab-cdef-0123-456789abcdef |

### Response

**[DisableCardResponse](../../models/operations/DisableCardResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/GenericError | 400, 409                   | application/json           |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |