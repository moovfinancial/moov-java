# CreateReversalRequest


## Fields

| Field                                                       | Type                                                        | Required                                                    | Description                                                 |
| ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- |
| `xIdempotencyKey`                                           | *String*                                                    | :heavy_check_mark:                                          | Prevents duplicate reversals from being created.            |
| `accountID`                                                 | *String*                                                    | :heavy_check_mark:                                          | The Moov account ID.                                        |
| `transferID`                                                | *String*                                                    | :heavy_check_mark:                                          | The transfer ID to reverse.                                 |
| `createReversal`                                            | [CreateReversal](../../models/components/CreateReversal.md) | :heavy_check_mark:                                          | N/A                                                         |