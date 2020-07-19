package com.apps.projectakhir.juanlazuardo.utils;
import com.apps.projectakhir.juanlazuardo.model.HikeoutGET;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.HTTP;
import retrofit2.http.POST;
import retrofit2.http.PUT;


public interface ApiInterface {

    @GET("ApiJuan")
    Call<HikeoutGET> getdataCarrier();
    @GET("ApiJuan")
    Call<HikeoutGET> getdataTenda();
    @GET("ApiJuan")
    Call<HikeoutGET> getdataAks();


}
