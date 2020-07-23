package com.linda.insta;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class ContentInstaAdapter extends RecyclerView.Adapter<ContentInstaAdapter.MyViewHolder> {
    private static final String TAG = "ContentInstaAdapter";
    private List<ContentInsta> items = new ArrayList<>();

    public void addItem(ContentInsta contentInsta){

        items.add(contentInsta);
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_content, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        ContentInsta contentInsta = items.get(position);
        holder.setItem(contentInsta);
    }

    @Override
    public int getItemCount() {

        return items.size();
    }


    public static class MyViewHolder extends RecyclerView.ViewHolder{

        private ImageView iv;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            iv = itemView.findViewById(R.id.iv_main);
        }

        public void setItem(ContentInsta contentInsta){
            iv.setImageResource(contentInsta.getImgResource());
        }
    }
}
