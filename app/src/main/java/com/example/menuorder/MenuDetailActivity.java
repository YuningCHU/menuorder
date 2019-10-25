package com.example.menuorder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class MenuDetailActivity extends AppCompatActivity {

    private TextView nameTextView;
    private TextView priceTextView;
    private TextView contentTextView;
    private ImageView imageView;
    private Button buttonAdd;
    private Button buttonGo;
    private ArrayList<Menu> menu1;
    private Spinner quantity;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_detail);

        // Get the intent that was used to travel to this activity

        Intent intent = getIntent();
        final int menuID = intent.getIntExtra("MenuID", 0);

        // Get the extra identified by "ArticleID" that was put into the intent at the origin.


        // Now that we were passed the ID of the clicked item, we can get the rest of the data
        // from the "database". Imagine this could be a real SQL database.
        Menu menu = MenuDatabase.getMenuById(menuID);

        nameTextView = findViewById(R.id.name);
        priceTextView = findViewById(R.id.price);
        contentTextView = findViewById(R.id.content);
        imageView = findViewById(R.id.image);
        buttonAdd = findViewById(R.id.button);
        buttonGo = findViewById(R.id.button3);
        quantity = findViewById(R.id.spinner);

        // Set the views to show the data of our object
        nameTextView.setText(menu.getName());
        priceTextView.setText(menu.getPrice());
        contentTextView.setText(menu.getContent());

        // Don't worry too much about images for now (but if you can get something to work then do)
        // Generally you don't want to store image data in your app (too much space required)
        // We'll learn the way to load images from the internet in a later week.

        // BUT we have included a way to show images that works for now.
        imageView.setImageResource(menu.getImageDrawableId());

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int[] order = new int[2];
                order[0] = menuID;
                order[1] = Integer.parseInt(quantity.getSelectedItem().toString());
                MainActivity.orderList.add(order);
            }
        });



        buttonGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MyCart.class);
                startActivity(intent);
            }
        });

        String[] StringArray = new String[]{"1","2","3","4","5"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_spinner_item,StringArray);

        Spinner spinner = findViewById(R.id.spinner);
        spinner.setAdapter(adapter);

        AdapterView.OnItemSelectedListener itemSelectedListener = new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        };

    }
}
