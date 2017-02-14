package com.example.akif.dovizapi.remote;

import com.example.akif.dovizapi.ExampleAltin;
import com.example.akif.dovizapi.ExampleDoviz;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;


/**
 * Created by akif on 9.2.2017.
 */

public interface ApiService {
    String Base_Url="http://www.doviz.com/";  //for emulator 10.0.2.2

    @GET("api/v1/currencies/all/latest")
    Call<List<ExampleDoviz>> getdoviz();

    @GET("api/v1/golds/all/latest")
    Call<List<ExampleAltin>> getaltin();



    class Factory{

        private static ApiService service;

        public static ApiService getInstance(){
            if (service==null){

                Retrofit retrofit = new Retrofit.Builder().addConverterFactory(GsonConverterFactory.create()).baseUrl(Base_Url).build();

                service=retrofit.create(ApiService.class);
                return service;


            }else{
                return service;
            }


        }

    }



}