package com.TokioMarineZikri.TokioMarineZikri;

import java.util.*;

public class Anagram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer countWord;
        Map<String, List<String>> anagramGroup = new HashMap<>();

        System.out.print("Masukkan Jumlah Kata : ");
        countWord = scan.nextInt();

        String[] word = new String[countWord];
        System.out.println("Masukkan kata - kata : ");
        for (int i = 0 ; i< countWord ; i++){
            word[i] = scan.next();
        }

        for(String words : word){
            char[] charArray = words.toCharArray();
            Arrays.sort(charArray);

            String sortWord = new String (charArray);

            if(anagramGroup.containsKey(sortWord)){
                anagramGroup.get(sortWord).add(words);
            }else {
                List<String> group = new ArrayList<>();
                group.add(words);
                anagramGroup.put(sortWord, group);
            }
        }

        List<List<String>> hasil = new ArrayList<>();
        for (List<String> grup : anagramGroup.values()){
            hasil.add(grup);
        }
        System.out.println("Anagram yang ditemukan : ");
        for (List<String> grupAngr : hasil){
            System.out.println(grupAngr);
        }
        scan.close();
    }
}
