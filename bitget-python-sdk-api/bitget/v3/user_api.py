#!/usr/bin/python
from bitget.client import Client
from bitget.consts import GET, POST


class UserApi(Client):
    def __init__(self, api_key, api_secret_key, passphrase, use_server_time=False, first=False):
        Client.__init__(self, api_key, api_secret_key, passphrase, use_server_time, first)

    def createSub(self, params):
        return self._request_with_params(POST, '/api/v3/user/create-sub', params)

    def modifySub(self, params):
        return self._request_with_params(POST, '/api/v3/user/modify-sub', params)

    def freezeSub(self, params):
        return self._request_with_params(POST, '/api/v3/user/freeze-sub', params)

    def subList(self, params):
        return self._request_with_params(GET, '/api/v3/user/sub-list', params)

    def createSubApi(self, params):
        return self._request_with_params(POST, '/api/v3/user/create-sub-api', params)

    def updateSubApi(self, params):
        return self._request_with_params(POST, '/api/v3/user/update-sub-api', params)

    def deleteSubApi(self, params):
        return self._request_with_params(POST, '/api/v3/user/delete-sub-api', params)

    def agentCreate(self, params):
        return self._request_with_params(POST, '/api/v3/user/sub-account/agent-create', params)

    def subApiList(self, params):
        return self._request_with_params(GET, '/api/v3/user/sub-api-list', params)
