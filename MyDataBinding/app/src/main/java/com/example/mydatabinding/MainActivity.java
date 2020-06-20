package com.example.mydatabinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.mydatabinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
//    enable data binding in our Activity
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // initialize the Activitmainbinding
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main);
        binding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, ""+binding.editText.getText().toString()+"\n"+binding.editText2.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}