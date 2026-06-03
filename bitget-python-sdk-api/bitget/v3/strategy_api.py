#!/usr/bin/python
from bitget.client import Client
from bitget.consts import GET, POST


class StrategyApi(Client):
    def __init__(self, api_key, api_secret_key, passphrase, use_server_time=False, first=False):
        Client.__init__(self, api_key, api_secret_key, passphrase, use_server_time, first)

    def placeStrategyOrder(self, params):
        return self._request_with_params(POST, '/api/v3/trade/place-strategy-order', params)

    def modifyStrategyOrder(self, params):
        return self._request_with_params(POST, '/api/v3/trade/modify-strategy-order', params)

    def cancelStrategyOrder(self, params):
        return self._request_with_params(POST, '/api/v3/trade/cancel-strategy-order', params)

    def unfilledStrategyOrders(self, params):
        return self._request_with_params(GET, '/api/v3/trade/unfilled-strategy-orders', params)

    def historyStrategyOrders(self, params):
        return self._request_with_params(GET, '/api/v3/trade/history-strategy-orders', params)
