// Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

package components

import (
	"mockserver/internal/sdk/utils"
	"time"
)

// Adjustment - An adjustment to a wallet.
type Adjustment struct {
	AdjustmentID string        `json:"adjustmentID"`
	WalletID     string        `json:"walletID"`
	Amount       AmountDecimal `json:"amount"`
	CreatedOn    time.Time     `json:"createdOn"`
}

func (a Adjustment) MarshalJSON() ([]byte, error) {
	return utils.MarshalJSON(a, "", false)
}

func (a *Adjustment) UnmarshalJSON(data []byte) error {
	if err := utils.UnmarshalJSON(data, &a, "", false, false); err != nil {
		return err
	}
	return nil
}

func (o *Adjustment) GetAdjustmentID() string {
	if o == nil {
		return ""
	}
	return o.AdjustmentID
}

func (o *Adjustment) GetWalletID() string {
	if o == nil {
		return ""
	}
	return o.WalletID
}

func (o *Adjustment) GetAmount() AmountDecimal {
	if o == nil {
		return AmountDecimal{}
	}
	return o.Amount
}

func (o *Adjustment) GetCreatedOn() time.Time {
	if o == nil {
		return time.Time{}
	}
	return o.CreatedOn
}
