package com.company;

import java.util.Scanner;

class zad12 {
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите основание треугольника ");
        int x1 = in.nextInt();
        System.out.print("Введите высоту треугольника ");
        int x2 = in.nextInt();
        System.out.print("Площадь треугольника равна " + ANSI_YELLOW +  triArea(x1, x2) + ANSI_RESET);
    }
    public static int triArea(int a, int b){
        return a * b / 2;
    }
}
