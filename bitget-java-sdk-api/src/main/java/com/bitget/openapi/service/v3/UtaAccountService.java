package com.bitget.openapi.service.v3;

import com.bitget.openapi.api.v3.UtaAccountApi;
import com.bitget.openapi.common.client.ApiClient;
import com.bitget.openapi.common.utils.ResponseUtils;
import com.bitget.openapi.dto.response.ResponseResult;

import java.io.IOException;
import java.util.Map;

public class UtaAccountService {

    private final UtaAccountApi utaAccountApi;

    public UtaAccountService(ApiClient client) {
        utaAccountApi = client.create(UtaAccountApi.class);
    }

    // -------- account info --------

    public ResponseResult info() throws IOException {
        return ResponseUtils.handleResponse(utaAccountApi.info().execute().body());
    }

    public ResponseResult assets() throws IOException {
        return ResponseUtils.handleResponse(utaAccountApi.assets().execute().body());
    }

    public ResponseResult subUnifiedAssets(Map<String, String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaAccountApi.subUnifiedAssets(paramMap).execute().body());
    }

    public ResponseResult setLeverage(Map<String, Object> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaAccountApi.setLeverage(paramMap).execute().body());
    }

    public ResponseResult setHoldMode(Map<String, Object> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaAccountApi.setHoldMode(paramMap).execute().body());
    }

    public ResponseResult transfer(Map<String, Object> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaAccountApi.transfer(paramMap).execute().body());
    }

    public ResponseResult maxOpenAvailable(Map<String, Object> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaAccountApi.maxOpenAvailable(paramMap).execute().body());
    }

    public ResponseResult transferableCoins(Map<String, String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaAccountApi.transferableCoins(paramMap).execute().body());
    }

    public ResponseResult financialRecords(Map<String, String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaAccountApi.financialRecords(paramMap).execute().body());
    }

    public ResponseResult convertRecords(Map<String, String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaAccountApi.convertRecords(paramMap).execute().body());
    }

    public ResponseResult repayableCoins() throws IOException {
        return ResponseUtils.handleResponse(utaAccountApi.repayableCoins().execute().body());
    }

    public ResponseResult paymentCoins() throws IOException {
        return ResponseUtils.handleResponse(utaAccountApi.paymentCoins().execute().body());
    }

    public ResponseResult repay(Map<String, Object> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaAccountApi.repay(paramMap).execute().body());
    }

    public ResponseResult settings() throws IOException {
        return ResponseUtils.handleResponse(utaAccountApi.settings().execute().body());
    }

    public ResponseResult subTransfer(Map<String, Object> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaAccountApi.subTransfer(paramMap).execute().body());
    }

    public ResponseResult subTransferRecord(Map<String, String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaAccountApi.subTransferRecord(paramMap).execute().body());
    }

    public ResponseResult fundingAssets(Map<String, String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaAccountApi.fundingAssets(paramMap).execute().body());
    }

    public ResponseResult switchDeduct(Map<String, Object> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaAccountApi.switchDeduct(paramMap).execute().body());
    }

    public ResponseResult deductInfo() throws IOException {
        return ResponseUtils.handleResponse(utaAccountApi.deductInfo().execute().body());
    }

    public ResponseResult feeRate(Map<String, String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaAccountApi.feeRate(paramMap).execute().body());
    }

    public ResponseResult switchAccount() throws IOException {
        return ResponseUtils.handleResponse(utaAccountApi.switchAccount().execute().body());
    }

    public ResponseResult switchStatus() throws IOException {
        return ResponseUtils.handleResponse(utaAccountApi.switchStatus().execute().body());
    }

    public ResponseResult depositAccount(Map<String, Object> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaAccountApi.depositAccount(paramMap).execute().body());
    }

    public ResponseResult subMasterTransfer(Map<String, Object> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaAccountApi.subMasterTransfer(paramMap).execute().body());
    }

    public ResponseResult maxTransferable(Map<String, String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaAccountApi.maxTransferable(paramMap).execute().body());
    }

    public ResponseResult openInterestLimit(Map<String, String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaAccountApi.openInterestLimit(paramMap).execute().body());
    }

    public ResponseResult adjustAccountMode(Map<String, Object> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaAccountApi.adjustAccountMode(paramMap).execute().body());
    }

    public ResponseResult movePositions(Map<String, Object> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaAccountApi.movePositions(paramMap).execute().body());
    }

    public ResponseResult movePositionHistory(Map<String, String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaAccountApi.movePositionHistory(paramMap).execute().body());
    }

    public ResponseResult deltaInfo() throws IOException {
        return ResponseUtils.handleResponse(utaAccountApi.deltaInfo().execute().body());
    }

    // -------- wallet --------

    public ResponseResult depositAddress(Map<String, String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaAccountApi.depositAddress(paramMap).execute().body());
    }

    public ResponseResult subDepositAddress(Map<String, String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaAccountApi.subDepositAddress(paramMap).execute().body());
    }

    public ResponseResult depositRecords(Map<String, String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaAccountApi.depositRecords(paramMap).execute().body());
    }

    public ResponseResult subDepositRecords(Map<String, String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaAccountApi.subDepositRecords(paramMap).execute().body());
    }

    public ResponseResult withdrawal(Map<String, Object> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaAccountApi.withdrawal(paramMap).execute().body());
    }

    public ResponseResult withdrawalRecords(Map<String, String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaAccountApi.withdrawalRecords(paramMap).execute().body());
    }

    public ResponseResult cancelWithdrawal(Map<String, Object> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaAccountApi.cancelWithdrawal(paramMap).execute().body());
    }

    public ResponseResult withdrawAddress(Map<String, String> paramMap) throws IOException {
        return ResponseUtils.handleResponse(utaAccountApi.withdrawAddress(paramMap).execute().body());
    }
}
