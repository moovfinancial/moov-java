# ApplePay

## Overview

### Available Operations

* [registerMerchantDomains](#registermerchantdomains) - Add domains to be registered with Apple Pay.

Any domains that will be used to accept payments must first be [verified](https://docs.moov.io/guides/sources/cards/apple-pay/#register-your-domains) 
with Apple.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/apple-pay.write` scope.
* [updateMerchantDomains](#updatemerchantdomains) - Add or remove domains to be registered with Apple Pay.

Any domains that will be used to accept payments must first be [verified](https://docs.moov.io/guides/sources/cards/apple-pay/#register-your-domains)
with Apple.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/)
you'll need to specify the `/accounts/{accountID}/apple-pay.write` scope.
* [getMerchantDomains](#getmerchantdomains) - Get domains registered with Apple Pay. 

Read our [Apple Pay tutorial](https://docs.moov.io/guides/sources/cards/apple-pay/#register-your-domains) to learn more. 

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/apple-pay.read` scope.
* [createSession](#createsession) - Create a session with Apple Pay to facilitate a payment. 

Read our [Apple Pay tutorial](https://docs.moov.io/guides/sources/cards/apple-pay/#register-your-domains) to learn more. 
A successful response from this endpoint should be passed through to Apple Pay unchanged. 

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/apple-pay.write` scope.
* [linkToken](#linktoken) - Connect an Apple Pay token to the specified account. 

Read our [Apple Pay tutorial](https://docs.moov.io/guides/sources/cards/apple-pay/#register-your-domains) to learn more. 
The `token` data is defined by Apple Pay and should be passed through from Apple Pay's response unmodified.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/cards.write` scope.

## registerMerchantDomains

Add domains to be registered with Apple Pay.

Any domains that will be used to accept payments must first be [verified](https://docs.moov.io/guides/sources/cards/apple-pay/#register-your-domains) 
with Apple.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/apple-pay.write` scope.

### Example Usage

<!-- UsageSnippet language="java" operationID="registerApplePayMerchantDomains" method="post" path="/accounts/{accountID}/apple-pay/domains" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.RegisterApplePayMerchantDomains;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.errors.GenericError;
import io.moov.sdk.models.operations.RegisterApplePayMerchantDomainsResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws GenericError, Exception {

        Moov sdk = Moov.builder()
                .xMoovVersion("v2024.01.00")
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        RegisterApplePayMerchantDomainsResponse res = sdk.applePay().registerMerchantDomains()
                .accountID("60825531-8c7e-421c-8014-019c6603250c")
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

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `accountID`                                                                                   | *String*                                                                                      | :heavy_check_mark:                                                                            | ID of the Moov account representing the merchant.                                             |
| `registerApplePayMerchantDomains`                                                             | [RegisterApplePayMerchantDomains](../../models/components/RegisterApplePayMerchantDomains.md) | :heavy_check_mark:                                                                            | N/A                                                                                           |

### Response

**[RegisterApplePayMerchantDomainsResponse](../../models/operations/RegisterApplePayMerchantDomainsResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/GenericError | 400                        | application/json           |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## updateMerchantDomains

Add or remove domains to be registered with Apple Pay.

Any domains that will be used to accept payments must first be [verified](https://docs.moov.io/guides/sources/cards/apple-pay/#register-your-domains)
with Apple.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/)
you'll need to specify the `/accounts/{accountID}/apple-pay.write` scope.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateApplePayMerchantDomains" method="patch" path="/accounts/{accountID}/apple-pay/domains" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.components.UpdateApplePayMerchantDomains;
import io.moov.sdk.models.errors.GenericError;
import io.moov.sdk.models.operations.UpdateApplePayMerchantDomainsResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws GenericError, Exception {

        Moov sdk = Moov.builder()
                .xMoovVersion("v2024.01.00")
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        UpdateApplePayMerchantDomainsResponse res = sdk.applePay().updateMerchantDomains()
                .accountID("34b1c132-91d4-4676-9864-87e1d961d56d")
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

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `accountID`                                                                               | *String*                                                                                  | :heavy_check_mark:                                                                        | ID of the Moov account representing the merchant.                                         |
| `updateApplePayMerchantDomains`                                                           | [UpdateApplePayMerchantDomains](../../models/components/UpdateApplePayMerchantDomains.md) | :heavy_check_mark:                                                                        | N/A                                                                                       |

### Response

**[UpdateApplePayMerchantDomainsResponse](../../models/operations/UpdateApplePayMerchantDomainsResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/GenericError | 400                        | application/json           |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## getMerchantDomains

Get domains registered with Apple Pay. 

Read our [Apple Pay tutorial](https://docs.moov.io/guides/sources/cards/apple-pay/#register-your-domains) to learn more. 

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/apple-pay.read` scope.

### Example Usage

<!-- UsageSnippet language="java" operationID="getApplePayMerchantDomains" method="get" path="/accounts/{accountID}/apple-pay/domains" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.operations.GetApplePayMerchantDomainsResponse;
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

        GetApplePayMerchantDomainsResponse res = sdk.applePay().getMerchantDomains()
                .accountID("28704d00-d07b-47db-9e54-016a9713d697")
                .call();

        if (res.applePayMerchantDomains().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                         | Type                                              | Required                                          | Description                                       |
| ------------------------------------------------- | ------------------------------------------------- | ------------------------------------------------- | ------------------------------------------------- |
| `accountID`                                       | *String*                                          | :heavy_check_mark:                                | ID of the Moov account representing the merchant. |

### Response

**[GetApplePayMerchantDomainsResponse](../../models/operations/GetApplePayMerchantDomainsResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## createSession

Create a session with Apple Pay to facilitate a payment. 

Read our [Apple Pay tutorial](https://docs.moov.io/guides/sources/cards/apple-pay/#register-your-domains) to learn more. 
A successful response from this endpoint should be passed through to Apple Pay unchanged. 

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/apple-pay.write` scope.

### Example Usage

<!-- UsageSnippet language="java" operationID="createApplePaySession" method="post" path="/accounts/{accountID}/apple-pay/sessions" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.CreateApplePaySession;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.errors.GenericError;
import io.moov.sdk.models.operations.CreateApplePaySessionResponse;
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

        CreateApplePaySessionResponse res = sdk.applePay().createSession()
                .accountID("32ab62ca-7afd-4f49-89cb-0bb237258f23")
                .createApplePaySession(CreateApplePaySession.builder()
                    .domain("checkout.classbooker.dev")
                    .displayName("Fay11")
                    .build())
                .call();

        if (res.applePaySession().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `accountID`                                                               | *String*                                                                  | :heavy_check_mark:                                                        | ID of the Moov account representing the merchant.                         |
| `createApplePaySession`                                                   | [CreateApplePaySession](../../models/components/CreateApplePaySession.md) | :heavy_check_mark:                                                        | N/A                                                                       |

### Response

**[CreateApplePaySessionResponse](../../models/operations/CreateApplePaySessionResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/GenericError | 400, 409, 422              | application/json           |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## linkToken

Connect an Apple Pay token to the specified account. 

Read our [Apple Pay tutorial](https://docs.moov.io/guides/sources/cards/apple-pay/#register-your-domains) to learn more. 
The `token` data is defined by Apple Pay and should be passed through from Apple Pay's response unmodified.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/cards.write` scope.

### Example Usage

<!-- UsageSnippet language="java" operationID="linkApplePayToken" method="post" path="/accounts/{accountID}/apple-pay/tokens" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.*;
import io.moov.sdk.models.errors.GenericError;
import io.moov.sdk.models.errors.LinkApplePayError;
import io.moov.sdk.models.operations.LinkApplePayTokenResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws GenericError, LinkApplePayError, Exception {

        Moov sdk = Moov.builder()
                .xMoovVersion("v2024.01.00")
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        LinkApplePayTokenResponse res = sdk.applePay().linkToken()
                .accountID("bf498c07-3852-4060-b561-bf992e26a851")
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

| Parameter                                               | Type                                                    | Required                                                | Description                                             |
| ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- |
| `accountID`                                             | *String*                                                | :heavy_check_mark:                                      | ID of the Moov account representing the cardholder.     |
| `linkApplePay`                                          | [LinkApplePay](../../models/components/LinkApplePay.md) | :heavy_check_mark:                                      | N/A                                                     |

### Response

**[LinkApplePayTokenResponse](../../models/operations/LinkApplePayTokenResponse.md)**

### Errors

| Error Type                      | Status Code                     | Content Type                    |
| ------------------------------- | ------------------------------- | ------------------------------- |
| models/errors/GenericError      | 400, 409                        | application/json                |
| models/errors/LinkApplePayError | 422                             | application/json                |
| models/errors/APIException      | 4XX, 5XX                        | \*/\*                           |