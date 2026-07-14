package v3

import (
	"bitget/internal"
	"bitget/internal/common"
)

type UtaBrokerClient struct {
	BitgetRestClient *common.BitgetRestClient
}

func (p *UtaBrokerClient) Init() *UtaBrokerClient {
	p.BitgetRestClient = new(common.BitgetRestClient).Init()
	return p
}

// POST /api/v3/broker/create-sub
func (p *UtaBrokerClient) CreateSub(params map[string]string) (string, error) {
	postBody, jsonErr := internal.ToJson(params)
	if jsonErr != nil {
		return "", jsonErr
	}
	resp, err := p.BitgetRestClient.DoPost("/api/v3/broker/create-sub", postBody)
	return resp, err
}

// GET /api/v3/broker/sub-list
func (p *UtaBrokerClient) SubList(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/v3/broker/sub-list", params)
	return resp, err
}

// POST /api/v3/broker/modify-sub
func (p *UtaBrokerClient) ModifySub(params map[string]string) (string, error) {
	postBody, jsonErr := internal.ToJson(params)
	if jsonErr != nil {
		return "", jsonErr
	}
	resp, err := p.BitgetRestClient.DoPost("/api/v3/broker/modify-sub", postBody)
	return resp, err
}

// POST /api/v3/broker/sub-withdrawal
func (p *UtaBrokerClient) SubWithdrawal(params map[string]string) (string, error) {
	postBody, jsonErr := internal.ToJson(params)
	if jsonErr != nil {
		return "", jsonErr
	}
	resp, err := p.BitgetRestClient.DoPost("/api/v3/broker/sub-withdrawal", postBody)
	return resp, err
}

// POST /api/v3/broker/sub-deposit-address
func (p *UtaBrokerClient) SubDepositAddress(params map[string]string) (string, error) {
	postBody, jsonErr := internal.ToJson(params)
	if jsonErr != nil {
		return "", jsonErr
	}
	resp, err := p.BitgetRestClient.DoPost("/api/v3/broker/sub-deposit-address", postBody)
	return resp, err
}

// GET /api/v3/broker/all-sub-deposit-withdrawal
func (p *UtaBrokerClient) AllSubDepositWithdrawal(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/v3/broker/all-sub-deposit-withdrawal", params)
	return resp, err
}

// POST /api/v3/broker/create-sub-apikey
func (p *UtaBrokerClient) CreateSubApikey(params map[string]string) (string, error) {
	postBody, jsonErr := internal.ToJson(params)
	if jsonErr != nil {
		return "", jsonErr
	}
	resp, err := p.BitgetRestClient.DoPost("/api/v3/broker/create-sub-apikey", postBody)
	return resp, err
}

// POST /api/v3/broker/modify-sub-apikey
func (p *UtaBrokerClient) ModifySubApikey(params map[string]string) (string, error) {
	postBody, jsonErr := internal.ToJson(params)
	if jsonErr != nil {
		return "", jsonErr
	}
	resp, err := p.BitgetRestClient.DoPost("/api/v3/broker/modify-sub-apikey", postBody)
	return resp, err
}

// POST /api/v3/broker/delete-sub-apikey
func (p *UtaBrokerClient) DeleteSubApikey(params map[string]string) (string, error) {
	postBody, jsonErr := internal.ToJson(params)
	if jsonErr != nil {
		return "", jsonErr
	}
	resp, err := p.BitgetRestClient.DoPost("/api/v3/broker/delete-sub-apikey", postBody)
	return resp, err
}

// GET /api/v3/broker/query-sub-apikey
func (p *UtaBrokerClient) QuerySubApikey(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/v3/broker/query-sub-apikey", params)
	return resp, err
}

// GET /api/v3/broker/commission
func (p *UtaBrokerClient) Commission(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/v3/broker/commission", params)
	return resp, err
}
