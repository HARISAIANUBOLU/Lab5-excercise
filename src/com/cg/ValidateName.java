package com.cg;
import java.util.Scanner;
@SuppressWarnings("serial")
class InvalidException extends Exception{
	public InvalidException(String str) {
		System.out.println(str);
	}
}
public class ValidateName {
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first name:");
	 String firstname=sc.nextLine();
	 System.out.println("Enter last name:");
	 String lastname=sc.nextLine();
	 sc.close();
	try {
		if(firstname.isEmpty() || lastname.isEmpty()) 
		{
			throw new InvalidException("Invalid name");
		
		}
		else
			System.out.println("valid name");
	}
	catch(InvalidException e) {
		System.out.println(e);
	}
	}
}
