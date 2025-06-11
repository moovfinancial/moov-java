# SweepSubtotal


## Fields

| Field                                                                     | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `type`                                                                    | [WalletTransactionType](../../models/components/WalletTransactionType.md) | :heavy_check_mark:                                                        | The type of wallet transaction the subtotal is for.                       |
| `count`                                                                   | *long*                                                                    | :heavy_check_mark:                                                        | The number of transactions of this type accrued in the sweep.             |
| `amount`                                                                  | [AmountDecimal](../../models/components/AmountDecimal.md)                 | :heavy_check_mark:                                                        | The value of transactions of this type accrued in the sweep.              |