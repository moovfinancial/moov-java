# CardAcquiring

A summary of card acquiring volume and fees.


## Fields

| Field                                                                                        | Type                                                                                         | Required                                                                                     | Description                                                                                  |
| -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- |
| `volumeAmount`                                                                               | [Optional\<AmountDecimal>](../../models/components/AmountDecimal.md)                         | :heavy_minus_sign:                                                                           | The total transaction volume amount.                                                         |
| `volumeCount`                                                                                | *Optional\<Long>*                                                                            | :heavy_minus_sign:                                                                           | The total number of transactions.                                                            |
| `feeAmount`                                                                                  | [Optional\<AmountDecimal>](../../models/components/AmountDecimal.md)                         | :heavy_minus_sign:                                                                           | The total fee amount.                                                                        |
| `interchangeFees`                                                                            | [Optional\<BillingSummaryInterchange>](../../models/components/BillingSummaryInterchange.md) | :heavy_minus_sign:                                                                           | A summary of interchange fees by card brand.                                                 |