// Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

package components

type CreateTransferDestinationACH struct {
	// An optional override of the default NACHA company entry description for a transfer.
	CompanyEntryDescription *string `json:"companyEntryDescription,omitempty"`
	// An optional override of the default NACHA company name for a transfer.
	OriginatingCompanyName *string `json:"originatingCompanyName,omitempty"`
}

func (o *CreateTransferDestinationACH) GetCompanyEntryDescription() *string {
	if o == nil {
		return nil
	}
	return o.CompanyEntryDescription
}

func (o *CreateTransferDestinationACH) GetOriginatingCompanyName() *string {
	if o == nil {
		return nil
	}
	return o.OriginatingCompanyName
}
