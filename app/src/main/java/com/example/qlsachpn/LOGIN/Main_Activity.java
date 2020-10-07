package com.example.qlsachpn.LOGIN;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.qlsachpn.R;

import static com.example.qlsachpn.R.layout.activity_main;

public class Main_Activity extends AppCompatActivity {
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.imgLOGO);
        setTitle("PhuongNamBookStore");
        Thread thread = new Thread(){
            @Override
            public void run() {
                super.run();
                int t = 0;
                while (t < 2000){
                    try {
                        sleep(1000);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    t += 500;
                }
                Intent intent = new Intent(Main_Activity.this,DangNhap_Activity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(intent);
                finish();
            }
        };
        thread.start();
    }



}
