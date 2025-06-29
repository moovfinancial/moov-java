// Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

package components

type UpsertUnderwriting struct {
	GeographicReach           *GeographicReach           `json:"geographicReach,omitempty"`
	BusinessPresence          *BusinessPresence          `json:"businessPresence,omitempty"`
	PendingLitigation         *PendingLitigation         `json:"pendingLitigation,omitempty"`
	VolumeShareByCustomerType *VolumeShareByCustomerType `json:"volumeShareByCustomerType,omitempty"`
	CollectFunds              *CollectFunds              `json:"collectFunds,omitempty"`
	MoneyTransfer             *MoneyTransfer             `json:"moneyTransfer,omitempty"`
	SendFunds                 *SendFunds                 `json:"sendFunds,omitempty"`
}

func (o *UpsertUnderwriting) GetGeographicReach() *GeographicReach {
	if o == nil {
		return nil
	}
	return o.GeographicReach
}

func (o *UpsertUnderwriting) GetBusinessPresence() *BusinessPresence {
	if o == nil {
		return nil
	}
	return o.BusinessPresence
}

func (o *UpsertUnderwriting) GetPendingLitigation() *PendingLitigation {
	if o == nil {
		return nil
	}
	return o.PendingLitigation
}

func (o *UpsertUnderwriting) GetVolumeShareByCustomerType() *VolumeShareByCustomerType {
	if o == nil {
		return nil
	}
	return o.VolumeShareByCustomerType
}

func (o *UpsertUnderwriting) GetCollectFunds() *CollectFunds {
	if o == nil {
		return nil
	}
	return o.CollectFunds
}

func (o *UpsertUnderwriting) GetMoneyTransfer() *MoneyTransfer {
	if o == nil {
		return nil
	}
	return o.MoneyTransfer
}

func (o *UpsertUnderwriting) GetSendFunds() *SendFunds {
	if o == nil {
		return nil
	}
	return o.SendFunds
}
