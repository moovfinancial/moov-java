// Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

package sdkerrors

import (
	"encoding/json"
	"mockserver/internal/sdk/models/components"
	"time"
)

// TransferError - Details of a Transfer.
type TransferError struct {
	TransferID  string                         `json:"transferID"`
	CreatedOn   time.Time                      `json:"createdOn"`
	Source      components.TransferSource      `json:"source"`
	Destination components.TransferDestination `json:"destination"`
	CompletedOn *time.Time                     `json:"completedOn,omitempty"`
	// Status of a transfer.
	Status components.TransferStatus `json:"status"`
	// Reason for a transfer's failure.
	FailureReason *components.TransferFailureReason `json:"failureReason,omitempty"`
	Amount        components.Amount                 `json:"amount"`
	// An optional description of the transfer that is used on receipts and for your own internal use.
	Description *string `json:"description,omitempty"`
	// Free-form key-value pair list. Useful for storing information that is not captured elsewhere.
	Metadata map[string]string `json:"metadata,omitempty"`
	// Total or markup fee.
	FacilitatorFee *components.FacilitatorFee `json:"facilitatorFee,omitempty"`
	// Fees charged to your platform account for transfers.
	MoovFee *int64 `json:"moovFee,omitempty"`
	// Same as `moovFee`, but a decimal-formatted numerical string that represents up to 9 decimal place precision.
	MoovFeeDecimal *string `json:"moovFeeDecimal,omitempty"`
	// Processing and pass-through costs that add up to the moovFee.
	MoovFeeDetails *components.MoovFeeDetails `json:"moovFeeDetails,omitempty"`
	// Fees charged to accounts involved in the transfer.
	MoovFees        []components.MoovFee              `json:"moovFees,omitempty"`
	GroupID         *string                           `json:"groupID,omitempty"`
	Cancellations   []components.Cancellation         `json:"cancellations,omitempty"`
	RefundedAmount  *components.Amount                `json:"refundedAmount,omitempty"`
	Refunds         []components.CardAcquiringRefund  `json:"refunds,omitempty"`
	DisputedAmount  *components.Amount                `json:"disputedAmount,omitempty"`
	Disputes        []components.CardAcquiringDispute `json:"disputes,omitempty"`
	SweepID         *string                           `json:"sweepID,omitempty"`
	ScheduleID      *string                           `json:"scheduleID,omitempty"`
	OccurrenceID    *string                           `json:"occurrenceID,omitempty"`
	PaymentLinkCode *string                           `json:"paymentLinkCode,omitempty"`
	// Optional sales tax amount. `transfer.amount.value` should be inclusive of any sales tax and represents the total amount charged.
	SalesTaxAmount *components.Amount `json:"salesTaxAmount,omitempty"`
	// Optional alias from a foreign/external system which can be used to reference this resource.
	ForeignID *string                 `json:"foreignID,omitempty"`
	HTTPMeta  components.HTTPMetadata `json:"-"`
}

var _ error = &TransferError{}

func (e *TransferError) Error() string {
	data, _ := json.Marshal(e)
	return string(data)
}
