package com.bitget.openapi.service.v3;

import com.bitget.openapi.api.v3.UtaCopyApi;
import com.bitget.openapi.common.client.ApiClient;
import com.bitget.openapi.common.utils.ResponseUtils;
import com.bitget.openapi.dto.response.ResponseResult;

import java.io.IOException;
import java.util.Map;

public class UtaCopyService {

    private final UtaCopyApi utaCopyApi;

    public UtaCopyService(ApiClient client) {
        utaCopyApi = client.create(UtaCopyApi.class);
    }

    public ResponseResult tradingPairs() throws IOException {
        return ResponseUtils.handleResponse(utaCopyApi.tradingPairs().execute().body());
    }

    public ResponseResult positionSummary() throws IOException {
        return ResponseUtils.handleResponse(utaCopyApi.positionSummary().execute().body());
    }

    public ResponseResult maxTransferable(Map<String, String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaCopyApi.maxTransferable(paramMap).execute().body());
    }

    public ResponseResult transfer(Map<String, Object> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaCopyApi.transfer(paramMap).execute().body());
    }

    public ResponseResult transferRecord(Map<String, String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaCopyApi.transferRecord(paramMap).execute().body());
    }
}
