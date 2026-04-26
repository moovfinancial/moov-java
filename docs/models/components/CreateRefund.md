# CreateRefund

Specifies a partial amount to refund. 

This request body is optional, an empty body will issue a refund for the full amount of the original transfer.


## Fields

| Field                                                                                     | Type                                                                                      | Required                                                                                  | Description                                                                               | Example                                                                                   |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `amount`                                                                                  | *Optional\<Long>*                                                                         | :heavy_minus_sign:                                                                        | Amount to refund in cents. If null, the original transfer's full amount will be refunded. | 1000                                                                                      |
| `amountDetails`                                                                           | [Optional\<RefundAmountDetails>](../../models/components/RefundAmountDetails.md)          | :heavy_minus_sign:                                                                        | Breakdown of the refunded amount.                                                         |                                                                                           |