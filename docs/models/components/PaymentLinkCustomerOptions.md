# PaymentLinkCustomerOptions


## Fields

| Field                                                                               | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `requireAddress`                                                                    | *Optional\<Boolean>*                                                                | :heavy_minus_sign:                                                                  | If true, a billing address is required when completing the payment form.            |
| `requirePhone`                                                                      | *Optional\<Boolean>*                                                                | :heavy_minus_sign:                                                                  | If true, a phone number is required when completing the payment form.               |
| `metadata`                                                                          | Map\<String, *String*>                                                              | :heavy_minus_sign:                                                                  | Optional free-form metadata for the Moov account that will represent this customer. |