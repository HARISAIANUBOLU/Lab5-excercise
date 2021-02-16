package com.cg;
import java.util.Scanner;

class AgeException extends Exception {
 
 public AgeException(String str) {
  System.out.println(str);
 }
}

public class Age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		  System.out.print("Enter ur age :: ");
		  int age = sc.nextInt();
		  
		  try {
		   if(age <= 15) 
		    throw new AgeException("Invalid age:: Age is less than 15");
		   else
		    System.out.println("Valid age");
		  }
		  catch (AgeException a) {
		   System.out.println(a);
		   sc.close();
		  }

	}

}
