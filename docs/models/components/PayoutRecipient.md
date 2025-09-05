# PayoutRecipient

Specify the intended recipient of the payout.
Either `email` or `phone` must be specified, but not both.

This information will be used to authenticate the end user when they follow the payment link.


## Fields

| Field                                                            | Type                                                             | Required                                                         | Description                                                      | Example                                                          |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `email`                                                          | *Optional\<String>*                                              | :heavy_minus_sign:                                               | N/A                                                              | jordan.lee@classbooker.dev                                       |
| `phone`                                                          | [Optional\<PhoneNumber>](../../models/components/PhoneNumber.md) | :heavy_minus_sign:                                               | N/A                                                              |                                                                  |