// Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

package components

type IssuingVelocityLimitError struct {
	Amount   *string `json:"amount,omitempty"`
	Interval *string `json:"interval,omitempty"`
}

func (o *IssuingVelocityLimitError) GetAmount() *string {
	if o == nil {
		return nil
	}
	return o.Amount
}

func (o *IssuingVelocityLimitError) GetInterval() *string {
	if o == nil {
		return nil
	}
	return o.Interval
}
