package PalindromeNumber;

import Palindrome.PalindromeOrNot;

public class PalindromeNumber {
// https://leetcode.com/problems/palindrome-number/description/


    public boolean isPalindromeNumber(int number) {

      String word = String.valueOf(number); //aqui convierto de entero a string cualquier entrada de numero

        System.out.println("palabra " + word);

        for(int i=0, j= word.length()-1; i<j; i++,j--){
            if(word.charAt(i) != word.charAt(j)){
                return false;
            }
        }
        return true;
    }

    public static void main(String []args){
        System.out.println(new PalindromeNumber().isPalindromeNumber(10));

    }
}
