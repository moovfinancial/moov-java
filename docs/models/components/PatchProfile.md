# PatchProfile

Describes the fields available when patching a profile.
Each object can be patched independent of patching the other fields.


## Fields

| Field                                                                    | Type                                                                     | Required                                                                 | Description                                                              |
| ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ |
| `individual`                                                             | [Optional\<PatchIndividual>](../../models/components/PatchIndividual.md) | :heavy_minus_sign:                                                       | Describes the fields available when patching an individual.              |
| `business`                                                               | [Optional\<PatchBusiness>](../../models/components/PatchBusiness.md)     | :heavy_minus_sign:                                                       | N/A                                                                      |