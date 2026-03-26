package com.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class StringPalindrome {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String str=sc.next();
		
		
		// 1.using simple logic(Without Collection)....................
		int start=0;
		int end=str.length()-1;
		
		int flag=0;
		while(start<end)
		{
			char ch=str.charAt(start);
			char ch1=str.charAt(end);
			
			if(ch!=ch1)
			{
				flag=1;
				break;
			}
			start++;
			end--;
		}
		if(flag==1)
		{
			System.out.println("String is not palindrome.....");
		}
		else
		{
			System.out.println("String is Palindrome.........");
		}
		
		
		
		
		
		
		
		
		// 2.second way........(using stack.....)
		
		
		  char [] c=str.toCharArray();
		  
		  Stack<Character> s=new Stack<>();
		  for(char ch:c) {
			  s.push(ch);
		  }
		  
		 String reverse="";
		  while(!s.isEmpty())
		  {
			  reverse+=s.pop();
		  }
		  
		  if(reverse.equals(str))
		  {
			  System.out.println("String is palindrome....");
		  }
		  else
		  {
			  System.out.println("String is not palindrome...");
		  }
		
	}
}
