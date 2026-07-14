package v3

import (
	"bitget/internal"
	"bitget/internal/common"
)

type UtaMarketClient struct {
	BitgetRestClient *common.BitgetRestClient
}

func (p *UtaMarketClient) Init() *UtaMarketClient {
	p.BitgetRestClient = new(common.BitgetRestClient).Init()
	return p
}

// GET /api/v3/market/time
func (p *UtaMarketClient) GetTime() (string, error) {
	params := internal.NewParams()
	resp, err := p.BitgetRestClient.DoGet("/api/v3/market/time", params)
	return resp, err
}

// GET /api/v3/market/instruments
func (p *UtaMarketClient) Instruments(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/v3/market/instruments", params)
	return resp, err
}

// GET /api/v3/market/tickers
func (p *UtaMarketClient) Tickers(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/v3/market/tickers", params)
	return resp, err
}

// GET /api/v3/market/fills
func (p *UtaMarketClient) Fills(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/v3/market/fills", params)
	return resp, err
}

// GET /api/v3/market/orderbook
func (p *UtaMarketClient) Orderbook(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/v3/market/orderbook", params)
	return resp, err
}

// GET /api/v3/market/rpi-orderbook
func (p *UtaMarketClient) RpiOrderbook(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/v3/market/rpi-orderbook", params)
	return resp, err
}

// GET /api/v3/market/candles
func (p *UtaMarketClient) Candles(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/v3/market/candles", params)
	return resp, err
}

// GET /api/v3/market/history-candles
func (p *UtaMarketClient) HistoryCandles(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/v3/market/history-candles", params)
	return resp, err
}

// GET /api/v3/market/open-interest
func (p *UtaMarketClient) OpenInterest(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/v3/market/open-interest", params)
	return resp, err
}

// GET /api/v3/market/history-fund-rate
func (p *UtaMarketClient) HistoryFundRate(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/v3/market/history-fund-rate", params)
	return resp, err
}

// GET /api/v3/market/risk-reserve
func (p *UtaMarketClient) RiskReserve(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/v3/market/risk-reserve", params)
	return resp, err
}

// GET /api/v3/market/risk-reserve-all
func (p *UtaMarketClient) RiskReserveAll(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/v3/market/risk-reserve-all", params)
	return resp, err
}

// GET /api/v3/market/discount-rate
func (p *UtaMarketClient) DiscountRate() (string, error) {
	params := internal.NewParams()
	resp, err := p.BitgetRestClient.DoGet("/api/v3/market/discount-rate", params)
	return resp, err
}

// GET /api/v3/market/margin-loans
func (p *UtaMarketClient) MarginLoans(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/v3/market/margin-loans", params)
	return resp, err
}

// GET /api/v3/market/position-tier
func (p *UtaMarketClient) PositionTier(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/v3/market/position-tier", params)
	return resp, err
}

// GET /api/v3/market/current-fund-rate
func (p *UtaMarketClient) CurrentFundRate(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/v3/market/current-fund-rate", params)
	return resp, err
}

// GET /api/v3/market/oi-limit
func (p *UtaMarketClient) OiLimit(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/v3/market/oi-limit", params)
	return resp, err
}

// GET /api/v3/market/proof-of-reserves
func (p *UtaMarketClient) ProofOfReserves() (string, error) {
	params := internal.NewParams()
	resp, err := p.BitgetRestClient.DoGet("/api/v3/market/proof-of-reserves", params)
	return resp, err
}

// GET /api/v3/market/por
func (p *UtaMarketClient) Por() (string, error) {
	params := internal.NewParams()
	resp, err := p.BitgetRestClient.DoGet("/api/v3/market/por", params)
	return resp, err
}

// GET /api/v3/market/risk-reserve-hour
func (p *UtaMarketClient) RiskReserveHour(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/v3/market/risk-reserve-hour", params)
	return resp, err
}

// GET /api/v3/market/index-components
func (p *UtaMarketClient) IndexComponents(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/v3/market/index-components", params)
	return resp, err
}

// GET /api/v3/market/fee-group
func (p *UtaMarketClient) FeeGroup(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/v3/market/fee-group", params)
	return resp, err
}

// GET /api/v3/market/score-weights
func (p *UtaMarketClient) ScoreWeights(params map[string]string) (string, error) {
	resp, err := p.BitgetRestClient.DoGet("/api/v3/market/score-weights", params)
	return resp, err
}
