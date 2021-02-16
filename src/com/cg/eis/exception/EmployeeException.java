package com.cg.eis.exception;
import java.util.Scanner;
@SuppressWarnings("serial")
class ExceptionEmp extends Exception
{
	public  ExceptionEmp(String sal)
	{
		System.out.println(sal);
	}
}

public class EmployeeException {
	public static void main (String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter empname:");
		String empName= sc.nextLine();
		System.out.println("Enter emp Age :");
		int empAge=sc.nextInt();
		
		System.out.println("Enter salary:");
		int salary=sc.nextInt();
		sc.close();
		try
		{
			if(salary<3000)
			{
				System.out.println("EmployeeName: " + empName);
				System.out.println("EmployeeAge: " + empAge);
				throw new ExceptionEmp("invalid salary-salary is less than 3000");
			}
			else
				System.out.println("EmployeeName: " + empName);
			    System.out.println("EmployeeAge: " + empAge);
				System.out.println("Valid salary");
		}
		catch(ExceptionEmp e) {
			System.out.println(e);
			
		}
	}
}
