# Transfers

## Overview

### Available Operations

* [generateOptions](#generateoptions) - Generate available payment method options for one or multiple transfer participants depending on the accountID or paymentMethodID you 
supply in the request body.

The accountID in the route should the partner's accountID.

Read our [transfers overview guide](https://docs.moov.io/guides/money-movement/overview/) to learn more.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/transfers.write` scope.
* [create](#create) - Move money by providing the source, destination, and amount in the request body.

Read our [transfers overview guide](https://docs.moov.io/guides/money-movement/overview/) to learn more. 

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/transfers.write` scope.
* [list](#list) - List all the transfers associated with a particular Moov account. 

Read our [transfers overview guide](https://docs.moov.io/guides/money-movement/overview/) to learn more. 

When you run this request, you retrieve 200 transfers at a time. You can advance past a results set of 200 transfers by using the `skip` parameter (for example, 
if you set `skip`= 10, you will see a results set of 200 transfers after the first 10). If you are searching a high volume of transfers, the request will likely 
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
* [createCancellation](#createcancellation) -   Initiate a cancellation for a card, ACH, or queued transfer.
  
  To access this endpoint using a [token](https://docs.moov.io/api/authentication/access-tokens/) you'll need 
  to specify the `/accounts/{accountID}/transfers.write` scope.
* [getCancellation](#getcancellation) -   Get details of a cancellation for a transfer.
  
  To access this endpoint using a [token](https://docs.moov.io/api/authentication/access-tokens/) you'll need 
  to specify the `/accounts/{accountID}/transfers.read` scope.
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

## generateOptions

Generate available payment method options for one or multiple transfer participants depending on the accountID or paymentMethodID you 
supply in the request body.

The accountID in the route should the partner's accountID.

Read our [transfers overview guide](https://docs.moov.io/guides/money-movement/overview/) to learn more.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/transfers.write` scope.

### Example Usage

<!-- UsageSnippet language="java" operationID="createTransferOptions" method="post" path="/accounts/{accountID}/transfer-options" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.*;
import io.moov.sdk.models.errors.GenericError;
import io.moov.sdk.models.errors.TransferOptionsValidationError;
import io.moov.sdk.models.operations.CreateTransferOptionsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GenericError, TransferOptionsValidationError, Exception {

        Moov sdk = Moov.builder()
                .xMoovVersion("v2024.01.00")
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        CreateTransferOptionsResponse res = sdk.transfers().generateOptions()
                .accountID("deafe3cf-31d4-4dcc-8176-3d6bf8bb4f04")
                .createTransferOptions(CreateTransferOptions.builder()
                    .source(SourceDestinationOptions.builder()
                        .build())
                    .destination(SourceDestinationOptions.builder()
                        .build())
                    .amount(Amount.builder()
                        .currency("USD")
                        .value(1204L)
                        .build())
                    .build())
                .call();

        if (res.transferOptions().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `accountID`                                                               | *String*                                                                  | :heavy_check_mark:                                                        | The partner's Moov account ID.                                            |
| `createTransferOptions`                                                   | [CreateTransferOptions](../../models/components/CreateTransferOptions.md) | :heavy_check_mark:                                                        | N/A                                                                       |

### Response

**[CreateTransferOptionsResponse](../../models/operations/CreateTransferOptionsResponse.md)**

### Errors

| Error Type                                   | Status Code                                  | Content Type                                 |
| -------------------------------------------- | -------------------------------------------- | -------------------------------------------- |
| models/errors/GenericError                   | 400                                          | application/json                             |
| models/errors/TransferOptionsValidationError | 422                                          | application/json                             |
| models/errors/APIException                   | 4XX, 5XX                                     | \*/\*                                        |

## create

Move money by providing the source, destination, and amount in the request body.

Read our [transfers overview guide](https://docs.moov.io/guides/money-movement/overview/) to learn more. 

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/transfers.write` scope.

### Example Usage: Created async transfer

<!-- UsageSnippet language="java" operationID="createTransfer" method="post" path="/accounts/{accountID}/transfers" example="Created async transfer" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.*;
import io.moov.sdk.models.errors.*;
import io.moov.sdk.models.operations.CreateTransferResponse;
import java.lang.Exception;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws GenericError, Transfer, TransferValidationError, Exception {

        Moov sdk = Moov.builder()
                .xMoovVersion("v2024.01.00")
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        CreateTransferResponse res = sdk.transfers().create()
                .xIdempotencyKey("6de5561f-5a9f-4bd3-a458-ce0baacae20d")
                .accountID("d5696c5b-7106-4093-8a7d-faa71dda002c")
                .createTransfer(CreateTransfer.builder()
                    .source(CreateTransferSource.builder()
                        .paymentMethodID("9506dbf6-4208-44c3-ad8a-e4431660e1f2")
                        .build())
                    .destination(CreateTransferDestination.builder()
                        .paymentMethodID("3f9969cf-a1f3-4d83-8ddc-229a506651cf")
                        .build())
                    .amount(Amount.builder()
                        .currency("USD")
                        .value(32945L)
                        .build())
                    .description("Transfer from card to wallet")
                    .metadata(Map.ofEntries(
                        Map.entry("optional", "metadata")))
                    .build())
                .call();

        if (res.createdTransfer().isPresent()) {
            // handle response
        }
    }
}
```
### Example Usage: Created synchronous transfer

<!-- UsageSnippet language="java" operationID="createTransfer" method="post" path="/accounts/{accountID}/transfers" example="Created synchronous transfer" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.*;
import io.moov.sdk.models.errors.*;
import io.moov.sdk.models.operations.CreateTransferResponse;
import java.lang.Exception;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws GenericError, Transfer, TransferValidationError, Exception {

        Moov sdk = Moov.builder()
                .xMoovVersion("v2024.01.00")
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        CreateTransferResponse res = sdk.transfers().create()
                .xIdempotencyKey("d6903402-776f-48d6-8fba-0358959d34e5")
                .accountID("ea9f2225-403b-4e2c-93b0-0eda090ffa65")
                .createTransfer(CreateTransfer.builder()
                    .source(CreateTransferSource.builder()
                        .paymentMethodID("9506dbf6-4208-44c3-ad8a-e4431660e1f2")
                        .build())
                    .destination(CreateTransferDestination.builder()
                        .paymentMethodID("3f9969cf-a1f3-4d83-8ddc-229a506651cf")
                        .build())
                    .amount(Amount.builder()
                        .currency("USD")
                        .value(32945L)
                        .build())
                    .description("Transfer from card to wallet")
                    .metadata(Map.ofEntries(
                        Map.entry("optional", "metadata")))
                    .build())
                .call();

        if (res.createdTransfer().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                                                                                                         | Type                                                                                                                                                                                                                                                                                              | Required                                                                                                                                                                                                                                                                                          | Description                                                                                                                                                                                                                                                                                       | Example                                                                                                                                                                                                                                                                                           |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `xIdempotencyKey`                                                                                                                                                                                                                                                                                 | *String*                                                                                                                                                                                                                                                                                          | :heavy_check_mark:                                                                                                                                                                                                                                                                                | Identifies a unique request to create a transfer.<br/>In order to avoid creating duplicate transfers, the same idempotency key should be reused when retrying a request.                                                                                                                          |                                                                                                                                                                                                                                                                                                   |
| `xWaitFor`                                                                                                                                                                                                                                                                                        | [Optional\<TransferWaitFor>](../../models/components/TransferWaitFor.md)                                                                                                                                                                                                                          | :heavy_minus_sign:                                                                                                                                                                                                                                                                                | Optional header that indicates whether to return a synchronous response that includes full transfer and rail-specific details or an <br/>asynchronous response indicating the transfer was created (this is the default response if the header is omitted). A timeout will occur after 15 seconds. |                                                                                                                                                                                                                                                                                                   |
| `accountID`                                                                                                                                                                                                                                                                                       | *String*                                                                                                                                                                                                                                                                                          | :heavy_check_mark:                                                                                                                                                                                                                                                                                | Your Moov account ID.                                                                                                                                                                                                                                                                             |                                                                                                                                                                                                                                                                                                   |
| `createTransfer`                                                                                                                                                                                                                                                                                  | [CreateTransfer](../../models/components/CreateTransfer.md)                                                                                                                                                                                                                                       | :heavy_check_mark:                                                                                                                                                                                                                                                                                | N/A                                                                                                                                                                                                                                                                                               | {<br/>"source": {<br/>"paymentMethodID": "9506dbf6-4208-44c3-ad8a-e4431660e1f2"<br/>},<br/>"destination": {<br/>"paymentMethodID": "3f9969cf-a1f3-4d83-8ddc-229a506651cf"<br/>},<br/>"amount": {<br/>"currency": "USD",<br/>"value": 32945<br/>},<br/>"description": "Transfer from card to wallet",<br/>"metadata": {<br/>"optional": "metadata"<br/>}<br/>} |

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
if you set `skip`= 10, you will see a results set of 200 transfers after the first 10). If you are searching a high volume of transfers, the request will likely 
process very slowly. To achieve faster performance, restrict the data as much as you can by using the `StartDateTime` and `EndDateTime` parameters for a limited 
period of time. You can run multiple requests in smaller time window increments until you've retrieved all the transfers you need.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/transfers.read` scope.

### Example Usage

<!-- UsageSnippet language="java" operationID="listTransfers" method="get" path="/accounts/{accountID}/transfers" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.errors.ListTransfersValidationError;
import io.moov.sdk.models.operations.ListTransfersRequest;
import io.moov.sdk.models.operations.ListTransfersResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ListTransfersValidationError, Exception {

        Moov sdk = Moov.builder()
                .xMoovVersion("v2024.01.00")
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        ListTransfersRequest req = ListTransfersRequest.builder()
                .accountID("0579c895-4d2b-4024-8092-f71b80ab5d00")
                .skip(60L)
                .count(20L)
                .build();

        ListTransfersResponse res = sdk.transfers().list()
                .request(req)
                .call();

        if (res.transfers().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [ListTransfersRequest](../../models/operations/ListTransfersRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[ListTransfersResponse](../../models/operations/ListTransfersResponse.md)**

### Errors

| Error Type                                 | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| models/errors/ListTransfersValidationError | 422                                        | application/json                           |
| models/errors/APIException                 | 4XX, 5XX                                   | \*/\*                                      |

## get

Retrieve full transfer details for an individual transfer of a particular Moov account. 

Payment rail-specific details are included in the source and destination. Read our [transfers overview guide](https://docs.moov.io/guides/money-movement/overview/) 
to learn more.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/transfers.read` scope.

### Example Usage

<!-- UsageSnippet language="java" operationID="getTransfer" method="get" path="/accounts/{accountID}/transfers/{transferID}" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.operations.GetTransferResponse;
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

        GetTransferResponse res = sdk.transfers().get()
                .transferID("960cf5a2-50a3-4914-ad86-d54c022bf5df")
                .accountID("31113f7b-9f68-44e9-9338-6d8e655c7c96")
                .call();

        if (res.transfer().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                    | Type                         | Required                     | Description                  |
| ---------------------------- | ---------------------------- | ---------------------------- | ---------------------------- |
| `transferID`                 | *String*                     | :heavy_check_mark:           | Identifier for the transfer. |
| `accountID`                  | *String*                     | :heavy_check_mark:           | N/A                          |

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

<!-- UsageSnippet language="java" operationID="updateTransfer" method="patch" path="/accounts/{accountID}/transfers/{transferID}" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.PatchTransfer;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.errors.PatchTransferValidationError;
import io.moov.sdk.models.operations.UpdateTransferResponse;
import java.lang.Exception;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws PatchTransferValidationError, Exception {

        Moov sdk = Moov.builder()
                .xMoovVersion("v2024.01.00")
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        UpdateTransferResponse res = sdk.transfers().update()
                .transferID("de30c075-4245-4d62-bfb3-f76d4d7d3b9c")
                .accountID("18a7907d-2f89-493a-b15a-3aad91c24496")
                .patchTransfer(PatchTransfer.builder()
                    .metadata(Map.ofEntries(
                        Map.entry("optional", "metadata")))
                    .build())
                .call();

        if (res.transfer().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                 | Type                                                      | Required                                                  | Description                                               |
| --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- |
| `transferID`                                              | *String*                                                  | :heavy_check_mark:                                        | Identifier for the transfer.                              |
| `accountID`                                               | *String*                                                  | :heavy_check_mark:                                        | N/A                                                       |
| `patchTransfer`                                           | [PatchTransfer](../../models/components/PatchTransfer.md) | :heavy_check_mark:                                        | N/A                                                       |

### Response

**[UpdateTransferResponse](../../models/operations/UpdateTransferResponse.md)**

### Errors

| Error Type                                 | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| models/errors/PatchTransferValidationError | 422                                        | application/json                           |
| models/errors/APIException                 | 4XX, 5XX                                   | \*/\*                                      |

## createCancellation

  Initiate a cancellation for a card, ACH, or queued transfer.
  
  To access this endpoint using a [token](https://docs.moov.io/api/authentication/access-tokens/) you'll need 
  to specify the `/accounts/{accountID}/transfers.write` scope.

### Example Usage

<!-- UsageSnippet language="java" operationID="createCancellation" method="post" path="/accounts/{accountID}/transfers/{transferID}/cancellations" example="Created cancellation" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.errors.GenericError;
import io.moov.sdk.models.operations.CreateCancellationResponse;
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

        CreateCancellationResponse res = sdk.transfers().createCancellation()
                .accountID("10ae862c-6658-4f87-967d-46e995737204")
                .transferID("36c80a6c-ceb2-4e5d-a437-8a39afdfdc58")
                .call();

        if (res.cancellation().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `accountID`                    | *String*                       | :heavy_check_mark:             | The partner's Moov account ID. |
| `transferID`                   | *String*                       | :heavy_check_mark:             | The transfer ID to cancel.     |

### Response

**[CreateCancellationResponse](../../models/operations/CreateCancellationResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/GenericError | 400                        | application/json           |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## getCancellation

  Get details of a cancellation for a transfer.
  
  To access this endpoint using a [token](https://docs.moov.io/api/authentication/access-tokens/) you'll need 
  to specify the `/accounts/{accountID}/transfers.read` scope.

### Example Usage: Cancellation

<!-- UsageSnippet language="java" operationID="getCancellation" method="get" path="/accounts/{accountID}/transfers/{transferID}/cancellations/{cancellationID}" example="Cancellation" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.operations.GetCancellationResponse;
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

        GetCancellationResponse res = sdk.transfers().getCancellation()
                .accountID("55cb62c2-22e4-4a36-bd53-3b9adc77ee81")
                .transferID("bc13b680-bac3-432e-bf44-e9aa6426cbb2")
                .cancellationID("770cb4b5-d5b0-4e8b-995b-86b790296ba5")
                .call();

        if (res.cancellation().isPresent()) {
            // handle response
        }
    }
}
```
### Example Usage: Got cancellation

<!-- UsageSnippet language="java" operationID="getCancellation" method="get" path="/accounts/{accountID}/transfers/{transferID}/cancellations/{cancellationID}" example="Got cancellation" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.operations.GetCancellationResponse;
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

        GetCancellationResponse res = sdk.transfers().getCancellation()
                .accountID("55cb62c2-22e4-4a36-bd53-3b9adc77ee81")
                .transferID("bc13b680-bac3-432e-bf44-e9aa6426cbb2")
                .cancellationID("770cb4b5-d5b0-4e8b-995b-86b790296ba5")
                .call();

        if (res.cancellation().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `accountID`                                                         | *String*                                                            | :heavy_check_mark:                                                  | Moov account ID of the partner or transfer's source or destination. |
| `transferID`                                                        | *String*                                                            | :heavy_check_mark:                                                  | Identifier for the transfer.                                        |
| `cancellationID`                                                    | *String*                                                            | :heavy_check_mark:                                                  | Identifier for the cancellation.                                    |

### Response

**[GetCancellationResponse](../../models/operations/GetCancellationResponse.md)**

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

### Example Usage: Successful async refund

<!-- UsageSnippet language="java" operationID="initiateRefund" method="post" path="/accounts/{accountID}/transfers/{transferID}/refunds" example="Successful async refund" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.CreateRefund;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.errors.*;
import io.moov.sdk.models.operations.InitiateRefundRequest;
import io.moov.sdk.models.operations.InitiateRefundResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GenericError, CardAcquiringRefund, RefundValidationError, Exception {

        Moov sdk = Moov.builder()
                .xMoovVersion("v2024.01.00")
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        InitiateRefundRequest req = InitiateRefundRequest.builder()
                .xIdempotencyKey("8d9af6b8-67e1-4efa-8188-68039f34097d")
                .accountID("cb6ae9f9-afab-4f06-9eb0-8abf54a3ada2")
                .transferID("04022119-95be-4ef4-9dd4-b3782f6aa7b9")
                .createRefund(CreateRefund.builder()
                    .amount(1000L)
                    .build())
                .build();

        InitiateRefundResponse res = sdk.transfers().initiateRefund()
                .request(req)
                .call();

        if (res.createRefundResponse().isPresent()) {
            // handle response
        }
    }
}
```
### Example Usage: Successful sync refund

<!-- UsageSnippet language="java" operationID="initiateRefund" method="post" path="/accounts/{accountID}/transfers/{transferID}/refunds" example="Successful sync refund" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.CreateRefund;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.errors.*;
import io.moov.sdk.models.operations.InitiateRefundRequest;
import io.moov.sdk.models.operations.InitiateRefundResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GenericError, CardAcquiringRefund, RefundValidationError, Exception {

        Moov sdk = Moov.builder()
                .xMoovVersion("v2024.01.00")
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        InitiateRefundRequest req = InitiateRefundRequest.builder()
                .xIdempotencyKey("4e7a906a-e6d1-4bca-9cc5-6246295ef93c")
                .accountID("d12ddb6e-0ed9-44e8-92a7-1716ae7cc759")
                .transferID("d73be489-9da4-4be7-bc04-147d8552279d")
                .createRefund(CreateRefund.builder()
                    .amount(1000L)
                    .build())
                .build();

        InitiateRefundResponse res = sdk.transfers().initiateRefund()
                .request(req)
                .call();

        if (res.createRefundResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [InitiateRefundRequest](../../models/operations/InitiateRefundRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

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

<!-- UsageSnippet language="java" operationID="listRefunds" method="get" path="/accounts/{accountID}/transfers/{transferID}/refunds" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.operations.ListRefundsResponse;
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

        ListRefundsResponse res = sdk.transfers().listRefunds()
                .accountID("03f5baaa-f5d8-44bd-90db-868745fe66e8")
                .transferID("6b1aa1a1-bff1-43b9-9126-2806fdc9c732")
                .call();

        if (res.cardAcquiringRefunds().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                    | Type                         | Required                     | Description                  |
| ---------------------------- | ---------------------------- | ---------------------------- | ---------------------------- |
| `accountID`                  | *String*                     | :heavy_check_mark:           | N/A                          |
| `transferID`                 | *String*                     | :heavy_check_mark:           | Identifier for the transfer. |

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

<!-- UsageSnippet language="java" operationID="getRefund" method="get" path="/accounts/{accountID}/transfers/{transferID}/refunds/{refundID}" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.operations.GetRefundResponse;
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

        GetRefundResponse res = sdk.transfers().getRefund()
                .transferID("e90d3386-c5b2-4e2b-b841-efc590eba6c0")
                .accountID("bbb69538-edaa-4a0b-b107-f46f2da89864")
                .refundID("8e12687e-a4e8-46c9-9e11-a57bbd781e44")
                .call();

        if (res.cardAcquiringRefund().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                    | Type                         | Required                     | Description                  |
| ---------------------------- | ---------------------------- | ---------------------------- | ---------------------------- |
| `transferID`                 | *String*                     | :heavy_check_mark:           | Identifier for the transfer. |
| `accountID`                  | *String*                     | :heavy_check_mark:           | N/A                          |
| `refundID`                   | *String*                     | :heavy_check_mark:           | Identifier for the refund.   |

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

### Example Usage: Reversed by cancellation

<!-- UsageSnippet language="java" operationID="createReversal" method="post" path="/accounts/{accountID}/transfers/{transferID}/reversals" example="Reversed by cancellation" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.CreateReversal;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.errors.GenericError;
import io.moov.sdk.models.errors.ReversalValidationError;
import io.moov.sdk.models.operations.CreateReversalResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GenericError, ReversalValidationError, Exception {

        Moov sdk = Moov.builder()
                .xMoovVersion("v2024.01.00")
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        CreateReversalResponse res = sdk.transfers().createReversal()
                .xIdempotencyKey("93d03831-45c4-49ec-a9b2-88cbd41dfca7")
                .accountID("c5fade57-7e5a-4380-ac7b-4abf8b3c24cf")
                .transferID("82c6eae7-b7e5-4b20-b24e-5116a4d70bde")
                .createReversal(CreateReversal.builder()
                    .amount(1000L)
                    .build())
                .call();

        if (res.reversal().isPresent()) {
            // handle response
        }
    }
}
```
### Example Usage: Reversed by refund

<!-- UsageSnippet language="java" operationID="createReversal" method="post" path="/accounts/{accountID}/transfers/{transferID}/reversals" example="Reversed by refund" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.CreateReversal;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.errors.GenericError;
import io.moov.sdk.models.errors.ReversalValidationError;
import io.moov.sdk.models.operations.CreateReversalResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GenericError, ReversalValidationError, Exception {

        Moov sdk = Moov.builder()
                .xMoovVersion("v2024.01.00")
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        CreateReversalResponse res = sdk.transfers().createReversal()
                .xIdempotencyKey("b91d00b2-4ecb-4eb4-a67f-d6f76c0b7ad8")
                .accountID("f225b49d-911b-440b-baed-6065968b69cb")
                .transferID("a17b29e2-4af6-4c9d-ad3a-dd0ded2966ad")
                .createReversal(CreateReversal.builder()
                    .amount(1000L)
                    .build())
                .call();

        if (res.reversal().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                              | Type                                                                   | Required                                                               | Description                                                            |
| ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- |
| `xIdempotencyKey`                                                      | *String*                                                               | :heavy_check_mark:                                                     | Prevents duplicate reversals from being created.                       |
| `accountID`                                                            | *String*                                                               | :heavy_check_mark:                                                     | The Moov account ID.                                                   |
| `transferID`                                                           | *String*                                                               | :heavy_check_mark:                                                     | The transfer ID to reverse.                                            |
| `createReversal`                                                       | [Optional\<CreateReversal>](../../models/components/CreateReversal.md) | :heavy_minus_sign:                                                     | N/A                                                                    |

### Response

**[CreateReversalResponse](../../models/operations/CreateReversalResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/GenericError            | 400, 409                              | application/json                      |
| models/errors/ReversalValidationError | 422                                   | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |