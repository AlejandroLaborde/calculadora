package com.example.calculadora;

public class Calculadora  implements  IOperaciones{


    @Override
    public Integer sumar(Integer a, Integer b) {
        return a.intValue() + b.intValue();
    }

    @Override
    public Integer restar(Integer a, Integer b) {
        return a.intValue() - b.intValue();
    }

    @Override
    public Integer multiplicar(Integer a, Integer b) {
        return a.intValue() * b.intValue();
    }

    @Override
    public Integer dividir(Integer a, Integer b) {
        return a.intValue() / b.intValue();
    }
}
