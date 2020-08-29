package com.example.customviewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private MyCustomView myCustomView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myCustomView=findViewById(R.id.customView);

        myCustomView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myCustomView.setTextColor(Color.WHITE);
                myCustomView.setViewColor(Color.RED);
                myCustomView.setViewText("Hello World!!");
            }
        });
    /*    View customView=findViewById(R.id.customView);
        
        customView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Hello!!", Toast.LENGTH_SHORT).show();
            }
        });*/
    }
}