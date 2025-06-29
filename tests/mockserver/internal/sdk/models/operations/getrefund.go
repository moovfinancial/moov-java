// Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

package operations

import (
	"mockserver/internal/sdk/models/components"
	"mockserver/internal/sdk/utils"
)

type GetRefundGlobals struct {
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

func (g GetRefundGlobals) MarshalJSON() ([]byte, error) {
	return utils.MarshalJSON(g, "", false)
}

func (g *GetRefundGlobals) UnmarshalJSON(data []byte) error {
	if err := utils.UnmarshalJSON(data, &g, "", false, false); err != nil {
		return err
	}
	return nil
}

func (o *GetRefundGlobals) GetXMoovVersion() *string {
	if o == nil {
		return nil
	}
	return o.XMoovVersion
}

type GetRefundRequest struct {
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
	// Identifier for the transfer.
	TransferID string `pathParam:"style=simple,explode=false,name=transferID"`
	AccountID  string `pathParam:"style=simple,explode=false,name=accountID"`
	// Identifier for the refund.
	RefundID string `pathParam:"style=simple,explode=false,name=refundID"`
}

func (g GetRefundRequest) MarshalJSON() ([]byte, error) {
	return utils.MarshalJSON(g, "", false)
}

func (g *GetRefundRequest) UnmarshalJSON(data []byte) error {
	if err := utils.UnmarshalJSON(data, &g, "", false, false); err != nil {
		return err
	}
	return nil
}

func (o *GetRefundRequest) GetXMoovVersion() *string {
	if o == nil {
		return nil
	}
	return o.XMoovVersion
}

func (o *GetRefundRequest) GetTransferID() string {
	if o == nil {
		return ""
	}
	return o.TransferID
}

func (o *GetRefundRequest) GetAccountID() string {
	if o == nil {
		return ""
	}
	return o.AccountID
}

func (o *GetRefundRequest) GetRefundID() string {
	if o == nil {
		return ""
	}
	return o.RefundID
}

type GetRefundResponse struct {
	HTTPMeta components.HTTPMetadata `json:"-"`
	// The request completed successfully.
	CardAcquiringRefund *components.CardAcquiringRefund
	Headers             map[string][]string
}

func (o *GetRefundResponse) GetHTTPMeta() components.HTTPMetadata {
	if o == nil {
		return components.HTTPMetadata{}
	}
	return o.HTTPMeta
}

func (o *GetRefundResponse) GetCardAcquiringRefund() *components.CardAcquiringRefund {
	if o == nil {
		return nil
	}
	return o.CardAcquiringRefund
}

func (o *GetRefundResponse) GetHeaders() map[string][]string {
	if o == nil {
		return map[string][]string{}
	}
	return o.Headers
}
