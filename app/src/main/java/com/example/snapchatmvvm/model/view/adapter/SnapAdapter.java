package com.example.snapchatmvvm.model.view.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.snapchatmvvm.R;
import com.example.snapchatmvvm.model.model.SnapStory;
import com.squareup.picasso.Picasso;

import java.util.List;

public class SnapAdapter extends RecyclerView.Adapter<SnapAdapter.SnapViewHolder> {
    private List<SnapStory> snapStoryList;
    private Context context;
    public SnapAdapter(List<SnapStory> snapStoryList){
        this.snapStoryList = snapStoryList;
    }

    @NonNull
    @Override
    public SnapViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        context = parent.getContext();

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



//        holder.snapStory.setImageDrawable(snapStory.getImageUrl());
        holder.userName.setText(snapStory.getUserName());



        Picasso.get().load(snapStory.getImageUrl()).resize(50, 50)
                .centerCrop().into(holder.snapStory);



    }

    @Override
    public int getItemCount() {
        return snapStoryList.size();
    }

    class SnapViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView userName;
        ImageView snapStory;

        public SnapViewHolder(@NonNull View itemView) {
            super(itemView);
        userName = itemView.findViewById(R.id.tv_name);
        snapStory = itemView.findViewById(R.id.iv_image);

        snapStory.setOnClickListener(this::onClick);
        }

        @Override
        public void onClick(View view) {
            Toast.makeText(context, "Story", Toast.LENGTH_SHORT).show();
        }
    }

}
