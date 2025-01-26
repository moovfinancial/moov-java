# PaymentMethods
(*paymentMethods()*)

## Overview

### Available Operations

* [list](#list) - Retrieve a list of payment methods associated with a Moov account. Read our [payment methods 
guide](https://docs.moov.io/guides/money-movement/payment-methods/) to learn more.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/payment-methods.read` scope.
* [get](#get) - Get the specified payment method associated with a Moov account. Read our [payment methods guide](https://docs.moov.io/guides/money-movement/payment-methods/) to learn more.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/payment-methods.read` scope.

## list

Retrieve a list of payment methods associated with a Moov account. Read our [payment methods 
guide](https://docs.moov.io/guides/money-movement/payment-methods/) to learn more.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/payment-methods.read` scope.

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

        ListPaymentMethodsResponse res = sdk.paymentMethods().list()
                .security(ListPaymentMethodsSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .xMoovVersion(Versions.V202510)
                .accountID("062d9768-0375-4e19-a48f-00ae75251086")
                .sourceID("8a232aa0-b11b-48a0-8057-1e9e705d0e6e")
                .paymentMethodType(PaymentMethodType.MOOV_WALLET)
                .call();

        if (res.paymentMethods().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                                                                                                      | Type                                                                                                                                                                                                                                                                                           | Required                                                                                                                                                                                                                                                                                       | Description                                                                                                                                                                                                                                                                                    |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                                                                                                                                                                                                     | [io.moov.sdk.models.operations.ListPaymentMethodsSecurity](../../models/operations/ListPaymentMethodsSecurity.md)                                                                                                                                                                              | :heavy_check_mark:                                                                                                                                                                                                                                                                             | The security requirements to use for the request.                                                                                                                                                                                                                                              |
| `xMoovVersion`                                                                                                                                                                                                                                                                                 | [Optional\<Versions>](../../models/components/Versions.md)                                                                                                                                                                                                                                     | :heavy_minus_sign:                                                                                                                                                                                                                                                                             | Specify an API version.                                                                                                                                                                                                                                                                        |
| `accountID`                                                                                                                                                                                                                                                                                    | *String*                                                                                                                                                                                                                                                                                       | :heavy_check_mark:                                                                                                                                                                                                                                                                             | N/A                                                                                                                                                                                                                                                                                            |
| `sourceID`                                                                                                                                                                                                                                                                                     | *Optional\<String>*                                                                                                                                                                                                                                                                            | :heavy_minus_sign:                                                                                                                                                                                                                                                                             | Optional parameter to filter the account's payment methods by source ID. <br/><br/>A source ID can be a [walletID](https://docs.moov.io/api/sources/wallets/list/), [cardID](https://docs.moov.io/api/sources/cards/list/), <br/>or [bankAccountID](https://docs.moov.io/api/sources/bank-accounts/list/). |
| `paymentMethodType`                                                                                                                                                                                                                                                                            | [Optional\<PaymentMethodType>](../../models/components/PaymentMethodType.md)                                                                                                                                                                                                                   | :heavy_minus_sign:                                                                                                                                                                                                                                                                             | Optional parameter to filter the account's payment methods by payment method type.                                                                                                                                                                                                             |

### Response

**[ListPaymentMethodsResponse](../../models/operations/ListPaymentMethodsResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## get

Get the specified payment method associated with a Moov account. Read our [payment methods guide](https://docs.moov.io/guides/money-movement/payment-methods/) to learn more.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/payment-methods.read` scope.

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

        GetPaymentMethodResponse res = sdk.paymentMethods().get()
                .security(GetPaymentMethodSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .xMoovVersion(Versions.V202510)
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