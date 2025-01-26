# Sweeps
(*sweeps()*)

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

```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.CreateSweepConfig;
import io.moov.sdk.models.components.SchemeBasicAuth;
import io.moov.sdk.models.components.SweepConfigStatus;
import io.moov.sdk.models.components.Versions;
import io.moov.sdk.models.errors.CreateSweepConfigError;
import io.moov.sdk.models.errors.GenericError;
import io.moov.sdk.models.operations.CreateSweepConfigResponse;
import io.moov.sdk.models.operations.CreateSweepConfigSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GenericError, CreateSweepConfigError, Exception {

        Moov sdk = Moov.builder()
            .build();

        CreateSweepConfigResponse res = sdk.sweeps().createConfig()
                .security(CreateSweepConfigSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .xMoovVersion(Versions.V202401)
                .accountID("3a373e85-2777-40fe-aacd-52d6fc641d76")
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

| Parameter                                                                                                       | Type                                                                                                            | Required                                                                                                        | Description                                                                                                     |
| --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                      | [io.moov.sdk.models.operations.CreateSweepConfigSecurity](../../models/operations/CreateSweepConfigSecurity.md) | :heavy_check_mark:                                                                                              | The security requirements to use for the request.                                                               |
| `xMoovVersion`                                                                                                  | [Optional\<Versions>](../../models/components/Versions.md)                                                      | :heavy_minus_sign:                                                                                              | Specify an API version.                                                                                         |
| `accountID`                                                                                                     | *String*                                                                                                        | :heavy_check_mark:                                                                                              | N/A                                                                                                             |
| `createSweepConfig`                                                                                             | [CreateSweepConfig](../../models/components/CreateSweepConfig.md)                                               | :heavy_check_mark:                                                                                              | N/A                                                                                                             |

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

```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.SchemeBasicAuth;
import io.moov.sdk.models.components.Versions;
import io.moov.sdk.models.operations.ListSweepConfigsResponse;
import io.moov.sdk.models.operations.ListSweepConfigsSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Moov sdk = Moov.builder()
            .build();

        ListSweepConfigsResponse res = sdk.sweeps().listConfigs()
                .security(ListSweepConfigsSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .xMoovVersion(Versions.V202504)
                .accountID("b06d7726-4020-4fef-9035-75779c0fc48c")
                .call();

        if (res.sweepConfigs().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                     | Type                                                                                                          | Required                                                                                                      | Description                                                                                                   |
| ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                    | [io.moov.sdk.models.operations.ListSweepConfigsSecurity](../../models/operations/ListSweepConfigsSecurity.md) | :heavy_check_mark:                                                                                            | The security requirements to use for the request.                                                             |
| `xMoovVersion`                                                                                                | [Optional\<Versions>](../../models/components/Versions.md)                                                    | :heavy_minus_sign:                                                                                            | Specify an API version.                                                                                       |
| `accountID`                                                                                                   | *String*                                                                                                      | :heavy_check_mark:                                                                                            | N/A                                                                                                           |

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

```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.SchemeBasicAuth;
import io.moov.sdk.models.components.Versions;
import io.moov.sdk.models.operations.GetSweepConfigResponse;
import io.moov.sdk.models.operations.GetSweepConfigSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Moov sdk = Moov.builder()
            .build();

        GetSweepConfigResponse res = sdk.sweeps().getConfig()
                .security(GetSweepConfigSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .xMoovVersion(Versions.V202401)
                .accountID("1f4428ca-3d11-441b-93d5-3fada6a5db01")
                .sweepConfigID("acef9550-4b7b-4675-807b-71755d182b2f")
                .call();

        if (res.sweepConfig().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                 | Type                                                                                                      | Required                                                                                                  | Description                                                                                               |
| --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                | [io.moov.sdk.models.operations.GetSweepConfigSecurity](../../models/operations/GetSweepConfigSecurity.md) | :heavy_check_mark:                                                                                        | The security requirements to use for the request.                                                         |
| `xMoovVersion`                                                                                            | [Optional\<Versions>](../../models/components/Versions.md)                                                | :heavy_minus_sign:                                                                                        | Specify an API version.                                                                                   |
| `accountID`                                                                                               | *String*                                                                                                  | :heavy_check_mark:                                                                                        | N/A                                                                                                       |
| `sweepConfigID`                                                                                           | *String*                                                                                                  | :heavy_check_mark:                                                                                        | N/A                                                                                                       |

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

```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.PatchSweepConfig;
import io.moov.sdk.models.components.SchemeBasicAuth;
import io.moov.sdk.models.components.SweepConfigStatus;
import io.moov.sdk.models.components.Versions;
import io.moov.sdk.models.errors.GenericError;
import io.moov.sdk.models.errors.PatchSweepConfigError;
import io.moov.sdk.models.operations.UpdateSweepConfigResponse;
import io.moov.sdk.models.operations.UpdateSweepConfigSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GenericError, PatchSweepConfigError, Exception {

        Moov sdk = Moov.builder()
            .build();

        UpdateSweepConfigResponse res = sdk.sweeps().updateConfig()
                .security(UpdateSweepConfigSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .xMoovVersion(Versions.V202504)
                .accountID("7573cb48-6325-4d3d-841d-81108fcfe6f2")
                .sweepConfigID("49e8f3b1-259f-458e-9367-adb3b938f8c8")
                .patchSweepConfig(PatchSweepConfig.builder()
                    .status(SweepConfigStatus.DISABLED)
                    .build())
                .call();

        if (res.sweepConfig().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                       | Type                                                                                                            | Required                                                                                                        | Description                                                                                                     |
| --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                      | [io.moov.sdk.models.operations.UpdateSweepConfigSecurity](../../models/operations/UpdateSweepConfigSecurity.md) | :heavy_check_mark:                                                                                              | The security requirements to use for the request.                                                               |
| `xMoovVersion`                                                                                                  | [Optional\<Versions>](../../models/components/Versions.md)                                                      | :heavy_minus_sign:                                                                                              | Specify an API version.                                                                                         |
| `accountID`                                                                                                     | *String*                                                                                                        | :heavy_check_mark:                                                                                              | N/A                                                                                                             |
| `sweepConfigID`                                                                                                 | *String*                                                                                                        | :heavy_check_mark:                                                                                              | N/A                                                                                                             |
| `patchSweepConfig`                                                                                              | [PatchSweepConfig](../../models/components/PatchSweepConfig.md)                                                 | :heavy_check_mark:                                                                                              | N/A                                                                                                             |

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

```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.SchemeBasicAuth;
import io.moov.sdk.models.operations.ListSweepsRequest;
import io.moov.sdk.models.operations.ListSweepsResponse;
import io.moov.sdk.models.operations.ListSweepsSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Moov sdk = Moov.builder()
            .build();

        ListSweepsRequest req = ListSweepsRequest.builder()
                .accountID("0fe45272-ee0d-401f-a10e-21e396676598")
                .walletID("5f738f67-1989-4589-beb1-3d2f5c53a821")
                .skip(60L)
                .count(20L)
                .build();

        ListSweepsResponse res = sdk.sweeps().list()
                .request(req)
                .security(ListSweepsSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .call();

        if (res.sweeps().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [ListSweepsRequest](../../models/operations/ListSweepsRequest.md)                                 | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |
| `security`                                                                                        | [io.moov.sdk.models.operations.ListSweepsSecurity](../../models/operations/ListSweepsSecurity.md) | :heavy_check_mark:                                                                                | The security requirements to use for the request.                                                 |

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

```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.SchemeBasicAuth;
import io.moov.sdk.models.components.Versions;
import io.moov.sdk.models.operations.GetSweepResponse;
import io.moov.sdk.models.operations.GetSweepSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Moov sdk = Moov.builder()
            .build();

        GetSweepResponse res = sdk.sweeps().get()
                .security(GetSweepSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .xMoovVersion(Versions.V202510)
                .accountID("adb697e6-2888-48b9-b2c5-f2c3d487add5")
                .walletID("9f00e2b3-9dfb-48a3-9a25-a08e80f9cf36")
                .sweepID("a5324f55-fbec-4323-94e4-c512608bb175")
                .call();

        if (res.sweep().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `security`                                                                                    | [io.moov.sdk.models.operations.GetSweepSecurity](../../models/operations/GetSweepSecurity.md) | :heavy_check_mark:                                                                            | The security requirements to use for the request.                                             |
| `xMoovVersion`                                                                                | [Optional\<Versions>](../../models/components/Versions.md)                                    | :heavy_minus_sign:                                                                            | Specify an API version.                                                                       |
| `accountID`                                                                                   | *String*                                                                                      | :heavy_check_mark:                                                                            | N/A                                                                                           |
| `walletID`                                                                                    | *String*                                                                                      | :heavy_check_mark:                                                                            | N/A                                                                                           |
| `sweepID`                                                                                     | *String*                                                                                      | :heavy_check_mark:                                                                            | N/A                                                                                           |

### Response

**[GetSweepResponse](../../models/operations/GetSweepResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |