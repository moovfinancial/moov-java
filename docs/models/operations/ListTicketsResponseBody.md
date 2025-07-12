# ListTicketsResponseBody

A paginated list of items. The `nextPage` field is omitted if there are no more pages available.


## Fields

| Field                                                                      | Type                                                                       | Required                                                                   | Description                                                                |
| -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- |
| `items`                                                                    | List\<[Ticket](../../models/components/Ticket.md)>                         | :heavy_check_mark:                                                         | N/A                                                                        |
| `nextPage`                                                                 | [Optional\<ItemListNextPage>](../../models/components/ItemListNextPage.md) | :heavy_minus_sign:                                                         | N/A                                                                        |