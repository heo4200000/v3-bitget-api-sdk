package v3

import (
	"bitget/internal/common"
)

type UtaRwaClient struct {
	BitgetRestClient *common.BitgetRestClient
}

func (p *UtaRwaClient) Init() *UtaRwaClient {
	p.BitgetRestClient = new(common.BitgetRestClient).Init()
	return p
}

// GET /api/v3/corporate-action/claim-info
func (p *UtaRwaClient) ClaimInfo(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/v3/corporate-action/claim-info", params)
	return resp, err
}
