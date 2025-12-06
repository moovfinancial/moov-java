# Sweeps

## Overview

### Available Operations

* [createConfig](#createconfig) - Create a sweep config for a wallet.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/wallets.write` scope.
* [listConfigs](#listconfigs) - List sweep configs associated with an account.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/wallets.read` scope.
* [getConfig](#getconfig) - Get a sweep config associated with a wallet.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/wallets.read` scope.
* [updateConfig](#updateconfig) - Update settings on a sweep config.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/)
you'll need to specify the `/accounts/{accountID}/wallets.write` scope.
* [list](#list) - List sweeps associated with a wallet.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/wallets.read` scope.
* [get](#get) - Get details on a specific sweep.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/wallets.read` scope.

## createConfig

Create a sweep config for a wallet.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/wallets.write` scope.

### Example Usage

<!-- UsageSnippet language="java" operationID="createSweepConfig" method="post" path="/accounts/{accountID}/sweep-configs" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.*;
import io.moov.sdk.models.errors.CreateSweepConfigError;
import io.moov.sdk.models.errors.GenericError;
import io.moov.sdk.models.operations.CreateSweepConfigResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GenericError, CreateSweepConfigError, Exception {

        Moov sdk = Moov.builder()
                .xMoovVersion("v2024.01.00")
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        CreateSweepConfigResponse res = sdk.sweeps().createConfig()
                .accountID("cd0ec32e-bd84-418c-90d3-fffbc5465f8b")
                .createSweepConfig(CreateSweepConfig.builder()
                    .walletID("01234567-89ab-cdef-0123-456789abcdef")
                    .status(SweepConfigStatus.ENABLED)
                    .pushPaymentMethodID("01234567-89ab-cdef-0123-456789abcdef")
                    .pullPaymentMethodID("01234567-89ab-cdef-0123-456789abcdef")
                    .build())
                .call();

        if (res.sweepConfig().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                         | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `accountID`                                                       | *String*                                                          | :heavy_check_mark:                                                | N/A                                                               |
| `createSweepConfig`                                               | [CreateSweepConfig](../../models/components/CreateSweepConfig.md) | :heavy_check_mark:                                                | N/A                                                               |

### Response

**[CreateSweepConfigResponse](../../models/operations/CreateSweepConfigResponse.md)**

### Errors

| Error Type                           | Status Code                          | Content Type                         |
| ------------------------------------ | ------------------------------------ | ------------------------------------ |
| models/errors/GenericError           | 400, 409                             | application/json                     |
| models/errors/CreateSweepConfigError | 422                                  | application/json                     |
| models/errors/APIException           | 4XX, 5XX                             | \*/\*                                |

## listConfigs

List sweep configs associated with an account.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/wallets.read` scope.

### Example Usage

<!-- UsageSnippet language="java" operationID="listSweepConfigs" method="get" path="/accounts/{accountID}/sweep-configs" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.operations.ListSweepConfigsResponse;
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

        ListSweepConfigsResponse res = sdk.sweeps().listConfigs()
                .accountID("ed67e4c8-03d3-4d88-ba38-fcd87de45a92")
                .call();

        if (res.sweepConfigs().isPresent()) {
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

**[ListSweepConfigsResponse](../../models/operations/ListSweepConfigsResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## getConfig

Get a sweep config associated with a wallet.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/wallets.read` scope.

### Example Usage

<!-- UsageSnippet language="java" operationID="getSweepConfig" method="get" path="/accounts/{accountID}/sweep-configs/{sweepConfigID}" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.operations.GetSweepConfigResponse;
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

        GetSweepConfigResponse res = sdk.sweeps().getConfig()
                .accountID("ae1c2e76-3195-4fc8-b922-b7af6dcf1aad")
                .sweepConfigID("bfddff28-5291-4d9b-a0f8-22a0895e8486")
                .call();

        if (res.sweepConfig().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `accountID`        | *String*           | :heavy_check_mark: | N/A                |
| `sweepConfigID`    | *String*           | :heavy_check_mark: | N/A                |

### Response

**[GetSweepConfigResponse](../../models/operations/GetSweepConfigResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## updateConfig

Update settings on a sweep config.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/)
you'll need to specify the `/accounts/{accountID}/wallets.write` scope.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateSweepConfig" method="patch" path="/accounts/{accountID}/sweep-configs/{sweepConfigID}" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.*;
import io.moov.sdk.models.errors.GenericError;
import io.moov.sdk.models.errors.PatchSweepConfigError;
import io.moov.sdk.models.operations.UpdateSweepConfigResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GenericError, PatchSweepConfigError, Exception {

        Moov sdk = Moov.builder()
                .xMoovVersion("v2024.01.00")
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        UpdateSweepConfigResponse res = sdk.sweeps().updateConfig()
                .accountID("c16d0264-3e93-4d13-b8d8-6e8e98122631")
                .sweepConfigID("f7943244-882b-4a3a-837a-a58418358399")
                .patchSweepConfig(PatchSweepConfig.builder()
                    .status(Status.DISABLED)
                    .build())
                .call();

        if (res.sweepConfig().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                       | Type                                                            | Required                                                        | Description                                                     |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `accountID`                                                     | *String*                                                        | :heavy_check_mark:                                              | N/A                                                             |
| `sweepConfigID`                                                 | *String*                                                        | :heavy_check_mark:                                              | N/A                                                             |
| `patchSweepConfig`                                              | [PatchSweepConfig](../../models/components/PatchSweepConfig.md) | :heavy_check_mark:                                              | N/A                                                             |

### Response

**[UpdateSweepConfigResponse](../../models/operations/UpdateSweepConfigResponse.md)**

### Errors

| Error Type                          | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/GenericError          | 400, 409                            | application/json                    |
| models/errors/PatchSweepConfigError | 422                                 | application/json                    |
| models/errors/APIException          | 4XX, 5XX                            | \*/\*                               |

## list

List sweeps associated with a wallet.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/wallets.read` scope.

### Example Usage

<!-- UsageSnippet language="java" operationID="listSweeps" method="get" path="/accounts/{accountID}/wallets/{walletID}/sweeps" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.operations.ListSweepsRequest;
import io.moov.sdk.models.operations.ListSweepsResponse;
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

        ListSweepsRequest req = ListSweepsRequest.builder()
                .accountID("a227b50c-035d-4b7f-932c-a4b7e02aaf5c")
                .walletID("d01e5b34-b207-4a5c-b249-6e049be6a841")
                .skip(60L)
                .count(20L)
                .build();

        ListSweepsResponse res = sdk.sweeps().list()
                .request(req)
                .call();

        if (res.sweeps().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                         | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `request`                                                         | [ListSweepsRequest](../../models/operations/ListSweepsRequest.md) | :heavy_check_mark:                                                | The request object to use for the request.                        |

### Response

**[ListSweepsResponse](../../models/operations/ListSweepsResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## get

Get details on a specific sweep.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/wallets.read` scope.

### Example Usage

<!-- UsageSnippet language="java" operationID="getSweep" method="get" path="/accounts/{accountID}/wallets/{walletID}/sweeps/{sweepID}" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.operations.GetSweepResponse;
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

        GetSweepResponse res = sdk.sweeps().get()
                .accountID("481bc941-34a2-4c2a-a4f8-feaa9a25d630")
                .walletID("e63a4638-ad67-44fb-9b59-ed7311023602")
                .sweepID("c88c9731-06c2-4b4a-a7d2-34c8b936d9ae")
                .call();

        if (res.sweep().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `accountID`        | *String*           | :heavy_check_mark: | N/A                |
| `walletID`         | *String*           | :heavy_check_mark: | N/A                |
| `sweepID`          | *String*           | :heavy_check_mark: | N/A                |

### Response

**[GetSweepResponse](../../models/operations/GetSweepResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |