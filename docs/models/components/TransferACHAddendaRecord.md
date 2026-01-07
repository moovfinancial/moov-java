# TransferACHAddendaRecord

An addenda record which was added to an ACH transfer


## Fields

| Field                                                      | Type                                                       | Required                                                   | Description                                                |
| ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- |
| `record`                                                   | *String*                                                   | :heavy_check_mark:                                         | The ACH addenda record, which may have masked PII          |
| `isMasked`                                                 | *boolean*                                                  | :heavy_check_mark:                                         | Flag indicating whether or not this record has been masked |