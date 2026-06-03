package v3

import (
	"bitget/internal"
	"bitget/internal/common"
)

// UtaCopyClient covers copy trading transfers and trace queries.
// Merged from: CopyTradingTransferController, UtaTraceController
type UtaCopyClient struct {
	BitgetRestClient *common.BitgetRestClient
}

func (p *UtaCopyClient) Init() *UtaCopyClient {
	p.BitgetRestClient = new(common.BitgetRestClient).Init()
	return p
}

// -------- copy futures transfer --------

// GET /api/v3/copy/futures/max-transferable
func (p *UtaCopyClient) MaxTransferable(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/v3/copy/futures/max-transferable", params)
	return resp, err
}

// POST /api/v3/copy/futures/transfer
func (p *UtaCopyClient) Transfer(params map[string]string) (string, error) {
	postBody, jsonErr := internal.ToJson(params)
	if jsonErr != nil {
		return "", jsonErr
	}
	resp, err := p.BitgetRestClient.DoPost("/api/v3/copy/futures/transfer", postBody)
	return resp, err
}

// GET /api/v3/copy/futures/transfer-record
func (p *UtaCopyClient) TransferRecord(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/v3/copy/futures/transfer-record", params)
	return resp, err
}

// -------- trace (follower/trader query) --------

// GET /api/v3/copy/futures/trading-pairs
func (p *UtaCopyClient) FuturesTradingPairs(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/v3/copy/futures/trading-pairs", params)
	return resp, err
}

// GET /api/v3/copy/futures/position-summary
func (p *UtaCopyClient) FuturesPositionSummary(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/v3/copy/futures/position-summary", params)
	return resp, err
}
