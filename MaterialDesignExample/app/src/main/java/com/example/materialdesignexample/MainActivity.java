package com.example.materialdesignexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText et_mail,et_username,et_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_mail=findViewById(R.id.mail);
        et_username=findViewById(R.id.usename);
        et_password=findViewById(R.id.password);
    }

    public void ImageButton(View view) {
        String mail=et_mail.getText().toString();
        String username=et_username.getText().toString();
        String password=et_password.getText().toString();

        Toast.makeText(this, mail+"\n"+username+"\n"+password, Toast.LENGTH_SHORT).show();
    }
}