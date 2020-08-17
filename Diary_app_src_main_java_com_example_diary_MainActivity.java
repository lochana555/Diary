package com.example.diary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.text.DateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Calendar calendar=Calendar.getInstance();
        Calendar calandar;
        String currentDate= DateFormat.getDateInstance(DateFormat.FULL).format(calendar.getTime());
        TextView TextViewDate=findViewById(R.id.text_view_date);
        TextViewDate.setText(currentDate);
    }
}