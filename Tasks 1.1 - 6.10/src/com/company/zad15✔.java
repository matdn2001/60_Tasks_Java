package com.company;

import java.util.Scanner;

class zad15 {
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число N ");
        int x1 = in.nextInt();
        System.out.print("Введите число a ");
        int x2 = in.nextInt();
        System.out.print("Введите число b ");
        int x3 = in.nextInt();
        System.out.println(operation(x1, x2, x3));
    }
    public static String operation(int N, int a, int b){
        if (a + b == N){
            return ANSI_YELLOW + "Нужно произвести действие сложения" + ANSI_RESET;
        }
        else if (a - b == N){
            return ANSI_YELLOW + "Нужно произвести действие вычитания" + ANSI_RESET;
        }
        else if (a * b == N){
            return ANSI_YELLOW + "Нужно произвести действие умножения" + ANSI_RESET;
        }
        else if (a / b == N){
            return ANSI_YELLOW + "Нужно произвести действие деления" + ANSI_RESET;
        }
        else {
            return ANSI_YELLOW + "К сожалению, исходное число невозможно получить из чисел a и b" + ANSI_RESET;
        }
    }
}
