package com.john.demoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void clickFunction(View view){
        EditText username = findViewById(R.id.username);
        EditText password = findViewById(R.id.password);
        Log.i("Info", "Username: " + username.getText().toString() + ", Password: " + password.getText().toString());
        Toast.makeText(MainActivity.this, "Welcome back, " + username.getText().toString(), Toast.LENGTH_LONG).show();
    }

    public void changeImage(View view){
        ImageView image = findViewById(R.id.imageDog);
        image.setImageResource(R.drawable.dog2);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
