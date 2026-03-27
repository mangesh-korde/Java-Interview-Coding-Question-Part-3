package com.demo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateFromArray {

	public static void main(String[] args) {
		
		int a[]= {1,3,4,1,6,1,3,8,8,5};
		
		Set<Integer> data=new LinkedHashSet<>();
		
		for(int num: a)
		{
			if(!data.contains(num))
			{
				data.add(num);
			}
		}
		System.out.println(data);
		
	}
}
