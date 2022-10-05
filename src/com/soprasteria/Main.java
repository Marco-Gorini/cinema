package com.soprasteria;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Quanti anni hai?.");
		int age = in.nextInt();
		in.nextLine();
		System.out.println("Che giorno è?.");
		String day = in.nextLine();
		int price = 0;
		
	    if(age < 15 && age >= 7) {
			price = 6;
		}
		if(age >= 15 ) {
			price = 10;
		}
		if(price != 0 && day.equalsIgnoreCase("mercoledi")) {
			price -= 2;
		}
		System.out.println("Il biglietto costa " + price + " euro.");
	}
	
	
}
