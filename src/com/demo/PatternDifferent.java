package com.demo;

import java.util.Scanner;

public class PatternDifferent {

	   // Write a program to accept a word(say, BLUEJ) and display the pattern...
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String :");
		String str=sc.next();
		
		 char ch[]= str.toCharArray();
		 
		 for(int i=0;i<ch.length;i++)
		 {
			 for(int j=i;j<ch.length;j++)
			 {
				 System.out.print(ch[j]);
			 }
			 System.out.println();
		 }
		
		
	}
}
