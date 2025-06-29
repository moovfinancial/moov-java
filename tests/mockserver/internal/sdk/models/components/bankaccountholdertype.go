// Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

package components

import (
	"encoding/json"
	"fmt"
)

// BankAccountHolderType - The type of holder on a funding source.
type BankAccountHolderType string

const (
	BankAccountHolderTypeIndividual BankAccountHolderType = "individual"
	BankAccountHolderTypeBusiness   BankAccountHolderType = "business"
	BankAccountHolderTypeGuest      BankAccountHolderType = "guest"
)

func (e BankAccountHolderType) ToPointer() *BankAccountHolderType {
	return &e
}
func (e *BankAccountHolderType) UnmarshalJSON(data []byte) error {
	var v string
	if err := json.Unmarshal(data, &v); err != nil {
		return err
	}
	switch v {
	case "individual":
		fallthrough
	case "business":
		fallthrough
	case "guest":
		*e = BankAccountHolderType(v)
		return nil
	default:
		return fmt.Errorf("invalid value for BankAccountHolderType: %v", v)
	}
}
