# EndToEndEncryption
(*endToEndEncryption()*)

## Overview

### Available Operations

* [testEncryptedToken](#testencryptedtoken) - Allows for testing a JWE token to ensure it's acceptable by Moov. 

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/ping.read` scope.
* [generateKey](#generatekey) - Generates a public key used to create a JWE token for passing secure authentication data through non-PCI compliant intermediaries.

## testEncryptedToken

Allows for testing a JWE token to ensure it's acceptable by Moov. 

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/ping.read` scope.

### Example Usage

<!-- UsageSnippet language="java" operationID="testEndToEndToken" method="post" path="/debug/end-to-end-token" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.errors.GenericError;
import io.moov.sdk.models.operations.TestEndToEndTokenResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GenericError, Exception {

        Moov sdk = Moov.builder()
                .xMoovVersion("v2024.01.00")
                .security(Security.builder()
                    .username(System.getenv().getOrDefault("", ""))
                    .password(System.getenv().getOrDefault("", ""))
                    .build())
            .build();

        TestEndToEndTokenResponse res = sdk.endToEndEncryption().testEncryptedToken()
                .token("<value>")
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                   | Type                                                                                                        | Required                                                                                                    | Description                                                                                                 |
| ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| `token`                                                                                                     | *String*                                                                                                    | :heavy_check_mark:                                                                                          | An [RFC](https://datatracker.ietf.org/doc/html/rfc7516) compact-serialized JSON Web Encryption (JWE) token. |

### Response

**[TestEndToEndTokenResponse](../../models/operations/TestEndToEndTokenResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/GenericError | 400                        | application/json           |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## generateKey

Generates a public key used to create a JWE token for passing secure authentication data through non-PCI compliant intermediaries.

### Example Usage

<!-- UsageSnippet language="java" operationID="generateEndToEndKey" method="post" path="/end-to-end-keys" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.operations.GenerateEndToEndKeyResponse;
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

        GenerateEndToEndKeyResponse res = sdk.endToEndEncryption().generateKey()
                .call();

        if (res.jsonWebKey().isPresent()) {
            // handle response
        }
    }
}
```

### Response

**[GenerateEndToEndKeyResponse](../../models/operations/GenerateEndToEndKeyResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |