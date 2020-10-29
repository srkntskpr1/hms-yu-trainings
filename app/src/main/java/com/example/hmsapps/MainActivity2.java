package com.example.hmsapps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private TextView textName;
    private String strName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        textName = (TextView) findViewById(R.id.txtAd);
        Bundle bundle = getIntent().getExtras();
        strName = bundle.getString("NAME");
        textName.setText(strName);
        setTitle("Kullanıcı Paneli");
    }
}