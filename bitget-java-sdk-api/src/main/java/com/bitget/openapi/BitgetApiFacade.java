package com.bitget.openapi;

import com.bitget.openapi.common.client.ApiClient;
import com.bitget.openapi.service.BitgetService;
import com.bitget.openapi.service.v3.*;

public class BitgetApiFacade {

    private final ApiClient apiClient;

    public BitgetApiFacade(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * REST API Endpoint
     */

    public BitgetApiFacade.BgEndpointV2 v2() {
        return new BitgetApiFacade.BgEndpointV2(apiClient);
    }

    public BitgetApiFacade.BgEndpointV3 v3() {
        return new BitgetApiFacade.BgEndpointV3(apiClient);
    }

    public static class BgEndpointV2 {
        private final ApiClient apiClient;

        BgEndpointV2(ApiClient apiClient) {
            this.apiClient = apiClient;
        }

        public <T> T createRetrofit(Class<T> clazz) {
            return apiClient.create(clazz);
        }

        /**
         * bitget service
         */
        public BitgetService request() {
            return new BitgetService(apiClient);
        }

        /**
         * market service
         */
        public com.bitget.openapi.service.v2.mix.MixMarketService mixMarket() {
            return new com.bitget.openapi.service.v2.mix.MixMarketService(apiClient);
        }

        /**
         * account service
         */
        public com.bitget.openapi.service.v2.mix.MixAccountService mixAccount() {
            return new com.bitget.openapi.service.v2.mix.MixAccountService(apiClient);
        }

        /**
         * order service
         */
        public com.bitget.openapi.service.v2.mix.MixOrderService mixOrder() {
            return new com.bitget.openapi.service.v2.mix.MixOrderService(apiClient);
        }

        /**
         * account service
         */
        public com.bitget.openapi.service.v2.spot.SpotAccountService spotAccount() {
            return new com.bitget.openapi.service.v2.spot.SpotAccountService(apiClient);
        }

        /**
         * market service
         */
        public com.bitget.openapi.service.v2.spot.SpotMarketService spotMarket() {
            return new com.bitget.openapi.service.v2.spot.SpotMarketService(apiClient);
        }

        /**
         * order service
         */
        public com.bitget.openapi.service.v2.spot.SpotOrderService spotOrder() {
            return new com.bitget.openapi.service.v2.spot.SpotOrderService(apiClient);
        }

        /**
         * wallet service
         */
        public com.bitget.openapi.service.v2.spot.SpotWalletService spotWallet() {
            return new com.bitget.openapi.service.v2.spot.SpotWalletService(apiClient);
        }
    }

    public static class BgEndpointV3 {
        private final ApiClient apiClient;

        BgEndpointV3(ApiClient apiClient) {
            this.apiClient = apiClient;
        }

        public <T> T createRetrofit(Class<T> clazz) {
            return apiClient.create(clazz);
        }

        /**
         * UTA order service (place/cancel/modify/fills/countdown)
         */
        public UtaOrderService utaOrder() {
            return new UtaOrderService(apiClient);
        }

        /**
         * UTA strategy order service (place/modify/cancel strategy orders)
         */
        public UtaStrategyService utaStrategy() {
            return new UtaStrategyService(apiClient);
        }

        /**
         * UTA market data service
         */
        public UtaMarketService utaMarket() {
            return new UtaMarketService(apiClient);
        }

        /**
         * UTA account & wallet service
         */
        public UtaAccountService utaAccount() {
            return new UtaAccountService(apiClient);
        }

        /**
         * UTA position service
         */
        public UtaPositionService utaPosition() {
            return new UtaPositionService(apiClient);
        }

        /**
         * UTA user sub-account management service
         */
        public UtaUserService utaUser() {
            return new UtaUserService(apiClient);
        }

        /**
         * UTA broker (ND broker) sub-account service
         */
        public UtaBrokerService utaBroker() {
            return new UtaBrokerService(apiClient);
        }

        /**
         * UTA tax records service
         */
        public UtaTaxService utaTax() {
            return new UtaTaxService(apiClient);
        }

        /**
         * UTA institutional loan service
         */
        public UtaInsLoanService utaInsLoan() {
            return new UtaInsLoanService(apiClient);
        }

        /**
         * UTA crypto loan service
         */
        public UtaLoanService utaLoan() {
            return new UtaLoanService(apiClient);
        }

        /**
         * UTA copy trading service (trader pairs + transfer)
         */
        public UtaCopyService utaCopy() {
            return new UtaCopyService(apiClient);
        }
    }
}
