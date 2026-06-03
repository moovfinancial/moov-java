# TransferControls

Controls for transfers created through a given partner


## Fields

| Field                                                                        | Type                                                                         | Required                                                                     | Description                                                                  |
| ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- |
| `accountID`                                                                  | *String*                                                                     | :heavy_check_mark:                                                           | ID of the merchant account.                                                  |
| `partnerAccountID`                                                           | *String*                                                                     | :heavy_check_mark:                                                           | ID of the partner account.                                                   |
| `debtRepayment`                                                              | *boolean*                                                                    | :heavy_check_mark:                                                           | Indicates if the account is configured for debt repayment.                   |
| `allowDynamicDescriptor`                                                     | *boolean*                                                                    | :heavy_check_mark:                                                           | Indicates if the account is allowed to set dynamic descriptors on transfers. |
| `allowSurcharge`                                                             | *boolean*                                                                    | :heavy_check_mark:                                                           | Indicates if the account is allowed to apply surcharges to transfers.        |