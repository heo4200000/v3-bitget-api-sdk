package v3

import (
	"bitget/internal"
	"bitget/internal/common"
)

type UtaUserClient struct {
	BitgetRestClient *common.BitgetRestClient
}

func (p *UtaUserClient) Init() *UtaUserClient {
	p.BitgetRestClient = new(common.BitgetRestClient).Init()
	return p
}

// POST /api/v3/user/create-sub
func (p *UtaUserClient) CreateSub(params map[string]string) (string, error) {
	postBody, jsonErr := internal.ToJson(params)
	if jsonErr != nil {
		return "", jsonErr
	}
	resp, err := p.BitgetRestClient.DoPost("/api/v3/user/create-sub", postBody)
	return resp, err
}

// POST /api/v3/user/modify-sub
func (p *UtaUserClient) ModifySub(params map[string]string) (string, error) {
	postBody, jsonErr := internal.ToJson(params)
	if jsonErr != nil {
		return "", jsonErr
	}
	resp, err := p.BitgetRestClient.DoPost("/api/v3/user/modify-sub", postBody)
	return resp, err
}

// POST /api/v3/user/freeze-sub
func (p *UtaUserClient) FreezeSub(params map[string]string) (string, error) {
	postBody, jsonErr := internal.ToJson(params)
	if jsonErr != nil {
		return "", jsonErr
	}
	resp, err := p.BitgetRestClient.DoPost("/api/v3/user/freeze-sub", postBody)
	return resp, err
}

// GET /api/v3/user/sub-list
func (p *UtaUserClient) SubList(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/v3/user/sub-list", params)
	return resp, err
}

// POST /api/v3/user/create-sub-api
func (p *UtaUserClient) CreateSubApi(params map[string]string) (string, error) {
	postBody, jsonErr := internal.ToJson(params)
	if jsonErr != nil {
		return "", jsonErr
	}
	resp, err := p.BitgetRestClient.DoPost("/api/v3/user/create-sub-api", postBody)
	return resp, err
}

// POST /api/v3/user/update-sub-api
func (p *UtaUserClient) UpdateSubApi(params map[string]string) (string, error) {
	postBody, jsonErr := internal.ToJson(params)
	if jsonErr != nil {
		return "", jsonErr
	}
	resp, err := p.BitgetRestClient.DoPost("/api/v3/user/update-sub-api", postBody)
	return resp, err
}

// POST /api/v3/user/delete-sub-api
func (p *UtaUserClient) DeleteSubApi(params map[string]string) (string, error) {
	postBody, jsonErr := internal.ToJson(params)
	if jsonErr != nil {
		return "", jsonErr
	}
	resp, err := p.BitgetRestClient.DoPost("/api/v3/user/delete-sub-api", postBody)
	return resp, err
}

// POST /api/v3/user/sub-account/agent-create
func (p *UtaUserClient) AgentCreate(params map[string]string) (string, error) {
	postBody, jsonErr := internal.ToJson(params)
	if jsonErr != nil {
		return "", jsonErr
	}
	resp, err := p.BitgetRestClient.DoPost("/api/v3/user/sub-account/agent-create", postBody)
	return resp, err
}

// GET /api/v3/user/sub-api-list
func (p *UtaUserClient) SubApiList(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/v3/user/sub-api-list", params)
	return resp, err
}
