package com.assignemnt11;

public class CountriesValidator {
	
	
	public static boolean numberIsValid(String menuChoice){
		if (menuChoice.equals("1") || menuChoice.equals("2") || menuChoice.equals("3") || menuChoice.equals("4")) {
			
			
			try {
				int number = Integer.parseInt(menuChoice);
				
				return false;
			} catch (NumberFormatException e) {
				e.printStackTrace();
				return true;
				
			}
		}
			return false;
		
	}

}
