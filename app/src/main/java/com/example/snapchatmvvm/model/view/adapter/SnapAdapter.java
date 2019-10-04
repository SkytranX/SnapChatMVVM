package com.example.snapchatmvvm.model.view.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.snapchatmvvm.R;
import com.example.snapchatmvvm.model.model.SnapStory;

import java.util.List;

public class SnapAdapter extends RecyclerView.Adapter<SnapAdapter.SnapViewHolder> {
    private List<SnapStory> snapStoryList;

    public SnapAdapter(List<SnapStory> snapStoryList){
        this.snapStoryList = snapStoryList;
    }

    @NonNull
    @Override
    public SnapViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.snap_story_item,
                parent,
                false
        );

        return new SnapViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SnapViewHolder holder, int position) {
        SnapStory snapStory = snapStoryList.get(position);

        //holder.snapStory.setImageDrawable(snapStory.getImageUrl());
        holder.userName.setText(snapStory.getUserName());
    }

    @Override
    public int getItemCount() {
        return snapStoryList.size();
    }

    class SnapViewHolder extends RecyclerView.ViewHolder{
        TextView userName;
        ImageView snapStory;
        public SnapViewHolder(@NonNull View itemView) {
            super(itemView);
        userName = itemView.findViewById(R.id.tv_name);
        snapStory = itemView.findViewById(R.id.iv_image);
        }
    }

}
