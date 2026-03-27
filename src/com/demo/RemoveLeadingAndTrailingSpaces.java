package com.demo;

import java.util.Scanner;

public class RemoveLeadingAndTrailingSpaces {

	public static void main(String[] args) {
		
		String str=" mangesh  ";
		System.out.println(str+" = "+str.length());
		
		String strip = str.strip();
		System.out.println(strip+" = "+strip.length());
	}
}
