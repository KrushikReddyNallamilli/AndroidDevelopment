package com.example.pickersanddialogs;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button b_alertdialog,b_datepicker,b_timepicker;

    //if you want to handle the onclick event for these buttons in java we have onclickListener classes
    int c_year,c_month,c_date,c_hour,c_minute;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b_alertdialog=findViewById(R.id.alertdialogue_button);
        b_datepicker=findViewById(R.id.datepicker_button);
        b_timepicker=findViewById(R.id.timepicker_button);

        b_alertdialog.setOnClickListener(this);
        b_datepicker.setOnClickListener(this);
        b_timepicker.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.alertdialogue_button:
                openAlertDialog();
                break;
            case R.id.datepicker_button:
                openDatePicker();
                break;
            case R.id.timepicker_button:
                openTimePicker();
                break;
        }
    }

    private void openTimePicker() {
        Calendar c = Calendar.getInstance();
        c_hour = c.get(Calendar.HOUR_OF_DAY);
        c_minute = c.get(Calendar.MINUTE);
        TimePickerDialog timePickerDialog = new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                String mytime = hourOfDay + ":" + minute;
                Toast.makeText(MainActivity.this, mytime, Toast.LENGTH_SHORT).show();

            }
        }, c_hour, c_minute, true);
        timePickerDialog.show();
    }




    private void openDatePicker() {
        //if you want ot work with date picker dialog there ia a predefinde class called DatePickerDialog
        Calendar c =Calendar.getInstance();
        c_year=c.get(Calendar.YEAR);
        c_month=c.get(Calendar.MONTH);
        c_date=c.get(Calendar.DAY_OF_MONTH);

        DatePickerDialog datePickerDialog=new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                String mydate = dayOfMonth+"-"+(month+1)+"-"+year;
                Toast.makeText(MainActivity.this, mydate, Toast.LENGTH_SHORT).show();

            }
        },c_year,c_month,c_date);
        datePickerDialog.show();
    }

    private void openAlertDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setIcon(R.mipmap.ic_launcher);
                builder.setTitle("Exit");
                builder.setMessage("Are you sure want to exit ?");
                builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                });
                builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
                builder.show();
    }
}