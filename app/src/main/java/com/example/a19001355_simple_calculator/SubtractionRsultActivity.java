package com.example.a19001355_simple_calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SubtractionRsultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subtraction_rsult);
        // get user input 1 from previous activity
        String user_value_1 = getIntent().getStringExtra("value_1");
        // get user input 2 from previous activity
        String user_value_2 = getIntent().getStringExtra("value_2");
        // get sum of them
        Integer result = Integer. parseInt(user_value_1) - Integer. parseInt(user_value_2);
        //        access output text view by id
        TextView output_text = findViewById(R.id.output_text);
        //        set output text value
        output_text.setText("The Subtraction of " + user_value_1  +" and " + user_value_2 + " is");
        //        access output result field by id
        TextView output_result = findViewById(R.id.answer);
        //        set output result value by getting addition of both two user inputs
        output_result.setText(result.toString());

        //access go back btn by id
        Button goHomeBtn = findViewById(R.id.go_back_btn);

        //      to add click listener addition
        goHomeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goHomeBtn();
            };
        });

    }
    public void goHomeBtn(){
        //        create new intent instant from  intent class
        Intent inten = new Intent(this, MainActivity.class);
        // go to home page
        startActivity(inten);
    }

}