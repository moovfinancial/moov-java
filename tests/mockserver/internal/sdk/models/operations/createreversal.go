// Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

package operations

import (
	"mockserver/internal/sdk/models/components"
	"mockserver/internal/sdk/utils"
)

type CreateReversalGlobals struct {
	// Specify an API version.
	//
	// API versioning follows the format `vYYYY.QQ.BB`, where
	//   - `YYYY` is the year
	//   - `QQ` is the two-digit month for the first month of the quarter (e.g., 01, 04, 07, 10)
	//   - `BB` is the build number, starting at `.01`, for subsequent builds in the same quarter.
	//     - For example, `v2024.01.00` is the initial release of the first quarter of 2024.
	//
	// The `latest` version represents the most recent development state. It may include breaking changes and should be treated as a beta release.
	XMoovVersion *string `default:"v2024.01.00" header:"style=simple,explode=false,name=x-moov-version"`
}

func (c CreateReversalGlobals) MarshalJSON() ([]byte, error) {
	return utils.MarshalJSON(c, "", false)
}

func (c *CreateReversalGlobals) UnmarshalJSON(data []byte) error {
	if err := utils.UnmarshalJSON(data, &c, "", false, false); err != nil {
		return err
	}
	return nil
}

func (o *CreateReversalGlobals) GetXMoovVersion() *string {
	if o == nil {
		return nil
	}
	return o.XMoovVersion
}

type CreateReversalRequest struct {
	// Specify an API version.
	//
	// API versioning follows the format `vYYYY.QQ.BB`, where
	//   - `YYYY` is the year
	//   - `QQ` is the two-digit month for the first month of the quarter (e.g., 01, 04, 07, 10)
	//   - `BB` is the build number, starting at `.01`, for subsequent builds in the same quarter.
	//     - For example, `v2024.01.00` is the initial release of the first quarter of 2024.
	//
	// The `latest` version represents the most recent development state. It may include breaking changes and should be treated as a beta release.
	XMoovVersion *string `default:"v2024.01.00" header:"style=simple,explode=false,name=x-moov-version"`
	// Prevents duplicate reversals from being created.
	XIdempotencyKey string `header:"style=simple,explode=false,name=x-idempotency-key"`
	// The Moov account ID.
	AccountID string `pathParam:"style=simple,explode=false,name=accountID"`
	// The transfer ID to reverse.
	TransferID     string                     `pathParam:"style=simple,explode=false,name=transferID"`
	CreateReversal *components.CreateReversal `request:"mediaType=application/json"`
}

func (c CreateReversalRequest) MarshalJSON() ([]byte, error) {
	return utils.MarshalJSON(c, "", false)
}

func (c *CreateReversalRequest) UnmarshalJSON(data []byte) error {
	if err := utils.UnmarshalJSON(data, &c, "", false, false); err != nil {
		return err
	}
	return nil
}

func (o *CreateReversalRequest) GetXMoovVersion() *string {
	if o == nil {
		return nil
	}
	return o.XMoovVersion
}

func (o *CreateReversalRequest) GetXIdempotencyKey() string {
	if o == nil {
		return ""
	}
	return o.XIdempotencyKey
}

func (o *CreateReversalRequest) GetAccountID() string {
	if o == nil {
		return ""
	}
	return o.AccountID
}

func (o *CreateReversalRequest) GetTransferID() string {
	if o == nil {
		return ""
	}
	return o.TransferID
}

func (o *CreateReversalRequest) GetCreateReversal() *components.CreateReversal {
	if o == nil {
		return nil
	}
	return o.CreateReversal
}

type CreateReversalResponse struct {
	HTTPMeta components.HTTPMetadata `json:"-"`
	// Successfully initiated a reversal.
	Reversal *components.Reversal
	Headers  map[string][]string
}

func (o *CreateReversalResponse) GetHTTPMeta() components.HTTPMetadata {
	if o == nil {
		return components.HTTPMetadata{}
	}
	return o.HTTPMeta
}

func (o *CreateReversalResponse) GetReversal() *components.Reversal {
	if o == nil {
		return nil
	}
	return o.Reversal
}

func (o *CreateReversalResponse) GetHeaders() map[string][]string {
	if o == nil {
		return map[string][]string{}
	}
	return o.Headers
}
