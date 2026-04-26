# LinkedGooglePayPaymentMethod


## Fields

| Field                                                                     | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `paymentMethodID`                                                         | *String*                                                                  | :heavy_check_mark:                                                        | The new payment method's ID.                                              |
| `paymentMethodType`                                                       | [PaymentMethodType](../../models/components/PaymentMethodType.md)         | :heavy_check_mark:                                                        | The payment method type that represents a payment rail and directionality |
| `googlePay`                                                               | [GooglePayResponse](../../models/components/GooglePayResponse.md)         | :heavy_check_mark:                                                        | Describes a Google Pay token on a Moov account.                           |