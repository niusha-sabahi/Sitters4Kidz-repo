package com.example.sitters4kidz;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ParentHomePageSearchAdapter extends RecyclerView.Adapter<ParentHomePageSearchAdapter
        .ParentHomePageSearchViewHolder> {

    Context context;
    ArrayList<ParentHomePageSearchItem> items_k;

    public ParentHomePageSearchAdapter(Context context, ArrayList<ParentHomePageSearchItem> items_k) {
        this.context = context;
        this.items_k = items_k;
    }

    @NonNull
    @Override
    public ParentHomePageSearchAdapter.ParentHomePageSearchViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.parent_homepage_search_item_view, parent, false);
        return new ParentHomePageSearchAdapter.ParentHomePageSearchViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ParentHomePageSearchAdapter.ParentHomePageSearchViewHolder holder, int position) {
        holder.childcarer_username.setText(items_k.get(position).getC_username());
        holder.childcarer_email.setText(items_k.get(position).getEmail());
        holder.childcarer_rate.setText(items_k.get(position).getRate());
    }

    @Override
    public int getItemCount() {
        return items_k.size();
    }

    public static class ParentHomePageSearchViewHolder extends RecyclerView.ViewHolder{

        TextView childcarer_username, childcarer_email, childcarer_rate;

        public ParentHomePageSearchViewHolder(@NonNull View itemView){
            super(itemView);

            childcarer_username = itemView.findViewById(R.id.childcarer_username);
            childcarer_email = itemView.findViewById(R.id.childcarer_email);
            childcarer_rate = itemView.findViewById(R.id.childcarer_rate);

        }

    }

}
