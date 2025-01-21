# PaymentLinks
(*paymentLinks()*)

## Overview

### Available Operations

* [createPaymentLink](#createpaymentlink) - Create a payment link that allows an end user to make a payment on Moov's hosted payment link page.

To access this endpoint using a [token](https://docs.moov.io/api/authentication/access-tokens/) you'll need 
to specify the `/accounts/{accountID}/transfers.write` scope.
* [listPaymentLinks](#listpaymentlinks) - List all the payment links created under a Moov account.

To access this endpoint using a [token](https://docs.moov.io/api/authentication/access-tokens/) you'll need 
to specify the `/accounts/{accountID}/transfers.read` scope.
* [getPaymentLink](#getpaymentlink) - Retrieve a payment link by code.

To access this endpoint using a [token](https://docs.moov.io/api/authentication/access-tokens/) you'll need 
to specify the `/accounts/{accountID}/transfers.read` scope.
* [updatePaymentLink](#updatepaymentlink) - Update a payment link.

To access this endpoint using a [token](https://docs.moov.io/api/authentication/access-tokens/) you'll need 
to specify the `/accounts/{accountID}/transfers.write` scope.
* [disablePaymentLink](#disablepaymentlink) - Disable a payment link.

To access this endpoint using a [token](https://docs.moov.io/api/authentication/access-tokens/) you'll need 
to specify the `/accounts/{accountID}/transfers.write` scope.
* [getPaymentLinkQRCode](#getpaymentlinkqrcode) - Retrieve the payment link encoded in a QR code. 

Use the `Accept` header to specify the format of the response. Supported formats are `application/json` and `image/png`.

To access this endpoint using a [token](https://docs.moov.io/api/authentication/access-tokens/) you'll need 
to specify the `/accounts/{accountID}/transfers.write` scope.

## createPaymentLink

Create a payment link that allows an end user to make a payment on Moov's hosted payment link page.

To access this endpoint using a [token](https://docs.moov.io/api/authentication/access-tokens/) you'll need 
to specify the `/accounts/{accountID}/transfers.write` scope.

### Example Usage

```java
package hello.world;

import io.moov.openapi.Moov;
import io.moov.openapi.models.components.ACHPaymentDetails;
import io.moov.openapi.models.components.Amount;
import io.moov.openapi.models.components.CallToAction;
import io.moov.openapi.models.components.CardPaymentDetails;
import io.moov.openapi.models.components.CollectionPaymentMethodType;
import io.moov.openapi.models.components.CreatePaymentLink;
import io.moov.openapi.models.components.DisbursementPaymentMethodType;
import io.moov.openapi.models.components.PaymentLinkDisplayOptions;
import io.moov.openapi.models.components.PaymentLinkPaymentDetails;
import io.moov.openapi.models.components.PaymentLinkPayoutDetails;
import io.moov.openapi.models.components.PayoutRecipient;
import io.moov.openapi.models.components.SchemeBasicAuth;
import io.moov.openapi.models.components.Versions;
import io.moov.openapi.models.errors.CreatePaymentLinkError;
import io.moov.openapi.models.errors.GenericError;
import io.moov.openapi.models.operations.CreatePaymentLinkResponse;
import io.moov.openapi.models.operations.CreatePaymentLinkSecurity;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws GenericError, CreatePaymentLinkError, Exception {

        Moov sdk = Moov.builder()
            .build();

        CreatePaymentLinkResponse res = sdk.paymentLinks().createPaymentLink()
                .security(CreatePaymentLinkSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .xMoovVersion(Versions.LATEST)
                .accountID("831ce989-44b7-4d2f-8990-b0ab3c903956")
                .createPaymentLink(CreatePaymentLink.builder()
                    .partnerAccountID("d0d0cf2f-fdd4-483d-957a-f12f86d9640f")
                    .merchantPaymentMethodID("0d21fbfd-baa7-4dcc-ac61-71c5130ab376")
                    .amount(Amount.builder()
                        .currency("Iranian Rial")
                        .value(335397L)
                        .build())
                    .display(PaymentLinkDisplayOptions.builder()
                        .title("<value>")
                        .description("platypus resource lest ugh")
                        .callToAction(CallToAction.BOOK)
                        .build())
                    .payment(PaymentLinkPaymentDetails.builder()
                        .allowedMethods(List.of(
                            CollectionPaymentMethodType.ACH_DEBIT_COLLECT,
                            CollectionPaymentMethodType.CARD_PAYMENT))
                        .cardDetails(CardPaymentDetails.builder()
                            .dynamicDescriptor("WhlBdy *Yoga 11-12")
                            .build())
                        .achDetails(ACHPaymentDetails.builder()
                            .companyEntryDescription("Gym dues")
                            .originatingCompanyName("Whole Body Fit")
                            .build())
                        .build())
                    .payout(PaymentLinkPayoutDetails.builder()
                        .allowedMethods(List.of(
                            DisbursementPaymentMethodType.PUSH_TO_CARD))
                        .recipient(PayoutRecipient.builder()
                            .email("jordan.lee@classbooker.dev")
                            .build())
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

| Parameter                                                                                                           | Type                                                                                                                | Required                                                                                                            | Description                                                                                                         |
| ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                          | [io.moov.openapi.models.operations.CreatePaymentLinkSecurity](../../models/operations/CreatePaymentLinkSecurity.md) | :heavy_check_mark:                                                                                                  | The security requirements to use for the request.                                                                   |
| `xMoovVersion`                                                                                                      | [Optional\<Versions>](../../models/components/Versions.md)                                                          | :heavy_minus_sign:                                                                                                  | Specify an API version.                                                                                             |
| `accountID`                                                                                                         | *String*                                                                                                            | :heavy_check_mark:                                                                                                  | N/A                                                                                                                 |
| `createPaymentLink`                                                                                                 | [CreatePaymentLink](../../models/components/CreatePaymentLink.md)                                                   | :heavy_check_mark:                                                                                                  | N/A                                                                                                                 |

### Response

**[CreatePaymentLinkResponse](../../models/operations/CreatePaymentLinkResponse.md)**

### Errors

| Error Type                           | Status Code                          | Content Type                         |
| ------------------------------------ | ------------------------------------ | ------------------------------------ |
| models/errors/GenericError           | 400, 409                             | application/json                     |
| models/errors/CreatePaymentLinkError | 422                                  | application/json                     |
| models/errors/APIException           | 4XX, 5XX                             | \*/\*                                |

## listPaymentLinks

List all the payment links created under a Moov account.

To access this endpoint using a [token](https://docs.moov.io/api/authentication/access-tokens/) you'll need 
to specify the `/accounts/{accountID}/transfers.read` scope.

### Example Usage

```java
package hello.world;

import io.moov.openapi.Moov;
import io.moov.openapi.models.components.SchemeBasicAuth;
import io.moov.openapi.models.components.Versions;
import io.moov.openapi.models.operations.ListPaymentLinksResponse;
import io.moov.openapi.models.operations.ListPaymentLinksSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Moov sdk = Moov.builder()
            .build();

        ListPaymentLinksResponse res = sdk.paymentLinks().listPaymentLinks()
                .security(ListPaymentLinksSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .xMoovVersion(Versions.LATEST)
                .accountID("9f728868-b3c8-409c-9aa0-282a13d8ddc8")
                .call();

        if (res.paymentLinks().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                         | Type                                                                                                              | Required                                                                                                          | Description                                                                                                       |
| ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                        | [io.moov.openapi.models.operations.ListPaymentLinksSecurity](../../models/operations/ListPaymentLinksSecurity.md) | :heavy_check_mark:                                                                                                | The security requirements to use for the request.                                                                 |
| `xMoovVersion`                                                                                                    | [Optional\<Versions>](../../models/components/Versions.md)                                                        | :heavy_minus_sign:                                                                                                | Specify an API version.                                                                                           |
| `accountID`                                                                                                       | *String*                                                                                                          | :heavy_check_mark:                                                                                                | N/A                                                                                                               |

### Response

**[ListPaymentLinksResponse](../../models/operations/ListPaymentLinksResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## getPaymentLink

Retrieve a payment link by code.

To access this endpoint using a [token](https://docs.moov.io/api/authentication/access-tokens/) you'll need 
to specify the `/accounts/{accountID}/transfers.read` scope.

### Example Usage

```java
package hello.world;

import io.moov.openapi.Moov;
import io.moov.openapi.models.components.SchemeBasicAuth;
import io.moov.openapi.models.components.Versions;
import io.moov.openapi.models.operations.GetPaymentLinkResponse;
import io.moov.openapi.models.operations.GetPaymentLinkSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Moov sdk = Moov.builder()
            .build();

        GetPaymentLinkResponse res = sdk.paymentLinks().getPaymentLink()
                .security(GetPaymentLinkSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .xMoovVersion(Versions.V20240000)
                .accountID("34a1451d-384e-4fff-a7ce-e90c2bb61969")
                .paymentLinkCode("uc7ZYKrMhi")
                .call();

        if (res.paymentLink().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                     | Type                                                                                                          | Required                                                                                                      | Description                                                                                                   | Example                                                                                                       |
| ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                    | [io.moov.openapi.models.operations.GetPaymentLinkSecurity](../../models/operations/GetPaymentLinkSecurity.md) | :heavy_check_mark:                                                                                            | The security requirements to use for the request.                                                             |                                                                                                               |
| `xMoovVersion`                                                                                                | [Optional\<Versions>](../../models/components/Versions.md)                                                    | :heavy_minus_sign:                                                                                            | Specify an API version.                                                                                       |                                                                                                               |
| `accountID`                                                                                                   | *String*                                                                                                      | :heavy_check_mark:                                                                                            | N/A                                                                                                           |                                                                                                               |
| `paymentLinkCode`                                                                                             | *String*                                                                                                      | :heavy_check_mark:                                                                                            | N/A                                                                                                           | uc7ZYKrMhi                                                                                                    |

### Response

**[GetPaymentLinkResponse](../../models/operations/GetPaymentLinkResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## updatePaymentLink

Update a payment link.

To access this endpoint using a [token](https://docs.moov.io/api/authentication/access-tokens/) you'll need 
to specify the `/accounts/{accountID}/transfers.write` scope.

### Example Usage

```java
package hello.world;

import io.moov.openapi.Moov;
import io.moov.openapi.models.components.ACHPaymentDetails;
import io.moov.openapi.models.components.CardPaymentDetails;
import io.moov.openapi.models.components.PaymentLinkPaymentDetailsUpdate;
import io.moov.openapi.models.components.PaymentLinkPayoutDetailsUpdate;
import io.moov.openapi.models.components.PayoutRecipientUpdate;
import io.moov.openapi.models.components.SchemeBasicAuth;
import io.moov.openapi.models.components.UpdatePaymentLink;
import io.moov.openapi.models.components.Versions;
import io.moov.openapi.models.errors.GenericError;
import io.moov.openapi.models.errors.UpdatePaymentLinkError;
import io.moov.openapi.models.operations.UpdatePaymentLinkResponse;
import io.moov.openapi.models.operations.UpdatePaymentLinkSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GenericError, UpdatePaymentLinkError, Exception {

        Moov sdk = Moov.builder()
            .build();

        UpdatePaymentLinkResponse res = sdk.paymentLinks().updatePaymentLink()
                .security(UpdatePaymentLinkSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .xMoovVersion(Versions.LATEST)
                .accountID("94fe6aeb-a005-4850-b45d-bb0fa580425d")
                .paymentLinkCode("uc7ZYKrMhi")
                .updatePaymentLink(UpdatePaymentLink.builder()
                    .payment(PaymentLinkPaymentDetailsUpdate.builder()
                        .cardDetails(CardPaymentDetails.builder()
                            .dynamicDescriptor("WhlBdy *Yoga 11-12")
                            .build())
                        .achDetails(ACHPaymentDetails.builder()
                            .companyEntryDescription("Gym dues")
                            .originatingCompanyName("Whole Body Fit")
                            .build())
                        .build())
                    .payout(PaymentLinkPayoutDetailsUpdate.builder()
                        .recipient(PayoutRecipientUpdate.builder()
                            .email("jordan.lee@classbooker.dev")
                            .build())
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

| Parameter                                                                                                           | Type                                                                                                                | Required                                                                                                            | Description                                                                                                         | Example                                                                                                             |
| ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                          | [io.moov.openapi.models.operations.UpdatePaymentLinkSecurity](../../models/operations/UpdatePaymentLinkSecurity.md) | :heavy_check_mark:                                                                                                  | The security requirements to use for the request.                                                                   |                                                                                                                     |
| `xMoovVersion`                                                                                                      | [Optional\<Versions>](../../models/components/Versions.md)                                                          | :heavy_minus_sign:                                                                                                  | Specify an API version.                                                                                             |                                                                                                                     |
| `accountID`                                                                                                         | *String*                                                                                                            | :heavy_check_mark:                                                                                                  | N/A                                                                                                                 |                                                                                                                     |
| `paymentLinkCode`                                                                                                   | *String*                                                                                                            | :heavy_check_mark:                                                                                                  | N/A                                                                                                                 | uc7ZYKrMhi                                                                                                          |
| `updatePaymentLink`                                                                                                 | [UpdatePaymentLink](../../models/components/UpdatePaymentLink.md)                                                   | :heavy_check_mark:                                                                                                  | N/A                                                                                                                 |                                                                                                                     |

### Response

**[UpdatePaymentLinkResponse](../../models/operations/UpdatePaymentLinkResponse.md)**

### Errors

| Error Type                           | Status Code                          | Content Type                         |
| ------------------------------------ | ------------------------------------ | ------------------------------------ |
| models/errors/GenericError           | 400, 409                             | application/json                     |
| models/errors/UpdatePaymentLinkError | 422                                  | application/json                     |
| models/errors/APIException           | 4XX, 5XX                             | \*/\*                                |

## disablePaymentLink

Disable a payment link.

To access this endpoint using a [token](https://docs.moov.io/api/authentication/access-tokens/) you'll need 
to specify the `/accounts/{accountID}/transfers.write` scope.

### Example Usage

```java
package hello.world;

import io.moov.openapi.Moov;
import io.moov.openapi.models.components.SchemeBasicAuth;
import io.moov.openapi.models.components.Versions;
import io.moov.openapi.models.operations.DisablePaymentLinkResponse;
import io.moov.openapi.models.operations.DisablePaymentLinkSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Moov sdk = Moov.builder()
            .build();

        DisablePaymentLinkResponse res = sdk.paymentLinks().disablePaymentLink()
                .security(DisablePaymentLinkSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .xMoovVersion(Versions.LATEST)
                .accountID("edc2775b-a4a3-4513-8870-3bdf4aaaed8e")
                .paymentLinkCode("uc7ZYKrMhi")
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                             | Type                                                                                                                  | Required                                                                                                              | Description                                                                                                           | Example                                                                                                               |
| --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                            | [io.moov.openapi.models.operations.DisablePaymentLinkSecurity](../../models/operations/DisablePaymentLinkSecurity.md) | :heavy_check_mark:                                                                                                    | The security requirements to use for the request.                                                                     |                                                                                                                       |
| `xMoovVersion`                                                                                                        | [Optional\<Versions>](../../models/components/Versions.md)                                                            | :heavy_minus_sign:                                                                                                    | Specify an API version.                                                                                               |                                                                                                                       |
| `accountID`                                                                                                           | *String*                                                                                                              | :heavy_check_mark:                                                                                                    | N/A                                                                                                                   |                                                                                                                       |
| `paymentLinkCode`                                                                                                     | *String*                                                                                                              | :heavy_check_mark:                                                                                                    | N/A                                                                                                                   | uc7ZYKrMhi                                                                                                            |

### Response

**[DisablePaymentLinkResponse](../../models/operations/DisablePaymentLinkResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## getPaymentLinkQRCode

Retrieve the payment link encoded in a QR code. 

Use the `Accept` header to specify the format of the response. Supported formats are `application/json` and `image/png`.

To access this endpoint using a [token](https://docs.moov.io/api/authentication/access-tokens/) you'll need 
to specify the `/accounts/{accountID}/transfers.write` scope.

### Example Usage

```java
package hello.world;

import io.moov.openapi.Moov;
import io.moov.openapi.models.components.SchemeBasicAuth;
import io.moov.openapi.models.components.Versions;
import io.moov.openapi.models.operations.GetPaymentLinkQRCodeResponse;
import io.moov.openapi.models.operations.GetPaymentLinkQRCodeSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Moov sdk = Moov.builder()
            .build();

        GetPaymentLinkQRCodeResponse res = sdk.paymentLinks().getPaymentLinkQRCode()
                .security(GetPaymentLinkQRCodeSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .xMoovVersion(Versions.V20240000)
                .accountID("248ffcf9-c53a-4e8e-a8b8-8c5014496a79")
                .paymentLinkCode("uc7ZYKrMhi")
                .call();

        if (res.qrCode().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                 | Type                                                                                                                      | Required                                                                                                                  | Description                                                                                                               | Example                                                                                                                   |
| ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                                | [io.moov.openapi.models.operations.GetPaymentLinkQRCodeSecurity](../../models/operations/GetPaymentLinkQRCodeSecurity.md) | :heavy_check_mark:                                                                                                        | The security requirements to use for the request.                                                                         |                                                                                                                           |
| `xMoovVersion`                                                                                                            | [Optional\<Versions>](../../models/components/Versions.md)                                                                | :heavy_minus_sign:                                                                                                        | Specify an API version.                                                                                                   |                                                                                                                           |
| `accountID`                                                                                                               | *String*                                                                                                                  | :heavy_check_mark:                                                                                                        | N/A                                                                                                                       |                                                                                                                           |
| `paymentLinkCode`                                                                                                         | *String*                                                                                                                  | :heavy_check_mark:                                                                                                        | N/A                                                                                                                       | uc7ZYKrMhi                                                                                                                |

### Response

**[GetPaymentLinkQRCodeResponse](../../models/operations/GetPaymentLinkQRCodeResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |