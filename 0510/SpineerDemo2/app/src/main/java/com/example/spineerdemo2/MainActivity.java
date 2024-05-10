package com.example.spineerdemo2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText opd1,opd2;

    private TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        opd1 =(EditText) findViewById(R.id.txtOpd1);

        opd2 =(EditText) findViewById(R.id.txtOpd2);

        output = (TextView) findViewById(R.id.lblOutput);
    }
}