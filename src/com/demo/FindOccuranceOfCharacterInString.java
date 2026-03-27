package com.demo;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class FindOccuranceOfCharacterInString {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String :");
		String str=sc.next();
		
		
		HashMap<Character,Integer> map=new HashMap<>();
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(map.containsKey(ch))
			{
				map.put(ch,map.get(ch)+1);
			}
			else
			{
				map.put(ch, 1);
			}
		}
		
		   Set<Entry<Character, Integer>> entrySet = map.entrySet();
		   for(Entry<Character,Integer> data : entrySet)
		   {
			   System.out.println(data.getKey()+" = "+data.getValue());
		   }
	}
}
