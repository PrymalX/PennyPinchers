package com.example.abraham.loginregister;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class budget_form_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_budget_form_activity);

        final EditText budgetName = (EditText) findViewById(R.id.budgetName);
        final EditText budgetAmount = (EditText) findViewById(R.id.budgetAmount);
        final Button submit = (Button) findViewById(R.id.submit);

         
    }
}
