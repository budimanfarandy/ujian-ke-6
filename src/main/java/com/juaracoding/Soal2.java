package com.juaracoding;

public class Soal2 {

    public static void main(String[] args) {
        int a = 5;
        int number = 1;

        for (int i = a; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number);
                number += 2;
                if (j < i) {
                    System.out.print("_");
                }
            }
            System.out.println();
            number = 1;
        }
    }
}
