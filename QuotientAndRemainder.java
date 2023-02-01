package com.basicprogram;

import java.util.Scanner;

public class QuotientAndRemainder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner (System.in);
		 System.out.println("Enter the first number ");
		 int a = scanner.nextInt();
		 
		 Scanner scanner1 = new Scanner (System.in);
		 System.out.println("Enter the second number ");
		 int b = scanner.nextInt();
		

		
		System.out.println("Quotient is " + a / b );
		
		System.out.println("Remainder is " + a % b);
        scanner.close();
	}
}	
