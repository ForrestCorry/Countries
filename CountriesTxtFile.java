package com.assignemnt11;

import java.nio.file.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class CountriesTxtFile {
	
	static ArrayList<String>countriesList = new ArrayList<>();
	static Path ourNewPath = Paths.get("\\Users\\admin\\newworkspace\\Day11 Assignment\\src\\com\\assignemnt11\\countries.txt");
	static File countriesFile = ourNewPath.toFile();
	static Scanner sc = new Scanner(System.in);
	static String countryInput = null;
	public static String continueChoice = null;
	
	public static void writer(){
		boolean anotherEntry = true;
		while(anotherEntry)

		try 
			(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(countriesFile, true)))){
			System.out.println("What country would you like to add?");
			countryInput = sc.nextLine();
			out.println(countryInput);
			countriesList.add(countryInput);
			
		
		
		do{
			System.out.println("Would you like to add another country?\n"
					+ "(1) - Yes\n"
					+ "(2) - No");
			continueChoice = sc.nextLine();
			CountriesValidator.numberIsValid(continueChoice);
			}while (CountriesValidator.numberIsValid(continueChoice));
			
			switch (continueChoice) {
			case "1":
				anotherEntry = true;
				break;
			case "2":
				anotherEntry = false;
				break;
			default:
				System.exit(0);
				break;
			}
			} catch (IOException e) {

				e.printStackTrace();
			}	
	}

	public static void reader(){
		try (BufferedReader in = new BufferedReader(new FileReader(countriesFile))){
			String countriesEntered;
			
			while((countriesEntered = in.readLine())!=null){
				System.out.println(countriesEntered);
			}
		} catch (IOException ex) {

			ex.printStackTrace();
		}
		
	}
}//class
