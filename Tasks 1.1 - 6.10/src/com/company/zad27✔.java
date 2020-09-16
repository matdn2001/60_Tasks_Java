package com.company;
import java.io.IOException;
import java.util.Scanner;

class zadOMG {
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        if (isValid(s) && s.length() == 5 && Integer.parseInt(s) > 0)
            System.out.println(ANSI_YELLOW + "Строка является действительным почтовым индексом" + ANSI_RESET);
        else
            System.out.println(ANSI_YELLOW + "Строка не является действительным почтовым индексом" + ANSI_RESET);
    }
    public static boolean isValid(String string) {
        try {
            Integer.parseInt(string);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
