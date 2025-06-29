// Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

package components

import (
	"encoding/json"
	"fmt"
)

// DomesticPushToCard - Indicates which level of domestic push-to-card transfer is supported by the card, if any.
type DomesticPushToCard string

const (
	DomesticPushToCardNotSupported DomesticPushToCard = "not-supported"
	DomesticPushToCardStandard     DomesticPushToCard = "standard"
	DomesticPushToCardFastFunds    DomesticPushToCard = "fast-funds"
	DomesticPushToCardUnknown      DomesticPushToCard = "unknown"
)

func (e DomesticPushToCard) ToPointer() *DomesticPushToCard {
	return &e
}
func (e *DomesticPushToCard) UnmarshalJSON(data []byte) error {
	var v string
	if err := json.Unmarshal(data, &v); err != nil {
		return err
	}
	switch v {
	case "not-supported":
		fallthrough
	case "standard":
		fallthrough
	case "fast-funds":
		fallthrough
	case "unknown":
		*e = DomesticPushToCard(v)
		return nil
	default:
		return fmt.Errorf("invalid value for DomesticPushToCard: %v", v)
	}
}
