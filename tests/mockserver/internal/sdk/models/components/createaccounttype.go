// Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

package components

import (
	"encoding/json"
	"fmt"
)

type CreateAccountType string

const (
	CreateAccountTypeIndividual CreateAccountType = "individual"
	CreateAccountTypeBusiness   CreateAccountType = "business"
)

func (e CreateAccountType) ToPointer() *CreateAccountType {
	return &e
}
func (e *CreateAccountType) UnmarshalJSON(data []byte) error {
	var v string
	if err := json.Unmarshal(data, &v); err != nil {
		return err
	}
	switch v {
	case "individual":
		fallthrough
	case "business":
		*e = CreateAccountType(v)
		return nil
	default:
		return fmt.Errorf("invalid value for CreateAccountType: %v", v)
	}
}
