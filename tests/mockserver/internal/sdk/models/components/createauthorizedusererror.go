// Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

package components

type CreateAuthorizedUserError struct {
	FirstName *string         `json:"firstName,omitempty"`
	LastName  *string         `json:"lastName,omitempty"`
	BirthDate *BirthDateError `json:"birthDate,omitempty"`
}

func (o *CreateAuthorizedUserError) GetFirstName() *string {
	if o == nil {
		return nil
	}
	return o.FirstName
}

func (o *CreateAuthorizedUserError) GetLastName() *string {
	if o == nil {
		return nil
	}
	return o.LastName
}

func (o *CreateAuthorizedUserError) GetBirthDate() *BirthDateError {
	if o == nil {
		return nil
	}
	return o.BirthDate
}
