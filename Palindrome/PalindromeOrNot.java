package Palindrome;

public class PalindromeOrNot {

    public boolean isPalindrome(String word) {

        String match="^[A-Za-z0-9_.]+$";
        if(word.isEmpty()) return false;

        for(int i=0, j= word.length()-1; i<j; i++,j--){
            if(word.charAt(i) != word.charAt(j) || !word.matches(match)){
                return false;
            }
        }
        return true;
    }

    public static void main(String []args){


        System.out.println(new PalindromeOrNot().isPalindrome("a"));
    }
}
