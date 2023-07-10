package com.TokioMarineZikri.TokioMarineZikri;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

public class SortListArray {
    public static void main(String[] args) {
        List<Integer> angka = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int countAngka;

        System.out.print("Masukkan Jumlah Angka : ");
        countAngka = scan.nextInt();

        System.out.println("Masukkan Angka : ");
        for (int i = 0 ; i< countAngka ; i++){
                int pecahanAngka = scan.nextInt();
                angka.add(pecahanAngka);
        }
        Collections.sort(angka);
        System.out.println("Angka setelah di urutkan " + angka);

        scan.close();
    }

}
