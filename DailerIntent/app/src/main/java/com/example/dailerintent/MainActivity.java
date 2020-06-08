package com.example.dailerintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    EditText myinput_number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myinput_number=findViewById(R.id.inputnumber);
    }

    public void opendailpad(View view) {
        String mynumber_input=myinput_number.getText().toString();
        Uri uri=Uri.parse("tel:"+mynumber_input);
        Intent obj=new Intent(Intent.ACTION_DIAL,uri);
        startActivity(obj);

    }
}