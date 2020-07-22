package com.mac.neverlate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
   String number_1 ="" ;
   String number_2 ="" ;
   boolean operation_clicked = false;
   boolean isMinus = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView result = (TextView) findViewById(R.id.result);
        Button minus = (Button) findViewById(R.id.button_minus);
        Button plus = (Button) findViewById(R.id.button_plus);
        Button equal = (Button) findViewById(R.id.button_equal);
        Button button_9 = (Button) findViewById(R.id.button9);
        Button button_8 = (Button) findViewById(R.id.button8);
        Button button_7 = (Button) findViewById(R.id.button7);
        Button button_6 = (Button) findViewById(R.id.button6);
        Button button_5 = (Button) findViewById(R.id.button5);
        Button button_4 = (Button) findViewById(R.id.button4);
        Button button_3 = (Button) findViewById(R.id.button3);
        Button button_2 = (Button) findViewById(R.id.button_2);
        Button button_1 = (Button) findViewById(R.id.button1);
        Button button_0 = (Button) findViewById(R.id.button0);

        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!operation_clicked){
                    number_1 += "1";
                    result.setText(number_1);
                }else{
                    number_2 += "1";
                    result.setText(number_2);
                }
            }
        });
        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!operation_clicked){
                    number_1 += "2";
                    result.setText(number_1);
                }else{
                    number_2 += "2";
                    result.setText(number_2);
                }
            }
        });
        button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!operation_clicked){
                    number_1 += "3";
                    result.setText(number_1);
                }else{
                    number_2 += "3";
                    result.setText(number_2);
                }
            }
        });
        button_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!operation_clicked){
                    number_1 += "4";
                    result.setText(number_1);
                }else{
                    number_2 += "4";
                    result.setText(number_2);
                }
            }
        });
        button_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!operation_clicked){
                    number_1 += "5";
                    result.setText(number_1);
                }else{
                    number_2 += "5";
                    result.setText(number_2);
                }
            }
        });
        button_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!operation_clicked){
                    number_1 += "6";
                    result.setText(number_1);
                }else{
                    number_2 += "6";
                    result.setText(number_2);
                }
            }
        });
        button_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!operation_clicked){
                    number_1 += "7";
                    result.setText(number_1);
                }else{
                    number_2 += "7";
                    result.setText(number_2);
                }
            }
        });
        button_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!operation_clicked){
                    number_1 += "8";
                    result.setText(number_1);
                }else{
                    number_2 += "8";
                    result.setText(number_2);
                }
            }
        });
        button_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!operation_clicked){
                    number_1 += "9";
                    result.setText(number_1);
                }else{
                    number_2 += "9";
                    result.setText(number_2);
                }
            }
        });
        button_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!operation_clicked){
                    number_1 += "0";
                    result.setText(number_1);
                }else{
                    number_2 += "0";
                    result.setText(number_2);
                }
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isMinus = true;
                operation_clicked = true;
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isMinus = false;
                operation_clicked = true;
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isMinus){
                    int number1 = Integer.parseInt(number_1);
                    int number2 = Integer.parseInt(number_2);
                    if(number1 < number2) result.setText("-" +(number2-number1));
                    else result.setText(number1-number2);
                    number_1 =  "";
                    number_2 =  "";
                    operation_clicked = false ;
                }else{
                    int number1 = Integer.parseInt(number_1);
                    int number2 = Integer.parseInt(number_2);
                    result.setText(""+ (number1+number2));
                    number_1 =  "";
                    number_2 =  "";
                    operation_clicked = false ;
                }
            }
        });
    }
}
