# AdjustmentFees

A detailed breakdown of adjustment (correction) fees by fee name.


## Fields

| Field                                                                     | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `items`                                                                   | List\<[BillingAdjustment](../../models/components/BillingAdjustment.md)>  | :heavy_check_mark:                                                        | Adjustment fees grouped by fee name.                                      |
| `total`                                                                   | [BillingCountAndAmount](../../models/components/BillingCountAndAmount.md) | :heavy_check_mark:                                                        | Total adjustment fees.                                                    |