package com.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class FirstNonRepeatingCharacterInString {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String :");
		String str=sc.next();
		
		char ch[]=str.toCharArray();
		
		Map <Character,Integer> map=new HashMap<>();
		for(int i=0;i<ch.length;i++)
		{
			if(map.containsKey(ch[i]))
			{
				map.put(ch[i], map.get(ch[i])+1);
			}
			else
			{
				map.put(ch[i], 1);
			}
		}
		
		   Set<Entry<Character,Integer>> c= map.entrySet();
		   
		   for(Entry<Character,Integer> character:c)
		   {
			   if(character.getValue()==1)
			   {
				   System.out.println(character.getKey());
				   break;
				   
			   }
		   }
	}
}
