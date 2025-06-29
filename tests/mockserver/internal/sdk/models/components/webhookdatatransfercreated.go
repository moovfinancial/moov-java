// Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

package components

type WebhookDataTransferCreated struct {
	// The accountID which facilitated the transfer.
	AccountID  string                    `json:"accountID"`
	TransferID string                    `json:"transferID"`
	Status     WebhookDataTransferStatus `json:"status"`
	ForeignID  *string                   `json:"foreignID,omitempty"`
}

func (o *WebhookDataTransferCreated) GetAccountID() string {
	if o == nil {
		return ""
	}
	return o.AccountID
}

func (o *WebhookDataTransferCreated) GetTransferID() string {
	if o == nil {
		return ""
	}
	return o.TransferID
}

func (o *WebhookDataTransferCreated) GetStatus() WebhookDataTransferStatus {
	if o == nil {
		return WebhookDataTransferStatus("")
	}
	return o.Status
}

func (o *WebhookDataTransferCreated) GetForeignID() *string {
	if o == nil {
		return nil
	}
	return o.ForeignID
}
