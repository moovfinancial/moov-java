# Capabilities
(*capabilities()*)

## Overview

### Available Operations

* [listCapabilities](#listcapabilities) - Retrieve all the capabilities an account has requested.

Read our [capabilities guide](https://docs.moov.io/guides/accounts/capabilities/) to learn more.
* [addCapabilities](#addcapabilities) - Request capabilities for a specific account. Read our [capabilities guide](https://docs.moov.io/guides/accounts/capabilities/) to learn more.

To use this endpoint from the browser, you'll need to specify the `/accounts/{accountID}/capabilities.write` scope when generating a [token](https://docs.moov.io/api/authentication/access-tokens/).
* [getCapability](#getcapability) - Retrieve a specific capability that an account has requested. Read our [capabilities guide](https://docs.moov.io/guides/accounts/capabilities/) to learn more.

To use this endpoint from the browser, you'll need to specify the `/accounts/{accountID}/capabilities.read` scope when generating a [token](https://docs.moov.io/api/authentication/access-tokens/).
* [disableCapability](#disablecapability) - Disable a specific capability that an account has requested. Read our [capabilities guide](https://docs.moov.io/guides/accounts/capabilities/) to learn more.

To use this endpoint from the browser, you'll need to specify the `/accounts/{accountID}/capabilities.write` scope when generating a [token](https://docs.moov.io/api/authentication/access-tokens/).

## listCapabilities

Retrieve all the capabilities an account has requested.

Read our [capabilities guide](https://docs.moov.io/guides/accounts/capabilities/) to learn more.

### Example Usage

```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.SchemeBasicAuth;
import io.moov.sdk.models.components.Versions;
import io.moov.sdk.models.operations.ListCapabilitiesResponse;
import io.moov.sdk.models.operations.ListCapabilitiesSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Moov sdk = Moov.builder()
            .build();

        ListCapabilitiesResponse res = sdk.capabilities().listCapabilities()
                .security(ListCapabilitiesSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .xMoovVersion(Versions.V202510)
                .accountID("c236a258-0a99-455d-9fbb-2312bc028cd2")
                .call();

        if (res.capabilities().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                     | Type                                                                                                          | Required                                                                                                      | Description                                                                                                   |
| ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                    | [io.moov.sdk.models.operations.ListCapabilitiesSecurity](../../models/operations/ListCapabilitiesSecurity.md) | :heavy_check_mark:                                                                                            | The security requirements to use for the request.                                                             |
| `xMoovVersion`                                                                                                | [Optional\<Versions>](../../models/components/Versions.md)                                                    | :heavy_minus_sign:                                                                                            | Specify an API version.                                                                                       |
| `accountID`                                                                                                   | *String*                                                                                                      | :heavy_check_mark:                                                                                            | N/A                                                                                                           |

### Response

**[ListCapabilitiesResponse](../../models/operations/ListCapabilitiesResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## addCapabilities

Request capabilities for a specific account. Read our [capabilities guide](https://docs.moov.io/guides/accounts/capabilities/) to learn more.

To use this endpoint from the browser, you'll need to specify the `/accounts/{accountID}/capabilities.write` scope when generating a [token](https://docs.moov.io/api/authentication/access-tokens/).

### Example Usage

```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.AddCapabilities;
import io.moov.sdk.models.components.CapabilityID;
import io.moov.sdk.models.components.SchemeBasicAuth;
import io.moov.sdk.models.components.Versions;
import io.moov.sdk.models.errors.AddCapabilitiesError;
import io.moov.sdk.models.errors.GenericError;
import io.moov.sdk.models.operations.AddCapabilitiesResponse;
import io.moov.sdk.models.operations.AddCapabilitiesSecurity;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws GenericError, AddCapabilitiesError, Exception {

        Moov sdk = Moov.builder()
            .build();

        AddCapabilitiesResponse res = sdk.capabilities().addCapabilities()
                .security(AddCapabilitiesSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .xMoovVersion(Versions.V202401)
                .accountID("1f48b82c-3158-4fa6-a507-0bd22afd441e")
                .addCapabilities(AddCapabilities.builder()
                    .capabilities(List.of(
                        CapabilityID.COLLECT_FUNDS))
                    .build())
                .call();

        if (res.capabilities().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                   | Type                                                                                                        | Required                                                                                                    | Description                                                                                                 |
| ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                  | [io.moov.sdk.models.operations.AddCapabilitiesSecurity](../../models/operations/AddCapabilitiesSecurity.md) | :heavy_check_mark:                                                                                          | The security requirements to use for the request.                                                           |
| `xMoovVersion`                                                                                              | [Optional\<Versions>](../../models/components/Versions.md)                                                  | :heavy_minus_sign:                                                                                          | Specify an API version.                                                                                     |
| `accountID`                                                                                                 | *String*                                                                                                    | :heavy_check_mark:                                                                                          | N/A                                                                                                         |
| `addCapabilities`                                                                                           | [AddCapabilities](../../models/components/AddCapabilities.md)                                               | :heavy_check_mark:                                                                                          | N/A                                                                                                         |

### Response

**[AddCapabilitiesResponse](../../models/operations/AddCapabilitiesResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| models/errors/GenericError         | 400, 409                           | application/json                   |
| models/errors/AddCapabilitiesError | 422                                | application/json                   |
| models/errors/APIException         | 4XX, 5XX                           | \*/\*                              |

## getCapability

Retrieve a specific capability that an account has requested. Read our [capabilities guide](https://docs.moov.io/guides/accounts/capabilities/) to learn more.

To use this endpoint from the browser, you'll need to specify the `/accounts/{accountID}/capabilities.read` scope when generating a [token](https://docs.moov.io/api/authentication/access-tokens/).

### Example Usage

```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.CapabilityID;
import io.moov.sdk.models.components.SchemeBasicAuth;
import io.moov.sdk.models.components.Versions;
import io.moov.sdk.models.operations.GetCapabilityResponse;
import io.moov.sdk.models.operations.GetCapabilitySecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Moov sdk = Moov.builder()
            .build();

        GetCapabilityResponse res = sdk.capabilities().getCapability()
                .security(GetCapabilitySecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .xMoovVersion(Versions.V202401)
                .accountID("15fbc94d-721f-44a3-b5fb-77f58657305f")
                .capabilityID(CapabilityID.TRANSFERS)
                .call();

        if (res.capability().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                               | Type                                                                                                    | Required                                                                                                | Description                                                                                             |
| ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- |
| `security`                                                                                              | [io.moov.sdk.models.operations.GetCapabilitySecurity](../../models/operations/GetCapabilitySecurity.md) | :heavy_check_mark:                                                                                      | The security requirements to use for the request.                                                       |
| `xMoovVersion`                                                                                          | [Optional\<Versions>](../../models/components/Versions.md)                                              | :heavy_minus_sign:                                                                                      | Specify an API version.                                                                                 |
| `accountID`                                                                                             | *String*                                                                                                | :heavy_check_mark:                                                                                      | N/A                                                                                                     |
| `capabilityID`                                                                                          | [CapabilityID](../../models/components/CapabilityID.md)                                                 | :heavy_check_mark:                                                                                      | Moov account capabilities.                                                                              |

### Response

**[GetCapabilityResponse](../../models/operations/GetCapabilityResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## disableCapability

Disable a specific capability that an account has requested. Read our [capabilities guide](https://docs.moov.io/guides/accounts/capabilities/) to learn more.

To use this endpoint from the browser, you'll need to specify the `/accounts/{accountID}/capabilities.write` scope when generating a [token](https://docs.moov.io/api/authentication/access-tokens/).

### Example Usage

```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.CapabilityID;
import io.moov.sdk.models.components.SchemeBasicAuth;
import io.moov.sdk.models.components.Versions;
import io.moov.sdk.models.errors.GenericError;
import io.moov.sdk.models.operations.DisableCapabilityResponse;
import io.moov.sdk.models.operations.DisableCapabilitySecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GenericError, Exception {

        Moov sdk = Moov.builder()
            .build();

        DisableCapabilityResponse res = sdk.capabilities().disableCapability()
                .security(DisableCapabilitySecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .xMoovVersion(Versions.V202510)
                .accountID("c57b48d7-4182-4632-a345-eeed5a742b0d")
                .capabilityID(CapabilityID.CARD_ISSUING)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                       | Type                                                                                                            | Required                                                                                                        | Description                                                                                                     |
| --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                      | [io.moov.sdk.models.operations.DisableCapabilitySecurity](../../models/operations/DisableCapabilitySecurity.md) | :heavy_check_mark:                                                                                              | The security requirements to use for the request.                                                               |
| `xMoovVersion`                                                                                                  | [Optional\<Versions>](../../models/components/Versions.md)                                                      | :heavy_minus_sign:                                                                                              | Specify an API version.                                                                                         |
| `accountID`                                                                                                     | *String*                                                                                                        | :heavy_check_mark:                                                                                              | N/A                                                                                                             |
| `capabilityID`                                                                                                  | [CapabilityID](../../models/components/CapabilityID.md)                                                         | :heavy_check_mark:                                                                                              | Moov account capabilities.                                                                                      |

### Response

**[DisableCapabilityResponse](../../models/operations/DisableCapabilityResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/GenericError | 400, 409                   | application/json           |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |