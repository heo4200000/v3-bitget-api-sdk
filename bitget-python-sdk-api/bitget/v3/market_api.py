#!/usr/bin/python
from bitget.client import Client
from bitget.consts import GET


class MarketApi(Client):
    def __init__(self, api_key, api_secret_key, passphrase, use_server_time=False, first=False):
        Client.__init__(self, api_key, api_secret_key, passphrase, use_server_time, first)

    def getTime(self):
        return self._request_without_params(GET, '/api/v3/market/time')

    def instruments(self, params):
        return self._request_with_params(GET, '/api/v3/market/instruments', params)

    def tickers(self, params):
        return self._request_with_params(GET, '/api/v3/market/tickers', params)

    def fills(self, params):
        return self._request_with_params(GET, '/api/v3/market/fills', params)

    def orderbook(self, params):
        return self._request_with_params(GET, '/api/v3/market/orderbook', params)

    def rpiOrderbook(self, params):
        return self._request_with_params(GET, '/api/v3/market/rpi-orderbook', params)

    def candles(self, params):
        return self._request_with_params(GET, '/api/v3/market/candles', params)

    def historyCandles(self, params):
        return self._request_with_params(GET, '/api/v3/market/history-candles', params)

    def openInterest(self, params):
        return self._request_with_params(GET, '/api/v3/market/open-interest', params)

    def historyFundRate(self, params):
        return self._request_with_params(GET, '/api/v3/market/history-fund-rate', params)

    def currentFundRate(self, params):
        return self._request_with_params(GET, '/api/v3/market/current-fund-rate', params)

    def riskReserve(self, params):
        return self._request_with_params(GET, '/api/v3/market/risk-reserve', params)

    def riskReserveAll(self, params):
        return self._request_with_params(GET, '/api/v3/market/risk-reserve-all', params)

    def riskReserveHour(self, params):
        return self._request_with_params(GET, '/api/v3/market/risk-reserve-hour', params)

    def discountRate(self):
        return self._request_without_params(GET, '/api/v3/market/discount-rate')

    def marginLoans(self, params):
        return self._request_with_params(GET, '/api/v3/market/margin-loans', params)

    def positionTier(self, params):
        return self._request_with_params(GET, '/api/v3/market/position-tier', params)

    def oiLimit(self, params):
        return self._request_with_params(GET, '/api/v3/market/oi-limit', params)

    def proofOfReserves(self):
        return self._request_without_params(GET, '/api/v3/market/proof-of-reserves')

    def por(self):
        return self._request_without_params(GET, '/api/v3/market/por')

    def indexComponents(self, params):
        return self._request_with_params(GET, '/api/v3/market/index-components', params)

    def feeGroup(self, params):
        return self._request_with_params(GET, '/api/v3/market/fee-group', params)

    def scoreWeights(self, params):
        return self._request_with_params(GET, '/api/v3/market/score-weights', params)
