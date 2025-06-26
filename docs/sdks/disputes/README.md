# Disputes
(*disputes()*)

## Overview

### Available Operations

* [list](#list) - Returns the list of disputes. 

Read our [disputes guide](https://docs.moov.io/guides/money-movement/accept-payments/card-acceptance/disputes/) to learn more.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/transfers.read` scope.
* [get](#get) - Get a dispute by ID. 

Read our [disputes guide](https://docs.moov.io/guides/money-movement/accept-payments/card-acceptance/disputes/) to learn more.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/transfers.read` scope.
* [accept](#accept) - Accepts liability for a dispute. 

Read our [disputes guide](https://docs.moov.io/guides/money-movement/accept-payments/card-acceptance/disputes/) to learn more.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/transfers.read` scope.
* [listEvidence](#listevidence) - Returns a dispute's public evidence by its ID. 

Read our [disputes guide](https://docs.moov.io/guides/money-movement/accept-payments/card-acceptance/disputes/) to learn more.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/transfers.read` scope.
* [uploadEvidenceFile](#uploadevidencefile) - Uploads a file as evidence for a dispute. 

Read our [disputes guide](https://docs.moov.io/guides/money-movement/accept-payments/card-acceptance/disputes/) to learn more.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/transfers.write` scope.
* [uploadEvidenceText](#uploadevidencetext) - Uploads text as evidence for a dispute.

Read our [disputes guide](https://docs.moov.io/guides/money-movement/accept-payments/card-acceptance/disputes/) to learn more.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/transfers.write` scope.
* [submitEvidence](#submitevidence) - Submit the evidence associated with a dispute.

Evidence items must be uploaded using the appropriate endpoint(s) prior to calling this endpoint to submit it. **Evidence can only
be submitted once per dispute.**

Read our [disputes guide](https://docs.moov.io/guides/money-movement/accept-payments/card-acceptance/disputes/) to learn more.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/transfers.write` scope.
* [getEvidence](#getevidence) - Get dispute evidence by ID.

Read our [disputes guide](https://docs.moov.io/guides/money-movement/accept-payments/card-acceptance/disputes/) to learn more.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/transfers.read` scope.
* [updateEvidence](#updateevidence) - Updates dispute evidence by ID.

Read our [disputes guide](https://docs.moov.io/guides/money-movement/accept-payments/card-acceptance/disputes/) to learn more.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/transfers.write` scope.
* [deleteEvidence](#deleteevidence) - Deletes dispute evidence by ID. 

Read our [disputes guide](https://docs.moov.io/guides/money-movement/accept-payments/card-acceptance/disputes/) to learn more.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/transfers.write` scope.
* [getEvidenceData](#getevidencedata) - Downloads dispute evidence data by ID.

Read our [disputes guide](https://docs.moov.io/guides/money-movement/accept-payments/card-acceptance/disputes/) to learn more.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/transfers.read` scope.

## list

Returns the list of disputes. 

Read our [disputes guide](https://docs.moov.io/guides/money-movement/accept-payments/card-acceptance/disputes/) to learn more.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/transfers.read` scope.

### Example Usage

```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.errors.GenericError;
import io.moov.sdk.models.operations.ListDisputesRequest;
import io.moov.sdk.models.operations.ListDisputesResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GenericError, Exception {

        Moov sdk = Moov.builder()
                .xMoovVersion("v2024.01.00")
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        ListDisputesRequest req = ListDisputesRequest.builder()
                .accountID("6fee8f6c-b2c5-44a4-aebb-718335fe4f8e")
                .skip(60L)
                .count(20L)
                .build();

        ListDisputesResponse res = sdk.disputes().list()
                .request(req)
                .call();

        if (res.disputes().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [ListDisputesRequest](../../models/operations/ListDisputesRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[ListDisputesResponse](../../models/operations/ListDisputesResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/GenericError | 400, 409                   | application/json           |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## get

Get a dispute by ID. 

Read our [disputes guide](https://docs.moov.io/guides/money-movement/accept-payments/card-acceptance/disputes/) to learn more.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/transfers.read` scope.

### Example Usage

```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.operations.GetDisputeResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Moov sdk = Moov.builder()
                .xMoovVersion("v2024.01.00")
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        GetDisputeResponse res = sdk.disputes().get()
                .accountID("44d3e9dd-7128-4b00-8cd9-09d3242e5bcf")
                .disputeID("4be10af9-ddeb-428b-8333-7430afce142f")
                .call();

        if (res.dispute().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `accountID`        | *String*           | :heavy_check_mark: | N/A                |
| `disputeID`        | *String*           | :heavy_check_mark: | N/A                |

### Response

**[GetDisputeResponse](../../models/operations/GetDisputeResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## accept

Accepts liability for a dispute. 

Read our [disputes guide](https://docs.moov.io/guides/money-movement/accept-payments/card-acceptance/disputes/) to learn more.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/transfers.read` scope.

### Example Usage

```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.errors.GenericError;
import io.moov.sdk.models.operations.AcceptDisputeResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GenericError, Exception {

        Moov sdk = Moov.builder()
                .xMoovVersion("v2024.01.00")
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        AcceptDisputeResponse res = sdk.disputes().accept()
                .accountID("ef028cdd-49e0-4cd8-9c89-6673e28e226e")
                .disputeID("b7cf0931-5fbb-4e79-94cb-96291b634f63")
                .call();

        if (res.dispute().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `accountID`        | *String*           | :heavy_check_mark: | N/A                |
| `disputeID`        | *String*           | :heavy_check_mark: | N/A                |

### Response

**[AcceptDisputeResponse](../../models/operations/AcceptDisputeResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/GenericError | 400, 409                   | application/json           |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## listEvidence

Returns a dispute's public evidence by its ID. 

Read our [disputes guide](https://docs.moov.io/guides/money-movement/accept-payments/card-acceptance/disputes/) to learn more.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/transfers.read` scope.

### Example Usage

```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.operations.ListDisputeEvidenceResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Moov sdk = Moov.builder()
                .xMoovVersion("v2024.01.00")
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        ListDisputeEvidenceResponse res = sdk.disputes().listEvidence()
                .accountID("efc12040-97af-4720-91c5-14cd1a83877b")
                .disputeID("f1c23432-4110-4981-9b72-b98df94bb61c")
                .call();

        if (res.disputeEvidenceResponses().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `accountID`        | *String*           | :heavy_check_mark: | N/A                |
| `disputeID`        | *String*           | :heavy_check_mark: | N/A                |

### Response

**[ListDisputeEvidenceResponse](../../models/operations/ListDisputeEvidenceResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## uploadEvidenceFile

Uploads a file as evidence for a dispute. 

Read our [disputes guide](https://docs.moov.io/guides/money-movement/accept-payments/card-acceptance/disputes/) to learn more.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/transfers.write` scope.

### Example Usage

```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.*;
import io.moov.sdk.models.errors.FileUploadValidationError;
import io.moov.sdk.models.errors.GenericError;
import io.moov.sdk.models.operations.UploadDisputeEvidenceFileResponse;
import io.moov.sdk.utils.Utils;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GenericError, FileUploadValidationError, Exception {

        Moov sdk = Moov.builder()
                .xMoovVersion("v2024.01.00")
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        UploadDisputeEvidenceFileResponse res = sdk.disputes().uploadEvidenceFile()
                .accountID("fbed9e03-f856-45d3-8ddc-67dad27f84d0")
                .disputeID("b1db0cf5-be00-41d7-a125-1d2d283c2a62")
                .createEvidenceFileMultiPart(CreateEvidenceFileMultiPart.builder()
                    .file(File.builder()
                        .fileName("example.file")
                        .content(Utils.readBytes("example.file"))
                        .build())
                    .evidenceType(EvidenceType.CANCELATION_POLICY)
                    .build())
                .call();

        if (res.evidenceUploadResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `accountID`                                                                           | *String*                                                                              | :heavy_check_mark:                                                                    | N/A                                                                                   |
| `disputeID`                                                                           | *String*                                                                              | :heavy_check_mark:                                                                    | N/A                                                                                   |
| `createEvidenceFileMultiPart`                                                         | [CreateEvidenceFileMultiPart](../../models/components/CreateEvidenceFileMultiPart.md) | :heavy_check_mark:                                                                    | N/A                                                                                   |

### Response

**[UploadDisputeEvidenceFileResponse](../../models/operations/UploadDisputeEvidenceFileResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| models/errors/GenericError              | 400, 409                                | application/json                        |
| models/errors/FileUploadValidationError | 422                                     | application/json                        |
| models/errors/APIException              | 4XX, 5XX                                | \*/\*                                   |

## uploadEvidenceText

Uploads text as evidence for a dispute.

Read our [disputes guide](https://docs.moov.io/guides/money-movement/accept-payments/card-acceptance/disputes/) to learn more.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/transfers.write` scope.

### Example Usage

```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.*;
import io.moov.sdk.models.errors.GenericError;
import io.moov.sdk.models.operations.UploadDisputeEvidenceTextResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GenericError, Exception {

        Moov sdk = Moov.builder()
                .xMoovVersion("v2024.01.00")
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        UploadDisputeEvidenceTextResponse res = sdk.disputes().uploadEvidenceText()
                .accountID("ed2ca924-e2c4-4f3a-b077-866bb07b0671")
                .disputeID("14832e8d-3613-45ce-942e-3116b9e0d194")
                .createEvidenceText(CreateEvidenceText.builder()
                    .text("<value>")
                    .evidenceType(EvidenceType.GENERIC_EVIDENCE)
                    .build())
                .call();

        if (res.evidenceTextResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `accountID`                                                         | *String*                                                            | :heavy_check_mark:                                                  | N/A                                                                 |
| `disputeID`                                                         | *String*                                                            | :heavy_check_mark:                                                  | N/A                                                                 |
| `createEvidenceText`                                                | [CreateEvidenceText](../../models/components/CreateEvidenceText.md) | :heavy_check_mark:                                                  | N/A                                                                 |

### Response

**[UploadDisputeEvidenceTextResponse](../../models/operations/UploadDisputeEvidenceTextResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/GenericError | 400, 409                   | application/json           |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## submitEvidence

Submit the evidence associated with a dispute.

Evidence items must be uploaded using the appropriate endpoint(s) prior to calling this endpoint to submit it. **Evidence can only
be submitted once per dispute.**

Read our [disputes guide](https://docs.moov.io/guides/money-movement/accept-payments/card-acceptance/disputes/) to learn more.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/transfers.write` scope.

### Example Usage

```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.errors.GenericError;
import io.moov.sdk.models.operations.SubmitDisputeEvidenceResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GenericError, Exception {

        Moov sdk = Moov.builder()
                .xMoovVersion("v2024.01.00")
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        SubmitDisputeEvidenceResponse res = sdk.disputes().submitEvidence()
                .accountID("01f79d04-f2de-42de-9e37-23c751edecb4")
                .disputeID("8c5d6d6e-420a-49c8-b7c3-d4b5d1bbd415")
                .call();

        if (res.dispute().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `accountID`        | *String*           | :heavy_check_mark: | N/A                |
| `disputeID`        | *String*           | :heavy_check_mark: | N/A                |

### Response

**[SubmitDisputeEvidenceResponse](../../models/operations/SubmitDisputeEvidenceResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/GenericError | 400, 409                   | application/json           |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## getEvidence

Get dispute evidence by ID.

Read our [disputes guide](https://docs.moov.io/guides/money-movement/accept-payments/card-acceptance/disputes/) to learn more.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/transfers.read` scope.

### Example Usage

```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.operations.GetDisputeEvidenceResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Moov sdk = Moov.builder()
                .xMoovVersion("v2024.01.00")
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        GetDisputeEvidenceResponse res = sdk.disputes().getEvidence()
                .accountID("ab59cc9a-6480-40fe-8a06-8c41883e3c79")
                .disputeID("4fc54609-7e6b-4a75-b8b3-7ffbeb138e22")
                .evidenceID("08c4d04c-1296-4bfd-bafb-bee195f85785")
                .call();

        if (res.disputeEvidenceResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `accountID`        | *String*           | :heavy_check_mark: | N/A                |
| `disputeID`        | *String*           | :heavy_check_mark: | N/A                |
| `evidenceID`       | *String*           | :heavy_check_mark: | N/A                |

### Response

**[GetDisputeEvidenceResponse](../../models/operations/GetDisputeEvidenceResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## updateEvidence

Updates dispute evidence by ID.

Read our [disputes guide](https://docs.moov.io/guides/money-movement/accept-payments/card-acceptance/disputes/) to learn more.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/transfers.write` scope.

### Example Usage

```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.components.UpdateEvidence;
import io.moov.sdk.models.errors.GenericError;
import io.moov.sdk.models.operations.UpdateDisputeEvidenceResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GenericError, Exception {

        Moov sdk = Moov.builder()
                .xMoovVersion("v2024.01.00")
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        UpdateDisputeEvidenceResponse res = sdk.disputes().updateEvidence()
                .accountID("bc2af75d-427a-486d-8580-3adfa9599023")
                .disputeID("36df0cea-d95d-427e-ba60-c9923d1e25a7")
                .evidenceID("fd46ede8-5d47-4e5e-91a7-9af8162f76b2")
                .updateEvidence(UpdateEvidence.builder()
                    .build())
                .call();

        if (res.disputeEvidenceResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                   | Type                                                        | Required                                                    | Description                                                 |
| ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- |
| `accountID`                                                 | *String*                                                    | :heavy_check_mark:                                          | N/A                                                         |
| `disputeID`                                                 | *String*                                                    | :heavy_check_mark:                                          | N/A                                                         |
| `evidenceID`                                                | *String*                                                    | :heavy_check_mark:                                          | N/A                                                         |
| `updateEvidence`                                            | [UpdateEvidence](../../models/components/UpdateEvidence.md) | :heavy_check_mark:                                          | N/A                                                         |

### Response

**[UpdateDisputeEvidenceResponse](../../models/operations/UpdateDisputeEvidenceResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/GenericError | 400                        | application/json           |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## deleteEvidence

Deletes dispute evidence by ID. 

Read our [disputes guide](https://docs.moov.io/guides/money-movement/accept-payments/card-acceptance/disputes/) to learn more.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/transfers.write` scope.

### Example Usage

```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.errors.GenericError;
import io.moov.sdk.models.operations.DeleteDisputeEvidenceFileResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GenericError, Exception {

        Moov sdk = Moov.builder()
                .xMoovVersion("v2024.01.00")
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        DeleteDisputeEvidenceFileResponse res = sdk.disputes().deleteEvidence()
                .accountID("b21731c6-3497-46a3-859a-3761a6b8e096")
                .disputeID("1759456d-80e3-4428-a08d-302c8877b418")
                .evidenceID("ea10cba6-166f-464d-b57b-30d995d44b98")
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `accountID`        | *String*           | :heavy_check_mark: | N/A                |
| `disputeID`        | *String*           | :heavy_check_mark: | N/A                |
| `evidenceID`       | *String*           | :heavy_check_mark: | N/A                |

### Response

**[DeleteDisputeEvidenceFileResponse](../../models/operations/DeleteDisputeEvidenceFileResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/GenericError | 409                        | application/json           |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## getEvidenceData

Downloads dispute evidence data by ID.

Read our [disputes guide](https://docs.moov.io/guides/money-movement/accept-payments/card-acceptance/disputes/) to learn more.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/transfers.read` scope.

### Example Usage

```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.Security;
import io.moov.sdk.models.operations.GetDisputeEvidenceDataResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Moov sdk = Moov.builder()
                .xMoovVersion("v2024.01.00")
                .security(Security.builder()
                    .username("")
                    .password("")
                    .build())
            .build();

        GetDisputeEvidenceDataResponse res = sdk.disputes().getEvidenceData()
                .accountID("83e6bc61-f894-4cd8-b847-d617383323fb")
                .disputeID("b7e45862-1e55-4ba0-842f-9fce30c0228b")
                .evidenceID("3d195b92-798e-4ea4-9347-1c86efacbf38")
                .call();

        if (res.twoHundredApplicationPdfResponseStream().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `accountID`        | *String*           | :heavy_check_mark: | N/A                |
| `disputeID`        | *String*           | :heavy_check_mark: | N/A                |
| `evidenceID`       | *String*           | :heavy_check_mark: | N/A                |

### Response

**[GetDisputeEvidenceDataResponse](../../models/operations/GetDisputeEvidenceDataResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |