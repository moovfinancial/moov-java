# ResolutionLinks

## Overview

### Available Operations

* [create](#create) - Create a resolution link for the specified account. Resolution links are temporary, secure links
sent to merchants to resolve account requirements such as KYC verification or document uploads.  Only one active resolution link
is allowed per connected account. 

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/)
you'll need to specify the `/accounts/{accountID}/profile.write`, `/accounts/{accountID}/representatives.write` and `/accounts/{accountID}/files.write` scopes.
* [list](#list) - List resolution links for the specified account.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/)
you'll need to specify the `/accounts/{accountID}/profile.read` scope.
* [get](#get) - Get a resolution link by code.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/)
you'll need to specify the `/accounts/{accountID}/profile.read` scope.
* [disable](#disable) - Disable a resolution link. Disabled resolution links can no longer be used by merchants.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/)
you'll need to specify the `/accounts/{accountID}/profile.write` scope.

## create

Create a resolution link for the specified account. Resolution links are temporary, secure links
sent to merchants to resolve account requirements such as KYC verification or document uploads.  Only one active resolution link
is allowed per connected account. 

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/)
you'll need to specify the `/accounts/{accountID}/profile.write`, `/accounts/{accountID}/representatives.write` and `/accounts/{accountID}/files.write` scopes.

### Example Usage

<!-- UsageSnippet language="java" operationID="createResolutionLink" method="post" path="/accounts/{accountID}/resolution-links" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.*;
import io.moov.sdk.models.errors.CreateResolutionLinkError;
import io.moov.sdk.models.errors.GenericError;
import io.moov.sdk.models.operations.CreateResolutionLinkResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GenericError, CreateResolutionLinkError, Exception {

        Moov sdk = Moov.builder()
                .xMoovVersion("<value>")
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        CreateResolutionLinkResponse res = sdk.resolutionLinks().create()
                .accountID("<id>")
                .createResolutionLink(CreateResolutionLink.builder()
                    .recipient(ResolutionLinkRecipient.builder()
                        .phone(PhoneNumber.builder()
                            .number("5555555555")
                            .countryCode("1")
                            .build())
                        .build())
                    .build())
                .call();

        if (res.resolutionLink().isPresent()) {
            System.out.println(res.resolutionLink().get());
        }
    }
}
```

### Parameters

| Parameter                                                                    | Type                                                                         | Required                                                                     | Description                                                                  | Example                                                                      |
| ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- |
| `accountID`                                                                  | *String*                                                                     | :heavy_check_mark:                                                           | N/A                                                                          |                                                                              |
| `createResolutionLink`                                                       | [CreateResolutionLink](../../models/components/CreateResolutionLink.md)      | :heavy_check_mark:                                                           | N/A                                                                          | {<br/>"recipient": {<br/>"phone": {<br/>"number": "5555555555",<br/>"countryCode": "1"<br/>}<br/>}<br/>} |

### Response

**[CreateResolutionLinkResponse](../../models/operations/CreateResolutionLinkResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| models/errors/GenericError              | 400, 409                                | application/json                        |
| models/errors/CreateResolutionLinkError | 422                                     | application/json                        |
| models/errors/APIException              | 4XX, 5XX                                | \*/\*                                   |

## list

List resolution links for the specified account.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/)
you'll need to specify the `/accounts/{accountID}/profile.read` scope.

### Example Usage

<!-- UsageSnippet language="java" operationID="listResolutionLinks" method="get" path="/accounts/{accountID}/resolution-links" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.operations.ListResolutionLinksResponse;
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

        ListResolutionLinksResponse res = sdk.resolutionLinks().list()
                .accountID("<id>")
                .call();

        if (res.resolutionLinks().isPresent()) {
            System.out.println(res.resolutionLinks().get());
        }
    }
}
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `accountID`        | *String*           | :heavy_check_mark: | N/A                |

### Response

**[ListResolutionLinksResponse](../../models/operations/ListResolutionLinksResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## get

Get a resolution link by code.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/)
you'll need to specify the `/accounts/{accountID}/profile.read` scope.

### Example Usage

<!-- UsageSnippet language="java" operationID="getResolutionLink" method="get" path="/accounts/{accountID}/resolution-links/{resolutionLinkCode}" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.operations.GetResolutionLinkResponse;
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

        GetResolutionLinkResponse res = sdk.resolutionLinks().get()
                .accountID("<id>")
                .resolutionLinkCode("<value>")
                .call();

        if (res.resolutionLink().isPresent()) {
            System.out.println(res.resolutionLink().get());
        }
    }
}
```

### Parameters

| Parameter            | Type                 | Required             | Description          |
| -------------------- | -------------------- | -------------------- | -------------------- |
| `accountID`          | *String*             | :heavy_check_mark:   | N/A                  |
| `resolutionLinkCode` | *String*             | :heavy_check_mark:   | N/A                  |

### Response

**[GetResolutionLinkResponse](../../models/operations/GetResolutionLinkResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## disable

Disable a resolution link. Disabled resolution links can no longer be used by merchants.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/)
you'll need to specify the `/accounts/{accountID}/profile.write` scope.

### Example Usage

<!-- UsageSnippet language="java" operationID="disableResolutionLink" method="delete" path="/accounts/{accountID}/resolution-links/{resolutionLinkCode}" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.errors.GenericError;
import io.moov.sdk.models.operations.DisableResolutionLinkResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GenericError, Exception {

        Moov sdk = Moov.builder()
                .xMoovVersion("<value>")
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        DisableResolutionLinkResponse res = sdk.resolutionLinks().disable()
                .accountID("<id>")
                .resolutionLinkCode("<value>")
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter            | Type                 | Required             | Description          |
| -------------------- | -------------------- | -------------------- | -------------------- |
| `accountID`          | *String*             | :heavy_check_mark:   | N/A                  |
| `resolutionLinkCode` | *String*             | :heavy_check_mark:   | N/A                  |

### Response

**[DisableResolutionLinkResponse](../../models/operations/DisableResolutionLinkResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/GenericError | 400, 409                   | application/json           |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |