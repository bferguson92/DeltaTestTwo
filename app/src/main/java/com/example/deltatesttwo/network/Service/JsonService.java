package com.example.deltatesttwo.network.Service;

import com.example.deltatesttwo.model.Post;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JsonService  {

    @GET("posts")
    Call<List<Post>> getPostList();

}
