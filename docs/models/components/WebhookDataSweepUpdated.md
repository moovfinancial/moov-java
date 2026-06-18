# WebhookDataSweepUpdated


## Fields

| Field                                                 | Type                                                  | Required                                              | Description                                           |
| ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- |
| `accountID`                                           | *String*                                              | :heavy_check_mark:                                    | The accountID associated with the wallet being swept. |
| `walletID`                                            | *String*                                              | :heavy_check_mark:                                    | N/A                                                   |
| `sweepID`                                             | *String*                                              | :heavy_check_mark:                                    | N/A                                                   |
| `transferID`                                          | *Optional\<String>*                                   | :heavy_minus_sign:                                    | N/A                                                   |
| `status`                                              | [SweepStatus](../../models/components/SweepStatus.md) | :heavy_check_mark:                                    | N/A                                                   |