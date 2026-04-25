# TransferConfig

## Overview

### Available Operations

* [create](#create) - Create a transfer config for an account.
* [get](#get) - Get the transfer config for an account.
* [update](#update) - Update the transfer config for an account.

## create

Create a transfer config for an account.

### Example Usage: Fixed amount tip config created

<!-- UsageSnippet language="java" operationID="createTransferConfig" method="post" path="/accounts/{accountID}/transfer-config" example="Fixed amount tip config created" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.*;
import io.moov.sdk.models.errors.GenericError;
import io.moov.sdk.models.errors.TransferConfigValidationError;
import io.moov.sdk.models.operations.CreateTransferConfigResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws GenericError, TransferConfigValidationError, Exception {

        Moov sdk = Moov.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        CreateTransferConfigResponse res = sdk.transferConfig().create()
                .accountID("<id>")
                .createTransferConfig(CreateTransferConfig.builder()
                    .tipPresets(CreateTipPresets.builder()
                        .fixedAmountOptions(List.of(
                            AmountDecimal.builder()
                                .currency("USD")
                                .valueDecimal("12.987654321")
                                .build()))
                        .build())
                    .build())
                .call();

        if (res.transferConfig().isPresent()) {
            System.out.println(res.transferConfig().get());
        }
    }
}
```
### Example Usage: Percentage tip config created

<!-- UsageSnippet language="java" operationID="createTransferConfig" method="post" path="/accounts/{accountID}/transfer-config" example="Percentage tip config created" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.*;
import io.moov.sdk.models.errors.GenericError;
import io.moov.sdk.models.errors.TransferConfigValidationError;
import io.moov.sdk.models.operations.CreateTransferConfigResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws GenericError, TransferConfigValidationError, Exception {

        Moov sdk = Moov.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        CreateTransferConfigResponse res = sdk.transferConfig().create()
                .accountID("<id>")
                .createTransferConfig(CreateTransferConfig.builder()
                    .tipPresets(CreateTipPresets.builder()
                        .fixedAmountOptions(List.of(
                            AmountDecimal.builder()
                                .currency("USD")
                                .valueDecimal("12.987654321")
                                .build()))
                        .build())
                    .build())
                .call();

        if (res.transferConfig().isPresent()) {
            System.out.println(res.transferConfig().get());
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `accountID`                                                             | *String*                                                                | :heavy_check_mark:                                                      | Your Moov account ID.                                                   |
| `createTransferConfig`                                                  | [CreateTransferConfig](../../models/components/CreateTransferConfig.md) | :heavy_check_mark:                                                      | N/A                                                                     |

### Response

**[CreateTransferConfigResponse](../../models/operations/CreateTransferConfigResponse.md)**

### Errors

| Error Type                                  | Status Code                                 | Content Type                                |
| ------------------------------------------- | ------------------------------------------- | ------------------------------------------- |
| models/errors/GenericError                  | 400                                         | application/json                            |
| models/errors/TransferConfigValidationError | 422                                         | application/json                            |
| models/errors/APIException                  | 4XX, 5XX                                    | \*/\*                                       |

## get

Get the transfer config for an account.

### Example Usage: Fixed amount tip config

<!-- UsageSnippet language="java" operationID="getTransferConfig" method="get" path="/accounts/{accountID}/transfer-config" example="Fixed amount tip config" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.operations.GetTransferConfigResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Moov sdk = Moov.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        GetTransferConfigResponse res = sdk.transferConfig().get()
                .accountID("<id>")
                .call();

        if (res.transferConfig().isPresent()) {
            System.out.println(res.transferConfig().get());
        }
    }
}
```
### Example Usage: Percentage tip config

<!-- UsageSnippet language="java" operationID="getTransferConfig" method="get" path="/accounts/{accountID}/transfer-config" example="Percentage tip config" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.operations.GetTransferConfigResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Moov sdk = Moov.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        GetTransferConfigResponse res = sdk.transferConfig().get()
                .accountID("<id>")
                .call();

        if (res.transferConfig().isPresent()) {
            System.out.println(res.transferConfig().get());
        }
    }
}
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `accountID`        | *String*           | :heavy_check_mark: | N/A                |

### Response

**[GetTransferConfigResponse](../../models/operations/GetTransferConfigResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## update

Update the transfer config for an account.

### Example Usage: Updated fixed amount tip config

<!-- UsageSnippet language="java" operationID="updateTransferConfig" method="put" path="/accounts/{accountID}/transfer-config" example="Updated fixed amount tip config" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.*;
import io.moov.sdk.models.errors.GenericError;
import io.moov.sdk.models.errors.TransferConfigValidationError;
import io.moov.sdk.models.operations.UpdateTransferConfigResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws GenericError, TransferConfigValidationError, Exception {

        Moov sdk = Moov.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        UpdateTransferConfigResponse res = sdk.transferConfig().update()
                .accountID("<id>")
                .putTransferConfig(PutTransferConfig.builder()
                    .tipPresets(PutTipPresets.builder()
                        .fixedAmountOptions(List.of(
                            AmountDecimal.builder()
                                .currency("USD")
                                .valueDecimal("12.987654321")
                                .build()))
                        .build())
                    .build())
                .call();

        if (res.transferConfig().isPresent()) {
            System.out.println(res.transferConfig().get());
        }
    }
}
```
### Example Usage: Updated percentage tip config

<!-- UsageSnippet language="java" operationID="updateTransferConfig" method="put" path="/accounts/{accountID}/transfer-config" example="Updated percentage tip config" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.*;
import io.moov.sdk.models.errors.GenericError;
import io.moov.sdk.models.errors.TransferConfigValidationError;
import io.moov.sdk.models.operations.UpdateTransferConfigResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws GenericError, TransferConfigValidationError, Exception {

        Moov sdk = Moov.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        UpdateTransferConfigResponse res = sdk.transferConfig().update()
                .accountID("<id>")
                .putTransferConfig(PutTransferConfig.builder()
                    .tipPresets(PutTipPresets.builder()
                        .fixedAmountOptions(List.of(
                            AmountDecimal.builder()
                                .currency("USD")
                                .valueDecimal("12.987654321")
                                .build()))
                        .build())
                    .build())
                .call();

        if (res.transferConfig().isPresent()) {
            System.out.println(res.transferConfig().get());
        }
    }
}
```

### Parameters

| Parameter                                                         | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `accountID`                                                       | *String*                                                          | :heavy_check_mark:                                                | N/A                                                               |
| `putTransferConfig`                                               | [PutTransferConfig](../../models/components/PutTransferConfig.md) | :heavy_check_mark:                                                | N/A                                                               |

### Response

**[UpdateTransferConfigResponse](../../models/operations/UpdateTransferConfigResponse.md)**

### Errors

| Error Type                                  | Status Code                                 | Content Type                                |
| ------------------------------------------- | ------------------------------------------- | ------------------------------------------- |
| models/errors/GenericError                  | 400                                         | application/json                            |
| models/errors/TransferConfigValidationError | 422                                         | application/json                            |
| models/errors/APIException                  | 4XX, 5XX                                    | \*/\*                                       |