package net.piedevelopers.junitandretrofit.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class RetrofitClient {

    public static  String BASE_URL="https://conduit.productionready.io/api/";
   public static Retrofit  retrofit = new Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create()) //CONVERST JSON TO JAVA OBJECT
            .build();




}
