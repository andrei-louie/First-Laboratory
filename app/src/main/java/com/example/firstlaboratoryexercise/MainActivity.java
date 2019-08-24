package com.example.firstlaboratoryexercise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public EditText firstValue;
    public EditText secondValue;
    public int setSwapNum = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstValue = (EditText) findViewById(R.id.editTextFirstValue);
        secondValue = (EditText) findViewById(R.id.editTextSecondValue);
        Button buttonCompareValue = (Button) findViewById(R.id.buttonCompare);
        Button buttonSwapValue = (Button) findViewById(R.id.buttonSwap);

        buttonCompareValue.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (firstValue.getText().toString().equals(secondValue.getText().toString())) {
                            Intent startIntent = new Intent(getApplicationContext(), GetResult.class);
                            startIntent.putExtra("Compare Two Values","The Same!");
                            startActivity(startIntent);
                        } else {
                            Intent startIntent = new Intent(getApplicationContext(), GetResult.class);
                            startIntent.putExtra("Compare Two Values","Not The Same!");
                            startActivity(startIntent);
                        }
                    }
                }
        );


        buttonSwapValue.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String firstInputValue = firstValue.getText().toString();
                        String secondInputValue = secondValue.getText().toString();
                        firstValue.setText(secondInputValue);
                        secondValue.setText(firstInputValue);
                    }
                }
        );
    }
}
