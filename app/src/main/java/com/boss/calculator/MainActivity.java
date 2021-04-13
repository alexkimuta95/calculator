package com.boss.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textViewResults;
    private EditText editTextNo1,editTextNo2,editTextSign;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewResults = findViewById(R.id.textView);
        editTextNo1 = findViewById(R.id.editTextNumberSigned1);
        editTextNo2 = findViewById(R.id.editTextNumberSigned2);

        editTextSign = findViewById(R.id.editTextSign);

    }
    public void buttonCalculate(View view){
        Integer integer1= Integer.parseInt(editTextNo1.getText().toString());
        Integer integer2= Integer.parseInt(editTextNo2.getText().toString());

        Integer integerResult=0;

        switch (editTextSign.getText().toString()){
            case("+"):
            break;
            case("-"):
                break;
            case("*"):
                break;
            case("/"):
                break;
            default:textViewResults.setText("Incorrect Sign");
        }
    }
}