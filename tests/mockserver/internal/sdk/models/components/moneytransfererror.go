// Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

package components

type MoneyTransferError struct {
	PullFromCard *MoneyTransferPullFromCardError `json:"pullFromCard,omitempty"`
	PushToCard   *MoneyTransferPushToCardError   `json:"pushToCard,omitempty"`
}

func (o *MoneyTransferError) GetPullFromCard() *MoneyTransferPullFromCardError {
	if o == nil {
		return nil
	}
	return o.PullFromCard
}

func (o *MoneyTransferError) GetPushToCard() *MoneyTransferPushToCardError {
	if o == nil {
		return nil
	}
	return o.PushToCard
}
