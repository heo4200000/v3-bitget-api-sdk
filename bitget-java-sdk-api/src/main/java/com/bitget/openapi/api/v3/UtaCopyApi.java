package com.bitget.openapi.api.v3;

import com.bitget.openapi.dto.response.ResponseResult;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.QueryMap;

import java.util.Map;

public interface UtaCopyApi {

    // -------- trader info --------

    @GET("/api/v3/copy/futures/trading-pairs")
    Call<ResponseResult> tradingPairs();

    @GET("/api/v3/copy/futures/position-summary")
    Call<ResponseResult> positionSummary();

    // -------- copy trading transfer --------

    @GET("/api/v3/copy/futures/max-transferable")
    Call<ResponseResult> maxTransferable(@QueryMap Map<String, String> paramMap);

    @POST("/api/v3/copy/futures/transfer")
    Call<ResponseResult> transfer(@Body Map<String, Object> paramMap);

    @GET("/api/v3/copy/futures/transfer-record")
    Call<ResponseResult> transferRecord(@QueryMap Map<String, String> paramMap);
}
