# UpdateCardRequest


## Fields

| Field                                                      | Type                                                       | Required                                                   | Description                                                | Example                                                    |
| ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- |
| `xMoovVersion`                                             | [Optional\<Versions>](../../models/components/Versions.md) | :heavy_minus_sign:                                         | Specify an API version.                                    |                                                            |
| `accountID`                                                | *String*                                                   | :heavy_check_mark:                                         | N/A                                                        |                                                            |
| `cardID`                                                   | *String*                                                   | :heavy_check_mark:                                         | N/A                                                        | 01234567-89ab-cdef-0123-456789abcdef                       |
| `updateCard`                                               | [UpdateCard](../../models/components/UpdateCard.md)        | :heavy_check_mark:                                         | N/A                                                        | {<br/>"cardCvv": "456"<br/>}                               |