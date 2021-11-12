package com.example.th3_sagittarian.gatewayrail;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Selection extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection);



    }

    public void imp(View view) {
        Intent impo =new Intent(Selection.this, Import.class);
    startActivity(impo);
    }

    public void exp(View view) {
        Intent expo = new Intent(Selection.this, Export.class);
        startActivity(expo);

    }
}
