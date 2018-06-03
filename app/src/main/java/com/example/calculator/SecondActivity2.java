package com.example.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity2 extends AppCompatActivity {
    Intent gi=getIntent();
    TextView tvv2;
    Button btnB;
    Double x=9.9999999999909999;
    double sum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second2);
        tvv2=findViewById(R.id.tvv2);
        btnB=findViewById(R.id.btnB);
        sum=gi.getDoubleExtra("sum",x);
        tvv2.setText(sum+"");
    }

    public void Back(View view) {
        gi=new Intent(this,MainActivity.class);
        startActivity(gi);
    }
}
