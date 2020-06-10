package com.example.activitylifecycletest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=findViewById(R.id.textview);
        tv.append("Onctrate \n");
        Log.d("MainActivity","oncreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        tv.append("onstart \n");
        Log.d("MainActivity","onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        tv.append("onResume \n");
        Log.d("MainActivity","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        tv.append("onpause \n");
        Log.d("MainActivity","onPause");

    }

    @Override
    protected void onStop() {
        super.onStop();
        tv.append("onstop \n");
        Log.d("MainActivity","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        tv.append("ondestroy \n");
        Log.d("MainActivity","oncdestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        tv.append("onrestart \n");
        Log.d("MainActivity","onRestart");
    }
}