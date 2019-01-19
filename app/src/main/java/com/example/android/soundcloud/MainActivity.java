package com.example.android.soundcloud;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button breezeBtn;
    Button midnightBtn;
    Button relaxingBtn;
    Button escapeBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //find the button that shows the breeze songs
        breezeBtn = (Button) findViewById(R.id.breeze);
        //find the button that shows the midnight songs
        midnightBtn = (Button) findViewById(R.id.midnight);
        //find the button that shows the relaxing songs
        relaxingBtn = (Button) findViewById(R.id.relaxing);
        //find the button that shows the escape songs
        escapeBtn = (Button) findViewById(R.id.escape);
        //set a clickListener on that button
        breezeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent breezeIntent = new Intent(MainActivity.this, Breeze.class);
                startActivity(breezeIntent);

            }

        });
        //set a clickListener on that button
        relaxingBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent relaxIntent = new Intent(MainActivity.this, Relax.class);
                startActivity(relaxIntent);

            }

        });
        //set a clickListener on that button
        midnightBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent midnightIntent = new Intent(MainActivity.this, Midnight.class);
                startActivity(midnightIntent);

            }

        });
        //set a clickListener on that button
        escapeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent escapeIntent = new Intent(MainActivity.this, Escape.class);
                startActivity(escapeIntent);

            }

        });


    }
}
