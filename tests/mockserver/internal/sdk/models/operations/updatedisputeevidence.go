// Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

package operations

import (
	"mockserver/internal/sdk/models/components"
	"mockserver/internal/sdk/utils"
)

type UpdateDisputeEvidenceGlobals struct {
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

func (u UpdateDisputeEvidenceGlobals) MarshalJSON() ([]byte, error) {
	return utils.MarshalJSON(u, "", false)
}

func (u *UpdateDisputeEvidenceGlobals) UnmarshalJSON(data []byte) error {
	if err := utils.UnmarshalJSON(data, &u, "", false, false); err != nil {
		return err
	}
	return nil
}

func (o *UpdateDisputeEvidenceGlobals) GetXMoovVersion() *string {
	if o == nil {
		return nil
	}
	return o.XMoovVersion
}

type UpdateDisputeEvidenceRequest struct {
	// Specify an API version.
	//
	// API versioning follows the format `vYYYY.QQ.BB`, where
	//   - `YYYY` is the year
	//   - `QQ` is the two-digit month for the first month of the quarter (e.g., 01, 04, 07, 10)
	//   - `BB` is the build number, starting at `.01`, for subsequent builds in the same quarter.
	//     - For example, `v2024.01.00` is the initial release of the first quarter of 2024.
	//
	// The `latest` version represents the most recent development state. It may include breaking changes and should be treated as a beta release.
	XMoovVersion   *string                   `default:"v2024.01.00" header:"style=simple,explode=false,name=x-moov-version"`
	AccountID      string                    `pathParam:"style=simple,explode=false,name=accountID"`
	DisputeID      string                    `pathParam:"style=simple,explode=false,name=disputeID"`
	EvidenceID     string                    `pathParam:"style=simple,explode=false,name=evidenceID"`
	UpdateEvidence components.UpdateEvidence `request:"mediaType=application/json"`
}

func (u UpdateDisputeEvidenceRequest) MarshalJSON() ([]byte, error) {
	return utils.MarshalJSON(u, "", false)
}

func (u *UpdateDisputeEvidenceRequest) UnmarshalJSON(data []byte) error {
	if err := utils.UnmarshalJSON(data, &u, "", false, false); err != nil {
		return err
	}
	return nil
}

func (o *UpdateDisputeEvidenceRequest) GetXMoovVersion() *string {
	if o == nil {
		return nil
	}
	return o.XMoovVersion
}

func (o *UpdateDisputeEvidenceRequest) GetAccountID() string {
	if o == nil {
		return ""
	}
	return o.AccountID
}

func (o *UpdateDisputeEvidenceRequest) GetDisputeID() string {
	if o == nil {
		return ""
	}
	return o.DisputeID
}

func (o *UpdateDisputeEvidenceRequest) GetEvidenceID() string {
	if o == nil {
		return ""
	}
	return o.EvidenceID
}

func (o *UpdateDisputeEvidenceRequest) GetUpdateEvidence() components.UpdateEvidence {
	if o == nil {
		return components.UpdateEvidence{}
	}
	return o.UpdateEvidence
}

type UpdateDisputeEvidenceResponse struct {
	HTTPMeta components.HTTPMetadata `json:"-"`
	// The request completed successfully.
	DisputeEvidenceResponse *components.DisputeEvidenceResponse
	Headers                 map[string][]string
}

func (o *UpdateDisputeEvidenceResponse) GetHTTPMeta() components.HTTPMetadata {
	if o == nil {
		return components.HTTPMetadata{}
	}
	return o.HTTPMeta
}

func (o *UpdateDisputeEvidenceResponse) GetDisputeEvidenceResponse() *components.DisputeEvidenceResponse {
	if o == nil {
		return nil
	}
	return o.DisputeEvidenceResponse
}

func (o *UpdateDisputeEvidenceResponse) GetHeaders() map[string][]string {
	if o == nil {
		return map[string][]string{}
	}
	return o.Headers
}
