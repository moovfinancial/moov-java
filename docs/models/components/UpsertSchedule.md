# UpsertSchedule


## Fields

| Field                                                      | Type                                                       | Required                                                   | Description                                                |
| ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- |
| `description`                                              | *Optional\<String>*                                        | :heavy_minus_sign:                                         | Simple description of what the schedule is.                |
| `occurrences`                                              | List\<[Occurrence](../../models/components/Occurrence.md)> | :heavy_minus_sign:                                         | N/A                                                        |
| `recur`                                                    | [Optional\<Recur>](../../models/components/Recur.md)       | :heavy_minus_sign:                                         | Defines configuration for recurring transfers.             |