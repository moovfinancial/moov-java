// Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

package components

type SendFundsRtpError struct {
	EstimatedActivity *EstimatedActivityError `json:"estimatedActivity,omitempty"`
}

func (o *SendFundsRtpError) GetEstimatedActivity() *EstimatedActivityError {
	if o == nil {
		return nil
	}
	return o.EstimatedActivity
}
