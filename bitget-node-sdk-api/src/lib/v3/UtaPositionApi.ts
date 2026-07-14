import {BaseApi} from '../BaseApi';

export class UtaPositionApi extends BaseApi {

    // GET /api/v3/position/current-position
    currentPosition(qsOrBody: object) {
        const url = '/api/v3/position/current-position';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    // GET /api/v3/position/history-position
    historyPosition(qsOrBody: object) {
        const url = '/api/v3/position/history-position';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    // GET /api/v3/position/adlRank
    adlRank(qsOrBody: object) {
        const url = '/api/v3/position/adlRank';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }
}
