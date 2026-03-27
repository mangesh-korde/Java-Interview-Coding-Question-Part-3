package com.demo;

import java.util.Scanner;

public class StringPalindromeOptimizedWay {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter String:");
		String str=sc.next();
		
		boolean flag=true;
		
		int len = str.length();
		for(int i=0;i<len/2;i++)
		{
			if(str.charAt(i)!=str.charAt(len-i-1))
			{
				flag=false;
			     break;
			}
		}
		if(flag)
		{
			System.out.println("String is palindrome...");
		}
		else
		{
			System.out.println("String is not palindrome..");
		}
	}
}
