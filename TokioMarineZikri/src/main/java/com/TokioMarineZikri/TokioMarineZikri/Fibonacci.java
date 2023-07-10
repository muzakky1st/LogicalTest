package com.TokioMarineZikri.TokioMarineZikri;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int angka;
        int angka1 = 0;
        int angka2 = 1;
        System.out.print("Masukkan Angka : ");
        angka = scan.nextInt();

        System.out.print(angka1 + "" + angka2 + "");

        for (int i = 2 ; i<= angka ; i++){
            int nextAngka = angka1 + angka2;
            System.out.print(nextAngka);

            angka1 = angka2;
            angka2 = nextAngka;
        }
    }
}
