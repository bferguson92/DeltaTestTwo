package com.example.deltatesttwo.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.deltatesttwo.R;
import com.example.deltatesttwo.model.Post;

import java.util.List;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.CustomViewHolder> {
    private List<Post> postList;

    public PostAdapter(List<Post> postList) {
        this.postList = postList;
    }

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.json_item, parent, false);
        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {
        holder.viewOne.setText(Integer.toString(postList.get(position).getId()));
        holder.viewTwo.setText(Integer.toString(postList.get(position).getUserId()));
        holder.viewThree.setText(postList.get(position).getBody());
        holder.viewFour.setText(postList.get(position).getTitle());

    }

    @Override
    public int getItemCount() {
        return postList.size();
    }

    public static class CustomViewHolder extends RecyclerView.ViewHolder {
        TextView viewOne;
        TextView viewTwo;
        TextView viewThree;
        TextView viewFour;

        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);
            viewOne = itemView.findViewById(R.id.text_view_one);
            viewTwo = itemView.findViewById(R.id.text_view_two);
            viewThree = itemView.findViewById(R.id.text_view_three);
            viewFour = itemView.findViewById(R.id.text_view_four);
        }
    }
}
