package v3

import (
	"bitget/internal"
	"bitget/internal/common"
)

type UtaInsLoanClient struct {
	BitgetRestClient *common.BitgetRestClient
}

func (p *UtaInsLoanClient) Init() *UtaInsLoanClient {
	p.BitgetRestClient = new(common.BitgetRestClient).Init()
	return p
}

// GET /api/v3/ins-loan/product-infos
func (p *UtaInsLoanClient) ProductInfo(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/v3/ins-loan/product-infos", params)
	return resp, err
}

// GET /api/v3/ins-loan/ensure-coins-convert
func (p *UtaInsLoanClient) EnsureCoinsConvert(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/v3/ins-loan/ensure-coins-convert", params)
	return resp, err
}

// GET /api/v3/ins-loan/symbols
func (p *UtaInsLoanClient) Symbols(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/v3/ins-loan/symbols", params)
	return resp, err
}

// GET /api/v3/ins-loan/loan-order
func (p *UtaInsLoanClient) LoanOrder(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/v3/ins-loan/loan-order", params)
	return resp, err
}

// GET /api/v3/ins-loan/repaid-history
func (p *UtaInsLoanClient) RepayHistory(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/v3/ins-loan/repaid-history", params)
	return resp, err
}

// GET /api/v3/ins-loan/ltv-convert
func (p *UtaInsLoanClient) LtvConvert(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/v3/ins-loan/ltv-convert", params)
	return resp, err
}

// GET /api/v3/ins-loan/transfered
func (p *UtaInsLoanClient) TransferAsset(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/v3/ins-loan/transfered", params)
	return resp, err
}

// GET /api/v3/ins-loan/risk-unit
func (p *UtaInsLoanClient) RiskUnit(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/v3/ins-loan/risk-unit", params)
	return resp, err
}

// POST /api/v3/ins-loan/bind-uid
func (p *UtaInsLoanClient) BindUid(params map[string]string) (string, error) {
	postBody, jsonErr := internal.ToJson(params)
	if jsonErr != nil {
		return "", jsonErr
	}
	resp, err := p.BitgetRestClient.DoPost("/api/v3/ins-loan/bind-uid", postBody)
	return resp, err
}
