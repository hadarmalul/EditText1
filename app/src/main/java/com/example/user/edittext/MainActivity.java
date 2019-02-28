package com.example.user.edittext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText et;
    Double num1, num2;
    int actold, actnow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et = (EditText) findViewById(R.id.et);

        num1 = null;
        num2 = null;
        actold = 0;
        actnow = 0;

    }

    public void clickplus(View view) {
        String st1= et.getText().toString();
        // bdikat kelet
        double a= Double.parseDouble(st1);
        int actnow = 1;
        if (num1==null) {
            num1=a;
            actold=1;
        } else {
            num2=a;
            switch (actold){
                case 1:
                    num1= num1+num2;
                    et.setText(""+num1);
                case 2:
                    num1= num1-num2;
                    et.setText(""+num1);
                case 3:
                    num1= num1*num2;
                    et.setText(""+num1);
                case 4:
                    num1= num1/num2;
                    et.setText(""+num1);
            }


        }
    }

    public void clickmin(View view) {
        String st2= et.getText().toString();
        double b= Double. parseDouble(st2);
        actnow=2;
        if (num1==null){
            num1=b;
            actold=2;
        } else{
            num2=b;
            switch (actold){
                case 1:
                    num1= num1+num2;
                    et.setText(""+num1);
                case 2:
                    num1= num1-num2;
                    et.setText(""+num1);
                case 3:
                    num1= num1*num2;
                    et.setText(""+num1);
                case 4:
                    num1= num1/num2;
                    et.setText(""+num1);
            }
        }
    }
}
