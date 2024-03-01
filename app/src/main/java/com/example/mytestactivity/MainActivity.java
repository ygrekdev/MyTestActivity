package com.example.mytestactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("test", "Main onCreate()");
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        Log.d("test", "Main onStart()");

        super.onStart();
    }

    @Override
    protected void onDestroy() {
        Log.d("test", "Main onDestroy()");
        super.onDestroy();
    }

    @Override
    protected void onPause() {
        Log.d("test", "Main onPause()");
        super.onPause();
    }

    @Override
    protected void onResume() {
        Log.d("test", "Main onResume()");

        super.onResume();
    }

    @Override
    protected void onRestart() {
        Log.d("test", "Main onRestart()");
        super.onRestart();
    }
}