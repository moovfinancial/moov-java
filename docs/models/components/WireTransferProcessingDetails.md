# WireTransferProcessingDetails

Wire-specific processing details returned on a transfer.


## Fields

| Field                                                                     | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `status`                                                                  | [WireTransactionStatus](../../models/components/WireTransactionStatus.md) | :heavy_check_mark:                                                        | Status of a transaction within the wire lifecycle.                        |
| `networkResponseCode`                                                     | *Optional\<String>*                                                       | :heavy_minus_sign:                                                        | Response code returned by the network on failure.                         |
| `failureCode`                                                             | [Optional\<WireFailureCode>](../../models/components/WireFailureCode.md)  | :heavy_minus_sign:                                                        | Status codes for wire failures.                                           |