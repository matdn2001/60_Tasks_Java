package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class zad33 {
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите число: ");
        String s = reader.readLine();
        int x = Integer.parseInt(s);
        System.out.print(ANSI_YELLOW + checkPerfect(x) + ANSI_RESET);
    }

    public static String checkPerfect(int x) {
        int sum = 0;
        for(int i = 1; i < x; i++){
            if (x % i == 0) {
                sum += i;
            }
        }
        if (sum == x)
            return "Число является совершенным";
        else
            return "Число не является совершенным";
    }
}
