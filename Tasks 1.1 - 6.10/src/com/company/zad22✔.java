package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class zad22 {
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите количество элементов массива: ");
        String s = reader.readLine();
        int n = Integer.parseInt(s);
        int [] Array = new int[n];
        for (int i = 0; i < n; i++){
            System.out.print("Введите " + i + " элемент массива");
            String s1 = reader.readLine();
            Array[i] = Integer.parseInt(s1);
        }
        System.out.println(ANSI_YELLOW + "Разница между максимальным и минимальным элементом массива равна " + differenceMaxMin(Array) + ANSI_RESET);
    }
    public static int differenceMaxMin(int[] Array){
        int max = Array[0], min = Array[0];
        for (int i = 1; i < Array.length; i++){
            if (Array[i] > max)
                max = Array[i];
            if (Array[i] < min)
                min = Array[i];
        }
        return max - min;
    }
}
