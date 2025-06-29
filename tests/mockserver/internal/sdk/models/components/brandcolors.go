// Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

package components

// BrandColors - Brand colors for light and dark modes.
type BrandColors struct {
	Dark  BrandColor `json:"dark"`
	Light BrandColor `json:"light"`
}

func (o *BrandColors) GetDark() BrandColor {
	if o == nil {
		return BrandColor{}
	}
	return o.Dark
}

func (o *BrandColors) GetLight() BrandColor {
	if o == nil {
		return BrandColor{}
	}
	return o.Light
}
