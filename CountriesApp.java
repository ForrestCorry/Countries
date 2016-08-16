package com.assignemnt11;

import java.util.Scanner;

public class CountriesApp {
	
	public static String menuChoice = null;
	public static Scanner sc = new Scanner(System.in);
	public static String breakOut = null;
	

	public static void main(String[] args) {
		boolean anotherEntry = true;
		
		System.out.println("Welcome to the Countries App.");
		while(anotherEntry){
		do{
		System.out.println("What would you like to do?\n"
				+ "(1) - Add a country to the list\n"
				+ "(2) - Display the list\n"
				+ "(3) - Delete a country from the list\n"
				+ "(4) - Exit Program");
		
		menuChoice = sc.nextLine();
		CountriesValidator.numberIsValid(menuChoice);
		}while (CountriesValidator.numberIsValid(menuChoice));
		
		switch (menuChoice) {
		case "1":
			CountriesTxtFile.writer();
			
			break;
		case "2":
			CountriesTxtFile.reader();
			break;
		case"3":
			
			break;
		case"4":
			System.out.println("Thank you for using our App");
			System.exit(0);
			break;

		default:
			break;
		}
		do{
		System.out.println("Would you like to return to the main menu?\n"
				+ "(1) - Yes\n"
				+ "(2) - No");
		breakOut = sc.nextLine();
		CountriesValidator.numberIsValid(breakOut);
		}while (CountriesValidator.numberIsValid(breakOut));
		
			switch(breakOut){
			case "1":
				anotherEntry = true;
				break;
			case"2":
				anotherEntry = false;
				break;
			}
		}
		
		
	}//main

}//class
