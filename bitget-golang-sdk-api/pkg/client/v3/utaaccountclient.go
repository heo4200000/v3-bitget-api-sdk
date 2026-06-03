package v3

import (
	"bitget/internal"
	"bitget/internal/common"
)

// UtaAccountClient covers account management and wallet operations.
// Merged from: UtaAccountController, UtaWalletController
type UtaAccountClient struct {
	BitgetRestClient *common.BitgetRestClient
}

func (p *UtaAccountClient) Init() *UtaAccountClient {
	p.BitgetRestClient = new(common.BitgetRestClient).Init()
	return p
}

// -------- account info --------

// GET /api/v3/account/info
func (p *UtaAccountClient) Info() (string, error) {
	params := internal.NewParams()
	resp, err := p.BitgetRestClient.DoGet("/api/v3/account/info", params)
	return resp, err
}

// GET /api/v3/account/assets
func (p *UtaAccountClient) Assets() (string, error) {
	params := internal.NewParams()
	resp, err := p.BitgetRestClient.DoGet("/api/v3/account/assets", params)
	return resp, err
}

// GET /api/v3/account/sub-unified-assets
func (p *UtaAccountClient) SubUnifiedAssets(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/v3/account/sub-unified-assets", params)
	return resp, err
}

// POST /api/v3/account/set-leverage
func (p *UtaAccountClient) SetLeverage(params map[string]string) (string, error) {
	postBody, jsonErr := internal.ToJson(params)
	if jsonErr != nil {
		return "", jsonErr
	}
	resp, err := p.BitgetRestClient.DoPost("/api/v3/account/set-leverage", postBody)
	return resp, err
}

// POST /api/v3/account/set-hold-mode
func (p *UtaAccountClient) SetHoldMode(params map[string]string) (string, error) {
	postBody, jsonErr := internal.ToJson(params)
	if jsonErr != nil {
		return "", jsonErr
	}
	resp, err := p.BitgetRestClient.DoPost("/api/v3/account/set-hold-mode", postBody)
	return resp, err
}

// POST /api/v3/account/transfer
func (p *UtaAccountClient) Transfer(params map[string]string) (string, error) {
	postBody, jsonErr := internal.ToJson(params)
	if jsonErr != nil {
		return "", jsonErr
	}
	resp, err := p.BitgetRestClient.DoPost("/api/v3/account/transfer", postBody)
	return resp, err
}

// POST /api/v3/account/max-open-available
func (p *UtaAccountClient) MaxOpenAvailable(params map[string]string) (string, error) {
	postBody, jsonErr := internal.ToJson(params)
	if jsonErr != nil {
		return "", jsonErr
	}
	resp, err := p.BitgetRestClient.DoPost("/api/v3/account/max-open-available", postBody)
	return resp, err
}

// GET /api/v3/account/transferable-coins
func (p *UtaAccountClient) TransferableCoins(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/v3/account/transferable-coins", params)
	return resp, err
}

// GET /api/v3/account/financial-records
func (p *UtaAccountClient) FinancialRecords(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/v3/account/financial-records", params)
	return resp, err
}

// GET /api/v3/account/convert-records
func (p *UtaAccountClient) ConvertRecords(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/v3/account/convert-records", params)
	return resp, err
}

// GET /api/v3/account/repayable-coins
func (p *UtaAccountClient) RepayableCoins() (string, error) {
	params := internal.NewParams()
	resp, err := p.BitgetRestClient.DoGet("/api/v3/account/repayable-coins", params)
	return resp, err
}

// GET /api/v3/account/payment-coins
func (p *UtaAccountClient) PaymentCoins() (string, error) {
	params := internal.NewParams()
	resp, err := p.BitgetRestClient.DoGet("/api/v3/account/payment-coins", params)
	return resp, err
}

// POST /api/v3/account/repay
func (p *UtaAccountClient) Repay(params map[string]string) (string, error) {
	postBody, jsonErr := internal.ToJson(params)
	if jsonErr != nil {
		return "", jsonErr
	}
	resp, err := p.BitgetRestClient.DoPost("/api/v3/account/repay", postBody)
	return resp, err
}

// GET /api/v3/account/settings
func (p *UtaAccountClient) Settings() (string, error) {
	params := internal.NewParams()
	resp, err := p.BitgetRestClient.DoGet("/api/v3/account/settings", params)
	return resp, err
}

// POST /api/v3/account/sub-transfer
func (p *UtaAccountClient) SubTransfer(params map[string]string) (string, error) {
	postBody, jsonErr := internal.ToJson(params)
	if jsonErr != nil {
		return "", jsonErr
	}
	resp, err := p.BitgetRestClient.DoPost("/api/v3/account/sub-transfer", postBody)
	return resp, err
}

// GET /api/v3/account/sub-transfer-record
func (p *UtaAccountClient) SubTransferRecord(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/v3/account/sub-transfer-record", params)
	return resp, err
}

// GET /api/v3/account/funding-assets
func (p *UtaAccountClient) FundingAssets(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/v3/account/funding-assets", params)
	return resp, err
}

// POST /api/v3/account/switch-deduct
func (p *UtaAccountClient) SwitchDeduct(params map[string]string) (string, error) {
	postBody, jsonErr := internal.ToJson(params)
	if jsonErr != nil {
		return "", jsonErr
	}
	resp, err := p.BitgetRestClient.DoPost("/api/v3/account/switch-deduct", postBody)
	return resp, err
}

