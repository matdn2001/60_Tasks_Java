package com.company;

import java.io.IOException;
import java.util.Scanner;

class zad18 {
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое ребро треугольника ");
        int x1 = in.nextInt();
        System.out.print("Введите второе ребро треугольника ");
        int x2 = in.nextInt();
        System.out.println(ANSI_YELLOW + "Третье ребро треугольника может иметь максимальную длину " + nextEdge(x1, x2) + ANSI_RESET);
    }
    public static int nextEdge(int a, int b){ return a + b - 1; }
}
