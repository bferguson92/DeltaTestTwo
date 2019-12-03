package com.example.deltatesttwo.presenter;

import android.util.Log;

import com.example.deltatesttwo.model.Post;
import com.example.deltatesttwo.network.Factory.JsonFactory;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainPresenter implements MainContract.Presenter {

    private JsonFactory jsonFactory;
    private MainContract.View view;

    public MainPresenter(MainContract.View view){
        jsonFactory = new JsonFactory();
        this.view = view;
    }

    @Override
    public void getPostResponse() {
        jsonFactory.getPostList().enqueue(new Callback<List<Post>>() {
            @Override
            public void onResponse(Call<List<Post>> call, Response<List<Post>> response) {
                onResponseSuccess(response.body());
            }

            @Override
            public void onFailure(Call<List<Post>> call, Throwable t) {
                onResponseFailure(t);
            }
        });

    }

    private void onResponseSuccess(List<Post> postList) {
        view.displayPostResponseList(postList);
    }

    private void onResponseFailure(Throwable throwable) {
        Log.e("ERROR", throwable.toString());
    }
}
