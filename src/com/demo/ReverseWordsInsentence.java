package com.demo;

import java.util.Scanner;

public class ReverseWordsInsentence {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Sentence :");
		String str=sc.nextLine();
	
		String[] split = str.split(" ");
		
		
		for(int i=0;i<split.length;i++)
		{
			String reverse="";
			char[] charArray = split[i].toCharArray();
			
			for(int j=charArray.length-1;j>=0;j--)
			{
				reverse=reverse+charArray[j];
			}
			System.out.print(reverse+" ");
		}
	}
}
