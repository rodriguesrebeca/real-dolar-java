package com.company.utils;

import com.company.services.Calculator;

public class Print {
    final static String MSG_REAL = "Insira o valor que você deseja converter: R$";
    final static String MSG_DOLAR = "Insira a cotação do dolár no dia de hoje: R$";
    final static String MSG_RESULT = "O valor de R$%.2f com o dolar a R$%.2f equivale a $%.2f";

    public static void printMsgReal() {
        System.out.print(MSG_REAL);
    }

    public static void printMsgDolar(){
        System.out.print(MSG_DOLAR);
    }

    public static void printResult(float real, float dolar){
        System.out.printf(MSG_RESULT, real, dolar, Calculator.realToDolar(real,dolar));
    }
}
