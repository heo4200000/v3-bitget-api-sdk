package com.bitget.openapi.api.v3;

import com.bitget.openapi.dto.response.ResponseResult;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.QueryMap;

import java.util.Map;

public interface UtaLoanApi {

    @GET("/api/v3/loan/coins")
    Call<ResponseResult> coins(@QueryMap Map<String, String> paramMap);

    @GET("/api/v3/loan/interest")
    Call<ResponseResult> interest(@QueryMap Map<String, String> paramMap);

    @POST("/api/v3/loan/borrow")
    Call<ResponseResult> borrow(@Body Map<String, Object> paramMap);

    @GET("/api/v3/loan/borrow-ongoing")
    Call<ResponseResult> borrowOngoing(@QueryMap Map<String, String> paramMap);

    @GET("/api/v3/loan/borrow-history")
    Call<ResponseResult> borrowHistory(@QueryMap Map<String, String> paramMap);

    @POST("/api/v3/loan/repay")
    Call<ResponseResult> repay(@Body Map<String, Object> paramMap);

    @GET("/api/v3/loan/repay-history")
    Call<ResponseResult> repayHistory(@QueryMap Map<String, String> paramMap);

    @POST("/api/v3/loan/revise-pledge")
    Call<ResponseResult> revisePledge(@Body Map<String, Object> paramMap);

    @GET("/api/v3/loan/pledge-rate-history")
    Call<ResponseResult> pledgeRateHistory(@QueryMap Map<String, String> paramMap);

    @GET("/api/v3/loan/debts")
    Call<ResponseResult> debts();

    @GET("/api/v3/loan/reduces")
    Call<ResponseResult> reduces(@QueryMap Map<String, String> paramMap);
}
