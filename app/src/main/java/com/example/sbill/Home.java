package com.example.sbill;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import android.content.Intent;
import android.os.Bundle;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button button = findViewById(R.id.makePayment);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                gotoMakePayment(v);
            }
        });
    }
    public void gotoMakePayment(View view){
        Intent intent=new Intent(this,MakePayment.class);
        startActivity(intent);
    }
}