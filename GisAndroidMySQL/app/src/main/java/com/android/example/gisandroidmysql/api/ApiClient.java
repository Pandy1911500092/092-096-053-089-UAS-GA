package com.android.example.gisandroidmysql.api;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {
    public static final String URL = "http:192.168.56.1/GisAndroid";
    public static Retrofit RETROFIT = null;

    public static Retrofit getClient() {
        if (RETROFIT==null) {
            OkHttpClient client = new OkHttpClient.Builder()
                    .addInterceptor(new Logginginterceptor())
                    .build();
            RETROFIT = new Retrofit.Builder()
                    .baseUrl(URL)
                    .client(client)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return RETROFIT;
    }

}
