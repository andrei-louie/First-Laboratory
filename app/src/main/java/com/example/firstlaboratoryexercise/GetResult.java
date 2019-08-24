package com.example.firstlaboratoryexercise;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class GetResult extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_result);

        if (getIntent().hasExtra("Compare Two Values")) {
            TextView getResults = (TextView) findViewById(R.id.textViewGetResult);
            String ResultValue = getIntent().getExtras().getString("Compare Two Values");
            getResults.setText(ResultValue);
        }
    }
}
