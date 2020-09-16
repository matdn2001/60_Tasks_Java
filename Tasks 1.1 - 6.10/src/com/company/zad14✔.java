package com.company;

import java.util.Scanner;

class zad14 {
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите вероятность победы ");
        double x1 = in.nextDouble();
        System.out.print("Введите выигрыш в случае победы ");
        double x2 = in.nextDouble();
        System.out.print("Введите стоимость попытки ");
        double x3 = in.nextDouble();
        if (profitableGamble(x1, x2, x3)){
            System.out.println(ANSI_YELLOW + "Есть смысл рискнуть" + ANSI_RESET);
        }
        else{
            System.out.println(ANSI_YELLOW + "Не стоит пытаться выиграть" + ANSI_RESET);
        }

    }
    public static boolean profitableGamble(double prob, double prize, double pay){ return (prob * prize) > pay; }
}
