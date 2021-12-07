package com.company.utils;

import java.util.Scanner;

public class Reader {
    private static Scanner scan;

    public static float scannerReal(){
        scan = new Scanner(System.in);
        Print.printMsgReal();
        float real = scan.nextFloat();
        return real;
    }

    public static float scannerDolar(){
        scan = new Scanner(System.in);
        Print.printMsgDolar();
        float dolar = scan.nextFloat();
        return dolar;
    }
}
