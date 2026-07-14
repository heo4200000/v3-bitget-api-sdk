import {BaseApi} from '../BaseApi';

export class UtaLoanApi extends BaseApi {

    // GET /api/v3/loan/coins
    coinInfos(qsOrBody: object) {
        const url = '/api/v3/loan/coins';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    // GET /api/v3/loan/interest
    interests(qsOrBody: object) {
        const url = '/api/v3/loan/interest';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    // POST /api/v3/loan/borrow
    borrow(qsOrBody: object) {
        const url = '/api/v3/loan/borrow';
        const headers = this.signer('POST', url, qsOrBody)
        return this.axiosInstance.post(url, qsOrBody, {headers})
    }

    // GET /api/v3/loan/borrow-ongoing
    loanOrders(qsOrBody: object) {
        const url = '/api/v3/loan/borrow-ongoing';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    // GET /api/v3/loan/borrow-history
    borrowHistory(qsOrBody: object) {
        const url = '/api/v3/loan/borrow-history';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    // POST /api/v3/loan/repay
    repay(qsOrBody: object) {
        const url = '/api/v3/loan/repay';
        const headers = this.signer('POST', url, qsOrBody)
        return this.axiosInstance.post(url, qsOrBody, {headers})
    }

    // GET /api/v3/loan/repay-history
    repayHistory(qsOrBody: object) {
        const url = '/api/v3/loan/repay-history';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    // POST /api/v3/loan/revise-pledge
    revisePledge(qsOrBody: object) {
        const url = '/api/v3/loan/revise-pledge';
        const headers = this.signer('POST', url, qsOrBody)
        return this.axiosInstance.post(url, qsOrBody, {headers})
    }

    // GET /api/v3/loan/pledge-rate-history
    pledgeRateHistory(qsOrBody: object) {
        const url = '/api/v3/loan/pledge-rate-history';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    // GET /api/v3/loan/debts
    debts(qsOrBody: object) {
        const url = '/api/v3/loan/debts';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    // GET /api/v3/loan/reduces
    reduces(qsOrBody: object) {
        const url = '/api/v3/loan/reduces';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }
}
