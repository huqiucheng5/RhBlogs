package com.rhb.rhblogs.service;

import com.rhb.rhblogs.bean.ResponseBody;
import com.rhb.rhblogs.bean.UserBean;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface UserService {

    @FormUrlEncoded
    @POST("/user/create")
    Call<ResponseBody> registe(@Field("email") String email, @Field("username") String username, @Field("password") String password);

    @FormUrlEncoded
    @POST("/user/login")
    Call<ResponseBody<String>> login(@Field("email") String email, @Field("password") String password);

    @FormUrlEncoded
    @POST("/user/logout")
    Call<ResponseBody> logout(@Field("token") String token);

    @FormUrlEncoded
    @POST("/user/password/{token}")
    Call<ResponseBody> updatePasswd(@Path("token") String token, @Field("newpsd") String newpsd, @Field("oldpsd") String oldpsd);

    @GET("/user/{token}")
    Call<ResponseBody<UserBean>> getUserInfor(@Path("token") String token);

    @FormUrlEncoded
    @PUT("/user/{token}")
    Call<ResponseBody> updateUserInfor(@Path("token") String token, @Field("username") String username, @Field("signature") String signature, @Field("username") Integer sex);
}
