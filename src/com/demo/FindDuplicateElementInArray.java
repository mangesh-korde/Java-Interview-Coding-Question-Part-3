package com.demo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindDuplicateElementInArray {

	public static void main(String[] args) {
		
		int a[]= {1,2,25,2,7,6,7,8,4};
		
		Map<Integer,Integer> map=new HashMap<>();
		 for(int i=0;i<a.length;i++)
		 {
			 if(map.containsKey(a[i]))
			 {
				 System.out.println(a[i]);
			 }
			 else
			 {
				 map.put(a[i], 1);
			 }
			 
		 }
	}
}
