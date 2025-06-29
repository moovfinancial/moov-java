// Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

package components

// Profile - Describes a Moov account profile. A profile will have a business or an individual, depending on the account's type.
type Profile struct {
	// Describes an individual.
	Individual *IndividualProfile `json:"individual,omitempty"`
	// Describes a business.
	Business *BusinessProfile `json:"business,omitempty"`
	// Describes a guest account profile.
	Guest *GuestProfile `json:"guest,omitempty"`
}

func (o *Profile) GetIndividual() *IndividualProfile {
	if o == nil {
		return nil
	}
	return o.Individual
}

func (o *Profile) GetBusiness() *BusinessProfile {
	if o == nil {
		return nil
	}
	return o.Business
}

func (o *Profile) GetGuest() *GuestProfile {
	if o == nil {
		return nil
	}
	return o.Guest
}
