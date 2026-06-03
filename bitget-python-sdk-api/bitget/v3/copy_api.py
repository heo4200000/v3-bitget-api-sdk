#!/usr/bin/python
from bitget.client import Client
from bitget.consts import GET, POST


class CopyApi(Client):
    def __init__(self, api_key, api_secret_key, passphrase, use_server_time=False, first=False):
        Client.__init__(self, api_key, api_secret_key, passphrase, use_server_time, first)

    # -------- trader info --------

    def tradingPairs(self):
        return self._request_without_params(GET, '/api/v3/copy/futures/trading-pairs')

    def positionSummary(self):
        return self._request_without_params(GET, '/api/v3/copy/futures/position-summary')

    # -------- copy trading transfer --------

    def maxTransferable(self, params):
        return self._request_with_params(GET, '/api/v3/copy/futures/max-transferable', params)

    def transfer(self, params):
        return self._request_with_params(POST, '/api/v3/copy/futures/transfer', params)

    def transferRecord(self, params):
        return self._request_with_params(GET, '/api/v3/copy/futures/transfer-record', params)
