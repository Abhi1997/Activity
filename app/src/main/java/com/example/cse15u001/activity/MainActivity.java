package com.example.cse15u001.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Here", "onCreate: ");

    }

    public void Act(View view) {
        Intent intent = new Intent(this,Main2Activity.class);
        startActivity(intent);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Here", "onStart: ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Here", "onRestart: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Here", "onStop: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Here", "onPause: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Here", "onResume: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Here", "onDestroy: ");
    }
}
