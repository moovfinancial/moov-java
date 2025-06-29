// Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

package components

import (
	"encoding/json"
	"fmt"
)

type MicroDepositStatus string

const (
	MicroDepositStatusVerified MicroDepositStatus = "verified"
)

func (e MicroDepositStatus) ToPointer() *MicroDepositStatus {
	return &e
}
func (e *MicroDepositStatus) UnmarshalJSON(data []byte) error {
	var v string
	if err := json.Unmarshal(data, &v); err != nil {
		return err
	}
	switch v {
	case "verified":
		*e = MicroDepositStatus(v)
		return nil
	default:
		return fmt.Errorf("invalid value for MicroDepositStatus: %v", v)
	}
}
