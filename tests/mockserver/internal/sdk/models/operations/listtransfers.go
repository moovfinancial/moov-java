// Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

package operations

import (
	"mockserver/internal/sdk/models/components"
	"mockserver/internal/sdk/utils"
	"time"
)

type ListTransfersGlobals struct {
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

func (l ListTransfersGlobals) MarshalJSON() ([]byte, error) {
	return utils.MarshalJSON(l, "", false)
}

func (l *ListTransfersGlobals) UnmarshalJSON(data []byte) error {
	if err := utils.UnmarshalJSON(data, &l, "", false, false); err != nil {
		return err
	}
	return nil
}

func (o *ListTransfersGlobals) GetXMoovVersion() *string {
	if o == nil {
		return nil
	}
	return o.XMoovVersion
}

type ListTransfersRequest struct {
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
	// Optional, comma-separated account IDs by which the response is filtered based on whether the account ID is the source or destination.
	AccountIDs []string `queryParam:"style=form,explode=false,name=accountIDs"`
	// Optional parameter for filtering transfers by status.
	Status *components.TransferStatus `queryParam:"style=form,explode=false,name=status"`
	// Optional date-time which inclusively filters all transfers created after this date-time.
	StartDateTime *time.Time `queryParam:"style=form,explode=false,name=startDateTime"`
	// Optional date-time which exclusively filters all transfers created before this date-time.
	EndDateTime *time.Time `queryParam:"style=form,explode=false,name=endDateTime"`
	// Optional ID to filter for transfers in the same group.
	GroupID *string `queryParam:"style=form,explode=false,name=groupID"`
	// Optional ID to filter for transfer occurrences belonging to the same schedule.
	ScheduleID *string `queryParam:"style=form,explode=false,name=scheduleID"`
	// Optional code to filter for transfers associated with the payment link.
	PaymentLinkCode *string `queryParam:"style=form,explode=false,name=paymentLinkCode"`
	// Optional parameter to only return refunded transfers.
	Refunded *bool `queryParam:"style=form,explode=false,name=refunded"`
	// Optional parameter to only return disputed transfers.
	Disputed *bool `queryParam:"style=form,explode=false,name=disputed"`
	// Optional alias from a foreign/external system which can be used to reference this resource.
	ForeignID *string `queryParam:"style=form,explode=false,name=foreignID"`
	Skip      *int64  `queryParam:"style=form,explode=false,name=skip"`
	Count     *int64  `queryParam:"style=form,explode=false,name=count"`
	AccountID string  `pathParam:"style=simple,explode=false,name=accountID"`
}

func (l ListTransfersRequest) MarshalJSON() ([]byte, error) {
	return utils.MarshalJSON(l, "", false)
}

func (l *ListTransfersRequest) UnmarshalJSON(data []byte) error {
	if err := utils.UnmarshalJSON(data, &l, "", false, false); err != nil {
		return err
	}
	return nil
}

func (o *ListTransfersRequest) GetXMoovVersion() *string {
	if o == nil {
		return nil
	}
	return o.XMoovVersion
}

func (o *ListTransfersRequest) GetAccountIDs() []string {
	if o == nil {
		return nil
	}
	return o.AccountIDs
}

func (o *ListTransfersRequest) GetStatus() *components.TransferStatus {
	if o == nil {
		return nil
	}
	return o.Status
}

func (o *ListTransfersRequest) GetStartDateTime() *time.Time {
	if o == nil {
		return nil
	}
	return o.StartDateTime
}

func (o *ListTransfersRequest) GetEndDateTime() *time.Time {
	if o == nil {
		return nil
	}
	return o.EndDateTime
}

func (o *ListTransfersRequest) GetGroupID() *string {
	if o == nil {
		return nil
	}
	return o.GroupID
}

func (o *ListTransfersRequest) GetScheduleID() *string {
	if o == nil {
		return nil
	}
	return o.ScheduleID
}

func (o *ListTransfersRequest) GetPaymentLinkCode() *string {
	if o == nil {
		return nil
	}
	return o.PaymentLinkCode
}

func (o *ListTransfersRequest) GetRefunded() *bool {
	if o == nil {
		return nil
	}
	return o.Refunded
}

func (o *ListTransfersRequest) GetDisputed() *bool {
	if o == nil {
		return nil
	}
	return o.Disputed
}

func (o *ListTransfersRequest) GetForeignID() *string {
	if o == nil {
		return nil
	}
	return o.ForeignID
}

func (o *ListTransfersRequest) GetSkip() *int64 {
	if o == nil {
		return nil
	}
	return o.Skip
}

func (o *ListTransfersRequest) GetCount() *int64 {
	if o == nil {
		return nil
	}
	return o.Count
}

func (o *ListTransfersRequest) GetAccountID() string {
	if o == nil {
		return ""
	}
	return o.AccountID
}

type ListTransfersResponse struct {
	HTTPMeta components.HTTPMetadata `json:"-"`
	// The request completed successfully.
	Transfers []components.Transfer
	Headers   map[string][]string
}

func (o *ListTransfersResponse) GetHTTPMeta() components.HTTPMetadata {
	if o == nil {
		return components.HTTPMetadata{}
	}
	return o.HTTPMeta
}

func (o *ListTransfersResponse) GetTransfers() []components.Transfer {
	if o == nil {
		return nil
	}
	return o.Transfers
}

func (o *ListTransfersResponse) GetHeaders() map[string][]string {
	if o == nil {
		return map[string][]string{}
	}
	return o.Headers
}
