# AccountFees

A detailed breakdown of account fees.


## Fields

| Field                                                                | Type                                                                 | Required                                                             | Description                                                          |
| -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- |
| `walletFee`                                                          | [AmountDecimal](../../models/components/AmountDecimal.md)            | :heavy_check_mark:                                                   | Fees associated with wallet services.                                |
| `merchantPCIFee`                                                     | [AmountDecimal](../../models/components/AmountDecimal.md)            | :heavy_check_mark:                                                   | Fees for PCI compliance.                                             |
| `invoicePaymentFee`                                                  | [AmountDecimal](../../models/components/AmountDecimal.md)            | :heavy_check_mark:                                                   | Fees for invoice payments.                                           |
| `kybFee`                                                             | [Optional\<AmountDecimal>](../../models/components/AmountDecimal.md) | :heavy_minus_sign:                                                   | Fees for business verification.                                      |
| `kycFee`                                                             | [Optional\<AmountDecimal>](../../models/components/AmountDecimal.md) | :heavy_minus_sign:                                                   | Fees for customer verification.                                      |
| `transactionMonitoringFee`                                           | [Optional\<AmountDecimal>](../../models/components/AmountDecimal.md) | :heavy_minus_sign:                                                   | Fees for transaction risk monitoring.                                |
| `total`                                                              | [AmountDecimal](../../models/components/AmountDecimal.md)            | :heavy_check_mark:                                                   | Total platform fees.                                                 |