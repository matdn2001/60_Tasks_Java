package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class zad46 {
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите число: ");
        String sn = reader.readLine();
        int n = Integer.parseInt(sn);
        int k = 0;
        System.out.print(ANSI_YELLOW + "Мультипликаторное постоянство числа " + n + " равно " + bugger(n, k) + ANSI_RESET);
    }
    public static int bugger(int n, int k){
        int p = 1;
        if (n < 10)
            return k;
        else{
            k += 1;
            while (n > 0) {
                p *= n % 10;
                n /= 10;
            }
            return bugger(p, k);
        }
    }
}
