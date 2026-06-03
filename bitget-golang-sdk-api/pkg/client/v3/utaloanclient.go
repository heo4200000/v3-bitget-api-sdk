package v3

import (
	"bitget/internal"
	"bitget/internal/common"
)

type UtaLoanClient struct {
	BitgetRestClient *common.BitgetRestClient
}

func (p *UtaLoanClient) Init() *UtaLoanClient {
	p.BitgetRestClient = new(common.BitgetRestClient).Init()
	return p
}

// GET /api/v3/loan/coins
func (p *UtaLoanClient) CoinInfos(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/v3/loan/coins", params)
	return resp, err
}

// GET /api/v3/loan/interest
func (p *UtaLoanClient) Interests(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/v3/loan/interest", params)
	return resp, err
}

// POST /api/v3/loan/borrow
func (p *UtaLoanClient) Borrow(params map[string]string) (string, error) {
	postBody, jsonErr := internal.ToJson(params)
	if jsonErr != nil {
		return "", jsonErr
	}
	resp, err := p.BitgetRestClient.DoPost("/api/v3/loan/borrow", postBody)
	return resp, err
}

// GET /api/v3/loan/borrow-ongoing
func (p *UtaLoanClient) LoanOrders(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/v3/loan/borrow-ongoing", params)
	return resp, err
}

// GET /api/v3/loan/borrow-history
func (p *UtaLoanClient) BorrowHistory(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/v3/loan/borrow-history", params)
	return resp, err
}

// POST /api/v3/loan/repay
func (p *UtaLoanClient) Repay(params map[string]string) (string, error) {
	postBody, jsonErr := internal.ToJson(params)
	if jsonErr != nil {
		return "", jsonErr
	}
	resp, err := p.BitgetRestClient.DoPost("/api/v3/loan/repay", postBody)
	return resp, err
}

// GET /api/v3/loan/repay-history
func (p *UtaLoanClient) RepayHistory(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/v3/loan/repay-history", params)
	return resp, err
}

// POST /api/v3/loan/revise-pledge
func (p *UtaLoanClient) RevisePledge(params map[string]string) (string, error) {
	postBody, jsonErr := internal.ToJson(params)
	if jsonErr != nil {
		return "", jsonErr
	}
	resp, err := p.BitgetRestClient.DoPost("/api/v3/loan/revise-pledge", postBody)
	return resp, err
}

// GET /api/v3/loan/pledge-rate-history
func (p *UtaLoanClient) PledgeRateHistory(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/v3/loan/pledge-rate-history", params)
	return resp, err
}

// GET /api/v3/loan/debts
func (p *UtaLoanClient) Debts(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/v3/loan/debts", params)
	return resp, err
}

// GET /api/v3/loan/reduces
func (p *UtaLoanClient) Reduces(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/v3/loan/reduces", params)
	return resp, err
}
