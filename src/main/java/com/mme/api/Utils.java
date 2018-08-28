package com.mme.api;

public class Utils {
	public static String formatName(String firstName, String lastName, String middleName) {
		String middleInitial = middleName.substring(0, 1);
		
		// Erney, Joshua A.
		return String.format("%s, %s %s.", lastName, firstName, middleInitial);
	}
}
