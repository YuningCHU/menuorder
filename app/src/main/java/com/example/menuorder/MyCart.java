package com.example.menuorder;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.text.DecimalFormat;
import android.os.Bundle;
import android.widget.TextView;

public class MyCart extends AppCompatActivity {

    private RecyclerView recyclerView;
    public static double total = 0;
    private TextView totalTextView;
    private static DecimalFormat df2 = new DecimalFormat("#.##");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_cart);

        recyclerView = findViewById(R.id.rv_main2);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);

        CartAdapter cartAdapter = new CartAdapter(MainActivity.orderList);

        // We wrote our setData method to be like a setter, so we give our ArrayList from
        // FakeDatabase to the Adapter.
        recyclerView.setAdapter(cartAdapter);

        totalTextView = findViewById(R.id.total);
        for(int i = 0; i < MainActivity.orderList.size(); i++){
            int[] order = MainActivity.orderList.get(i);
            Menu menu = MenuDatabase.getMenuById(order[0]);
            int quantity = order[1];
            if(i == 0){
                total = Double.parseDouble(menu.getPrice()) * quantity;
            } else {
                total += Double.parseDouble(menu.getPrice()) * quantity;
            }
        }
        String t = df2.format(total);
        totalTextView.setText("Total: $" + t);

    }
}
