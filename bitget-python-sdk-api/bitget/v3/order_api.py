#!/usr/bin/python
from bitget.client import Client
from bitget.consts import GET, POST


class OrderApi(Client):
    def __init__(self, api_key, api_secret_key, passphrase, use_server_time=False, first=False):
        Client.__init__(self, api_key, api_secret_key, passphrase, use_server_time, first)

    # -------- normal order --------

    def placeOrder(self, params):
        return self._request_with_params(POST, '/api/v3/trade/place-order', params)

    def cancelOrder(self, params):
        return self._request_with_params(POST, '/api/v3/trade/cancel-order', params)

    def cancelSymbolOrder(self, params):
        return self._request_with_params(POST, '/api/v3/trade/cancel-symbol-order', params)

    def closePositions(self, params):
        return self._request_with_params(POST, '/api/v3/trade/close-positions', params)

    def orderInfo(self, params):
        return self._request_with_params(GET, '/api/v3/trade/order-info', params)

    def unfilledOrders(self, params):
        return self._request_with_params(GET, '/api/v3/trade/unfilled-orders', params)

    def historyOrders(self, params):
        return self._request_with_params(GET, '/api/v3/trade/history-orders', params)

    def fills(self, params):
        return self._request_with_params(GET, '/api/v3/trade/fills', params)

    def unfilledOrdersRealtime(self, params):
        return self._request_with_params(GET, '/api/v3/trade/unfilled-orders-realtime', params)

    # -------- batch order --------

    def placeBatch(self, params):
        return self._request_with_params(POST, '/api/v3/trade/place-batch', params)

    def cancelBatch(self, params):
        return self._request_with_params(POST, '/api/v3/trade/cancel-batch', params)

    def modifyOrder(self, params):
        return self._request_with_params(POST, '/api/v3/trade/modify-order', params)

    def batchModifyOrder(self, params):
        return self._request_with_params(POST, '/api/v3/trade/batch-modify-order', params)

    # -------- countdown --------

    def countdownCancelAll(self, params):
        return self._request_with_params(POST, '/api/v3/trade/countdown-cancel-all', params)
