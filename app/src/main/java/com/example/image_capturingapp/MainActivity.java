package com.example.image_capturingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    ImageView t1;
    Button t2;
    private static int Camera_Request=1888;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView t1 = (ImageView)this. findViewById(R.id.imageView);
        Button t2 = (Button) this.findViewById(R.id.button);
        t2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent cameraIntent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(cameraIntent, Camera_Request);
            }

        });

    }
    @SuppressLint("MissingSuperCall")
    protected void onActivityResult(int requestCode,int resultCode,Intent data)
    {
        if(requestCode==Camera_Request&&resultCode==RESULT_OK)
        {
            Bitmap photo=(Bitmap)data.getExtras().get("data");
            imageView.setImageBitmap(photo);
        }
    }


}
