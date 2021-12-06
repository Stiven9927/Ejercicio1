package com.example.ejercicio01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText num1;
    private EditText num2;
    private TextView cifra1;
    private TextView cifra2;
    private TextView resulparc1;

    int numero1;
    int numero2;
    int resul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cifra1 = findViewById(R.id.editTextNumber_cifra1);
        cifra2 = findViewById(R.id.editTextNumber3_cifra2);
        resulparc1 = findViewById(R.id.textView3_resparcial1);

        numero1 = Integer.valueOf(String.valueOf(cifra1).toString());
        numero2 = Integer.valueOf(String.valueOf(cifra2).toString());
    }

    public void OnCreateCalcular(View view){
        resul = numero1 * numero2;
        resulparc1.setText(String.valueOf(Integer.valueOf(resul)));
    }

}