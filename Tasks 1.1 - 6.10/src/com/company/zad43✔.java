package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class zad43 {
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите строчку: ");
        String s = reader.readLine();
        if (countUnderline(s) > 0)
            System.out.print(ANSI_YELLOW + toCamelCase(s) + ANSI_RESET);
        else
            System.out.print(ANSI_YELLOW + toSnakeCase(s) + ANSI_RESET);

    }
    public static String toCamelCase(String s){
        String[] array = s.split("_");
        String result = array[0];
        String firstChar;
        for (int i = 1; i < array.length; i ++){
            firstChar = "" + array[i].charAt(0);
            result += firstChar.toUpperCase() + array[i].substring(1);
        }
        return result;
    }
    public static String toSnakeCase(String s){
        String result = "";
        for (int i = 0; i < s.length() - 1; i++){
                result += s.charAt(i);
            if ((int) s.charAt(i) > 96 && (int) s.charAt(i) < 123 && (int) s.charAt(i + 1) > 40 && (int) s.charAt(i + 1) < 91){
                result += '_';
            }
        }
        result += s.charAt(s.length() - 1);
        return result.toLowerCase();
    }
    public static int countUnderline(String s){
        int count = 0;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == '_')
                count += 1;
        }
        return count;
    }
}
