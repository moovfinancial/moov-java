// Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

package operations

import (
	"io"
	"mockserver/internal/sdk/models/components"
	"mockserver/internal/sdk/utils"
)

type GetDisputeEvidenceDataGlobals struct {
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

func (g GetDisputeEvidenceDataGlobals) MarshalJSON() ([]byte, error) {
	return utils.MarshalJSON(g, "", false)
}

func (g *GetDisputeEvidenceDataGlobals) UnmarshalJSON(data []byte) error {
	if err := utils.UnmarshalJSON(data, &g, "", false, false); err != nil {
		return err
	}
	return nil
}

func (o *GetDisputeEvidenceDataGlobals) GetXMoovVersion() *string {
	if o == nil {
		return nil
	}
	return o.XMoovVersion
}

type GetDisputeEvidenceDataRequest struct {
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
	AccountID    string  `pathParam:"style=simple,explode=false,name=accountID"`
	DisputeID    string  `pathParam:"style=simple,explode=false,name=disputeID"`
	EvidenceID   string  `pathParam:"style=simple,explode=false,name=evidenceID"`
}

func (g GetDisputeEvidenceDataRequest) MarshalJSON() ([]byte, error) {
	return utils.MarshalJSON(g, "", false)
}

func (g *GetDisputeEvidenceDataRequest) UnmarshalJSON(data []byte) error {
	if err := utils.UnmarshalJSON(data, &g, "", false, false); err != nil {
		return err
	}
	return nil
}

func (o *GetDisputeEvidenceDataRequest) GetXMoovVersion() *string {
	if o == nil {
		return nil
	}
	return o.XMoovVersion
}

func (o *GetDisputeEvidenceDataRequest) GetAccountID() string {
	if o == nil {
		return ""
	}
	return o.AccountID
}

func (o *GetDisputeEvidenceDataRequest) GetDisputeID() string {
	if o == nil {
		return ""
	}
	return o.DisputeID
}

func (o *GetDisputeEvidenceDataRequest) GetEvidenceID() string {
	if o == nil {
		return ""
	}
	return o.EvidenceID
}

type GetDisputeEvidenceDataResponse struct {
	HTTPMeta components.HTTPMetadata `json:"-"`
	// The request has succeeded.
	// The Close method must be called on this field, even if it is not used, to prevent resource leaks.
	TwoHundredApplicationPdfResponseStream io.ReadCloser
	// The request has succeeded.
	// The Close method must be called on this field, even if it is not used, to prevent resource leaks.
	TwoHundredImageJpegResponseStream io.ReadCloser
	// The request has succeeded.
	// The Close method must be called on this field, even if it is not used, to prevent resource leaks.
	TwoHundredImageTiffResponseStream io.ReadCloser
	Headers                           map[string][]string
}

func (o *GetDisputeEvidenceDataResponse) GetHTTPMeta() components.HTTPMetadata {
	if o == nil {
		return components.HTTPMetadata{}
	}
	return o.HTTPMeta
}

func (o *GetDisputeEvidenceDataResponse) GetTwoHundredApplicationPdfResponseStream() io.ReadCloser {
	if o == nil {
		return nil
	}
	return o.TwoHundredApplicationPdfResponseStream
}

func (o *GetDisputeEvidenceDataResponse) GetTwoHundredImageJpegResponseStream() io.ReadCloser {
	if o == nil {
		return nil
	}
	return o.TwoHundredImageJpegResponseStream
}

func (o *GetDisputeEvidenceDataResponse) GetTwoHundredImageTiffResponseStream() io.ReadCloser {
	if o == nil {
		return nil
	}
	return o.TwoHundredImageTiffResponseStream
}

func (o *GetDisputeEvidenceDataResponse) GetHeaders() map[string][]string {
	if o == nil {
		return map[string][]string{}
	}
	return o.Headers
}
