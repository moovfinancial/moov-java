# DepositView

## Overview

### Available Operations

* [create](#create) - Ingest a deposit account into the deposit view from a core banking source system.

The request body is a raw byte payload whose format depends on the core banking
system that produced it. Set the `X-Source-System` header to identify that system
so the payload can be parsed correctly.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/)
you'll need to specify the `/accounts/{accountID}/profile.write` scope.

## create

Ingest a deposit account into the deposit view from a core banking source system.

The request body is a raw byte payload whose format depends on the core banking
system that produced it. Set the `X-Source-System` header to identify that system
so the payload can be parsed correctly.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/)
you'll need to specify the `/accounts/{accountID}/profile.write` scope.

### Example Usage

<!-- UsageSnippet language="java" operationID="createDepositAccount" method="post" path="/underwriting/{accountID}/deposit-accounts" -->
```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.components.SourceSystem;
import io.moov.sdk.models.errors.DepositAccountValidationError;
import io.moov.sdk.models.errors.GenericError;
import io.moov.sdk.models.operations.CreateDepositAccountResponse;
import io.moov.sdk.utils.Utils;
import java.io.FileInputStream;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GenericError, DepositAccountValidationError, Exception {

        Moov sdk = Moov.builder()
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        CreateDepositAccountResponse res = sdk.depositView().create()
                .accountID("<id>")
                .xSourceSystem(SourceSystem.JH_CIF2020)
                .requestBody(Utils.readBytesAndClose(new FileInputStream("example.file")))
                .call();

    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `accountID`                                                               | *String*                                                                  | :heavy_check_mark:                                                        | N/A                                                                       |
| `xSourceSystem`                                                           | [SourceSystem](../../models/components/SourceSystem.md)                   | :heavy_check_mark:                                                        | Identifies the core banking source system that produced the request body. |
| `requestBody`                                                             | byte[]                                                                    | :heavy_check_mark:                                                        | N/A                                                                       |

### Response

**[CreateDepositAccountResponse](../../models/operations/CreateDepositAccountResponse.md)**

### Errors

| Error Type                                  | Status Code                                 | Content Type                                |
| ------------------------------------------- | ------------------------------------------- | ------------------------------------------- |
| models/errors/GenericError                  | 400, 409                                    | application/json                            |
| models/errors/DepositAccountValidationError | 422                                         | application/json                            |
| models/errors/APIException                  | 4XX, 5XX                                    | \*/\*                                       |