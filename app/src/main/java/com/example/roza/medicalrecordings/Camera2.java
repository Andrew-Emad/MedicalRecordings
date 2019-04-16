package com.example.roza.medicalrecordings;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Camera2 extends Activity implements View.OnClickListener {

    Button ib;
    Button ib2;
    ImageView iv;
    ImageView iv2;
    Intent i;
    Intent i2;


    Bitmap bmp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.photo2);
        initialize();
    }

    public void initialize()
    {
        ib=(Button) findViewById(R.id.button9);
        ib2=(Button)findViewById(R.id.button7);
        iv=(ImageView)findViewById(R.id.imageView3);
        iv2=(ImageView)findViewById(R.id.imageView4);

        ib.setOnClickListener(this);
        ib2.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.button7:
                i=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(i,1);
                break;
            case R.id.button9:
                i2=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(i2,2);
                break;
        }

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode){
            case 1:
                if(resultCode==RESULT_OK)
                {
                    Bundle extras=data.getExtras();
                    bmp=(Bitmap)extras.get("data");
                    iv.setImageBitmap(bmp);
                }
                break;
            case 2:
                if(resultCode==RESULT_OK)
                {
                    Bundle extras=data.getExtras();
                    bmp=(Bitmap)extras.get("data");
                    iv2.setImageBitmap(bmp);
                }
                break;
        }
    }






}
