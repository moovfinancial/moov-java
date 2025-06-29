// Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

package components

type BrandColor struct {
	// A CSS hex color representing an accent color.
	Accent string `json:"accent"`
}

func (o *BrandColor) GetAccent() string {
	if o == nil {
		return ""
	}
	return o.Accent
}
