package com.company;

public class Main {

    public static void main(String[] args) {
        String[][] shape = diamondWithName(10);
        String output = shapeToString(shape);
        System.out.println(output);
    }

    private static String[][] triangle(int n) {
        String[][] shape = new String[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j > i) {
                    shape[i][j] = " ";
                } else {
                    shape[i][j] = "*";
                }
            }
            shape[i][n - 1] += "\n";
        }
        return shape;
    }

    private static String shapeToString(String[][] shape) {
        String output = "";
        for (int i = 0; i < shape.length; i++) {
            for (int j = 0; j < shape[i].length; j++) {
                output += shape[i][j];
            }
        }
        return output;
    }

    private static String[][] diamond(int n) {
        String[][] shape = new String[2 * n - 1][2 * n - 1];
        for (int i = 0; i < 2 * n - 1; i++) {
            for (int j = 0; j < 2 * n - 1; j++) {
                if (Math.abs(n - 1 - Math.abs(i - n + 1)) < Math.abs(j - n + 1)) {
                    shape[i][j] = " ";
                } else {
                    shape[i][j] = "*";
                }
            }
            shape[i][2 * n - 2] += "\n";
        }
        return shape;
    }

    private static String[][] diamondWithName(int n) {
        String[][] shape = diamond(n);
        shape[n - 1] = new String[1];
        shape[n - 1][0] = "HeMing\n";
        return shape;
    }
}