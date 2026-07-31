# MerchantRestrictions

Restricts card usage to specific merchants, independent of merchant category.


## Fields

| Field                                                                                       | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `mode`                                                                                      | [IssuingControlsRestrictionMode](../../models/components/IssuingControlsRestrictionMode.md) | :heavy_check_mark:                                                                          | Whether the listed merchants are the only ones allowed, or the ones to block.               |
| `merchants`                                                                                 | List\<[MerchantEntry](../../models/components/MerchantEntry.md)>                            | :heavy_check_mark:                                                                          | The merchants to allow or block.                                                            |