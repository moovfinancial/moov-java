// Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

package components

// FacilitatorFee - Total or markup fee.
type FacilitatorFee struct {
	// Total facilitator fee in cents. Only either `total` or `totalDecimal` can be set.
	Total *int64 `json:"total,omitempty"`
	// Same as `total`, but a decimal-formatted numerical string that represents up to 9 decimal place precision.
	//
	// Only either `total` or `totalDecimal` can be set. Set this field if you expect the fee to be in fractions of a cent.
	TotalDecimal *string `json:"totalDecimal,omitempty"`
	// Markup facilitator fee in cents. Only either `markup` or `markupDecimal` can be set.
	Markup *int64 `json:"markup,omitempty"`
	// Same as `markup`, but a decimal-formatted numerical string that represents up to 9 decimal place precision.
	// Only either `markup` or `markupDecimal` can be set. Set this field if you expect the fee to be in fractions of a cent.
	MarkupDecimal *string `json:"markupDecimal,omitempty"`
}

func (o *FacilitatorFee) GetTotal() *int64 {
	if o == nil {
		return nil
	}
	return o.Total
}

func (o *FacilitatorFee) GetTotalDecimal() *string {
	if o == nil {
		return nil
	}
	return o.TotalDecimal
}

func (o *FacilitatorFee) GetMarkup() *int64 {
	if o == nil {
		return nil
	}
	return o.Markup
}

func (o *FacilitatorFee) GetMarkupDecimal() *string {
	if o == nil {
		return nil
	}
	return o.MarkupDecimal
}
