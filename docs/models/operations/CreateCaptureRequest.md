# CreateCaptureRequest


## Fields

| Field                                                     | Type                                                      | Required                                                  | Description                                               |
| --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- |
| `xIdempotencyKey`                                         | *String*                                                  | :heavy_check_mark:                                        | Prevents duplicate captures from being created.           |
| `accountID`                                               | *String*                                                  | :heavy_check_mark:                                        | The merchant's Moov account ID.                           |
| `transferID`                                              | *String*                                                  | :heavy_check_mark:                                        | Identifier for the transfer.                              |
| `createCapture`                                           | [CreateCapture](../../models/components/CreateCapture.md) | :heavy_check_mark:                                        | N/A                                                       |