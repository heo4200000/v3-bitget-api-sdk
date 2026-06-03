package v3

import (
	"bitget/internal"
	"bitget/internal/common"
)

type UtaEarnClient struct {
	BitgetRestClient *common.BitgetRestClient
}

func (p *UtaEarnClient) Init() *UtaEarnClient {
	p.BitgetRestClient = new(common.BitgetRestClient).Init()
	return p
}

// GET /api/v3/earn/elite-product
func (p *UtaEarnClient) GetEliteProductList(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/v3/earn/elite-product", params)
	return resp, err
}

// GET /api/v3/earn/elite-assets
func (p *UtaEarnClient) GetEliteAssets(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/v3/earn/elite-assets", params)
	return resp, err
}

// GET /api/v3/earn/elite-records
func (p *UtaEarnClient) GetEliteRecords(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/v3/earn/elite-records", params)
	return resp, err
}

// GET /api/v3/earn/elite-subscribe-info
func (p *UtaEarnClient) GetEliteSubscribeInfo(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/v3/earn/elite-subscribe-info", params)
	return resp, err
}

// POST /api/v3/earn/elite-subscribe
func (p *UtaEarnClient) EliteSubscribe(params map[string]string) (string, error) {
	postBody, jsonErr := internal.ToJson(params)
	if jsonErr != nil {
		return "", jsonErr
	}
	resp, err := p.BitgetRestClient.DoPost("/api/v3/earn/elite-subscribe", postBody)
	return resp, err
}

// GET /api/v3/earn/elite-subscribe-result
func (p *UtaEarnClient) GetEliteSubscribeResult(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/v3/earn/elite-subscribe-result", params)
	return resp, err
}

// GET /api/v3/earn/elite-redeem-info
func (p *UtaEarnClient) GetEliteRedeemInfo(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/v3/earn/elite-redeem-info", params)
	return resp, err
}

// POST /api/v3/earn/elite-redeem
func (p *UtaEarnClient) EliteRedeem(params map[string]string) (string, error) {
	postBody, jsonErr := internal.ToJson(params)
	if jsonErr != nil {
		return "", jsonErr
	}
	resp, err := p.BitgetRestClient.DoPost("/api/v3/earn/elite-redeem", postBody)
	return resp, err
}
