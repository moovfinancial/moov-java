# OtherCardFees

A detailed breakdown of other card-related fees.


## Fields

| Field                                                                     | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `disputes`                                                                | [BillingCountAndAmount](../../models/components/BillingCountAndAmount.md) | :heavy_check_mark:                                                        | Fees for disputes.                                                        |
| `cardAccountUpdater`                                                      | [BillingCountAndAmount](../../models/components/BillingCountAndAmount.md) | :heavy_check_mark:                                                        | Fees for card account updater services.                                   |
| `cardVerification`                                                        | [BillingCountAndAmount](../../models/components/BillingCountAndAmount.md) | :heavy_check_mark:                                                        | Fees for card verification.                                               |
| `nameVerification`                                                        | [BillingCountAndAmount](../../models/components/BillingCountAndAmount.md) | :heavy_check_mark:                                                        | Fees for name verification.                                               |
| `total`                                                                   | [BillingCountAndAmount](../../models/components/BillingCountAndAmount.md) | :heavy_check_mark:                                                        | Total other card fees.                                                    |