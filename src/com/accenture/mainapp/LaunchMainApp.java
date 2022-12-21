package com.accenture.mainapp;

import java.util.Scanner;

//Introduction: 
// This app is an app that tells you your fortune for the day
// I tried implementing most of the concepts that we learned so far, 
// (it's not a very meaningful app, for entertainment purposes only) 
// I saved the java classes across various packages to experiment with encapsulation concepts
// Some concepts that I did not manage to use include method overloading, 
// and other access modifiers like default and protected. 

//this package contains classes that calculate inputs
import com.accenture.calculate.CalculateNum;

// the following package has AnimalData as the parent class
import com.accenture.data.AnimalData;
// the children classes extended from AnimalData are as follows:
import com.accenture.data.Ant;
import com.accenture.data.Cat;
import com.accenture.data.Goat;
import com.accenture.data.Hippo;
import com.accenture.data.Woodpecker;

class Input {
	static int First; 
	static int Second;
	String username;
	
	int Begin() {
		CalculateNum calc = new CalculateNum();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number on your mind (1-100)");
		First = scan.nextInt();
		System.out.println("Enter the second number on your mind (1-100)");
		Second = scan.nextInt();
		System.out.println("Hi "+username+", here is your outlook for today");
		return calc.formula(First, Second);
	}

	public String getUsername() {
		return username;
	}

	public void setUsername() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to the daily horoscope app!");
		System.out.println("Please enter your name:");
		username = scan.next();
	}
}

// Trying out the concept in polymorphism, 
// I can do this since I do not have any specialised methods in the children classes
class AnimalRef {
	void reference(AnimalData refer) {
		refer.character();
		refer.work();
		refer.luck();
		refer.diet();
	}
}

class CompleteApp {
	void Action() {
		String user;
		Input in = new Input();
		Goat g = new Goat();
		Hippo h = new Hippo();
		Woodpecker w = new Woodpecker();
		Cat c = new Cat();
		Ant a = new Ant();
		CalculateNum calc = new CalculateNum();
		AnimalRef ani = new AnimalRef();
		
		in.setUsername();
		user = in.getUsername();
		boolean ss = calc.splitString(user) <500;
		
		// practising switch/case usage as I'm still familiarising myself with it
		switch (in.Begin()) {
		case 0: if (ss) {
			a.character();
			a.work();
			break;
		} else {
			ani.reference(a);
			break;
		}
		case 1: if (ss) {
			c.character();
			c.work();
			break;
		} else {
			ani.reference(c);
			break;
		}
		case 2: if (ss) {
			g.character();
			g.work();
			break;
		} else {
			ani.reference(g);
			break;
		}
		case 3: if (ss) {
			h.character();
			h.work();
			break;
		} else {
			ani.reference(h);
		}
		case 4: if (ss) {
			w.character();
			w.work();
			break;
		} else {
			ani.reference(w);
			break;
		}
}
}
}

public class LaunchMainApp {

	public static void main(String[] args) {
		
		// I tried to keep the main app as clean as possible
		CompleteApp CA = new CompleteApp();
		CA.Action();
		}
}


