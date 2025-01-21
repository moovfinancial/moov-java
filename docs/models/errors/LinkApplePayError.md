# LinkApplePayError


## Fields

| Field                                                                      | Type                                                                       | Required                                                                   | Description                                                                |
| -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- |
| `error`                                                                    | *Optional\<String>*                                                        | :heavy_minus_sign:                                                         | Describes an error that wasn't attributable to a single request field.     |
| `paymentData`                                                              | *Optional\<String>*                                                        | :heavy_minus_sign:                                                         | Describes an error within the `token.paymentData` request field.           |
| `paymentMethod`                                                            | *Optional\<String>*                                                        | :heavy_minus_sign:                                                         | Describes an error within the `token.paymentMethod` request field.         |
| `transactionIdentifier`                                                    | *Optional\<String>*                                                        | :heavy_minus_sign:                                                         | Describes an error within the `token.transactionIdentifier` request field. |