// Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

package components

// BankAccountException - Reason for, and details related to, an `errored` or `verificationFailed` bank account status.
type BankAccountException struct {
	// The return code of an ACH transaction that caused the bank account status to change.
	//
	// - R02: Account Closed
	// - R03: No Account/Unable to Locate Account
	// - R04: Invalid Account Number
	// - R05: Improper Debit to Consumer Account
	// - R07: Authorization Revoked by Customer
	// - R08: Payment Stopped
	// - R10: Customer Advises Originator is Not Known or Authorized to Receiver
	// - R11: Customer Advises Entry Not in Accordance with the Terms of the Authorization
	// - R12: Branch Sold to Another DFI
	// - R13: RDFI not qualified to participate
	// - R14: Representative payee deceased or unable to continue in that capacity
	// - R15: Beneficiary or bank account holder
	// - R16: Bank account frozen
	// - R17: Entry with Invalid Account Number Initiated Under Questionable Circumstances
	// - R20: Non-payment bank account
	// - R23: Credit entry refused by receiver
	// - R29: Corporate customer advises not authorized
	// - R34: Limited participation RDFI
	// - R38: Stop Payment on Source Document (Adjustment Entry)
	// - R39: Improper Source Document
	AchReturnCode *ACHReturnCode `json:"achReturnCode,omitempty"`
	// The rejection code of an RTP transaction that caused the bank account status to change.
	//
	// - AC03: Account Invalid
	// - AC04: Account Closed
	// - AC06: Account Blocked
	// - AC14: Creditor Account Type Invalid
	// - AG01: Transactions Forbidden On Account
	// - AG03: Transaction Type Not Supported
	// - MD07: Customer Deceased
	RtpRejectionCode *RTPRejectionCode `json:"rtpRejectionCode,omitempty"`
	// Details related to an `errored` or `verificationFailed` bank account status.
	Description string `json:"description"`
}

func (o *BankAccountException) GetAchReturnCode() *ACHReturnCode {
	if o == nil {
		return nil
	}
	return o.AchReturnCode
}

func (o *BankAccountException) GetRtpRejectionCode() *RTPRejectionCode {
	if o == nil {
		return nil
	}
	return o.RtpRejectionCode
}

func (o *BankAccountException) GetDescription() string {
	if o == nil {
		return ""
	}
	return o.Description
}
