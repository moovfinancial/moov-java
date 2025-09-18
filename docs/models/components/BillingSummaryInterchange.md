# BillingSummaryInterchange

A summary of interchange fees by card brand.


## Fields

| Field                                                     | Type                                                      | Required                                                  | Description                                               |
| --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- |
| `visa`                                                    | [AmountDecimal](../../models/components/AmountDecimal.md) | :heavy_check_mark:                                        | Total interchange fees for Visa.                          |
| `mastercard`                                              | [AmountDecimal](../../models/components/AmountDecimal.md) | :heavy_check_mark:                                        | Total interchange fees for Mastercard.                    |
| `discover`                                                | [AmountDecimal](../../models/components/AmountDecimal.md) | :heavy_check_mark:                                        | Total interchange fees for Discover.                      |
| `americanExpress`                                         | [AmountDecimal](../../models/components/AmountDecimal.md) | :heavy_check_mark:                                        | Total interchange fees for American Express.              |