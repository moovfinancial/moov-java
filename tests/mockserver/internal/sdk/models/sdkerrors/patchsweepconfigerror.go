// Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

package sdkerrors

import (
	"encoding/json"
	"mockserver/internal/sdk/models/components"
)

type PatchSweepConfigError struct {
	Status              *string                 `json:"status,omitempty"`
	PushPaymentMethodID *string                 `json:"pushPaymentMethodID,omitempty"`
	PullPaymentMethodID *string                 `json:"pullPaymentMethodID,omitempty"`
	StatementDescriptor *string                 `json:"statementDescriptor,omitempty"`
	MinimumBalance      *string                 `json:"minimumBalance,omitempty"`
	HTTPMeta            components.HTTPMetadata `json:"-"`
}

var _ error = &PatchSweepConfigError{}

func (e *PatchSweepConfigError) Error() string {
	data, _ := json.Marshal(e)
	return string(data)
}
