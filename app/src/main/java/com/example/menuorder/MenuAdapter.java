package com.example.menuorder;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.MenuViewHolder> {
    // class variable that holds the data that we want to adapt
    private ArrayList<Menu> menusToAdapt;

    public void setData(ArrayList<Menu> menusToAdapt) {
        this.menusToAdapt = menusToAdapt;
    }


    @NonNull
    @Override
    public MenuViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view =
                LayoutInflater.from(parent.getContext()).inflate(R.layout.menu,parent,false);
        MenuViewHolder menuViewHolder = new MenuViewHolder(view);
        return menuViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MenuViewHolder holder, int position) {
        // Compare what we have in this method, to what we used to have in MainActivity

        // 'position' is the index of the ViewHolder currently being bound (note VIEWHOLDER). So
        // if position is 0, then we are binding the first ViewHolder in the list. This means the
        // corresponding data object will be at index 0 of our data ArrayList.
        final Menu menuAtPosition = menusToAdapt.get(position);

        holder.nameTextView.setText(menuAtPosition.getName());
        holder.priceTextView.setText(menuAtPosition.getPrice());
        holder.summaryTextView.setText(menuAtPosition.getSummary());


        holder.view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = view.getContext();

                Intent intent = new Intent(context, MenuDetailActivity.class);
                intent.putExtra("MenuID", menuAtPosition.getMenuID());
                context.startActivity(intent);
            }
        });


        holder.itemImageView.setImageResource(menuAtPosition.getImageDrawableId());
    }

    @Override
    public int getItemCount() {
        return menusToAdapt.size();
    }

    public static class MenuViewHolder extends RecyclerView.ViewHolder {
        public View view;
        public TextView nameTextView;
        public TextView priceTextView;
        public TextView summaryTextView;
        public ImageView itemImageView;


        public MenuViewHolder(View v) {
            super(v);
            view = v;
            nameTextView = v.findViewById(R.id.name);
            summaryTextView = v.findViewById(R.id.summary);
            priceTextView = v.findViewById(R.id.price);
            itemImageView = v.findViewById(R.id.image);
        }
    }


}
