package com.company;

import java.util.Scanner;

class zad13 {
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество куриц ");
        int x1 = in.nextInt();
        System.out.print("Введите количество коров ");
        int x2 = in.nextInt();
        System.out.print("Введите количество свиней ");
        int x3 = in.nextInt();
        System.out.print("Всего на ферме бегает " + ANSI_YELLOW +  animals(x1, x2, x3) + ANSI_RESET + " ног");
    }
    public static int animals(int a, int b, int c){
        return 2 * a + 4 * (b + c);
    }
}
