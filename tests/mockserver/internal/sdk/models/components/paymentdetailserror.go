// Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

package components

type PaymentDetailsError struct {
	AllowedMethods *string                  `json:"allowedMethods,omitempty"`
	CardDetails    *CardPaymentDetailsError `json:"cardDetails,omitempty"`
	AchDetails     *ACHPaymentDetailsError  `json:"achDetails,omitempty"`
}

func (o *PaymentDetailsError) GetAllowedMethods() *string {
	if o == nil {
		return nil
	}
	return o.AllowedMethods
}

func (o *PaymentDetailsError) GetCardDetails() *CardPaymentDetailsError {
	if o == nil {
		return nil
	}
	return o.CardDetails
}

func (o *PaymentDetailsError) GetAchDetails() *ACHPaymentDetailsError {
	if o == nil {
		return nil
	}
	return o.AchDetails
}
