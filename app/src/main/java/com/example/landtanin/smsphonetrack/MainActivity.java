package com.example.landtanin.smsphonetrack;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    private TextView showLocation;
    private Button requestLocation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bindWidget();


    }

    private void bindWidget() {

        showLocation = (TextView) findViewById(R.id.showLocation);
        requestLocation = (Button) findViewById(R.id.requestLocation);

    }

    private void buttonController() {

        requestLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //showLocation.setText();

            }
        });

    }
}
