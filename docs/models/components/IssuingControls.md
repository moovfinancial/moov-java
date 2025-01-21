# IssuingControls


## Fields

| Field                                                                                        | Type                                                                                         | Required                                                                                     | Description                                                                                  |
| -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- |
| `singleUse`                                                                                  | *Optional\<Boolean>*                                                                         | :heavy_minus_sign:                                                                           | Indicates if the card is single-use. If true, the card closes after the first authorization. |
| `velocityLimits`                                                                             | List\<[IssuingVelocityLimit](../../models/components/IssuingVelocityLimit.md)>               | :heavy_minus_sign:                                                                           | Sets the spending limit per time interval. Only one limit per interval is supported.         |