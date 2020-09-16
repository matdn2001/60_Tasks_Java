package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.System.*;
import java.util.Arrays;

class zad26 {
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите номер числа в ряду Фибоначчи ");
        String x = reader.readLine();
        int n = Integer.parseInt(x);
        System.out.print(ANSI_YELLOW + n + " элемент последовательности Фибоначчи равняется " + Fibonacci(n) + ANSI_RESET);
    }
    public static int Fibonacci(int n){
        if (n == 0 || n == 1)
            return 1;
        else
            return (Fibonacci(n - 1) + Fibonacci(n - 2));
    }
}
