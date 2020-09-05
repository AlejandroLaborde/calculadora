package com.example.calculadora;

import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class escuchaNumeros implements View.OnClickListener {

    private TextView data;
    private  TextView resultado;

    public escuchaNumeros(TextView data, TextView res){
        this.data = data;
        this.resultado = res;
    }


    @Override
    public void onClick(View v) {

        if(this.resultado.length()>0){
            this.resultado.setText("");
        }

        switch (v.getId()){
            case R.id.button1:{
                this.data.setText(this.data.getText()+"1");
                break;
            }
            case R.id.button2:{
                this.data.setText(this.data.getText()+"2");
                break;
            }
            case R.id.button3:{
                this.data.setText(this.data.getText() + "3");
                break;
            }
            case R.id.button4:{
                this.data.setText(this.data.getText()+"4");
                break;
            }
            case R.id.button5:{
                this.data.setText(this.data.getText()+"5");
                break;
            }
            case R.id.button6:{
                this.data.setText(this.data.getText()+"6");
                break;
            }
            case R.id.button7:{
                this.data.setText(this.data.getText()+"7");
                break;
            }
            case R.id.button8:{
                this.data.setText(this.data.getText()+"8");
                break;
            }
            case R.id.button9:{
                this.data.setText(this.data.getText()+"9");
                break;
            }

        }
    }
}
