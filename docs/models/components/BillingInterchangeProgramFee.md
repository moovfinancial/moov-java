# BillingInterchangeProgramFee

Details of a specific interchange program fee.


## Fields

| Field                                                     | Type                                                      | Required                                                  | Description                                               |
| --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- |
| `programName`                                             | *String*                                                  | :heavy_check_mark:                                        | The name of the interchange program.                      |
| `count`                                                   | *long*                                                    | :heavy_check_mark:                                        | The number of transactions for this program.              |
| `percentageRate`                                          | *BigDecimal*                                              | :heavy_check_mark:                                        | The percentage rate for this program.                     |
| `perItemRate`                                             | [AmountDecimal](../../models/components/AmountDecimal.md) | :heavy_check_mark:                                        | The per-item rate for this program.                       |
| `total`                                                   | [AmountDecimal](../../models/components/AmountDecimal.md) | :heavy_check_mark:                                        | The total fee amount for this program.                    |
| `transferVolume`                                          | [AmountDecimal](../../models/components/AmountDecimal.md) | :heavy_check_mark:                                        | The total transfer volume for this program.               |