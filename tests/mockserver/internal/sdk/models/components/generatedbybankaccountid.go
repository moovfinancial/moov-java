// Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

package components

type GeneratedByBankAccountID struct {
	BankAccountID *string `json:"BankAccountID,omitempty"`
}

func (o *GeneratedByBankAccountID) GetBankAccountID() *string {
	if o == nil {
		return nil
	}
	return o.BankAccountID
}
