import {BaseApi} from '../BaseApi';

export class UtaTaxApi extends BaseApi {

    // GET /api/v3/tax/records
    records(qsOrBody: object) {
        const url = '/api/v3/tax/records';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }
}
