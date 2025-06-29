// Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

package components

import (
	"encoding/json"
	"fmt"
)

// EntryMode - How the card information was entered into the point of sale terminal.
type EntryMode string

const (
	EntryModeContactless EntryMode = "contactless"
)

func (e EntryMode) ToPointer() *EntryMode {
	return &e
}
func (e *EntryMode) UnmarshalJSON(data []byte) error {
	var v string
	if err := json.Unmarshal(data, &v); err != nil {
		return err
	}
	switch v {
	case "contactless":
		*e = EntryMode(v)
		return nil
	default:
		return fmt.Errorf("invalid value for EntryMode: %v", v)
	}
}
