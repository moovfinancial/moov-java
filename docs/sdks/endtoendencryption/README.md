# EndToEndEncryption

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
import io.moov.sdk.models.components.E2EEToken;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.errors.GenericError;
import io.moov.sdk.models.operations.TestEndToEndTokenResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GenericError, Exception {

        Moov sdk = Moov.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        E2EEToken req = E2EEToken.builder()
                .token("eyJhbGciOiJFQ0RILUVTK0EyNTZLVyIsImVuYyI6IkEyNTZHQ00iLCJlcGsiOnsia3R5IjoiRUMiLCJjcnYiOiJQLTUyMSIsIngiOiJBS0NYVDM1WVdvTm8wbzExNy1SU0dqUGg3alN1NjFmLUhnYkx1dW0xVG1ueTRlcW5yX2hyU0hpY0w1d3gwODRCWDBRZjVTdEtkRUoydzY2ZUJqWHprRV9OIiwieSI6IkFIMEJfT2RaYTQtbG43dGJ4M3VBdlc1NDNQRE9HUXBCTDloRFFNWjlTQXNfOW05UWN3dnhRd1hrb1VrM3VzT1FnVV9ySVFrNFRoZ1NTUzV4UlhKcm5ZaTkifSwia2lkIjoiYmRvV3pLekpKUGw0TVFIaENDa05WYTZlZ1dmYi02V1haSjZKTFZqQ0hWMD0ifQ.HalyoHsfufBJEODd2lD9ThQvvVWw3b2kgWDLHGxmHhMv8rODyLL_Ug.rpQP178t8Ed_pUU2.Sn9UFeVoegAxiMUv11q7l3M0y9YHSLYi2n_JB7n7Pc777_47-icfaxstJemT0IC81w.akkq1EBxzWkBr4vEomSpWA")
                .build();

        TestEndToEndTokenResponse res = sdk.endToEndEncryption().testEncryptedToken()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                     | Type                                          | Required                                      | Description                                   |
| --------------------------------------------- | --------------------------------------------- | --------------------------------------------- | --------------------------------------------- |
| `request`                                     | [E2EEToken](../../models/shared/E2EEToken.md) | :heavy_check_mark:                            | The request object to use for the request.    |

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
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        GenerateEndToEndKeyResponse res = sdk.endToEndEncryption().generateKey()
                .call();

        if (res.jsonWebKey().isPresent()) {
            System.out.println(res.jsonWebKey().get());
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