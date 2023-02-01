package com.basicprogram;

public class HarmonicNumber {

	public static void main(String[] args) {
		int num = 50;
		double result = 0.0;
		
		 System.out.println("The Harmonic series is");
		 
		 while (num > 0) {
			 
			//Calculate the formula for Harmonic value
			 
			  result = result + (double)1 / num;
			  
			  num--; // decrement number means difference will be 1			  
			  System.out.println( result +",");
			  		 
		 }

	}

}
