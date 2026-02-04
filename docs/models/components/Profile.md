# Profile

Describes a Moov account profile. A profile will have a business, individual, or guest depending on the account's type.


## Fields

| Field                                                                        | Type                                                                         | Required                                                                     | Description                                                                  |
| ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- |
| `individual`                                                                 | [Optional\<IndividualProfile>](../../models/components/IndividualProfile.md) | :heavy_minus_sign:                                                           | Describes an individual.                                                     |
| `business`                                                                   | [Optional\<BusinessProfile>](../../models/components/BusinessProfile.md)     | :heavy_minus_sign:                                                           | Describes a business.                                                        |