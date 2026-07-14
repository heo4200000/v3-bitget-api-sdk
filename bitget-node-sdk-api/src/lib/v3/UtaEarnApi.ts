import {BaseApi} from '../BaseApi';

export class UtaEarnApi extends BaseApi {

    // GET /api/v3/earn/elite-product
    getEliteProductList(qsOrBody: object) {
        const url = '/api/v3/earn/elite-product';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    // GET /api/v3/earn/elite-assets
    getEliteAssets(qsOrBody: object) {
        const url = '/api/v3/earn/elite-assets';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    // GET /api/v3/earn/elite-records
    getEliteRecords(qsOrBody: object) {
        const url = '/api/v3/earn/elite-records';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    // GET /api/v3/earn/elite-subscribe-info
    getEliteSubscribeInfo(qsOrBody: object) {
        const url = '/api/v3/earn/elite-subscribe-info';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    // POST /api/v3/earn/elite-subscribe
    eliteSubscribe(qsOrBody: object) {
        const url = '/api/v3/earn/elite-subscribe';
        const headers = this.signer('POST', url, qsOrBody)
        return this.axiosInstance.post(url, qsOrBody, {headers})
    }

    // GET /api/v3/earn/elite-subscribe-result
    getEliteSubscribeResult(qsOrBody: object) {
        const url = '/api/v3/earn/elite-subscribe-result';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    // GET /api/v3/earn/elite-redeem-info
    getEliteRedeemInfo(qsOrBody: object) {
        const url = '/api/v3/earn/elite-redeem-info';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    // POST /api/v3/earn/elite-redeem
    eliteRedeem(qsOrBody: object) {
        const url = '/api/v3/earn/elite-redeem';
        const headers = this.signer('POST', url, qsOrBody)
        return this.axiosInstance.post(url, qsOrBody, {headers})
    }
}
