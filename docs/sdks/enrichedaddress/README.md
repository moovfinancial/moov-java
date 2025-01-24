# EnrichedAddress
(*enrichedAddress()*)

## Overview

### Available Operations

* [getEnrichmentAddress](#getenrichmentaddress) -   Fetch enriched address suggestions. Requires a partial address. 
  
  To use this endpoint from the browser, you'll need to specify the `/profile-enrichment.read` scope when generating a [token](https://docs.moov.io/api/authentication/access-tokens/).

## getEnrichmentAddress

  Fetch enriched address suggestions. Requires a partial address. 
  
  To use this endpoint from the browser, you'll need to specify the `/profile-enrichment.read` scope when generating a [token](https://docs.moov.io/api/authentication/access-tokens/).

### Example Usage

```java
package hello.world;

import io.moov.api.Moov;
import io.moov.api.models.components.SchemeBasicAuth;
import io.moov.api.models.operations.GetEnrichmentAddressRequest;
import io.moov.api.models.operations.GetEnrichmentAddressResponse;
import io.moov.api.models.operations.GetEnrichmentAddressSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Moov sdk = Moov.builder()
            .build();

        GetEnrichmentAddressRequest req = GetEnrichmentAddressRequest.builder()
                .search("<value>")
                .build();

        GetEnrichmentAddressResponse res = sdk.enrichedAddress().getEnrichmentAddress()
                .request(req)
                .security(GetEnrichmentAddressSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .call();

        if (res.enrichedAddressResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                             | Type                                                                                                                  | Required                                                                                                              | Description                                                                                                           |
| --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                             | [GetEnrichmentAddressRequest](../../models/operations/GetEnrichmentAddressRequest.md)                                 | :heavy_check_mark:                                                                                                    | The request object to use for the request.                                                                            |
| `security`                                                                                                            | [io.moov.api.models.operations.GetEnrichmentAddressSecurity](../../models/operations/GetEnrichmentAddressSecurity.md) | :heavy_check_mark:                                                                                                    | The security requirements to use for the request.                                                                     |

### Response

**[GetEnrichmentAddressResponse](../../models/operations/GetEnrichmentAddressResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |