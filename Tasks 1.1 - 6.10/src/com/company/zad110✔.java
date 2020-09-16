package com.company;

import java.io.IOException;
import java.util.Scanner;

class zad110 {
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число a ");
        int x1 = in.nextInt();
        System.out.print("Введите число b ");
        int x2 = in.nextInt();
        System.out.print("Введите число c ");
        int x3 = in.nextInt();
        System.out.println(ANSI_YELLOW + abcmath(x1, x2, x3) + ANSI_RESET);
    }
    public static String abcmath(int a, int b, int c){
        for (int i = 0; i < b; i++){
            a += a;
        }
        if (a % c == 0){
            return "a после изменения делится на с";
        }
        else{
            return "a после изменения не делится на с";
        }
    }
}
