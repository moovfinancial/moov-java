# Institutions
(*institutions()*)

## Overview

### Available Operations

* [listInstitutions](#listinstitutions) -   Search for institutions by either their name or routing number.
  
  To use this endpoint from the browser, you'll need to specify the `/fed.read` scope when generating a [token](https://docs.moov.io/api/authentication/access-tokens/).

## listInstitutions

  Search for institutions by either their name or routing number.
  
  To use this endpoint from the browser, you'll need to specify the `/fed.read` scope when generating a [token](https://docs.moov.io/api/authentication/access-tokens/).

### Example Usage

```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.SchemeBasicAuth;
import io.moov.sdk.models.errors.GenericError;
import io.moov.sdk.models.operations.ListInstitutionsRequest;
import io.moov.sdk.models.operations.ListInstitutionsResponse;
import io.moov.sdk.models.operations.ListInstitutionsSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GenericError, Exception {

        Moov sdk = Moov.builder()
            .build();

        ListInstitutionsRequest req = ListInstitutionsRequest.builder()
                .build();

        ListInstitutionsResponse res = sdk.institutions().listInstitutions()
                .request(req)
                .security(ListInstitutionsSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .call();

        if (res.financialInstitutions().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                     | Type                                                                                                          | Required                                                                                                      | Description                                                                                                   |
| ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                     | [ListInstitutionsRequest](../../models/operations/ListInstitutionsRequest.md)                                 | :heavy_check_mark:                                                                                            | The request object to use for the request.                                                                    |
| `security`                                                                                                    | [io.moov.sdk.models.operations.ListInstitutionsSecurity](../../models/operations/ListInstitutionsSecurity.md) | :heavy_check_mark:                                                                                            | The security requirements to use for the request.                                                             |

### Response

**[ListInstitutionsResponse](../../models/operations/ListInstitutionsResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/GenericError | 400                        | application/json           |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |