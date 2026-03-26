package com.demo;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateInArray {

	public static void main(String[] args) {
		
		int a[]= {7,2,1,3,5,67,7,3,2};
		
		Map<Integer,Integer> map=new HashMap<>();
		
		for(int num:a)
		{
			if(map.containsKey(num))
			{
				System.out.println(num);
			}
			else
			{
				map.put(num, 1);
			}
		}
	}
}
