package com.example.roza.medicalrecordings;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        EditText caseedit=(EditText)findViewById(R.id.editText);
        EditText parientedit=(EditText)findViewById(R.id.editText2);
        EditText dateedit=(EditText)findViewById(R.id.editText5);
        EditText idedit=(EditText)findViewById(R.id.editText4);
        Button next=(Button)findViewById(R.id.button);

        String casestring = caseedit.getText().toString();
        int casenum = 0;
        try {
            casenum = Integer.parseInt(casestring);
        } catch (NumberFormatException e) {
            casestring = ""; // this will cause the parameter check for quantity ordered to fail and pop toast
        }
        String idstring = idedit.getText().toString();
        int idnum = 0;
        try {
            idnum = Integer.parseInt(idstring);
        } catch (NumberFormatException e) {
            idstring = ""; // this will cause the parameter check for quantity ordered to fail and pop toast
        }

        String patientname=parientedit.getText().toString();
        String datevalue=dateedit.getText().toString();


        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,Main2Activity.class);
                startActivity(i);
            }
        });






    }
}
