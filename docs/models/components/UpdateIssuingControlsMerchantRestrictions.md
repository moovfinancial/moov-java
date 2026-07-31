# UpdateIssuingControlsMerchantRestrictions

Replaces the merchant restrictions. Set to `null` to remove.


## Fields

| Field                                                                                                  | Type                                                                                                   | Required                                                                                               | Description                                                                                            |
| ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ |
| `mode`                                                                                                 | [Optional\<IssuingControlsRestrictionMode>](../../models/components/IssuingControlsRestrictionMode.md) | :heavy_minus_sign:                                                                                     | Whether the listed merchants are the only ones allowed, or the ones to block.                          |
| `merchants`                                                                                            | List\<[MerchantEntry](../../models/components/MerchantEntry.md)>                                       | :heavy_minus_sign:                                                                                     | The merchants to allow or block.                                                                       |