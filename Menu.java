package com.qa.demo;

import java.util.Scanner;

public class Menu {

	
	public static void CalculatorMenu() {
		
		
		System.out.println("Welcome to the calculator program.\n");
		Scanner scan = new Scanner(System.in);
		boolean isOpen = true;
		int num1;
		int num2;	
		
		while (isOpen) {
			
			System.out.println("1) Addition");
			System.out.println("2) Subtraction");
			System.out.println("3) Multiplication");
			System.out.println("4) Division\n");
			System.out.println("0) To exit the application\n");
			
			System.out.println("Please enter the number that corrosponds to the calculation you would like to make: ");
			int userInput = scan.nextInt();
			scan.nextLine();
			
			
			switch (userInput) {
			case 1:
				System.out.println("What is your first number: ");
				num1 = scan.nextInt();
				scan.nextLine();
				
				System.out.println("What is your second number: ");
				num2 =scan.nextInt();
				scan.nextLine();
				System.out.println(CalculatorFunctions.addition(num1, num2));
				break;
				
			case 2:
				System.out.println("What is your first number: ");
				num1 = scan.nextInt();
				scan.nextLine();
				
				System.out.println("What is your second number: ");
				num2 =scan.nextInt();
				scan.nextLine();
				System.out.println(CalculatorFunctions.subtraction(num1, num2));
				break;
				
			case 3:
				System.out.println("What is your first number: ");
				num1 = scan.nextInt();
				scan.nextLine();
				
				System.out.println("What is your second number: ");
				num2 =scan.nextInt();
				scan.nextLine();
				System.out.println(CalculatorFunctions.multiplication(num1, num2));
				break;
				
			case 4:
				System.out.println("What is your first number: ");
				num1 = scan.nextInt();
				scan.nextLine();
				
				System.out.println("What is your second number: ");
				num2 =scan.nextInt();
				scan.nextLine();
				System.out.println(CalculatorFunctions.division(num1, num2));
				break;
				
			case 0:
				isOpen=false;
				break;
				
			default:
				System.out.println("Try again.");
				break;
			}
			
		}
	}
	
}
