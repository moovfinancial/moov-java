# CreateTicket

Request to create a new support ticket.


## Fields

| Field                                                     | Type                                                      | Required                                                  | Description                                               |
| --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- |
| `title`                                                   | *String*                                                  | :heavy_check_mark:                                        | N/A                                                       |
| `body`                                                    | *String*                                                  | :heavy_check_mark:                                        | N/A                                                       |
| `author`                                                  | *Optional\<String>*                                       | :heavy_minus_sign:                                        | N/A                                                       |
| `contact`                                                 | [TicketContact](../../models/components/TicketContact.md) | :heavy_check_mark:                                        | N/A                                                       |
| `foreignID`                                               | *Optional\<String>*                                       | :heavy_minus_sign:                                        | N/A                                                       |