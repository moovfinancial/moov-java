// Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

package components

// RepresentativeResponsibilities - Describes the job responsibilities of a business representative.
type RepresentativeResponsibilities struct {
	// Indicates whether this individual has significant management responsibilities within the business.
	IsController *bool `json:"isController,omitempty"`
	// If `true`, this field indicates that the individual has a business ownership stake of at least 25% in the
	// business. If the representative does not own at least 25% of the business, this field should be `false`.
	IsOwner *bool `json:"isOwner,omitempty"`
	// The percentage of ownership this individual has in the business (required if `isOwner` is `true`).
	OwnershipPercentage *int64  `json:"ownershipPercentage,omitempty"`
	JobTitle            *string `json:"jobTitle,omitempty"`
}

func (o *RepresentativeResponsibilities) GetIsController() *bool {
	if o == nil {
		return nil
	}
	return o.IsController
}

func (o *RepresentativeResponsibilities) GetIsOwner() *bool {
	if o == nil {
		return nil
	}
	return o.IsOwner
}

func (o *RepresentativeResponsibilities) GetOwnershipPercentage() *int64 {
	if o == nil {
		return nil
	}
	return o.OwnershipPercentage
}

func (o *RepresentativeResponsibilities) GetJobTitle() *string {
	if o == nil {
		return nil
	}
	return o.JobTitle
}
