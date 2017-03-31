package com.example.abraham.loginregister;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View.OnClickListener;
import android.R.id;


public class HomePage extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        //creating Button, adding "clickable" link/listener
        Button bugBut;
        bugBut = (Button) findViewById(R.id.bBudget);
        //listener code:
        bugBut.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v){

                Intent budgetIntent = new Intent(HomePage.this, BudgetActivity.class);
                HomePage.this.startActivity(budgetIntent);
            }
        });
    }
}
