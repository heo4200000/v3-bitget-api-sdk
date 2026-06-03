package com.bitget.openapi.api.v3;

import com.bitget.openapi.dto.response.ResponseResult;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.QueryMap;

import java.util.Map;

public interface UtaAccountApi {

    // -------- account info --------

    @GET("/api/v3/account/info")
    Call<ResponseResult> info();

    @GET("/api/v3/account/assets")
    Call<ResponseResult> assets();

    @GET("/api/v3/account/sub-unified-assets")
    Call<ResponseResult> subUnifiedAssets(@QueryMap Map<String, String> paramMap);

    @POST("/api/v3/account/set-leverage")
    Call<ResponseResult> setLeverage(@Body Map<String, Object> paramMap);

    @POST("/api/v3/account/set-hold-mode")
    Call<ResponseResult> setHoldMode(@Body Map<String, Object> paramMap);

    @POST("/api/v3/account/transfer")
    Call<ResponseResult> transfer(@Body Map<String, Object> paramMap);

    @POST("/api/v3/account/max-open-available")
    Call<ResponseResult> maxOpenAvailable(@Body Map<String, Object> paramMap);

    @GET("/api/v3/account/transferable-coins")
    Call<ResponseResult> transferableCoins(@QueryMap Map<String, String> paramMap);

    @GET("/api/v3/account/financial-records")
    Call<ResponseResult> financialRecords(@QueryMap Map<String, String> paramMap);

    @GET("/api/v3/account/convert-records")
    Call<ResponseResult> convertRecords(@QueryMap Map<String, String> paramMap);

    @GET("/api/v3/account/repayable-coins")
    Call<ResponseResult> repayableCoins();

    @GET("/api/v3/account/payment-coins")
    Call<ResponseResult> paymentCoins();

    @POST("/api/v3/account/repay")
    Call<ResponseResult> repay(@Body Map<String, Object> paramMap);

    @GET("/api/v3/account/settings")
    Call<ResponseResult> settings();

    @POST("/api/v3/account/sub-transfer")
    Call<ResponseResult> subTransfer(@Body Map<String, Object> paramMap);

    @GET("/api/v3/account/sub-transfer-record")
    Call<ResponseResult> subTransferRecord(@QueryMap Map<String, String> paramMap);

    @GET("/api/v3/account/funding-assets")
    Call<ResponseResult> fundingAssets(@QueryMap Map<String, String> paramMap);

    @POST("/api/v3/account/switch-deduct")
    Call<ResponseResult> switchDeduct(@Body Map<String, Object> paramMap);

    @GET("/api/v3/account/deduct-info")
    Call<ResponseResult> deductInfo();

    @GET("/api/v3/account/fee-rate")
    Call<ResponseResult> feeRate(@QueryMap Map<String, String> paramMap);

    @POST("/api/v3/account/switch")
    Call<ResponseResult> switchAccount();

    @GET("/api/v3/account/switch-status")
    Call<ResponseResult> switchStatus();

    @POST("/api/v3/account/deposit-account")
    Call<ResponseResult> depositAccount(@Body Map<String, Object> paramMap);

    @POST("/api/v3/account/sub-master-transfer")
    Call<ResponseResult> subMasterTransfer(@Body Map<String, Object> paramMap);

    @GET("/api/v3/account/max-transferable")
    Call<ResponseResult> maxTransferable(@QueryMap Map<String, String> paramMap);

    @GET("/api/v3/account/open-interest-limit")
    Call<ResponseResult> openInterestLimit(@QueryMap Map<String, String> paramMap);

    @POST("/api/v3/account/adjust-account-mode")
    Call<ResponseResult> adjustAccountMode(@Body Map<String, Object> paramMap);

    @POST("/api/v3/account/move-positions")
    Call<ResponseResult> movePositions(@Body Map<String, Object> paramMap);

    @GET("/api/v3/account/move-position-history")
    Call<ResponseResult> movePositionHistory(@QueryMap Map<String, String> paramMap);

    @GET("/api/v3/account/delta-info")
    Call<ResponseResult> deltaInfo();

    // -------- wallet (deposit/withdrawal) --------

    @GET("/api/v3/account/deposit-address")
    Call<ResponseResult> depositAddress(@QueryMap Map<String, String> paramMap);

    @GET("/api/v3/account/sub-deposit-address")
    Call<ResponseResult> subDepositAddress(@QueryMap Map<String, String> paramMap);

    @GET("/api/v3/account/deposit-records")
    Call<ResponseResult> depositRecords(@QueryMap Map<String, String> paramMap);

    @GET("/api/v3/account/sub-deposit-records")
    Call<ResponseResult> subDepositRecords(@QueryMap Map<String, String> paramMap);

    @POST("/api/v3/account/withdrawal")
    Call<ResponseResult> withdrawal(@Body Map<String, Object> paramMap);

    @GET("/api/v3/account/withdrawal-records")
    Call<ResponseResult> withdrawalRecords(@QueryMap Map<String, String> paramMap);

    @POST("/api/v3/account/cancel-withdrawal")
    Call<ResponseResult> cancelWithdrawal(@Body Map<String, Object> paramMap);

    @GET("/api/v3/account/withdraw-address")
    Call<ResponseResult> withdrawAddress(@QueryMap Map<String, String> paramMap);
}
