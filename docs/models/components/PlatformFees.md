# ~~PlatformFees~~

A detailed breakdown of platform fees. This field is deprecated and will be removed in a future release. Use accountFees.

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.


## Fields

| Field                                                     | Type                                                      | Required                                                  | Description                                               |
| --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- |
| `walletFee`                                               | [AmountDecimal](../../models/components/AmountDecimal.md) | :heavy_check_mark:                                        | Fees associated with wallet services.                     |
| `merchantPCIFee`                                          | [AmountDecimal](../../models/components/AmountDecimal.md) | :heavy_check_mark:                                        | Fees for PCI compliance.                                  |
| `total`                                                   | [AmountDecimal](../../models/components/AmountDecimal.md) | :heavy_check_mark:                                        | Total platform fees.                                      |