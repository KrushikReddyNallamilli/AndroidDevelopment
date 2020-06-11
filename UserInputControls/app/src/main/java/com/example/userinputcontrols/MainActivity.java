package com.example.userinputcontrols;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText et_name,et_email,et_phone,et_password;
    TextView tv_data;
    RadioButton r_male,r_female;
    String gender;
    CheckBox ch_android,ch_java;
    Spinner sp_branch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_name=findViewById(R.id.name);
        et_email=findViewById(R.id.email);
        et_phone=findViewById(R.id.phone);
        et_password=findViewById(R.id.password);
        r_male=findViewById(R.id.malerb);
        r_female=findViewById(R.id.femalerb);
        tv_data=findViewById(R.id.result);
        ch_android=findViewById(R.id.android);
        ch_java=findViewById(R.id.java);
        sp_branch=findViewById(R.id.branches);
    }

    public void display(View view) {
        String name=et_name.getText().toString();
        String email=et_email.getText().toString();
        String phone=et_phone.getText().toString();
        String password=et_password.getText().toString();
        if(r_male.isChecked()){
            gender=r_male.getText().toString();
        }
        else if(r_female.isChecked()){
            gender=r_female.getText().toString();
        }
        StringBuilder builder = new StringBuilder();
        if (ch_java.isChecked())
        {
            builder.append(ch_java.getText().toString());
        }
        if (ch_android.isChecked())
        {
            builder.append(ch_android.getText().toString());
        }

        String branch =sp_branch.getSelectedItem().toString();
        tv_data.setText(name+"\n"+email +"\n"+phone+"\n"+password+"\n"+gender+"\n"+builder.toString()+"\n"+branch);
    }
}