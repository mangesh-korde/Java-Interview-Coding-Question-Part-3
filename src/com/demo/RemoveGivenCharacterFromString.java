package com.demo;

import java.util.Scanner;

public class RemoveGivenCharacterFromString {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter String:");
		String str=sc.next();
		
		System.out.println("Enter Character to remove :");
		char ch=sc.next().charAt(0);
		
		String replace = str.replace(str.valueOf(ch), "");
		
		System.out.println(str);
		System.out.println(replace);
	}
}
