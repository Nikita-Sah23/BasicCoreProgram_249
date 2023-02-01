package com.basicprogram;

import java.util.Scanner;

public class FlipCoin {

	public static void main(String[] args) 
	{
       Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no. of times coin flip =");
     
          int numberOfTimes = scanner.nextInt();
          int tail = 0;
          int head = 0;
           
          if(numberOfTimes >0)
          {
        	  for(int i= 0; i <= numberOfTimes; i++)
        	  {
        		  double value = Math.random();
        		  if ( value < 0.5) 
        		  {
        			  tail++;
        		  } else {
        				head++;
        			  }		      			  
        		  }
        	  }        
        	double percentageOfTail = (tail*100)/numberOfTimes;
          	double percentageOfHead = (head*100)/numberOfTimes;    
		  	System.out.println("No. of times head count = " + head);
		  	System.out.println("No. of times tail count = " + tail);
		  	System.out.println(percentageOfTail);
		  	System.out.println(percentageOfHead);
		  	scanner.close();
  }
}