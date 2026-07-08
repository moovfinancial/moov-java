# DepositAccountIngestedResponse

The result of ingesting a deposit account into the deposit view.


## Fields

| Field                                                                                     | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `moovAccountID`                                                                           | *String*                                                                                  | :heavy_check_mark:                                                                        | The Moov account that owns the deposit view the account was ingested into.                |
| `sourceSystem`                                                                            | [SourceSystem](../../models/components/SourceSystem.md)                                   | :heavy_check_mark:                                                                        | The core banking source system that produced the ingested payload.                        |
| `sourceAccountID`                                                                         | *String*                                                                                  | :heavy_check_mark:                                                                        | The identifier of the deposit account within the source system.                           |
| `ingestedAt`                                                                              | [OffsetDateTime](https://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html) | :heavy_check_mark:                                                                        | The date and time the deposit account was ingested.                                       |