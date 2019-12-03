package com.example.deltatesttwo.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.deltatesttwo.R;
import com.example.deltatesttwo.adapter.PostAdapter;
import com.example.deltatesttwo.model.Post;
import com.example.deltatesttwo.presenter.MainContract;
import com.example.deltatesttwo.presenter.MainPresenter;

import java.util.List;

public class MainActivity extends AppCompatActivity implements MainContract.View {

    private RecyclerView recyclerView;
    private MainPresenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.display_json_response_list);

        mainPresenter = new MainPresenter(this);

        mainPresenter.getPostResponse();
    }

    @Override
    public void displayPostResponseList(List<Post> postList) {
        recyclerView.setAdapter(new PostAdapter(postList));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
