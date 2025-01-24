# Sweeps
(*sweeps()*)

## Overview

### Available Operations

* [createSweepConfig](#createsweepconfig) - Create a sweep config for a wallet.
* [listSweepConfigs](#listsweepconfigs) - List sweep configs associated with an account.
* [getSweepConfig](#getsweepconfig) - Get a sweep config associated with a wallet.
* [patchSweepConfig](#patchsweepconfig) - Update settings on a sweep config.
* [listSweeps](#listsweeps) - List sweeps associated with a wallet.
* [getSweep](#getsweep) - Get details on a specific sweep.

## createSweepConfig

Create a sweep config for a wallet.

### Example Usage

```java
package hello.world;

import io.moov.api.Moov;
import io.moov.api.models.components.CreateSweepConfig;
import io.moov.api.models.components.SchemeBasicAuth;
import io.moov.api.models.components.SweepConfigStatus;
import io.moov.api.models.components.Versions;
import io.moov.api.models.errors.CreateSweepConfigError;
import io.moov.api.models.errors.GenericError;
import io.moov.api.models.operations.CreateSweepConfigResponse;
import io.moov.api.models.operations.CreateSweepConfigSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GenericError, CreateSweepConfigError, Exception {

        Moov sdk = Moov.builder()
            .build();

        CreateSweepConfigResponse res = sdk.sweeps().createSweepConfig()
                .security(CreateSweepConfigSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .xMoovVersion(Versions.V202501)
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
| `security`                                                                                                      | [io.moov.api.models.operations.CreateSweepConfigSecurity](../../models/operations/CreateSweepConfigSecurity.md) | :heavy_check_mark:                                                                                              | The security requirements to use for the request.                                                               |
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

## listSweepConfigs

List sweep configs associated with an account.

### Example Usage

```java
package hello.world;

import io.moov.api.Moov;
import io.moov.api.models.components.SchemeBasicAuth;
import io.moov.api.models.components.Versions;
import io.moov.api.models.operations.ListSweepConfigsResponse;
import io.moov.api.models.operations.ListSweepConfigsSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Moov sdk = Moov.builder()
            .build();

        ListSweepConfigsResponse res = sdk.sweeps().listSweepConfigs()
                .security(ListSweepConfigsSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .xMoovVersion(Versions.V202510)
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
| `security`                                                                                                    | [io.moov.api.models.operations.ListSweepConfigsSecurity](../../models/operations/ListSweepConfigsSecurity.md) | :heavy_check_mark:                                                                                            | The security requirements to use for the request.                                                             |
| `xMoovVersion`                                                                                                | [Optional\<Versions>](../../models/components/Versions.md)                                                    | :heavy_minus_sign:                                                                                            | Specify an API version.                                                                                       |
| `accountID`                                                                                                   | *String*                                                                                                      | :heavy_check_mark:                                                                                            | N/A                                                                                                           |

### Response

**[ListSweepConfigsResponse](../../models/operations/ListSweepConfigsResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## getSweepConfig

Get a sweep config associated with a wallet.

### Example Usage

```java
package hello.world;

import io.moov.api.Moov;
import io.moov.api.models.components.SchemeBasicAuth;
import io.moov.api.models.components.Versions;
import io.moov.api.models.operations.GetSweepConfigResponse;
import io.moov.api.models.operations.GetSweepConfigSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Moov sdk = Moov.builder()
            .build();

        GetSweepConfigResponse res = sdk.sweeps().getSweepConfig()
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
| `security`                                                                                                | [io.moov.api.models.operations.GetSweepConfigSecurity](../../models/operations/GetSweepConfigSecurity.md) | :heavy_check_mark:                                                                                        | The security requirements to use for the request.                                                         |
| `xMoovVersion`                                                                                            | [Optional\<Versions>](../../models/components/Versions.md)                                                | :heavy_minus_sign:                                                                                        | Specify an API version.                                                                                   |
| `accountID`                                                                                               | *String*                                                                                                  | :heavy_check_mark:                                                                                        | N/A                                                                                                       |
| `sweepConfigID`                                                                                           | *String*                                                                                                  | :heavy_check_mark:                                                                                        | N/A                                                                                                       |

### Response

**[GetSweepConfigResponse](../../models/operations/GetSweepConfigResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## patchSweepConfig

Update settings on a sweep config.

### Example Usage

```java
package hello.world;

import io.moov.api.Moov;
import io.moov.api.models.components.PatchSweepConfig;
import io.moov.api.models.components.SchemeBasicAuth;
import io.moov.api.models.components.SweepConfigStatus;
import io.moov.api.models.components.Versions;
import io.moov.api.models.errors.GenericError;
import io.moov.api.models.errors.PatchSweepConfigError;
import io.moov.api.models.operations.PatchSweepConfigResponse;
import io.moov.api.models.operations.PatchSweepConfigSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GenericError, PatchSweepConfigError, Exception {

        Moov sdk = Moov.builder()
            .build();

        PatchSweepConfigResponse res = sdk.sweeps().patchSweepConfig()
                .security(PatchSweepConfigSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .xMoovVersion(Versions.V202510)
                .accountID("c0ee091a-5b72-49c9-9c8b-7cb99d7f9309")
                .sweepConfigID("c1f1c60c-cb13-4bc6-891c-f34d96682f06")
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

| Parameter                                                                                                     | Type                                                                                                          | Required                                                                                                      | Description                                                                                                   |
| ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                    | [io.moov.api.models.operations.PatchSweepConfigSecurity](../../models/operations/PatchSweepConfigSecurity.md) | :heavy_check_mark:                                                                                            | The security requirements to use for the request.                                                             |
| `xMoovVersion`                                                                                                | [Optional\<Versions>](../../models/components/Versions.md)                                                    | :heavy_minus_sign:                                                                                            | Specify an API version.                                                                                       |
| `accountID`                                                                                                   | *String*                                                                                                      | :heavy_check_mark:                                                                                            | N/A                                                                                                           |
| `sweepConfigID`                                                                                               | *String*                                                                                                      | :heavy_check_mark:                                                                                            | N/A                                                                                                           |
| `patchSweepConfig`                                                                                            | [PatchSweepConfig](../../models/components/PatchSweepConfig.md)                                               | :heavy_check_mark:                                                                                            | N/A                                                                                                           |

### Response

**[PatchSweepConfigResponse](../../models/operations/PatchSweepConfigResponse.md)**

### Errors

| Error Type                          | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/GenericError          | 400, 409                            | application/json                    |
| models/errors/PatchSweepConfigError | 422                                 | application/json                    |
| models/errors/APIException          | 4XX, 5XX                            | \*/\*                               |

## listSweeps

List sweeps associated with a wallet.

### Example Usage

```java
package hello.world;

import io.moov.api.Moov;
import io.moov.api.models.components.SchemeBasicAuth;
import io.moov.api.models.operations.ListSweepsRequest;
import io.moov.api.models.operations.ListSweepsResponse;
import io.moov.api.models.operations.ListSweepsSecurity;
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

        ListSweepsResponse res = sdk.sweeps().listSweeps()
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
| `security`                                                                                        | [io.moov.api.models.operations.ListSweepsSecurity](../../models/operations/ListSweepsSecurity.md) | :heavy_check_mark:                                                                                | The security requirements to use for the request.                                                 |

### Response

**[ListSweepsResponse](../../models/operations/ListSweepsResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## getSweep

Get details on a specific sweep.

### Example Usage

```java
package hello.world;

import io.moov.api.Moov;
import io.moov.api.models.components.SchemeBasicAuth;
import io.moov.api.models.components.Versions;
import io.moov.api.models.operations.GetSweepResponse;
import io.moov.api.models.operations.GetSweepSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Moov sdk = Moov.builder()
            .build();

        GetSweepResponse res = sdk.sweeps().getSweep()
                .security(GetSweepSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .xMoovVersion(Versions.V202507)
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
| `security`                                                                                    | [io.moov.api.models.operations.GetSweepSecurity](../../models/operations/GetSweepSecurity.md) | :heavy_check_mark:                                                                            | The security requirements to use for the request.                                             |
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