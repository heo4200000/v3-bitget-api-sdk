package v3

import (
	"bitget/internal/common"
)

type UtaPositionClient struct {
	BitgetRestClient *common.BitgetRestClient
}

func (p *UtaPositionClient) Init() *UtaPositionClient {
	p.BitgetRestClient = new(common.BitgetRestClient).Init()
	return p
}

// GET /api/v3/position/current-position
func (p *UtaPositionClient) CurrentPosition(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/v3/position/current-position", params)
	return resp, err
}

// GET /api/v3/position/history-position
func (p *UtaPositionClient) HistoryPosition(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/v3/position/history-position", params)
	return resp, err
}

// GET /api/v3/position/adlRank
func (p *UtaPositionClient) AdlRank(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/v3/position/adlRank", params)
	return resp, err
}
