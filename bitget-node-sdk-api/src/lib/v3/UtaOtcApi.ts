import {BaseApi} from '../BaseApi';

export class UtaOtcApi extends BaseApi {

    // GET /api/v3/p2p/ad-list
    getAdList(qsOrBody: object) {
        const url = '/api/v3/p2p/ad-list';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    // POST /api/v3/p2p/fee-simulate
    feeSimulate(qsOrBody: object) {
        const url = '/api/v3/p2p/fee-simulate';
        const headers = this.signer('POST', url, qsOrBody)
        return this.axiosInstance.post(url, qsOrBody, {headers})
    }

    // GET /api/v3/p2p/ad-limit
    getAdLimit(qsOrBody: object) {
        const url = '/api/v3/p2p/ad-limit';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    // POST /api/v3/p2p/ad-create
    createAd(qsOrBody: object) {
        const url = '/api/v3/p2p/ad-create';
        const headers = this.signer('POST', url, qsOrBody)
        return this.axiosInstance.post(url, qsOrBody, {headers})
    }

    // POST /api/v3/p2p/ad-update
    updateAd(qsOrBody: object) {
        const url = '/api/v3/p2p/ad-update';
        const headers = this.signer('POST', url, qsOrBody)
        return this.axiosInstance.post(url, qsOrBody, {headers})
    }

    // POST /api/v3/p2p/ad-operate
    operateAd(qsOrBody: object) {
        const url = '/api/v3/p2p/ad-operate';
        const headers = this.signer('POST', url, qsOrBody)
        return this.axiosInstance.post(url, qsOrBody, {headers})
    }

    // GET /api/v3/p2p/ad-info
    getAdInfo(qsOrBody: object) {
        const url = '/api/v3/p2p/ad-info';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    // GET /api/v3/p2p/my-ads
    getMyAds(qsOrBody: object) {
        const url = '/api/v3/p2p/my-ads';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    // GET /api/v3/p2p/pending-orders
    getPendingOrders(qsOrBody: object) {
        const url = '/api/v3/p2p/pending-orders';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    // GET /api/v3/p2p/all-orders
    getAllOrders(qsOrBody: object) {
        const url = '/api/v3/p2p/all-orders';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    // GET /api/v3/p2p/order-info
    getOrderInfo(qsOrBody: object) {
        const url = '/api/v3/p2p/order-info';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    // POST /api/v3/p2p/order-pay
    orderPay(qsOrBody: object) {
        const url = '/api/v3/p2p/order-pay';
        const headers = this.signer('POST', url, qsOrBody)
        return this.axiosInstance.post(url, qsOrBody, {headers})
    }

    // POST /api/v3/p2p/order-release
    orderRelease(qsOrBody: object) {
        const url = '/api/v3/p2p/order-release';
        const headers = this.signer('POST', url, qsOrBody)
        return this.axiosInstance.post(url, qsOrBody, {headers})
    }

    // GET /api/v3/p2p/user-info
    getUserInfo(qsOrBody: object) {
        const url = '/api/v3/p2p/user-info';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    // GET /api/v3/p2p/currencies
    getCurrencies(qsOrBody: object) {
        const url = '/api/v3/p2p/currencies';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    // GET /api/v3/p2p/pay-method
    getPayMethod(qsOrBody: object) {
        const url = '/api/v3/p2p/pay-method';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    // GET /api/v3/p2p/balance
    getBalance(qsOrBody: object) {
        const url = '/api/v3/p2p/balance';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    // GET /api/v3/p2p/exchange-rate
    getExchangeRate(qsOrBody: object) {
        const url = '/api/v3/p2p/exchange-rate';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }
}
