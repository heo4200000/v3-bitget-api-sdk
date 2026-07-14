import {BaseApi} from '../BaseApi';

// Covers copy trading transfers and trace queries.
// Merged from: CopyTradingTransferController, UtaTraceController
export class UtaCopyApi extends BaseApi {

    // -------- copy futures transfer --------

    // GET /api/v3/copy/futures/max-transferable
    maxTransferable(qsOrBody: object) {
        const url = '/api/v3/copy/futures/max-transferable';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    // POST /api/v3/copy/futures/transfer
    transfer(qsOrBody: object) {
        const url = '/api/v3/copy/futures/transfer';
        const headers = this.signer('POST', url, qsOrBody)
        return this.axiosInstance.post(url, qsOrBody, {headers})
    }

    // GET /api/v3/copy/futures/transfer-record
    transferRecord(qsOrBody: object) {
        const url = '/api/v3/copy/futures/transfer-record';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    // -------- trace (follower / trader query) --------

    // GET /api/v3/copy/futures/trading-pairs
    futuresTradingPairs(qsOrBody: object) {
        const url = '/api/v3/copy/futures/trading-pairs';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    // GET /api/v3/copy/futures/position-summary
    futuresPositionSummary(qsOrBody: object) {
        const url = '/api/v3/copy/futures/position-summary';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }
}
