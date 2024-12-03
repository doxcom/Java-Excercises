package Palindrome;

import static java.lang.Math.abs;

public class PalindromeOrNot {

    public boolean isPalindrome(String word) {


        if(word==null || word.isEmpty() || word.startsWith(" ")) return false;

     //   String word2=word.toLowerCase().replace(" ","").replace("\t","").replace("\r","");
      //  System.out.println(word);
       // System.out.println("word without spaces and special characters:  " + word2);

        char[] cadena = word.toCharArray();
        for(int i=0, j= cadena.length-1; i<j; i++,j--){
            if(word.charAt(i) != word.charAt(j) || ((word.charAt(i)-word.charAt(j))*-1!=32)){
                return false;
            }else{
                i++; j--;
            }

        }
        return true;
    }

    public static void main(String []args){
        System.out.println(new PalindromeOrNot().isPalindrome("A man, a plan, a canal: Panama"));

    }
}

