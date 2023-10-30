package com.juaracoding;

public class Soal1 {
    public static void main(String[] args) {

        int a = 100;
        for (int i = 1; i <= a; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("BIZZBUZZ");
            }else if (i % 3 == 0){
                System.out.println("BIZZ");
            }else if(i % 5 == 0){
                System.out.println("BUZZ");
            }else {
                System.out.println(i);
            }
        }
    }
}
