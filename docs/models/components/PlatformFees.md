# PlatformFees

A detailed breakdown of platform fees.


## Fields

| Field                                                     | Type                                                      | Required                                                  | Description                                               |
| --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- |
| `walletFee`                                               | [AmountDecimal](../../models/components/AmountDecimal.md) | :heavy_check_mark:                                        | Fees associated with wallet services.                     |
| `merchantPCIFee`                                          | [AmountDecimal](../../models/components/AmountDecimal.md) | :heavy_check_mark:                                        | Fees for PCI compliance.                                  |
| `total`                                                   | [AmountDecimal](../../models/components/AmountDecimal.md) | :heavy_check_mark:                                        | Total platform fees.                                      |