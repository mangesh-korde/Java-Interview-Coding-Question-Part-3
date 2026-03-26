package com.demo;

import java.util.Scanner;

public class CharPattern {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter N :");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			char ch='a';
			for(int k=n;k>=i;k--)
			{
				
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}
		
		
		for(int i=2;i<=n;i++)
		{
			for(int j=i;j<n;j++)
			{
				System.out.print(" ");
			}
			char ch='a';
			for(int k=1;k<=i;k++)
			{
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}
	}
}
