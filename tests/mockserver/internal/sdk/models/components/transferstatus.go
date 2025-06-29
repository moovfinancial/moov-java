// Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

package components

import (
	"encoding/json"
	"fmt"
)

// TransferStatus - Status of a transfer.
type TransferStatus string

const (
	TransferStatusCreated   TransferStatus = "created"
	TransferStatusPending   TransferStatus = "pending"
	TransferStatusCompleted TransferStatus = "completed"
	TransferStatusFailed    TransferStatus = "failed"
	TransferStatusReversed  TransferStatus = "reversed"
	TransferStatusQueued    TransferStatus = "queued"
	TransferStatusCanceled  TransferStatus = "canceled"
)

func (e TransferStatus) ToPointer() *TransferStatus {
	return &e
}
func (e *TransferStatus) UnmarshalJSON(data []byte) error {
	var v string
	if err := json.Unmarshal(data, &v); err != nil {
		return err
	}
	switch v {
	case "created":
		fallthrough
	case "pending":
		fallthrough
	case "completed":
		fallthrough
	case "failed":
		fallthrough
	case "reversed":
		fallthrough
	case "queued":
		fallthrough
	case "canceled":
		*e = TransferStatus(v)
		return nil
	default:
		return fmt.Errorf("invalid value for TransferStatus: %v", v)
	}
}
