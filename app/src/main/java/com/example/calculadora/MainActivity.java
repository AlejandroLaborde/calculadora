package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button numero1 = findViewById(R.id.button1);
        Button numero2 = findViewById(R.id.button2);
        Button numero3 = findViewById(R.id.button3);
        Button numero4 = findViewById(R.id.button4);
        Button numero5 = findViewById(R.id.button5);
        Button numero6 = findViewById(R.id.button6);
        Button numero7 = findViewById(R.id.button7);
        Button numero8 = findViewById(R.id.button8);
        Button numero9 = findViewById(R.id.button9);

        Button botonMultiplicar = findViewById(R.id.bottonMultiplica);
        Button botonSumar = findViewById(R.id.botonSumar);
        Button botonDividir = findViewById(R.id.bottonDivide);
        Button botonRestar = findViewById(R.id.bottonMenos);
        Button botonIgual = findViewById(R.id.bottonIgual);

        TextView resultado = findViewById(R.id.result);
        TextView data = findViewById(R.id.data);

        escuchaNumeros clickNumero = new escuchaNumeros( data , resultado );
        escuchaOperadores clickOperador = new escuchaOperadores( data, resultado );
        escuchaIgual clickIgual = new escuchaIgual( data , resultado );

        numero1.setOnClickListener(clickNumero);
        numero2.setOnClickListener(clickNumero);
        numero3.setOnClickListener(clickNumero);
        numero4.setOnClickListener(clickNumero);
        numero5.setOnClickListener(clickNumero);
        numero6.setOnClickListener(clickNumero);
        numero7.setOnClickListener(clickNumero);
        numero8.setOnClickListener(clickNumero);
        numero9.setOnClickListener(clickNumero);

        botonMultiplicar.setOnClickListener(clickOperador);
        botonDividir.setOnClickListener(clickOperador);
        botonIgual.setOnClickListener(clickOperador);
        botonSumar.setOnClickListener(clickOperador);
        botonRestar.setOnClickListener(clickOperador);

        botonIgual.setOnClickListener(clickIgual);





    }
}
