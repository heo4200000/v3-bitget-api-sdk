package com.bitget.openapi.api.v3;

import com.bitget.openapi.dto.response.ResponseResult;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.QueryMap;

import java.util.Map;

public interface UtaBrokerApi {

    @POST("/api/v3/broker/create-sub")
    Call<ResponseResult> createSub(@Body Map<String, Object> paramMap);

    @GET("/api/v3/broker/sub-list")
    Call<ResponseResult> subList(@QueryMap Map<String, String> paramMap);

    @POST("/api/v3/broker/modify-sub")
    Call<ResponseResult> modifySub(@Body Map<String, Object> paramMap);

    @POST("/api/v3/broker/sub-withdrawal")
    Call<ResponseResult> subWithdrawal(@Body Map<String, Object> paramMap);

    @POST("/api/v3/broker/sub-deposit-address")
    Call<ResponseResult> subDepositAddress(@Body Map<String, Object> paramMap);

    @GET("/api/v3/broker/all-sub-deposit-withdrawal")
    Call<ResponseResult> allSubDepositWithdrawal(@QueryMap Map<String, String> paramMap);

    @POST("/api/v3/broker/create-sub-apikey")
    Call<ResponseResult> createSubApikey(@Body Map<String, Object> paramMap);

    @POST("/api/v3/broker/modify-sub-apikey")
    Call<ResponseResult> modifySubApikey(@Body Map<String, Object> paramMap);

    @POST("/api/v3/broker/delete-sub-apikey")
    Call<ResponseResult> deleteSubApikey(@Body Map<String, Object> paramMap);

    @GET("/api/v3/broker/query-sub-apikey")
    Call<ResponseResult> querySubApikey(@QueryMap Map<String, String> paramMap);

    @GET("/api/v3/broker/commission")
    Call<ResponseResult> commission(@QueryMap Map<String, String> paramMap);
}
