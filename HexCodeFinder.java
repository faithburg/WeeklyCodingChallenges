package com.revature.hexcode;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HexCodeFinder {

	public static void main(String[] args) {
		
		//Expected output: false
		String input = "#112fe";
		validateHexCode(input);
		
		//Expected output: true
		String input1 = "#CD5C5C";
		validateHexCode(input1);
		
		//Expected output: true
		String input2 = "#e2e2e2";
		validateHexCode(input2);
		
		//Expected output: false
		String input3 = "123abc";
		validateHexCode(input3);
	}
	
	public static void validateHexCode(String h) {
		//write out a regular expression 
		String hexcode = "#[a-fA-F0-9]{6}";
		Pattern pattern = Pattern.compile(hexcode);
		Matcher matcher = pattern.matcher(h);
		boolean result = matcher.matches();
		System.out.println(result);
	}

}