// GET /api/v3/account/deduct-info
func (p *UtaAccountClient) DeductInfo() (string, error) {
	params := internal.NewParams()
	resp, err := p.BitgetRestClient.DoGet("/api/v3/account/deduct-info", params)
	return resp, err
}

// GET /api/v3/account/fee-rate
func (p *UtaAccountClient) FeeRate(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/v3/account/fee-rate", params)
	return resp, err
}

// POST /api/v3/account/switch  (note: "switch" is a Go keyword, renamed to SwitchAccount)
func (p *UtaAccountClient) SwitchAccount() (string, error) {
	resp, err := p.BitgetRestClient.DoPost("/api/v3/account/switch", "")
	return resp, err
}

// GET /api/v3/account/switch-status
func (p *UtaAccountClient) SwitchStatus() (string, error) {
	params := internal.NewParams()
	resp, err := p.BitgetRestClient.DoGet("/api/v3/account/switch-status", params)
	return resp, err
}

// POST /api/v3/account/deposit-account
func (p *UtaAccountClient) DepositAccount(params map[string]string) (string, error) {
	postBody, jsonErr := internal.ToJson(params)
	if jsonErr != nil {
		return "", jsonErr
	}
	resp, err := p.BitgetRestClient.DoPost("/api/v3/account/deposit-account", postBody)
	return resp, err
}

// POST /api/v3/account/sub-master-transfer
func (p *UtaAccountClient) SubMasterTransfer(params map[string]string) (string, error) {
	postBody, jsonErr := internal.ToJson(params)
	if jsonErr != nil {
		return "", jsonErr
	}
	resp, err := p.BitgetRestClient.DoPost("/api/v3/account/sub-master-transfer", postBody)
	return resp, err
}

// GET /api/v3/account/max-transferable
func (p *UtaAccountClient) MaxTransferable(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/v3/account/max-transferable", params)
	return resp, err
}

// GET /api/v3/account/open-interest-limit
func (p *UtaAccountClient) OpenInterestLimit(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/v3/account/open-interest-limit", params)
	return resp, err
}

// POST /api/v3/account/adjust-account-mode
func (p *UtaAccountClient) AdjustAccountMode(params map[string]string) (string, error) {
	postBody, jsonErr := internal.ToJson(params)
	if jsonErr != nil {
		return "", jsonErr
	}
	resp, err := p.BitgetRestClient.DoPost("/api/v3/account/adjust-account-mode", postBody)
	return resp, err
}

// POST /api/v3/account/move-positions
func (p *UtaAccountClient) MovePositions(params map[string]string) (string, error) {
	postBody, jsonErr := internal.ToJson(params)
	if jsonErr != nil {
		return "", jsonErr
	}
	resp, err := p.BitgetRestClient.DoPost("/api/v3/account/move-positions", postBody)
	return resp, err
}

// GET /api/v3/account/move-position-history
func (p *UtaAccountClient) MovePositionHistory(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/v3/account/move-position-history", params)
	return resp, err
}

// GET /api/v3/account/delta-info
func (p *UtaAccountClient) DeltaInfo() (string, error) {
	params := internal.NewParams()
	resp, err := p.BitgetRestClient.DoGet("/api/v3/account/delta-info", params)
	return resp, err
}

// -------- wallet (deposit / withdrawal) --------

// GET /api/v3/account/deposit-address
func (p *UtaAccountClient) DepositAddress(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/v3/account/deposit-address", params)
	return resp, err
}

// GET /api/v3/account/sub-deposit-address
func (p *UtaAccountClient) SubDepositAddress(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/v3/account/sub-deposit-address", params)
	return resp, err
}

// GET /api/v3/account/deposit-records
func (p *UtaAccountClient) DepositRecords(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/v3/account/deposit-records", params)
	return resp, err
}

// GET /api/v3/account/sub-deposit-records
func (p *UtaAccountClient) SubDepositRecords(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/v3/account/sub-deposit-records", params)
	return resp, err
}

// POST /api/v3/account/withdrawal
func (p *UtaAccountClient) Withdrawal(params map[string]string) (string, error) {
	postBody, jsonErr := internal.ToJson(params)
	if jsonErr != nil {
		return "", jsonErr
	}
	resp, err := p.BitgetRestClient.DoPost("/api/v3/account/withdrawal", postBody)
	return resp, err
}

// GET /api/v3/account/withdrawal-records
func (p *UtaAccountClient) WithdrawalRecords(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/v3/account/withdrawal-records", params)
	return resp, err
}

// POST /api/v3/account/cancel-withdrawal
func (p *UtaAccountClient) CancelWithdrawal(params map[string]string) (string, error) {
	postBody, jsonErr := internal.ToJson(params)
	if jsonErr != nil {
		return "", jsonErr
	}
	resp, err := p.BitgetRestClient.DoPost("/api/v3/account/cancel-withdrawal", postBody)
	return resp, err
}

// GET /api/v3/account/withdraw-address
func (p *UtaAccountClient) WithdrawAddress(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/v3/account/withdraw-address", params)
	return resp, err
}
