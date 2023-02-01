package com.basicprogram;
 
import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {

		 Scanner scanner = new Scanner (System.in);
		 int num = scanner.nextInt();
					 
		 System.out.println("Enter any integer value");
		 
		 if ( num % 2 == 0) {
			 
			 System.out.println("Entered number is even");
			 }
		 else
		 {
			 System.out.println("Entered number is odd");
		 }
		  scanner.close();

	}

}
