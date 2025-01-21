# BankAccounts
(*bankAccounts()*)

## Overview

### Available Operations

* [linkBankAccount](#linkbankaccount) - Link a bank account to an existing Moov account. Read our [bank accounts guide](https://docs.moov.io/guides/sources/bank-accounts/) to learn more.

To use this endpoint from the browser, you'll need to specify the `/accounts/{accountID}/bank-accounts.write` scope when generating a [token](https://docs.moov.io/api/authentication/access-tokens/).

It is strongly recommended that callers include the `X-Wait-For` header, set to `payment-method`, if the newly linked
bank-account is intended to be used right away. If this header is not included, the caller will need to poll the [List Payment
Methods](https://docs.moov.io/api/sources/payment-methods/list/)
endpoint to wait for the new payment methods to be available for use.
* [listBankAccounts](#listbankaccounts) - List all the bank accounts associated with a particular Moov account. 

Read our [bank accounts guide](https://docs.moov.io/guides/sources/bank-accounts/) to learn more. To use this endpoint 
from the browser, you'll need to specify the `/accounts/{accountID}/bank-accounts.read` scope when generating a 
[token](https://docs.moov.io/api/authentication/access-tokens/).
* [getBankAccount](#getbankaccount) - Retrieve bank account details (i.e. routing number or account type) associated with a specific Moov account. 

Read our [bank accounts guide](https://docs.moov.io/guides/sources/bank-accounts/) to learn more. To use this 
endpoint from the browser, you'll need to specify the `/accounts/{accountID}/bank-accounts.read` scope when 
generating a [token](https://docs.moov.io/api/authentication/access-tokens/).
* [disableBankAccount](#disablebankaccount) - Discontinue using a specified bank account linked to a Moov account. 

To use this endpoint from the browser, you'll need to specify the `/accounts/{accountID}/bank-accounts.write` scope 
when generating a [token](https://docs.moov.io/api/authentication/access-tokens/).
* [initiateMicroDeposits](#initiatemicrodeposits) - Micro-deposits help confirm bank account ownership, helping reduce fraud and the risk of unauthorized activity. Use this method to initiate the micro-deposit verification, sending two small credit transfers to the bank account you want to confirm.

If you request micro-deposits before 4:15PM ET, they will appear that same day. If you request micro-deposits any time after 4:15PM ET, they will appear the next banking day. When the two credits are initiated, Moov simultaneously initiates a debit to recoup the micro-deposits. 

`sandbox` - Micro-deposits initiated for a `sandbox` bank account will always be `$0.00` / `$0.00` and instantly verifiable once initiated.

You can simulate micro-deposit verification in test mode. See our [test mode](https://docs.moov.io/guides/get-started/test-mode/#micro-deposits) guide for more information.

To use this endpoint from the browser, you'll need to specify the `/accounts/{accountID}/bank-accounts.write` scope when generating a [token](https://docs.moov.io/api/authentication/access-tokens/).
* [completeMicroDeposits](#completemicrodeposits) - Complete the micro-deposit validation process by passing the amounts of the two transfers within three tries.

To use this endpoint from the browser, you'll need to specify the `/accounts/{accountID}/bank-accounts.write` scope when generating a 
[token](https://docs.moov.io/api/authentication/access-tokens/).
* [getBankAccountVerification](#getbankaccountverification) - Retrieve the current status and details of an instant verification, including whether the verification method was instant or same-day 
ACH. This helps track the verification process in real-time and provides details in case of exceptions.

The status will indicate the following:

- `new`: Verification initiated, credit pending to the payment network
- `sent-credit`: Credit sent, available for verification
- `failed`: Verification failed, description provided, user needs to add a new bank account
- `expired`: Verification expired after 14 days, initiate another verification
- `max-attempts-exceeded`: Five incorrect code attempts exhausted, initiate another verification

To use this endpoint from the browser, you'll need to specify the `/accounts/{accountID}/bank-accounts.read` scope when generating a 
[token](https://docs.moov.io/api/authentication/access-tokens/).
* [initiateBankAccountVerification](#initiatebankaccountverification) - Instant micro-deposit verification offers a quick and efficient way to verify bank account ownership. 

Send a $0.01 credit with a unique verification code via RTP or same-day ACH, depending on the receiving bank’s capabilities. This
feature provides a faster alternative to traditional methods, allowing verification in a single session.

It is recommended to use the `X-Wait-For: rail-response` header to synchronously receive the outcome of the instant credit in the
 response payload.

Possible verification methods:
  - `instant`: Real-time verification credit sent via RTP
  - `ach`: Verification credit sent via same-day ACH

Possible statuses:
  - `new`: Verification initiated, credit pending
  - `sent-credit`: Credit sent, available for verification in the external bank account
  - `failed`: Verification failed due to credit rejection/return, details in `exceptionDetails`

To use this endpoint from the browser, you'll need to specify the `/accounts/{accountID}/bank-accounts.write` scope when generating a 
[token](https://docs.moov.io/api/authentication/access-tokens/).
* [completeBankAccountVerification](#completebankaccountverification) - Finalize the instant micro-deposit verification by submitting the verification code displayed in the user’s bank account. 

Upon successful verification, the bank account status will be updated to `verified` and eligible for ACH debit transactions.

The following formats are accepted:
- `MV0000`
- `mv0000`
- `0000`

To use this endpoint from the browser, you'll need to specify the `/accounts/{accountID}/bank-accounts.write` scope when 
generating a [token](https://docs.moov.io/api/authentication/access-tokens/).

## linkBankAccount

Link a bank account to an existing Moov account. Read our [bank accounts guide](https://docs.moov.io/guides/sources/bank-accounts/) to learn more.

To use this endpoint from the browser, you'll need to specify the `/accounts/{accountID}/bank-accounts.write` scope when generating a [token](https://docs.moov.io/api/authentication/access-tokens/).

It is strongly recommended that callers include the `X-Wait-For` header, set to `payment-method`, if the newly linked
bank-account is intended to be used right away. If this header is not included, the caller will need to poll the [List Payment
Methods](https://docs.moov.io/api/sources/payment-methods/list/)
endpoint to wait for the new payment methods to be available for use.

### Example Usage

```java
package hello.world;

import io.moov.openapi.Moov;
import io.moov.openapi.models.components.BankAccountWaitFor;
import io.moov.openapi.models.components.LinkBankAccount;
import io.moov.openapi.models.components.PlaidIntegration;
import io.moov.openapi.models.components.PlaidPayload;
import io.moov.openapi.models.components.SchemeBasicAuth;
import io.moov.openapi.models.components.Versions;
import io.moov.openapi.models.errors.BankAccountValidationError;
import io.moov.openapi.models.errors.GenericError;
import io.moov.openapi.models.operations.LinkBankAccountResponse;
import io.moov.openapi.models.operations.LinkBankAccountSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GenericError, BankAccountValidationError, Exception {

        Moov sdk = Moov.builder()
            .build();

        LinkBankAccountResponse res = sdk.bankAccounts().linkBankAccount()
                .security(LinkBankAccountSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .xMoovVersion(Versions.V20240000)
                .xWaitFor(BankAccountWaitFor.PAYMENT_METHOD)
                .accountID("5049418d-b6dc-4a6f-a285-091c0e15dc6a")
                .linkBankAccount(LinkBankAccount.of(PlaidPayload.builder()
                    .plaid(PlaidIntegration.builder()
                        .token("<value>")
                        .build())
                    .build()))
                .call();

        if (res.bankAccount().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                                                                                                                                                                                   | Type                                                                                                                                                                                                                                                                                                                                                                        | Required                                                                                                                                                                                                                                                                                                                                                                    | Description                                                                                                                                                                                                                                                                                                                                                                 |
| --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                                                                                                                                                                                                                                                                                  | [io.moov.openapi.models.operations.LinkBankAccountSecurity](../../models/operations/LinkBankAccountSecurity.md)                                                                                                                                                                                                                                                             | :heavy_check_mark:                                                                                                                                                                                                                                                                                                                                                          | The security requirements to use for the request.                                                                                                                                                                                                                                                                                                                           |
| `xMoovVersion`                                                                                                                                                                                                                                                                                                                                                              | [Optional\<Versions>](../../models/components/Versions.md)                                                                                                                                                                                                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                                                                                                                                                                                                                          | Specify an API version.                                                                                                                                                                                                                                                                                                                                                     |
| `xWaitFor`                                                                                                                                                                                                                                                                                                                                                                  | [Optional\<BankAccountWaitFor>](../../models/components/BankAccountWaitFor.md)                                                                                                                                                                                                                                                                                              | :heavy_minus_sign:                                                                                                                                                                                                                                                                                                                                                          | Optional header to wait for certain events, such as the creation of a payment method, to occur before returning a response.<br/><br/>When this header is set to `payment-method`, the response will include any payment methods that were created for the newly<br/>linked card in the `paymentMethods` field. Otherwise, the `paymentMethods` field will be omitted from the response. |
| `accountID`                                                                                                                                                                                                                                                                                                                                                                 | *String*                                                                                                                                                                                                                                                                                                                                                                    | :heavy_check_mark:                                                                                                                                                                                                                                                                                                                                                          | N/A                                                                                                                                                                                                                                                                                                                                                                         |
| `linkBankAccount`                                                                                                                                                                                                                                                                                                                                                           | [LinkBankAccount](../../models/components/LinkBankAccount.md)                                                                                                                                                                                                                                                                                                               | :heavy_check_mark:                                                                                                                                                                                                                                                                                                                                                          | N/A                                                                                                                                                                                                                                                                                                                                                                         |

### Response

**[LinkBankAccountResponse](../../models/operations/LinkBankAccountResponse.md)**

### Errors

| Error Type                               | Status Code                              | Content Type                             |
| ---------------------------------------- | ---------------------------------------- | ---------------------------------------- |
| models/errors/GenericError               | 400, 409                                 | application/json                         |
| models/errors/BankAccountValidationError | 422                                      | application/json                         |
| models/errors/APIException               | 4XX, 5XX                                 | \*/\*                                    |

## listBankAccounts

List all the bank accounts associated with a particular Moov account. 

Read our [bank accounts guide](https://docs.moov.io/guides/sources/bank-accounts/) to learn more. To use this endpoint 
from the browser, you'll need to specify the `/accounts/{accountID}/bank-accounts.read` scope when generating a 
[token](https://docs.moov.io/api/authentication/access-tokens/).

### Example Usage

```java
package hello.world;

import io.moov.openapi.Moov;
import io.moov.openapi.models.components.SchemeBasicAuth;
import io.moov.openapi.models.components.Versions;
import io.moov.openapi.models.operations.ListBankAccountsResponse;
import io.moov.openapi.models.operations.ListBankAccountsSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Moov sdk = Moov.builder()
            .build();

        ListBankAccountsResponse res = sdk.bankAccounts().listBankAccounts()
                .security(ListBankAccountsSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .xMoovVersion(Versions.LATEST)
                .accountID("91095bec-ade2-4a8c-9f46-ae7f07234fee")
                .call();

        if (res.bankAccounts().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                         | Type                                                                                                              | Required                                                                                                          | Description                                                                                                       |
| ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                        | [io.moov.openapi.models.operations.ListBankAccountsSecurity](../../models/operations/ListBankAccountsSecurity.md) | :heavy_check_mark:                                                                                                | The security requirements to use for the request.                                                                 |
| `xMoovVersion`                                                                                                    | [Optional\<Versions>](../../models/components/Versions.md)                                                        | :heavy_minus_sign:                                                                                                | Specify an API version.                                                                                           |
| `accountID`                                                                                                       | *String*                                                                                                          | :heavy_check_mark:                                                                                                | N/A                                                                                                               |

### Response

**[ListBankAccountsResponse](../../models/operations/ListBankAccountsResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## getBankAccount

Retrieve bank account details (i.e. routing number or account type) associated with a specific Moov account. 

Read our [bank accounts guide](https://docs.moov.io/guides/sources/bank-accounts/) to learn more. To use this 
endpoint from the browser, you'll need to specify the `/accounts/{accountID}/bank-accounts.read` scope when 
generating a [token](https://docs.moov.io/api/authentication/access-tokens/).

### Example Usage

```java
package hello.world;

import io.moov.openapi.Moov;
import io.moov.openapi.models.components.SchemeBasicAuth;
import io.moov.openapi.models.components.Versions;
import io.moov.openapi.models.operations.GetBankAccountResponse;
import io.moov.openapi.models.operations.GetBankAccountSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Moov sdk = Moov.builder()
            .build();

        GetBankAccountResponse res = sdk.bankAccounts().getBankAccount()
                .security(GetBankAccountSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .xMoovVersion(Versions.V20240000)
                .accountID("30085225-d87e-47cd-8f08-001465f8cd22")
                .bankAccountID("6c5a7be6-792b-4628-af28-a852f8c9de5b")
                .call();

        if (res.bankAccount().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                     | Type                                                                                                          | Required                                                                                                      | Description                                                                                                   |
| ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                    | [io.moov.openapi.models.operations.GetBankAccountSecurity](../../models/operations/GetBankAccountSecurity.md) | :heavy_check_mark:                                                                                            | The security requirements to use for the request.                                                             |
| `xMoovVersion`                                                                                                | [Optional\<Versions>](../../models/components/Versions.md)                                                    | :heavy_minus_sign:                                                                                            | Specify an API version.                                                                                       |
| `accountID`                                                                                                   | *String*                                                                                                      | :heavy_check_mark:                                                                                            | N/A                                                                                                           |
| `bankAccountID`                                                                                               | *String*                                                                                                      | :heavy_check_mark:                                                                                            | N/A                                                                                                           |

### Response

**[GetBankAccountResponse](../../models/operations/GetBankAccountResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## disableBankAccount

Discontinue using a specified bank account linked to a Moov account. 

To use this endpoint from the browser, you'll need to specify the `/accounts/{accountID}/bank-accounts.write` scope 
when generating a [token](https://docs.moov.io/api/authentication/access-tokens/).

### Example Usage

```java
package hello.world;

import io.moov.openapi.Moov;
import io.moov.openapi.models.components.SchemeBasicAuth;
import io.moov.openapi.models.components.Versions;
import io.moov.openapi.models.errors.GenericError;
import io.moov.openapi.models.operations.DisableBankAccountResponse;
import io.moov.openapi.models.operations.DisableBankAccountSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GenericError, Exception {

        Moov sdk = Moov.builder()
            .build();

        DisableBankAccountResponse res = sdk.bankAccounts().disableBankAccount()
                .security(DisableBankAccountSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .xMoovVersion(Versions.LATEST)
                .accountID("d01209e7-2701-46cc-b0ba-56eabf4e1ec7")
                .bankAccountID("0ae3f56a-e391-4a80-962d-9fe4c7a45b97")
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                             | Type                                                                                                                  | Required                                                                                                              | Description                                                                                                           |
| --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                            | [io.moov.openapi.models.operations.DisableBankAccountSecurity](../../models/operations/DisableBankAccountSecurity.md) | :heavy_check_mark:                                                                                                    | The security requirements to use for the request.                                                                     |
| `xMoovVersion`                                                                                                        | [Optional\<Versions>](../../models/components/Versions.md)                                                            | :heavy_minus_sign:                                                                                                    | Specify an API version.                                                                                               |
| `accountID`                                                                                                           | *String*                                                                                                              | :heavy_check_mark:                                                                                                    | N/A                                                                                                                   |
| `bankAccountID`                                                                                                       | *String*                                                                                                              | :heavy_check_mark:                                                                                                    | N/A                                                                                                                   |

### Response

**[DisableBankAccountResponse](../../models/operations/DisableBankAccountResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/GenericError | 400, 409                   | application/json           |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## initiateMicroDeposits

Micro-deposits help confirm bank account ownership, helping reduce fraud and the risk of unauthorized activity. Use this method to initiate the micro-deposit verification, sending two small credit transfers to the bank account you want to confirm.

If you request micro-deposits before 4:15PM ET, they will appear that same day. If you request micro-deposits any time after 4:15PM ET, they will appear the next banking day. When the two credits are initiated, Moov simultaneously initiates a debit to recoup the micro-deposits. 

`sandbox` - Micro-deposits initiated for a `sandbox` bank account will always be `$0.00` / `$0.00` and instantly verifiable once initiated.

You can simulate micro-deposit verification in test mode. See our [test mode](https://docs.moov.io/guides/get-started/test-mode/#micro-deposits) guide for more information.

To use this endpoint from the browser, you'll need to specify the `/accounts/{accountID}/bank-accounts.write` scope when generating a [token](https://docs.moov.io/api/authentication/access-tokens/).

### Example Usage

```java
package hello.world;

import io.moov.openapi.Moov;
import io.moov.openapi.models.components.SchemeBasicAuth;
import io.moov.openapi.models.components.Versions;
import io.moov.openapi.models.errors.GenericError;
import io.moov.openapi.models.operations.InitiateMicroDepositsResponse;
import io.moov.openapi.models.operations.InitiateMicroDepositsSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GenericError, Exception {

        Moov sdk = Moov.builder()
            .build();

        InitiateMicroDepositsResponse res = sdk.bankAccounts().initiateMicroDeposits()
                .security(InitiateMicroDepositsSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .xMoovVersion(Versions.LATEST)
                .accountID("ff04d5ff-8ad2-4d87-baf2-0c9dcb6d3e2a")
                .bankAccountID("10ed8688-d7e2-4a70-827d-af795759945d")
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                                   | Type                                                                                                                        | Required                                                                                                                    | Description                                                                                                                 |
| --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                                  | [io.moov.openapi.models.operations.InitiateMicroDepositsSecurity](../../models/operations/InitiateMicroDepositsSecurity.md) | :heavy_check_mark:                                                                                                          | The security requirements to use for the request.                                                                           |
| `xMoovVersion`                                                                                                              | [Optional\<Versions>](../../models/components/Versions.md)                                                                  | :heavy_minus_sign:                                                                                                          | Specify an API version.                                                                                                     |
| `accountID`                                                                                                                 | *String*                                                                                                                    | :heavy_check_mark:                                                                                                          | N/A                                                                                                                         |
| `bankAccountID`                                                                                                             | *String*                                                                                                                    | :heavy_check_mark:                                                                                                          | N/A                                                                                                                         |

### Response

**[InitiateMicroDepositsResponse](../../models/operations/InitiateMicroDepositsResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/GenericError | 400, 409                   | application/json           |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## completeMicroDeposits

Complete the micro-deposit validation process by passing the amounts of the two transfers within three tries.

To use this endpoint from the browser, you'll need to specify the `/accounts/{accountID}/bank-accounts.write` scope when generating a 
[token](https://docs.moov.io/api/authentication/access-tokens/).

### Example Usage

```java
package hello.world;

import io.moov.openapi.Moov;
import io.moov.openapi.models.components.CompleteMicroDeposits;
import io.moov.openapi.models.components.SchemeBasicAuth;
import io.moov.openapi.models.components.Versions;
import io.moov.openapi.models.errors.GenericError;
import io.moov.openapi.models.errors.MicroDepositValidationError;
import io.moov.openapi.models.operations.CompleteMicroDepositsResponse;
import io.moov.openapi.models.operations.CompleteMicroDepositsSecurity;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws GenericError, MicroDepositValidationError, Exception {

        Moov sdk = Moov.builder()
            .build();

        CompleteMicroDepositsResponse res = sdk.bankAccounts().completeMicroDeposits()
                .security(CompleteMicroDepositsSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .xMoovVersion(Versions.LATEST)
                .accountID("ebfc273d-980b-4a92-8dd9-bf9996f2a16e")
                .bankAccountID("3e6af61e-a5cb-4281-b0e6-e7e3d39edf65")
                .completeMicroDeposits(CompleteMicroDeposits.builder()
                    .amounts(List.of(
                        18L,
                        21L))
                    .build())
                .call();

        if (res.completedMicroDeposits().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                   | Type                                                                                                                        | Required                                                                                                                    | Description                                                                                                                 |
| --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                                  | [io.moov.openapi.models.operations.CompleteMicroDepositsSecurity](../../models/operations/CompleteMicroDepositsSecurity.md) | :heavy_check_mark:                                                                                                          | The security requirements to use for the request.                                                                           |
| `xMoovVersion`                                                                                                              | [Optional\<Versions>](../../models/components/Versions.md)                                                                  | :heavy_minus_sign:                                                                                                          | Specify an API version.                                                                                                     |
| `accountID`                                                                                                                 | *String*                                                                                                                    | :heavy_check_mark:                                                                                                          | N/A                                                                                                                         |
| `bankAccountID`                                                                                                             | *String*                                                                                                                    | :heavy_check_mark:                                                                                                          | N/A                                                                                                                         |
| `completeMicroDeposits`                                                                                                     | [CompleteMicroDeposits](../../models/components/CompleteMicroDeposits.md)                                                   | :heavy_check_mark:                                                                                                          | N/A                                                                                                                         |

### Response

**[CompleteMicroDepositsResponse](../../models/operations/CompleteMicroDepositsResponse.md)**

### Errors

| Error Type                                | Status Code                               | Content Type                              |
| ----------------------------------------- | ----------------------------------------- | ----------------------------------------- |
| models/errors/GenericError                | 400, 409                                  | application/json                          |
| models/errors/MicroDepositValidationError | 422                                       | application/json                          |
| models/errors/APIException                | 4XX, 5XX                                  | \*/\*                                     |

## getBankAccountVerification

Retrieve the current status and details of an instant verification, including whether the verification method was instant or same-day 
ACH. This helps track the verification process in real-time and provides details in case of exceptions.

The status will indicate the following:

- `new`: Verification initiated, credit pending to the payment network
- `sent-credit`: Credit sent, available for verification
- `failed`: Verification failed, description provided, user needs to add a new bank account
- `expired`: Verification expired after 14 days, initiate another verification
- `max-attempts-exceeded`: Five incorrect code attempts exhausted, initiate another verification

To use this endpoint from the browser, you'll need to specify the `/accounts/{accountID}/bank-accounts.read` scope when generating a 
[token](https://docs.moov.io/api/authentication/access-tokens/).

### Example Usage

```java
package hello.world;

import io.moov.openapi.Moov;
import io.moov.openapi.models.components.SchemeBasicAuth;
import io.moov.openapi.models.components.Versions;
import io.moov.openapi.models.operations.GetBankAccountVerificationResponse;
import io.moov.openapi.models.operations.GetBankAccountVerificationSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Moov sdk = Moov.builder()
            .build();

        GetBankAccountVerificationResponse res = sdk.bankAccounts().getBankAccountVerification()
                .security(GetBankAccountVerificationSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .xMoovVersion(Versions.V20240000)
                .accountID("0102058c-a936-482a-a3ca-2355850903d7")
                .bankAccountID("ee6888ef-544e-4146-bab7-ea04e31b2274")
                .call();

        if (res.bankAccountVerification().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                             | Type                                                                                                                                  | Required                                                                                                                              | Description                                                                                                                           |
| ------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                                            | [io.moov.openapi.models.operations.GetBankAccountVerificationSecurity](../../models/operations/GetBankAccountVerificationSecurity.md) | :heavy_check_mark:                                                                                                                    | The security requirements to use for the request.                                                                                     |
| `xMoovVersion`                                                                                                                        | [Optional\<Versions>](../../models/components/Versions.md)                                                                            | :heavy_minus_sign:                                                                                                                    | Specify an API version.                                                                                                               |
| `accountID`                                                                                                                           | *String*                                                                                                                              | :heavy_check_mark:                                                                                                                    | N/A                                                                                                                                   |
| `bankAccountID`                                                                                                                       | *String*                                                                                                                              | :heavy_check_mark:                                                                                                                    | N/A                                                                                                                                   |

### Response

**[GetBankAccountVerificationResponse](../../models/operations/GetBankAccountVerificationResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## initiateBankAccountVerification

Instant micro-deposit verification offers a quick and efficient way to verify bank account ownership. 

Send a $0.01 credit with a unique verification code via RTP or same-day ACH, depending on the receiving bank’s capabilities. This
feature provides a faster alternative to traditional methods, allowing verification in a single session.

It is recommended to use the `X-Wait-For: rail-response` header to synchronously receive the outcome of the instant credit in the
 response payload.

Possible verification methods:
  - `instant`: Real-time verification credit sent via RTP
  - `ach`: Verification credit sent via same-day ACH

Possible statuses:
  - `new`: Verification initiated, credit pending
  - `sent-credit`: Credit sent, available for verification in the external bank account
  - `failed`: Verification failed due to credit rejection/return, details in `exceptionDetails`

To use this endpoint from the browser, you'll need to specify the `/accounts/{accountID}/bank-accounts.write` scope when generating a 
[token](https://docs.moov.io/api/authentication/access-tokens/).

### Example Usage

```java
package hello.world;

import io.moov.openapi.Moov;
import io.moov.openapi.models.components.BankAccountWaitFor;
import io.moov.openapi.models.components.SchemeBasicAuth;
import io.moov.openapi.models.components.Versions;
import io.moov.openapi.models.errors.GenericError;
import io.moov.openapi.models.operations.InitiateBankAccountVerificationResponse;
import io.moov.openapi.models.operations.InitiateBankAccountVerificationSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GenericError, Exception {

        Moov sdk = Moov.builder()
            .build();

        InitiateBankAccountVerificationResponse res = sdk.bankAccounts().initiateBankAccountVerification()
                .security(InitiateBankAccountVerificationSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .xMoovVersion(Versions.LATEST)
                .xWaitFor(BankAccountWaitFor.PAYMENT_METHOD)
                .accountID("c2b4967e-86a5-474e-a78e-f013315f7dcc")
                .bankAccountID("d648f8f3-7641-4e40-8a99-c08de14889c8")
                .call();

        if (res.bankAccountVerificationCreated().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                                                  | Type                                                                                                                                                                                                                                       | Required                                                                                                                                                                                                                                   | Description                                                                                                                                                                                                                                |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `security`                                                                                                                                                                                                                                 | [io.moov.openapi.models.operations.InitiateBankAccountVerificationSecurity](../../models/operations/InitiateBankAccountVerificationSecurity.md)                                                                                            | :heavy_check_mark:                                                                                                                                                                                                                         | The security requirements to use for the request.                                                                                                                                                                                          |
| `xMoovVersion`                                                                                                                                                                                                                             | [Optional\<Versions>](../../models/components/Versions.md)                                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                                                                                         | Specify an API version.                                                                                                                                                                                                                    |
| `xWaitFor`                                                                                                                                                                                                                                 | [BankAccountWaitFor](../../models/components/BankAccountWaitFor.md)                                                                                                                                                                        | :heavy_check_mark:                                                                                                                                                                                                                         | Optional header to wait for certain events, such as the rail response, to occur before returning a response.<br/><br/>When this header is set to `rail-response`, the endpoint will wait for a sent-credit or failed status from the payment rail. |
| `accountID`                                                                                                                                                                                                                                | *String*                                                                                                                                                                                                                                   | :heavy_check_mark:                                                                                                                                                                                                                         | N/A                                                                                                                                                                                                                                        |
| `bankAccountID`                                                                                                                                                                                                                            | *String*                                                                                                                                                                                                                                   | :heavy_check_mark:                                                                                                                                                                                                                         | N/A                                                                                                                                                                                                                                        |

### Response

**[InitiateBankAccountVerificationResponse](../../models/operations/InitiateBankAccountVerificationResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/GenericError | 400, 409                   | application/json           |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## completeBankAccountVerification

Finalize the instant micro-deposit verification by submitting the verification code displayed in the user’s bank account. 

Upon successful verification, the bank account status will be updated to `verified` and eligible for ACH debit transactions.

The following formats are accepted:
- `MV0000`
- `mv0000`
- `0000`

To use this endpoint from the browser, you'll need to specify the `/accounts/{accountID}/bank-accounts.write` scope when 
generating a [token](https://docs.moov.io/api/authentication/access-tokens/).

### Example Usage

```java
package hello.world;

import io.moov.openapi.Moov;
import io.moov.openapi.models.components.CompleteBankAccountVerification;
import io.moov.openapi.models.components.SchemeBasicAuth;
import io.moov.openapi.models.components.Versions;
import io.moov.openapi.models.errors.GenericError;
import io.moov.openapi.models.operations.CompleteBankAccountVerificationResponse;
import io.moov.openapi.models.operations.CompleteBankAccountVerificationSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GenericError, Exception {

        Moov sdk = Moov.builder()
            .build();

        CompleteBankAccountVerificationResponse res = sdk.bankAccounts().completeBankAccountVerification()
                .security(CompleteBankAccountVerificationSecurity.builder()
                    .basicAuth(SchemeBasicAuth.builder()
                        .username("")
                        .password("")
                        .build())
                    .build())
                .xMoovVersion(Versions.LATEST)
                .accountID("88cf5aa5-bf76-406e-a986-eb33cd8890e3")
                .bankAccountID("0157260f-ae3c-496c-a9d8-24de5fbc6b31")
                .completeBankAccountVerification(CompleteBankAccountVerification.builder()
                    .code("MV1234")
                    .build())
                .call();

        if (res.bankAccountVerification().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                       | Type                                                                                                                                            | Required                                                                                                                                        | Description                                                                                                                                     |
| ----------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                                                      | [io.moov.openapi.models.operations.CompleteBankAccountVerificationSecurity](../../models/operations/CompleteBankAccountVerificationSecurity.md) | :heavy_check_mark:                                                                                                                              | The security requirements to use for the request.                                                                                               |
| `xMoovVersion`                                                                                                                                  | [Optional\<Versions>](../../models/components/Versions.md)                                                                                      | :heavy_minus_sign:                                                                                                                              | Specify an API version.                                                                                                                         |
| `accountID`                                                                                                                                     | *String*                                                                                                                                        | :heavy_check_mark:                                                                                                                              | N/A                                                                                                                                             |
| `bankAccountID`                                                                                                                                 | *String*                                                                                                                                        | :heavy_check_mark:                                                                                                                              | N/A                                                                                                                                             |
| `completeBankAccountVerification`                                                                                                               | [CompleteBankAccountVerification](../../models/components/CompleteBankAccountVerification.md)                                                   | :heavy_check_mark:                                                                                                                              | N/A                                                                                                                                             |

### Response

**[CompleteBankAccountVerificationResponse](../../models/operations/CompleteBankAccountVerificationResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/GenericError | 400, 409, 422              | application/json           |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |