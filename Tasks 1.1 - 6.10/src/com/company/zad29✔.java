package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class zad29 {
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите слово: ");
        String word = reader.readLine();
        System.out.print("Введите суффикс: ");
        String suffix = reader.readLine();
        System.out.print("Введите префикс: ");
        String prefix = reader.readLine();
        System.out.println(isPrefix(word, prefix));
        System.out.println(isSuffix(word, suffix));
    }
    public static String isPrefix(String word, String prefix){
        if (word.substring(0, prefix.length() - 1).equals(prefix.substring(0, prefix.length() - 1)))
            return ANSI_YELLOW + "Строка начинается с префиксного аргумента" + ANSI_RESET;
        else {
            System.out.println(word.substring(0, prefix.length() - 1));
            System.out.println(prefix.substring(0, prefix.length() - 1));
            return ANSI_YELLOW + "Строка не начинается с префиксного аргумента" + ANSI_RESET;
        }
    }
    public static String isSuffix(String word, String suffix){
        if (word.substring(word.length() - suffix.length() + 1).equals(suffix.substring(1)))
            return ANSI_YELLOW + "Строка заканчивается аргументом суффикса" + ANSI_RESET;
        else
            return ANSI_YELLOW + "Строка не заканчивается аргументом суффикса" + ANSI_RESET;
    }
}
