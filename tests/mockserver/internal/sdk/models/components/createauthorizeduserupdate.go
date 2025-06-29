// Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

package components

// CreateAuthorizedUserUpdate - Fields for identifying an authorized individual.
type CreateAuthorizedUserUpdate struct {
	FirstName *string          `json:"firstName,omitempty"`
	LastName  *string          `json:"lastName,omitempty"`
	BirthDate *BirthDateUpdate `json:"birthDate,omitempty"`
}

func (o *CreateAuthorizedUserUpdate) GetFirstName() *string {
	if o == nil {
		return nil
	}
	return o.FirstName
}

func (o *CreateAuthorizedUserUpdate) GetLastName() *string {
	if o == nil {
		return nil
	}
	return o.LastName
}

func (o *CreateAuthorizedUserUpdate) GetBirthDate() *BirthDateUpdate {
	if o == nil {
		return nil
	}
	return o.BirthDate
}
