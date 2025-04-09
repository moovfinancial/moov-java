# MoovFee

Moov fee charged to an account involved in a transfer.


## Fields

| Field                                                                                 | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `accountID`                                                                           | *String*                                                                              | :heavy_check_mark:                                                                    | ID of the account that fees were charged to.                                          |
| `transferParty`                                                                       | [TransferParty](../../models/components/TransferParty.md)                             | :heavy_check_mark:                                                                    | Indicates whether the account charged is the source, destination, or partner account. |
| `totalAmount`                                                                         | [AmountDecimal](../../models/components/AmountDecimal.md)                             | :heavy_check_mark:                                                                    | The total amount of fees charged to the account.                                      |
| `feeIDs`                                                                              | List\<*String*>                                                                       | :heavy_check_mark:                                                                    | List of fee IDs that sum to the totalAmount.                                          |