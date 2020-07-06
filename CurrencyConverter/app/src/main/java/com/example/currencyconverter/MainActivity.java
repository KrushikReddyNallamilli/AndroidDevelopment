package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText CurrencyValue;
    TextView InrValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CurrencyValue=findViewById(R.id.CurrencyText);
        InrValue=findViewById(R.id.INRText);
    }

    public void ChangeCurrency(View view) {
        String value;
        float InrVal;
        try {
            value=CurrencyValue.getText().toString();
            Toast.makeText(this, "Value ="+value, Toast.LENGTH_SHORT).show();

            InrVal=Float.valueOf(value)*74.64f;
            InrValue.setText("INR = "+String.valueOf(InrVal));
        }catch (Exception e){
            Toast.makeText(this, "Please enter in numbers", Toast.LENGTH_SHORT).show();
        }

    }
}