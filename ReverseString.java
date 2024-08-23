package string;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A string");
		String string = sc.nextLine();
		
		int length = string.length();
		
		
		String reversedString ="";
		
		for(int i=length-1; i>=0; i--) {
			reversedString = reversedString + string.charAt(i);
		}
		
		
		System.out.println("Reverse String is :" + reversedString);
		
		sc.close();
	}

}
