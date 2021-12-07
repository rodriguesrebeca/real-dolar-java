package com.company;

import com.company.utils.Print;
import com.company.utils.Reader;


public class Main {

    public static void main(String[] args) {

        float real = Reader.scannerReal();
        float dolar = Reader.scannerDolar();
        Print.printResult(real,dolar);
    }
}
