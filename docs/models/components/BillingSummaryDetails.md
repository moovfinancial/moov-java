# BillingSummaryDetails

Details of volume and fees for a specific payment method.


## Fields

| Field                                                                | Type                                                                 | Required                                                             | Description                                                          |
| -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- |
| `volumeAmount`                                                       | [Optional\<AmountDecimal>](../../models/components/AmountDecimal.md) | :heavy_minus_sign:                                                   | The total transaction volume amount.                                 |
| `volumeCount`                                                        | *Optional\<Long>*                                                    | :heavy_minus_sign:                                                   | The total number of transactions.                                    |
| `feeAmount`                                                          | [Optional\<AmountDecimal>](../../models/components/AmountDecimal.md) | :heavy_minus_sign:                                                   | The total fee amount.                                                |