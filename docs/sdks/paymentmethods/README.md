# PaymentMethods
(*paymentMethods()*)

## Overview

### Available Operations

* [listPaymentMethods](#listpaymentmethods) - Retrieve a list of payment methods associated with a Moov account. Read our [payment methods guide](https://docs.moov.io/guides/money-movement/payment-methods/) to learn more.

To use this endpoint from the browser, you'll need to specify the `/accounts/{accountID}/payment-methods.read` scope when generating a [token](https://docs.moov.io/api/authentication/access-tokens/).
* [getPaymentMethod](#getpaymentmethod) - Get the specified payment method associated with a Moov account. Read our [payment methods guide](https://docs.moov.io/guides/money-movement/payment-methods/) to learn more.

To use this endpoint from the browser, you'll need to specify the `/accounts/{accountID}/payment-methods.read` scope when generating a [token](https://docs.moov.io/api/authentication/access-tokens/).

## listPaymentMethods

Retrieve a list of payment methods associated with a Moov account. Read our [payment methods guide](https://docs.moov.io/guides/money-movement/payment-methods/) to learn more.

To use this endpoint from the browser, you'll need to specify the `/accounts/{accountID}/payment-methods.read` scope when generating a [token](https://docs.moov.io/api/authentication/access-tokens/).

### Example Usage

```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.PaymentMethodType;
import io.moov.sdk.models.components.SchemeBasicAuth;
import io.moov.sdk.models.components.Versions;
import io.moov.sdk.models.operations.ListPaymentMethodsResponse;
import io.moov.sdk.models.operations.ListPaymentMethodsSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Moov sdk = Moov.builder()
            .build();

        ListPaymentMethodsResponse res = sdk.paymentMethods().listPaymentMethods()
                .security(ListPaymentMethodsSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .xMoovVersion(Versions.V202401)
                .accountID("062d9768-0375-4e19-a48f-00ae75251086")
                .sourceID("62d97680-375e-4194-b8f0-0ae752510868")
                .paymentMethodType(PaymentMethodType.PULL_FROM_CARD)
                .call();

        if (res.paymentMethods().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                                                                                                   | Type                                                                                                                                                                                                                                                                                        | Required                                                                                                                                                                                                                                                                                    | Description                                                                                                                                                                                                                                                                                 |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                                                                                                                                                                                                  | [io.moov.sdk.models.operations.ListPaymentMethodsSecurity](../../models/operations/ListPaymentMethodsSecurity.md)                                                                                                                                                                           | :heavy_check_mark:                                                                                                                                                                                                                                                                          | The security requirements to use for the request.                                                                                                                                                                                                                                           |
| `xMoovVersion`                                                                                                                                                                                                                                                                              | [Optional\<Versions>](../../models/components/Versions.md)                                                                                                                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                                                                                                                                          | Specify an API version.                                                                                                                                                                                                                                                                     |
| `accountID`                                                                                                                                                                                                                                                                                 | *String*                                                                                                                                                                                                                                                                                    | :heavy_check_mark:                                                                                                                                                                                                                                                                          | N/A                                                                                                                                                                                                                                                                                         |
| `sourceID`                                                                                                                                                                                                                                                                                  | *Optional\<String>*                                                                                                                                                                                                                                                                         | :heavy_minus_sign:                                                                                                                                                                                                                                                                          | Optional parameter to filter the account's payment methods by source ID. A source ID can be a [walletID](https://docs.moov.io/api/sources/wallets/list/), [cardID](https://docs.moov.io/api/sources/cards/list/), or [bankAccountID](https://docs.moov.io/api/sources/bank-accounts/list/). |
| `paymentMethodType`                                                                                                                                                                                                                                                                         | [Optional\<PaymentMethodType>](../../models/components/PaymentMethodType.md)                                                                                                                                                                                                                | :heavy_minus_sign:                                                                                                                                                                                                                                                                          | Optional parameter to filter the account's payment methods by payment method type.                                                                                                                                                                                                          |

### Response

**[ListPaymentMethodsResponse](../../models/operations/ListPaymentMethodsResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## getPaymentMethod

Get the specified payment method associated with a Moov account. Read our [payment methods guide](https://docs.moov.io/guides/money-movement/payment-methods/) to learn more.

To use this endpoint from the browser, you'll need to specify the `/accounts/{accountID}/payment-methods.read` scope when generating a [token](https://docs.moov.io/api/authentication/access-tokens/).

### Example Usage

```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.SchemeBasicAuth;
import io.moov.sdk.models.components.Versions;
import io.moov.sdk.models.operations.GetPaymentMethodResponse;
import io.moov.sdk.models.operations.GetPaymentMethodSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Moov sdk = Moov.builder()
            .build();

        GetPaymentMethodResponse res = sdk.paymentMethods().getPaymentMethod()
                .security(GetPaymentMethodSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .xMoovVersion(Versions.LATEST)
                .accountID("dec1e9d0-b795-4449-824a-127444ae0d75")
                .paymentMethodID("e4f6d969-b108-405e-b95a-d71e917fb15e")
                .call();

        if (res.paymentMethod().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                     | Type                                                                                                          | Required                                                                                                      | Description                                                                                                   |
| ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                    | [io.moov.sdk.models.operations.GetPaymentMethodSecurity](../../models/operations/GetPaymentMethodSecurity.md) | :heavy_check_mark:                                                                                            | The security requirements to use for the request.                                                             |
| `xMoovVersion`                                                                                                | [Optional\<Versions>](../../models/components/Versions.md)                                                    | :heavy_minus_sign:                                                                                            | Specify an API version.                                                                                       |
| `accountID`                                                                                                   | *String*                                                                                                      | :heavy_check_mark:                                                                                            | N/A                                                                                                           |
| `paymentMethodID`                                                                                             | *String*                                                                                                      | :heavy_check_mark:                                                                                            | N/A                                                                                                           |

### Response

**[GetPaymentMethodResponse](../../models/operations/GetPaymentMethodResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |