import {BaseApi} from '../BaseApi';

export class UtaInsLoanApi extends BaseApi {

    // GET /api/v3/ins-loan/product-infos
    productInfo(qsOrBody: object) {
        const url = '/api/v3/ins-loan/product-infos';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    // GET /api/v3/ins-loan/ensure-coins-convert
    ensureCoinsConvert(qsOrBody: object) {
        const url = '/api/v3/ins-loan/ensure-coins-convert';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    // GET /api/v3/ins-loan/symbols
    symbols(qsOrBody: object) {
        const url = '/api/v3/ins-loan/symbols';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    // GET /api/v3/ins-loan/loan-order
    loanOrder(qsOrBody: object) {
        const url = '/api/v3/ins-loan/loan-order';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    // GET /api/v3/ins-loan/repaid-history
    repayHistory(qsOrBody: object) {
        const url = '/api/v3/ins-loan/repaid-history';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    // GET /api/v3/ins-loan/ltv-convert
    ltvConvert(qsOrBody: object) {
        const url = '/api/v3/ins-loan/ltv-convert';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    // GET /api/v3/ins-loan/transfered
    transferAsset(qsOrBody: object) {
        const url = '/api/v3/ins-loan/transfered';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    // GET /api/v3/ins-loan/risk-unit
    riskUnit(qsOrBody: object) {
        const url = '/api/v3/ins-loan/risk-unit';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    // POST /api/v3/ins-loan/bind-uid
    bindUid(qsOrBody: object) {
        const url = '/api/v3/ins-loan/bind-uid';
        const headers = this.signer('POST', url, qsOrBody)
        return this.axiosInstance.post(url, qsOrBody, {headers})
    }
}
