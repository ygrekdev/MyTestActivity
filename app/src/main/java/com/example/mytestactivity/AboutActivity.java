package com.example.mytestactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        Button button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    @Override
    protected void onDestroy() {
        Log.d("test", "About onDestroy()");
        super.onDestroy();
    }

    @Override
    protected void onStart() {
        Log.d("test", "About onStart()");
        super.onStart();
    }

    @Override
    protected void onPause() {
        Log.d("test", "About onPause()");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.d("test", "About onStop()");
        super.onStop();
    }

    @Override
    protected void onResume() {
        Log.d("test", "About onResume()");
        super.onResume();
    }

    @Override
    protected void onRestart() {
        Log.d("test", "About onRestart()");
        super.onRestart();
    }
}