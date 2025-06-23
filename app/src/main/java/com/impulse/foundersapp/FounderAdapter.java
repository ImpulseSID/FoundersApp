package com.impulse.foundersapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class FounderAdapter extends RecyclerView.Adapter<FounderAdapter.ViewHolder> {
    Context context;
    List<Founder> founders;

    public FounderAdapter(Context context, List<Founder> founders) {
        this.context = context;
        this.founders = founders;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_founder, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Founder founder = founders.get(position);
        holder.name.setText(founder.name);
        holder.image.setImageResource(founder.imageResId);

        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(context, DetailActivity.class);
            intent.putExtra("name", founder.name);
            intent.putExtra("imageResId", founder.imageResId);
            intent.putExtra("desc", founder.description);
            intent.putExtra("company", founder.company);
            intent.putExtra("birthYear", founder.birthYear);
            intent.putExtra("netWorth", founder.netWorth);
            context.startActivity(intent);
        });

    }

    @Override
    public int getItemCount() {
        return founders.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView image;
        TextView name;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.founderImage);
            name = itemView.findViewById(R.id.founderName);
        }
    }
}
