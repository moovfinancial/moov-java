# CreateInvoiceLineItemOption

Represents a modifier or option applied to a line item.


## Fields

| Field                                                                                   | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `name`                                                                                  | *String*                                                                                | :heavy_check_mark:                                                                      | The name of the option or modifier.                                                     |
| `quantity`                                                                              | *int*                                                                                   | :heavy_check_mark:                                                                      | The quantity of this option.                                                            |
| `priceModifier`                                                                         | [Optional\<AmountDecimal>](../../models/components/AmountDecimal.md)                    | :heavy_minus_sign:                                                                      | Optional price modification applied by this option. Can be positive, negative, or zero. |
| `group`                                                                                 | *Optional\<String>*                                                                     | :heavy_minus_sign:                                                                      | Optional group identifier to categorize related options (e.g., 'toppings').             |