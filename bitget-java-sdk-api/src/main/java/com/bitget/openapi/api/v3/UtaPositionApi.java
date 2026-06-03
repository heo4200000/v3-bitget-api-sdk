package com.bitget.openapi.api.v3;

import com.bitget.openapi.dto.response.ResponseResult;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

import java.util.Map;

public interface UtaPositionApi {

    @GET("/api/v3/position/current-position")
    Call<ResponseResult> currentPosition(@QueryMap Map<String, String> paramMap);

    @GET("/api/v3/position/history-position")
    Call<ResponseResult> historyPosition(@QueryMap Map<String, String> paramMap);

    @GET("/api/v3/position/adlRank")
    Call<ResponseResult> adlRank();
}
