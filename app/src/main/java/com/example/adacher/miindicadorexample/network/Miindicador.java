package com.example.adacher.miindicadorexample.network;

import com.example.adacher.miindicadorexample.models.Wrapper;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by adacher on 16-06-17.
 */

public interface Miindicador {


    @GET("api/{indicator}/{date}/")
    Call<Wrapper> indicatorByDate(@Path("indicator") String indicator, @Path("date") String date);


}
