package com.example.mycal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText inputNum;
    private TextView outputNum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button0 = findViewById(R.id.button0);
        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);
        Button button5 = findViewById(R.id.button5);
        Button button6 = findViewById(R.id.button6);
        Button button7 = findViewById(R.id.button7);
        Button button8 = findViewById(R.id.button8);
        Button button9 = findViewById(R.id.button9);
        Button buttonPlus = findViewById(R.id.buttonPlus);
        Button buttonMinus = findViewById(R.id.buttonMinus);
        Button buttonDiv = findViewById(R.id.buttonDiv);
        Button buttonTimes = findViewById(R.id.buttonTimes);
        Button buttonPer = findViewById(R.id.buttonPer);
        Button buttonDot = findViewById(R.id.buttonDot);
        Button buttonBack = findViewById(R.id.buttonBack);
        Button buttonClear = findViewById(R.id.buttonClear);
        Button buttonEqual = findViewById(R.id.buttonEqual);
        inputNum = findViewById(R.id.input_num);
        inputNum.setKeyListener(null);
        inputNum.requestFocus();
        outputNum = findViewById(R.id.result);

        button0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (outputNum.getText().toString() != ""){
                    inputNum.setText("");
                    outputNum.setText("");
                }
                String str = inputNum.getText().toString();
                inputNum.setText(str+((Button)v).getText());
            }
        });

        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (outputNum.getText().toString() != ""){
                    inputNum.setText("");
                    outputNum.setText("");
                }
                String str = inputNum.getText().toString();
                inputNum.setText(str+((Button)v).getText());
            }
        });

        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (outputNum.getText().toString() != ""){
                    inputNum.setText("");
                    outputNum.setText("");
                }
                String str = inputNum.getText().toString();
                inputNum.setText(str+((Button)v).getText());
            }
        });

        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (outputNum.getText().toString() != ""){
                    inputNum.setText("");
                    outputNum.setText("");
                }
                String str = inputNum.getText().toString();
                inputNum.setText(str+((Button)v).getText());
            }
        });

        button4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (outputNum.getText().toString() != ""){
                    inputNum.setText("");
                    outputNum.setText("");
                }
                String str = inputNum.getText().toString();
                inputNum.setText(str+((Button)v).getText());
            }
        });

        button5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (outputNum.getText().toString() != ""){
                    inputNum.setText("");
                    outputNum.setText("");
                }
                String str = inputNum.getText().toString();
                inputNum.setText(str+((Button)v).getText());
            }
        });

        button6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (outputNum.getText().toString() != ""){
                    inputNum.setText("");
                    outputNum.setText("");
                }
                String str = inputNum.getText().toString();
                inputNum.setText(str+((Button)v).getText());
            }
        });

        button7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (outputNum.getText().toString() != ""){
                    inputNum.setText("");
                    outputNum.setText("");
                }
                String str = inputNum.getText().toString();
                inputNum.setText(str+((Button)v).getText());
            }
        });

        button8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (outputNum.getText().toString() != ""){
                    inputNum.setText("");
                    outputNum.setText("");
                }
                String str = inputNum.getText().toString();
                inputNum.setText(str+((Button)v).getText());
            }
        });

        button9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (outputNum.getText().toString() != ""){
                    inputNum.setText("");
                    outputNum.setText("");
                }
                String str = inputNum.getText().toString();
                inputNum.setText(str+((Button)v).getText());
            }
        });

        buttonDot.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (outputNum.getText().toString() != ""){
                    inputNum.setText("");
                    outputNum.setText("");
                }
                String str = inputNum.getText().toString();
                int l = str.length();
                if(l != 0){
                    switch(str.charAt(l-1)){
                        case '.': break;
                        case ' ': inputNum.setText(str+"0"+((Button)v).getText());break;
                        default:  inputNum.setText(str+((Button)v).getText());break;
                    }
                }else{
                    inputNum.setText(str+"0"+((Button)v).getText());
                }

            }
        });

        buttonPlus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (outputNum.getText().toString() != ""){
                    inputNum.setText("");
                    outputNum.setText("");
                }
                String str = inputNum.getText().toString();
                int l = str.length();
                if(l > 0 & l < 5) {
                    switch (str.charAt(l - 1)) {
                        case ' ':
                            break;
                        default:
                            inputNum.setText(str + " " + ((Button) v).getText() + " ");
                    }
                }else{
                    Toast.makeText(MainActivity.this,"Math Error",Toast.LENGTH_SHORT).show();
                    }

            }
        });

        buttonMinus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (outputNum.getText().toString() != ""){
                    inputNum.setText("");
                    outputNum.setText("");
                }
                String str = inputNum.getText().toString();
                int l = str.length();
                if(l > 0 & l < 5) {
                    switch (str.charAt(l - 1)) {
                        case ' ':
                            break;
                        default:
                            inputNum.setText(str + " " + ((Button) v).getText() + " ");
                    }
                }else{
                    Toast.makeText(MainActivity.this,"Math Error",Toast.LENGTH_SHORT).show();
                }
            }
        });

        buttonTimes.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (outputNum.getText().toString() != ""){
                    inputNum.setText("");
                    outputNum.setText("");
                }
                String str = inputNum.getText().toString();
                int l = str.length();
                if(l > 0 & l < 5) {
                    switch (str.charAt(l - 1)) {
                        case ' ':
                            break;
                        default:
                            inputNum.setText(str + " " + ((Button) v).getText() + " ");
                    }
                }else{
                    Toast.makeText(MainActivity.this,"Math Error",Toast.LENGTH_SHORT).show();
                }
            }
        });

        buttonDiv.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (outputNum.getText().toString() != ""){
                    inputNum.setText("");
                    outputNum.setText("");
                }
                String str = inputNum.getText().toString();
                int l = str.length();
                if(l > 0 & l < 5) {
                    switch (str.charAt(l - 1)) {
                        case ' ':
                            break;
                        default:
                            inputNum.setText(str + " " + ((Button) v).getText() + " ");
                    }
                }else{
                    Toast.makeText(MainActivity.this,"Math Error",Toast.LENGTH_SHORT).show();
                }
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String str = inputNum.getText().toString();
                Double result = getResult(str);
                outputNum.setText(result.toString());
            }
        });

        buttonClear.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                inputNum.setText("");
            }
        });

        buttonBack.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String str = inputNum.getText().toString();
                int l = str.length();
                if (l > 0) {
                    inputNum.getText().delete(l - 1, l);
                }
                else{
                    Toast.makeText(MainActivity.this,"Math Error",Toast.LENGTH_SHORT).show();
                }

            }
        });

        buttonPer.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (outputNum.getText().toString() != ""){
                    inputNum.setText("");
                    outputNum.setText("");
                }
                String str = inputNum.getText().toString();
                int l = str.length();
                if(l > 0 ) {
                    switch (str.charAt(l - 1)) {
                        case ' ':
                        case '%': break;
                        default: inputNum.setText(str + ((Button) v).getText());
                    }
                }else{
                    Toast.makeText(MainActivity.this,"Math Error",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public Double getResult(String str){
        Double result =0.0;
        int space = str.indexOf(" ");
        int l = str.length();
        if (l > 4 & space >0){
            String s1 = str.substring(0, space);
            String op = str.substring(space+1, space+2);
            String s2 = str.substring(space+3);
            Double arg1;
            Double arg2;
            int l1 = s1.length();
            int l2 = s2.length();
            if (s1.charAt(l1-1) == '%'){
                arg1 = Double.parseDouble(s1.substring(0, l1-1))*0.01;
            }else{
                arg1 = Double.parseDouble(s1);
            }
            if (s2.charAt(l2-1) == '%'){
                arg2 = Double.parseDouble(s2.substring(0, l2-1))*0.01;
            }else{
                arg2 = Double.parseDouble(s2);
            }

            if (arg2 !=null){
                switch (op.charAt(0)){
                    case '+': result = arg1+arg2;break;
                    case '*': result = arg1*arg2;break;
                    case '-': result = arg1*arg2;break;
                    case '/':
                        if(arg2 != 0){
                            result = arg1/arg2;
                        }else{
                            Toast.makeText(MainActivity.this,"Math Error",Toast.LENGTH_SHORT).show();
                        }break;
                }
            }

        }else if (l > 0){
            int l1 = str.length();
            if( str.charAt(l1-1) == '%'){
                result = Double.parseDouble(str.substring(0, l1-1))*0.01;
            }else if (str.charAt(l1-1) == ' '){
                Toast.makeText(MainActivity.this,"Math Error",Toast.LENGTH_SHORT).show();
            }else{
                result = Double.parseDouble(str);
            }
        }
        return result;

    }
}
