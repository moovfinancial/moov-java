// Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

package components

import (
	"encoding/json"
	"fmt"
)

type MoovWalletPaymentMethodPaymentMethodType string

const (
	MoovWalletPaymentMethodPaymentMethodTypeMoovWallet MoovWalletPaymentMethodPaymentMethodType = "moov-wallet"
)

func (e MoovWalletPaymentMethodPaymentMethodType) ToPointer() *MoovWalletPaymentMethodPaymentMethodType {
	return &e
}
func (e *MoovWalletPaymentMethodPaymentMethodType) UnmarshalJSON(data []byte) error {
	var v string
	if err := json.Unmarshal(data, &v); err != nil {
		return err
	}
	switch v {
	case "moov-wallet":
		*e = MoovWalletPaymentMethodPaymentMethodType(v)
		return nil
	default:
		return fmt.Errorf("invalid value for MoovWalletPaymentMethodPaymentMethodType: %v", v)
	}
}

type MoovWalletPaymentMethod struct {
	// ID of the payment method.
	PaymentMethodID   string                                   `json:"paymentMethodID"`
	PaymentMethodType MoovWalletPaymentMethodPaymentMethodType `json:"paymentMethodType"`
	Wallet            PaymentMethodsWallet                     `json:"wallet"`
}

func (o *MoovWalletPaymentMethod) GetPaymentMethodID() string {
	if o == nil {
		return ""
	}
	return o.PaymentMethodID
}

func (o *MoovWalletPaymentMethod) GetPaymentMethodType() MoovWalletPaymentMethodPaymentMethodType {
	if o == nil {
		return MoovWalletPaymentMethodPaymentMethodType("")
	}
	return o.PaymentMethodType
}

func (o *MoovWalletPaymentMethod) GetWallet() PaymentMethodsWallet {
	if o == nil {
		return PaymentMethodsWallet{}
	}
	return o.Wallet
}
