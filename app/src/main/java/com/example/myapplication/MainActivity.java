package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText num1,num2;
    Button add,sub,mul,div;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1=findViewById(R.id.usertext);
        num2=findViewById(R.id.usertext1);
        add=findViewById(R.id.btnAdd);
        sub=findViewById(R.id.btnSub);
        mul=findViewById(R.id.btnMul);
        div=findViewById(R.id.btnDiv);
        result=findViewById(R.id.result);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               String a=num1.getText().toString();
                String b=num2.getText().toString();
                int numb1= Integer.parseInt(a);
               int numb2 =Integer.parseInt(b);
               int numb3=numb1+numb2;
               result.setText(String.valueOf(numb3));



            }
        });


        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a=num1.getText().toString();
                String b=num2.getText().toString();
                int numb1= Integer.parseInt(a);
                int numb2 =Integer.parseInt(b);
                int numb3=numb1-numb2;
                result.setText(String.valueOf(numb3));



            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a=num1.getText().toString();
                String b=num2.getText().toString();
                int numb1= Integer.parseInt(a);
                int numb2 =Integer.parseInt(b);
                int numb3=numb1*numb2;
                result.setText(String.valueOf(numb3));



            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a=num1.getText().toString();
                String b=num2.getText().toString();
                int numb1= Integer.parseInt(a);
                int numb2 =Integer.parseInt(b);
                int numb3=numb1/numb2;
                result.setText(String.valueOf(numb3));



            }
        });





    }
}
