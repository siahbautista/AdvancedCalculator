package com.app.advancedcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity2 extends AppCompatActivity {

    TextView tvResult;
    EditText etNum1, etNum2, etNum3, etNum4;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tvResult = findViewById(R.id.tvResult);
        etNum1 = findViewById(R.id.etNum1);
        etNum2 = findViewById(R.id.etNum2);
        etNum3 = findViewById(R.id.etNum3);
        etNum4 = findViewById(R.id.etNum4);

    }

    public void addNumber(View v) {

        double n1, n2, n3, n4, result = 0;

        n1 = Double.parseDouble(etNum1.getText().toString());
        n2 = Double.parseDouble(etNum2.getText().toString());
        n3 = Double.parseDouble(etNum3.getText().toString());
        n4 = Double.parseDouble(etNum4.getText().toString());


        for(double x = n1; x <= n2; x++) {
            for (double y = n3; y <= n4; y++) {
                result += x + y;
            }
        }

        tvResult.setText(String.valueOf(result));

    }

    public void subtractNumber(View v) {

        double n1, n2, n3, n4, result = 0;

        n1 = Double.parseDouble(etNum1.getText().toString());
        n2 = Double.parseDouble(etNum2.getText().toString());
        n3 = Double.parseDouble(etNum3.getText().toString());
        n4 = Double.parseDouble(etNum4.getText().toString());


        for(double x = n1; x <= n2; x++) {
            for (double y = n3; y <= n4; y++) {
                result += x - y;
            }
        }

        tvResult.setText(String.valueOf(result));

    }

    public void multiplyNumber(View v) {

        double n1, n2, n3, n4, result = 0;

        n1 = Double.parseDouble(etNum1.getText().toString());
        n2 = Double.parseDouble(etNum2.getText().toString());
        n3 = Double.parseDouble(etNum3.getText().toString());
        n4 = Double.parseDouble(etNum4.getText().toString());


        for(double x = n1; x <= n2; x++) {
            for (double y = n3; y <= n4; y++) {
                result += x * y;
            }
        }

        tvResult.setText(String.valueOf(result));

    }

    public void divideNumber(View v) {

        double n1, n2, n3, n4, result = 0;

        n1 = Double.parseDouble(etNum1.getText().toString());
        n2 = Double.parseDouble(etNum2.getText().toString());
        n3 = Double.parseDouble(etNum3.getText().toString());
        n4 = Double.parseDouble(etNum4.getText().toString());


        for(double x = n1; x <= n2; x++) {
            for (double y = n3; y <= n4; y++) {
                result += x / y;
            }
        }

        tvResult.setText(String.valueOf(result));

    }

    public void powerNumber(View v) {

        double n1, n2, n3, n4, result = 0;

        n1 = Double.parseDouble(etNum1.getText().toString());
        n2 = Double.parseDouble(etNum2.getText().toString());
        n3 = Double.parseDouble(etNum3.getText().toString());
        n4 = Double.parseDouble(etNum4.getText().toString());


        for(double x = n1; x <= n2; x++) {
            for (double y = n3; y <= n4; y++) {
                result += Math.pow(x,y);
            }
        }

        tvResult.setText(String.valueOf(result));

    }

    public void clearBTN(View view) {
        etNum1.setText("");
        etNum2.setText("");
        etNum3.setText("");
        etNum4.setText("");
        tvResult.setText("");
    }


}