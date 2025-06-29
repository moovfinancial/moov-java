// Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

package components

// LinkAccountTerminalApplication - Describes a request to link an account with a terminal application.
type LinkAccountTerminalApplication struct {
	// ID of the terminal application.
	TerminalApplicationID string `json:"terminalApplicationID"`
}

func (o *LinkAccountTerminalApplication) GetTerminalApplicationID() string {
	if o == nil {
		return ""
	}
	return o.TerminalApplicationID
}
