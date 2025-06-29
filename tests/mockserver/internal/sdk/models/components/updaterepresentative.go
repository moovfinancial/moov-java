// Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

package components

import (
	"errors"
	"fmt"
	"mockserver/internal/sdk/utils"
)

type Phone struct {
	Number      *string `json:"number,omitempty"`
	CountryCode *string `json:"countryCode,omitempty"`
}

func (o *Phone) GetNumber() *string {
	if o == nil {
		return nil
	}
	return o.Number
}

func (o *Phone) GetCountryCode() *string {
	if o == nil {
		return nil
	}
	return o.CountryCode
}

type Email struct {
}

type EmailUnionType string

const (
	EmailUnionTypeStr   EmailUnionType = "str"
	EmailUnionTypeEmail EmailUnionType = "email"
)

type EmailUnion struct {
	Str   *string `queryParam:"inline"`
	Email *Email  `queryParam:"inline"`

	Type EmailUnionType
}

func CreateEmailUnionStr(str string) EmailUnion {
	typ := EmailUnionTypeStr

	return EmailUnion{
		Str:  &str,
		Type: typ,
	}
}

func CreateEmailUnionEmail(email Email) EmailUnion {
	typ := EmailUnionTypeEmail

	return EmailUnion{
		Email: &email,
		Type:  typ,
	}
}

func (u *EmailUnion) UnmarshalJSON(data []byte) error {

	var email Email = Email{}
	if err := utils.UnmarshalJSON(data, &email, "", true, true); err == nil {
		u.Email = &email
		u.Type = EmailUnionTypeEmail
		return nil
	}

	var str string = ""
	if err := utils.UnmarshalJSON(data, &str, "", true, true); err == nil {
		u.Str = &str
		u.Type = EmailUnionTypeStr
		return nil
	}

	return fmt.Errorf("could not unmarshal `%s` into any supported union types for EmailUnion", string(data))
}

func (u EmailUnion) MarshalJSON() ([]byte, error) {
	if u.Str != nil {
		return utils.MarshalJSON(u.Str, "", true)
	}

	if u.Email != nil {
		return utils.MarshalJSON(u.Email, "", true)
	}

	return nil, errors.New("could not marshal union type EmailUnion: all fields are null")
}

type UpdateRepresentativeAddress struct {
	AddressLine1    *string `json:"addressLine1,omitempty"`
	AddressLine2    *string `json:"addressLine2,omitempty"`
	City            *string `json:"city,omitempty"`
	StateOrProvince *string `json:"stateOrProvince,omitempty"`
	PostalCode      *string `json:"postalCode,omitempty"`
	Country         *string `json:"country,omitempty"`
}

func (o *UpdateRepresentativeAddress) GetAddressLine1() *string {
	if o == nil {
		return nil
	}
	return o.AddressLine1
}

func (o *UpdateRepresentativeAddress) GetAddressLine2() *string {
	if o == nil {
		return nil
	}
	return o.AddressLine2
}

func (o *UpdateRepresentativeAddress) GetCity() *string {
	if o == nil {
		return nil
	}
	return o.City
}

func (o *UpdateRepresentativeAddress) GetStateOrProvince() *string {
	if o == nil {
		return nil
	}
	return o.StateOrProvince
}

func (o *UpdateRepresentativeAddress) GetPostalCode() *string {
	if o == nil {
		return nil
	}
	return o.PostalCode
}

func (o *UpdateRepresentativeAddress) GetCountry() *string {
	if o == nil {
		return nil
	}
	return o.Country
}

type UpdateRepresentativeBirthDate struct {
	Day   *int64 `json:"day,omitempty"`
	Month *int64 `json:"month,omitempty"`
	Year  *int64 `json:"year,omitempty"`
}

func (o *UpdateRepresentativeBirthDate) GetDay() *int64 {
	if o == nil {
		return nil
	}
	return o.Day
}

func (o *UpdateRepresentativeBirthDate) GetMonth() *int64 {
	if o == nil {
		return nil
	}
	return o.Month
}

func (o *UpdateRepresentativeBirthDate) GetYear() *int64 {
	if o == nil {
		return nil
	}
	return o.Year
}

