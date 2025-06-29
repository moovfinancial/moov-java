// Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

package components

type AmountDecimal struct {
	// A 3-letter ISO 4217 currency code.
	Currency string `json:"currency"`
	// A decimal-formatted numerical string that represents up to 9 decimal place precision.
	//
	// For example, $12.987654321 is '12.987654321'.
	ValueDecimal string `json:"valueDecimal"`
}

func (o *AmountDecimal) GetCurrency() string {
	if o == nil {
		return ""
	}
	return o.Currency
}

func (o *AmountDecimal) GetValueDecimal() string {
	if o == nil {
		return ""
	}
	return o.ValueDecimal
}
