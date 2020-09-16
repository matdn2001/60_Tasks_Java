package com.company;

import java.util.Scanner;

class zad11 {
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число ");
        int x1 = in.nextInt();
        System.out.print("Введите второе число ");
        int x2 = in.nextInt();
        System.out.print("Остаток от деления первого числа на второе равен " + ANSI_YELLOW +  remainder(x1, x2) + ANSI_RESET);
    }
    public static int remainder(int a, int b) {
        return a % b;
    }
}
