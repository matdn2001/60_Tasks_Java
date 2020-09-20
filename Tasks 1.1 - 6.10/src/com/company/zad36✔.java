package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

class zad36 {
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите первый массив через пробел: ");
        String s = reader.readLine();
        String[] arr1 = s.split(" ");
        System.out.print("Введите второй массив через пробел: ");
        String s2 = reader.readLine();
        String[] arr2 = s2.split(" ");
        System.out.print(ANSI_YELLOW + same(arr1, arr2) + ANSI_RESET);
    }
    public static String same(String[] arr1, String[] arr2){
        Set<String> mySet = new HashSet<>();
        for (String x: arr1) {
            mySet.add(x);
        }
        Set<String> mySet2 = new HashSet<>();
        for (String x: arr2) {
            mySet2.add(x);
        }
        if (mySet.size() == mySet2.size())
            return "Два массива имеют одинаковое число уникальных элементов";
        else
            return "Два массива имеют разное число уникальных элементов";
    }
}
