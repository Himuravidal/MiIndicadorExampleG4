package com.example.adacher.miindicadorexample.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by adacher on 16-06-17.
 */

public class Interceptor {


    private static final String BASE_URL = "http://mindicador.cl/";


    public Miindicador getBasic() {

        Retrofit interceptor = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        Miindicador indicatorRequest = interceptor.create(Miindicador.class);

        return indicatorRequest;

    }
}
