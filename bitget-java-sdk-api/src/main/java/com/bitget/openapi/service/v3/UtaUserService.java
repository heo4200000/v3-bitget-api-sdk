package com.bitget.openapi.service.v3;

import com.bitget.openapi.api.v3.UtaUserApi;
import com.bitget.openapi.common.client.ApiClient;
import com.bitget.openapi.common.utils.ResponseUtils;
import com.bitget.openapi.dto.response.ResponseResult;

import java.io.IOException;
import java.util.Map;

public class UtaUserService {

    private final UtaUserApi utaUserApi;

    public UtaUserService(ApiClient client) {
        utaUserApi = client.create(UtaUserApi.class);
    }

    public ResponseResult createSub(Map<String, Object> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaUserApi.createSub(paramMap).execute().body());
    }

    public ResponseResult modifySub(Map<String, Object> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaUserApi.modifySub(paramMap).execute().body());
    }

    public ResponseResult freezeSub(Map<String, Object> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaUserApi.freezeSub(paramMap).execute().body());
    }

    public ResponseResult subList(Map<String, String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaUserApi.subList(paramMap).execute().body());
    }

    public ResponseResult createSubApi(Map<String, Object> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaUserApi.createSubApi(paramMap).execute().body());
    }

    public ResponseResult updateSubApi(Map<String, Object> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaUserApi.updateSubApi(paramMap).execute().body());
    }

    public ResponseResult deleteSubApi(Map<String, Object> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaUserApi.deleteSubApi(paramMap).execute().body());
    }

    public ResponseResult agentCreate(Map<String, Object> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaUserApi.agentCreate(paramMap).execute().body());
    }

    public ResponseResult subApiList(Map<String, String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaUserApi.subApiList(paramMap).execute().body());
    }
}
