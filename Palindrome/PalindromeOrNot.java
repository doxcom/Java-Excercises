package Palindrome;

public class PalindromeOrNot {

    public boolean isPalindrome(String word) {


        if(word==null || word.isEmpty() || word.startsWith(" ")) return false;

        String word2=word.toLowerCase().replace(" ","").replace("\t","").replace("\r","");
        System.out.println(word);
        System.out.println("word without spaces and special characters:  " + word2);

        for(int i=0, j= word2.length()-1; i<j; i++,j--){
            if(word2.charAt(i) != word2.charAt(j)){
                return false;
            }
        }
        return true;
    }

    public static void main(String []args){
        System.out.println(new PalindromeOrNot().isPalindrome(" \t\t\r \t "));

    }
}

