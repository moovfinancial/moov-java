# CreateReversalRequest


## Fields

| Field                                                                  | Type                                                                   | Required                                                               | Description                                                            |
| ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- |
| `xMoovVersion`                                                         | [Optional\<Versions>](../../models/components/Versions.md)             | :heavy_minus_sign:                                                     | Specify an API version.                                                |
| `xIdempotencyKey`                                                      | *String*                                                               | :heavy_check_mark:                                                     | Prevents duplicate reversals from being created.                       |
| `accountID`                                                            | *String*                                                               | :heavy_check_mark:                                                     | The Moov account ID.                                                   |
| `transferID`                                                           | *String*                                                               | :heavy_check_mark:                                                     | The transfer ID to reverse.                                            |
| `createReversal`                                                       | [Optional\<CreateReversal>](../../models/components/CreateReversal.md) | :heavy_minus_sign:                                                     | N/A                                                                    |