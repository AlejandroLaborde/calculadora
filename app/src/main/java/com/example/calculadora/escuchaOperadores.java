package com.example.calculadora;

import android.view.View;
import android.widget.TextView;

public class escuchaOperadores implements View.OnClickListener{

    TextView data;
    TextView resultado;

    public escuchaOperadores ( TextView data, TextView res){
        this.data = data;
        this.resultado = res;
    }


    @Override
    public void onClick(View v) {
        if (this.ultimoCaracterEsOperador()){
            this.eliminaUltimoCaracter();
        }
        if(this.resultado.length()>0){
            this.data.setText(this.resultado.getText().toString());
            this.resultado.clearComposingText();
        }

        if (this.data.length()>0){
            switch (v.getId()){
                case R.id.botonSumar:{

                    this.data.setText(this.data.getText()+"+");
                    break;
                }
                case R.id.bottonMenos:{
                    this.data.setText(this.data.getText()+"-");
                    break;
                }
                case R.id.bottonDivide:{
                    this.data.setText(this.data.getText()+"/");
                    break;
                }
                case R.id.bottonMultiplica:{
                    this.data.setText(this.data.getText()+"*");
                    break;
                }
            }

        }

    }

    private boolean ultimoCaracterEsOperador(){
        CharSequence texto = this.data.getText();
        if(texto.length()>0){
            char ultimo = texto.charAt(texto.length() - 1);
            if( ultimo=='+' || ultimo == '-' || ultimo=='*' || ultimo == '/' ){
                return true;
            }
        }

        return false;
    }

    private void eliminaUltimoCaracter(){
        CharSequence texto = this.data.getText();
        this.data.setText(texto.subSequence(0,texto.length()-1));
    }
}

