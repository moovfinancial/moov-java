// Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

package components

// Verification - Describes identity verification status and relevant identity verification documents.
type Verification struct {
	// Possible states an account verification can be in.
	//
	// Deprecated: This will be removed in a future release, please migrate away from it as soon as possible.
	VerificationStatus *AccountVerificationStatus `json:"verificationStatus,omitempty"`
	// Possible states an account verification can be in.
	//
	// Deprecated: This will be removed in a future release, please migrate away from it as soon as possible.
	Status VerificationStatus `json:"status"`
	// Additional detail for a verification status.
	//
	// Deprecated: This will be removed in a future release, please migrate away from it as soon as possible.
	Details   *VerificationStatusDetail `json:"details,omitempty"`
	Documents []Document                `json:"documents,omitempty"`
}

func (o *Verification) GetVerificationStatus() *AccountVerificationStatus {
	if o == nil {
		return nil
	}
	return o.VerificationStatus
}

func (o *Verification) GetStatus() VerificationStatus {
	if o == nil {
		return VerificationStatus("")
	}
	return o.Status
}

func (o *Verification) GetDetails() *VerificationStatusDetail {
	if o == nil {
		return nil
	}
	return o.Details
}

func (o *Verification) GetDocuments() []Document {
	if o == nil {
		return nil
	}
	return o.Documents
}
