# Invoices

## Overview

### Available Operations

* [createInvoice](#createinvoice) - Create an invoice for a Moov account.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/invoices.write` scope.
* [listInvoices](#listinvoices) - List all the invoices created under a Moov account.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/invoices.read` scope.
* [getInvoice](#getinvoice) - Retrieve an invoice by ID.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/invoices.read` scope.
* [updateInvoice](#updateinvoice) - Updates an invoice.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/invoices.write` scope.
* [createInvoicePayment](#createinvoicepayment) - Creates a payment resource to represent that an invoice was paid outside of the Moov platform.
If a payment link was created for the invoice, the corresponding payment link is canceled, but a receipt is still sent.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/invoices.write` scope.
* [listInvoicePayments](#listinvoicepayments) - List all the payments made towards an invoice.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/invoices.read` scope.

## createInvoice

Create an invoice for a Moov account.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/invoices.write` scope.

### Example Usage

<!-- UsageSnippet language="java" operationID="createInvoice" method="post" path="/accounts/{accountID}/invoices" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.*;
import io.moov.sdk.models.errors.CreateInvoiceError;
import io.moov.sdk.models.errors.GenericError;
import io.moov.sdk.models.operations.CreateInvoiceResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws GenericError, CreateInvoiceError, Exception {

        Moov sdk = Moov.builder()
                .xMoovVersion("<value>")
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        CreateInvoiceResponse res = sdk.invoices().createInvoice()
                .accountID("241bf524-e777-4941-a5e4-d7f3f34d7a00")
                .createInvoice(CreateInvoice.builder()
                    .customerAccountID("<id>")
                    .description("austere gah under ew failing provided repeatedly pick onto")
                    .lineItems(CreateInvoiceLineItems.builder()
                        .items(List.of())
                        .build())
                    .taxAmount(AmountDecimal.builder()
                        .currency("USD")
                        .valueDecimal("12.987654321")
                        .build())
                    .build())
                .call();

        if (res.invoice().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                 | Type                                                      | Required                                                  | Description                                               |
| --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- |
| `accountID`                                               | *String*                                                  | :heavy_check_mark:                                        | N/A                                                       |
| `createInvoice`                                           | [CreateInvoice](../../models/components/CreateInvoice.md) | :heavy_check_mark:                                        | N/A                                                       |

### Response

**[CreateInvoiceResponse](../../models/operations/CreateInvoiceResponse.md)**

### Errors

| Error Type                       | Status Code                      | Content Type                     |
| -------------------------------- | -------------------------------- | -------------------------------- |
| models/errors/GenericError       | 400, 409                         | application/json                 |
| models/errors/CreateInvoiceError | 422                              | application/json                 |
| models/errors/APIException       | 4XX, 5XX                         | \*/\*                            |

## listInvoices

List all the invoices created under a Moov account.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/invoices.read` scope.

### Example Usage

<!-- UsageSnippet language="java" operationID="listInvoices" method="get" path="/accounts/{accountID}/invoices" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.errors.ListInvoicesValidationError;
import io.moov.sdk.models.operations.ListInvoicesRequest;
import io.moov.sdk.models.operations.ListInvoicesResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ListInvoicesValidationError, Exception {

        Moov sdk = Moov.builder()
                .xMoovVersion("<value>")
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        ListInvoicesRequest req = ListInvoicesRequest.builder()
                .accountID("114b02db-e4ca-47de-acc9-5624f4afccb5")
                .skip(60L)
                .count(20L)
                .build();

        ListInvoicesResponse res = sdk.invoices().listInvoices()
                .request(req)
                .call();

        if (res.invoices().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [ListInvoicesRequest](../../models/operations/ListInvoicesRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[ListInvoicesResponse](../../models/operations/ListInvoicesResponse.md)**

### Errors

| Error Type                                | Status Code                               | Content Type                              |
| ----------------------------------------- | ----------------------------------------- | ----------------------------------------- |
| models/errors/ListInvoicesValidationError | 422                                       | application/json                          |
| models/errors/APIException                | 4XX, 5XX                                  | \*/\*                                     |

## getInvoice

Retrieve an invoice by ID.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/invoices.read` scope.

### Example Usage

<!-- UsageSnippet language="java" operationID="getInvoice" method="get" path="/accounts/{accountID}/invoices/{invoiceID}" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.operations.GetInvoiceResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Moov sdk = Moov.builder()
                .xMoovVersion("<value>")
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        GetInvoiceResponse res = sdk.invoices().getInvoice()
                .accountID("3ecce96f-a052-4c96-b389-98e880af1ab4")
                .invoiceID("fc90d016-39ea-4110-b77a-2e1c95827f46")
                .call();

        if (res.invoice().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `accountID`        | *String*           | :heavy_check_mark: | N/A                |
| `invoiceID`        | *String*           | :heavy_check_mark: | N/A                |

### Response

**[GetInvoiceResponse](../../models/operations/GetInvoiceResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## updateInvoice

Updates an invoice.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/invoices.write` scope.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateInvoice" method="patch" path="/accounts/{accountID}/invoices/{invoiceID}" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.*;
import io.moov.sdk.models.errors.GenericError;
import io.moov.sdk.models.errors.UpdateInvoiceError;
import io.moov.sdk.models.operations.UpdateInvoiceResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws GenericError, UpdateInvoiceError, Exception {

        Moov sdk = Moov.builder()
                .xMoovVersion("<value>")
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        UpdateInvoiceResponse res = sdk.invoices().updateInvoice()
                .accountID("ce46d65a-8504-4afa-b3f7-303401bd08b3")
                .invoiceID("ef510999-370a-4350-87d5-bc81fc02a2ea")
                .updateInvoice(UpdateInvoice.builder()
                    .lineItems(CreateInvoiceLineItemsUpdate.builder()
                        .items(List.of(
                            CreateInvoiceLineItem.builder()
                                .name("<value>")
                                .basePrice(AmountDecimal.builder()
                                    .currency("USD")
                                    .valueDecimal("12.987654321")
                                    .build())
                                .quantity(984515)
                                .options(List.of(
                                    CreateInvoiceLineItemOption.builder()
                                        .name("<value>")
                                        .quantity(761923)
                                        .priceModifier(AmountDecimal.builder()
                                            .currency("USD")
                                            .valueDecimal("12.987654321")
                                            .build())
                                        .build()))
                                .build()))
                        .build())
                    .taxAmount(AmountDecimalUpdate.builder()
                        .currency("USD")
                        .valueDecimal("12.987654321")
                        .build())
                    .build())
                .call();

        if (res.invoice().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                 | Type                                                      | Required                                                  | Description                                               |
| --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- |
| `accountID`                                               | *String*                                                  | :heavy_check_mark:                                        | N/A                                                       |
| `invoiceID`                                               | *String*                                                  | :heavy_check_mark:                                        | N/A                                                       |
| `updateInvoice`                                           | [UpdateInvoice](../../models/components/UpdateInvoice.md) | :heavy_check_mark:                                        | N/A                                                       |

### Response

**[UpdateInvoiceResponse](../../models/operations/UpdateInvoiceResponse.md)**

### Errors

| Error Type                       | Status Code                      | Content Type                     |
| -------------------------------- | -------------------------------- | -------------------------------- |
| models/errors/GenericError       | 400, 409                         | application/json                 |
| models/errors/UpdateInvoiceError | 422                              | application/json                 |
| models/errors/APIException       | 4XX, 5XX                         | \*/\*                            |

## createInvoicePayment

Creates a payment resource to represent that an invoice was paid outside of the Moov platform.
If a payment link was created for the invoice, the corresponding payment link is canceled, but a receipt is still sent.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/invoices.write` scope.

### Example Usage

<!-- UsageSnippet language="java" operationID="createInvoicePayment" method="post" path="/accounts/{accountID}/invoices/{invoiceID}/payments" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.CreateInvoicePayment;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.errors.CreateInvoicePaymentError;
import io.moov.sdk.models.errors.GenericError;
import io.moov.sdk.models.operations.CreateInvoicePaymentResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GenericError, CreateInvoicePaymentError, Exception {

        Moov sdk = Moov.builder()
                .xMoovVersion("<value>")
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        CreateInvoicePaymentResponse res = sdk.invoices().createInvoicePayment()
                .accountID("e02333e4-a835-46d1-8d02-9af7a405e65f")
                .invoiceID("99e7ebb0-9996-49b2-98f0-304c7332ece6")
                .createInvoicePayment(CreateInvoicePayment.builder()
                    .build())
                .call();

        if (res.invoicePayment().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `accountID`                                                             | *String*                                                                | :heavy_check_mark:                                                      | N/A                                                                     |
| `invoiceID`                                                             | *String*                                                                | :heavy_check_mark:                                                      | N/A                                                                     |
| `createInvoicePayment`                                                  | [CreateInvoicePayment](../../models/components/CreateInvoicePayment.md) | :heavy_check_mark:                                                      | N/A                                                                     |

### Response

**[CreateInvoicePaymentResponse](../../models/operations/CreateInvoicePaymentResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| models/errors/GenericError              | 400, 409                                | application/json                        |
| models/errors/CreateInvoicePaymentError | 422                                     | application/json                        |
| models/errors/APIException              | 4XX, 5XX                                | \*/\*                                   |

## listInvoicePayments

List all the payments made towards an invoice.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/invoices.read` scope.

### Example Usage

<!-- UsageSnippet language="java" operationID="listInvoicePayments" method="get" path="/accounts/{accountID}/invoices/{invoiceID}/payments" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.operations.ListInvoicePaymentsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Moov sdk = Moov.builder()
                .xMoovVersion("<value>")
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        ListInvoicePaymentsResponse res = sdk.invoices().listInvoicePayments()
                .accountID("dcfbb04d-465e-4dbc-ad14-420961d94d21")
                .invoiceID("d25d8b7f-bb29-420c-8185-4ed9df60ba13")
                .call();

        if (res.invoicePayments().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `accountID`        | *String*           | :heavy_check_mark: | N/A                |
| `invoiceID`        | *String*           | :heavy_check_mark: | N/A                |

### Response

**[ListInvoicePaymentsResponse](../../models/operations/ListInvoicePaymentsResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |