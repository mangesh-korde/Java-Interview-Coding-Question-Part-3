package com.demo;

import java.util.Scanner;

public class ReverseSentence {

	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Scentence :");
		String str=sc.nextLine();
		
		String reverse="";
		String[] split = str.split(" ");
		
		for(int i=split.length-1;i>=0;i--)
		{
			reverse=reverse+split[i]+" ";
		}
		System.out.println(reverse);
	}
}
