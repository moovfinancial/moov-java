// Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

package components

import (
	"encoding/json"
	"fmt"
)

// FileStatus - The file's status.
type FileStatus string

const (
	FileStatusPending  FileStatus = "pending"
	FileStatusApproved FileStatus = "approved"
	FileStatusRejected FileStatus = "rejected"
)

func (e FileStatus) ToPointer() *FileStatus {
	return &e
}
func (e *FileStatus) UnmarshalJSON(data []byte) error {
	var v string
	if err := json.Unmarshal(data, &v); err != nil {
		return err
	}
	switch v {
	case "pending":
		fallthrough
	case "approved":
		fallthrough
	case "rejected":
		*e = FileStatus(v)
		return nil
	default:
		return fmt.Errorf("invalid value for FileStatus: %v", v)
	}
}
