package com.company;

public class Main {

    public static void main(String[] args) {
        int a = 300;
        int counter1 = 0;

        for (int i = 1; i < a; i++) {
            if (i % 3 == 0 && i % 4 == 0 && i % 5 == 0) {
                counter1 += i;
                System.out.print( i + " ");
            }
        }
        System.out.println("\n sum: " + counter1);
    }
}
