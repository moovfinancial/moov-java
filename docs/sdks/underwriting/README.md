# Underwriting
(*underwriting()*)

## Overview

### Available Operations

* [get](#get) - Retrieve underwriting associated with a given Moov account. 

Read our [underwriting guide](https://docs.moov.io/guides/accounts/requirements/underwriting/) to learn more. 

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/profile.read` scope.
* [update](#update) - Update the account's underwriting by passing new values for one or more of the fields. 

Read our [underwriting guide](https://docs.moov.io/guides/accounts/requirements/underwriting/) to learn more.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/profile.write` scope.

## get

Retrieve underwriting associated with a given Moov account. 

Read our [underwriting guide](https://docs.moov.io/guides/accounts/requirements/underwriting/) to learn more. 

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/profile.read` scope.

### Example Usage

```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.SchemeBasicAuth;
import io.moov.sdk.models.components.Versions;
import io.moov.sdk.models.operations.GetUnderwritingResponse;
import io.moov.sdk.models.operations.GetUnderwritingSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Moov sdk = Moov.builder()
            .build();

        GetUnderwritingResponse res = sdk.underwriting().get()
                .security(GetUnderwritingSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .xMoovVersion(Versions.V202510)
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
| `security`                                                                                                  | [io.moov.sdk.models.operations.GetUnderwritingSecurity](../../models/operations/GetUnderwritingSecurity.md) | :heavy_check_mark:                                                                                          | The security requirements to use for the request.                                                           |
| `xMoovVersion`                                                                                              | [Optional\<Versions>](../../models/components/Versions.md)                                                  | :heavy_minus_sign:                                                                                          | Specify an API version.                                                                                     |
| `accountID`                                                                                                 | *String*                                                                                                    | :heavy_check_mark:                                                                                          | N/A                                                                                                         |

### Response

**[GetUnderwritingResponse](../../models/operations/GetUnderwritingResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## update

Update the account's underwriting by passing new values for one or more of the fields. 

Read our [underwriting guide](https://docs.moov.io/guides/accounts/requirements/underwriting/) to learn more.

To access this endpoint using an [access token](https://docs.moov.io/api/authentication/access-tokens/) 
you'll need to specify the `/accounts/{accountID}/profile.write` scope.

### Example Usage

```java
package hello.world;

import io.moov.sdk.Moov;
import io.moov.sdk.models.components.CardVolumeDistribution;
import io.moov.sdk.models.components.FulfillmentDetails;
import io.moov.sdk.models.components.ReturnPolicyType;
import io.moov.sdk.models.components.SchemeBasicAuth;
import io.moov.sdk.models.components.UpdateUnderwriting;
import io.moov.sdk.models.components.Versions;
import io.moov.sdk.models.components.VolumeByCustomerType;
import io.moov.sdk.models.errors.GenericError;
import io.moov.sdk.models.errors.UpdateUnderwritingError;
import io.moov.sdk.models.operations.UpdateUnderwritingResponse;
import io.moov.sdk.models.operations.UpdateUnderwritingSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GenericError, UpdateUnderwritingError, Exception {

        Moov sdk = Moov.builder()
            .build();

        UpdateUnderwritingResponse res = sdk.underwriting().update()
                .security(UpdateUnderwritingSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .xMoovVersion(Versions.LATEST)
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
| `security`                                                                                                        | [io.moov.sdk.models.operations.UpdateUnderwritingSecurity](../../models/operations/UpdateUnderwritingSecurity.md) | :heavy_check_mark:                                                                                                | The security requirements to use for the request.                                                                 |
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