package com.bitget.openapi.service.v3;

import com.bitget.openapi.api.v3.UtaLoanApi;
import com.bitget.openapi.common.client.ApiClient;
import com.bitget.openapi.common.utils.ResponseUtils;
import com.bitget.openapi.dto.response.ResponseResult;

import java.io.IOException;
import java.util.Map;

public class UtaLoanService {

    private final UtaLoanApi utaLoanApi;

    public UtaLoanService(ApiClient client) {
        utaLoanApi = client.create(UtaLoanApi.class);
    }

    public ResponseResult coins(Map<String, String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaLoanApi.coins(paramMap).execute().body());
    }

    public ResponseResult interest(Map<String, String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaLoanApi.interest(paramMap).execute().body());
    }

    public ResponseResult borrow(Map<String, Object> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaLoanApi.borrow(paramMap).execute().body());
    }

    public ResponseResult borrowOngoing(Map<String, String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaLoanApi.borrowOngoing(paramMap).execute().body());
    }

    public ResponseResult borrowHistory(Map<String, String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaLoanApi.borrowHistory(paramMap).execute().body());
    }

    public ResponseResult repay(Map<String, Object> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaLoanApi.repay(paramMap).execute().body());
    }

    public ResponseResult repayHistory(Map<String, String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaLoanApi.repayHistory(paramMap).execute().body());
    }

    public ResponseResult revisePledge(Map<String, Object> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaLoanApi.revisePledge(paramMap).execute().body());
    }

    public ResponseResult pledgeRateHistory(Map<String, String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaLoanApi.pledgeRateHistory(paramMap).execute().body());
    }

    public ResponseResult debts() throws IOException {
        return ResponseUtils.handleResponse(utaLoanApi.debts().execute().body());
    }

    public ResponseResult reduces(Map<String, String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaLoanApi.reduces(paramMap).execute().body());
    }
}
