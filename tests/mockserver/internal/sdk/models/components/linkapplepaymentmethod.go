// Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

package components

// LinkApplePaymentMethod -   Provides information about the underlying card.
//
//	Refer to [Apple's documentation](https://developer.apple.com/documentation/apple_pay_on_the_web/applepaypaymenttoken/1916113-paymentmethod)
//	for more information.
type LinkApplePaymentMethod struct {
	// A display-friendly discription of the card.
	DisplayName string `json:"displayName"`
	// The card's payment network.
	Network string `json:"network"`
	// The type of card.
	Type string `json:"type"`
}

func (o *LinkApplePaymentMethod) GetDisplayName() string {
	if o == nil {
		return ""
	}
	return o.DisplayName
}

func (o *LinkApplePaymentMethod) GetNetwork() string {
	if o == nil {
		return ""
	}
	return o.Network
}

func (o *LinkApplePaymentMethod) GetType() string {
	if o == nil {
		return ""
	}
	return o.Type
}
