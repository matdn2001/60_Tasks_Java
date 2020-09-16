package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class zad210 {
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите номер шага: ");
        String s = reader.readLine();
        int n = Integer.parseInt(s);
        System.out.print(ANSI_YELLOW + "На " + n + " шаге " + boxSeq(n) + " полей" + ANSI_RESET);
    }
    public static int boxSeq(int n){
        if (n == 0)
            return 0;
        else if (n % 2 == 0)
            return (boxSeq(n - 1) - 1);
        else
            return (boxSeq(n - 1) + 3);
    }
}
