import {BaseApi} from '../BaseApi';

export class UtaMarketApi extends BaseApi {

    // GET /api/v3/market/time
    getTime() {
        const url = '/api/v3/market/time';
        const headers = this.signer('GET', url, null)
        return this.axiosInstance.get(url, {headers})
    }

    // GET /api/v3/market/instruments
    instruments(qsOrBody: object) {
        const url = '/api/v3/market/instruments';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    // GET /api/v3/market/tickers
    tickers(qsOrBody: object) {
        const url = '/api/v3/market/tickers';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    // GET /api/v3/market/fills
    fills(qsOrBody: object) {
        const url = '/api/v3/market/fills';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    // GET /api/v3/market/orderbook
    orderbook(qsOrBody: object) {
        const url = '/api/v3/market/orderbook';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    // GET /api/v3/market/rpi-orderbook
    rpiOrderbook(qsOrBody: object) {
        const url = '/api/v3/market/rpi-orderbook';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    // GET /api/v3/market/candles
    candles(qsOrBody: object) {
        const url = '/api/v3/market/candles';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    // GET /api/v3/market/history-candles
    historyCandles(qsOrBody: object) {
        const url = '/api/v3/market/history-candles';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    // GET /api/v3/market/open-interest
    openInterest(qsOrBody: object) {
        const url = '/api/v3/market/open-interest';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    // GET /api/v3/market/history-fund-rate
    historyFundRate(qsOrBody: object) {
        const url = '/api/v3/market/history-fund-rate';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    // GET /api/v3/market/risk-reserve
    riskReserve(qsOrBody: object) {
        const url = '/api/v3/market/risk-reserve';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    // GET /api/v3/market/risk-reserve-all
    riskReserveAll(qsOrBody: object) {
        const url = '/api/v3/market/risk-reserve-all';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    // GET /api/v3/market/discount-rate
    discountRate() {
        const url = '/api/v3/market/discount-rate';
        const headers = this.signer('GET', url, null)
        return this.axiosInstance.get(url, {headers})
    }

    // GET /api/v3/market/margin-loans
    marginLoans(qsOrBody: object) {
        const url = '/api/v3/market/margin-loans';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    // GET /api/v3/market/position-tier
    positionTier(qsOrBody: object) {
        const url = '/api/v3/market/position-tier';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    // GET /api/v3/market/current-fund-rate
    currentFundRate(qsOrBody: object) {
        const url = '/api/v3/market/current-fund-rate';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    // GET /api/v3/market/oi-limit
    oiLimit(qsOrBody: object) {
        const url = '/api/v3/market/oi-limit';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    // GET /api/v3/market/proof-of-reserves
    proofOfReserves() {
        const url = '/api/v3/market/proof-of-reserves';
        const headers = this.signer('GET', url, null)
        return this.axiosInstance.get(url, {headers})
    }

    // GET /api/v3/market/por
    por() {
        const url = '/api/v3/market/por';
        const headers = this.signer('GET', url, null)
        return this.axiosInstance.get(url, {headers})
    }

    // GET /api/v3/market/risk-reserve-hour
    riskReserveHour(qsOrBody: object) {
        const url = '/api/v3/market/risk-reserve-hour';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    // GET /api/v3/market/index-components
    indexComponents(qsOrBody: object) {
        const url = '/api/v3/market/index-components';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    // GET /api/v3/market/fee-group
    feeGroup(qsOrBody: object) {
        const url = '/api/v3/market/fee-group';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    // GET /api/v3/market/score-weights
    scoreWeights(qsOrBody: object) {
        const url = '/api/v3/market/score-weights';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }
}
