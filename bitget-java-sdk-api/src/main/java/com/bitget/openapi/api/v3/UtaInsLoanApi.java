package com.bitget.openapi.api.v3;

import com.bitget.openapi.dto.response.ResponseResult;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.QueryMap;

import java.util.Map;

public interface UtaInsLoanApi {

    @GET("/api/v3/ins-loan/product-infos")
    Call<ResponseResult> productInfos(@QueryMap Map<String, String> paramMap);

    @GET("/api/v3/ins-loan/ensure-coins-convert")
    Call<ResponseResult> ensureCoinsConvert(@QueryMap Map<String, String> paramMap);

    @GET("/api/v3/ins-loan/symbols")
    Call<ResponseResult> symbols(@QueryMap Map<String, String> paramMap);

    @GET("/api/v3/ins-loan/loan-order")
    Call<ResponseResult> loanOrder(@QueryMap Map<String, String> paramMap);

    @GET("/api/v3/ins-loan/repaid-history")
    Call<ResponseResult> repaidHistory(@QueryMap Map<String, String> paramMap);

    @GET("/api/v3/ins-loan/ltv-convert")
    Call<ResponseResult> ltvConvert(@QueryMap Map<String, String> paramMap);

    @GET("/api/v3/ins-loan/transfered")
    Call<ResponseResult> transfered(@QueryMap Map<String, String> paramMap);

    @GET("/api/v3/ins-loan/risk-unit")
    Call<ResponseResult> riskUnit();

    @POST("/api/v3/ins-loan/bind-uid")
    Call<ResponseResult> bindUid(@Body Map<String, Object> paramMap);
}
