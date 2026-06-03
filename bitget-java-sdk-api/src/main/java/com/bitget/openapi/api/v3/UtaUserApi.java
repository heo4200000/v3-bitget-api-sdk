package com.bitget.openapi.api.v3;

import com.bitget.openapi.dto.response.ResponseResult;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.QueryMap;

import java.util.Map;

public interface UtaUserApi {

    @POST("/api/v3/user/create-sub")
    Call<ResponseResult> createSub(@Body Map<String, Object> paramMap);

    @POST("/api/v3/user/modify-sub")
    Call<ResponseResult> modifySub(@Body Map<String, Object> paramMap);

    @POST("/api/v3/user/freeze-sub")
    Call<ResponseResult> freezeSub(@Body Map<String, Object> paramMap);

    @GET("/api/v3/user/sub-list")
    Call<ResponseResult> subList(@QueryMap Map<String, String> paramMap);

    @POST("/api/v3/user/create-sub-api")
    Call<ResponseResult> createSubApi(@Body Map<String, Object> paramMap);

    @POST("/api/v3/user/update-sub-api")
    Call<ResponseResult> updateSubApi(@Body Map<String, Object> paramMap);

    @POST("/api/v3/user/delete-sub-api")
    Call<ResponseResult> deleteSubApi(@Body Map<String, Object> paramMap);

    @POST("/api/v3/user/sub-account/agent-create")
    Call<ResponseResult> agentCreate(@Body Map<String, Object> paramMap);

    @GET("/api/v3/user/sub-api-list")
    Call<ResponseResult> subApiList(@QueryMap Map<String, String> paramMap);
}
