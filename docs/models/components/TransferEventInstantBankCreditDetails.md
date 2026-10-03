# TransferEventInstantBankCreditDetails


## Fields

| Field                                                                                   | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `status`                                                                                | [InstantBankTransactionStatus](../../models/components/InstantBankTransactionStatus.md) | :heavy_check_mark:                                                                      | Status of a transaction within the instant-bank lifecycle.                              |
| `failureCode`                                                                           | [Optional\<InstantBankFailureCode>](../../models/components/InstantBankFailureCode.md)  | :heavy_minus_sign:                                                                      | Status codes for instant-bank failures.                                                 |