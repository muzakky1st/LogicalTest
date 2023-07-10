package com.TokioMarineZikri.TokioMarineZikri;


import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String kata = "";
        Integer checkword = 0;

        System.out.print("Masukkan Kata : ");
        kata = scan.nextLine();

        int wordLength = kata.length();
        for (int i =  0 ; i < wordLength / 2 ; i++){
            if (kata.charAt(i) != kata.charAt(wordLength -1 -i )){
                checkword = 1;
            }else {
                checkword = 0;
            }
        }
        if (checkword == 1){
            System.out.println(kata + " bukan Palindrom");
        }else {
            System.out.println(kata + " adalah palindrom");
        }
   }

}
