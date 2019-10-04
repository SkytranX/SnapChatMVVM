package com.example.snapchatmvvm.model.view.mainactivity;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.snapchatmvvm.R;
import com.example.snapchatmvvm.model.model.SnapStory;
import com.example.snapchatmvvm.model.view.adapter.SnapAdapter;
import com.example.snapchatmvvm.model.viewmodel.MainActivityViewModel;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private SnapAdapter recyclerAdapter;
    private MainActivityViewModel m_ViewModel;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        m_ViewModel = ViewModelProviders
                .of(this)
                .get(MainActivityViewModel.class);
        m_ViewModel .getData();

        recyclerView = findViewById(R.id.rv_snap_stories);

        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        recyclerView.setHasFixedSize(true);

        recyclerAdapter = new SnapAdapter(m_ViewModel.getData());
        recyclerView.setAdapter(recyclerAdapter);
    }
}
