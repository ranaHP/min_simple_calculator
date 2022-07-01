package com.example.a19001355_simple_calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    //      to access user entered value by id
    EditText user_value_1 ;
    //      to access user entered value by id
    EditText user_value_2 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println(" Hi main  ");
        //      to access user entered value by id
        user_value_1 = findViewById(R.id.user_value_1);
        //      to access user entered value by id
        user_value_2 = findViewById(R.id.user_value_2);
        //      to access addition btn by id
        Button addition_btn = findViewById(R.id.addition);
        //      to access subtraction btn by id
        Button subtraction_btn = findViewById(R.id.subtraction);
        //      to add click listener addition
        addition_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToAdditionResultPage();
            };
        });
        //      to subtraction click listener addition
        subtraction_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToSubtractionResultPage();
            };
        });
    }
    public void goToAdditionResultPage(){
        //        create new intent instant from  intent class
        Intent inten = new Intent(this, AdditionnResultActivity.class);
        //     put user value as extra parameters
        inten.putExtra("value_1", user_value_1.getText().toString() );
        inten.putExtra("value_2", user_value_2.getText().toString() );
        // go to page addition result
        startActivity(inten);
    };
    public void goToSubtractionResultPage(){
        //        create new intent instant from  intent class
        Intent inten = new Intent(this, SubtractionRsultActivity.class);
        //     put user value as extra parameters
        inten.putExtra("value_1", this.user_value_1.getText().toString() );
        inten.putExtra("value_2", this.user_value_2.getText().toString() );
        // go to page addition result
        startActivity(inten);
    };
}