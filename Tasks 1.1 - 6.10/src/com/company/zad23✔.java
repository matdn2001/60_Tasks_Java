package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class zad23 {
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите количество элементов массива: ");
        String s = reader.readLine();
        int n = Integer.parseInt(s);
        int [] Array = new int[n];
        for (int i = 0; i < n; i++){
            System.out.print("Введите " + i + " элемент массива: ");
            String s1 = reader.readLine();
            Array[i] = Integer.parseInt(s1);
        }
        System.out.println(ANSI_YELLOW + isAvgWhole(Array, n) + ANSI_RESET);
    }
    public static String isAvgWhole(int[] Array, int n){
        double s = 0;
        for (int i = 0; i < Array.length; i++)
            s += Array[i];
        if (s / n % 1 == 0)
            return "Среднее значение всех элементов является целым числом";
        else
            return "Среднее значение всех элементов не является целым числом";
    }
}
