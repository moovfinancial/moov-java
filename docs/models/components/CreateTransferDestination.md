# CreateTransferDestination

The final stage of a transfer and the ultimate recipient of the funds.


## Fields

| Field                                                                                                | Type                                                                                                 | Required                                                                                             | Description                                                                                          |
| ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- |
| `paymentMethodID`                                                                                    | *String*                                                                                             | :heavy_check_mark:                                                                                   | N/A                                                                                                  |
| `cardDetails`                                                                                        | [Optional\<CreateTransferDestinationCard>](../../models/components/CreateTransferDestinationCard.md) | :heavy_minus_sign:                                                                                   | N/A                                                                                                  |
| `achDetails`                                                                                         | [Optional\<CreateTransferDestinationACH>](../../models/components/CreateTransferDestinationACH.md)   | :heavy_minus_sign:                                                                                   | N/A                                                                                                  |