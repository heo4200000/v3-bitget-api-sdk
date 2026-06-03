package com.bitget.openapi.api.v3;

import com.bitget.openapi.dto.response.ResponseResult;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

import java.util.Map;

public interface UtaMarketApi {

    @GET("/api/v3/market/time")
    Call<ResponseResult> getTime();

    @GET("/api/v3/market/instruments")
    Call<ResponseResult> instruments(@QueryMap Map<String, String> paramMap);

    @GET("/api/v3/market/tickers")
    Call<ResponseResult> tickers(@QueryMap Map<String, String> paramMap);

    @GET("/api/v3/market/fills")
    Call<ResponseResult> fills(@QueryMap Map<String, String> paramMap);

    @GET("/api/v3/market/orderbook")
    Call<ResponseResult> orderbook(@QueryMap Map<String, String> paramMap);

    @GET("/api/v3/market/rpi-orderbook")
    Call<ResponseResult> rpiOrderbook(@QueryMap Map<String, String> paramMap);

    @GET("/api/v3/market/candles")
    Call<ResponseResult> candles(@QueryMap Map<String, String> paramMap);

    @GET("/api/v3/market/history-candles")
    Call<ResponseResult> historyCandles(@QueryMap Map<String, String> paramMap);

    @GET("/api/v3/market/open-interest")
    Call<ResponseResult> openInterest(@QueryMap Map<String, String> paramMap);

    @GET("/api/v3/market/history-fund-rate")
    Call<ResponseResult> historyFundRate(@QueryMap Map<String, String> paramMap);

    @GET("/api/v3/market/current-fund-rate")
    Call<ResponseResult> currentFundRate(@QueryMap Map<String, String> paramMap);

    @GET("/api/v3/market/risk-reserve")
    Call<ResponseResult> riskReserve(@QueryMap Map<String, String> paramMap);

    @GET("/api/v3/market/risk-reserve-all")
    Call<ResponseResult> riskReserveAll(@QueryMap Map<String, String> paramMap);

    @GET("/api/v3/market/risk-reserve-hour")
    Call<ResponseResult> riskReserveHour(@QueryMap Map<String, String> paramMap);

    @GET("/api/v3/market/discount-rate")
    Call<ResponseResult> discountRate();

    @GET("/api/v3/market/margin-loans")
    Call<ResponseResult> marginLoans(@QueryMap Map<String, String> paramMap);

    @GET("/api/v3/market/position-tier")
    Call<ResponseResult> positionTier(@QueryMap Map<String, String> paramMap);

    @GET("/api/v3/market/oi-limit")
    Call<ResponseResult> oiLimit(@QueryMap Map<String, String> paramMap);

    @GET("/api/v3/market/proof-of-reserves")
    Call<ResponseResult> proofOfReserves();

    @GET("/api/v3/market/por")
    Call<ResponseResult> por();

    @GET("/api/v3/market/index-components")
    Call<ResponseResult> indexComponents(@QueryMap Map<String, String> paramMap);

    @GET("/api/v3/market/fee-group")
    Call<ResponseResult> feeGroup(@QueryMap Map<String, String> paramMap);

    @GET("/api/v3/market/score-weights")
    Call<ResponseResult> scoreWeights(@QueryMap Map<String, String> paramMap);
}
