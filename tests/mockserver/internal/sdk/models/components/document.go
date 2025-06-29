// Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

package components

import (
	"mockserver/internal/sdk/utils"
	"time"
)

type Document struct {
	DocumentID string `json:"documentID"`
	// Types of documents that can be uploaded.
	Type DocumentType `json:"type"`
	// The document's MIME type.
	ContentType string `json:"contentType"`
	// Optional array of errors encountered during automated parsing.
	ParseErrors []string  `json:"parseErrors,omitempty"`
	UploadedAt  time.Time `json:"uploadedAt"`
}

func (d Document) MarshalJSON() ([]byte, error) {
	return utils.MarshalJSON(d, "", false)
}

func (d *Document) UnmarshalJSON(data []byte) error {
	if err := utils.UnmarshalJSON(data, &d, "", false, false); err != nil {
		return err
	}
	return nil
}

func (o *Document) GetDocumentID() string {
	if o == nil {
		return ""
	}
	return o.DocumentID
}

func (o *Document) GetType() DocumentType {
	if o == nil {
		return DocumentType("")
	}
	return o.Type
}

func (o *Document) GetContentType() string {
	if o == nil {
		return ""
	}
	return o.ContentType
}

func (o *Document) GetParseErrors() []string {
	if o == nil {
		return nil
	}
	return o.ParseErrors
}

func (o *Document) GetUploadedAt() time.Time {
	if o == nil {
		return time.Time{}
	}
	return o.UploadedAt
}
