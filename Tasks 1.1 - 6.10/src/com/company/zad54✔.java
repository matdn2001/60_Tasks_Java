package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class zad54 {
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите массив элементов, разделяя их пробелами: ");
        String s = reader.readLine();
        String [] str = s.split(" ");
        int [] array = new int [str.length];
        for (int i = 0; i < array.length; i++)
            array[i] = Integer.parseInt(str[i]);
        System.out.print(ANSI_YELLOW  + sumDigProd(array) + ANSI_RESET);
    }
    public static String sumDigProd(int[] array){
        int sum = 0, p = 1;
        for (int j = 0; j < array.length; j++)
            sum += array[j];
        return "Ответ: " + Prod(sum);
    }
    public static int Prod(int n){
        int p = 1;
        if (n < 10)
            return n;
        else
            while (n > 0){
                p *= n % 10;
                n/= 10;
            }
        return Prod(p);
    }
}

