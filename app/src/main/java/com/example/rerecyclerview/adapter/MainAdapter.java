package com.example.rerecyclerview.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rerecyclerview.R;
import com.example.rerecyclerview.entity.JsonResponse;

import java.util.ArrayList;
import java.util.List;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder> {

    List<JsonResponse.Content> contentList = new ArrayList<>();

    public void setContentList(List<JsonResponse.Content> contentList) {
        this.contentList = contentList;
    }

    Context context;

    public MainAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
        public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(
                LayoutInflater.from(parent.getContext()).inflate( R.layout.main_layout, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position)
    {
        JsonResponse.Content content = contentList.get(position);
        holder.textView.setText("Disanth");
        FeedbackAdapter feedbackAdapter=new FeedbackAdapter();
        feedbackAdapter.setFeedBackList(content.getData().getFeedBack());
        holder.recyclerView.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL,true));
        holder.recyclerView.setAdapter(feedbackAdapter);
    }

    @Override
    public int getItemCount() {
        return contentList == null ? 0:contentList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        RecyclerView recyclerView;
        TextView textView;
        public ViewHolder(@NonNull View itemView) {
            super( itemView );
            textView = itemView.findViewById(R.id.mainTextItem);
            recyclerView = itemView.findViewById(R.id.secondrecycler);
        }
    }

    public class FeedbackAdapter extends RecyclerView.Adapter<FeedbackAdapter.FeedbackViewHolder>
    {
        List<JsonResponse.FeedBack> feedBackList = new ArrayList<>();

        public void setFeedBackList(List<JsonResponse.FeedBack> feedBackList) {
            this.feedBackList = feedBackList;
        }

        @NonNull
        @Override
        public FeedbackViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new FeedbackViewHolder(
                    LayoutInflater.from(parent.getContext()).inflate( R.layout.review_items, parent, false));
        }

        @Override
        public void onBindViewHolder(@NonNull FeedbackViewHolder holder, int position)
        {
            JsonResponse.FeedBack feedBack = feedBackList.get(position);
            if(feedBack != null)
            {
                holder.id.setText(String.valueOf(feedBack.getId()));
                holder.user_id.setText(String.valueOf(feedBack.getUserId()));
                holder.username.setText(feedBack.getUsername());
                holder.description.setText( feedBack.getDescription());
                holder.verified.setText(String.valueOf(feedBack.getVerified()));
                holder.created_at.setText(feedBack.getCreatedAt());
                holder.updated_at.setText(feedBack.getUpdatedAt());
                holder.doctor_id.setText(String.valueOf(feedBack.getDoctorId()));
            }

        }

        @Override
        public int getItemCount() {
            return feedBackList == null ? 0:feedBackList.size();
        }

        public class FeedbackViewHolder extends RecyclerView.ViewHolder
        {
            /*

            "id": 1,
			"doctor_id": 2,
			"user_id": 1,
			"username": "Rashid khan",
			"verified": 1,
			"description": "Very good doctor, she listens to all the problems patiently and treats patients cautiously not to hurt their pains and anxiety. She is very experienced doctor and please don\u2019t think there would be generation gap for the 20-30 age group patients",
			"created_at": "2020-03-04 09:22:21",
			"updated_at": "2020-03-04 09:22:21"
             */
            TextView id;
            TextView doctor_id;
            TextView user_id;
            TextView username;
            TextView verified;
            TextView description;
            TextView created_at;
            TextView updated_at;

            public FeedbackViewHolder(@NonNull View itemView) {
                super( itemView );
                id = itemView.findViewById(R.id.id);
                doctor_id = itemView.findViewById(R.id.doctor_id);
                user_id = itemView.findViewById(R.id.user_id);
                username = itemView.findViewById(R.id.username);
                verified = itemView.findViewById(R.id.verified);
                description = itemView.findViewById(R.id.description);
                created_at = itemView.findViewById(R.id.created_at);
                updated_at = itemView.findViewById(R.id.updated_at);
            }
        }
    }
}
