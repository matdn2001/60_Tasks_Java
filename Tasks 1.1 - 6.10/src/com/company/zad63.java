package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class zad63 {
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите rgb или rgba значения: ");
        String s = reader.readLine();
        validColor(s);
    }
    public static void validColor(String s){
        String start = s.substring(0, 4);
        int left = s.indexOf('(');
        int right = s.indexOf(')');
        String between = s.substring(left + 1, right);
        String[] betweenArr = between.split(",");
        boolean check = true;
        for (int i = 0; i < betweenArr.length; i++){
            betweenArr[i].replaceAll("\\s", "");
            if (betweenArr[i].equals(""))
                check = false;
        }
        System.out.println(check);
    }
}
