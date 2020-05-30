package com.example.retrofitjava.service;

import com.example.retrofitjava.model.CryptoModel;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.GET;

public interface CryptoAPI {

    //GET , POST , UPDATE , DELETE

    @GET("prices?key=0944af813ad7251af5c017dd8e1d0729")
    Observable<List<CryptoModel>> getData( );

    //Call<List<CryptoModel>> getData();

}
