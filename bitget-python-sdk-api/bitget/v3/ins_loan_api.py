#!/usr/bin/python
from bitget.client import Client
from bitget.consts import GET, POST


class InsLoanApi(Client):
    def __init__(self, api_key, api_secret_key, passphrase, use_server_time=False, first=False):
        Client.__init__(self, api_key, api_secret_key, passphrase, use_server_time, first)

    def productInfos(self, params):
        return self._request_with_params(GET, '/api/v3/ins-loan/product-infos', params)

    def ensureCoinsConvert(self, params):
        return self._request_with_params(GET, '/api/v3/ins-loan/ensure-coins-convert', params)

    def symbols(self, params):
        return self._request_with_params(GET, '/api/v3/ins-loan/symbols', params)

    def loanOrder(self, params):
        return self._request_with_params(GET, '/api/v3/ins-loan/loan-order', params)

    def repaidHistory(self, params):
        return self._request_with_params(GET, '/api/v3/ins-loan/repaid-history', params)

    def ltvConvert(self, params):
        return self._request_with_params(GET, '/api/v3/ins-loan/ltv-convert', params)

    def transfered(self, params):
        return self._request_with_params(GET, '/api/v3/ins-loan/transfered', params)

    def riskUnit(self):
        return self._request_without_params(GET, '/api/v3/ins-loan/risk-unit')

    def bindUid(self, params):
        return self._request_with_params(POST, '/api/v3/ins-loan/bind-uid', params)
