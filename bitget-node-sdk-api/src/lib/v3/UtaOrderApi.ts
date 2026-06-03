import {BaseApi} from '../BaseApi';

// Covers trade orders, strategy orders, and countdown cancel.
// Merged from: UtaOrderController, UtaStrategyController, UtaCountdownController
export class UtaOrderApi extends BaseApi {

    // -------- order --------

    // POST /api/v3/trade/place-order
    placeOrder(qsOrBody: object) {
        const url = '/api/v3/trade/place-order';
        const headers = this.signer('POST', url, qsOrBody)
        return this.axiosInstance.post(url, qsOrBody, {headers})
    }

    // POST /api/v3/trade/cancel-order
    cancelOrder(qsOrBody: object) {
        const url = '/api/v3/trade/cancel-order';
        const headers = this.signer('POST', url, qsOrBody)
        return this.axiosInstance.post(url, qsOrBody, {headers})
    }

    // POST /api/v3/trade/cancel-symbol-order
    cancelSymbolOrder(qsOrBody: object) {
        const url = '/api/v3/trade/cancel-symbol-order';
        const headers = this.signer('POST', url, qsOrBody)
        return this.axiosInstance.post(url, qsOrBody, {headers})
    }

    // POST /api/v3/trade/close-positions
    closePositions(qsOrBody: object) {
        const url = '/api/v3/trade/close-positions';
        const headers = this.signer('POST', url, qsOrBody)
        return this.axiosInstance.post(url, qsOrBody, {headers})
    }

    // GET /api/v3/trade/order-info
    orderInfo(qsOrBody: object) {
        const url = '/api/v3/trade/order-info';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    // GET /api/v3/trade/unfilled-orders
    unfilledOrders(qsOrBody: object) {
        const url = '/api/v3/trade/unfilled-orders';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    // GET /api/v3/trade/history-orders
    historyOrders(qsOrBody: object) {
        const url = '/api/v3/trade/history-orders';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    // GET /api/v3/trade/fills
    fills(qsOrBody: object) {
        const url = '/api/v3/trade/fills';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    // POST /api/v3/trade/place-batch
    placeBatch(qsOrBody: object) {
        const url = '/api/v3/trade/place-batch';
        const headers = this.signer('POST', url, qsOrBody)
        return this.axiosInstance.post(url, qsOrBody, {headers})
    }

    // POST /api/v3/trade/cancel-batch
    cancelBatch(qsOrBody: object) {
        const url = '/api/v3/trade/cancel-batch';
        const headers = this.signer('POST', url, qsOrBody)
        return this.axiosInstance.post(url, qsOrBody, {headers})
    }

    // POST /api/v3/trade/modify-order
    modifyOrder(qsOrBody: object) {
        const url = '/api/v3/trade/modify-order';
        const headers = this.signer('POST', url, qsOrBody)
        return this.axiosInstance.post(url, qsOrBody, {headers})
    }

    // POST /api/v3/trade/batch-modify-order
    batchModifyOrder(qsOrBody: object) {
        const url = '/api/v3/trade/batch-modify-order';
        const headers = this.signer('POST', url, qsOrBody)
        return this.axiosInstance.post(url, qsOrBody, {headers})
    }

    // GET /api/v3/trade/unfilled-orders-realtime
    unfilledOrdersRealtime(qsOrBody: object) {
        const url = '/api/v3/trade/unfilled-orders-realtime';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    // -------- strategy order --------

    // POST /api/v3/trade/place-strategy-order
    placeStrategyOrder(qsOrBody: object) {
        const url = '/api/v3/trade/place-strategy-order';
        const headers = this.signer('POST', url, qsOrBody)
        return this.axiosInstance.post(url, qsOrBody, {headers})
    }

    // POST /api/v3/trade/modify-strategy-order
    modifyStrategyOrder(qsOrBody: object) {
        const url = '/api/v3/trade/modify-strategy-order';
        const headers = this.signer('POST', url, qsOrBody)
        return this.axiosInstance.post(url, qsOrBody, {headers})
    }

    // POST /api/v3/trade/cancel-strategy-order
    cancelStrategyOrder(qsOrBody: object) {
        const url = '/api/v3/trade/cancel-strategy-order';
        const headers = this.signer('POST', url, qsOrBody)
        return this.axiosInstance.post(url, qsOrBody, {headers})
    }

    // GET /api/v3/trade/unfilled-strategy-orders
    unfilledStrategyOrders(qsOrBody: object) {
        const url = '/api/v3/trade/unfilled-strategy-orders';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    // GET /api/v3/trade/history-strategy-orders
    historyStrategyOrders(qsOrBody: object) {
        const url = '/api/v3/trade/history-strategy-orders';
        const headers = this.signer('GET', url, qsOrBody)
        return this.axiosInstance.get(url, {headers, params: qsOrBody})
    }

    // -------- countdown cancel --------

    // POST /api/v3/trade/countdown-cancel-all
    countdownCancelAll(qsOrBody: object) {
        const url = '/api/v3/trade/countdown-cancel-all';
        const headers = this.signer('POST', url, qsOrBody)
        return this.axiosInstance.post(url, qsOrBody, {headers})
    }
}
