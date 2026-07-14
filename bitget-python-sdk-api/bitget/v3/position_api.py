#!/usr/bin/python
from bitget.client import Client
from bitget.consts import GET


class PositionApi(Client):
    def __init__(self, api_key, api_secret_key, passphrase, use_server_time=False, first=False):
        Client.__init__(self, api_key, api_secret_key, passphrase, use_server_time, first)

    def currentPosition(self, params):
        return self._request_with_params(GET, '/api/v3/position/current-position', params)

    def historyPosition(self, params):
        return self._request_with_params(GET, '/api/v3/position/history-position', params)

    def adlRank(self):
        return self._request_without_params(GET, '/api/v3/position/adlRank')
