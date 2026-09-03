# CreateCaptureRequest


## Fields

| Field                                                     | Type                                                      | Required                                                  | Description                                               |
| --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- |
| `xIdempotencyKey`                                         | *String*                                                  | :heavy_check_mark:                                        | Prevents duplicate captures from being created.           |
| `accountID`                                               | *String*                                                  | :heavy_check_mark:                                        | Moov account ID of the partner for the transfer.          |
| `transferID`                                              | *String*                                                  | :heavy_check_mark:                                        | Identifier for the auth-capture `card-payment` transfer.  |
| `createCapture`                                           | [CreateCapture](../../models/components/CreateCapture.md) | :heavy_check_mark:                                        | N/A                                                       |