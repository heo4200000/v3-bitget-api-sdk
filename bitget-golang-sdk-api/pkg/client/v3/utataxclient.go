package v3

import (
	"bitget/internal/common"
)

type UtaTaxClient struct {
	BitgetRestClient *common.BitgetRestClient
}

func (p *UtaTaxClient) Init() *UtaTaxClient {
	p.BitgetRestClient = new(common.BitgetRestClient).Init()
	return p
}

// GET /api/v3/tax/records
func (p *UtaTaxClient) Records(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/v3/tax/records", params)
	return resp, err
}
