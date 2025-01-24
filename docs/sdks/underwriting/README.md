# Underwriting
(*underwriting()*)

## Overview

### Available Operations

* [getUnderwriting](#getunderwriting) - Retrieve underwriting associated with a given Moov account. 

Read our [underwriting guide](https://docs.moov.io/guides/accounts/requirements/underwriting/) to learn more. 

To access this endpoint using a [token](https://docs.moov.io/api/authentication/access-tokens/) you'll need 
to specify the `/accounts/{accountID}/profile.read` scope.
* [updateUnderwriting](#updateunderwriting) - Update the account's underwriting by passing new values for one or more of the fields. 

Read our [underwriting guide](https://docs.moov.io/guides/accounts/requirements/underwriting/) to learn more.

To access this endpoint using a [token](https://docs.moov.io/api/authentication/access-tokens/) you'll need 
to specify the `/accounts/{accountID}/profile.write` scope.

## getUnderwriting

Retrieve underwriting associated with a given Moov account. 

Read our [underwriting guide](https://docs.moov.io/guides/accounts/requirements/underwriting/) to learn more. 

To access this endpoint using a [token](https://docs.moov.io/api/authentication/access-tokens/) you'll need 
to specify the `/accounts/{accountID}/profile.read` scope.

### Example Usage

```java
package hello.world;

import io.moov.api.Moov;
import io.moov.api.models.components.SchemeBasicAuth;
import io.moov.api.models.components.Versions;
import io.moov.api.models.operations.GetUnderwritingResponse;
import io.moov.api.models.operations.GetUnderwritingSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Moov sdk = Moov.builder()
            .build();

        GetUnderwritingResponse res = sdk.underwriting().getUnderwriting()
                .security(GetUnderwritingSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .xMoovVersion(Versions.V202501)
                .accountID("32ccafba-5d99-40e5-a8af-d05cc5d73a4e")
                .call();

        if (res.underwriting().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                   | Type                                                                                                        | Required                                                                                                    | Description                                                                                                 |
| ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                  | [io.moov.api.models.operations.GetUnderwritingSecurity](../../models/operations/GetUnderwritingSecurity.md) | :heavy_check_mark:                                                                                          | The security requirements to use for the request.                                                           |
| `xMoovVersion`                                                                                              | [Optional\<Versions>](../../models/components/Versions.md)                                                  | :heavy_minus_sign:                                                                                          | Specify an API version.                                                                                     |
| `accountID`                                                                                                 | *String*                                                                                                    | :heavy_check_mark:                                                                                          | N/A                                                                                                         |

### Response

**[GetUnderwritingResponse](../../models/operations/GetUnderwritingResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## updateUnderwriting

Update the account's underwriting by passing new values for one or more of the fields. 

Read our [underwriting guide](https://docs.moov.io/guides/accounts/requirements/underwriting/) to learn more.

To access this endpoint using a [token](https://docs.moov.io/api/authentication/access-tokens/) you'll need 
to specify the `/accounts/{accountID}/profile.write` scope.

### Example Usage

```java
package hello.world;

import io.moov.api.Moov;
import io.moov.api.models.components.CardVolumeDistribution;
import io.moov.api.models.components.FulfillmentDetails;
import io.moov.api.models.components.ReturnPolicyType;
import io.moov.api.models.components.SchemeBasicAuth;
import io.moov.api.models.components.UpdateUnderwriting;
import io.moov.api.models.components.Versions;
import io.moov.api.models.components.VolumeByCustomerType;
import io.moov.api.models.errors.GenericError;
import io.moov.api.models.errors.UpdateUnderwritingError;
import io.moov.api.models.operations.UpdateUnderwritingResponse;
import io.moov.api.models.operations.UpdateUnderwritingSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GenericError, UpdateUnderwritingError, Exception {

        Moov sdk = Moov.builder()
            .build();

        UpdateUnderwritingResponse res = sdk.underwriting().updateUnderwriting()
                .security(UpdateUnderwritingSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .xMoovVersion(Versions.V202401)
                .accountID("455b1698-1657-4c75-944b-57db42578d81")
                .updateUnderwriting(UpdateUnderwriting.builder()
                    .averageTransactionSize(686L)
                    .maxTransactionSize(927778L)
                    .averageMonthlyTransactionVolume(363635L)
                    .volumeByCustomerType(VolumeByCustomerType.builder()
                        .businessToBusinessPercentage(103054)
                        .consumerToBusinessPercentage(891201)
                        .build())
                    .cardVolumeDistribution(CardVolumeDistribution.builder()
                        .ecommercePercentage(139066)
                        .cardPresentPercentage(457019)
                        .mailOrPhonePercentage(477438)
                        .debtRepaymentPercentage(372012)
                        .build())
                    .fulfillment(FulfillmentDetails.builder()
                        .hasPhysicalGoods(false)
                        .isShippingProduct(true)
                        .shipmentDurationDays(571329L)
                        .returnPolicy(ReturnPolicyType.OTHER)
                        .build())
                    .build())
                .call();

        if (res.underwriting().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                         | Type                                                                                                              | Required                                                                                                          | Description                                                                                                       |
| ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                        | [io.moov.api.models.operations.UpdateUnderwritingSecurity](../../models/operations/UpdateUnderwritingSecurity.md) | :heavy_check_mark:                                                                                                | The security requirements to use for the request.                                                                 |
| `xMoovVersion`                                                                                                    | [Optional\<Versions>](../../models/components/Versions.md)                                                        | :heavy_minus_sign:                                                                                                | Specify an API version.                                                                                           |
| `accountID`                                                                                                       | *String*                                                                                                          | :heavy_check_mark:                                                                                                | N/A                                                                                                               |
| `updateUnderwriting`                                                                                              | [UpdateUnderwriting](../../models/components/UpdateUnderwriting.md)                                               | :heavy_check_mark:                                                                                                | N/A                                                                                                               |

### Response

**[UpdateUnderwritingResponse](../../models/operations/UpdateUnderwritingResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/GenericError            | 400, 409                              | application/json                      |
| models/errors/UpdateUnderwritingError | 422                                   | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |