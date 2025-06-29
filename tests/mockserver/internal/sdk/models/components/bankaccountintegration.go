// Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

package components

type BankAccountIntegration struct {
	HolderName string `json:"holderName"`
	// The type of holder on a funding source.
	HolderType    BankAccountHolderType `json:"holderType"`
	AccountNumber string                `json:"accountNumber"`
	// The bank account type.
	BankAccountType BankAccountType `json:"bankAccountType"`
	RoutingNumber   string          `json:"routingNumber"`
}

func (o *BankAccountIntegration) GetHolderName() string {
	if o == nil {
		return ""
	}
	return o.HolderName
}

func (o *BankAccountIntegration) GetHolderType() BankAccountHolderType {
	if o == nil {
		return BankAccountHolderType("")
	}
	return o.HolderType
}

func (o *BankAccountIntegration) GetAccountNumber() string {
	if o == nil {
		return ""
	}
	return o.AccountNumber
}

func (o *BankAccountIntegration) GetBankAccountType() BankAccountType {
	if o == nil {
		return BankAccountType("")
	}
	return o.BankAccountType
}

func (o *BankAccountIntegration) GetRoutingNumber() string {
	if o == nil {
		return ""
	}
	return o.RoutingNumber
}
