package com.example.tugas_3hafizdadryansuvi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
    }

    public void clickHos(View view) {
        Intent i = new Intent(this,Hos.class);
        startActivity(i);
    }

    public void clickPol(View view) {
        Intent i = new Intent(this,Pol.class);
        startActivity(i);
    }

    public void clickSch(View view) {
        Intent i = new Intent(this,Sch.class);
        startActivity(i);
    }

    public void clickSup(View view) {
        Intent i = new Intent(this,Sup.class);
        startActivity(i);
    }
}