package com.basicprogram;

public class LargestAmongThree {

	public static void main(String[] args) {
		
		int a = 15;
		int b = 255;
		int c = 35;
		
   //   int temp;
   //	int largest;
		
		if (a >= b && a >= c)
		{
		  System.out.println("A is the largest " + a);
	    }
		else if( b>=a && b>=c)
		{
			System.out.println("B is the largest " + b);
		}
		else {
			System.out.println("C is the largest " + c);
			
		}

	}

}