type UpdateRepresentativeSsn struct {
	Full     *string `json:"full,omitempty"`
	LastFour *string `json:"lastFour,omitempty"`
}

func (o *UpdateRepresentativeSsn) GetFull() *string {
	if o == nil {
		return nil
	}
	return o.Full
}

func (o *UpdateRepresentativeSsn) GetLastFour() *string {
	if o == nil {
		return nil
	}
	return o.LastFour
}

type UpdateRepresentativeItin struct {
	Full     *string `json:"full,omitempty"`
	LastFour *string `json:"lastFour,omitempty"`
}

func (o *UpdateRepresentativeItin) GetFull() *string {
	if o == nil {
		return nil
	}
	return o.Full
}

func (o *UpdateRepresentativeItin) GetLastFour() *string {
	if o == nil {
		return nil
	}
	return o.LastFour
}

type UpdateRepresentativeGovernmentID struct {
	Ssn  *UpdateRepresentativeSsn  `json:"ssn,omitempty"`
	Itin *UpdateRepresentativeItin `json:"itin,omitempty"`
}

func (o *UpdateRepresentativeGovernmentID) GetSsn() *UpdateRepresentativeSsn {
	if o == nil {
		return nil
	}
	return o.Ssn
}

func (o *UpdateRepresentativeGovernmentID) GetItin() *UpdateRepresentativeItin {
	if o == nil {
		return nil
	}
	return o.Itin
}

// Responsibilities - Describes the job responsibilities of a business representative.
type Responsibilities struct {
	// Indicates whether this individual has significant management responsibilities within the business.
	IsController *bool `json:"isController,omitempty"`
	// If `true`, this field indicates that the individual has a business ownership stake of at least 25% in the
	// business. If the representative does not own at least 25% of the business, this field should be `false`.
	IsOwner *bool `json:"isOwner,omitempty"`
	// The percentage of ownership this individual has in the business (required if `isOwner` is `true`).
	OwnershipPercentage *int64  `json:"ownershipPercentage,omitempty"`
	JobTitle            *string `json:"jobTitle,omitempty"`
}

func (o *Responsibilities) GetIsController() *bool {
	if o == nil {
		return nil
	}
	return o.IsController
}

func (o *Responsibilities) GetIsOwner() *bool {
	if o == nil {
		return nil
	}
	return o.IsOwner
}

func (o *Responsibilities) GetOwnershipPercentage() *int64 {
	if o == nil {
		return nil
	}
	return o.OwnershipPercentage
}

func (o *Responsibilities) GetJobTitle() *string {
	if o == nil {
		return nil
	}
	return o.JobTitle
}

type UpdateRepresentative struct {
	Name             *IndividualNameUpdate             `json:"name,omitempty"`
	Phone            *Phone                            `json:"phone,omitempty"`
	Email            *EmailUnion                       `json:"email,omitempty"`
	Address          *UpdateRepresentativeAddress      `json:"address,omitempty"`
	BirthDate        *UpdateRepresentativeBirthDate    `json:"birthDate,omitempty"`
	GovernmentID     *UpdateRepresentativeGovernmentID `json:"governmentID,omitempty"`
	Responsibilities *Responsibilities                 `json:"responsibilities,omitempty"`
}

func (o *UpdateRepresentative) GetName() *IndividualNameUpdate {
	if o == nil {
		return nil
	}
	return o.Name
}

func (o *UpdateRepresentative) GetPhone() *Phone {
	if o == nil {
		return nil
	}
	return o.Phone
}

func (o *UpdateRepresentative) GetEmail() *EmailUnion {
	if o == nil {
		return nil
	}
	return o.Email
}

func (o *UpdateRepresentative) GetAddress() *UpdateRepresentativeAddress {
	if o == nil {
		return nil
	}
	return o.Address
}

func (o *UpdateRepresentative) GetBirthDate() *UpdateRepresentativeBirthDate {
	if o == nil {
		return nil
	}
	return o.BirthDate
}

func (o *UpdateRepresentative) GetGovernmentID() *UpdateRepresentativeGovernmentID {
	if o == nil {
		return nil
	}
	return o.GovernmentID
}

func (o *UpdateRepresentative) GetResponsibilities() *Responsibilities {
	if o == nil {
		return nil
	}
	return o.Responsibilities
}
