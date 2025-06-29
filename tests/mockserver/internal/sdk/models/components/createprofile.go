// Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

package components

type CreateProfile struct {
	Individual *CreateIndividualProfile `json:"individual,omitempty"`
	Business   *CreateBusinessProfile   `json:"business,omitempty"`
}

func (o *CreateProfile) GetIndividual() *CreateIndividualProfile {
	if o == nil {
		return nil
	}
	return o.Individual
}

func (o *CreateProfile) GetBusiness() *CreateBusinessProfile {
	if o == nil {
		return nil
	}
	return o.Business
}
