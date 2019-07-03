package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public EditText num1;
    public EditText num2;
    public Button btnadd;
    public Button btnsub;
    public Button btnmul;
    public Button btndiv;
    public TextView txtview;
    public double first;

    public Button getBtnsub() {
        return btnsub;
    }

    public double second;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 = (EditText) findViewById(R.id.first_number);
        num2 = (EditText) findViewById(R.id.second_number);
        btnadd = (Button) findViewById(R.id.add);
        btnsub = (Button) findViewById(R.id.sub);
        btnmul = (Button) findViewById(R.id.mul);
        btndiv = (Button) findViewById(R.id.div);
        txtview = (TextView) findViewById(R.id.text);
    }

    public void enterFirst (View view)
    {

    }

    public void enterSecond (View view)
    {

    }

    public void onClickBtnAdd (View view)
    {
        if (TextUtils.isEmpty(num1.getText()))
        {
            num1.setError("Enter Value");
            num1.requestFocus();
        }
        else
        {
            first = 0;
            first = (int) Integer.parseInt(String.valueOf(num1.getText()));
        }
        if (TextUtils.isEmpty(num2.getText()))
        {
            num2.setError("Enter value");
            num2.requestFocus();
        }
        else
        {
            second = 0;
            second = (int) Integer.parseInt(String.valueOf(num2.getText()));
        }
        double answer = first + second;
        txtview.setText("Ans = " + answer);
    }

    public void onClickBtnSub (View view)
    {
        if (TextUtils.isEmpty(num1.getText()))
        {
            num1.setError("Enter Value");
            num1.requestFocus();
        }
        else
        {
            first = 0;
            first = (int) Integer.parseInt(String.valueOf(num1.getText()));
        }
        if (TextUtils.isEmpty(num2.getText()))
        {
            num2.setError("Enter value");
            num2.requestFocus();
        }
        else
        {
            second = 0;
            second = (int) Integer.parseInt(String.valueOf(num2.getText()));
        }
        double answer = first - second;
        txtview.setText("Ans = " + answer);
    }

    public void onClickBtnMul (View view)
    {
        if (TextUtils.isEmpty(num1.getText()))
        {
            num1.setError("Enter Value");
            num1.requestFocus();
        }
        else
        {
            first = 0;
            first = (int) Integer.parseInt(String.valueOf(num1.getText()));
        }
        if (TextUtils.isEmpty(num2.getText()))
        {
            num2.setError("Enter value");
            num2.requestFocus();
        }
        else
        {
            second = 0;
            second = (int) Integer.parseInt(String.valueOf(num2.getText()));
        }
        double answer = first * second;
        txtview.setText("Ans = " + answer);
    }

    public void onClickBtnDiv (View view)
    {
        if (TextUtils.isEmpty(num1.getText()))
        {
            num1.setError("Enter Value");
            num1.requestFocus();
        }
        else
        {
            first = 0;
            first = (int) Integer.parseInt(String.valueOf(num1.getText()));
        }
        if (TextUtils.isEmpty(num2.getText()))
        {
            num2.setError("Enter value");
            num2.requestFocus();
        }
        else
        {
            second = 0;
            second = (int) Integer.parseInt(String.valueOf(num2.getText()));
        }
        double answer = 0;
        answer = first / second;
        txtview.setText("Ans = " + answer);
    }
}
