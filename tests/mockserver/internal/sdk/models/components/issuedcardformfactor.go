// Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

package components

import (
	"encoding/json"
	"fmt"
)

// IssuedCardFormFactor - Specifies the type of spend card to be issued. Presently supports virtual only, providing a digital number without a physical card.
type IssuedCardFormFactor string

const (
	IssuedCardFormFactorVirtual IssuedCardFormFactor = "virtual"
)

func (e IssuedCardFormFactor) ToPointer() *IssuedCardFormFactor {
	return &e
}
func (e *IssuedCardFormFactor) UnmarshalJSON(data []byte) error {
	var v string
	if err := json.Unmarshal(data, &v); err != nil {
		return err
	}
	switch v {
	case "virtual":
		*e = IssuedCardFormFactor(v)
		return nil
	default:
		return fmt.Errorf("invalid value for IssuedCardFormFactor: %v", v)
	}
}
