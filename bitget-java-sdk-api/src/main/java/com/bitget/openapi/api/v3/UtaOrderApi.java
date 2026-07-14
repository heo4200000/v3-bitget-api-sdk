package com.bitget.openapi.api.v3;

import com.bitget.openapi.dto.response.ResponseResult;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.QueryMap;

import java.util.List;
import java.util.Map;

public interface UtaOrderApi {

    // -------- normal order --------

    @POST("/api/v3/trade/place-order")
    Call<ResponseResult> placeOrder(@Body Map<String, Object> paramMap);

    @POST("/api/v3/trade/cancel-order")
    Call<ResponseResult> cancelOrder(@Body Map<String, Object> paramMap);

    @POST("/api/v3/trade/cancel-symbol-order")
    Call<ResponseResult> cancelSymbolOrder(@Body Map<String, Object> paramMap);

    @POST("/api/v3/trade/close-positions")
    Call<ResponseResult> closePositions(@Body Map<String, Object> paramMap);

    @GET("/api/v3/trade/order-info")
    Call<ResponseResult> orderInfo(@QueryMap Map<String, String> paramMap);

    @GET("/api/v3/trade/unfilled-orders")
    Call<ResponseResult> unfilledOrders(@QueryMap Map<String, String> paramMap);

    @GET("/api/v3/trade/history-orders")
    Call<ResponseResult> historyOrders(@QueryMap Map<String, String> paramMap);

    @GET("/api/v3/trade/fills")
    Call<ResponseResult> fills(@QueryMap Map<String, String> paramMap);

    @GET("/api/v3/trade/unfilled-orders-realtime")
    Call<ResponseResult> unfilledOrdersRealtime(@QueryMap Map<String, String> paramMap);

    // -------- batch order --------

    @POST("/api/v3/trade/place-batch")
    Call<ResponseResult> placeBatch(@Body List<Map<String, Object>> paramList);

    @POST("/api/v3/trade/cancel-batch")
    Call<ResponseResult> cancelBatch(@Body List<Map<String, Object>> paramList);

    @POST("/api/v3/trade/modify-order")
    Call<ResponseResult> modifyOrder(@Body Map<String, Object> paramMap);

    @POST("/api/v3/trade/batch-modify-order")
    Call<ResponseResult> batchModifyOrder(@Body List<Map<String, Object>> paramList);

    // -------- countdown --------

    @POST("/api/v3/trade/countdown-cancel-all")
    Call<ResponseResult> countdownCancelAll(@Body Map<String, Object> paramMap);
}
