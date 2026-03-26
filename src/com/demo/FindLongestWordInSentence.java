package com.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class FindLongestWordInSentence 
{
      public static void main(String[] args) 
      {
		
	       Scanner sc=new Scanner(System.in);
	       System.out.println("Enter String :");
	       String str=sc.nextLine();
	       
	       String s[]=str.split(" ");
	       
	       int len=0;
	       String maxString="";
	       for(int i=0;i<s.length;i++)
	       {
	    	   if(s[i].length()>len)
	    	   {
	    		   len=s[i].length();
	    		   maxString=s[i];
	    	   }
	       }
	   System.out.println("Maximum Size String is : "+maxString +" Size " +len);
	
	
     }
}
