// Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

package components

import (
	"encoding/json"
	"fmt"
)

// FeeModel - Specifies the pricing model used for the calculation of the final fee.
type FeeModel string

const (
	FeeModelFixed    FeeModel = "fixed"
	FeeModelBlended  FeeModel = "blended"
	FeeModelVariable FeeModel = "variable"
)

func (e FeeModel) ToPointer() *FeeModel {
	return &e
}
func (e *FeeModel) UnmarshalJSON(data []byte) error {
	var v string
	if err := json.Unmarshal(data, &v); err != nil {
		return err
	}
	switch v {
	case "fixed":
		fallthrough
	case "blended":
		fallthrough
	case "variable":
		*e = FeeModel(v)
		return nil
	default:
		return fmt.Errorf("invalid value for FeeModel: %v", v)
	}
}
