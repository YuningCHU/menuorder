package com.example.menuorder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.text.DecimalFormat;

public class CartAdapter extends RecyclerView.Adapter<CartAdapter.CartViewHolder> {

    private ArrayList<int[]> cart;
    private static DecimalFormat df2 = new DecimalFormat("#.##");

    public CartAdapter(ArrayList<int[]> cart){
        this.cart = cart;
    }

    public static class CartViewHolder extends RecyclerView.ViewHolder {
        public View view;
        public TextView nameTextView;
        public TextView quantityTextView;
        public ImageView itemImageView;
        public TextView priceTextView;
        public TextView subtotalTextView;


        public CartViewHolder(View v) {
            super(v);
            view = v;
            nameTextView = view.findViewById(R.id.name);
            quantityTextView = view.findViewById(R.id.quantity);
            itemImageView = view.findViewById(R.id.imageView);
            priceTextView = view.findViewById(R.id.itemPrice);
            subtotalTextView = view.findViewById(R.id.subtotal);
        }
    }

    @NonNull
    @Override
    public CartAdapter.CartViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view =
                LayoutInflater.from(parent.getContext()).inflate(R.layout.cart,parent,false);
        CartAdapter.CartViewHolder cartViewHolder = new CartAdapter.CartViewHolder(view);
        return cartViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CartAdapter.CartViewHolder holder, int position) {
        int[] order = cart.get(position);
        Menu menu = MenuDatabase.getMenuById(order[0]);
        int quantity = order[1];
        holder.itemImageView.setImageResource(menu.getImageDrawableId());
        holder.quantityTextView.setText("Quantity: " + String.valueOf(quantity));
        holder.nameTextView.setText(menu.getName());
        holder.priceTextView.setText("$" + menu.getPrice());
        double subtotal = Double.parseDouble(menu.getPrice()) * quantity;
        String s = df2.format(subtotal);
        holder.subtotalTextView.setText("Subtotal: $" + s);
    }

    @Override
    public int getItemCount() {
        return cart.size();
    }
}
