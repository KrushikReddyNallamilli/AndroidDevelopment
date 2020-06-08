package com.example.myintents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText myinput_url;
    EditText et_ourMessage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myinput_url=findViewById(R.id.inputUrl);
        et_ourMessage=findViewById(R.id.et_msg);
    }
    //with in the screen we are navigating the second screen
    //explicit intent
    public void navigate_secondScreen(View view) {
        String mymessage_input=et_ourMessage.getText().toString();
        Intent myintentobj=new Intent(this,SecondActivity.class);
        //By usig this intentobj.putExtra()  it will be save the da
        myintentobj.putExtra("apssdc",mymessage_input);
        startActivity(myintentobj);
    }
    //implicit intent
    public void openBrowser(View view) {
        String url=myinput_url.getText().toString();
        Uri uri=Uri.parse("https://www."+url+".com");
        Intent obj=new Intent(Intent.ACTION_VIEW,uri);
        startActivity(obj);
    }
}