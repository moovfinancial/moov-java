# PaymentLinkPaymentDetailsUpdate

Options for payment links used to collect payment.


## Fields

| Field                                                                                        | Type                                                                                         | Required                                                                                     | Description                                                                                  |
| -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- |
| `allowedMethods`                                                                             | List\<[CollectionPaymentMethodType](../../models/components/CollectionPaymentMethodType.md)> | :heavy_minus_sign:                                                                           | A list of payment methods that should be supported for this payment link.                    |
| `cardDetails`                                                                                | [Optional\<CardPaymentDetails>](../../models/components/CardPaymentDetails.md)               | :heavy_minus_sign:                                                                           | Options for payment links used to collect a card payment.                                    |
| `achDetails`                                                                                 | [Optional\<ACHPaymentDetails>](../../models/components/ACHPaymentDetails.md)                 | :heavy_minus_sign:                                                                           | Options for payment links used to collect an ACH payment.                                    |