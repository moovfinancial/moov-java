# AccountTerminalApplications
(*accountTerminalApplications()*)

## Overview

### Available Operations

* [link](#link) - Link an account with a terminal application.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/terminal-applications.write` scope.
* [list](#list) - Retrieve all terminal applications linked to a specific account.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/terminal-applications.read` scope.
* [get](#get) - Verifies if a specific Terminal Application is linked to an Account. This endpoint acts as a validation check for the link's existence.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/terminal-applications.read` scope.
* [getConfiguration](#getconfiguration) - Fetch the configuration for a given Terminal Application linked to a specific Account.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/terminal-configuration.read` scope.

## link

Link an account with a terminal application.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/terminal-applications.write` scope.

### Example Usage

```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.LinkAccountTerminalApplication;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.errors.AccountTerminalApplicationError;
import io.moov.sdk.models.errors.GenericError;
import io.moov.sdk.models.operations.LinkAccountTerminalApplicationResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GenericError, AccountTerminalApplicationError, Exception {

        Moov sdk = Moov.builder()
                .xMoovVersion("v2024.01.00")
                .security(Security.builder()
                    .username(System.getenv().getOrDefault("", ""))
                    .password(System.getenv().getOrDefault("", ""))
                    .build())
            .build();

        LinkAccountTerminalApplicationResponse res = sdk.accountTerminalApplications().link()
                .accountID("76d4c8a0-1f2b-4e3b-8f5c-7a9e1b2c3d4e")
                .linkAccountTerminalApplication(LinkAccountTerminalApplication.builder()
                    .terminalApplicationID("12345678-1234-1234-1234-123456789012")
                    .build())
                .call();

        if (res.accountTerminalApplication().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 | Example                                                                                     |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `accountID`                                                                                 | *String*                                                                                    | :heavy_check_mark:                                                                          | N/A                                                                                         | 76d4c8a0-1f2b-4e3b-8f5c-7a9e1b2c3d4e                                                        |
| `linkAccountTerminalApplication`                                                            | [LinkAccountTerminalApplication](../../models/components/LinkAccountTerminalApplication.md) | :heavy_check_mark:                                                                          | N/A                                                                                         |                                                                                             |

### Response

**[LinkAccountTerminalApplicationResponse](../../models/operations/LinkAccountTerminalApplicationResponse.md)**

### Errors

| Error Type                                    | Status Code                                   | Content Type                                  |
| --------------------------------------------- | --------------------------------------------- | --------------------------------------------- |
| models/errors/GenericError                    | 400, 409                                      | application/json                              |
| models/errors/AccountTerminalApplicationError | 422                                           | application/json                              |
| models/errors/APIException                    | 4XX, 5XX                                      | \*/\*                                         |

## list

Retrieve all terminal applications linked to a specific account.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/terminal-applications.read` scope.

### Example Usage

```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.operations.ListAccountTerminalApplicationsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Moov sdk = Moov.builder()
                .xMoovVersion("v2024.01.00")
                .security(Security.builder()
                    .username(System.getenv().getOrDefault("", ""))
                    .password(System.getenv().getOrDefault("", ""))
                    .build())
            .build();

        ListAccountTerminalApplicationsResponse res = sdk.accountTerminalApplications().list()
                .accountID("76d4c8a0-1f2b-4e3b-8f5c-7a9e1b2c3d4e")
                .call();

        if (res.accountTerminalApplications().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                            | Type                                 | Required                             | Description                          | Example                              |
| ------------------------------------ | ------------------------------------ | ------------------------------------ | ------------------------------------ | ------------------------------------ |
| `accountID`                          | *String*                             | :heavy_check_mark:                   | N/A                                  | 76d4c8a0-1f2b-4e3b-8f5c-7a9e1b2c3d4e |

### Response

**[ListAccountTerminalApplicationsResponse](../../models/operations/ListAccountTerminalApplicationsResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## get

Verifies if a specific Terminal Application is linked to an Account. This endpoint acts as a validation check for the link's existence.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/terminal-applications.read` scope.

### Example Usage

```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.operations.GetAccountTerminalApplicationResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Moov sdk = Moov.builder()
                .xMoovVersion("v2024.01.00")
                .security(Security.builder()
                    .username(System.getenv().getOrDefault("", ""))
                    .password(System.getenv().getOrDefault("", ""))
                    .build())
            .build();

        GetAccountTerminalApplicationResponse res = sdk.accountTerminalApplications().get()
                .accountID("76d4c8a0-1f2b-4e3b-8f5c-7a9e1b2c3d4e")
                .terminalApplicationID("12345678-1234-1234-1234-123456789012")
                .call();

        if (res.accountTerminalApplication().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                            | Type                                 | Required                             | Description                          | Example                              |
| ------------------------------------ | ------------------------------------ | ------------------------------------ | ------------------------------------ | ------------------------------------ |
| `accountID`                          | *String*                             | :heavy_check_mark:                   | N/A                                  | 76d4c8a0-1f2b-4e3b-8f5c-7a9e1b2c3d4e |
| `terminalApplicationID`              | *String*                             | :heavy_check_mark:                   | N/A                                  | 12345678-1234-1234-1234-123456789012 |

### Response

**[GetAccountTerminalApplicationResponse](../../models/operations/GetAccountTerminalApplicationResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## getConfiguration

Fetch the configuration for a given Terminal Application linked to a specific Account.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/terminal-configuration.read` scope.

### Example Usage

```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.operations.GetTerminalConfigurationResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Moov sdk = Moov.builder()
                .xMoovVersion("v2024.01.00")
                .security(Security.builder()
                    .username(System.getenv().getOrDefault("", ""))
                    .password(System.getenv().getOrDefault("", ""))
                    .build())
            .build();

        GetTerminalConfigurationResponse res = sdk.accountTerminalApplications().getConfiguration()
                .accountID("76d4c8a0-1f2b-4e3b-8f5c-7a9e1b2c3d4e")
                .terminalApplicationID("12345678-1234-1234-1234-123456789012")
                .call();

        if (res.terminalConfiguration().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                            | Type                                 | Required                             | Description                          | Example                              |
| ------------------------------------ | ------------------------------------ | ------------------------------------ | ------------------------------------ | ------------------------------------ |
| `accountID`                          | *String*                             | :heavy_check_mark:                   | N/A                                  | 76d4c8a0-1f2b-4e3b-8f5c-7a9e1b2c3d4e |
| `terminalApplicationID`              | *String*                             | :heavy_check_mark:                   | N/A                                  | 12345678-1234-1234-1234-123456789012 |

### Response

**[GetTerminalConfigurationResponse](../../models/operations/GetTerminalConfigurationResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |