package com.example.conversor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText angulo;
TextView resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        angulo = findViewById(R.id.angulo);
        resultado = findViewById(R.id.resultado);
    }

public void converterseno(View V){
       int anguloint = Integer.parseInt(angulo.getText().toString());
       double angPraGrau = Math.toRadians(anguloint);
    double grau = Math.sin(angPraGrau);
    String result = String.valueOf(grau);

    resultado.setText(result);
    }

    public  void convertercosseno(View V){
        int anguloint = Integer.parseInt(angulo.getText().toString());
        double angPraGrau = Math.toRadians(anguloint);
        double grau = Math.cos(angPraGrau);
        String result = String.valueOf(grau);

        resultado.setText(result);
    }
    public  void convertertangente(View v){
        double anguloint = Integer.parseInt(angulo.getText().toString());
        double angPraGrau = Math.toRadians(anguloint);
        double grau = Math.tan(angPraGrau);
        String result = String.valueOf(grau);

        resultado.setText(result);
    }
}

