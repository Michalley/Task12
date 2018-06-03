package com.example.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView tv;
    Button btnb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tv=findViewById(R.id.tv);
        btnb=findViewById(R.id.btnb);
        tv.setText(getIntent().getExtras().getString("sum"));
    }

    public void Back(View view) {
        Intent t=new Intent(this,MainActivity.class);
        startActivity(t);
    }
}
