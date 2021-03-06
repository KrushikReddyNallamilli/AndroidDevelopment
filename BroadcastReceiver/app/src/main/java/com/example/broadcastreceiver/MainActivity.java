package com.example.broadcastreceiver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView img;
    MyReceiver rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img=findViewById(R.id.android);
        rv=new MyReceiver(img);
        IntentFilter i=new IntentFilter();
        i.addAction(Intent.ACTION_POWER_CONNECTED);
        i.addAction(Intent.ACTION_POWER_DISCONNECTED);
        this.registerReceiver(rv,i);

    }
}