# PaymentMethods

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

<!-- UsageSnippet language="java" operationID="listPaymentMethods" method="get" path="/accounts/{accountID}/payment-methods" -->
```java
package hello.world;

import io.moov.sdk.Moov;
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
                .accountID("f5503781-dfe4-4bcd-9487-5b5fe2b4d53b")
                .call();

        if (res.paymentMethods().isPresent()) {
            System.out.println(res.paymentMethods().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                                                                                                      | Type                                                                                                                                                                                                                                                                                           | Required                                                                                                                                                                                                                                                                                       | Description                                                                                                                                                                                                                                                                                    |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
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

<!-- UsageSnippet language="java" operationID="getPaymentMethod" method="get" path="/accounts/{accountID}/payment-methods/{paymentMethodID}" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.PaymentMethod;
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
                .accountID("56878537-30b0-48ee-9c54-07ab3a8b243d")
                .paymentMethodID("aa740bf3-4c5f-459b-9370-4f7d4bea382b")
                .call();

        if (res.paymentMethod().isPresent()) {
            PaymentMethod unionValue = res.paymentMethod().get();
            switch (unionValue.paymentMethodType()) {
                case "moov-wallet":
                    // Handle moov-wallet discriminator variant
                    break;
                case "ach-debit-fund":
                    // Handle ach-debit-fund discriminator variant
                    break;
                case "ach-debit-collect":
                    // Handle ach-debit-collect discriminator variant
                    break;
                case "ach-credit-standard":
                    // Handle ach-credit-standard discriminator variant
                    break;
                case "ach-credit-same-day":
                    // Handle ach-credit-same-day discriminator variant
                    break;
                case "rtp-credit":
                    // Handle rtp-credit discriminator variant
                    break;
                case "card-payment":
                    // Handle card-payment discriminator variant
                    break;
                case "push-to-card":
                    // Handle push-to-card discriminator variant
                    break;
                case "pull-from-card":
                    // Handle pull-from-card discriminator variant
                    break;
                case "apple-pay":
                    // Handle apple-pay discriminator variant
                    break;
                default:
                    // Handle unknown discriminator variant
            }
        }
    }
}
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `accountID`        | *String*           | :heavy_check_mark: | N/A                |
| `paymentMethodID`  | *String*           | :heavy_check_mark: | N/A                |

### Response

**[GetPaymentMethodResponse](../../models/operations/GetPaymentMethodResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |