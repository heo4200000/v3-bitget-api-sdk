package com.bitget.openapi.service.v3;

import com.bitget.openapi.api.v3.UtaPositionApi;
import com.bitget.openapi.common.client.ApiClient;
import com.bitget.openapi.common.utils.ResponseUtils;
import com.bitget.openapi.dto.response.ResponseResult;

import java.io.IOException;
import java.util.Map;

public class UtaPositionService {

    private final UtaPositionApi utaPositionApi;

    public UtaPositionService(ApiClient client) {
        utaPositionApi = client.create(UtaPositionApi.class);
    }

    public ResponseResult currentPosition(Map<String, String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaPositionApi.currentPosition(paramMap).execute().body());
    }

    public ResponseResult historyPosition(Map<String, String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaPositionApi.historyPosition(paramMap).execute().body());
    }

    public ResponseResult adlRank() throws IOException {
        return ResponseUtils.handleResponse(utaPositionApi.adlRank().execute().body());
    }
}
