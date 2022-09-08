package com.example.holaandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


// recibir datos desdel layout

        EditText editText1 = findViewById(R.id.edit1);
        EditText editText2 = findViewById(R.id.edit2);
        TextView mditText = findViewById(R.id.resultado);


        Button button1 = findViewById(R.id.btn1);
        Button button2 = findViewById(R.id.btn2);
        Button button3 = findViewById(R.id.btn3);
        Button button4 = findViewById(R.id.btn4);




        // proceso


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String num1  = editText1.getText().toString();
                String num2  = editText2.getText().toString();
                int resul = Integer.parseInt(num1)+Integer.parseInt(num2);
                mditText.setText("El resultado es "+ resul);
                editText1.setText("");
                editText2.setText("");

            }
        });



        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String num1  = editText1.getText().toString();
                String num2  = editText2.getText().toString();
                int resul = Integer.parseInt(num1)-Integer.parseInt(num2);
                mditText.setText("El resultado es "+ resul);
                editText1.setText("");
                editText2.setText("");

            }
        });


        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String num1  = editText1.getText().toString();
                String num2  = editText2.getText().toString();
                int resul = Integer.parseInt(num1)*Integer.parseInt(num2);
                mditText.setText("El resultado es "+ resul);
                editText1.setText("");
                editText2.setText("");

            }
        });


        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String num1  = editText1.getText().toString();
                String num2  = editText2.getText().toString();
                int resul = Integer.parseInt(num1)/Integer.parseInt(num2);
                mditText.setText("El resultado es "+ resul);
                editText1.setText("");
                editText2.setText("");

            }
        });


    }}