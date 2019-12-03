package com.example.deltatesttwo.network.Factory;

import com.example.deltatesttwo.model.Post;
import com.example.deltatesttwo.network.Service.JsonService;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class JsonFactory {

    private JsonService jsonService;

    public JsonFactory() {
        jsonService = createService(createRetrofitInstance());
    }

    private Retrofit createRetrofitInstance(){
        return new Retrofit.Builder()
                .baseUrl("https://jsonplaceholder.typicode.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    private JsonService createService(Retrofit retrofit){
        return retrofit.create(JsonService.class);
    }


    public Call<List<Post>> getPostList(){
        return jsonService.getPostList();
    }
}
