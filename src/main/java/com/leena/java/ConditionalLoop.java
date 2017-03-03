package com.leena.java;

/**
 * Created by leena on 2/13/17.
 */
public class ConditionalLoop {
    public static void main(String[] args) {
        int i = 10, j = 20;
        if (i > j) {
            System.out.println("I is greater");
        } else {
            System.out.println("J is greater");
        }
        int x = 0;
        long y = 10;
        for (y = 0, x = 14; x < 95 && y < 10; x++, y++) {
            System.out.print(x + " ");
        }
        int[] a = {1, 1, 1, 1, 90};
        for (int p : a) {
            System.out.println("I is greater");

        }
        int[] values = new int[3];
        values[0] = 10;
        values[1] = new Integer(5);
        values[2] = 15;
        for (int l = 0; l < values.length; l++) {
            System.out.print(values[l]);
        }
    }
}