package com.example.snapchatmvvm.model.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import com.example.snapchatmvvm.model.model.SnapStory;
import com.example.snapchatmvvm.model.repository.Repository;

import java.util.List;

public class MainActivityViewModel extends AndroidViewModel {

    private Repository repo;
    public MainActivityViewModel(@NonNull Application application) {
        super(application);
        repo = Repository.getInstance();
    }
    public List<SnapStory> getData(){
        return repo.getData();
    }
}
