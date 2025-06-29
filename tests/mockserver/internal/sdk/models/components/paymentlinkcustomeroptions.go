// Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

package components

type PaymentLinkCustomerOptions struct {
	// If true, a billing address is required when completing the payment form.
	RequireAddress *bool `json:"requireAddress,omitempty"`
	// If true, a phone number is required when completing the payment form.
	RequirePhone *bool `json:"requirePhone,omitempty"`
	// Optional free-form metadata for the Moov account that will represent this customer.
	Metadata map[string]string `json:"metadata,omitempty"`
}

func (o *PaymentLinkCustomerOptions) GetRequireAddress() *bool {
	if o == nil {
		return nil
	}
	return o.RequireAddress
}

func (o *PaymentLinkCustomerOptions) GetRequirePhone() *bool {
	if o == nil {
		return nil
	}
	return o.RequirePhone
}

func (o *PaymentLinkCustomerOptions) GetMetadata() map[string]string {
	if o == nil {
		return nil
	}
	return o.Metadata
}
