package com.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class FindMaximumOccuringCharacterInString {

	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter String :");
		String str=sc.next();
		
		Map <Character,Integer> map=new HashMap<>();
		
		for( char ch:str.toCharArray()) 
		{
			if(map.containsKey(ch))
			{
				map.put(ch, map.get(ch)+1);
			}
			else
			{
				map.put(ch, 1);
			}
			
		}
		
		char maxchar=' ';
		
		int maxCount=0;
		Set<Entry<Character,Integer>> character=map.entrySet();
		
		for(Entry<Character,Integer> c:character)
		{
			if(c.getValue()>maxCount)
			{
				maxCount=c.getValue();
				maxchar=c.getKey();
			}
			
		}
		
		System.out.println("Maximum Occuring Character :"+maxchar+" "+maxCount+"  times");
	}
}
