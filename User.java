package com.example.parthpatel.logincase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.R.id;
import android.view.View.OnClickListener;


public class User extends AppCompatActivity {

    Button btnADD;
    private EditText income;
    private EditText expense;
    TextView result;
    double num1, num2, sum;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        income = (EditText) findViewById(R.id.nIncome);
        expense = (EditText) findViewById(R.id.nExpense);

        result = (TextView) findViewById(R.id.budgetAmount);
        btnADD = (Button) findViewById(R.id.bSubmit);
        btnADD.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {
                num1 = Double.parseDouble(income.getText().toString());
                num2 = Double.parseDouble(expense.getText().toString());

                sum = num1 - num2;

                result.setText(Double.toString(sum));
            }

        });

    }
}