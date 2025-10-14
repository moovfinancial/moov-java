# VolumeRange

Defines the volume ranges for tiered pricing models.


## Fields

| Field                                                     | Type                                                      | Required                                                  | Description                                               |
| --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- |
| `fromValue`                                               | *long*                                                    | :heavy_check_mark:                                        | Specifies the lower value of a tier for the fee.          |
| `toValue`                                                 | *Optional\<Long>*                                         | :heavy_minus_sign:                                        | Specifies the upper value of a tier for the fee.          |
| `flatAmount`                                              | [AmountDecimal](../../models/components/AmountDecimal.md) | :heavy_check_mark:                                        | The flat amount for a whole tier of the fee.              |
| `perUnitAmount`                                           | [AmountDecimal](../../models/components/AmountDecimal.md) | :heavy_check_mark:                                        | The unit price for a specific tier of the fee.            |