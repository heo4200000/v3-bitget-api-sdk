package com.bitget.openapi.service.v3;

import com.bitget.openapi.api.v3.UtaStrategyApi;
import com.bitget.openapi.common.client.ApiClient;
import com.bitget.openapi.common.utils.ResponseUtils;
import com.bitget.openapi.dto.response.ResponseResult;

import java.io.IOException;
import java.util.Map;

public class UtaStrategyService {

    private final UtaStrategyApi utaStrategyApi;

    public UtaStrategyService(ApiClient client) {
        utaStrategyApi = client.create(UtaStrategyApi.class);
    }

    public ResponseResult placeStrategyOrder(Map<String, Object> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaStrategyApi.placeStrategyOrder(paramMap).execute().body());
    }

    public ResponseResult modifyStrategyOrder(Map<String, Object> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaStrategyApi.modifyStrategyOrder(paramMap).execute().body());
    }

    public ResponseResult cancelStrategyOrder(Map<String, Object> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaStrategyApi.cancelStrategyOrder(paramMap).execute().body());
    }

    public ResponseResult unfilledStrategyOrders(Map<String, String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaStrategyApi.unfilledStrategyOrders(paramMap).execute().body());
    }

    public ResponseResult historyStrategyOrders(Map<String, String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaStrategyApi.historyStrategyOrders(paramMap).execute().body());
    }
}
