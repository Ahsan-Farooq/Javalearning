package com.first;

import java.util.Scanner;

public class App {
	public String Sample() {
		return "Hello Ahsan this is my first projoct";
	}
	public static void main (String[]args)
	{
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter first Value!!");
		int user_first_number= scan.nextInt();
		System.out.println("Enter second value!!");
		int user_second_number= scan.nextInt();
		
		System.out.println("Addition of Two Number is:");
		int add_number=(user_first_number+user_second_number);
		System.out.print(add_number);
		
	}
	
}
