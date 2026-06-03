package com.bitget.openapi.api.v3;

import com.bitget.openapi.dto.response.ResponseResult;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

import java.util.Map;

public interface UtaTaxApi {

    @GET("/api/v3/tax/records")
    Call<ResponseResult> records(@QueryMap Map<String, String> paramMap);
}
