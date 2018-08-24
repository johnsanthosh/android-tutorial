package com.john.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final double DOLLAR_TO_POUND = 0.78;

    public void convertDollarsToPounds(View view){

        EditText text = findViewById(R.id.currency);

        if(!text.getText().toString().equals("")){
            double dollars = Double.parseDouble(text.getText().toString());
            Toast.makeText(MainActivity.this, (dollars * DOLLAR_TO_POUND) + " Pounds", Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(MainActivity.this, " Please enter the currency in $", Toast.LENGTH_LONG).show();
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
