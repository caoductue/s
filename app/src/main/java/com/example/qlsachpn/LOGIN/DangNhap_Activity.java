package com.example.qlsachpn.LOGIN;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.qlsachpn.R;

public class DangNhap_Activity extends AppCompatActivity {
    Button btnDN,btnDK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dang_nhap_);
        btnDN = findViewById(R.id.btnDN);
        btnDK = findViewById(R.id.btnDK);
        btnDN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent  =new Intent(getApplicationContext(),Home_Activity.class);
                startActivity(intent);
            }
        });
        btnDK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent  =new Intent(getApplicationContext(),DangKyActivity.class);
                startActivity(intent);
            }
        });

    }
}
