# PaymentLinkLineItemsUpdate

An optional collection of line items for a payment link.
When line items are provided, their total plus sales tax must equal the payment link amount.


## Fields

| Field                                                                        | Type                                                                         | Required                                                                     | Description                                                                  |
| ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- |
| `items`                                                                      | List\<[PaymentLinkLineItem](../../models/components/PaymentLinkLineItem.md)> | :heavy_minus_sign:                                                           | The list of line items.                                                      |