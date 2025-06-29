// Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

package operations

import (
	"mockserver/internal/sdk/models/components"
	"mockserver/internal/sdk/utils"
)

type InitiateRefundGlobals struct {
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

func (i InitiateRefundGlobals) MarshalJSON() ([]byte, error) {
	return utils.MarshalJSON(i, "", false)
}

func (i *InitiateRefundGlobals) UnmarshalJSON(data []byte) error {
	if err := utils.UnmarshalJSON(data, &i, "", false, false); err != nil {
		return err
	}
	return nil
}

func (o *InitiateRefundGlobals) GetXMoovVersion() *string {
	if o == nil {
		return nil
	}
	return o.XMoovVersion
}

type InitiateRefundRequest struct {
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
	// Prevents duplicate refunds from being created.
	XIdempotencyKey string `header:"style=simple,explode=false,name=x-idempotency-key"`
	// Optional header that indicates whether to return a synchronous response that includes full transfer and rail-specific details or an
	// asynchronous response indicating the transfer was created (this is the default response if the header is omitted). A timeout will occur after 15 seconds.
	XWaitFor *components.TransferWaitFor `header:"style=simple,explode=false,name=x-wait-for"`
	// The merchant's Moov account ID.
	AccountID string `pathParam:"style=simple,explode=false,name=accountID"`
	// Identifier for the transfer.
	TransferID   string                   `pathParam:"style=simple,explode=false,name=transferID"`
	CreateRefund *components.CreateRefund `request:"mediaType=application/json"`
}

func (i InitiateRefundRequest) MarshalJSON() ([]byte, error) {
	return utils.MarshalJSON(i, "", false)
}

func (i *InitiateRefundRequest) UnmarshalJSON(data []byte) error {
	if err := utils.UnmarshalJSON(data, &i, "", false, false); err != nil {
		return err
	}
	return nil
}

func (o *InitiateRefundRequest) GetXMoovVersion() *string {
	if o == nil {
		return nil
	}
	return o.XMoovVersion
}

func (o *InitiateRefundRequest) GetXIdempotencyKey() string {
	if o == nil {
		return ""
	}
	return o.XIdempotencyKey
}

func (o *InitiateRefundRequest) GetXWaitFor() *components.TransferWaitFor {
	if o == nil {
		return nil
	}
	return o.XWaitFor
}

func (o *InitiateRefundRequest) GetAccountID() string {
	if o == nil {
		return ""
	}
	return o.AccountID
}

func (o *InitiateRefundRequest) GetTransferID() string {
	if o == nil {
		return ""
	}
	return o.TransferID
}

func (o *InitiateRefundRequest) GetCreateRefund() *components.CreateRefund {
	if o == nil {
		return nil
	}
	return o.CreateRefund
}

type InitiateRefundResponse struct {
	HTTPMeta components.HTTPMetadata `json:"-"`
	// The request completed successfully.
	CreateRefundResponse *components.CreateRefundResponse
	// A refund was successfully created but an error occurred while waiting for a synchronous response.
	CardAcquiringRefund *components.CardAcquiringRefund
	Headers             map[string][]string
}

func (o *InitiateRefundResponse) GetHTTPMeta() components.HTTPMetadata {
	if o == nil {
		return components.HTTPMetadata{}
	}
	return o.HTTPMeta
}

func (o *InitiateRefundResponse) GetCreateRefundResponse() *components.CreateRefundResponse {
	if o == nil {
		return nil
	}
	return o.CreateRefundResponse
}

func (o *InitiateRefundResponse) GetCardAcquiringRefund() *components.CardAcquiringRefund {
	if o == nil {
		return nil
	}
	return o.CardAcquiringRefund
}

func (o *InitiateRefundResponse) GetHeaders() map[string][]string {
	if o == nil {
		return map[string][]string{}
	}
	return o.Headers
}
