package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class zad39 {
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите число: ");
        String s = reader.readLine();
        int x = Integer.parseInt(s);
        System.out.print(ANSI_YELLOW + nextPrime(x) + ANSI_RESET);
    }
    public static boolean isPrime(int x){
        boolean Prime = true;
        for (int i = 2; i < x; i++){
            if (x % i == 0)
                Prime = false;
        }
        return Prime;
    }
    public static String nextPrime(int x){
        int a = x;
        while (true){
            if (isPrime(a))
                return "Следующее после " + x + " простое число: " + a;
            else
                a += 1;
        }
    }
}
