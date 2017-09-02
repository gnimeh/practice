package com.company;

public class Main {

    public static void main(String[] args) {
        int n = 3;
        String output = "";
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                output += "*";
            }
            output += "\n";
        }
        System.out.println(output);
    }
}
