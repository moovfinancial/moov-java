# Cards
(*cards()*)

## Overview

### Available Operations

* [registerApplePayMerchantDomains](#registerapplepaymerchantdomains) - Add domains to be registered with Apple Pay.

Any domains that will be used to accept payments must first be [verified](https://docs.moov.io/guides/sources/cards/apple-pay/#register-your-domains) 
with Apple.

To use this endpoint from the browser, you'll need to specify the `/accounts/{accountID}/apple-pay.write` scope when generating a 
[token](https://docs.moov.io/api/authentication/access-tokens/).
* [updateApplePayMerchantDomains](#updateapplepaymerchantdomains) -   Add or remove domains to be registered with Apple Pay. 

  Any domains that will be used to accept payments must first be [verified](https://docs.moov.io/guides/sources/cards/apple-pay/#register-your-domains) 
  with Apple.
  
  To use this endpoint from the browser, you'll need to specify the `/accounts/{accountID}/apple-pay.write` scope when generating a 
  [token](https://docs.moov.io/api/authentication/access-tokens/).
* [getApplePayMerchantDomains](#getapplepaymerchantdomains) -   Get domains registered with Apple Pay. 
  
  Read our [Apple Pay tutorial](https://docs.moov.io/guides/sources/cards/apple-pay/#register-your-domains) to learn more. 
  
  To use this endpoint from the browser, you'll need to specify the `/accounts/{accountID}/apple-pay.read` scope when generating a 
  [token](https://docs.moov.io/api/authentication/access-tokens/).
* [createApplePaySession](#createapplepaysession) - Create a session with Apple Pay to facilitate a payment. 

Read our [Apple Pay tutorial](https://docs.moov.io/guides/sources/cards/apple-pay/#register-your-domains) to learn more. 
A successful response from this endpoint should be passed through to Apple Pay unchanged. 

To use this endpoint from the browser, you'll need to specify the `/accounts/{accountID}/apple-pay.write` scope when generating 
a [token](https://docs.moov.io/api/authentication/access-tokens/).
* [linkApplePayToken](#linkapplepaytoken) - Connect an Apple Pay token to the specified account. 

Read our [Apple Pay tutorial](https://docs.moov.io/guides/sources/cards/apple-pay/#register-your-domains) to learn more. 
The `token` data is defined by Apple Pay and should be passed through from Apple Pay's response unmodified.

To use this endpoint from the browser, you'll need to specify the `/accounts/{accountID}/cards.write` scope when generating 
a [token](https://docs.moov.io/api/authentication/access-tokens/).
* [linkCard](#linkcard) - Link a card to an existing Moov account. 

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

To use this endpoint from the browser, you'll need to specify the `/accounts/{accountID}/cards.write` scope
when generating a [token](https://docs.moov.io/api/authentication/access-tokens/).
* [listCards](#listcards) - List all the active cards associated with a Moov account. 

Read our [accept card payments guide](https://docs.moov.io/guides/sources/cards/accept-card-payments/) to learn more.

To use this endpoint from the browser, you'll need to specify the `/accounts/{accountID}/cards.read` scope when generating 
a [token](https://docs.moov.io/api/authentication/access-tokens/).
* [getCard](#getcard) - Fetch a specific card associated with a Moov account. 

Read our [accept card payments guide](https://docs.moov.io/guides/sources/cards/accept-card-payments/) to learn more.

To use this endpoint from the browser, you'll need to specify the `/accounts/{accountID}/cards.read` scope when generating 
a [token](https://docs.moov.io/api/authentication/access-tokens/).
* [updateCard](#updatecard) - Update a linked card and/or resubmit it for verification. 

If a value is provided for CVV, a new verification ($0 authorization) will be submitted for the card. Updating the expiration 
date or 
address will update the information stored on file for the card but will not be verified.

Read our [accept card payments guide](https://docs.moov.io/guides/sources/cards/accept-card-payments/#reverify-a-card) to learn 
more.

Only use this endpoint if you have provided Moov with a copy of your PCI attestation of compliance. 

To use this endpoint from the browser, you'll need to specify the `/accounts/{accountID}/cards.write` scope when generating 
a [token](https://docs.moov.io/api/authentication/access-tokens/).
* [disableCard](#disablecard) - Disables a card associated with a Moov account.

To use this endpoint from the browser, you'll need to specify the `/accounts/{accountID}/cards.write` scope when generating 
a [token](https://docs.moov.io/api/authentication/access-tokens/).

## registerApplePayMerchantDomains

Add domains to be registered with Apple Pay.

Any domains that will be used to accept payments must first be [verified](https://docs.moov.io/guides/sources/cards/apple-pay/#register-your-domains) 
with Apple.

To use this endpoint from the browser, you'll need to specify the `/accounts/{accountID}/apple-pay.write` scope when generating a 
[token](https://docs.moov.io/api/authentication/access-tokens/).

### Example Usage

```java
package hello.world;

import io.moov.openapi.Moov;
import io.moov.openapi.models.components.RegisterApplePayMerchantDomains;
import io.moov.openapi.models.components.SchemeBasicAuth;
import io.moov.openapi.models.components.Versions;
import io.moov.openapi.models.errors.GenericError;
import io.moov.openapi.models.operations.RegisterApplePayMerchantDomainsResponse;
import io.moov.openapi.models.operations.RegisterApplePayMerchantDomainsSecurity;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws GenericError, Exception {

        Moov sdk = Moov.builder()
            .build();

        RegisterApplePayMerchantDomainsResponse res = sdk.cards().registerApplePayMerchantDomains()
                .security(RegisterApplePayMerchantDomainsSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .xMoovVersion(Versions.V202401)
                .accountID("133fed79-519d-4b63-99ec-26b95076a45b")
                .registerApplePayMerchantDomains(RegisterApplePayMerchantDomains.builder()
                    .domains(List.of(
                        "checkout.classbooker.dev"))
                    .build())
                .call();

        if (res.applePayMerchantDomains().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                       | Type                                                                                                                                            | Required                                                                                                                                        | Description                                                                                                                                     |
| ----------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                                                      | [io.moov.openapi.models.operations.RegisterApplePayMerchantDomainsSecurity](../../models/operations/RegisterApplePayMerchantDomainsSecurity.md) | :heavy_check_mark:                                                                                                                              | The security requirements to use for the request.                                                                                               |
| `xMoovVersion`                                                                                                                                  | [Optional\<Versions>](../../models/components/Versions.md)                                                                                      | :heavy_minus_sign:                                                                                                                              | Specify an API version.                                                                                                                         |
| `accountID`                                                                                                                                     | *String*                                                                                                                                        | :heavy_check_mark:                                                                                                                              | ID of the Moov account representing the merchant.                                                                                               |
| `registerApplePayMerchantDomains`                                                                                                               | [RegisterApplePayMerchantDomains](../../models/components/RegisterApplePayMerchantDomains.md)                                                   | :heavy_check_mark:                                                                                                                              | N/A                                                                                                                                             |

### Response

**[RegisterApplePayMerchantDomainsResponse](../../models/operations/RegisterApplePayMerchantDomainsResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/GenericError | 400                        | application/json           |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## updateApplePayMerchantDomains

  Add or remove domains to be registered with Apple Pay. 

  Any domains that will be used to accept payments must first be [verified](https://docs.moov.io/guides/sources/cards/apple-pay/#register-your-domains) 
  with Apple.
  
  To use this endpoint from the browser, you'll need to specify the `/accounts/{accountID}/apple-pay.write` scope when generating a 
  [token](https://docs.moov.io/api/authentication/access-tokens/).

### Example Usage

```java
package hello.world;

import io.moov.openapi.Moov;
import io.moov.openapi.models.components.SchemeBasicAuth;
import io.moov.openapi.models.components.UpdateApplePayMerchantDomains;
import io.moov.openapi.models.components.Versions;
import io.moov.openapi.models.errors.GenericError;
import io.moov.openapi.models.operations.UpdateApplePayMerchantDomainsResponse;
import io.moov.openapi.models.operations.UpdateApplePayMerchantDomainsSecurity;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws GenericError, Exception {

        Moov sdk = Moov.builder()
            .build();

        UpdateApplePayMerchantDomainsResponse res = sdk.cards().updateApplePayMerchantDomains()
                .security(UpdateApplePayMerchantDomainsSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .xMoovVersion(Versions.V202510)
                .accountID("b7d68fce-1dbc-4562-93aa-d9ad030c78e6")
                .updateApplePayMerchantDomains(UpdateApplePayMerchantDomains.builder()
                    .addDomains(List.of(
                        "pay.classbooker.dev"))
                    .removeDomains(List.of(
                        "checkout.classbooker.dev"))
                    .build())
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                                                   | Type                                                                                                                                        | Required                                                                                                                                    | Description                                                                                                                                 |
| ------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                                                  | [io.moov.openapi.models.operations.UpdateApplePayMerchantDomainsSecurity](../../models/operations/UpdateApplePayMerchantDomainsSecurity.md) | :heavy_check_mark:                                                                                                                          | The security requirements to use for the request.                                                                                           |
| `xMoovVersion`                                                                                                                              | [Optional\<Versions>](../../models/components/Versions.md)                                                                                  | :heavy_minus_sign:                                                                                                                          | Specify an API version.                                                                                                                     |
| `accountID`                                                                                                                                 | *String*                                                                                                                                    | :heavy_check_mark:                                                                                                                          | ID of the Moov account representing the merchant.                                                                                           |
| `updateApplePayMerchantDomains`                                                                                                             | [UpdateApplePayMerchantDomains](../../models/components/UpdateApplePayMerchantDomains.md)                                                   | :heavy_check_mark:                                                                                                                          | N/A                                                                                                                                         |

### Response

**[UpdateApplePayMerchantDomainsResponse](../../models/operations/UpdateApplePayMerchantDomainsResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/GenericError | 400                        | application/json           |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## getApplePayMerchantDomains

  Get domains registered with Apple Pay. 
  
  Read our [Apple Pay tutorial](https://docs.moov.io/guides/sources/cards/apple-pay/#register-your-domains) to learn more. 
  
  To use this endpoint from the browser, you'll need to specify the `/accounts/{accountID}/apple-pay.read` scope when generating a 
  [token](https://docs.moov.io/api/authentication/access-tokens/).

### Example Usage

```java
package hello.world;

import io.moov.openapi.Moov;
import io.moov.openapi.models.components.SchemeBasicAuth;
import io.moov.openapi.models.components.Versions;
import io.moov.openapi.models.operations.GetApplePayMerchantDomainsResponse;
import io.moov.openapi.models.operations.GetApplePayMerchantDomainsSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Moov sdk = Moov.builder()
            .build();

        GetApplePayMerchantDomainsResponse res = sdk.cards().getApplePayMerchantDomains()
                .security(GetApplePayMerchantDomainsSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .xMoovVersion(Versions.V202510)
                .accountID("cd0931b0-e02f-47b3-87fc-0789a05479e9")
                .call();

        if (res.applePayMerchantDomains().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                             | Type                                                                                                                                  | Required                                                                                                                              | Description                                                                                                                           |
| ------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                                            | [io.moov.openapi.models.operations.GetApplePayMerchantDomainsSecurity](../../models/operations/GetApplePayMerchantDomainsSecurity.md) | :heavy_check_mark:                                                                                                                    | The security requirements to use for the request.                                                                                     |
| `xMoovVersion`                                                                                                                        | [Optional\<Versions>](../../models/components/Versions.md)                                                                            | :heavy_minus_sign:                                                                                                                    | Specify an API version.                                                                                                               |
| `accountID`                                                                                                                           | *String*                                                                                                                              | :heavy_check_mark:                                                                                                                    | ID of the Moov account representing the merchant.                                                                                     |

### Response

**[GetApplePayMerchantDomainsResponse](../../models/operations/GetApplePayMerchantDomainsResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## createApplePaySession

Create a session with Apple Pay to facilitate a payment. 

Read our [Apple Pay tutorial](https://docs.moov.io/guides/sources/cards/apple-pay/#register-your-domains) to learn more. 
A successful response from this endpoint should be passed through to Apple Pay unchanged. 

To use this endpoint from the browser, you'll need to specify the `/accounts/{accountID}/apple-pay.write` scope when generating 
a [token](https://docs.moov.io/api/authentication/access-tokens/).

### Example Usage

```java
package hello.world;

import io.moov.openapi.Moov;
import io.moov.openapi.models.components.CreateApplePaySession;
import io.moov.openapi.models.components.SchemeBasicAuth;
import io.moov.openapi.models.components.Versions;
import io.moov.openapi.models.errors.GenericError;
import io.moov.openapi.models.operations.CreateApplePaySessionResponse;
import io.moov.openapi.models.operations.CreateApplePaySessionSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GenericError, Exception {

        Moov sdk = Moov.builder()
            .build();

        CreateApplePaySessionResponse res = sdk.cards().createApplePaySession()
                .security(CreateApplePaySessionSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .xMoovVersion(Versions.V202507)
                .accountID("1d911f27-36e5-4497-8e9e-c3ecff1a8ae0")
                .createApplePaySession(CreateApplePaySession.builder()
                    .domain("checkout.classbooker.dev")
                    .displayName("Lillie.Abbott74")
                    .build())
                .call();

        if (res.applePaySession().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                   | Type                                                                                                                        | Required                                                                                                                    | Description                                                                                                                 |
| --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                                  | [io.moov.openapi.models.operations.CreateApplePaySessionSecurity](../../models/operations/CreateApplePaySessionSecurity.md) | :heavy_check_mark:                                                                                                          | The security requirements to use for the request.                                                                           |
| `xMoovVersion`                                                                                                              | [Optional\<Versions>](../../models/components/Versions.md)                                                                  | :heavy_minus_sign:                                                                                                          | Specify an API version.                                                                                                     |
| `accountID`                                                                                                                 | *String*                                                                                                                    | :heavy_check_mark:                                                                                                          | ID of the Moov account representing the merchant.                                                                           |
| `createApplePaySession`                                                                                                     | [CreateApplePaySession](../../models/components/CreateApplePaySession.md)                                                   | :heavy_check_mark:                                                                                                          | N/A                                                                                                                         |

### Response

**[CreateApplePaySessionResponse](../../models/operations/CreateApplePaySessionResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/GenericError | 400, 409, 422              | application/json           |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## linkApplePayToken

Connect an Apple Pay token to the specified account. 

Read our [Apple Pay tutorial](https://docs.moov.io/guides/sources/cards/apple-pay/#register-your-domains) to learn more. 
The `token` data is defined by Apple Pay and should be passed through from Apple Pay's response unmodified.

To use this endpoint from the browser, you'll need to specify the `/accounts/{accountID}/cards.write` scope when generating 
a [token](https://docs.moov.io/api/authentication/access-tokens/).

### Example Usage

```java
package hello.world;

import io.moov.openapi.Moov;
import io.moov.openapi.models.components.AppleBillingContact;
import io.moov.openapi.models.components.ApplePayHeader;
import io.moov.openapi.models.components.LinkApplePay;
import io.moov.openapi.models.components.LinkApplePayToken;
import io.moov.openapi.models.components.LinkApplePaymentData;
import io.moov.openapi.models.components.LinkApplePaymentMethod;
import io.moov.openapi.models.components.SchemeBasicAuth;
import io.moov.openapi.models.components.Versions;
import io.moov.openapi.models.errors.GenericError;
import io.moov.openapi.models.errors.LinkApplePayError;
import io.moov.openapi.models.operations.LinkApplePayTokenResponse;
import io.moov.openapi.models.operations.LinkApplePayTokenSecurity;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws GenericError, LinkApplePayError, Exception {

        Moov sdk = Moov.builder()
            .build();

        LinkApplePayTokenResponse res = sdk.cards().linkApplePayToken()
                .security(LinkApplePayTokenSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .xMoovVersion(Versions.LATEST)
                .accountID("f4d3b593-6370-42f3-acf5-eab4393e2a01")
                .linkApplePay(LinkApplePay.builder()
                    .token(LinkApplePayToken.builder()
                        .paymentData(LinkApplePaymentData.builder()
                            .version("EC_v1")
                            .data("3+f4oOTwPa6f1UZ6tG...CE=")
                            .signature("MIAGCSqGSIb3DQ.AAAA==")
                            .header(ApplePayHeader.builder()
                                .publicKeyHash("l0CnXdMv...D1I=")
                                .transactionId("32b...4f3")
                                .ephemeralPublicKey("MFkwEK...Md==")
                                .build())
                            .build())
                        .paymentMethod(LinkApplePaymentMethod.builder()
                            .displayName("Visa 1234")
                            .network("Visa")
                            .type("debit")
                            .build())
                        .transactionIdentifier("32b...4f3")
                        .build())
                    .billingContact(AppleBillingContact.builder()
                        .addressLines(List.of(
                            "123 Sesame Street"))
                        .locality("Phoenix")
                        .postalCode("30345")
                        .administrativeArea("AZ")
                        .countryCode("US")
                        .build())
                    .build())
                .call();

        if (res.linkedApplePayPaymentMethod().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                           | Type                                                                                                                | Required                                                                                                            | Description                                                                                                         |
| ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                          | [io.moov.openapi.models.operations.LinkApplePayTokenSecurity](../../models/operations/LinkApplePayTokenSecurity.md) | :heavy_check_mark:                                                                                                  | The security requirements to use for the request.                                                                   |
| `xMoovVersion`                                                                                                      | [Optional\<Versions>](../../models/components/Versions.md)                                                          | :heavy_minus_sign:                                                                                                  | Specify an API version.                                                                                             |
| `accountID`                                                                                                         | *String*                                                                                                            | :heavy_check_mark:                                                                                                  | ID of the Moov account representing the cardholder.                                                                 |
| `linkApplePay`                                                                                                      | [LinkApplePay](../../models/components/LinkApplePay.md)                                                             | :heavy_check_mark:                                                                                                  | N/A                                                                                                                 |

### Response

**[LinkApplePayTokenResponse](../../models/operations/LinkApplePayTokenResponse.md)**

### Errors

| Error Type                      | Status Code                     | Content Type                    |
| ------------------------------- | ------------------------------- | ------------------------------- |
| models/errors/GenericError      | 400, 409                        | application/json                |
| models/errors/LinkApplePayError | 422                             | application/json                |
| models/errors/APIException      | 4XX, 5XX                        | \*/\*                           |

## linkCard

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

To use this endpoint from the browser, you'll need to specify the `/accounts/{accountID}/cards.write` scope
when generating a [token](https://docs.moov.io/api/authentication/access-tokens/).

### Example Usage

```java
package hello.world;

import io.moov.openapi.Moov;
import io.moov.openapi.models.components.CardAddress;
import io.moov.openapi.models.components.CardExpiration;
import io.moov.openapi.models.components.LinkCard;
import io.moov.openapi.models.components.LinkCardWaitFor;
import io.moov.openapi.models.components.SchemeBasicAuth;
import io.moov.openapi.models.components.Versions;
import io.moov.openapi.models.errors.GenericError;
import io.moov.openapi.models.errors.LinkCardError;
import io.moov.openapi.models.operations.LinkCardResponse;
import io.moov.openapi.models.operations.LinkCardSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GenericError, LinkCardError, Exception {

        Moov sdk = Moov.builder()
            .build();

        LinkCardResponse res = sdk.cards().linkCard()
                .security(LinkCardSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .xMoovVersion(Versions.V202501)
                .xWaitFor(LinkCardWaitFor.PAYMENT_METHOD)
                .accountID("500c4473-7f7b-4a70-8a8c-d5cb2e08e0e4")
                .linkCard(LinkCard.builder()
                    .cardNumber("4111111111111111")
                    .cardCvv("123")
                    .expiration(CardExpiration.builder()
                        .month("01")
                        .year("21")
                        .build())
                    .billingAddress(CardAddress.builder()
                        .postalCode("80301")
                        .addressLine1("123 Main Street")
                        .addressLine2("Apt 302")
                        .city("Boulder")
                        .stateOrProvince("CO")
                        .country("US")
                        .build())
                    .holderName("Jules Jackson")
                    .cardOnFile(true)
                    .merchantAccountID("01234567-89ab-cdef-0123-456789abcdef")
                    .verifyName(true)
                    .build())
                .call();

        if (res.card().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                                                                                                                                                                                                                         | Type                                                                                                                                                                                                                                                                                                                                                                                                              | Required                                                                                                                                                                                                                                                                                                                                                                                                          | Description                                                                                                                                                                                                                                                                                                                                                                                                       | Example                                                                                                                                                                                                                                                                                                                                                                                                           |
| ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                                                                                                                                                                                                                                                                                                                        | [io.moov.openapi.models.operations.LinkCardSecurity](../../models/operations/LinkCardSecurity.md)                                                                                                                                                                                                                                                                                                                 | :heavy_check_mark:                                                                                                                                                                                                                                                                                                                                                                                                | The security requirements to use for the request.                                                                                                                                                                                                                                                                                                                                                                 |                                                                                                                                                                                                                                                                                                                                                                                                                   |
| `xMoovVersion`                                                                                                                                                                                                                                                                                                                                                                                                    | [Optional\<Versions>](../../models/components/Versions.md)                                                                                                                                                                                                                                                                                                                                                        | :heavy_minus_sign:                                                                                                                                                                                                                                                                                                                                                                                                | Specify an API version.                                                                                                                                                                                                                                                                                                                                                                                           |                                                                                                                                                                                                                                                                                                                                                                                                                   |
| `xWaitFor`                                                                                                                                                                                                                                                                                                                                                                                                        | [Optional\<LinkCardWaitFor>](../../models/components/LinkCardWaitFor.md)                                                                                                                                                                                                                                                                                                                                          | :heavy_minus_sign:                                                                                                                                                                                                                                                                                                                                                                                                | Optional header to wait for certain events, such as the creation of a payment method, to occur before returning a response.<br/><br/>When this header is set to `payment-method`, the response will include any payment methods that were created for the newly <br/>linked card in the `paymentMethods` field. Otherwise, the `paymentMethods` field will be omitted from the response.                          | payment-method                                                                                                                                                                                                                                                                                                                                                                                                    |
| `accountID`                                                                                                                                                                                                                                                                                                                                                                                                       | *String*                                                                                                                                                                                                                                                                                                                                                                                                          | :heavy_check_mark:                                                                                                                                                                                                                                                                                                                                                                                                | N/A                                                                                                                                                                                                                                                                                                                                                                                                               |                                                                                                                                                                                                                                                                                                                                                                                                                   |
| `linkCard`                                                                                                                                                                                                                                                                                                                                                                                                        | [LinkCard](../../models/components/LinkCard.md)                                                                                                                                                                                                                                                                                                                                                                   | :heavy_check_mark:                                                                                                                                                                                                                                                                                                                                                                                                | N/A                                                                                                                                                                                                                                                                                                                                                                                                               | {<br/>"cardNumber": "4111111111111111",<br/>"cardCvv": "123",<br/>"expiration": {<br/>"month": "01",<br/>"year": "21"<br/>},<br/>"holderName": "Jules Jackson",<br/>"billingAddress": {<br/>"addressLine1": "123 Main Street",<br/>"addressLine2": "Apt 302",<br/>"city": "Boulder",<br/>"stateOrProvince": "CO",<br/>"postalCode": "80301",<br/>"country": "US"<br/>},<br/>"cardOnFile": true,<br/>"merchantAccountID": "01234567-89ab-cdef-0123-456789abcdef",<br/>"verifyName": true<br/>} |

### Response

**[LinkCardResponse](../../models/operations/LinkCardResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/GenericError  | 400, 409                    | application/json            |
| models/errors/LinkCardError | 422                         | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## listCards

List all the active cards associated with a Moov account. 

Read our [accept card payments guide](https://docs.moov.io/guides/sources/cards/accept-card-payments/) to learn more.

To use this endpoint from the browser, you'll need to specify the `/accounts/{accountID}/cards.read` scope when generating 
a [token](https://docs.moov.io/api/authentication/access-tokens/).

### Example Usage

```java
package hello.world;

import io.moov.openapi.Moov;
import io.moov.openapi.models.components.SchemeBasicAuth;
import io.moov.openapi.models.components.Versions;
import io.moov.openapi.models.operations.ListCardsResponse;
import io.moov.openapi.models.operations.ListCardsSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Moov sdk = Moov.builder()
            .build();

        ListCardsResponse res = sdk.cards().listCards()
                .security(ListCardsSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .xMoovVersion(Versions.V202504)
                .accountID("5881119b-63c7-492b-8c20-09d0fca99676")
                .call();

        if (res.cards().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `security`                                                                                          | [io.moov.openapi.models.operations.ListCardsSecurity](../../models/operations/ListCardsSecurity.md) | :heavy_check_mark:                                                                                  | The security requirements to use for the request.                                                   |
| `xMoovVersion`                                                                                      | [Optional\<Versions>](../../models/components/Versions.md)                                          | :heavy_minus_sign:                                                                                  | Specify an API version.                                                                             |
| `accountID`                                                                                         | *String*                                                                                            | :heavy_check_mark:                                                                                  | N/A                                                                                                 |

### Response

**[ListCardsResponse](../../models/operations/ListCardsResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## getCard

Fetch a specific card associated with a Moov account. 

Read our [accept card payments guide](https://docs.moov.io/guides/sources/cards/accept-card-payments/) to learn more.

To use this endpoint from the browser, you'll need to specify the `/accounts/{accountID}/cards.read` scope when generating 
a [token](https://docs.moov.io/api/authentication/access-tokens/).

### Example Usage

```java
package hello.world;

import io.moov.openapi.Moov;
import io.moov.openapi.models.components.SchemeBasicAuth;
import io.moov.openapi.models.components.Versions;
import io.moov.openapi.models.operations.GetCardResponse;
import io.moov.openapi.models.operations.GetCardSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Moov sdk = Moov.builder()
            .build();

        GetCardResponse res = sdk.cards().getCard()
                .security(GetCardSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .xMoovVersion(Versions.V202501)
                .accountID("21f0d82e-dc9b-4e80-ac2a-99b6babfebd7")
                .cardID("01234567-89ab-cdef-0123-456789abcdef")
                .call();

        if (res.card().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     | Example                                                                                         |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `security`                                                                                      | [io.moov.openapi.models.operations.GetCardSecurity](../../models/operations/GetCardSecurity.md) | :heavy_check_mark:                                                                              | The security requirements to use for the request.                                               |                                                                                                 |
| `xMoovVersion`                                                                                  | [Optional\<Versions>](../../models/components/Versions.md)                                      | :heavy_minus_sign:                                                                              | Specify an API version.                                                                         |                                                                                                 |
| `accountID`                                                                                     | *String*                                                                                        | :heavy_check_mark:                                                                              | N/A                                                                                             |                                                                                                 |
| `cardID`                                                                                        | *String*                                                                                        | :heavy_check_mark:                                                                              | N/A                                                                                             | 01234567-89ab-cdef-0123-456789abcdef                                                            |

### Response

**[GetCardResponse](../../models/operations/GetCardResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## updateCard

Update a linked card and/or resubmit it for verification. 

If a value is provided for CVV, a new verification ($0 authorization) will be submitted for the card. Updating the expiration 
date or 
address will update the information stored on file for the card but will not be verified.

Read our [accept card payments guide](https://docs.moov.io/guides/sources/cards/accept-card-payments/#reverify-a-card) to learn 
more.

Only use this endpoint if you have provided Moov with a copy of your PCI attestation of compliance. 

To use this endpoint from the browser, you'll need to specify the `/accounts/{accountID}/cards.write` scope when generating 
a [token](https://docs.moov.io/api/authentication/access-tokens/).

### Example Usage

```java
package hello.world;

import io.moov.openapi.Moov;
import io.moov.openapi.models.components.SchemeBasicAuth;
import io.moov.openapi.models.components.UpdateCard;
import io.moov.openapi.models.components.Versions;
import io.moov.openapi.models.errors.GenericError;
import io.moov.openapi.models.errors.UpdateCardError;
import io.moov.openapi.models.operations.UpdateCardResponse;
import io.moov.openapi.models.operations.UpdateCardSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GenericError, UpdateCardError, Exception {

        Moov sdk = Moov.builder()
            .build();

        UpdateCardResponse res = sdk.cards().updateCard()
                .security(UpdateCardSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .xMoovVersion(Versions.V202507)
                .accountID("a960061d-fb6d-4929-99b5-c96c672840f6")
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

| Parameter                                                                                             | Type                                                                                                  | Required                                                                                              | Description                                                                                           | Example                                                                                               |
| ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- |
| `security`                                                                                            | [io.moov.openapi.models.operations.UpdateCardSecurity](../../models/operations/UpdateCardSecurity.md) | :heavy_check_mark:                                                                                    | The security requirements to use for the request.                                                     |                                                                                                       |
| `xMoovVersion`                                                                                        | [Optional\<Versions>](../../models/components/Versions.md)                                            | :heavy_minus_sign:                                                                                    | Specify an API version.                                                                               |                                                                                                       |
| `accountID`                                                                                           | *String*                                                                                              | :heavy_check_mark:                                                                                    | N/A                                                                                                   |                                                                                                       |
| `cardID`                                                                                              | *String*                                                                                              | :heavy_check_mark:                                                                                    | N/A                                                                                                   | 01234567-89ab-cdef-0123-456789abcdef                                                                  |
| `updateCard`                                                                                          | [UpdateCard](../../models/components/UpdateCard.md)                                                   | :heavy_check_mark:                                                                                    | N/A                                                                                                   | {<br/>"cardCvv": "456"<br/>}                                                                          |

### Response

**[UpdateCardResponse](../../models/operations/UpdateCardResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/GenericError    | 400, 409                      | application/json              |
| models/errors/UpdateCardError | 422                           | application/json              |
| models/errors/APIException    | 4XX, 5XX                      | \*/\*                         |

## disableCard

Disables a card associated with a Moov account.

To use this endpoint from the browser, you'll need to specify the `/accounts/{accountID}/cards.write` scope when generating 
a [token](https://docs.moov.io/api/authentication/access-tokens/).

### Example Usage

```java
package hello.world;

import io.moov.openapi.Moov;
import io.moov.openapi.models.components.SchemeBasicAuth;
import io.moov.openapi.models.components.Versions;
import io.moov.openapi.models.errors.GenericError;
import io.moov.openapi.models.operations.DisableCardResponse;
import io.moov.openapi.models.operations.DisableCardSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GenericError, Exception {

        Moov sdk = Moov.builder()
            .build();

        DisableCardResponse res = sdk.cards().disableCard()
                .security(DisableCardSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .xMoovVersion(Versions.V202507)
                .accountID("a6b47d56-0b54-4dd8-9692-efad0ab1ebb4")
                .cardID("01234567-89ab-cdef-0123-456789abcdef")
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                               | Type                                                                                                    | Required                                                                                                | Description                                                                                             | Example                                                                                                 |
| ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- |
| `security`                                                                                              | [io.moov.openapi.models.operations.DisableCardSecurity](../../models/operations/DisableCardSecurity.md) | :heavy_check_mark:                                                                                      | The security requirements to use for the request.                                                       |                                                                                                         |
| `xMoovVersion`                                                                                          | [Optional\<Versions>](../../models/components/Versions.md)                                              | :heavy_minus_sign:                                                                                      | Specify an API version.                                                                                 |                                                                                                         |
| `accountID`                                                                                             | *String*                                                                                                | :heavy_check_mark:                                                                                      | N/A                                                                                                     |                                                                                                         |
| `cardID`                                                                                                | *String*                                                                                                | :heavy_check_mark:                                                                                      | N/A                                                                                                     | 01234567-89ab-cdef-0123-456789abcdef                                                                    |

### Response

**[DisableCardResponse](../../models/operations/DisableCardResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/GenericError | 400, 409                   | application/json           |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |