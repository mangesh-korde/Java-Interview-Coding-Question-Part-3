package com.demo;

import java.util.Scanner;

public class Pattern13 {

	public static void main(String[] args) {
		
		// Write a program to display pattern...
		
//		ABCDE
//		ABCDA
//		ABCAB
//		ABABC
//		AABCD
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String :");
		String word=sc.next();
		
		
		for(int i=0;i<word.length();i++)
		{
			for(int j=0;j<word.length()-i;j++)
			{
				System.out.print(word.charAt(j)+" ");
			}
			
			for(int k=0;k<i;k++)
			{
				System.out.print(word.charAt(k)+" ");
			}
			System.out.println();
		}
		
	}
}
