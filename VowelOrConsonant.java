package com.basicprogram;

import java.util.Scanner;

public class VowelOrConsonant {

	public static void main(String[] args) {

		 Scanner scanner = new Scanner (System.in);	 ///scanner class object creation
		 char ch = scanner.next().toUpperCase().charAt(0);   //calling next function of scanner class
		 
		 System.out.println("Enter any alphabet");
		 
		 if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O'|| ch == 'U')
		 {
			 System.out.println("Alphabet is vowel");
		 }
		 else
		 {
			 System.out.println("Alphabet is Consonant");
		 }
		 
		scanner.close();

	}

}
