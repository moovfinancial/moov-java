# Onboarding
(*onboarding()*)

## Overview

### Available Operations

* [createOnboardingInvite](#createonboardinginvite) - Create an invitation containing a unique link that allows the recipient to onboard their organization with Moov.

To access this endpoint using a [token](https://docs.moov.io/api/authentication/access-tokens/) you'll need 
to specify the `/accounts.write` scope.
* [listOnboardingInvites](#listonboardinginvites) - List all the onboarding invites created by the caller's account.

To access this endpoint using a [token](https://docs.moov.io/api/authentication/access-tokens/) you'll need 
to specify the `/accounts.read` scope.
* [getOnboardingInvite](#getonboardinginvite) - Retrieve details about an onboarding invite.

To access this endpoint using a [token](https://docs.moov.io/api/authentication/access-tokens/) you'll need 
to specify the `/accounts.read` scope.
* [revokeOnboardingInvite](#revokeonboardinginvite) - Revoke an onboarding invite, rendering the invitation link unusable.

To access this endpoint using a [token](https://docs.moov.io/api/authentication/access-tokens/) you'll need 
to specify the `/accounts.write` scope.

## createOnboardingInvite

Create an invitation containing a unique link that allows the recipient to onboard their organization with Moov.

To access this endpoint using a [token](https://docs.moov.io/api/authentication/access-tokens/) you'll need 
to specify the `/accounts.write` scope.

### Example Usage

```java
package hello.world;

import io.moov.openapi.Moov;
import io.moov.openapi.models.components.AccountType;
import io.moov.openapi.models.components.ApplicationScope;
import io.moov.openapi.models.components.CapabilityID;
import io.moov.openapi.models.components.CreateAccount;
import io.moov.openapi.models.components.CreateBusinessProfile;
import io.moov.openapi.models.components.CreateProfile;
import io.moov.openapi.models.components.OnboardingInviteRequest;
import io.moov.openapi.models.components.SchemeBasicAuth;
import io.moov.openapi.models.components.Versions;
import io.moov.openapi.models.errors.GenericError;
import io.moov.openapi.models.errors.OnboardingInviteError;
import io.moov.openapi.models.operations.CreateOnboardingInviteResponse;
import io.moov.openapi.models.operations.CreateOnboardingInviteSecurity;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws GenericError, OnboardingInviteError, Exception {

        Moov sdk = Moov.builder()
            .build();

        CreateOnboardingInviteResponse res = sdk.onboarding().createOnboardingInvite()
                .security(CreateOnboardingInviteSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .xMoovVersion(Versions.LATEST)
                .onboardingInviteRequest(OnboardingInviteRequest.builder()
                    .scopes(List.of(
                        ApplicationScope.ACCOUNTS_READ))
                    .capabilities(List.of(
                        CapabilityID.TRANSFERS))
                    .feePlanCodes(List.of(
                        "merchant-direct"))
                    .prefill(CreateAccount.builder()
                        .accountType(AccountType.BUSINESS)
                        .profile(CreateProfile.builder()
                            .business(CreateBusinessProfile.builder()
                                .legalBusinessName("Classbooker, LLC")
                                .build())
                            .build())
                        .build())
                    .build())
                .call();

        if (res.onboardingInvite().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                     | Type                                                                                                                          | Required                                                                                                                      | Description                                                                                                                   |
| ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                                    | [io.moov.openapi.models.operations.CreateOnboardingInviteSecurity](../../models/operations/CreateOnboardingInviteSecurity.md) | :heavy_check_mark:                                                                                                            | The security requirements to use for the request.                                                                             |
| `xMoovVersion`                                                                                                                | [Optional\<Versions>](../../models/components/Versions.md)                                                                    | :heavy_minus_sign:                                                                                                            | Specify an API version.                                                                                                       |
| `onboardingInviteRequest`                                                                                                     | [OnboardingInviteRequest](../../models/components/OnboardingInviteRequest.md)                                                 | :heavy_check_mark:                                                                                                            | N/A                                                                                                                           |

### Response

**[CreateOnboardingInviteResponse](../../models/operations/CreateOnboardingInviteResponse.md)**

### Errors

| Error Type                          | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/GenericError          | 400, 409                            | application/json                    |
| models/errors/OnboardingInviteError | 422                                 | application/json                    |
| models/errors/APIException          | 4XX, 5XX                            | \*/\*                               |

## listOnboardingInvites

List all the onboarding invites created by the caller's account.

To access this endpoint using a [token](https://docs.moov.io/api/authentication/access-tokens/) you'll need 
to specify the `/accounts.read` scope.

### Example Usage

```java
package hello.world;

import io.moov.openapi.Moov;
import io.moov.openapi.models.components.SchemeBasicAuth;
import io.moov.openapi.models.components.Versions;
import io.moov.openapi.models.operations.ListOnboardingInvitesResponse;
import io.moov.openapi.models.operations.ListOnboardingInvitesSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Moov sdk = Moov.builder()
            .build();

        ListOnboardingInvitesResponse res = sdk.onboarding().listOnboardingInvites()
                .security(ListOnboardingInvitesSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .xMoovVersion(Versions.V20240000)
                .call();

        if (res.onboardingInvites().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                   | Type                                                                                                                        | Required                                                                                                                    | Description                                                                                                                 |
| --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                                  | [io.moov.openapi.models.operations.ListOnboardingInvitesSecurity](../../models/operations/ListOnboardingInvitesSecurity.md) | :heavy_check_mark:                                                                                                          | The security requirements to use for the request.                                                                           |
| `xMoovVersion`                                                                                                              | [Optional\<Versions>](../../models/components/Versions.md)                                                                  | :heavy_minus_sign:                                                                                                          | Specify an API version.                                                                                                     |

### Response

**[ListOnboardingInvitesResponse](../../models/operations/ListOnboardingInvitesResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## getOnboardingInvite

Retrieve details about an onboarding invite.

To access this endpoint using a [token](https://docs.moov.io/api/authentication/access-tokens/) you'll need 
to specify the `/accounts.read` scope.

### Example Usage

```java
package hello.world;

import io.moov.openapi.Moov;
import io.moov.openapi.models.components.SchemeBasicAuth;
import io.moov.openapi.models.components.Versions;
import io.moov.openapi.models.operations.GetOnboardingInviteResponse;
import io.moov.openapi.models.operations.GetOnboardingInviteSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Moov sdk = Moov.builder()
            .build();

        GetOnboardingInviteResponse res = sdk.onboarding().getOnboardingInvite()
                .security(GetOnboardingInviteSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .xMoovVersion(Versions.V20240000)
                .code("N1IA5eWYNh")
                .call();

        if (res.onboardingInvite().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                               | Type                                                                                                                    | Required                                                                                                                | Description                                                                                                             | Example                                                                                                                 |
| ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                              | [io.moov.openapi.models.operations.GetOnboardingInviteSecurity](../../models/operations/GetOnboardingInviteSecurity.md) | :heavy_check_mark:                                                                                                      | The security requirements to use for the request.                                                                       |                                                                                                                         |
| `xMoovVersion`                                                                                                          | [Optional\<Versions>](../../models/components/Versions.md)                                                              | :heavy_minus_sign:                                                                                                      | Specify an API version.                                                                                                 |                                                                                                                         |
| `code`                                                                                                                  | *String*                                                                                                                | :heavy_check_mark:                                                                                                      | N/A                                                                                                                     | N1IA5eWYNh                                                                                                              |

### Response

**[GetOnboardingInviteResponse](../../models/operations/GetOnboardingInviteResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## revokeOnboardingInvite

Revoke an onboarding invite, rendering the invitation link unusable.

To access this endpoint using a [token](https://docs.moov.io/api/authentication/access-tokens/) you'll need 
to specify the `/accounts.write` scope.

### Example Usage

```java
package hello.world;

import io.moov.openapi.Moov;
import io.moov.openapi.models.components.SchemeBasicAuth;
import io.moov.openapi.models.components.Versions;
import io.moov.openapi.models.operations.RevokeOnboardingInviteResponse;
import io.moov.openapi.models.operations.RevokeOnboardingInviteSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Moov sdk = Moov.builder()
            .build();

        RevokeOnboardingInviteResponse res = sdk.onboarding().revokeOnboardingInvite()
                .security(RevokeOnboardingInviteSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .xMoovVersion(Versions.LATEST)
                .code("N1IA5eWYNh")
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                                     | Type                                                                                                                          | Required                                                                                                                      | Description                                                                                                                   | Example                                                                                                                       |
| ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                                    | [io.moov.openapi.models.operations.RevokeOnboardingInviteSecurity](../../models/operations/RevokeOnboardingInviteSecurity.md) | :heavy_check_mark:                                                                                                            | The security requirements to use for the request.                                                                             |                                                                                                                               |
| `xMoovVersion`                                                                                                                | [Optional\<Versions>](../../models/components/Versions.md)                                                                    | :heavy_minus_sign:                                                                                                            | Specify an API version.                                                                                                       |                                                                                                                               |
| `code`                                                                                                                        | *String*                                                                                                                      | :heavy_check_mark:                                                                                                            | N/A                                                                                                                           | N1IA5eWYNh                                                                                                                    |

### Response

**[RevokeOnboardingInviteResponse](../../models/operations/RevokeOnboardingInviteResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |