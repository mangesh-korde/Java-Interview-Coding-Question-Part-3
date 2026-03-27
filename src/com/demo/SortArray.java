package com.demo;

import java.util.Arrays;
import java.util.Scanner;

public class SortArray {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Limit :");
		int n=sc.nextInt();
		
		int[]a=new int[n];
		
		System.out.println("Enter Values :");
		for(int i=0;i<n;i++)
		{
			int val=sc.nextInt();
			a[i]=val;
		}
		
		System.out.println("Print Array:");
		for(int num:a)
		{
			System.out.println(num);
		}
		
		System.out.println("Sorted Array :");
		
		 Arrays.sort(a);
			for(int num:a)
			{
				System.out.println(num);
			}
		 
	}
}
