package v3

import (
	"bitget/internal"
	"bitget/internal/common"
)

type UtaOtcClient struct {
	BitgetRestClient *common.BitgetRestClient
}

func (p *UtaOtcClient) Init() *UtaOtcClient {
	p.BitgetRestClient = new(common.BitgetRestClient).Init()
	return p
}

// GET /api/v3/p2p/ad-list
func (p *UtaOtcClient) GetAdList(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/v3/p2p/ad-list", params)
	return resp, err
}

// POST /api/v3/p2p/fee-simulate
func (p *UtaOtcClient) FeeSimulate(params map[string]string) (string, error) {
	postBody, jsonErr := internal.ToJson(params)
	if jsonErr != nil {
		return "", jsonErr
	}
	resp, err := p.BitgetRestClient.DoPost("/api/v3/p2p/fee-simulate", postBody)
	return resp, err
}

// GET /api/v3/p2p/ad-limit
func (p *UtaOtcClient) GetAdLimit(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/v3/p2p/ad-limit", params)
	return resp, err
}

// POST /api/v3/p2p/ad-create
func (p *UtaOtcClient) CreateAd(params map[string]string) (string, error) {
	postBody, jsonErr := internal.ToJson(params)
	if jsonErr != nil {
		return "", jsonErr
	}
	resp, err := p.BitgetRestClient.DoPost("/api/v3/p2p/ad-create", postBody)
	return resp, err
}

// POST /api/v3/p2p/ad-update
func (p *UtaOtcClient) UpdateAd(params map[string]string) (string, error) {
	postBody, jsonErr := internal.ToJson(params)
	if jsonErr != nil {
		return "", jsonErr
	}
	resp, err := p.BitgetRestClient.DoPost("/api/v3/p2p/ad-update", postBody)
	return resp, err
}

// POST /api/v3/p2p/ad-operate
func (p *UtaOtcClient) OperateAd(params map[string]string) (string, error) {
	postBody, jsonErr := internal.ToJson(params)
	if jsonErr != nil {
		return "", jsonErr
	}
	resp, err := p.BitgetRestClient.DoPost("/api/v3/p2p/ad-operate", postBody)
	return resp, err
}

// GET /api/v3/p2p/ad-info
func (p *UtaOtcClient) GetAdInfo(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/v3/p2p/ad-info", params)
	return resp, err
}

// GET /api/v3/p2p/my-ads
func (p *UtaOtcClient) GetMyAds(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/v3/p2p/my-ads", params)
	return resp, err
}

// GET /api/v3/p2p/pending-orders
func (p *UtaOtcClient) GetPendingOrders(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/v3/p2p/pending-orders", params)
	return resp, err
}

// GET /api/v3/p2p/all-orders
func (p *UtaOtcClient) GetAllOrders(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/v3/p2p/all-orders", params)
	return resp, err
}

// GET /api/v3/p2p/order-info
func (p *UtaOtcClient) GetOrderInfo(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/v3/p2p/order-info", params)
	return resp, err
}

// POST /api/v3/p2p/order-pay
func (p *UtaOtcClient) OrderPay(params map[string]string) (string, error) {
	postBody, jsonErr := internal.ToJson(params)
	if jsonErr != nil {
		return "", jsonErr
	}
	resp, err := p.BitgetRestClient.DoPost("/api/v3/p2p/order-pay", postBody)
	return resp, err
}

// POST /api/v3/p2p/order-release
func (p *UtaOtcClient) OrderRelease(params map[string]string) (string, error) {
	postBody, jsonErr := internal.ToJson(params)
	if jsonErr != nil {
		return "", jsonErr
	}
	resp, err := p.BitgetRestClient.DoPost("/api/v3/p2p/order-release", postBody)
	return resp, err
}

// GET /api/v3/p2p/user-info
func (p *UtaOtcClient) GetUserInfo(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/v3/p2p/user-info", params)
	return resp, err
}

// GET /api/v3/p2p/currencies
func (p *UtaOtcClient) GetCurrencies(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/v3/p2p/currencies", params)
	return resp, err
}

// GET /api/v3/p2p/pay-method
func (p *UtaOtcClient) GetPayMethod(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/v3/p2p/pay-method", params)
	return resp, err
}

// GET /api/v3/p2p/balance
func (p *UtaOtcClient) GetBalance(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/v3/p2p/balance", params)
	return resp, err
}

// GET /api/v3/p2p/exchange-rate
func (p *UtaOtcClient) GetExchangeRate(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/v3/p2p/exchange-rate", params)
	return resp, err
}
