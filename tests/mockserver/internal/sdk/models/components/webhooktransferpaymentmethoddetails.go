// Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

package components

// WebhookTransferPaymentMethodDetails - Payment method details for the source or destination of a transfer.
type WebhookTransferPaymentMethodDetails struct {
	AccountID       string `json:"accountID"`
	PaymentMethodID string `json:"paymentMethodID"`
}

func (o *WebhookTransferPaymentMethodDetails) GetAccountID() string {
	if o == nil {
		return ""
	}
	return o.AccountID
}

func (o *WebhookTransferPaymentMethodDetails) GetPaymentMethodID() string {
	if o == nil {
		return ""
	}
	return o.PaymentMethodID
}
