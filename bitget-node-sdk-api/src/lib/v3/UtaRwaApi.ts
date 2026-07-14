import {BaseApi} from '../BaseApi';

export class UtaRwaApi extends BaseApi {

    // GET /api/v3/corporate-action/claim-info
    claimInfo(qsOrBody: object) {
        const url = '/api/v3/corporate-action/claim-info';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }
}
