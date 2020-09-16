package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class zad25 {
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите вещественное число: ");
        String x = reader.readLine();
        System.out.println(ANSI_YELLOW + "Число имеет " + getDecimalPlaces(x) + " знака после запятой" + ANSI_RESET);
    }
    public static int getDecimalPlaces(String x){
        String thk = ".";
        if (x.contains(thk))
            return x.length() - x.indexOf(thk) - 1;
        else
            return 0;
    }
}
