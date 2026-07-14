package com.bitget.openapi.service.v3;

import com.bitget.openapi.api.v3.UtaTaxApi;
import com.bitget.openapi.common.client.ApiClient;
import com.bitget.openapi.common.utils.ResponseUtils;
import com.bitget.openapi.dto.response.ResponseResult;

import java.io.IOException;
import java.util.Map;

public class UtaTaxService {

    private final UtaTaxApi utaTaxApi;

    public UtaTaxService(ApiClient client) {
        utaTaxApi = client.create(UtaTaxApi.class);
    }

    public ResponseResult records(Map<String, String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaTaxApi.records(paramMap).execute().body());
    }
}
