# UpdateIssuingControlsMerchantRestrictions

Restricts card usage to specific merchants, independent of merchant category. Set to `null` to remove merchant restrictions.


## Fields

| Field                                                                                                  | Type                                                                                                   | Required                                                                                               | Description                                                                                            |
| ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ |
| `mode`                                                                                                 | [Optional\<IssuingControlsRestrictionMode>](../../models/components/IssuingControlsRestrictionMode.md) | :heavy_minus_sign:                                                                                     | Whether the listed items should be allowed (`allow`) or blocked (`block`).                             |
| `merchants`                                                                                            | List\<[MerchantEntry](../../models/components/MerchantEntry.md)>                                       | :heavy_minus_sign:                                                                                     | The merchants to allow or block.                                                                       |