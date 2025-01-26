# Authentication
(*authentication()*)

## Overview

### Available Operations

* [revokeAccessToken](#revokeaccesstoken) - Revoke an auth token.

Allows clients to notify the authorization server that a previously obtained refresh or access token is no longer needed.
* [createAccessToken](#createaccesstoken) - Create or refresh an access token.

## revokeAccessToken

Revoke an auth token.

Allows clients to notify the authorization server that a previously obtained refresh or access token is no longer needed.

### Example Usage

```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.RevokeTokenRequest;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.components.Versions;
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

        RevokeAccessTokenResponse res = sdk.authentication().revokeAccessToken()
                .xMoovVersion(Versions.V202510)
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

```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.AuthTokenRequest;
import io.moov.sdk.models.components.GrantType;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.components.Versions;
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

        CreateAccessTokenResponse res = sdk.authentication().createAccessToken()
                .xMoovVersion(Versions.V202504)
                .authTokenRequest(AuthTokenRequest.builder()
                    .grantType(GrantType.CLIENT_CREDENTIALS)
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

**[CreateAccessTokenResponse](../../models/operations/CreateAccessTokenResponse.md)**

### Errors

| Error Type                          | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/GenericError          | 400                                 | application/json                    |
| models/errors/AuthTokenRequestError | 422                                 | application/json                    |
| models/errors/APIException          | 4XX, 5XX                            | \*/\*                               |