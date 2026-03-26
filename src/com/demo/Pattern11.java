package com.demo;

import java.util.Scanner;

public class Pattern11 {

	public static void main(String[] args) {
		
		// Write a program to print pattern....
//		 ABCDE
//		 BCDE
//		 CDE
//		 DE
//		 E
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value of n :");
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				System.out.print((char)(65+j));
			}
			System.out.println();
		}
		 
	}
}
