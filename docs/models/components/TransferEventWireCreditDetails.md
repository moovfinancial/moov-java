# TransferEventWireCreditDetails


## Fields

| Field                                                                     | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `status`                                                                  | [WireTransactionStatus](../../models/components/WireTransactionStatus.md) | :heavy_check_mark:                                                        | Status of a transaction within the wire lifecycle.                        |
| `failureCode`                                                             | [Optional\<WireFailureCode>](../../models/components/WireFailureCode.md)  | :heavy_minus_sign:                                                        | Status codes for wire failures.                                           |