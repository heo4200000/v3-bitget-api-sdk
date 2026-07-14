package com.bitget.openapi.service.v3;

import com.bitget.openapi.api.v3.UtaBrokerApi;
import com.bitget.openapi.common.client.ApiClient;
import com.bitget.openapi.common.utils.ResponseUtils;
import com.bitget.openapi.dto.response.ResponseResult;

import java.io.IOException;
import java.util.Map;

public class UtaBrokerService {

    private final UtaBrokerApi utaBrokerApi;

    public UtaBrokerService(ApiClient client) {
        utaBrokerApi = client.create(UtaBrokerApi.class);
    }

    public ResponseResult createSub(Map<String, Object> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaBrokerApi.createSub(paramMap).execute().body());
    }

    public ResponseResult subList(Map<String, String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaBrokerApi.subList(paramMap).execute().body());
    }

    public ResponseResult modifySub(Map<String, Object> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaBrokerApi.modifySub(paramMap).execute().body());
    }

    public ResponseResult subWithdrawal(Map<String, Object> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaBrokerApi.subWithdrawal(paramMap).execute().body());
    }

    public ResponseResult subDepositAddress(Map<String, Object> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaBrokerApi.subDepositAddress(paramMap).execute().body());
    }

    public ResponseResult allSubDepositWithdrawal(Map<String, String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaBrokerApi.allSubDepositWithdrawal(paramMap).execute().body());
    }

    public ResponseResult createSubApikey(Map<String, Object> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaBrokerApi.createSubApikey(paramMap).execute().body());
    }

    public ResponseResult modifySubApikey(Map<String, Object> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaBrokerApi.modifySubApikey(paramMap).execute().body());
    }

    public ResponseResult deleteSubApikey(Map<String, Object> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaBrokerApi.deleteSubApikey(paramMap).execute().body());
    }

    public ResponseResult querySubApikey(Map<String, String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaBrokerApi.querySubApikey(paramMap).execute().body());
    }

    public ResponseResult commission(Map<String, String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaBrokerApi.commission(paramMap).execute().body());
    }
}
