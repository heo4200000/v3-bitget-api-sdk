#!/usr/bin/python
from bitget.client import Client
from bitget.consts import GET


class TaxApi(Client):
    def __init__(self, api_key, api_secret_key, passphrase, use_server_time=False, first=False):
        Client.__init__(self, api_key, api_secret_key, passphrase, use_server_time, first)

    def records(self, params):
        return self._request_with_params(GET, '/api/v3/tax/records', params)
