package com.example.rerecyclerview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.rerecyclerview.R;
import com.example.rerecyclerview.adapter.MainAdapter;
import com.example.rerecyclerview.entity.JsonResponse;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {

    MainAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_second );
        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        adapter = new MainAdapter(this);
        preLoadData();
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
        preLoadData();

    }
    public void preLoadData()
    {
        List<JsonResponse.Content> contentList = new ArrayList<>();
        String[] names = {"Disanth","Vamsi","BulliSai"};
        for(int i = 0; i < 3;i++)
        {
            JsonResponse.Content content = new JsonResponse.Content();
            content.setStatus(names[i%3]);
            JsonResponse.Data data = new JsonResponse.Data();
            List<JsonResponse.FeedBack> feedBackList = new ArrayList<>();
            JsonResponse.FeedBack feedBack = new JsonResponse.FeedBack(1,2,1,"Rashid khan",1,"Very good doctor, she listens to all the problems patiently and treats patients cautiously not to hurt their pains and anxiety. She is very experienced doctor and please don\\u2019t think there would be generation gap for the 20-30 age group patients","2020-03-04 09:22:21","2020-03-04 09:22:21");
            feedBackList.add(feedBack);
            JsonResponse.FeedBack feedBack1 = new JsonResponse.FeedBack(2,2,4,"Imran",1,"Very good doctor, she listens to all the problems patiently and treats patients cautiously not to hurt their pains and anxiety. She is very experienced doctor and please don\\u2019t think there would be generation gap for the 20-30 age group patients","2020-03-04 09:22:21","2020-03-04 09:22:21");
            feedBackList.add(feedBack1);
            JsonResponse.FeedBack feedBack2 = new JsonResponse.FeedBack(2,2,4,"Imran",1,"Very Bad doctor, He Killed my relaytive","2020-03-04 09:22:21","2020-03-04 09:22:21");
            feedBackList.add(feedBack2);
            data.setFeedBack(feedBackList);
            content.setData(data);
            contentList.add(content);
        }
        adapter.setContentList(contentList);
    }
}
