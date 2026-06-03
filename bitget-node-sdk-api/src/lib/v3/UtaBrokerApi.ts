import {BaseApi} from '../BaseApi';

export class UtaBrokerApi extends BaseApi {

    // POST /api/v3/broker/create-sub
    createSub(qsOrBody: object) {
        const url = '/api/v3/broker/create-sub';
        const headers = this.signer('POST', url, qsOrBody)
        return this.axiosInstance.post(url, qsOrBody, {headers})
    }

    // GET /api/v3/broker/sub-list
    subList(qsOrBody: object) {
        const url = '/api/v3/broker/sub-list';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    // POST /api/v3/broker/modify-sub
    modifySub(qsOrBody: object) {
        const url = '/api/v3/broker/modify-sub';
        const headers = this.signer('POST', url, qsOrBody)
        return this.axiosInstance.post(url, qsOrBody, {headers})
    }

    // POST /api/v3/broker/sub-withdrawal
    subWithdrawal(qsOrBody: object) {
        const url = '/api/v3/broker/sub-withdrawal';
        const headers = this.signer('POST', url, qsOrBody)
        return this.axiosInstance.post(url, qsOrBody, {headers})
    }

    // POST /api/v3/broker/sub-deposit-address
    subDepositAddress(qsOrBody: object) {
        const url = '/api/v3/broker/sub-deposit-address';
        const headers = this.signer('POST', url, qsOrBody)
        return this.axiosInstance.post(url, qsOrBody, {headers})
    }

    // GET /api/v3/broker/all-sub-deposit-withdrawal
    allSubDepositWithdrawal(qsOrBody: object) {
        const url = '/api/v3/broker/all-sub-deposit-withdrawal';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    // POST /api/v3/broker/create-sub-apikey
    createSubApikey(qsOrBody: object) {
        const url = '/api/v3/broker/create-sub-apikey';
        const headers = this.signer('POST', url, qsOrBody)
        return this.axiosInstance.post(url, qsOrBody, {headers})
    }

    // POST /api/v3/broker/modify-sub-apikey
    modifySubApikey(qsOrBody: object) {
        const url = '/api/v3/broker/modify-sub-apikey';
        const headers = this.signer('POST', url, qsOrBody)
        return this.axiosInstance.post(url, qsOrBody, {headers})
    }

    // POST /api/v3/broker/delete-sub-apikey
    deleteSubApikey(qsOrBody: object) {
        const url = '/api/v3/broker/delete-sub-apikey';
        const headers = this.signer('POST', url, qsOrBody)
        return this.axiosInstance.post(url, qsOrBody, {headers})
    }

    // GET /api/v3/broker/query-sub-apikey
    querySubApikey(qsOrBody: object) {
        const url = '/api/v3/broker/query-sub-apikey';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    // GET /api/v3/broker/commission
    commission(qsOrBody: object) {
        const url = '/api/v3/broker/commission';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }
}
