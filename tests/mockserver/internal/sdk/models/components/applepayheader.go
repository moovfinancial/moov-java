// Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

package components

// ApplePayHeader - Information needed to decrypt Apple Pay payment data.
//
// Refer to [Apple's documentation](https://developer.apple.com/documentation/passkit/payment-token-format-reference#Header-keys-and-values)
// for more information.
type ApplePayHeader struct {
	// Base64-encoded ephemeral public key, used for ECC-encrypted payment data.
	EphemeralPublicKey *string `json:"ephemeralPublicKey,omitempty"`
	// A base64-encoded, SHA-256 hash of the merchant's public key.
	PublicKeyHash string `json:"publicKeyHash"`
	// A device-generated identifier for the transaction.
	TransactionID string `json:"transactionId"`
}

func (o *ApplePayHeader) GetEphemeralPublicKey() *string {
	if o == nil {
		return nil
	}
	return o.EphemeralPublicKey
}

func (o *ApplePayHeader) GetPublicKeyHash() string {
	if o == nil {
		return ""
	}
	return o.PublicKeyHash
}

func (o *ApplePayHeader) GetTransactionID() string {
	if o == nil {
		return ""
	}
	return o.TransactionID
}
