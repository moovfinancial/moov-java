# Capabilities
(*capabilities()*)

## Overview

### Available Operations

* [list](#list) - Retrieve all the capabilities an account has requested.

Read our [capabilities guide](https://docs.moov.io/guides/accounts/capabilities/) to learn more.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/capabilities.read` scope.
* [request](#request) - Request capabilities for a specific account. Read our [capabilities guide](https://docs.moov.io/guides/accounts/capabilities/) to learn more.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/capabilities.write` scope.
* [get](#get) - Retrieve a specific capability that an account has requested. Read our [capabilities guide](https://docs.moov.io/guides/accounts/capabilities/) to learn more.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/capabilities.read` scope.
* [disable](#disable) - Disable a specific capability that an account has requested. Read our [capabilities guide](https://docs.moov.io/guides/accounts/capabilities/) to learn more.

  To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/capabilities.write` scope.

## list

Retrieve all the capabilities an account has requested.

Read our [capabilities guide](https://docs.moov.io/guides/accounts/capabilities/) to learn more.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/capabilities.read` scope.

### Example Usage

```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.components.Versions;
import io.moov.sdk.models.operations.ListCapabilitiesResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Moov sdk = Moov.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        ListCapabilitiesResponse res = sdk.capabilities().list()
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

| Parameter                                                  | Type                                                       | Required                                                   | Description                                                |
| ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- |
| `xMoovVersion`                                             | [Optional\<Versions>](../../models/components/Versions.md) | :heavy_minus_sign:                                         | Specify an API version.                                    |
| `accountID`                                                | *String*                                                   | :heavy_check_mark:                                         | N/A                                                        |

### Response

**[ListCapabilitiesResponse](../../models/operations/ListCapabilitiesResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## request

Request capabilities for a specific account. Read our [capabilities guide](https://docs.moov.io/guides/accounts/capabilities/) to learn more.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/capabilities.write` scope.

### Example Usage

```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.AddCapabilities;
import io.moov.sdk.models.components.CapabilityID;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.components.Versions;
import io.moov.sdk.models.errors.AddCapabilitiesError;
import io.moov.sdk.models.errors.GenericError;
import io.moov.sdk.models.operations.RequestCapabilitiesResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws GenericError, AddCapabilitiesError, Exception {

        Moov sdk = Moov.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        RequestCapabilitiesResponse res = sdk.capabilities().request()
                .xMoovVersion(Versions.V202501)
                .accountID("32613610-de25-446e-8662-ec2709ffea9d")
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

| Parameter                                                     | Type                                                          | Required                                                      | Description                                                   |
| ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- |
| `xMoovVersion`                                                | [Optional\<Versions>](../../models/components/Versions.md)    | :heavy_minus_sign:                                            | Specify an API version.                                       |
| `accountID`                                                   | *String*                                                      | :heavy_check_mark:                                            | N/A                                                           |
| `addCapabilities`                                             | [AddCapabilities](../../models/components/AddCapabilities.md) | :heavy_check_mark:                                            | N/A                                                           |

### Response

**[RequestCapabilitiesResponse](../../models/operations/RequestCapabilitiesResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| models/errors/GenericError         | 400, 409                           | application/json                   |
| models/errors/AddCapabilitiesError | 422                                | application/json                   |
| models/errors/APIException         | 4XX, 5XX                           | \*/\*                              |

## get

Retrieve a specific capability that an account has requested. Read our [capabilities guide](https://docs.moov.io/guides/accounts/capabilities/) to learn more.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/capabilities.read` scope.

### Example Usage

```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.CapabilityID;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.components.Versions;
import io.moov.sdk.models.operations.GetCapabilityResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Moov sdk = Moov.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        GetCapabilityResponse res = sdk.capabilities().get()
                .xMoovVersion(Versions.V202510)
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

| Parameter                                                  | Type                                                       | Required                                                   | Description                                                |
| ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- |
| `xMoovVersion`                                             | [Optional\<Versions>](../../models/components/Versions.md) | :heavy_minus_sign:                                         | Specify an API version.                                    |
| `accountID`                                                | *String*                                                   | :heavy_check_mark:                                         | N/A                                                        |
| `capabilityID`                                             | [CapabilityID](../../models/components/CapabilityID.md)    | :heavy_check_mark:                                         | Moov account capabilities.                                 |

### Response

**[GetCapabilityResponse](../../models/operations/GetCapabilityResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## disable

Disable a specific capability that an account has requested. Read our [capabilities guide](https://docs.moov.io/guides/accounts/capabilities/) to learn more.

  To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/capabilities.write` scope.

### Example Usage

```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.CapabilityID;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.components.Versions;
import io.moov.sdk.models.errors.GenericError;
import io.moov.sdk.models.operations.DisableCapabilityResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GenericError, Exception {

        Moov sdk = Moov.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        DisableCapabilityResponse res = sdk.capabilities().disable()
                .xMoovVersion(Versions.V202510)
                .accountID("c57b48d7-4182-4632-a345-eeed5a742b0d")
                .capabilityID(CapabilityID.CARD_ISSUING)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                  | Type                                                       | Required                                                   | Description                                                |
| ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- |
| `xMoovVersion`                                             | [Optional\<Versions>](../../models/components/Versions.md) | :heavy_minus_sign:                                         | Specify an API version.                                    |
| `accountID`                                                | *String*                                                   | :heavy_check_mark:                                         | N/A                                                        |
| `capabilityID`                                             | [CapabilityID](../../models/components/CapabilityID.md)    | :heavy_check_mark:                                         | Moov account capabilities.                                 |

### Response

**[DisableCapabilityResponse](../../models/operations/DisableCapabilityResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/GenericError | 400, 409                   | application/json           |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |