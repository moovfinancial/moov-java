// Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

package components

type WebhookDataAccountCreated struct {
	AccountID string  `json:"accountID"`
	ForeignID *string `json:"foreignID,omitempty"`
}

func (o *WebhookDataAccountCreated) GetAccountID() string {
	if o == nil {
		return ""
	}
	return o.AccountID
}

func (o *WebhookDataAccountCreated) GetForeignID() *string {
	if o == nil {
		return nil
	}
	return o.ForeignID
}
