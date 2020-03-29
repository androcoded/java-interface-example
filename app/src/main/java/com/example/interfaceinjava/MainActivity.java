package com.example.interfaceinjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{

    Button btnThrowJab;
    Boxer boxerA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnThrowJab = findViewById(R.id.btnThrowJabId);
        boxerA = new Boxer();
        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),boxerA.throwJab(),Toast.LENGTH_SHORT).show();
            }
        };

        btnThrowJab.setOnClickListener(onClickListener);
    }


}
