package com.bitget.openapi.api.v3;

import com.bitget.openapi.dto.response.ResponseResult;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.QueryMap;

import java.util.Map;

public interface UtaStrategyApi {

    @POST("/api/v3/trade/place-strategy-order")
    Call<ResponseResult> placeStrategyOrder(@Body Map<String, Object> paramMap);

    @POST("/api/v3/trade/modify-strategy-order")
    Call<ResponseResult> modifyStrategyOrder(@Body Map<String, Object> paramMap);

    @POST("/api/v3/trade/cancel-strategy-order")
    Call<ResponseResult> cancelStrategyOrder(@Body Map<String, Object> paramMap);

    @GET("/api/v3/trade/unfilled-strategy-orders")
    Call<ResponseResult> unfilledStrategyOrders(@QueryMap Map<String, String> paramMap);

    @GET("/api/v3/trade/history-strategy-orders")
    Call<ResponseResult> historyStrategyOrders(@QueryMap Map<String, String> paramMap);
}
