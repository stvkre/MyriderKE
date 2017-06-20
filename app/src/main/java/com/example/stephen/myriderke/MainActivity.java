package com.example.stephen.myriderke;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button mRequestRideButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);
        mRequestRideButton = (Button) findViewById(R.id.requestRideButton);
        mRequestRideButton.setOnClickListener(new View.OnClickListener() {

            // intents to navigate to next activity
            @Override

            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RiderActivity.class);
                startActivity(intent);
            }
        });
    }
}
