package com.example.alertdialogdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends  AppCompatActivity
        implements DialogInterface.OnClickListener {
private String[] items =
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        Button btnAbout =(Button) findViewById(R.id.btnAbout);
        btnAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(MainActivity.this)
                        .setTitle("關於書本")
                        .setMessage("Android程式設計與應用\n作者:陳會安\n教師: 恰克虎")
                        .setCancelable(true)
                        .setPositiveButton("確定",null)
                        .show();
            }
        });

        Button btnExit = (Button) findViewById(R.id.btnExit);
        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(MainActivity.this)
                        .setTitle("確認")
                        .setMessage("確認結束本程式?")
                        .setPositiveButton("確定", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                finish();
                            }
                        })
                        .setNegativeButton("取消", MainActivity.this)
                        .show();

            }
        });

        Button btnColor =(Button) findViewById(R.id.btnColor);
        btnColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(MainActivity.this)
                        .setTitle("選擇一個顏色")
                        .setItems(new String[]{"紅色", "黃色", "綠色"}, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                switch(which){
                                    case 0:
                                        btnColor.setBackground(Color.RED);
                                        break;
                                    case 1:
                                        btnColor.setBackground(Color.YELLOW);
                                        break;
                                    case 2:
                                        btnColor.setBackground(Color.GREEN);
                                        break;
                            }
                        })



        });

        Button btnSelect = (Button) findViewById(R.id.btnSelect);
        btnSelect.
    }

    @Override
    public void onClick(DialogInterface dialog, int which) {
 /*
        if(which>=0){
           switch (which){
                case  DialogInterface.BUTTON_POSITIVE:
                    finish();
                   break;
               case DialogInterface.BUTTON_NEGATIVE:
                   Toast.makeText(this,"按下取消紐",Toast.LENGTH_SHORT).show();;
                   break;
          }
      }
 */
    }
   /*
   Button btnColor = (Button) findViewById(R.id.btnColor);
    switch(which){
         case 0:
            btnColor.setBackground(Color.RED);
         break;
       case 1:
          btnColor.setBackground(Color.YELLOW);
          break;
      case 2:
          btnColor.setBackground(Color.GREEN);
          break;
   }
  */