import {BaseApi} from '../BaseApi';

// Covers account management and wallet operations.
// Merged from: UtaAccountController, UtaWalletController
export class UtaAccountApi extends BaseApi {

    // -------- account info --------

    // GET /api/v3/account/info
    info() {
        const url = '/api/v3/account/info';
        const headers = this.signer('GET', url, null)
        return this.axiosInstance.get(url, {headers})
    }

    // GET /api/v3/account/assets
    assets() {
        const url = '/api/v3/account/assets';
        const headers = this.signer('GET', url, null)
        return this.axiosInstance.get(url, {headers})
    }

    // GET /api/v3/account/sub-unified-assets
    subUnifiedAssets(qsOrBody: object) {
        const url = '/api/v3/account/sub-unified-assets';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    // POST /api/v3/account/set-leverage
    setLeverage(qsOrBody: object) {
        const url = '/api/v3/account/set-leverage';
        const headers = this.signer('POST', url, qsOrBody)
        return this.axiosInstance.post(url, qsOrBody, {headers})
    }

    // POST /api/v3/account/set-hold-mode
    setHoldMode(qsOrBody: object) {
        const url = '/api/v3/account/set-hold-mode';
        const headers = this.signer('POST', url, qsOrBody)
        return this.axiosInstance.post(url, qsOrBody, {headers})
    }

    // POST /api/v3/account/transfer
    transfer(qsOrBody: object) {
        const url = '/api/v3/account/transfer';
        const headers = this.signer('POST', url, qsOrBody)
        return this.axiosInstance.post(url, qsOrBody, {headers})
    }

    // POST /api/v3/account/max-open-available
    maxOpenAvailable(qsOrBody: object) {
        const url = '/api/v3/account/max-open-available';
        const headers = this.signer('POST', url, qsOrBody)
        return this.axiosInstance.post(url, qsOrBody, {headers})
    }

    // GET /api/v3/account/transferable-coins
    transferableCoins(qsOrBody: object) {
        const url = '/api/v3/account/transferable-coins';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    // GET /api/v3/account/financial-records
    financialRecords(qsOrBody: object) {
        const url = '/api/v3/account/financial-records';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    // GET /api/v3/account/convert-records
    convertRecords(qsOrBody: object) {
        const url = '/api/v3/account/convert-records';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    // GET /api/v3/account/repayable-coins
    repayableCoins() {
        const url = '/api/v3/account/repayable-coins';
        const headers = this.signer('GET', url, null)
        return this.axiosInstance.get(url, {headers})
    }

    // GET /api/v3/account/payment-coins
    paymentCoins() {
        const url = '/api/v3/account/payment-coins';
        const headers = this.signer('GET', url, null)
        return this.axiosInstance.get(url, {headers})
    }

    // POST /api/v3/account/repay
    repay(qsOrBody: object) {
        const url = '/api/v3/account/repay';
        const headers = this.signer('POST', url, qsOrBody)
        return this.axiosInstance.post(url, qsOrBody, {headers})
    }

    // GET /api/v3/account/settings
    settings() {
        const url = '/api/v3/account/settings';
        const headers = this.signer('GET', url, null)
        return this.axiosInstance.get(url, {headers})
    }

    // POST /api/v3/account/sub-transfer
    subTransfer(qsOrBody: object) {
        const url = '/api/v3/account/sub-transfer';
        const headers = this.signer('POST', url, qsOrBody)
        return this.axiosInstance.post(url, qsOrBody, {headers})
    }

    // GET /api/v3/account/sub-transfer-record
    subTransferRecord(qsOrBody: object) {
        const url = '/api/v3/account/sub-transfer-record';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    // GET /api/v3/account/funding-assets
    fundingAssets(qsOrBody: object) {
        const url = '/api/v3/account/funding-assets';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    // POST /api/v3/account/switch-deduct
    switchDeduct(qsOrBody: object) {
        const url = '/api/v3/account/switch-deduct';
        const headers = this.signer('POST', url, qsOrBody)
        return this.axiosInstance.post(url, qsOrBody, {headers})
    }

    // GET /api/v3/account/deduct-info
    deductInfo() {
        const url = '/api/v3/account/deduct-info';
        const headers = this.signer('GET', url, null)
        return this.axiosInstance.get(url, {headers})
    }

    // GET /api/v3/account/fee-rate
    feeRate(qsOrBody: object) {
        const url = '/api/v3/account/fee-rate';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    // POST /api/v3/account/switch
    switchAccount() {
        const url = '/api/v3/account/switch';
        const headers = this.signer('POST', url, null)
        return this.axiosInstance.post(url, null, {headers})
    }

    // GET /api/v3/account/switch-status
    switchStatus() {
        const url = '/api/v3/account/switch-status';
        const headers = this.signer('GET', url, null)
        return this.axiosInstance.get(url, {headers})
    }

    // POST /api/v3/account/deposit-account
    depositAccount(qsOrBody: object) {
        const url = '/api/v3/account/deposit-account';
        const headers = this.signer('POST', url, qsOrBody)
        return this.axiosInstance.post(url, qsOrBody, {headers})
    }

    // POST /api/v3/account/sub-master-transfer
    subMasterTransfer(qsOrBody: object) {
        const url = '/api/v3/account/sub-master-transfer';
        const headers = this.signer('POST', url, qsOrBody)
        return this.axiosInstance.post(url, qsOrBody, {headers})
    }

    // GET /api/v3/account/max-transferable
    maxTransferable(qsOrBody: object) {
        const url = '/api/v3/account/max-transferable';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    // GET /api/v3/account/open-interest-limit
    openInterestLimit(qsOrBody: object) {
        const url = '/api/v3/account/open-interest-limit';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    // POST /api/v3/account/adjust-account-mode
    adjustAccountMode(qsOrBody: object) {
        const url = '/api/v3/account/adjust-account-mode';
        const headers = this.signer('POST', url, qsOrBody)
        return this.axiosInstance.post(url, qsOrBody, {headers})
    }

    // POST /api/v3/account/move-positions
    movePositions(qsOrBody: object) {
        const url = '/api/v3/account/move-positions';
        const headers = this.signer('POST', url, qsOrBody)
        return this.axiosInstance.post(url, qsOrBody, {headers})
    }

    // GET /api/v3/account/move-position-history
    movePositionHistory(qsOrBody: object) {
        const url = '/api/v3/account/move-position-history';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    // GET /api/v3/account/delta-info
    deltaInfo() {
        const url = '/api/v3/account/delta-info';
        const headers = this.signer('GET', url, null)
        return this.axiosInstance.get(url, {headers})
    }

    // -------- wallet (deposit / withdrawal) --------

    // GET /api/v3/account/deposit-address
    depositAddress(qsOrBody: object) {
        const url = '/api/v3/account/deposit-address';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    // GET /api/v3/account/sub-deposit-address
    subDepositAddress(qsOrBody: object) {
        const url = '/api/v3/account/sub-deposit-address';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    // GET /api/v3/account/deposit-records
    depositRecords(qsOrBody: object) {
        const url = '/api/v3/account/deposit-records';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    // GET /api/v3/account/sub-deposit-records
    subDepositRecords(qsOrBody: object) {
        const url = '/api/v3/account/sub-deposit-records';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    // POST /api/v3/account/withdrawal
    withdrawal(qsOrBody: object) {
        const url = '/api/v3/account/withdrawal';
        const headers = this.signer('POST', url, qsOrBody)
        return this.axiosInstance.post(url, qsOrBody, {headers})
    }

    // GET /api/v3/account/withdrawal-records
    withdrawalRecords(qsOrBody: object) {
        const url = '/api/v3/account/withdrawal-records';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    // POST /api/v3/account/cancel-withdrawal
    cancelWithdrawal(qsOrBody: object) {
        const url = '/api/v3/account/cancel-withdrawal';
        const headers = this.signer('POST', url, qsOrBody)
        return this.axiosInstance.post(url, qsOrBody, {headers})
    }

    // GET /api/v3/account/withdraw-address
    withdrawAddress(qsOrBody: object) {
        const url = '/api/v3/account/withdraw-address';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }
}
