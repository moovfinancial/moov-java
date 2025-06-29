// Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

package components

type FulfillmentDetailsError struct {
	ShipmentDurationDays *string `json:"shipmentDurationDays,omitempty"`
	ReturnPolicy         *string `json:"returnPolicy,omitempty"`
}

func (o *FulfillmentDetailsError) GetShipmentDurationDays() *string {
	if o == nil {
		return nil
	}
	return o.ShipmentDurationDays
}

func (o *FulfillmentDetailsError) GetReturnPolicy() *string {
	if o == nil {
		return nil
	}
	return o.ReturnPolicy
}
