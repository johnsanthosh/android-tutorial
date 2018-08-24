package com.john.animations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void fade(View view){
        ImageView homer = findViewById(R.id.homer);
        homer.animate().scaleX(0.5f).scaleY(0.5f).setDuration(500);
        //homer.animate().translationYBy(1000f).setDuration(1000);

        ImageView bart = findViewById(R.id.bart);
        bart.animate().alpha(1f).setDuration(2000);
        bart.animate().rotation(360).setDuration(4000);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
