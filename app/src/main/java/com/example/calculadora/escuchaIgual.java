package com.example.calculadora;

import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class escuchaIgual implements View.OnClickListener {

    private TextView data;
    private TextView resultado;
    private Calculadora calcula;


    public  escuchaIgual(TextView data , TextView res){
        this.data = data;
        this.resultado = res;
        this.calcula = new Calculadora();
    }

    @Override
    public void onClick(View v) {
        CharSequence valores = data.getText();
        ArrayList<Integer> list = new ArrayList<Integer>();
        char operador = '+';
        int ultimoIndiceCaracter=0;
        for (int i = 0 ; i<valores.length(); i++){

            if(this.esEspecial(valores.charAt(i))){
                list.add(Integer.parseInt(valores.subSequence(0, i).toString() ));
                operador = valores.charAt(i);
                list.add(Integer.parseInt(valores.subSequence(i+1, valores.length()).toString() ));

                Log.d("caracter",list.get(0)+"");
                Log.d("caracter",operador+"");
                Log.d("caracter",list.get(1)+"");
            }
        }

        switch (operador){
            case '+':{
                this.guardaResultado(this.calcula.sumar(list.get(0),list.get(1)));
                break;
            }
            case '-':{
                this.guardaResultado(this.calcula.restar(list.get(0),list.get(1)));
                break;
            }
            case '/':{
                this.guardaResultado(this.calcula.dividir(list.get(0),list.get(1)));
                break;
            }
            case '*':{
                this.guardaResultado(this.calcula.multiplicar(list.get(0),list.get(1)));
                break;
            }

        }

    }

    private boolean esEspecial( Character caracter){
        if( caracter=='+' || caracter == '-' || caracter=='*' || caracter == '/' ){
            return true;
        }
        return false;
    }

    private void guardaResultado( Number res ){
        this.resultado.setText(res.toString());
    }
}
