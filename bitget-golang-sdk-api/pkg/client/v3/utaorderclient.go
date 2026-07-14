package v3

import (
	"bitget/internal"
	"bitget/internal/common"
)

// UtaOrderClient covers trade orders, strategy orders, and countdown cancel.
// Merged from: UtaOrderController, UtaStrategyController, UtaCountdownController
type UtaOrderClient struct {
	BitgetRestClient *common.BitgetRestClient
}

func (p *UtaOrderClient) Init() *UtaOrderClient {
	p.BitgetRestClient = new(common.BitgetRestClient).Init()
	return p
}

// -------- order --------

// POST /api/v3/trade/place-order
func (p *UtaOrderClient) PlaceOrder(params map[string]string) (string, error) {
	postBody, jsonErr := internal.ToJson(params)
	if jsonErr != nil {
		return "", jsonErr
	}
	resp, err := p.BitgetRestClient.DoPost("/api/v3/trade/place-order", postBody)
	return resp, err
}

// POST /api/v3/trade/cancel-order
func (p *UtaOrderClient) CancelOrder(params map[string]string) (string, error) {
	postBody, jsonErr := internal.ToJson(params)
	if jsonErr != nil {
		return "", jsonErr
	}
	resp, err := p.BitgetRestClient.DoPost("/api/v3/trade/cancel-order", postBody)
	return resp, err
}

// POST /api/v3/trade/cancel-symbol-order
func (p *UtaOrderClient) CancelSymbolOrder(params map[string]string) (string, error) {
	postBody, jsonErr := internal.ToJson(params)
	if jsonErr != nil {
		return "", jsonErr
	}
	resp, err := p.BitgetRestClient.DoPost("/api/v3/trade/cancel-symbol-order", postBody)
	return resp, err
}

// POST /api/v3/trade/close-positions
func (p *UtaOrderClient) ClosePositions(params map[string]string) (string, error) {
	postBody, jsonErr := internal.ToJson(params)
	if jsonErr != nil {
		return "", jsonErr
	}
	resp, err := p.BitgetRestClient.DoPost("/api/v3/trade/close-positions", postBody)
	return resp, err
}

// GET /api/v3/trade/order-info
func (p *UtaOrderClient) OrderInfo(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/v3/trade/order-info", params)
	return resp, err
}

// GET /api/v3/trade/unfilled-orders
func (p *UtaOrderClient) UnfilledOrders(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/v3/trade/unfilled-orders", params)
	return resp, err
}

// GET /api/v3/trade/history-orders
func (p *UtaOrderClient) HistoryOrders(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/v3/trade/history-orders", params)
	return resp, err
}

// GET /api/v3/trade/fills
func (p *UtaOrderClient) Fills(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/v3/trade/fills", params)
	return resp, err
}

// POST /api/v3/trade/place-batch
func (p *UtaOrderClient) PlaceBatch(params map[string]string) (string, error) {
	postBody, jsonErr := internal.ToJson(params)
	if jsonErr != nil {
		return "", jsonErr
	}
	resp, err := p.BitgetRestClient.DoPost("/api/v3/trade/place-batch", postBody)
	return resp, err
}

// POST /api/v3/trade/cancel-batch
func (p *UtaOrderClient) CancelBatch(params map[string]string) (string, error) {
	postBody, jsonErr := internal.ToJson(params)
	if jsonErr != nil {
		return "", jsonErr
	}
	resp, err := p.BitgetRestClient.DoPost("/api/v3/trade/cancel-batch", postBody)
	return resp, err
}

// POST /api/v3/trade/modify-order
func (p *UtaOrderClient) ModifyOrder(params map[string]string) (string, error) {
	postBody, jsonErr := internal.ToJson(params)
	if jsonErr != nil {
		return "", jsonErr
	}
	resp, err := p.BitgetRestClient.DoPost("/api/v3/trade/modify-order", postBody)
	return resp, err
}

// POST /api/v3/trade/batch-modify-order
func (p *UtaOrderClient) BatchModifyOrder(params map[string]string) (string, error) {
	postBody, jsonErr := internal.ToJson(params)
	if jsonErr != nil {
		return "", jsonErr
	}
	resp, err := p.BitgetRestClient.DoPost("/api/v3/trade/batch-modify-order", postBody)
	return resp, err
}

// GET /api/v3/trade/unfilled-orders-realtime
func (p *UtaOrderClient) UnfilledOrdersRealtime(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/v3/trade/unfilled-orders-realtime", params)
	return resp, err
}

// -------- strategy order --------

// POST /api/v3/trade/place-strategy-order
func (p *UtaOrderClient) PlaceStrategyOrder(params map[string]string) (string, error) {
	postBody, jsonErr := internal.ToJson(params)
	if jsonErr != nil {
		return "", jsonErr
	}
	resp, err := p.BitgetRestClient.DoPost("/api/v3/trade/place-strategy-order", postBody)
	return resp, err
}

// POST /api/v3/trade/modify-strategy-order
func (p *UtaOrderClient) ModifyStrategyOrder(params map[string]string) (string, error) {
	postBody, jsonErr := internal.ToJson(params)
	if jsonErr != nil {
		return "", jsonErr
	}
	resp, err := p.BitgetRestClient.DoPost("/api/v3/trade/modify-strategy-order", postBody)
	return resp, err
}

// POST /api/v3/trade/cancel-strategy-order
func (p *UtaOrderClient) CancelStrategyOrder(params map[string]string) (string, error) {
	postBody, jsonErr := internal.ToJson(params)
	if jsonErr != nil {
		return "", jsonErr
	}
	resp, err := p.BitgetRestClient.DoPost("/api/v3/trade/cancel-strategy-order", postBody)
	return resp, err
}

// GET /api/v3/trade/unfilled-strategy-orders
func (p *UtaOrderClient) UnfilledStrategyOrders(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/v3/trade/unfilled-strategy-orders", params)
	return resp, err
}

// GET /api/v3/trade/history-strategy-orders
func (p *UtaOrderClient) HistoryStrategyOrders(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/v3/trade/history-strategy-orders", params)
	return resp, err
}

// -------- countdown cancel --------

// POST /api/v3/trade/countdown-cancel-all
func (p *UtaOrderClient) CountdownCancelAll(params map[string]string) (string, error) {
	postBody, jsonErr := internal.ToJson(params)
	if jsonErr != nil {
		return "", jsonErr
	}
	resp, err := p.BitgetRestClient.DoPost("/api/v3/trade/countdown-cancel-all", postBody)
	return resp, err
}
