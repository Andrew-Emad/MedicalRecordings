package com.example.roza.medicalrecordings;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
       final   EditText color=(EditText)findViewById(R.id.editText7);
       final   EditText shape=(EditText)findViewById(R.id.editText8);
        final   RadioButton othercolor=(RadioButton) findViewById(R.id.radioButton8);
        final   RadioButton othershape=(RadioButton) findViewById(R.id.radioButton11);
        othercolor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(othercolor.isChecked())
                {
                    color.setVisibility(color.VISIBLE);
                }

            }
        });
        othershape.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(othershape.isChecked())
                {
                    shape.setVisibility(shape.VISIBLE);
                }


            }
        });


    }
}
