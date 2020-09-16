package com.company;

import java.io.IOException;
import java.util.Scanner;

class zad17 {
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите конечное число ");
        int x1 = in.nextInt();
        System.out.println(ANSI_YELLOW + "Сумма чисел от 1 до  " + x1 + " равна " + addUpTo(10) + ANSI_RESET);
    }
    public static int addUpTo(int a){
        return a * (a + 1) / 2;
    }
}
