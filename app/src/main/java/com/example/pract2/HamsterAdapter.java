package com.example.pract2;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
public class HamsterAdapter extends RecyclerView.Adapter<HamsterAdapter.ViewHolder>{
    private final LayoutInflater inflater;
    private final List<Hamster> hamsters;
    private final Context context;

    HamsterAdapter(Context context, List<Hamster> hamsters) {
        this.hamsters = hamsters;
        this.inflater = LayoutInflater.from(context);
        this.context = context;
    }

    @Override
    public HamsterAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(HamsterAdapter.ViewHolder holder, int position) {
        Hamster hamster = hamsters.get(position);
        holder.imgView.setImageResource(hamster.getImgRes());
        holder.nameView.setText(hamster.getName());
        holder.descrView.setText(hamster.getDescr());

        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(context, FullActivity.class);
            intent.putExtra("name", hamster.getName());
            intent.putExtra("descr", hamster.getDescr());
            intent.putExtra("img", hamster.getImgRes());
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return hamsters.size();
    }
    public static class ViewHolder extends RecyclerView.ViewHolder {
        final ImageView imgView;
        final TextView nameView, descrView;
        ViewHolder(View view){
            super(view);
            imgView = view.findViewById(R.id.img);
            nameView = view.findViewById(R.id.name);
            descrView = view.findViewById(R.id.descr);
        }
    }
}