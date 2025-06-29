// Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

package sdkerrors

import (
	"encoding/json"
	"mockserver/internal/sdk/models/components"
)

type LinkApplePayError struct {
	// Describes an error that wasn't attributable to a single request field.
	Error_ *string `json:"error,omitempty"`
	// Describes an error within the `token.paymentData` request field.
	PaymentData *string `json:"paymentData,omitempty"`
	// Describes an error within the `token.paymentMethod` request field.
	PaymentMethod *string `json:"paymentMethod,omitempty"`
	// Describes an error within the `token.transactionIdentifier` request field.
	TransactionIdentifier *string                 `json:"transactionIdentifier,omitempty"`
	HTTPMeta              components.HTTPMetadata `json:"-"`
}

var _ error = &LinkApplePayError{}

func (e *LinkApplePayError) Error() string {
	data, _ := json.Marshal(e)
	return string(data)
}
