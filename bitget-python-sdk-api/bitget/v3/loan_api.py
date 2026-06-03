#!/usr/bin/python
from bitget.client import Client
from bitget.consts import GET, POST


class LoanApi(Client):
    def __init__(self, api_key, api_secret_key, passphrase, use_server_time=False, first=False):
        Client.__init__(self, api_key, api_secret_key, passphrase, use_server_time, first)

    def coins(self, params):
        return self._request_with_params(GET, '/api/v3/loan/coins', params)

    def interest(self, params):
        return self._request_with_params(GET, '/api/v3/loan/interest', params)

    def borrow(self, params):
        return self._request_with_params(POST, '/api/v3/loan/borrow', params)

    def borrowOngoing(self, params):
        return self._request_with_params(GET, '/api/v3/loan/borrow-ongoing', params)

    def borrowHistory(self, params):
        return self._request_with_params(GET, '/api/v3/loan/borrow-history', params)

    def repay(self, params):
        return self._request_with_params(POST, '/api/v3/loan/repay', params)

    def repayHistory(self, params):
        return self._request_with_params(GET, '/api/v3/loan/repay-history', params)

    def revisePledge(self, params):
        return self._request_with_params(POST, '/api/v3/loan/revise-pledge', params)

    def pledgeRateHistory(self, params):
        return self._request_with_params(GET, '/api/v3/loan/pledge-rate-history', params)

    def debts(self):
        return self._request_without_params(GET, '/api/v3/loan/debts')

    def reduces(self, params):
        return self._request_with_params(GET, '/api/v3/loan/reduces', params)
