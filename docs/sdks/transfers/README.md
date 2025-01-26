# Transfers
(*transfers()*)

## Overview

### Available Operations

* [create](#create) - Move money by providing the source, destination, and amount in the request body.

Read our [transfers overview guide](https://docs.moov.io/guides/money-movement/overview/) to learn more. 

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/transfers.write` scope.
* [list](#list) - List all the transfers associated with a particular Moov account. 

Read our [transfers overview guide](https://docs.moov.io/guides/money-movement/overview/) to learn more. 

When you run this request, you retrieve 200 transfers at a time. You can advance past a results set of 200 transfers by using the `skip` parameter (for example, 
if you set `skip`= 10, you will see a results set of 200 transfers after the first 2000). If you are searching a high volume of transfers, the request will likely 
process very slowly. To achieve faster performance, restrict the data as much as you can by using the `StartDateTime` and `EndDateTime` parameters for a limited 
period of time. You can run multiple requests in smaller time window increments until you've retrieved all the transfers you need.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/transfers.read` scope.
* [get](#get) - Retrieve full transfer details for an individual transfer of a particular Moov account. 

Payment rail-specific details are included in the source and destination. Read our [transfers overview guide](https://docs.moov.io/guides/money-movement/overview/) 
to learn more.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/transfers.read` scope.
* [update](#update) - Update the metadata contained on a transfer. 

Read our [transfers overview guide](https://docs.moov.io/guides/money-movement/overview/) to learn more. 

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/transfers.write` scope.
* [initiateRefund](#initiaterefund) - Initiate a refund for a card transfer.

**Use the [Cancel or refund a card transfer](https://docs.moov.io/api/money-movement/refunds/cancel/) endpoint for more comprehensive cancel and refund options.**    
See the [reversals](https://docs.moov.io/guides/money-movement/accept-payments/card-acceptance/reversals/) guide for more information. 

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/transfers.write` scope.
* [listRefunds](#listrefunds) - Get a list of refunds for a card transfer.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/transfers.read` scope.
* [getRefund](#getrefund) - Get details of a refund for a card transfer.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/transfers.read` scope.
* [createReversal](#createreversal) - Reverses a card transfer by initiating a cancellation or refund depending on the transaction status. 
Read our [reversals guide](https://docs.moov.io/guides/money-movement/accept-payments/card-acceptance/reversals/) 
to learn more.

To access this endpoint using a [token](https://docs.moov.io/api/authentication/access-tokens/) you'll need 
to specify the `/accounts/{accountID}/transfers.write` scope.
* [generateOptions](#generateoptions) - Generate available payment method options for one or multiple transfer participants depending on the accountID or paymentMethodID you 
supply in the request. 

Read our [transfers overview guide](https://docs.moov.io/guides/money-movement/overview/) to learn more.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/transfers.read` scope.

## create

Move money by providing the source, destination, and amount in the request body.

Read our [transfers overview guide](https://docs.moov.io/guides/money-movement/overview/) to learn more. 

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/transfers.write` scope.

### Example Usage

```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.Amount;
import io.moov.sdk.models.components.CreateTransfer;
import io.moov.sdk.models.components.CreateTransferDestination;
import io.moov.sdk.models.components.CreateTransferDestinationACH;
import io.moov.sdk.models.components.CreateTransferDestinationCard;
import io.moov.sdk.models.components.CreateTransferSource;
import io.moov.sdk.models.components.CreateTransferSourceACH;
import io.moov.sdk.models.components.CreateTransferSourceCard;
import io.moov.sdk.models.components.DebitHoldPeriod;
import io.moov.sdk.models.components.FacilitatorFee;
import io.moov.sdk.models.components.SchemeBasicAuth;
import io.moov.sdk.models.errors.GenericError;
import io.moov.sdk.models.errors.Transfer;
import io.moov.sdk.models.errors.TransferValidationError;
import io.moov.sdk.models.operations.CreateTransferRequest;
import io.moov.sdk.models.operations.CreateTransferResponse;
import io.moov.sdk.models.operations.CreateTransferSecurity;
import java.lang.Exception;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws GenericError, Transfer, TransferValidationError, Exception {

        Moov sdk = Moov.builder()
            .build();

        CreateTransferRequest req = CreateTransferRequest.builder()
                .xIdempotencyKey("f9d459c6-642b-4b0f-a642-2a074eb6b54d")
                .accountID("0bdee4f2-70df-485e-8104-60745a118ebb")
                .createTransfer(CreateTransfer.builder()
                    .source(CreateTransferSource.builder()
                        .paymentMethodID("9506dbf6-4208-44c3-ad8a-e4431660e1f2")
                        .cardDetails(CreateTransferSourceCard.builder()
                            .dynamicDescriptor("WhlBdy *Yoga 11-12")
                            .build())
                        .achDetails(CreateTransferSourceACH.builder()
                            .companyEntryDescription("Gym dues")
                            .originatingCompanyName("Whole Body Fit")
                            .debitHoldPeriod(DebitHoldPeriod.TWO_DAYS)
                            .build())
                        .build())
                    .destination(CreateTransferDestination.builder()
                        .paymentMethodID("3f9969cf-a1f3-4d83-8ddc-229a506651cf")
                        .cardDetails(CreateTransferDestinationCard.builder()
                            .dynamicDescriptor("WhlBdy *Yoga 11-12")
                            .build())
                        .achDetails(CreateTransferDestinationACH.builder()
                            .companyEntryDescription("Gym dues")
                            .originatingCompanyName("Whole Body Fit")
                            .build())
                        .build())
                    .amount(Amount.builder()
                        .currency("USD")
                        .value(1204L)
                        .build())
                    .facilitatorFee(FacilitatorFee.builder()
                        .totalDecimal("12.987654321")
                        .markupDecimal("0.987654321")
                        .build())
                    .description("Pay Instructor for May 15 Class")
                    .metadata(Map.ofEntries(
                        Map.entry("optional", "metadata")))
                    .build())
                .build();

        CreateTransferResponse res = sdk.transfers().create()
                .request(req)
                .security(CreateTransferSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .call();

        if (res.oneOf().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                 | Type                                                                                                      | Required                                                                                                  | Description                                                                                               |
| --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                 | [CreateTransferRequest](../../models/operations/CreateTransferRequest.md)                                 | :heavy_check_mark:                                                                                        | The request object to use for the request.                                                                |
| `security`                                                                                                | [io.moov.sdk.models.operations.CreateTransferSecurity](../../models/operations/CreateTransferSecurity.md) | :heavy_check_mark:                                                                                        | The security requirements to use for the request.                                                         |

### Response

**[CreateTransferResponse](../../models/operations/CreateTransferResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/GenericError            | 400                                   | application/json                      |
| models/errors/Transfer                | 409                                   | application/json                      |
| models/errors/TransferValidationError | 422                                   | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |

## list

List all the transfers associated with a particular Moov account. 

Read our [transfers overview guide](https://docs.moov.io/guides/money-movement/overview/) to learn more. 

When you run this request, you retrieve 200 transfers at a time. You can advance past a results set of 200 transfers by using the `skip` parameter (for example, 
if you set `skip`= 10, you will see a results set of 200 transfers after the first 2000). If you are searching a high volume of transfers, the request will likely 
process very slowly. To achieve faster performance, restrict the data as much as you can by using the `StartDateTime` and `EndDateTime` parameters for a limited 
period of time. You can run multiple requests in smaller time window increments until you've retrieved all the transfers you need.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/transfers.read` scope.

### Example Usage

```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.SchemeBasicAuth;
import io.moov.sdk.models.operations.ListTransfersRequest;
import io.moov.sdk.models.operations.ListTransfersResponse;
import io.moov.sdk.models.operations.ListTransfersSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Moov sdk = Moov.builder()
            .build();

        ListTransfersRequest req = ListTransfersRequest.builder()
                .accountID("a7b433e5-531c-406b-bf40-4cde3c83fab5")
                .skip(60L)
                .count(20L)
                .build();

        ListTransfersResponse res = sdk.transfers().list()
                .request(req)
                .security(ListTransfersSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .call();

        if (res.transfers().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                               | Type                                                                                                    | Required                                                                                                | Description                                                                                             |
| ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- |
| `request`                                                                                               | [ListTransfersRequest](../../models/operations/ListTransfersRequest.md)                                 | :heavy_check_mark:                                                                                      | The request object to use for the request.                                                              |
| `security`                                                                                              | [io.moov.sdk.models.operations.ListTransfersSecurity](../../models/operations/ListTransfersSecurity.md) | :heavy_check_mark:                                                                                      | The security requirements to use for the request.                                                       |

### Response

**[ListTransfersResponse](../../models/operations/ListTransfersResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## get

Retrieve full transfer details for an individual transfer of a particular Moov account. 

Payment rail-specific details are included in the source and destination. Read our [transfers overview guide](https://docs.moov.io/guides/money-movement/overview/) 
to learn more.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/transfers.read` scope.

### Example Usage

```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.SchemeBasicAuth;
import io.moov.sdk.models.components.Versions;
import io.moov.sdk.models.operations.GetTransferResponse;
import io.moov.sdk.models.operations.GetTransferSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Moov sdk = Moov.builder()
            .build();

        GetTransferResponse res = sdk.transfers().get()
                .security(GetTransferSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .xMoovVersion(Versions.V202510)
                .transferID("64607ba5-82d4-4278-93b5-c5c5ca5c9cd8")
                .accountID("cb1b48c3-1c11-4648-aa00-691b74c9ea1b")
                .call();

        if (res.transfer().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `security`                                                                                          | [io.moov.sdk.models.operations.GetTransferSecurity](../../models/operations/GetTransferSecurity.md) | :heavy_check_mark:                                                                                  | The security requirements to use for the request.                                                   |
| `xMoovVersion`                                                                                      | [Optional\<Versions>](../../models/components/Versions.md)                                          | :heavy_minus_sign:                                                                                  | Specify an API version.                                                                             |
| `transferID`                                                                                        | *String*                                                                                            | :heavy_check_mark:                                                                                  | Identifier for the transfer.                                                                        |
| `accountID`                                                                                         | *String*                                                                                            | :heavy_check_mark:                                                                                  | N/A                                                                                                 |

### Response

**[GetTransferResponse](../../models/operations/GetTransferResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## update

Update the metadata contained on a transfer. 

Read our [transfers overview guide](https://docs.moov.io/guides/money-movement/overview/) to learn more. 

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/transfers.write` scope.

### Example Usage

```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.SchemeBasicAuth;
import io.moov.sdk.models.components.Versions;
import io.moov.sdk.models.operations.UpdateTransferResponse;
import io.moov.sdk.models.operations.UpdateTransferSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Moov sdk = Moov.builder()
            .build();

        UpdateTransferResponse res = sdk.transfers().update()
                .security(UpdateTransferSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .xMoovVersion(Versions.LATEST)
                .transferID("d95fa7f0-e743-42ce-b47c-b60cc78135dd")
                .accountID("b85898c1-25a1-4907-a1c5-562af6646dad")
                .call();

        if (res.transfer().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                 | Type                                                                                                      | Required                                                                                                  | Description                                                                                               |
| --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                | [io.moov.sdk.models.operations.UpdateTransferSecurity](../../models/operations/UpdateTransferSecurity.md) | :heavy_check_mark:                                                                                        | The security requirements to use for the request.                                                         |
| `xMoovVersion`                                                                                            | [Optional\<Versions>](../../models/components/Versions.md)                                                | :heavy_minus_sign:                                                                                        | Specify an API version.                                                                                   |
| `transferID`                                                                                              | *String*                                                                                                  | :heavy_check_mark:                                                                                        | Identifier for the transfer.                                                                              |
| `accountID`                                                                                               | *String*                                                                                                  | :heavy_check_mark:                                                                                        | N/A                                                                                                       |

### Response

**[UpdateTransferResponse](../../models/operations/UpdateTransferResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## initiateRefund

Initiate a refund for a card transfer.

**Use the [Cancel or refund a card transfer](https://docs.moov.io/api/money-movement/refunds/cancel/) endpoint for more comprehensive cancel and refund options.**    
See the [reversals](https://docs.moov.io/guides/money-movement/accept-payments/card-acceptance/reversals/) guide for more information. 

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/transfers.write` scope.

### Example Usage

```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.CreateRefund;
import io.moov.sdk.models.components.SchemeBasicAuth;
import io.moov.sdk.models.errors.CardAcquiringRefund;
import io.moov.sdk.models.errors.GenericError;
import io.moov.sdk.models.errors.RefundValidationError;
import io.moov.sdk.models.operations.InitiateRefundRequest;
import io.moov.sdk.models.operations.InitiateRefundResponse;
import io.moov.sdk.models.operations.InitiateRefundSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GenericError, CardAcquiringRefund, RefundValidationError, Exception {

        Moov sdk = Moov.builder()
            .build();

        InitiateRefundRequest req = InitiateRefundRequest.builder()
                .xIdempotencyKey("bdfa6a76-31f8-4cdf-a007-3d8aac713b91")
                .accountID("9b1350b2-a5be-41e3-92be-61f5cf4372a8")
                .transferID("7390ad29-1a0d-4a0c-8c17-da1708ee9ac2")
                .createRefund(CreateRefund.builder()
                    .amount(1000L)
                    .build())
                .build();

        InitiateRefundResponse res = sdk.transfers().initiateRefund()
                .request(req)
                .security(InitiateRefundSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .call();

        if (res.createRefundResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                 | Type                                                                                                      | Required                                                                                                  | Description                                                                                               |
| --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                 | [InitiateRefundRequest](../../models/operations/InitiateRefundRequest.md)                                 | :heavy_check_mark:                                                                                        | The request object to use for the request.                                                                |
| `security`                                                                                                | [io.moov.sdk.models.operations.InitiateRefundSecurity](../../models/operations/InitiateRefundSecurity.md) | :heavy_check_mark:                                                                                        | The security requirements to use for the request.                                                         |

### Response

**[InitiateRefundResponse](../../models/operations/InitiateRefundResponse.md)**

### Errors

| Error Type                          | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/GenericError          | 400                                 | application/json                    |
| models/errors/CardAcquiringRefund   | 409                                 | application/json                    |
| models/errors/RefundValidationError | 422                                 | application/json                    |
| models/errors/APIException          | 4XX, 5XX                            | \*/\*                               |

## listRefunds

Get a list of refunds for a card transfer.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/transfers.read` scope.

### Example Usage

```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.SchemeBasicAuth;
import io.moov.sdk.models.components.Versions;
import io.moov.sdk.models.operations.ListRefundsResponse;
import io.moov.sdk.models.operations.ListRefundsSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Moov sdk = Moov.builder()
            .build();

        ListRefundsResponse res = sdk.transfers().listRefunds()
                .security(ListRefundsSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .xMoovVersion(Versions.V202504)
                .accountID("7d74a845-fe17-4ebe-a05e-71847ef8c510")
                .transferID("d081988f-448f-492c-8c60-836126fa0dfb")
                .call();

        if (res.cardAcquiringRefunds().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `security`                                                                                          | [io.moov.sdk.models.operations.ListRefundsSecurity](../../models/operations/ListRefundsSecurity.md) | :heavy_check_mark:                                                                                  | The security requirements to use for the request.                                                   |
| `xMoovVersion`                                                                                      | [Optional\<Versions>](../../models/components/Versions.md)                                          | :heavy_minus_sign:                                                                                  | Specify an API version.                                                                             |
| `accountID`                                                                                         | *String*                                                                                            | :heavy_check_mark:                                                                                  | N/A                                                                                                 |
| `transferID`                                                                                        | *String*                                                                                            | :heavy_check_mark:                                                                                  | Identifier for the transfer.                                                                        |

### Response

**[ListRefundsResponse](../../models/operations/ListRefundsResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## getRefund

Get details of a refund for a card transfer.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/transfers.read` scope.

### Example Usage

```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.SchemeBasicAuth;
import io.moov.sdk.models.components.Versions;
import io.moov.sdk.models.operations.GetRefundResponse;
import io.moov.sdk.models.operations.GetRefundSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Moov sdk = Moov.builder()
            .build();

        GetRefundResponse res = sdk.transfers().getRefund()
                .security(GetRefundSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .xMoovVersion(Versions.V202510)
                .transferID("dbc09cb2-ef99-4553-8501-94323f377dbf")
                .accountID("7f90bf73-6fb7-41e7-90aa-a9133e7d92c2")
                .refundID("0f86fa43-1a9b-4a5d-8227-f253063f7fb1")
                .call();

        if (res.cardAcquiringRefund().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `security`                                                                                      | [io.moov.sdk.models.operations.GetRefundSecurity](../../models/operations/GetRefundSecurity.md) | :heavy_check_mark:                                                                              | The security requirements to use for the request.                                               |
| `xMoovVersion`                                                                                  | [Optional\<Versions>](../../models/components/Versions.md)                                      | :heavy_minus_sign:                                                                              | Specify an API version.                                                                         |
| `transferID`                                                                                    | *String*                                                                                        | :heavy_check_mark:                                                                              | Identifier for the transfer.                                                                    |
| `accountID`                                                                                     | *String*                                                                                        | :heavy_check_mark:                                                                              | N/A                                                                                             |
| `refundID`                                                                                      | *String*                                                                                        | :heavy_check_mark:                                                                              | Identifier for the refund.                                                                      |

### Response

**[GetRefundResponse](../../models/operations/GetRefundResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## createReversal

Reverses a card transfer by initiating a cancellation or refund depending on the transaction status. 
Read our [reversals guide](https://docs.moov.io/guides/money-movement/accept-payments/card-acceptance/reversals/) 
to learn more.

To access this endpoint using a [token](https://docs.moov.io/api/authentication/access-tokens/) you'll need 
to specify the `/accounts/{accountID}/transfers.write` scope.

### Example Usage

```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.CreateReversal;
import io.moov.sdk.models.components.SchemeBasicAuth;
import io.moov.sdk.models.errors.GenericError;
import io.moov.sdk.models.errors.ReversalValidationError;
import io.moov.sdk.models.operations.CreateReversalRequest;
import io.moov.sdk.models.operations.CreateReversalResponse;
import io.moov.sdk.models.operations.CreateReversalSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GenericError, ReversalValidationError, Exception {

        Moov sdk = Moov.builder()
            .build();

        CreateReversalRequest req = CreateReversalRequest.builder()
                .xIdempotencyKey("9d4b2ed0-777b-40e6-ba88-d6ca730c3503")
                .accountID("16452b89-d33c-4be9-8f92-205130a46467")
                .transferID("c7f1b114-0545-47ba-9d79-fdba229c3df7")
                .createReversal(CreateReversal.builder()
                    .amount(1000L)
                    .build())
                .build();

        CreateReversalResponse res = sdk.transfers().createReversal()
                .request(req)
                .security(CreateReversalSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .call();

        if (res.reversal().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                 | Type                                                                                                      | Required                                                                                                  | Description                                                                                               |
| --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                 | [CreateReversalRequest](../../models/operations/CreateReversalRequest.md)                                 | :heavy_check_mark:                                                                                        | The request object to use for the request.                                                                |
| `security`                                                                                                | [io.moov.sdk.models.operations.CreateReversalSecurity](../../models/operations/CreateReversalSecurity.md) | :heavy_check_mark:                                                                                        | The security requirements to use for the request.                                                         |

### Response

**[CreateReversalResponse](../../models/operations/CreateReversalResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/GenericError            | 400, 409                              | application/json                      |
| models/errors/ReversalValidationError | 422                                   | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |

## generateOptions

Generate available payment method options for one or multiple transfer participants depending on the accountID or paymentMethodID you 
supply in the request. 

Read our [transfers overview guide](https://docs.moov.io/guides/money-movement/overview/) to learn more.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/transfers.read` scope.

### Example Usage

```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.SchemeBasicAuth;
import io.moov.sdk.models.components.Versions;
import io.moov.sdk.models.errors.GenericError;
import io.moov.sdk.models.errors.TransferOptionsValidationError;
import io.moov.sdk.models.operations.CreateTransferOptionsResponse;
import io.moov.sdk.models.operations.CreateTransferOptionsSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GenericError, TransferOptionsValidationError, Exception {

        Moov sdk = Moov.builder()
            .build();

        CreateTransferOptionsResponse res = sdk.transfers().generateOptions()
                .security(CreateTransferOptionsSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .xMoovVersion(Versions.V202504)
                .call();

        if (res.transferOptions().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                               | Type                                                                                                                    | Required                                                                                                                | Description                                                                                                             |
| ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                              | [io.moov.sdk.models.operations.CreateTransferOptionsSecurity](../../models/operations/CreateTransferOptionsSecurity.md) | :heavy_check_mark:                                                                                                      | The security requirements to use for the request.                                                                       |
| `xMoovVersion`                                                                                                          | [Optional\<Versions>](../../models/components/Versions.md)                                                              | :heavy_minus_sign:                                                                                                      | Specify an API version.                                                                                                 |

### Response

**[CreateTransferOptionsResponse](../../models/operations/CreateTransferOptionsResponse.md)**

### Errors

| Error Type                                   | Status Code                                  | Content Type                                 |
| -------------------------------------------- | -------------------------------------------- | -------------------------------------------- |
| models/errors/GenericError                   | 400                                          | application/json                             |
| models/errors/TransferOptionsValidationError | 422                                          | application/json                             |
| models/errors/APIException                   | 4XX, 5XX                                     | \*/\*                                        |