package com.linda.insta;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class TopInstaAdapter extends RecyclerView.Adapter<TopInstaAdapter.MyViewHolder> {
    private static final String TAG = "TopInstaAdapter";
    private List<TopInsta> items = new ArrayList<>();

    public void addItem(TopInsta topInsta){

        items.add(topInsta);
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_top, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
    TopInsta topInsta = items.get(position);
    holder.setItem(topInsta);
    }

    @Override
    public int getItemCount() {

        return items.size();
    }



    public static class MyViewHolder extends RecyclerView.ViewHolder{

        private TextView tv;
        private CircleImageView ci;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tv = itemView.findViewById(R.id.tv);
            ci = itemView.findViewById(R.id.ci);
        }

        public void setItem(TopInsta topInsta){
            tv.setText(topInsta.getUsername());
            ci.setImageResource(topInsta.getImgResource());
        }
    }
}
