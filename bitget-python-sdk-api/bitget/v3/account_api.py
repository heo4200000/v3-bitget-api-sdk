#!/usr/bin/python
from bitget.client import Client
from bitget.consts import GET, POST


class AccountApi(Client):
    def __init__(self, api_key, api_secret_key, passphrase, use_server_time=False, first=False):
        Client.__init__(self, api_key, api_secret_key, passphrase, use_server_time, first)

    # -------- account info --------

    def info(self):
        return self._request_without_params(GET, '/api/v3/account/info')

    def assets(self):
        return self._request_without_params(GET, '/api/v3/account/assets')

    def subUnifiedAssets(self, params):
        return self._request_with_params(GET, '/api/v3/account/sub-unified-assets', params)

    def setLeverage(self, params):
        return self._request_with_params(POST, '/api/v3/account/set-leverage', params)

    def setHoldMode(self, params):
        return self._request_with_params(POST, '/api/v3/account/set-hold-mode', params)

    def transfer(self, params):
        return self._request_with_params(POST, '/api/v3/account/transfer', params)

    def maxOpenAvailable(self, params):
        return self._request_with_params(POST, '/api/v3/account/max-open-available', params)

    def transferableCoins(self, params):
        return self._request_with_params(GET, '/api/v3/account/transferable-coins', params)

    def financialRecords(self, params):
        return self._request_with_params(GET, '/api/v3/account/financial-records', params)

    def convertRecords(self, params):
        return self._request_with_params(GET, '/api/v3/account/convert-records', params)

    def repayableCoins(self):
        return self._request_without_params(GET, '/api/v3/account/repayable-coins')

    def paymentCoins(self):
        return self._request_without_params(GET, '/api/v3/account/payment-coins')

    def repay(self, params):
        return self._request_with_params(POST, '/api/v3/account/repay', params)

    def settings(self):
        return self._request_without_params(GET, '/api/v3/account/settings')

    def subTransfer(self, params):
        return self._request_with_params(POST, '/api/v3/account/sub-transfer', params)

    def subTransferRecord(self, params):
        return self._request_with_params(GET, '/api/v3/account/sub-transfer-record', params)

    def fundingAssets(self, params):
        return self._request_with_params(GET, '/api/v3/account/funding-assets', params)

    def switchDeduct(self, params):
        return self._request_with_params(POST, '/api/v3/account/switch-deduct', params)

    def deductInfo(self):
        return self._request_without_params(GET, '/api/v3/account/deduct-info')

    def feeRate(self, params):
        return self._request_with_params(GET, '/api/v3/account/fee-rate', params)

    def switchAccount(self):
        return self._request_without_params(POST, '/api/v3/account/switch')

    def switchStatus(self):
        return self._request_without_params(GET, '/api/v3/account/switch-status')

    def depositAccount(self, params):
        return self._request_with_params(POST, '/api/v3/account/deposit-account', params)

    def subMasterTransfer(self, params):
        return self._request_with_params(POST, '/api/v3/account/sub-master-transfer', params)

    def maxTransferable(self, params):
        return self._request_with_params(GET, '/api/v3/account/max-transferable', params)

    def openInterestLimit(self, params):
        return self._request_with_params(GET, '/api/v3/account/open-interest-limit', params)

    def adjustAccountMode(self, params):
        return self._request_with_params(POST, '/api/v3/account/adjust-account-mode', params)

    def movePositions(self, params):
        return self._request_with_params(POST, '/api/v3/account/move-positions', params)

    def movePositionHistory(self, params):
        return self._request_with_params(GET, '/api/v3/account/move-position-history', params)

    def deltaInfo(self):
        return self._request_without_params(GET, '/api/v3/account/delta-info')

    # -------- wallet (deposit/withdrawal) --------

    def depositAddress(self, params):
        return self._request_with_params(GET, '/api/v3/account/deposit-address', params)

    def subDepositAddress(self, params):
        return self._request_with_params(GET, '/api/v3/account/sub-deposit-address', params)

    def depositRecords(self, params):
        return self._request_with_params(GET, '/api/v3/account/deposit-records', params)

    def subDepositRecords(self, params):
        return self._request_with_params(GET, '/api/v3/account/sub-deposit-records', params)

    def withdrawal(self, params):
        return self._request_with_params(POST, '/api/v3/account/withdrawal', params)

    def withdrawalRecords(self, params):
        return self._request_with_params(GET, '/api/v3/account/withdrawal-records', params)

    def cancelWithdrawal(self, params):
        return self._request_with_params(POST, '/api/v3/account/cancel-withdrawal', params)

    def withdrawAddress(self, params):
        return self._request_with_params(GET, '/api/v3/account/withdraw-address', params)
