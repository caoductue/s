package com.example.qlsachpn.LOGIN;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.qlsachpn.R;

public class Home_Activity extends AppCompatActivity {
    ImageView imgQLS,imgSBC,imgND,imgQLHD,imgTL,imgTK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_);
        imgQLS = findViewById(R.id.imgQLS);
        imgSBC = findViewById(R.id.imgSBC);
        imgND = findViewById(R.id.imgND);
        imgQLHD = findViewById(R.id.imgQLHD);
        imgTL = findViewById(R.id.imgTL);
        imgTK = findViewById(R.id.imgTK);
//        imgQLS.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent  =new Intent(getApplicationContext(),DangKyActivity.class);
//                startActivity(intent);
//            }
//        });
    }
}
