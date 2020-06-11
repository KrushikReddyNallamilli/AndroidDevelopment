package com.example.menus;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mymenu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.aboutus:
                Toast.makeText(this, "this is about us", Toast.LENGTH_SHORT).show();
                break;
            case R.id.contactus:
                Toast.makeText(this, "this is contact page", Toast.LENGTH_SHORT).show();
                break;
            case  R.id.settings:
                Toast.makeText(this, "This is settings", Toast.LENGTH_SHORT).show();
        }
        return true;
    }
}