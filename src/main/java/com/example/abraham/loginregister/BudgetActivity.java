package com.example.abraham.loginregister;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View.OnClickListener;
import android.R.id;

public class BudgetActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_budget2);

        Button create_budget;
                create_budget = (Button) findViewById((R.id.create_budget));
        //if create budget is clicked go to budget creation form
        create_budget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent budgetIntent = new Intent(BudgetActivity.this, budget_form_activity.class);
                BudgetActivity.this.startActivity(budgetIntent);
            }
        });
    }
}
