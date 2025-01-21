# Authentication
(*authentication()*)

## Overview

### Available Operations

* [revokeAuthToken](#revokeauthtoken) - Revoke an auth token.

Allows clients to notify the authorization server that a previously obtained refresh or access token is no longer needed.
* [createAuthToken](#createauthtoken) - Create or refresh an access token.

## revokeAuthToken

Revoke an auth token.

Allows clients to notify the authorization server that a previously obtained refresh or access token is no longer needed.

### Example Usage

```java
package hello.world;

import io.moov.openapi.Moov;
import io.moov.openapi.models.components.RevokeTokenRequest;
import io.moov.openapi.models.components.Security;
import io.moov.openapi.models.components.Versions;
import io.moov.openapi.models.errors.GenericError;
import io.moov.openapi.models.errors.RevokeTokenRequestError;
import io.moov.openapi.models.operations.RevokeAuthTokenResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GenericError, RevokeTokenRequestError, Exception {

        Moov sdk = Moov.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        RevokeAuthTokenResponse res = sdk.authentication().revokeAuthToken()
                .xMoovVersion(Versions.LATEST)
                .revokeTokenRequest(RevokeTokenRequest.builder()
                    .token("<value>")
                    .clientId("5clTR_MdVrrkgxw2")
                    .clientSecret("dNC-hg7sVm22jc3g_Eogtyu0_1Mqh_4-")
                    .build())
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `xMoovVersion`                                                      | [Optional\<Versions>](../../models/components/Versions.md)          | :heavy_minus_sign:                                                  | Specify an API version.                                             |
| `revokeTokenRequest`                                                | [RevokeTokenRequest](../../models/components/RevokeTokenRequest.md) | :heavy_check_mark:                                                  | N/A                                                                 |

### Response

**[RevokeAuthTokenResponse](../../models/operations/RevokeAuthTokenResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/GenericError            | 400                                   | application/json                      |
| models/errors/RevokeTokenRequestError | 422                                   | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |

## createAuthToken

Create or refresh an access token.

### Example Usage

```java
package hello.world;

import io.moov.openapi.Moov;
import io.moov.openapi.models.components.AuthTokenRequest;
import io.moov.openapi.models.components.GrantType;
import io.moov.openapi.models.components.Security;
import io.moov.openapi.models.components.Versions;
import io.moov.openapi.models.errors.AuthTokenRequestError;
import io.moov.openapi.models.errors.GenericError;
import io.moov.openapi.models.operations.CreateAuthTokenResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GenericError, AuthTokenRequestError, Exception {

        Moov sdk = Moov.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        CreateAuthTokenResponse res = sdk.authentication().createAuthToken()
                .xMoovVersion(Versions.LATEST)
                .authTokenRequest(AuthTokenRequest.builder()
                    .grantType(GrantType.REFRESH_TOKEN)
                    .clientId("5clTR_MdVrrkgxw2")
                    .clientSecret("dNC-hg7sVm22jc3g_Eogtyu0_1Mqh_4-")
                    .scope("/accounts.read /accounts.write")
                    .refreshToken("eyJhbGc0eSI6TQSIsImN0kpXVCIsImtp6IkpXVsImtpZC0a...")
                    .build())
                .call();

        if (res.authToken().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                       | Type                                                            | Required                                                        | Description                                                     |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `xMoovVersion`                                                  | [Optional\<Versions>](../../models/components/Versions.md)      | :heavy_minus_sign:                                              | Specify an API version.                                         |
| `authTokenRequest`                                              | [AuthTokenRequest](../../models/components/AuthTokenRequest.md) | :heavy_check_mark:                                              | N/A                                                             |

### Response

**[CreateAuthTokenResponse](../../models/operations/CreateAuthTokenResponse.md)**

### Errors

| Error Type                          | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/GenericError          | 400                                 | application/json                    |
| models/errors/AuthTokenRequestError | 422                                 | application/json                    |
| models/errors/APIException          | 4XX, 5XX                            | \*/\*                               |