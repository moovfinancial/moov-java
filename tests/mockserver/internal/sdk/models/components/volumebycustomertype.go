// Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

package components

type VolumeByCustomerType struct {
	BusinessToBusinessPercentage int `json:"businessToBusinessPercentage"`
	ConsumerToBusinessPercentage int `json:"consumerToBusinessPercentage"`
}

func (o *VolumeByCustomerType) GetBusinessToBusinessPercentage() int {
	if o == nil {
		return 0
	}
	return o.BusinessToBusinessPercentage
}

func (o *VolumeByCustomerType) GetConsumerToBusinessPercentage() int {
	if o == nil {
		return 0
	}
	return o.ConsumerToBusinessPercentage
}
