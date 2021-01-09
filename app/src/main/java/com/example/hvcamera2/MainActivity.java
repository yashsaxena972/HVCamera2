package com.example.hvcamera2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent;

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            intent = new Intent(MainActivity.this,Camera2Activity.class);
        } else {
            intent = new Intent(MainActivity.this,CameraActivity.class);
        }
        startActivity(intent);
        finish();
    }
}