#!/usr/bin/python
from bitget.client import Client
from bitget.consts import GET, POST


class BrokerApi(Client):
    def __init__(self, api_key, api_secret_key, passphrase, use_server_time=False, first=False):
        Client.__init__(self, api_key, api_secret_key, passphrase, use_server_time, first)

    def createSub(self, params):
        return self._request_with_params(POST, '/api/v3/broker/create-sub', params)

    def subList(self, params):
        return self._request_with_params(GET, '/api/v3/broker/sub-list', params)

    def modifySub(self, params):
        return self._request_with_params(POST, '/api/v3/broker/modify-sub', params)

    def subWithdrawal(self, params):
        return self._request_with_params(POST, '/api/v3/broker/sub-withdrawal', params)

    def subDepositAddress(self, params):
        return self._request_with_params(POST, '/api/v3/broker/sub-deposit-address', params)

    def allSubDepositWithdrawal(self, params):
        return self._request_with_params(GET, '/api/v3/broker/all-sub-deposit-withdrawal', params)

    def createSubApikey(self, params):
        return self._request_with_params(POST, '/api/v3/broker/create-sub-apikey', params)

    def modifySubApikey(self, params):
        return self._request_with_params(POST, '/api/v3/broker/modify-sub-apikey', params)

    def deleteSubApikey(self, params):
        return self._request_with_params(POST, '/api/v3/broker/delete-sub-apikey', params)

    def querySubApikey(self, params):
        return self._request_with_params(GET, '/api/v3/broker/query-sub-apikey', params)

    def commission(self, params):
        return self._request_with_params(GET, '/api/v3/broker/commission', params)
