import {BaseApi} from '../BaseApi';

export class UtaUserApi extends BaseApi {

    // POST /api/v3/user/create-sub
    createSub(qsOrBody: object) {
        const url = '/api/v3/user/create-sub';
        const headers = this.signer('POST', url, qsOrBody)
        return this.axiosInstance.post(url, qsOrBody, {headers})
    }

    // POST /api/v3/user/modify-sub
    modifySub(qsOrBody: object) {
        const url = '/api/v3/user/modify-sub';
        const headers = this.signer('POST', url, qsOrBody)
        return this.axiosInstance.post(url, qsOrBody, {headers})
    }

    // POST /api/v3/user/freeze-sub
    freezeSub(qsOrBody: object) {
        const url = '/api/v3/user/freeze-sub';
        const headers = this.signer('POST', url, qsOrBody)
        return this.axiosInstance.post(url, qsOrBody, {headers})
    }

    // GET /api/v3/user/sub-list
    subList(qsOrBody: object) {
        const url = '/api/v3/user/sub-list';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    // POST /api/v3/user/create-sub-api
    createSubApi(qsOrBody: object) {
        const url = '/api/v3/user/create-sub-api';
        const headers = this.signer('POST', url, qsOrBody)
        return this.axiosInstance.post(url, qsOrBody, {headers})
    }

    // POST /api/v3/user/update-sub-api
    updateSubApi(qsOrBody: object) {
        const url = '/api/v3/user/update-sub-api';
        const headers = this.signer('POST', url, qsOrBody)
        return this.axiosInstance.post(url, qsOrBody, {headers})
    }

    // POST /api/v3/user/delete-sub-api
    deleteSubApi(qsOrBody: object) {
        const url = '/api/v3/user/delete-sub-api';
        const headers = this.signer('POST', url, qsOrBody)
        return this.axiosInstance.post(url, qsOrBody, {headers})
    }

    // POST /api/v3/user/sub-account/agent-create
    agentCreate(qsOrBody: object) {
        const url = '/api/v3/user/sub-account/agent-create';
        const headers = this.signer('POST', url, qsOrBody)
        return this.axiosInstance.post(url, qsOrBody, {headers})
    }

    // GET /api/v3/user/sub-api-list
    subApiList(qsOrBody: object) {
        const url = '/api/v3/user/sub-api-list';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }
}
