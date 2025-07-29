# SweepConfigPaymentMethod

The payment method used to push or pull funds to a bank account.
The push payment method can only be ach-credit-standard, ach-credit-same-day, or rtp-credit. The pull payment method can only be ach-debit-fund.


## Fields

| Field                                                                                     | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `paymentMethodID`                                                                         | *String*                                                                                  | :heavy_check_mark:                                                                        | ID of the payment method.                                                                 |
| `disabledOn`                                                                              | [OffsetDateTime](https://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html) | :heavy_minus_sign:                                                                        | N/A                                                                                       |