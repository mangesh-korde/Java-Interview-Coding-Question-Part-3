package com.demo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class FindFirstRepeatingCharacter {

public static void main(String[] args) {
		
		
		   Scanner sc=new Scanner(System.in);
		   System.out.println("Enter String :");
		   String str=sc.next();
		   
		   HashSet<Character> data=new HashSet<>();
		   
		   char[] charArray = str.toCharArray();
		   
		   for(char ch: charArray)
		   {
			   if(data.contains(ch))
			   {
				   System.out.println("First Repeating Character :"+ch);
				 break;
			   }
			   else
			   {
				   data.add(ch);
			   }
		   }
	}
}
