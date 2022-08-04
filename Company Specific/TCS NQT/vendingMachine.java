/*
Problem Statement

FULLY AUTOMATIC VENDING MACHINE – dispenses your cuppa on just press of button. A vending machine can serve range of products as follows:

Coffee

Espresso Coffee
Cappuccino Coffee
Latte Coffee

Tea

Plain Tea
Assam Tea
Ginger Tea
Cardamom Tea
Masala Tea
Lemon Tea
Green Tea
Organic Darjeeling Tea

Soups 

Hot and Sour Soup
Veg Corn Soup
Tomato Soup
Spicy Tomato Soup

Beverages

Hot Chocolate Drink
Badam Drink
Badam-Pista Drink

Write a program to take input for main menu & sub menu and display the name of sub menu selected in the following format (enter the first letter to select main menu):

Welcome to CCD 
Enjoy your
Example 1:

Input:
c
1
Output
Welcome to CCD!
Enjoy your Espresso Coffee!

Example 2:
Input:
t
9
Output
INVALID OUTPUT!
*/
import java.util.*;
class vendingMachine{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		char choice1 = sc.next().charAt(0);
		int choice2 = sc.nextInt();
		
		System.out.println("Welcome to CCD");
		switch(choice1){
			case 'c':
				switch(choice2){
					case 1: System.out.println("Enjoy your Espresso Coffee!");
					break;
					
					case 2: System.out.println("Enjoy your Cappuccino Coffee!");
					break;
					
					case 3: System.out.println("Enjoy your Latte Coffee!");
					break;
					
					default: System.out.println("INVALID OUTPUT!");
				}
			
			break;
			
			case 't':
			switch(choice2){
				case '1': System.out.println("Enjoy your Plain Tea!");
				break;
				 
				case '2': System.out.println("Enjoy your Assam Tea!");
				break;
				
				case '3': System.out.println("Enjoy your Ginger Tea!");
				break;
				
				case '4': System.out.println("Enjoy your Cardamom Tea!");
				break;
				
				case '5': System.out.println("Enjoy your Masala Tea!");
				break;
				
				case '6': System.out.println("Enjoy your Lemon Tea!");
				break;
		
				case '7': System.out.println("Enjoy your Green Tea!");
				break;
				
				case '8': System.out.println("Enjoy your Organic Darjeeling Tea!");
				break;
				
				default: System.out.println("INVALID OUTPUT!");
			}
			break;
			
			case 's':
			switch(choice2){
				case '1': System.out.println("Enjoy your Hot and Sour Soup!");
				break;
				
				case '2': System.out.println("Enjoy your Veg Corn Soup!");
				break;
				
				case '3': System.out.println("Enjoy your Tomato Soup!");
				break;
				
				case '4': System.out.println("Enjoy your Spicy Tomato Soup!");
				break;
				
				default: System.out.println("INVALID OUTPUT!");
			}
			break;
			
			case 'b':
			switch(choice2){
				case '1': System.out.println("Enjoy your Hot Chocolate Drink!");
				break;
				
				case '2': System.out.println("Enjoy your Badam Drink!");
				break;
				
				case '3': System.out.println("Enjoy your Badam-Pista Drink!");
				break;
				
				default: System.out.println("INVALID OUTPUT!");
			}
			break;
			
			default: System.out.println("INVALID OUTPUT!");
		}
		
	}
}