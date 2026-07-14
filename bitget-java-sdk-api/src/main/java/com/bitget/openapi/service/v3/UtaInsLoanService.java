package com.bitget.openapi.service.v3;

import com.bitget.openapi.api.v3.UtaInsLoanApi;
import com.bitget.openapi.common.client.ApiClient;
import com.bitget.openapi.common.utils.ResponseUtils;
import com.bitget.openapi.dto.response.ResponseResult;

import java.io.IOException;
import java.util.Map;

public class UtaInsLoanService {

    private final UtaInsLoanApi utaInsLoanApi;

    public UtaInsLoanService(ApiClient client) {
        utaInsLoanApi = client.create(UtaInsLoanApi.class);
    }

    public ResponseResult productInfos(Map<String, String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaInsLoanApi.productInfos(paramMap).execute().body());
    }

    public ResponseResult ensureCoinsConvert(Map<String, String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaInsLoanApi.ensureCoinsConvert(paramMap).execute().body());
    }

    public ResponseResult symbols(Map<String, String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaInsLoanApi.symbols(paramMap).execute().body());
    }

    public ResponseResult loanOrder(Map<String, String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaInsLoanApi.loanOrder(paramMap).execute().body());
    }

    public ResponseResult repaidHistory(Map<String, String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaInsLoanApi.repaidHistory(paramMap).execute().body());
    }

    public ResponseResult ltvConvert(Map<String, String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaInsLoanApi.ltvConvert(paramMap).execute().body());
    }

    public ResponseResult transfered(Map<String, String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaInsLoanApi.transfered(paramMap).execute().body());
    }

    public ResponseResult riskUnit() throws IOException {
        return ResponseUtils.handleResponse(utaInsLoanApi.riskUnit().execute().body());
    }

    public ResponseResult bindUid(Map<String, Object> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaInsLoanApi.bindUid(paramMap).execute().body());
    }
}
