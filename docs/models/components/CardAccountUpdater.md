# CardAccountUpdater

The results of the most recent card update request.


## Fields

| Field                                                                                     | Type                                                                                      | Required                                                                                  | Description                                                                               | Example                                                                                   |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `updatedOn`                                                                               | [OffsetDateTime](https://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html) | :heavy_minus_sign:                                                                        | Timestamp from the card network indicating when the card update was processed.            |                                                                                           |
| `updateType`                                                                              | [Optional\<CardUpdateReason>](../../models/components/CardUpdateReason.md)                | :heavy_minus_sign:                                                                        | The results of the card update request.                                                   | number-update                                                                             |