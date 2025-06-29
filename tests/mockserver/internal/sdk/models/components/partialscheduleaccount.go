// Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

package components

type PartialScheduleAccount struct {
	AccountID   string  `json:"accountID"`
	DisplayName string  `json:"displayName"`
	Email       *string `json:"email,omitempty"`
}

func (o *PartialScheduleAccount) GetAccountID() string {
	if o == nil {
		return ""
	}
	return o.AccountID
}

func (o *PartialScheduleAccount) GetDisplayName() string {
	if o == nil {
		return ""
	}
	return o.DisplayName
}

func (o *PartialScheduleAccount) GetEmail() *string {
	if o == nil {
		return nil
	}
	return o.Email
}
