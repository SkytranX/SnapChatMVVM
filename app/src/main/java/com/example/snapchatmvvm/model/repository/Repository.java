package com.example.snapchatmvvm.model.repository;

import com.example.snapchatmvvm.model.model.SnapStory;

import java.util.ArrayList;
import java.util.List;

public class Repository {

    private Repository() {
    }

    static  class InstanceHolder {
        static  Repository INSTANCE = new Repository();
    }
    public static Repository getInstance() { return InstanceHolder.INSTANCE;}

    public List<SnapStory> getData(){
        List<SnapStory> snapStories = new ArrayList<>();
        snapStories.add(new SnapStory("RaveBizz","/"));
        snapStories.add(new SnapStory("Nocturnal","/"));
        snapStories.add(new SnapStory("Escape","/"));
        snapStories.add(new SnapStory("EDCarnival","/"));
        return snapStories;
    }
}
