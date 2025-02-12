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
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.operations.ListPaymentMethodsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Moov sdk = Moov.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        ListPaymentMethodsResponse res = sdk.paymentMethods().list()
                .xMoovVersion("v2024.01.00")
                .accountID("062d9768-0375-4e19-a48f-00ae75251086")
                .sourceID("c8a232aa-0b11-4b8a-b005-71e9e705d0e6")
                .paymentMethodType(PaymentMethodType.ACH_DEBIT_FUND)
                .call();

        if (res.paymentMethods().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         | Type                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              | Required                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          | Description                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       |
| --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `xMoovVersion`                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    | *Optional\<String>*                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               | :heavy_minus_sign:                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                | Specify an API version.<br/><br/>API versioning follows the format `vYYYY.QQ.BB`, where <br/>  - `YYYY` is the year<br/>  - `QQ` is the two-digit month for the first month of the quarter (e.g., 01, 04, 07, 10)<br/>  - `BB` is the build number, starting at `.01`, for subsequent builds in the same quarter. <br/>    - For example, `v2024.01.00` is the initial release of the first quarter of 2024.<br/><br/>The `latest` version represents the most recent development state. It may include breaking changes and should be treated as a beta release. |
| `accountID`                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       | *String*                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          | :heavy_check_mark:                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                | N/A                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               |
| `sourceID`                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        | *Optional\<String>*                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               | :heavy_minus_sign:                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                | Optional parameter to filter the account's payment methods by source ID. <br/><br/>A source ID can be a [walletID](https://docs.moov.io/api/sources/wallets/list/), [cardID](https://docs.moov.io/api/sources/cards/list/), <br/>or [bankAccountID](https://docs.moov.io/api/sources/bank-accounts/list/).                                                                                                                                                                                                                        |
| `paymentMethodType`                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               | [Optional\<PaymentMethodType>](../../models/components/PaymentMethodType.md)                                                                                                                                                                                                                                                                                                                                                                                                                                                      | :heavy_minus_sign:                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                | Optional parameter to filter the account's payment methods by payment method type.                                                                                                                                                                                                                                                                                                                                                                                                                                                |

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
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.operations.GetPaymentMethodResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Moov sdk = Moov.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        GetPaymentMethodResponse res = sdk.paymentMethods().get()
                .xMoovVersion("v2024.01.00")
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

| Parameter                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         | Type                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              | Required                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          | Description                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       |
| --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `xMoovVersion`                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    | *Optional\<String>*                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               | :heavy_minus_sign:                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                | Specify an API version.<br/><br/>API versioning follows the format `vYYYY.QQ.BB`, where <br/>  - `YYYY` is the year<br/>  - `QQ` is the two-digit month for the first month of the quarter (e.g., 01, 04, 07, 10)<br/>  - `BB` is the build number, starting at `.01`, for subsequent builds in the same quarter. <br/>    - For example, `v2024.01.00` is the initial release of the first quarter of 2024.<br/><br/>The `latest` version represents the most recent development state. It may include breaking changes and should be treated as a beta release. |
| `accountID`                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       | *String*                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          | :heavy_check_mark:                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                | N/A                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               |
| `paymentMethodID`                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 | *String*                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          | :heavy_check_mark:                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                | N/A                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               |

### Response

**[GetPaymentMethodResponse](../../models/operations/GetPaymentMethodResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |