package com.nda.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView calresult;

    boolean isAdd = false, isSub = false, isMul = false, isDiv = false;

    int result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button button1, button2, button3, button4, button5, button6, button7, button8, button9, button0,
                buttonCE, buttonC, buttonBS, buttonadd, buttonsub, buttonmul, buttondiv, buttoneql;



        calresult = (TextView)findViewById(R.id.calResult);

        button0 = (Button)findViewById(R.id.button0);
        button1 = (Button)findViewById(R.id.button1);
        button2 = (Button)findViewById(R.id.button2);
        button3 = (Button)findViewById(R.id.button3);
        button4 = (Button)findViewById(R.id.button4);
        button5 = (Button)findViewById(R.id.button5);
        button6 = (Button)findViewById(R.id.button6);
        button7 = (Button)findViewById(R.id.button7);
        button8 = (Button)findViewById(R.id.button8);
        button9 = (Button)findViewById(R.id.button9);
        buttonadd = (Button)findViewById(R.id.buttonAdd);
        buttonsub = (Button)findViewById(R.id.buttonSub);
        buttonmul = (Button)findViewById(R.id.buttonMul);
        buttondiv = (Button)findViewById(R.id.buttonDiv);
        buttonC = (Button)findViewById(R.id.buttonC);
        buttonCE = (Button)findViewById(R.id.buttonCE);
        buttonBS = (Button)findViewById(R.id.buttonBS);
        buttoneql = (Button)findViewById(R.id.buttonEql);

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(calresult.getText().equals("0")) {
                    calresult.setText(null);
                }
                calresult.setText(calresult.getText() + "0");
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(calresult.getText().equals("0")){
                    calresult.setText(null);
                }
                    calresult.setText(calresult.getText() + "1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(calresult.getText().equals("0")){
                    calresult.setText(null);
                }
                calresult.setText(calresult.getText() + "2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(calresult.getText().equals("0")){
                    calresult.setText(null);
                }
                calresult.setText(calresult.getText() + "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(calresult.getText().equals("0")){
                    calresult.setText(null);
                }
                calresult.setText(calresult.getText() + "4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(calresult.getText().equals("0")){
                    calresult.setText(null);
                }
                calresult.setText(calresult.getText() + "5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(calresult.getText().equals("0")){
                    calresult.setText(null);
                }
                calresult.setText(calresult.getText() + "6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(calresult.getText().equals("0")){
                    calresult.setText(null);
                }
                calresult.setText(calresult.getText() + "7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(calresult.getText().equals("0")){
                    calresult.setText(null);
                }
                calresult.setText(calresult.getText() + "8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(calresult.getText().equals("0")){
                    calresult.setText(null);
                }
                calresult.setText(calresult.getText() + "9");
            }
        });

        buttonadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result = Integer.parseInt(calresult.getText().toString());
                calresult.setText(null);
                isAdd = true;
            }
        });

        buttonsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result = Integer.parseInt(calresult.getText().toString());
                calresult.setText(null);
                isSub = true;
            }
        });

        buttonmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result = Integer.parseInt(calresult.getText().toString());
                calresult.setText(null);
                isMul = true;
            }
        });

        buttondiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result = Integer.parseInt(calresult.getText().toString());
                calresult.setText(null);
                isDiv = true;
            }
        });

        buttoneql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isAdd == true){
                    result += Integer.parseInt(calresult.getText().toString());
                    calresult.setText(result + "");
                    isAdd = false;
                }
                if (isSub == true){
                    result -= Integer.parseInt(calresult.getText().toString());
                    calresult.setText(result + "");
                    isSub = false;
                }
                if (isMul == true){
                    result *= Integer.parseInt(calresult.getText().toString());
                    calresult.setText(result + "");
                    isMul = false;
                }
                if (isDiv == true){
                    result = result/Integer.parseInt(calresult.getText().toString());
                    calresult.setText(result + "");
                    isDiv = false;
                }
            }
        });

        buttonCE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calresult.setText("0");
            }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isAdd == true || isSub == true || isMul == true || isDiv == true){
                    calresult.setText(result + "");
                    isAdd = false;
                    isSub = false;
                    isMul = false;
                    isDiv = false;
                }
            }
        });





    }
}