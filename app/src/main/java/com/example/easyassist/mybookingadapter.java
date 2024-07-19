package com.example.easyassist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class mybookingadapter extends RecyclerView.Adapter<mybookingadapter.ViewHolder> {
    Context context;
    ArrayList<mybookingmodel> arrmybookings;

    mybookingadapter(Context context, ArrayList<mybookingmodel> arrmybookings) {
        this.context = context;
        this.arrmybookings = arrmybookings;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.mybooking_row,parent,false);
        mybookingadapter.ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.imagetype.setImageResource(arrmybookings.get(position).img);
        holder.txttypename.setText(arrmybookings.get(position).type);
        holder.txtprice.setText(arrmybookings.get(position).price);
        holder.txtstatus.setText(arrmybookings.get(position).status);

    }

    @Override
    public int getItemCount() {
        return arrmybookings.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txttypename, txtprice, txtstatus;
        ImageView imagetype;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txttypename = itemView.findViewById(R.id.typename);
            txtprice = itemView.findViewById(R.id.price);
            imagetype = itemView.findViewById(R.id.imagetype);
            txtstatus = itemView.findViewById(R.id.btn_status);
        }
    }
}

