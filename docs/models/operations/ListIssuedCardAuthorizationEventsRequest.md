# ListIssuedCardAuthorizationEventsRequest


## Fields

| Field                                                       | Type                                                        | Required                                                    | Description                                                 | Example                                                     |
| ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- |
| `accountID`                                                 | *String*                                                    | :heavy_check_mark:                                          | The Moov business account for which cards have been issued. |                                                             |
| `authorizationID`                                           | *String*                                                    | :heavy_check_mark:                                          | N/A                                                         |                                                             |
| `skip`                                                      | *Optional\<Long>*                                           | :heavy_minus_sign:                                          | N/A                                                         | 60                                                          |
| `count`                                                     | *Optional\<Long>*                                           | :heavy_minus_sign:                                          | N/A                                                         | 20                                                          |