package com.example.deltatesttwo.presenter;

import com.example.deltatesttwo.model.Post;

import java.util.List;

public interface MainContract {
    interface Presenter {
        void getPostResponse();

    }

    interface View {
        void displayPostResponseList(List<Post> postList);
    }
}
