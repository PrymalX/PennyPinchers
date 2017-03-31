 package com.example.abraham.loginregister;

 import android.content.Intent;
 import android.support.v7.app.AppCompatActivity;
 import android.os.Bundle;
 import android.view.View;
 import android.widget.Button;
 import android.widget.EditText;
 import android.widget.TextView;
 import android.R.id;
 import android.view.View.OnClickListener;



 public class UserAreaActivity extends AppCompatActivity {

     @Override
     protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         Button btnADD;
         Button btnLog;
         final EditText income;
         final EditText expense;
         final TextView result;


             setContentView(R.layout.activity_user_area);
             income = (EditText) findViewById(R.id.nIncome);
             expense = (EditText) findViewById(R.id.nExpense);

             result = (TextView) findViewById(R.id.budgetAmount);
             btnADD = (Button) findViewById(R.id.bSubmit);
             btnLog = (Button) findViewById(R.id.logout_btn);

            btnLog.setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {

                    //ParseUser.logout();
                        backToSignup();

                    }
                });
             btnADD.setOnClickListener(new OnClickListener() {

                 public void onClick(View v) {
                     double num1, num2;
                     double sum;

                     num1 = Double.parseDouble(income.getText().toString());
                     num2 = Double.parseDouble(expense.getText().toString());

                     sum = num1 - num2;

                     result.setText(Double.toString(sum));
                 }

             });

         }
         void backToSignup(){
             Intent intent = new Intent(UserAreaActivity.this, LoginRequest.class);
             startActivity(intent);

         }
     }
