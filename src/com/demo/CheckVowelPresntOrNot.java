package com.demo;

import java.util.Scanner;

public class CheckVowelPresntOrNot {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter String:");
		String str=sc.next();
		
		boolean matches = str.toLowerCase().matches(".*[aeiou].*");// regex expression is passed.
		
		if(matches)
		{
			System.out.println("String contians Vowels..");
		}
		else
		{
			System.out.println("String Not contain any vowel..");
		}
		
	}
}
