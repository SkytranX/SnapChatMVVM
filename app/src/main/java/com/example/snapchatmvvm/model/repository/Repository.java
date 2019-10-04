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
        snapStories.add(new SnapStory("Ultra","https://dancingastronaut.com/wp-content/uploads/2016/03/Philippe-Wuyts-for-Ultra-Music-Festival-Day-3-1-e1554042245863.jpg"));
        snapStories.add(new SnapStory("Nocturnal","https://edm.com/.image/ar_16:9%2Cc_fill%2Ccs_srgb%2Cfl_progressive%2Cg_faces:center%2Cq_auto:good%2Cw_768/MTU1OTY4NjY5OTQyMjk0MjU2/nocturnal-wonderland-2016-arrests-2.jpg"));
        snapStories.add(new SnapStory("Escape","https://cdn.globaldanceelectronic.com/wp-content/uploads/2018/06/23213466_1952836051399434_2069819581537530320_o-1200x520.jpg"));
        snapStories.add(new SnapStory("Wonderland","https://www.verknipt.org/wp-content/uploads/2019/03/wl-outoor.jpg"));
        snapStories.add(new SnapStory("Wasteland","https://image.redbull.com/rbcom/052/2018-03-12/006dff80-49c1-4410-ab59-a970b4e16ac6/0100/0/1/wasteland-weekend-not-for-wimps.jpg"));
        snapStories.add(new SnapStory("LED USA","https://pbs.twimg.com/media/DZ5p-y6VMAEFWZ3.jpg"));
        snapStories.add(new SnapStory("EDCarnival","https://edm.com/.image/ar_16:9%2Cc_fill%2Ccs_srgb%2Cfl_progressive%2Cg_faces:center%2Cq_auto:good%2Cw_768/MTYyNjI3ODQ0Mzk5MTc4Nzky/edc-las-vegas-2018-live-sets_1200x800.jpg"));
        snapStories.add(new SnapStory("88 Rising","https://pbs.twimg.com/media/DpHHkk0U0AAReQd.jpg"));
        return snapStories;
    }
}
