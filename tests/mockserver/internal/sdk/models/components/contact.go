// Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

package components

type Contact struct {
	Phone *PhoneNumber `json:"phone,omitempty"`
}

func (o *Contact) GetPhone() *PhoneNumber {
	if o == nil {
		return nil
	}
	return o.Phone
}
