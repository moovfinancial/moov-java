// Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

package components

type CreateFeePlanAgreement struct {
	PlanID string `json:"planID"`
}

func (o *CreateFeePlanAgreement) GetPlanID() string {
	if o == nil {
		return ""
	}
	return o.PlanID
}
