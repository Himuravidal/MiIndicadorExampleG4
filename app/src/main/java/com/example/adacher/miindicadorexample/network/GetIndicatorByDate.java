package com.example.adacher.miindicadorexample.network;

import android.os.AsyncTask;

import com.example.adacher.miindicadorexample.models.Wrapper;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Response;

/**
 * Created by adacher on 16-06-17.
 */

public class GetIndicatorByDate extends AsyncTask<String, Void, Wrapper> {


    @Override
    protected Wrapper doInBackground(String... params) {
        Miindicador miindicador = new Interceptor().getBasic();
        Call<Wrapper> indicator = miindicador.indicatorByDate(params[0], params[1]);
        try {
            Response<Wrapper> response = indicator.execute();
            if (200 == response.code() && response.isSuccessful()) {
                return response.body();

            } else {
                return null;
            }

        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }


    }
}
