# ACHFees

A detailed breakdown of ACH fees.


## Fields

| Field                                                                     | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `standardCredit`                                                          | [BillingCountAndAmount](../../models/components/BillingCountAndAmount.md) | :heavy_check_mark:                                                        | Fees for standard credit transfers.                                       |
| `sameDayCredit`                                                           | [BillingCountAndAmount](../../models/components/BillingCountAndAmount.md) | :heavy_check_mark:                                                        | Fees for same-day credit transfers.                                       |
| `debits`                                                                  | [BillingCountAndAmount](../../models/components/BillingCountAndAmount.md) | :heavy_check_mark:                                                        | Fees for debit transfers.                                                 |
| `return_`                                                                 | [BillingCountAndAmount](../../models/components/BillingCountAndAmount.md) | :heavy_check_mark:                                                        | Fees for authorized returns.                                              |
| `unauthorizedReturn`                                                      | [BillingCountAndAmount](../../models/components/BillingCountAndAmount.md) | :heavy_check_mark:                                                        | Fees for unauthorized returns.                                            |
| `noticeOfChange`                                                          | [BillingCountAndAmount](../../models/components/BillingCountAndAmount.md) | :heavy_check_mark:                                                        | Fees for notices of change.                                               |
| `bankAccountVerification`                                                 | [BillingCountAndAmount](../../models/components/BillingCountAndAmount.md) | :heavy_check_mark:                                                        | Fees for successful bank account verifications via Plaid or MX.           |
| `total`                                                                   | [BillingCountAndAmount](../../models/components/BillingCountAndAmount.md) | :heavy_check_mark:                                                        | Total ACH fees.                                                           |