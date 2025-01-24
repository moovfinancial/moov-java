# Ping
(*ping()*)

## Overview

### Available Operations

* [ping](#ping) - A simple endpoint to check auth.

To access this endpoint using a [token](https://docs.moov.io/api/authentication/access-tokens/) you'll need 
to specify the `/ping.read` scope.

## ping

A simple endpoint to check auth.

To access this endpoint using a [token](https://docs.moov.io/api/authentication/access-tokens/) you'll need 
to specify the `/ping.read` scope.

### Example Usage

```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.SchemeBasicAuth;
import io.moov.sdk.models.components.Versions;
import io.moov.sdk.models.operations.PingResponse;
import io.moov.sdk.models.operations.PingSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Moov sdk = Moov.builder()
            .build();

        PingResponse res = sdk.ping().ping()
                .security(PingSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .xMoovVersion(Versions.V202510)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `security`                                                                            | [io.moov.sdk.models.operations.PingSecurity](../../models/operations/PingSecurity.md) | :heavy_check_mark:                                                                    | The security requirements to use for the request.                                     |
| `xMoovVersion`                                                                        | [Optional\<Versions>](../../models/components/Versions.md)                            | :heavy_minus_sign:                                                                    | Specify an API version.                                                               |

### Response

**[PingResponse](../../models/operations/PingResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |