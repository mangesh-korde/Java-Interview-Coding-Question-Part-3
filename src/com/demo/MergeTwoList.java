package com.demo;

import java.util.ArrayList;
import java.util.List;

public class MergeTwoList {

	public static void main(String[] args) {
		
		List<String> list1=new ArrayList<>();
		list1.add("1");
		list1.add("2");
		System.out.println(list1);
		
		List<String> list2=new ArrayList<>();
		list2.add("3");
		list2.add("4");
		System.out.println(list2);
		
		System.out.println("Merge List :");
		List<String> mergeList=new ArrayList<>(list1);
		
		mergeList.addAll(list2);
		
		System.out.println(mergeList);
	}
}
