package com.bitget.openapi.service.v3;

import com.bitget.openapi.api.v3.UtaOrderApi;
import com.bitget.openapi.common.client.ApiClient;
import com.bitget.openapi.common.utils.ResponseUtils;
import com.bitget.openapi.dto.response.ResponseResult;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class UtaOrderService {

    private final UtaOrderApi utaOrderApi;

    public UtaOrderService(ApiClient client) {
        utaOrderApi = client.create(UtaOrderApi.class);
    }

    public ResponseResult placeOrder(Map<String, Object> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaOrderApi.placeOrder(paramMap).execute().body());
    }

    public ResponseResult cancelOrder(Map<String, Object> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaOrderApi.cancelOrder(paramMap).execute().body());
    }

    public ResponseResult cancelSymbolOrder(Map<String, Object> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaOrderApi.cancelSymbolOrder(paramMap).execute().body());
    }

    public ResponseResult closePositions(Map<String, Object> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaOrderApi.closePositions(paramMap).execute().body());
    }

    public ResponseResult orderInfo(Map<String, String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaOrderApi.orderInfo(paramMap).execute().body());
    }

    public ResponseResult unfilledOrders(Map<String, String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaOrderApi.unfilledOrders(paramMap).execute().body());
    }

    public ResponseResult historyOrders(Map<String, String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaOrderApi.historyOrders(paramMap).execute().body());
    }

    public ResponseResult fills(Map<String, String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaOrderApi.fills(paramMap).execute().body());
    }

    public ResponseResult unfilledOrdersRealtime(Map<String, String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaOrderApi.unfilledOrdersRealtime(paramMap).execute().body());
    }

    public ResponseResult placeBatch(List<Map<String, Object>> paramList) throws IOException {
        return ResponseUtils.handleResponse(utaOrderApi.placeBatch(paramList).execute().body());
    }

    public ResponseResult cancelBatch(List<Map<String, Object>> paramList) throws IOException {
        return ResponseUtils.handleResponse(utaOrderApi.cancelBatch(paramList).execute().body());
    }

    public ResponseResult modifyOrder(Map<String, Object> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaOrderApi.modifyOrder(paramMap).execute().body());
    }

    public ResponseResult batchModifyOrder(List<Map<String, Object>> paramList) throws IOException {
        return ResponseUtils.handleResponse(utaOrderApi.batchModifyOrder(paramList).execute().body());
    }

    public ResponseResult countdownCancelAll(Map<String, Object> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaOrderApi.countdownCancelAll(paramMap).execute().body());
    }
}
