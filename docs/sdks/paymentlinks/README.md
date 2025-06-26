# PaymentLinks
(*paymentLinks()*)

## Overview

### Available Operations

* [create](#create) - Create a payment link that allows an end user to make a payment on Moov's hosted payment link page.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/transfers.write` scope.
* [list](#list) - List all the payment links created under a Moov account.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/transfers.read` scope.
* [get](#get) - Retrieve a payment link by code.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/transfers.read` scope.
* [update](#update) - Update a payment link.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/transfers.write` scope.
* [disable](#disable) - Disable a payment link.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/transfers.write` scope.
* [getQRCode](#getqrcode) - Retrieve the payment link encoded in a QR code. 

Use the `Accept` header to specify the format of the response. Supported formats are `application/json` and `image/png`.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/transfers.write` scope.

## create

Create a payment link that allows an end user to make a payment on Moov's hosted payment link page.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/transfers.write` scope.

### Example Usage

```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.*;
import io.moov.sdk.models.errors.CreatePaymentLinkError;
import io.moov.sdk.models.errors.GenericError;
import io.moov.sdk.models.operations.CreatePaymentLinkResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws GenericError, CreatePaymentLinkError, Exception {

        Moov sdk = Moov.builder()
                .xMoovVersion("v2024.01.00")
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        CreatePaymentLinkResponse res = sdk.paymentLinks().create()
                .accountID("cc1d04a8-03b1-4600-b675-e6180d574074")
                .createPaymentLink(CreatePaymentLink.builder()
                    .partnerAccountID("d290f1ee-6c54-4b01-90e6-d701748f0851")
                    .merchantPaymentMethodID("4c4e7f8e-81f4-4f3d-8f6f-6f6e7f8e4c4e")
                    .amount(Amount.builder()
                        .currency("USD")
                        .value(10000L)
                        .build())
                    .display(PaymentLinkDisplayOptions.builder()
                        .title("Example Payment Link")
                        .description("This is an example payment link.")
                        .callToAction(CallToAction.PAY)
                        .build())
                    .customer(PaymentLinkCustomerOptions.builder()
                        .requirePhone(true)
                        .build())
                    .payment(PaymentLinkPaymentDetails.builder()
                        .allowedMethods(List.of(
                            CollectionPaymentMethodType.CARD_PAYMENT,
                            CollectionPaymentMethodType.ACH_DEBIT_COLLECT))
                        .build())
                    .build())
                .call();

        if (res.paymentLink().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                                                                                                                                                                                                                                    | Type                                                                                                                                                                                                                                                                                                                                                                                                                         | Required                                                                                                                                                                                                                                                                                                                                                                                                                     | Description                                                                                                                                                                                                                                                                                                                                                                                                                  | Example                                                                                                                                                                                                                                                                                                                                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `accountID`                                                                                                                                                                                                                                                                                                                                                                                                                  | *String*                                                                                                                                                                                                                                                                                                                                                                                                                     | :heavy_check_mark:                                                                                                                                                                                                                                                                                                                                                                                                           | N/A                                                                                                                                                                                                                                                                                                                                                                                                                          |                                                                                                                                                                                                                                                                                                                                                                                                                              |
| `createPaymentLink`                                                                                                                                                                                                                                                                                                                                                                                                          | [CreatePaymentLink](../../models/components/CreatePaymentLink.md)                                                                                                                                                                                                                                                                                                                                                            | :heavy_check_mark:                                                                                                                                                                                                                                                                                                                                                                                                           | N/A                                                                                                                                                                                                                                                                                                                                                                                                                          | {<br/>"partnerAccountID": "d290f1ee-6c54-4b01-90e6-d701748f0851",<br/>"merchantPaymentMethodID": "4c4e7f8e-81f4-4f3d-8f6f-6f6e7f8e4c4e",<br/>"amount": {<br/>"currency": "USD",<br/>"value": 10000<br/>},<br/>"display": {<br/>"title": "Example Payment Link",<br/>"description": "This is an example payment link.",<br/>"callToAction": "pay"<br/>},<br/>"customer": {<br/>"requirePhone": true<br/>},<br/>"payment": {<br/>"allowedMethods": [<br/>"card-payment",<br/>"ach-debit-collect"<br/>]<br/>}<br/>} |

### Response

**[CreatePaymentLinkResponse](../../models/operations/CreatePaymentLinkResponse.md)**

### Errors

| Error Type                           | Status Code                          | Content Type                         |
| ------------------------------------ | ------------------------------------ | ------------------------------------ |
| models/errors/GenericError           | 400, 409                             | application/json                     |
| models/errors/CreatePaymentLinkError | 422                                  | application/json                     |
| models/errors/APIException           | 4XX, 5XX                             | \*/\*                                |

## list

List all the payment links created under a Moov account.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/transfers.read` scope.

### Example Usage

```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.operations.ListPaymentLinksResponse;
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

        ListPaymentLinksResponse res = sdk.paymentLinks().list()
                .accountID("d1039e6d-21ee-4a29-8adf-1dd2a6625a0d")
                .call();

        if (res.paymentLinks().isPresent()) {
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

**[ListPaymentLinksResponse](../../models/operations/ListPaymentLinksResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## get

Retrieve a payment link by code.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/transfers.read` scope.

### Example Usage

```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.operations.GetPaymentLinkResponse;
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

        GetPaymentLinkResponse res = sdk.paymentLinks().get()
                .accountID("323f95b1-3798-4203-8a73-5c8668a9226e")
                .paymentLinkCode("uc7ZYKrMhi")
                .call();

        if (res.paymentLink().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter          | Type               | Required           | Description        | Example            |
| ------------------ | ------------------ | ------------------ | ------------------ | ------------------ |
| `accountID`        | *String*           | :heavy_check_mark: | N/A                |                    |
| `paymentLinkCode`  | *String*           | :heavy_check_mark: | N/A                | uc7ZYKrMhi         |

### Response

**[GetPaymentLinkResponse](../../models/operations/GetPaymentLinkResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## update

Update a payment link.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/transfers.write` scope.

### Example Usage

```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.*;
import io.moov.sdk.models.errors.GenericError;
import io.moov.sdk.models.errors.UpdatePaymentLinkError;
import io.moov.sdk.models.operations.UpdatePaymentLinkResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GenericError, UpdatePaymentLinkError, Exception {

        Moov sdk = Moov.builder()
                .xMoovVersion("v2024.01.00")
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        UpdatePaymentLinkResponse res = sdk.paymentLinks().update()
                .accountID("ddad6613-2350-446a-883b-f76abb2cd4ea")
                .paymentLinkCode("uc7ZYKrMhi")
                .updatePaymentLink(UpdatePaymentLink.builder()
                    .amount(AmountUpdate.builder()
                        .currency("USD")
                        .value(12099L)
                        .build())
                    .customer(PaymentLinkCustomerOptions.builder()
                        .requireAddress(true)
                        .requirePhone(true)
                        .build())
                    .build())
                .call();

        if (res.paymentLink().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                         | Type                                                                                                              | Required                                                                                                          | Description                                                                                                       | Example                                                                                                           |
| ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- |
| `accountID`                                                                                                       | *String*                                                                                                          | :heavy_check_mark:                                                                                                | N/A                                                                                                               |                                                                                                                   |
| `paymentLinkCode`                                                                                                 | *String*                                                                                                          | :heavy_check_mark:                                                                                                | N/A                                                                                                               | uc7ZYKrMhi                                                                                                        |
| `updatePaymentLink`                                                                                               | [UpdatePaymentLink](../../models/components/UpdatePaymentLink.md)                                                 | :heavy_check_mark:                                                                                                | N/A                                                                                                               | {<br/>"amount": {<br/>"currency": "USD",<br/>"value": 12099<br/>},<br/>"customer": {<br/>"requirePhone": true,<br/>"requireAddress": true<br/>}<br/>} |

### Response

**[UpdatePaymentLinkResponse](../../models/operations/UpdatePaymentLinkResponse.md)**

### Errors

| Error Type                           | Status Code                          | Content Type                         |
| ------------------------------------ | ------------------------------------ | ------------------------------------ |
| models/errors/GenericError           | 400, 409                             | application/json                     |
| models/errors/UpdatePaymentLinkError | 422                                  | application/json                     |
| models/errors/APIException           | 4XX, 5XX                             | \*/\*                                |

## disable

Disable a payment link.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/transfers.write` scope.

### Example Usage

```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.operations.DisablePaymentLinkResponse;
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

        DisablePaymentLinkResponse res = sdk.paymentLinks().disable()
                .accountID("c1cf000d-0dd9-4dec-bd5e-a88e135adf82")
                .paymentLinkCode("uc7ZYKrMhi")
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter          | Type               | Required           | Description        | Example            |
| ------------------ | ------------------ | ------------------ | ------------------ | ------------------ |
| `accountID`        | *String*           | :heavy_check_mark: | N/A                |                    |
| `paymentLinkCode`  | *String*           | :heavy_check_mark: | N/A                | uc7ZYKrMhi         |

### Response

**[DisablePaymentLinkResponse](../../models/operations/DisablePaymentLinkResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## getQRCode

Retrieve the payment link encoded in a QR code. 

Use the `Accept` header to specify the format of the response. Supported formats are `application/json` and `image/png`.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/transfers.write` scope.

### Example Usage

```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.operations.GetPaymentLinkQRCodeResponse;
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

        GetPaymentLinkQRCodeResponse res = sdk.paymentLinks().getQRCode()
                .accountID("2f01a42a-aa5a-424f-9f47-6f8999ed05dc")
                .paymentLinkCode("uc7ZYKrMhi")
                .call();

        if (res.qrCode().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter          | Type               | Required           | Description        | Example            |
| ------------------ | ------------------ | ------------------ | ------------------ | ------------------ |
| `accountID`        | *String*           | :heavy_check_mark: | N/A                |                    |
| `paymentLinkCode`  | *String*           | :heavy_check_mark: | N/A                | uc7ZYKrMhi         |

### Response

**[GetPaymentLinkQRCodeResponse](../../models/operations/GetPaymentLinkQRCodeResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |