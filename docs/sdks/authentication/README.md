# Authentication

## Overview

### Available Operations

* [revokeAccessToken](#revokeaccesstoken) - Revoke an auth token.

Allows clients to notify the authorization server that a previously obtained refresh or access token is no longer needed.
* [createAccessToken](#createaccesstoken) - Create or refresh an access token.

## revokeAccessToken

Revoke an auth token.

Allows clients to notify the authorization server that a previously obtained refresh or access token is no longer needed.

### Example Usage

<!-- UsageSnippet language="java" operationID="revokeAccessToken" method="post" path="/oauth2/revoke" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.RevokeTokenRequest;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.errors.GenericError;
import io.moov.sdk.models.errors.RevokeTokenRequestError;
import io.moov.sdk.models.operations.RevokeAccessTokenResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GenericError, RevokeTokenRequestError, Exception {

        Moov sdk = Moov.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        RevokeTokenRequest req = RevokeTokenRequest.builder()
                .token("<value>")
                .clientId("5clTR_MdVrrkgxw2")
                .clientSecret("dNC-hg7sVm22jc3g_Eogtyu0_1Mqh_4-")
                .build();

        RevokeAccessTokenResponse res = sdk.authentication().revokeAccessToken()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                       | Type                                                            | Required                                                        | Description                                                     |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `request`                                                       | [RevokeTokenRequest](../../models/shared/RevokeTokenRequest.md) | :heavy_check_mark:                                              | The request object to use for the request.                      |

### Response

**[RevokeAccessTokenResponse](../../models/operations/RevokeAccessTokenResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/GenericError            | 400                                   | application/json                      |
| models/errors/RevokeTokenRequestError | 422                                   | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |

## createAccessToken

Create or refresh an access token.

### Example Usage

<!-- UsageSnippet language="java" operationID="createAccessToken" method="post" path="/oauth2/token" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.*;
import io.moov.sdk.models.errors.AuthTokenRequestError;
import io.moov.sdk.models.errors.GenericError;
import io.moov.sdk.models.operations.CreateAccessTokenResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GenericError, AuthTokenRequestError, Exception {

        Moov sdk = Moov.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        AuthTokenRequest req = AuthTokenRequest.builder()
                .grantType(GrantType.CLIENT_CREDENTIALS)
                .clientId("5clTR_MdVrrkgxw2")
                .clientSecret("dNC-hg7sVm22jc3g_Eogtyu0_1Mqh_4-")
                .scope("/accounts.read /accounts.write")
                .refreshToken("eyJhbGc0eSI6TQSIsImN0kpXVCIsImtp6IkpXVsImtpZC0a...")
                .build();

        CreateAccessTokenResponse res = sdk.authentication().createAccessToken()
                .request(req)
                .call();

        if (res.authToken().isPresent()) {
            System.out.println(res.authToken().get());
        }
    }
}
```

### Parameters

| Parameter                                                   | Type                                                        | Required                                                    | Description                                                 |
| ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- |
| `request`                                                   | [AuthTokenRequest](../../models/shared/AuthTokenRequest.md) | :heavy_check_mark:                                          | The request object to use for the request.                  |

### Response

**[CreateAccessTokenResponse](../../models/operations/CreateAccessTokenResponse.md)**

### Errors

| Error Type                          | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/GenericError          | 400                                 | application/json                    |
| models/errors/AuthTokenRequestError | 422                                 | application/json                    |
| models/errors/APIException          | 4XX, 5XX                            | \*/\*                               |