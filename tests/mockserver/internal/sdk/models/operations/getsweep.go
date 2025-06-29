// Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

package operations

import (
	"mockserver/internal/sdk/models/components"
	"mockserver/internal/sdk/utils"
)

type GetSweepGlobals struct {
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

func (g GetSweepGlobals) MarshalJSON() ([]byte, error) {
	return utils.MarshalJSON(g, "", false)
}

func (g *GetSweepGlobals) UnmarshalJSON(data []byte) error {
	if err := utils.UnmarshalJSON(data, &g, "", false, false); err != nil {
		return err
	}
	return nil
}

func (o *GetSweepGlobals) GetXMoovVersion() *string {
	if o == nil {
		return nil
	}
	return o.XMoovVersion
}

type GetSweepRequest struct {
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
	WalletID     string  `pathParam:"style=simple,explode=false,name=walletID"`
	SweepID      string  `pathParam:"style=simple,explode=false,name=sweepID"`
}

func (g GetSweepRequest) MarshalJSON() ([]byte, error) {
	return utils.MarshalJSON(g, "", false)
}

func (g *GetSweepRequest) UnmarshalJSON(data []byte) error {
	if err := utils.UnmarshalJSON(data, &g, "", false, false); err != nil {
		return err
	}
	return nil
}

func (o *GetSweepRequest) GetXMoovVersion() *string {
	if o == nil {
		return nil
	}
	return o.XMoovVersion
}

func (o *GetSweepRequest) GetAccountID() string {
	if o == nil {
		return ""
	}
	return o.AccountID
}

func (o *GetSweepRequest) GetWalletID() string {
	if o == nil {
		return ""
	}
	return o.WalletID
}

func (o *GetSweepRequest) GetSweepID() string {
	if o == nil {
		return ""
	}
	return o.SweepID
}

type GetSweepResponse struct {
	HTTPMeta components.HTTPMetadata `json:"-"`
	// The request completed successfully.
	Sweep   *components.Sweep
	Headers map[string][]string
}

func (o *GetSweepResponse) GetHTTPMeta() components.HTTPMetadata {
	if o == nil {
		return components.HTTPMetadata{}
	}
	return o.HTTPMeta
}

func (o *GetSweepResponse) GetSweep() *components.Sweep {
	if o == nil {
		return nil
	}
	return o.Sweep
}

func (o *GetSweepResponse) GetHeaders() map[string][]string {
	if o == nil {
		return map[string][]string{}
	}
	return o.Headers
}
