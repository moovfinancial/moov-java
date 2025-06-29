// Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

package sdkerrors

import (
	"encoding/json"
	"mockserver/internal/sdk/models/components"
)

type RevokeTokenRequestError struct {
	Token         *string                 `json:"token,omitempty"`
	TokenTypeHint *string                 `json:"token_type_hint,omitempty"`
	HTTPMeta      components.HTTPMetadata `json:"-"`
}

var _ error = &RevokeTokenRequestError{}

func (e *RevokeTokenRequestError) Error() string {
	data, _ := json.Marshal(e)
	return string(data)
}
