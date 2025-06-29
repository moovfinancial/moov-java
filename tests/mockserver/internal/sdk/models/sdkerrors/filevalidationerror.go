// Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

package sdkerrors

import (
	"encoding/json"
	"mockserver/internal/sdk/models/components"
)

type FileValidationError struct {
	Error_      *string                 `json:"error,omitempty"`
	File        *string                 `json:"file,omitempty"`
	FilePurpose *string                 `json:"filePurpose,omitempty"`
	Metadata    *string                 `json:"metadata,omitempty"`
	HTTPMeta    components.HTTPMetadata `json:"-"`
}

var _ error = &FileValidationError{}

func (e *FileValidationError) Error() string {
	data, _ := json.Marshal(e)
	return string(data)
}
