// Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

package components

type Logo struct {
	Name string `json:"name"`
	URL  string `json:"url"`
}

func (o *Logo) GetName() string {
	if o == nil {
		return ""
	}
	return o.Name
}

func (o *Logo) GetURL() string {
	if o == nil {
		return ""
	}
	return o.URL
}

type AchParticipant struct {
	AchLocation        AchLocation `json:"achLocation"`
	CustomerName       string      `json:"customerName"`
	NewRoutingNumber   string      `json:"newRoutingNumber"`
	OfficeCode         string      `json:"officeCode"`
	PhoneNumber        string      `json:"phoneNumber"`
	RecordTypeCode     string      `json:"recordTypeCode"`
	Revised            string      `json:"revised"`
	RoutingNumber      string      `json:"routingNumber"`
	ServicingFRBNumber string      `json:"servicingFRBNumber"`
	StatusCode         string      `json:"statusCode"`
	ViewCode           string      `json:"viewCode"`
	CleanName          string      `json:"cleanName"`
	Logo               *Logo       `json:"logo"`
}

func (o *AchParticipant) GetAchLocation() AchLocation {
	if o == nil {
		return AchLocation{}
	}
	return o.AchLocation
}

func (o *AchParticipant) GetCustomerName() string {
	if o == nil {
		return ""
	}
	return o.CustomerName
}

func (o *AchParticipant) GetNewRoutingNumber() string {
	if o == nil {
		return ""
	}
	return o.NewRoutingNumber
}

func (o *AchParticipant) GetOfficeCode() string {
	if o == nil {
		return ""
	}
	return o.OfficeCode
}

func (o *AchParticipant) GetPhoneNumber() string {
	if o == nil {
		return ""
	}
	return o.PhoneNumber
}

func (o *AchParticipant) GetRecordTypeCode() string {
	if o == nil {
		return ""
	}
	return o.RecordTypeCode
}

func (o *AchParticipant) GetRevised() string {
	if o == nil {
		return ""
	}
	return o.Revised
}

func (o *AchParticipant) GetRoutingNumber() string {
	if o == nil {
		return ""
	}
	return o.RoutingNumber
}

func (o *AchParticipant) GetServicingFRBNumber() string {
	if o == nil {
		return ""
	}
	return o.ServicingFRBNumber
}

func (o *AchParticipant) GetStatusCode() string {
	if o == nil {
		return ""
	}
	return o.StatusCode
}

func (o *AchParticipant) GetViewCode() string {
	if o == nil {
		return ""
	}
	return o.ViewCode
}

func (o *AchParticipant) GetCleanName() string {
	if o == nil {
		return ""
	}
	return o.CleanName
}

func (o *AchParticipant) GetLogo() *Logo {
	if o == nil {
		return nil
	}
	return o.Logo
}
