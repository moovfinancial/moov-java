// Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

package components

import (
	"encoding/json"
	"fmt"
)

type BankAccountWaitFor string

const (
	BankAccountWaitForPaymentMethod BankAccountWaitFor = "payment-method"
	BankAccountWaitForRailResponse  BankAccountWaitFor = "rail-response"
)

func (e BankAccountWaitFor) ToPointer() *BankAccountWaitFor {
	return &e
}
func (e *BankAccountWaitFor) UnmarshalJSON(data []byte) error {
	var v string
	if err := json.Unmarshal(data, &v); err != nil {
		return err
	}
	switch v {
	case "payment-method":
		fallthrough
	case "rail-response":
		*e = BankAccountWaitFor(v)
		return nil
	default:
		return fmt.Errorf("invalid value for BankAccountWaitFor: %v", v)
	}
}
