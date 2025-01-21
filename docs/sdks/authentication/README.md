# Authentication
(*authentication()*)

## Overview

### Available Operations

* [createAuthToken](#createauthtoken) - Use the `client_id` and `client_secret` to generate an access token.

## createAuthToken

Use the `client_id` and `client_secret` to generate an access token.

### Example Usage

```java
package hello.world;

import io.moov.openapi.Moov;
import io.moov.openapi.models.components.AuthTokenRequest;
import io.moov.openapi.models.components.GrantType;
import io.moov.openapi.models.components.Security;
import io.moov.openapi.models.errors.CreateAuthTokenResponseBody;
import io.moov.openapi.models.errors.GenericError;
import io.moov.openapi.models.operations.CreateAuthTokenResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GenericError, CreateAuthTokenResponseBody, Exception {

        Moov sdk = Moov.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        AuthTokenRequest req = AuthTokenRequest.builder()
                .grantType(GrantType.REFRESH_TOKEN)
                .scopes("/moov/support.read /moov/support.write")
                .build();

        CreateAuthTokenResponse res = sdk.authentication().createAuthToken()
                .request(req)
                .call();

        if (res.accessToken().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                   | Type                                                        | Required                                                    | Description                                                 |
| ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- |
| `request`                                                   | [AuthTokenRequest](../../models/shared/AuthTokenRequest.md) | :heavy_check_mark:                                          | The request object to use for the request.                  |

### Response

**[CreateAuthTokenResponse](../../models/operations/CreateAuthTokenResponse.md)**

### Errors

| Error Type                                | Status Code                               | Content Type                              |
| ----------------------------------------- | ----------------------------------------- | ----------------------------------------- |
| models/errors/GenericError                | 400, 409                                  | application/json                          |
| models/errors/CreateAuthTokenResponseBody | 422                                       | application/json                          |
| models/errors/APIException                | 4XX, 5XX                                  | \*/\*                                     |