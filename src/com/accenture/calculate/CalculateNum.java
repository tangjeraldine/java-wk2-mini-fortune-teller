package com.accenture.calculate;

import java.util.Random;

public class CalculateNum {
	private int StringValue, Remainder;
	
	// here I'm practising type casting
	// learned that Strings cannot be directly cast into char 
	// need to be split up first into individual char
	// char can actually be converted into int value
	public int splitString(String name) {
		char[] ch = new char[name.length()];
		for (int i=0; i<name.length(); i++) {
			ch[i] = name.charAt(i);
			int ascii = (int) ch[i];
			StringValue += ascii;
		}
		return StringValue;
	}
	
	// generating a random number that will be used 
	//to show the user their fortune for the day
	public int formula(int first, int second) {
		Random rand = new Random();
		double x = (first + second + (rand.nextInt(2,9)))/(rand.nextInt(2,9));
		Remainder = (int) x%5;
		return Remainder;
	}
}
