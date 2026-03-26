package com.demo;

import java.util.Scanner;

public class CharPattern2 {

	public static void main(String[] args) {
		
		//     A
		//   B B B
		// C C C C C
		// D D D D D D D
		// E E E E E E E E E
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Limit:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int k=i;k<n;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i*2-1;j++)
			{
				System.out.print((char)(64+i));
			}
			System.out.println();
		}
	}
}
