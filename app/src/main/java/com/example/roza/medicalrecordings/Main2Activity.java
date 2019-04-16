package com.example.roza.medicalrecordings;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    String pregnancyfirst;
    String pregnancysecond;
    String pregnancythird;
    String pregnancyno;

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater men=new MenuInflater(this);
        men.inflate(R.menu.menu,menu);

    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {


        switch (item.getItemId())
        {
            case R.id.subitem1:
                pregnancyfirst="First trimester";
                return true;
            case R.id.subitem2:
                pregnancysecond="Second trimester";
                return true;
            case R.id.subitem3:
                pregnancythird="Third trimester";
                return true;
            case R.id.item2:
                pregnancyno="NO";
                return true;

        }
        return false;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView pregnancy=(TextView)findViewById(R.id.textView5);
        registerForContextMenu(pregnancy);
        Button next=(Button)findViewById(R.id.button2);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Main2Activity.this,Main3Activity.class);
                startActivity(i);
            }
        });





    }
}
