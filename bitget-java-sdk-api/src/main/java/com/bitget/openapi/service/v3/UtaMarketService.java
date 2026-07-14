package com.bitget.openapi.service.v3;

import com.bitget.openapi.api.v3.UtaMarketApi;
import com.bitget.openapi.common.client.ApiClient;
import com.bitget.openapi.common.utils.ResponseUtils;
import com.bitget.openapi.dto.response.ResponseResult;

import java.io.IOException;
import java.util.Map;

public class UtaMarketService {

    private final UtaMarketApi utaMarketApi;

    public UtaMarketService(ApiClient client) {
        utaMarketApi = client.create(UtaMarketApi.class);
    }

    public ResponseResult getTime() throws IOException {
        return ResponseUtils.handleResponse(utaMarketApi.getTime().execute().body());
    }

    public ResponseResult instruments(Map<String, String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaMarketApi.instruments(paramMap).execute().body());
    }

    public ResponseResult tickers(Map<String, String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaMarketApi.tickers(paramMap).execute().body());
    }

    public ResponseResult fills(Map<String, String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaMarketApi.fills(paramMap).execute().body());
    }

    public ResponseResult orderbook(Map<String, String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaMarketApi.orderbook(paramMap).execute().body());
    }

    public ResponseResult rpiOrderbook(Map<String, String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaMarketApi.rpiOrderbook(paramMap).execute().body());
    }

    public ResponseResult candles(Map<String, String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaMarketApi.candles(paramMap).execute().body());
    }

    public ResponseResult historyCandles(Map<String, String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaMarketApi.historyCandles(paramMap).execute().body());
    }

    public ResponseResult openInterest(Map<String, String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaMarketApi.openInterest(paramMap).execute().body());
    }

    public ResponseResult historyFundRate(Map<String, String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaMarketApi.historyFundRate(paramMap).execute().body());
    }

    public ResponseResult currentFundRate(Map<String, String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaMarketApi.currentFundRate(paramMap).execute().body());
    }

    public ResponseResult riskReserve(Map<String, String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaMarketApi.riskReserve(paramMap).execute().body());
    }

    public ResponseResult riskReserveAll(Map<String, String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaMarketApi.riskReserveAll(paramMap).execute().body());
    }

    public ResponseResult riskReserveHour(Map<String, String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaMarketApi.riskReserveHour(paramMap).execute().body());
    }

    public ResponseResult discountRate() throws IOException {
        return ResponseUtils.handleResponse(utaMarketApi.discountRate().execute().body());
    }

    public ResponseResult marginLoans(Map<String, String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaMarketApi.marginLoans(paramMap).execute().body());
    }

    public ResponseResult positionTier(Map<String, String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaMarketApi.positionTier(paramMap).execute().body());
    }

    public ResponseResult oiLimit(Map<String, String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaMarketApi.oiLimit(paramMap).execute().body());
    }

    public ResponseResult proofOfReserves() throws IOException {
        return ResponseUtils.handleResponse(utaMarketApi.proofOfReserves().execute().body());
    }

    public ResponseResult por() throws IOException {
        return ResponseUtils.handleResponse(utaMarketApi.por().execute().body());
    }

    public ResponseResult indexComponents(Map<String, String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaMarketApi.indexComponents(paramMap).execute().body());
    }

    public ResponseResult feeGroup(Map<String, String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaMarketApi.feeGroup(paramMap).execute().body());
    }

    public ResponseResult scoreWeights(Map<String, String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaMarketApi.scoreWeights(paramMap).execute().body());
    }
}
